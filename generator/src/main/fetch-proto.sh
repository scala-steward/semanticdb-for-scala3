#!/usr/bin/env sh
set -e

# Usage: ./fetch-proto.sh {url} {generator-base-directory} {check-only:true/false}

URL="$1"
GENERATOR_DIR="$2"
CHECK_ONLY="$3"

PATCH_FILE="$GENERATOR_DIR/src/main/scalameta-to-compiler.patch"
TARGET="$GENERATOR_DIR/src/main/protobuf/scalameta.proto"

# Fetch the proto file
tmpfile=$(mktemp)
curl -L "$URL" > $tmpfile

# Patch it
patch -u $tmpfile "$PATCH_FILE"

# Check if the content is identical
if diff -wq $tmpfile "$TARGET"; then
  echo "Fetched file and current .proto are identical"
  exit 0
fi

if test "$CHECK_ONLY" = "true"; then
  echo "Fetched file and current .proto differ"
  exit 1
fi

echo "Updating $TARGET."
mv $tmpfile "$TARGET"

