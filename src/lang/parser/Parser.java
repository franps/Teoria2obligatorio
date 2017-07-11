
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Jul 10 21:28:56 UYT 2017
//----------------------------------------------------

package lang.parser;

import java.io.*;
import java.util.*;
import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Jul 10 21:28:56 UYT 2017
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\004\003\000\002\002\004\000\002\004" +
    "\003\000\002\002\006\000\002\002\005\000\002\003\003" +
    "\000\002\003\003\000\002\003\005\000\002\003\005\000" +
    "\002\005\003\000\002\006\005\000\002\007\003\000\002" +
    "\007\003\000\002\007\003\000\002\007\003\000\002\007" +
    "\003\000\002\007\003\000\002\010\003\000\002\011\005" +
    "\000\002\011\005\000\002\011\005\000\002\011\005\000" +
    "\002\011\005\000\002\011\004\000\002\011\004\000\002" +
    "\011\004\000\002\011\003\000\002\011\003\000\002\011" +
    "\003\000\002\011\003\000\002\011\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\014\007\010\013\013\014\005\022\004\023" +
    "\011\001\002\000\026\002\uffe7\007\uffe7\015\uffe7\016\uffe7" +
    "\017\uffe7\020\uffe7\021\uffe7\022\uffe7\023\uffe7\024\uffe7\001" +
    "\002\000\014\007\026\013\013\014\005\022\004\023\011" +
    "\001\002\000\004\002\uffff\001\002\000\004\002\001\001" +
    "\002\000\026\002\uffe4\007\uffe4\014\034\016\uffe4\017\uffe4" +
    "\020\uffe4\021\uffe4\022\uffe4\023\uffe4\024\uffe4\001\002\000" +
    "\026\002\uffe6\007\uffe6\015\uffe6\016\uffe6\017\uffe6\020\uffe6" +
    "\021\uffe6\022\uffe6\023\uffe6\024\uffe6\001\002\000\024\002" +
    "\ufff0\007\016\016\022\017\024\020\020\021\023\022\017" +
    "\023\025\024\021\001\002\000\026\002\uffe5\007\uffe5\015" +
    "\uffe5\016\uffe5\017\uffe5\020\uffe5\021\uffe5\022\uffe5\023\uffe5" +
    "\024\uffe5\001\002\000\004\002\015\001\002\000\004\002" +
    "\000\001\002\000\026\002\uffe8\007\uffe8\015\uffe8\016\uffe8" +
    "\017\uffe8\020\uffe8\021\uffe8\022\uffe8\023\uffe8\024\uffe8\001" +
    "\002\000\026\002\uffea\007\uffea\015\uffea\016\uffea\017\uffea" +
    "\020\uffea\021\uffea\022\uffea\023\uffea\024\uffea\001\002\000" +
    "\014\007\026\013\013\014\005\022\004\023\011\001\002" +
    "\000\004\007\032\001\002\000\014\007\026\013\013\014" +
    "\005\022\004\023\011\001\002\000\014\007\026\013\013" +
    "\014\005\022\004\023\011\001\002\000\014\007\026\013" +
    "\013\014\005\022\004\023\011\001\002\000\026\002\uffe9" +
    "\007\uffe9\015\uffe9\016\uffe9\017\uffe9\020\uffe9\021\uffe9\022" +
    "\uffe9\023\uffe9\024\uffe9\001\002\000\026\002\uffe4\007\uffe4" +
    "\015\uffe4\016\uffe4\017\uffe4\020\uffe4\021\uffe4\022\uffe4\023" +
    "\uffe4\024\uffe4\001\002\000\026\002\uffed\007\016\015\uffed" +
    "\016\uffed\017\uffed\020\uffed\021\uffed\022\017\023\025\024" +
    "\021\001\002\000\026\002\uffeb\007\016\015\uffeb\016\uffeb" +
    "\017\uffeb\020\uffeb\021\uffeb\022\017\023\025\024\021\001" +
    "\002\000\026\002\uffee\007\016\015\uffee\016\uffee\017\uffee" +
    "\020\uffee\021\uffee\022\017\023\025\024\021\001\002\000" +
    "\026\002\uffe3\007\uffe3\015\uffe3\016\uffe3\017\uffe3\020\uffe3" +
    "\021\uffe3\022\uffe3\023\uffe3\024\uffe3\001\002\000\026\002" +
    "\uffec\007\016\015\uffec\016\uffec\017\uffec\020\uffec\021\uffec" +
    "\022\017\023\025\024\021\001\002\000\020\006\037\007" +
    "\047\010\036\011\046\012\044\015\050\025\043\001\002" +
    "\000\004\015\060\001\002\000\006\004\ufff6\015\ufff6\001" +
    "\002\000\006\004\ufff2\015\ufff2\001\002\000\006\004\056" +
    "\015\ufffc\001\002\000\006\004\ufff1\015\ufff1\001\002\000" +
    "\006\004\054\015\ufffb\001\002\000\006\004\ufff3\015\ufff3" +
    "\001\002\000\006\004\ufff4\015\ufff4\001\002\000\006\004" +
    "\ufff8\015\ufff8\001\002\000\006\004\ufff5\015\ufff5\001\002" +
    "\000\006\005\051\014\034\001\002\000\010\002\ufffd\004" +
    "\ufffd\015\ufffd\001\002\000\016\006\037\007\052\010\036" +
    "\011\046\012\044\025\043\001\002\000\004\014\034\001" +
    "\002\000\006\004\ufff7\015\ufff7\001\002\000\016\006\037" +
    "\007\047\010\036\011\046\012\044\025\043\001\002\000" +
    "\004\015\ufff9\001\002\000\016\006\037\007\047\010\036" +
    "\011\046\012\044\025\043\001\002\000\004\015\ufffa\001" +
    "\002\000\010\002\ufffe\004\ufffe\015\ufffe\001\002\000\024" +
    "\007\016\015\062\016\022\017\024\020\020\021\023\022" +
    "\017\023\025\024\021\001\002\000\026\002\uffef\007\uffef" +
    "\015\uffef\016\uffef\017\uffef\020\uffef\021\uffef\022\uffef\023" +
    "\uffef\024\uffef\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\012\002\006\004\013\010\005\011\011\001" +
    "\001\000\002\001\001\000\004\011\060\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\011\032\001\001\000\002\001\001\000\004\011\030" +
    "\001\001\000\004\011\027\001\001\000\004\011\026\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\002\040\003\034\005\037\006\041" +
    "\007\044\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\002\040\007\052\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\002\040\003\054\005\037\006\041" +
    "\007\044\001\001\000\002\001\001\000\014\002\040\003" +
    "\056\005\037\006\041\007\044\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	
	public static Lexer makeLexer(String input) throws Exception {
		return new Lexer(new StringReader(input));
	}
	
	public static Parser makeParser(String input) throws Exception {
		return new Parser(makeLexer(input));
	}
	
	public static Object parseString(String input) throws Exception {
		Parser parser = Parser.makeParser(input);
		Symbol result = parser.parse();
		return result.value; 
	}
	

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // expression ::= expression VIBORA IDS 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Expression(); RESULT.searchRegex(e, s); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // expression ::= IDS 
            {
              Expression RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 System.out.println("ids3");RESULT = new Expression(); RESULT.searchTag(Singleton.getRootData(), s); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // expression ::= ROOT 
            {
              Expression RESULT =null;
		 RESULT =Singleton.getRootData(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // expression ::= DOT 
            {
              Expression RESULT =null;
		 RESULT = new Expression(); RESULT.dot(Singleton.getRootData()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expression ::= SLASH 
            {
              Expression RESULT =null;
		 RESULT = new Expression(); RESULT.slash(Singleton.getRootData()); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expression ::= expression IDS 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 System.out.println("ids");RESULT = new Expression(); RESULT.searchTag(e1, s); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expression ::= expression DOT 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 System.out.println("dot");RESULT = new Expression(); RESULT.dot(e1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expression ::= expression SLASH 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		System.out.println("slash"); RESULT = new Expression(); RESULT.slash(e1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expression ::= expression INTERSECT expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 System.out.println("intersect");RESULT = new Expression(); RESULT.intersect(e1,e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expression ::= expression DIFFERENCE expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 System.out.println("difference");RESULT = new Expression(); RESULT.difference(e1,e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expression ::= expression UNION expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 System.out.println("union");RESULT = new Expression(); RESULT.union(e1,e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expression ::= expression CONCAT expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 System.out.println("contact");RESULT = new Expression(); RESULT.concat(e1,e2); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expression ::= L_BRACKET expression R_BRACKET 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expression",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // QQuery ::= expression 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QQuery",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Value ::= QObject 
            {
              Object RESULT =null;
		int qoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int qoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		QObject qo = (QObject)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = qo;  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Value ::= NULL 
            {
              Object RESULT =null;
		 RESULT = null; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Value ::= STRING 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = s; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Value ::= DOUBLE 
            {
              Object RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double d = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = d; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Value ::= FALSE 
            {
              Object RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Boolean f = (Boolean)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = f; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Value ::= TRUE 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Boolean t = (Boolean)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = t; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Value",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // QAttribute ::= IDS COLON Value 
            {
              Map<String,Object> RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new HashMap<String, Object>(); 
				RESULT.put(s,v); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QAttribute",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // QElement ::= Value 
            {
              ArrayList RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new ArrayList(); RESULT.add(v); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QElement",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // QComponents ::= QAttribute COMMA QComponents 
            {
              QObject RESULT =null;
		int qaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int qaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Map<String,Object> qa = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int qcleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int qcright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		QObject qc = (QObject)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		  RESULT=qc; RESULT.addAttributes(qa); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QComponents",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // QComponents ::= QElement COMMA QComponents 
            {
              QObject RESULT =null;
		int qeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int qeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		ArrayList qe = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int qcleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int qcright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		QObject qc = (QObject)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		  RESULT=qc; RESULT.addElements(qe);  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QComponents",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // QComponents ::= QAttribute 
            {
              QObject RESULT =null;
		int qaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int qaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Map<String,Object> qa = (Map<String,Object>)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new QObject(); RESULT.setAttributes(qa);  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QComponents",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // QComponents ::= QElement 
            {
              QObject RESULT =null;
		int qeleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int qeright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArrayList qe = (ArrayList)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new QObject(); RESULT.setElements(qe); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QComponents",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // QObject ::= IDS L_BRACKET R_BRACKET 
            {
              QObject RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		RESULT = new QObject(); RESULT.setTag(t); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QObject",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // QObject ::= IDS L_BRACKET QComponents R_BRACKET 
            {
              QObject RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int qesleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int qesright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		QObject qes = (QObject)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = qes;  RESULT.setTag(t);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QObject",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // QProgram ::= QQuery 
            {
              Expression RESULT =null;
		int qleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expression q = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
			RESULT = q; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QProgram",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= QProgram EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expression start_val = (Expression)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // QProgram ::= QObject 
            {
              Expression RESULT =null;
		int qleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		QObject q = (QObject)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
			RESULT = new Expression(q); Singleton.setRootData(q); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("QProgram",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

