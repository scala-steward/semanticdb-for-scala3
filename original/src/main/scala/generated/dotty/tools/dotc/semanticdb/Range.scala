// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dotty.tools.dotc.semanticdb
import dotty.tools.dotc.semanticdb.internal._

@SerialVersionUID(0L)
final case class Range(
    startLine: _root_.scala.Int = 0,
    startCharacter: _root_.scala.Int = 0,
    endLine: _root_.scala.Int = 0,
    endCharacter: _root_.scala.Int = 0
    )  extends SemanticdbGeneratedMessage {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = startLine
        if (__value != 0) {
          __size += SemanticdbOutputStream.computeInt32Size(1, __value)
        }
      };
      
      {
        val __value = startCharacter
        if (__value != 0) {
          __size += SemanticdbOutputStream.computeInt32Size(2, __value)
        }
      };
      
      {
        val __value = endLine
        if (__value != 0) {
          __size += SemanticdbOutputStream.computeInt32Size(3, __value)
        }
      };
      
      {
        val __value = endCharacter
        if (__value != 0) {
          __size += SemanticdbOutputStream.computeInt32Size(4, __value)
        }
      };
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: SemanticdbOutputStream): _root_.scala.Unit = {
      {
        val __v = startLine
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = startCharacter
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      {
        val __v = endLine
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
      {
        val __v = endCharacter
        if (__v != 0) {
          _output__.writeInt32(4, __v)
        }
      };
    }
    def withStartLine(__v: _root_.scala.Int): Range = copy(startLine = __v)
    def withStartCharacter(__v: _root_.scala.Int): Range = copy(startCharacter = __v)
    def withEndLine(__v: _root_.scala.Int): Range = copy(endLine = __v)
    def withEndCharacter(__v: _root_.scala.Int): Range = copy(endCharacter = __v)
    
    
    
    
    // @@protoc_insertion_point(GeneratedMessage[dotty.tools.dotc.semanticdb.Range])
}

object Range  {
  
  
  
  
  
  
  
  
  lazy val defaultInstance = dotty.tools.dotc.semanticdb.Range(
    startLine = 0,
    startCharacter = 0,
    endLine = 0,
    endCharacter = 0
  )
  final val START_LINE_FIELD_NUMBER = 1
  final val START_CHARACTER_FIELD_NUMBER = 2
  final val END_LINE_FIELD_NUMBER = 3
  final val END_CHARACTER_FIELD_NUMBER = 4
  def of(
    startLine: _root_.scala.Int,
    startCharacter: _root_.scala.Int,
    endLine: _root_.scala.Int,
    endCharacter: _root_.scala.Int
  ): _root_.dotty.tools.dotc.semanticdb.Range = _root_.dotty.tools.dotc.semanticdb.Range(
    startLine,
    startCharacter,
    endLine,
    endCharacter
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[dotty.tools.dotc.semanticdb.Range])
}
