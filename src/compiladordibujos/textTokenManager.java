/* textTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. textTokenManager.java */
package compiladordibujos;

/** Token Manager. */
@SuppressWarnings("unused")public class textTokenManager implements textConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0xa000L) != 0L)
         {
            jjmatchedKind = 25;
            return 3;
         }
         if ((active0 & 0x15fbeL) != 0L)
         {
            jjmatchedKind = 25;
            return 7;
         }
         return -1;
      case 1:
         if ((active0 & 0x1ffbeL) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 25;
               jjmatchedPos = 1;
            }
            return 7;
         }
         return -1;
      case 2:
         if ((active0 & 0x17fbeL) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 2;
            return 7;
         }
         if ((active0 & 0x8000L) != 0L)
            return 7;
         return -1;
      case 3:
         if ((active0 & 0x15f3eL) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 3;
            return 7;
         }
         if ((active0 & 0x2080L) != 0L)
            return 7;
         return -1;
      case 4:
         if ((active0 & 0x1b20L) != 0L)
            return 7;
         if ((active0 & 0x1441eL) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 4;
            return 7;
         }
         return -1;
      case 5:
         if ((active0 & 0x14002L) != 0L)
            return 7;
         if ((active0 & 0x41cL) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 5;
            return 7;
         }
         return -1;
      case 6:
         if ((active0 & 0x40cL) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 6;
            return 7;
         }
         if ((active0 & 0x10L) != 0L)
            return 7;
         return -1;
      case 7:
         if ((active0 & 0x8L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 7;
            return 7;
         }
         if ((active0 & 0x404L) != 0L)
            return 7;
         return -1;
      case 8:
         if ((active0 & 0x8L) != 0L)
         {
            jjmatchedKind = 25;
            jjmatchedPos = 8;
            return 7;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 47:
         return jjStopAtPos(0, 19);
      case 58:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0xf00000L);
      case 60:
         return jjStopAtPos(0, 17);
      case 62:
         return jjStopAtPos(0, 18);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x180L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x10214L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x5000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x808L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0xa000L);
      default :
         return jjMoveNfa_0(4, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x18804L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x2032L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x1600L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 120:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 121:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 50:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(2, 22);
         else if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(2, 23);
         break;
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x6L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x108L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x10800L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 109:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 7);
         break;
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x1020L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x10L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x10L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x10024L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0xc00L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 111:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 7);
         else if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x8L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(4, 5, 7);
         return jjMoveStringLiteralDfa5_0(active0, 0x8L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x404L);
      case 106:
         return jjMoveStringLiteralDfa5_0(active0, 0x2L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 111:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 7);
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 7);
         else if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 7);
         break;
      case 114:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(4, 9, 7);
         break;
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x10L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(5, 16, 7);
         break;
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 14, 7);
         return jjMoveStringLiteralDfa6_0(active0, 0x4L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x10L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x8L);
      case 111:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(5, 1, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 103:
         return jjMoveStringLiteralDfa7_0(active0, 0x8L);
      case 111:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(6, 4, 7);
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x4L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(7, 2, 7);
         break;
      case 110:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(7, 10, 7);
         break;
      case 117:
         return jjMoveStringLiteralDfa8_0(active0, 0x8L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa9_0(active0, 0x8L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(9, 3, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 8;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                     { jjCheckNAdd(6); }
                  }
                  else if ((0x500000000000L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  break;
               case 5:
                  if ((0x500000000000L & l) != 0L)
                     kind = 6;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 24;
                  { jjCheckNAdd(6); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                     { jjCheckNAdd(7); }
                  }
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                     { jjCheckNAdd(7); }
                  }
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if (curChar == 111 && kind > 6)
                     kind = 6;
                  break;
               case 1:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 2:
                  if (curChar == 120)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAdd(7); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 8 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\144\151\142\165\152\157", "\143\141\142\145\143\145\162\141", 
"\162\145\143\164\141\156\147\165\154\157", "\143\151\162\143\165\154\157", "\154\151\156\145\141", null, 
"\141\154\164\157", "\141\156\143\150\157", "\143\157\154\157\162", 
"\160\157\163\151\143\151\157\156", "\162\141\144\151\157", "\146\157\156\144\157", "\164\151\160\157", 
"\146\165\145\156\164\145", "\164\141\155", "\143\141\144\145\156\141", "\74", "\76", "\57", "\72\170", 
"\72\171", "\72\170\62", "\72\171\62", null, null, null, null, null, null, "\72", };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 1 :
        image.append(jjstrLiteralImages[1]);
        lengthOfMatch = jjstrLiteralImages[1].length();
                           System.out.println("MAIN -> "+image);
         break;
      case 2 :
        image.append(jjstrLiteralImages[2]);
        lengthOfMatch = jjstrLiteralImages[2].length();
                                  System.out.println("CABECERA -> "+image);
         break;
      case 3 :
        image.append(jjstrLiteralImages[3]);
        lengthOfMatch = jjstrLiteralImages[3].length();
                                      System.out.println("RECTANGULO -> "+image);
         break;
      case 4 :
        image.append(jjstrLiteralImages[4]);
        lengthOfMatch = jjstrLiteralImages[4].length();
                               System.out.println("CIRCULO -> "+image);
         break;
      case 5 :
        image.append(jjstrLiteralImages[5]);
        lengthOfMatch = jjstrLiteralImages[5].length();
                            System.out.println("LINEA-> "+image);
         break;
      case 24 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                 System.out.println("NUMERO ->  "+image);
         break;
      case 25 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                         System.out.println("TEXTO ->  "+image);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public textTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public textTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 8; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x43ffffffL, 
};
static final long[] jjtoSkip = {
   0x3c000000L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[8];
    static private final int[] jjstateSet = new int[2 * 8];

    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    
    static protected char curChar;
}
