/* The following code was generated by JFlex 1.6.1 */

import java.util.*;
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>hepial.flex</tt>
 */
class HepialF implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\0\1\2\1\4\1\4\1\3\22\0\1\0\1\0\1\40"+
    "\5\0\1\32\1\33\1\46\1\44\1\26\1\45\1\37\1\1\12\25"+
    "\1\0\1\23\1\47\1\31\1\50\2\0\32\24\1\35\1\0\1\36"+
    "\3\0\1\21\1\7\1\27\1\5\1\6\1\15\1\14\1\24\1\16"+
    "\2\24\1\34\1\22\1\17\1\20\1\12\1\41\1\13\1\30\1\11"+
    "\1\10\1\42\1\24\1\43\2\24\1\0\1\0\1\0\1\51\6\0"+
    "\1\4\u1fa2\0\1\4\1\4\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\12\4\1\5\1\6\1\7"+
    "\1\10\2\4\1\11\1\12\1\13\1\4\1\14\1\15"+
    "\2\1\1\4\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\1\1\4\1\24\12\4\1\25\2\4\1\26\1\27"+
    "\1\4\1\30\1\0\1\31\1\4\1\32\1\33\1\34"+
    "\13\4\1\35\14\4\1\36\5\4\1\37\5\4\1\40"+
    "\1\41\13\4\1\42\1\43\1\44\2\4\1\45\2\4"+
    "\1\46\1\47\5\4\1\50\6\4\1\51\1\52\3\4"+
    "\1\53\1\54\2\4\1\55\2\4\1\56\1\4\1\57"+
    "\1\4\1\60\1\61\1\4\1\62\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\52\0\176\0\250\0\322\0\374"+
    "\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\52"+
    "\0\u024c\0\52\0\u0276\0\u02a0\0\u02ca\0\52\0\52\0\u02f4"+
    "\0\52\0\52\0\u031e\0\u0348\0\u0372\0\52\0\52\0\52"+
    "\0\u039c\0\u03c6\0\u024c\0\u03f0\0\u041a\0\374\0\u0444\0\u046e"+
    "\0\u0498\0\u04c2\0\u04ec\0\u0516\0\u0540\0\u056a\0\u0594\0\u05be"+
    "\0\374\0\u05e8\0\u0612\0\u063c\0\52\0\u0666\0\52\0\u0348"+
    "\0\u0348\0\u0690\0\52\0\52\0\52\0\u06ba\0\u06e4\0\u070e"+
    "\0\u0738\0\u0762\0\u078c\0\u07b6\0\u07e0\0\u080a\0\u0834\0\u085e"+
    "\0\374\0\u0888\0\u08b2\0\u08dc\0\u0906\0\u0930\0\u095a\0\u0984"+
    "\0\u09ae\0\u09d8\0\u0a02\0\u0a2c\0\u0a56\0\374\0\u0a80\0\u0aaa"+
    "\0\u0ad4\0\u0afe\0\u0b28\0\374\0\u0b52\0\u0b7c\0\u0ba6\0\u0bd0"+
    "\0\u0bfa\0\374\0\374\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2\0\u0ccc"+
    "\0\u0cf6\0\u0d20\0\u0d4a\0\u0d74\0\u0d9e\0\u0dc8\0\374\0\374"+
    "\0\374\0\u0df2\0\u0e1c\0\374\0\u0e46\0\u0e70\0\374\0\374"+
    "\0\u0e9a\0\u0ec4\0\u0eee\0\u0f18\0\u0f42\0\374\0\u0f6c\0\u0f96"+
    "\0\u0fc0\0\u0fea\0\u1014\0\u103e\0\374\0\374\0\u1068\0\u1092"+
    "\0\u10bc\0\374\0\374\0\u10e6\0\u1110\0\374\0\u113a\0\u1164"+
    "\0\374\0\u118e\0\374\0\u11b8\0\374\0\374\0\u11e2\0\374"+
    "\0\374";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\0\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\10\1\14\1\10\1\15"+
    "\1\16\1\17\1\10\1\20\1\10\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\10\1\35\1\10\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\53\0\1\44\55\0\1\10\1\45\14\10"+
    "\1\0\2\10\1\0\2\10\3\0\1\10\4\0\3\10"+
    "\13\0\4\10\1\46\5\10\1\47\3\10\1\0\2\10"+
    "\1\0\1\50\1\10\3\0\1\10\4\0\3\10\13\0"+
    "\13\10\1\51\2\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\16\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\14\10\1\52"+
    "\1\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\6\10\1\53\4\10\1\54\2\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\1\10\1\55\14\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\11\10\1\56\2\10\1\57"+
    "\1\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\13\10\1\60\2\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\3\10\1\61"+
    "\12\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\16\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\62\4\0\3\10\33\0\1\21\31\0\13\10\1\63"+
    "\2\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\11\10\1\64\4\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\37\0\1\65\25\0"+
    "\11\10\1\66\4\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\45\0\1\67\12\0\2\70\3\0"+
    "\33\70\1\71\11\70\5\0\6\10\1\72\7\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\37\0"+
    "\1\73\16\0\1\74\32\0\1\75\20\0\2\44\3\0"+
    "\45\44\5\0\2\10\1\76\13\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\4\10\1\77"+
    "\11\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\6\10\1\100\7\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\13\10\1\101"+
    "\2\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\12\10\1\102\3\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\13\10\1\103"+
    "\2\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\3\10\1\104\12\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\4\10\1\105"+
    "\11\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\12\10\1\106\3\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\3\10\1\107"+
    "\5\10\1\110\4\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\12\10\1\111\3\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\13\10\1\112\2\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\113\4\0\3\10\13\0\12\10\1\114\3\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\12\10\1\115\3\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\6\10\1\116\7\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\14\10\1\117\1\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\3\10\1\120\12\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\11\10\1\121\4\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\11\10\1\122\4\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\16\10\1\0\2\10\1\0\2\10\3\0\1\123\4\0"+
    "\3\10\13\0\4\10\1\124\11\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\7\10\1\125"+
    "\6\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\6\10\1\126\7\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\13\10\1\127"+
    "\2\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\4\10\1\130\1\131\2\10\1\132\5\10"+
    "\1\0\2\10\1\0\1\10\1\133\3\0\1\10\4\0"+
    "\3\10\13\0\16\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\2\10\1\134\13\0\6\10\1\135\7\10"+
    "\1\0\2\10\1\0\2\10\3\0\1\10\4\0\3\10"+
    "\13\0\6\10\1\136\7\10\1\0\2\10\1\0\2\10"+
    "\3\0\1\10\4\0\3\10\13\0\14\10\1\137\1\10"+
    "\1\0\2\10\1\0\2\10\3\0\1\10\4\0\3\10"+
    "\13\0\16\10\1\0\2\10\1\0\1\10\1\140\3\0"+
    "\1\10\4\0\3\10\13\0\13\10\1\141\2\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\1\10\1\142\14\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\11\10\1\143\4\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\4\10\1\144\11\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\1\10\1\145\14\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\6\10\1\146\7\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\1\10\1\147\14\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\16\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\1\150\2\10\13\0\6\10\1\151\7\10\1\0\2\10"+
    "\1\0\2\10\3\0\1\10\4\0\3\10\13\0\3\10"+
    "\1\152\12\10\1\0\2\10\1\0\2\10\3\0\1\10"+
    "\4\0\3\10\13\0\14\10\1\153\1\10\1\0\2\10"+
    "\1\0\2\10\3\0\1\10\4\0\3\10\13\0\6\10"+
    "\1\154\4\10\1\155\2\10\1\0\2\10\1\0\2\10"+
    "\3\0\1\10\4\0\3\10\13\0\13\10\1\156\2\10"+
    "\1\0\2\10\1\0\2\10\3\0\1\10\4\0\3\10"+
    "\13\0\11\10\1\157\4\10\1\0\2\10\1\0\2\10"+
    "\3\0\1\10\4\0\3\10\13\0\1\10\1\160\14\10"+
    "\1\0\2\10\1\0\2\10\3\0\1\10\4\0\3\10"+
    "\13\0\16\10\1\0\2\10\1\0\1\10\1\161\3\0"+
    "\1\10\4\0\3\10\13\0\12\10\1\162\3\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\4\10\1\163\11\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\12\10\1\164\3\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\5\10\1\165\2\10\1\166\5\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\6\10\1\167"+
    "\7\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\1\10\1\170\14\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\1\10\1\171"+
    "\14\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\3\10\1\172\12\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\14\10\1\173"+
    "\1\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\6\10\1\174\7\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\12\10\1\175"+
    "\3\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\7\10\1\176\6\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\3\10\1\177"+
    "\12\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\12\10\1\200\3\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\4\10\1\201"+
    "\11\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\14\10\1\202\1\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\6\10\1\203"+
    "\7\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\13\10\1\204\2\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\12\10\1\205"+
    "\3\10\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\1\10\1\206\14\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\15\10\1\207"+
    "\1\0\2\10\1\0\2\10\3\0\1\10\4\0\3\10"+
    "\13\0\12\10\1\210\3\10\1\0\2\10\1\0\2\10"+
    "\3\0\1\10\4\0\3\10\13\0\4\10\1\211\11\10"+
    "\1\0\2\10\1\0\2\10\3\0\1\10\4\0\3\10"+
    "\13\0\6\10\1\212\7\10\1\0\2\10\1\0\2\10"+
    "\3\0\1\10\4\0\3\10\13\0\16\10\1\0\2\10"+
    "\1\0\1\213\1\10\3\0\1\10\4\0\3\10\13\0"+
    "\1\214\15\10\1\0\2\10\1\0\2\10\3\0\1\10"+
    "\4\0\3\10\13\0\12\10\1\215\3\10\1\0\2\10"+
    "\1\0\2\10\3\0\1\10\4\0\3\10\13\0\7\10"+
    "\1\216\6\10\1\0\2\10\1\0\2\10\3\0\1\10"+
    "\4\0\3\10\13\0\12\10\1\217\3\10\1\0\2\10"+
    "\1\0\2\10\3\0\1\10\4\0\3\10\13\0\15\10"+
    "\1\220\1\0\2\10\1\0\2\10\3\0\1\10\4\0"+
    "\3\10\13\0\1\10\1\221\14\10\1\0\2\10\1\0"+
    "\2\10\3\0\1\10\4\0\3\10\13\0\16\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\1\222\2\10"+
    "\13\0\1\10\1\223\14\10\1\0\2\10\1\0\2\10"+
    "\3\0\1\10\4\0\3\10\13\0\4\10\1\224\11\10"+
    "\1\0\2\10\1\0\2\10\3\0\1\10\4\0\3\10"+
    "\13\0\16\10\1\0\2\10\1\0\1\225\1\10\3\0"+
    "\1\10\4\0\3\10\13\0\1\10\1\226\14\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\3\10\1\227\12\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\13\0\1\10\1\230\14\10\1\0"+
    "\2\10\1\0\2\10\3\0\1\10\4\0\3\10\13\0"+
    "\1\10\1\231\14\10\1\0\2\10\1\0\2\10\3\0"+
    "\1\10\4\0\3\10\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4620];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\13\1\1\11\1\1\1\11"+
    "\3\1\2\11\1\1\2\11\3\1\3\11\24\1\1\11"+
    "\1\1\1\11\1\0\2\1\3\11\134\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    int line = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  HepialF(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 162) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 52: break;
          case 2: 
            { //System.out.println("I've seen sym.t_div "+yytext());
    return new Symbol(sym.t_div);
            }
          case 53: break;
          case 3: 
            { line++;
            }
          case 54: break;
          case 4: 
            { //System.out.println("I've seen sym.t_ident "+yytext());
    return new Symbol(sym.t_ident, yytext());
            }
          case 55: break;
          case 5: 
            { //System.out.println("I've seen sym.t_to "+yytext());
    return new Symbol(sym.t_to);
            }
          case 56: break;
          case 6: 
            { //System.out.println("I've seen sym.t_semicolon "+yytext());
    return new Symbol(sym.t_semicolon);
            }
          case 57: break;
          case 7: 
            { //System.out.println("I've seen sym.t_intConst "+yytext());
    return new Symbol(sym.t_intConst, Integer.parseInt(yytext()));
            }
          case 58: break;
          case 8: 
            { //System.out.println("I've seen sym.t_coma "+yytext());
    return new Symbol(sym.t_coma);
            }
          case 59: break;
          case 9: 
            { //System.out.println("I've seen sym.t_eq "+yytext());
    return new Symbol(sym.t_eq);
            }
          case 60: break;
          case 10: 
            { //System.out.println("I've seen sym.t_openpar "+yytext());
    return new Symbol(sym.t_openpar);
            }
          case 61: break;
          case 11: 
            { //System.out.println("I've seen sym.t_closepar "+yytext());
    return new Symbol(sym.t_closepar);
            }
          case 62: break;
          case 12: 
            { //System.out.println("I've seen sym.t_opensq "+yytext());
    return new Symbol(sym.t_opensq);
            }
          case 63: break;
          case 13: 
            { //System.out.println("I've seen sym.t_closesq "+yytext());
    return new Symbol(sym.t_closesq);
            }
          case 64: break;
          case 14: 
            { //System.out.println("I've seen sym.t_plus "+yytext());
    return new Symbol(sym.t_plus);
            }
          case 65: break;
          case 15: 
            { //System.out.println("I've seen sym.t_minus "+yytext());
    return new Symbol(sym.t_minus);
            }
          case 66: break;
          case 16: 
            { //System.out.println("I've seen sym.t_time "+yytext());
    return new Symbol(sym.t_time);
            }
          case 67: break;
          case 17: 
            { //System.out.println("I've seen sym.t_lt "+yytext());
    return new Symbol(sym.t_lt);
            }
          case 68: break;
          case 18: 
            { //System.out.println("I've seen sym.t_gt "+yytext());
    return new Symbol(sym.t_gt);
            }
          case 69: break;
          case 19: 
            { //System.out.println("I've seen sym.t_notn "+yytext());
    return new Symbol(sym.t_notn);
            }
          case 70: break;
          case 20: 
            { //System.out.println("I've seen sym.t_and "+yytext());
    return new Symbol(sym.t_and);
            }
          case 71: break;
          case 21: 
            { //System.out.println("I've seen sym.t_or "+yytext());
    return new Symbol(sym.t_or);
            }
          case 72: break;
          case 22: 
            { //System.out.println("I've seen sym.t_if "+yytext());
    return new Symbol(sym.t_if);
            }
          case 73: break;
          case 23: 
            { //System.out.println("I've seen sym.t_doubleq "+yytext());
    return new Symbol(sym.t_doubleq);
            }
          case 74: break;
          case 24: 
            { //System.out.println("I've seen sym.t_doubledot "+yytext());
    return new Symbol(sym.t_doubledot);
            }
          case 75: break;
          case 25: 
            { //System.out.println("I've seen sym.t_string "+yytext());
    return new Symbol(sym.t_string);
            }
          case 76: break;
          case 26: 
            { //System.out.println("I've seen sym.t_le "+yytext());
    return new Symbol(sym.t_le);
            }
          case 77: break;
          case 27: 
            { //System.out.println("I've seen sym.t_diff "+yytext());
    return new Symbol(sym.t_diff);
            }
          case 78: break;
          case 28: 
            { //System.out.println("I've seen sym.t_ge "+yytext());
    return new Symbol(sym.t_ge);
            }
          case 79: break;
          case 29: 
            { //System.out.println("I've seen sym.t_not "+yytext());
    return new Symbol(sym.t_not);
            }
          case 80: break;
          case 30: 
            { //System.out.println("I've seen sym.t_for "+yytext());
    return new Symbol(sym.t_for);
            }
          case 81: break;
          case 31: 
            { //System.out.println("I've seen sym.t_false "+yytext());
    return new Symbol(sym.t_false);
            }
          case 82: break;
          case 32: 
            { //System.out.println("I've seen sym.t_read "+yytext());
    return new Symbol(sym.t_read);
            }
          case 83: break;
          case 33: 
            { //System.out.println("I've seen sym.t_true "+yytext());
    return new Symbol(sym.t_true);
            }
          case 84: break;
          case 34: 
            { //System.out.println("I've seen sym.t_endif "+yytext());
    return new Symbol(sym.t_endif);
            }
          case 85: break;
          case 35: 
            { //System.out.println("I've seen sym.t_do "+yytext());
    return new Symbol(sym.t_do);
            }
          case 86: break;
          case 36: 
            { //System.out.println("I've seen sym.t_then "+yytext());
    return new Symbol(sym.t_then);
            }
          case 87: break;
          case 37: 
            { //System.out.println("I've seen sym.t_else "+yytext());
    return new Symbol(sym.t_else);
            }
          case 88: break;
          case 38: 
            { //System.out.println("I've seen sym.t_int "+yytext());
    return new Symbol(sym.t_int);
            }
          case 89: break;
          case 39: 
            { //System.out.println("I've seen sym.t_write "+yytext());
    return new Symbol(sym.t_write);
            }
          case 90: break;
          case 40: 
            { //System.out.println("I've seen sym.t_endPrg "+yytext());
    return new Symbol(sym.t_endPrg);
            }
          case 91: break;
          case 41: 
            { //System.out.println("I've seen sym.t_bool "+yytext());
    return new Symbol(sym.t_bool);
            }
          case 92: break;
          case 42: 
            { //System.out.println("I've seen sym.t_while "+yytext());
    return new Symbol(sym.t_while);
            }
          case 93: break;
          case 43: 
            { //System.out.println("I've seen sym.t_endfor "+yytext());
    return new Symbol(sym.t_endfor);
            }
          case 94: break;
          case 44: 
            { //System.out.println("I've seen sym.t_endfunc "+yytext());
    return new Symbol(sym.t_endfunc);
            }
          case 95: break;
          case 45: 
            { //System.out.println("I've seen sym.t_beginPrg "+yytext());
    return new Symbol(sym.t_beginPrg);
            }
          case 96: break;
          case 46: 
            { //System.out.println("I've seen sym.t_return "+yytext());
    return new Symbol(sym.t_return);
            }
          case 97: break;
          case 47: 
            { //System.out.println("I've seen sym.t_from "+yytext());
    return new Symbol(sym.t_from);
            }
          case 98: break;
          case 48: 
            { //System.out.println("I've seen sym.t_beginfunc "+yytext());
    return new Symbol(sym.t_beginfunc);
            }
          case 99: break;
          case 49: 
            { //System.out.println("I've seen sym.t_prg "+yytext());
    return new Symbol(sym.t_prg);
            }
          case 100: break;
          case 50: 
            { //System.out.println("I've seen sym.t_const "+yytext());
    return new Symbol(sym.t_const);
            }
          case 101: break;
          case 51: 
            { //System.out.println("I've seen sym.t_endwhile "+yytext());
    return new Symbol(sym.t_endwhile);
            }
          case 102: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}