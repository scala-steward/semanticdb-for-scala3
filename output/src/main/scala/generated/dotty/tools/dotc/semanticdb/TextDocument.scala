// Generated by https://github.com/tanishiking/semanticdb-for-scala3
// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dotty.tools.dotc.semanticdb
import dotty.tools.dotc.semanticdb.internal.*
import scala.annotation.internal.sharable

@SerialVersionUID(0L)
final case class TextDocument(
    schema: dotty.tools.dotc.semanticdb.Schema = dotty.tools.dotc.semanticdb.Schema.LEGACY,
    uri: _root_.scala.Predef.String = "",
    text: _root_.scala.Predef.String = "",
    md5: _root_.scala.Predef.String = "",
    language: dotty.tools.dotc.semanticdb.Language = dotty.tools.dotc.semanticdb.Language.UNKNOWN_LANGUAGE,
    symbols: _root_.scala.Seq[dotty.tools.dotc.semanticdb.SymbolInformation] = _root_.scala.Seq.empty,
    occurrences: _root_.scala.Seq[dotty.tools.dotc.semanticdb.SymbolOccurrence] = _root_.scala.Seq.empty,
    diagnostics: _root_.scala.Seq[dotty.tools.dotc.semanticdb.Diagnostic] = _root_.scala.Seq.empty,
    synthetics: _root_.scala.Seq[dotty.tools.dotc.semanticdb.Synthetic] = _root_.scala.Seq.empty
    )  extends SemanticdbGeneratedMessage  derives CanEqual {
    @transient @sharable
    private var __serializedSizeMemoized: _root_.scala.Int = 0
    private def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = schema.value
        if (__value != 0) {
          __size += SemanticdbOutputStream.computeEnumSize(1, __value)
        }
      };
      
      {
        val __value = uri
        if (!__value.isEmpty) {
          __size += SemanticdbOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = text
        if (!__value.isEmpty) {
          __size += SemanticdbOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = md5
        if (!__value.isEmpty) {
          __size += SemanticdbOutputStream.computeStringSize(11, __value)
        }
      };
      
      {
        val __value = language.value
        if (__value != 0) {
          __size += SemanticdbOutputStream.computeEnumSize(10, __value)
        }
      };
      symbols.foreach { __item =>
        val __value = __item
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      occurrences.foreach { __item =>
        val __value = __item
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      diagnostics.foreach { __item =>
        val __value = __item
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      synthetics.foreach { __item =>
        val __value = __item
        __size += 1 + SemanticdbOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
      {
        val __v = schema.value
        if (__v != 0) {
          _output__.writeEnum(1, __v)
        }
      };
      {
        val __v = uri
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = text
        if (!__v.isEmpty) {
          _output__.writeString(3, __v)
        }
      };
      symbols.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      occurrences.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      diagnostics.foreach { __v =>
        val __m = __v
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = language.value
        if (__v != 0) {
          _output__.writeEnum(10, __v)
        }
      };
      {
        val __v = md5
        if (!__v.isEmpty) {
          _output__.writeString(11, __v)
        }
      };
      synthetics.foreach { __v =>
        val __m = __v
        _output__.writeTag(12, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def withSchema(__v: dotty.tools.dotc.semanticdb.Schema): TextDocument = copy(schema = __v)
    def withUri(__v: _root_.scala.Predef.String): TextDocument = copy(uri = __v)
    def withText(__v: _root_.scala.Predef.String): TextDocument = copy(text = __v)
    def withMd5(__v: _root_.scala.Predef.String): TextDocument = copy(md5 = __v)
    def withLanguage(__v: dotty.tools.dotc.semanticdb.Language): TextDocument = copy(language = __v)
    def clearSymbols = copy(symbols = _root_.scala.Seq.empty)
    def addSymbols(__vs: dotty.tools.dotc.semanticdb.SymbolInformation *): TextDocument = addAllSymbols(__vs)
    def addAllSymbols(__vs: Iterable[dotty.tools.dotc.semanticdb.SymbolInformation]): TextDocument = copy(symbols = symbols ++ __vs)
    def withSymbols(__v: _root_.scala.Seq[dotty.tools.dotc.semanticdb.SymbolInformation]): TextDocument = copy(symbols = __v)
    def clearOccurrences = copy(occurrences = _root_.scala.Seq.empty)
    def addOccurrences(__vs: dotty.tools.dotc.semanticdb.SymbolOccurrence *): TextDocument = addAllOccurrences(__vs)
    def addAllOccurrences(__vs: Iterable[dotty.tools.dotc.semanticdb.SymbolOccurrence]): TextDocument = copy(occurrences = occurrences ++ __vs)
    def withOccurrences(__v: _root_.scala.Seq[dotty.tools.dotc.semanticdb.SymbolOccurrence]): TextDocument = copy(occurrences = __v)
    def clearDiagnostics = copy(diagnostics = _root_.scala.Seq.empty)
    def addDiagnostics(__vs: dotty.tools.dotc.semanticdb.Diagnostic *): TextDocument = addAllDiagnostics(__vs)
    def addAllDiagnostics(__vs: Iterable[dotty.tools.dotc.semanticdb.Diagnostic]): TextDocument = copy(diagnostics = diagnostics ++ __vs)
    def withDiagnostics(__v: _root_.scala.Seq[dotty.tools.dotc.semanticdb.Diagnostic]): TextDocument = copy(diagnostics = __v)
    def clearSynthetics = copy(synthetics = _root_.scala.Seq.empty)
    def addSynthetics(__vs: dotty.tools.dotc.semanticdb.Synthetic *): TextDocument = addAllSynthetics(__vs)
    def addAllSynthetics(__vs: Iterable[dotty.tools.dotc.semanticdb.Synthetic]): TextDocument = copy(synthetics = synthetics ++ __vs)
    def withSynthetics(__v: _root_.scala.Seq[dotty.tools.dotc.semanticdb.Synthetic]): TextDocument = copy(synthetics = __v)
    
    
    
    
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.TextDocument])
}

object TextDocument  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.TextDocument] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.TextDocument] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.TextDocument = {
    var __schema: dotty.tools.dotc.semanticdb.Schema = dotty.tools.dotc.semanticdb.Schema.LEGACY
    var __uri: _root_.scala.Predef.String = ""
    var __text: _root_.scala.Predef.String = ""
    var __md5: _root_.scala.Predef.String = ""
    var __language: dotty.tools.dotc.semanticdb.Language = dotty.tools.dotc.semanticdb.Language.UNKNOWN_LANGUAGE
    val __symbols: _root_.scala.collection.immutable.VectorBuilder[dotty.tools.dotc.semanticdb.SymbolInformation] = new _root_.scala.collection.immutable.VectorBuilder[dotty.tools.dotc.semanticdb.SymbolInformation]
    val __occurrences: _root_.scala.collection.immutable.VectorBuilder[dotty.tools.dotc.semanticdb.SymbolOccurrence] = new _root_.scala.collection.immutable.VectorBuilder[dotty.tools.dotc.semanticdb.SymbolOccurrence]
    val __diagnostics: _root_.scala.collection.immutable.VectorBuilder[dotty.tools.dotc.semanticdb.Diagnostic] = new _root_.scala.collection.immutable.VectorBuilder[dotty.tools.dotc.semanticdb.Diagnostic]
    val __synthetics: _root_.scala.collection.immutable.VectorBuilder[dotty.tools.dotc.semanticdb.Synthetic] = new _root_.scala.collection.immutable.VectorBuilder[dotty.tools.dotc.semanticdb.Synthetic]
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __schema = dotty.tools.dotc.semanticdb.Schema.fromValue(_input__.readEnum())
        case 18 =>
          __uri = _input__.readStringRequireUtf8()
        case 26 =>
          __text = _input__.readStringRequireUtf8()
        case 90 =>
          __md5 = _input__.readStringRequireUtf8()
        case 80 =>
          __language = dotty.tools.dotc.semanticdb.Language.fromValue(_input__.readEnum())
        case 42 =>
          __symbols += LiteParser.readMessage[dotty.tools.dotc.semanticdb.SymbolInformation](_input__)
        case 50 =>
          __occurrences += LiteParser.readMessage[dotty.tools.dotc.semanticdb.SymbolOccurrence](_input__)
        case 58 =>
          __diagnostics += LiteParser.readMessage[dotty.tools.dotc.semanticdb.Diagnostic](_input__)
        case 98 =>
          __synthetics += LiteParser.readMessage[dotty.tools.dotc.semanticdb.Synthetic](_input__)
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.TextDocument(
        schema = __schema,
        uri = __uri,
        text = __text,
        md5 = __md5,
        language = __language,
        symbols = __symbols.result(),
        occurrences = __occurrences.result(),
        diagnostics = __diagnostics.result(),
        synthetics = __synthetics.result()
    )
  }
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.TextDocument(
    schema = dotty.tools.dotc.semanticdb.Schema.LEGACY,
    uri = "",
    text = "",
    md5 = "",
    language = dotty.tools.dotc.semanticdb.Language.UNKNOWN_LANGUAGE,
    symbols = _root_.scala.Seq.empty,
    occurrences = _root_.scala.Seq.empty,
    diagnostics = _root_.scala.Seq.empty,
    synthetics = _root_.scala.Seq.empty
  )
  final val SCHEMA_FIELD_NUMBER = 1
  final val URI_FIELD_NUMBER = 2
  final val TEXT_FIELD_NUMBER = 3
  final val MD5_FIELD_NUMBER = 11
  final val LANGUAGE_FIELD_NUMBER = 10
  final val SYMBOLS_FIELD_NUMBER = 5
  final val OCCURRENCES_FIELD_NUMBER = 6
  final val DIAGNOSTICS_FIELD_NUMBER = 7
  final val SYNTHETICS_FIELD_NUMBER = 12
  def of(
    schema: dotty.tools.dotc.semanticdb.Schema,
    uri: _root_.scala.Predef.String,
    text: _root_.scala.Predef.String,
    md5: _root_.scala.Predef.String,
    language: dotty.tools.dotc.semanticdb.Language,
    symbols: _root_.scala.Seq[dotty.tools.dotc.semanticdb.SymbolInformation],
    occurrences: _root_.scala.Seq[dotty.tools.dotc.semanticdb.SymbolOccurrence],
    diagnostics: _root_.scala.Seq[dotty.tools.dotc.semanticdb.Diagnostic],
    synthetics: _root_.scala.Seq[dotty.tools.dotc.semanticdb.Synthetic]
  ): _root_.dotty.tools.dotc.semanticdb.TextDocument = _root_.dotty.tools.dotc.semanticdb.TextDocument(
    schema,
    uri,
    text,
    md5,
    language,
    symbols,
    occurrences,
    diagnostics,
    synthetics
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.TextDocument])
}
