// Generated by https://github.com/tanishiking/semanticdb-for-scala3
// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package dotty.tools.dotc.semanticdb
import dotty.tools.dotc.semanticdb.internal.*
import scala.annotation.internal.sharable

@SerialVersionUID(0L)
final case class Range(
    startLine: _root_.scala.Int = 0,
    startCharacter: _root_.scala.Int = 0,
    endLine: _root_.scala.Int = 0,
    endCharacter: _root_.scala.Int = 0
    )  extends SemanticdbGeneratedMessage  derives CanEqual {
    @transient @sharable
    private var __serializedSizeMemoized: _root_.scala.Int = 0
    private def __computeSerializedSize(): _root_.scala.Int = {
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
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
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

object Range  extends SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.Range] {
  implicit def messageCompanion: SemanticdbGeneratedMessageCompanion[dotty.tools.dotc.semanticdb.Range] = this
  def parseFrom(`_input__`: SemanticdbInputStream): dotty.tools.dotc.semanticdb.Range = {
    var __startLine: _root_.scala.Int = 0
    var __startCharacter: _root_.scala.Int = 0
    var __endLine: _root_.scala.Int = 0
    var __endCharacter: _root_.scala.Int = 0
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __startLine = _input__.readInt32()
        case 16 =>
          __startCharacter = _input__.readInt32()
        case 24 =>
          __endLine = _input__.readInt32()
        case 32 =>
          __endCharacter = _input__.readInt32()
        case tag => _input__.skipField(tag)
      }
    }
    dotty.tools.dotc.semanticdb.Range(
        startLine = __startLine,
        startCharacter = __startCharacter,
        endLine = __endLine,
        endCharacter = __endCharacter
    )
  }
  
  
  
  
  
  
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
