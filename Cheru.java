package love.simbot.example.reply;

import lombok.SneakyThrows;

/**
 * @Author: MrsmMiao
 * @DateTime: 2021/8/11 15:51
 * @Description: 切噜切噜~
 */
public class Cheru {
    private static final String CHERU_SET = "切卟叮咧哔唎啪啰啵嘭噜噼巴拉蹦铃";
    private static final String CHERU_START = "切噜～♪切";
    @SneakyThrows
    public static String strToCheru(String str) {
        String cheru = "";
        String newStr = strInvert2(strToGbk(str));
        for (int i = 0; i < newStr.length(); i++) {
            int numByStr = getNumByStr(newStr.substring(i, i + 1));
            cheru += CHERU_SET.substring(numByStr, numByStr + 1);
        }
        return CHERU_START + cheru;
    }
    @SneakyThrows
    public static String strToGbk(String str){//转换GBK内码
        /**
         * @By: https://blog.csdn.net/weixin_43031092/article/details/105874466
         */
        str = str.replaceAll( "[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]" , "");
        String hzString = str;
        byte[] arrInput;
        char[] chars = "0123456789ABCDEF".toCharArray();
        arrInput = hzString.getBytes("GBK");
        StringBuilder sOutput = new StringBuilder(arrInput.length);
        int bit;
        for (int i = 0; i < arrInput.length; i++) {
            bit = (arrInput[i] & 0x0f0) >> 4;
            sOutput.append(chars[bit]);
            bit = arrInput[i] & 0x0f;
            sOutput.append(chars[bit]);
        }
        return sOutput.toString();
    }
    public static String strInvert2(String str){//两两颠倒Cheru翻转
        String returnStr ="";
        for (int i = 0; i < str.length()-1; i++) {
            String fristChar = str.substring(i,i+1);
            String endChar = str.substring(i+1,i+2);
            String t = fristChar;
            fristChar = endChar;
            endChar = t;
            returnStr +=fristChar;
            returnStr += endChar;
            i++;
        }
        return returnStr;
    }
    public static int getNumByStr(String str){
        if (str.equals("1")){return 1;}
        if (str.equals("2")){return 2;}
        if (str.equals("3")){return 3;}
        if (str.equals("4")){return 4;}
        if (str.equals("5")){return 5;}
        if (str.equals("6")){return 6;}
        if (str.equals("7")){return 7;}
        if (str.equals("8")){return 8;}
        if (str.equals("9")){return 9;}
        if (str.equals("0")){return 0;}
        if (str.equals("a")||str.equals("A")){return 10;}
        if (str.equals("b")||str.equals("B")){return 11;}
        if (str.equals("c")||str.equals("C")){return 12;}
        if (str.equals("d")||str.equals("D")){return 13;}
        if (str.equals("e")||str.equals("E")){return 14;}
        if (str.equals("f")||str.equals("F")){return 15;}
        return -1;
    }
}
