package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.xbill.DNS.Flags;

/* loaded from: classes3.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f15450a;

    /* renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f15451b;

    /* renamed from: c, reason: collision with root package name */
    private static byte[] f15452c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Flags.CD, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: d, reason: collision with root package name */
    private static char[] f15453d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap map = new HashMap();
        f15450a = map;
        map.put('v', 'A');
        f15450a.put('S', 'B');
        f15450a.put('o', 'C');
        f15450a.put('a', 'D');
        f15450a.put('j', 'E');
        f15450a.put('c', 'F');
        f15450a.put('7', 'G');
        f15450a.put('d', 'H');
        f15450a.put('R', 'I');
        f15450a.put('z', 'J');
        f15450a.put('p', 'K');
        f15450a.put('W', 'L');
        f15450a.put('i', 'M');
        f15450a.put('f', 'N');
        f15450a.put('G', 'O');
        f15450a.put('y', 'P');
        f15450a.put('N', 'Q');
        f15450a.put('x', 'R');
        f15450a.put('Z', 'S');
        f15450a.put('n', 'T');
        f15450a.put('V', 'U');
        f15450a.put('5', 'V');
        f15450a.put('k', 'W');
        f15450a.put('+', 'X');
        f15450a.put('D', 'Y');
        f15450a.put('H', 'Z');
        f15450a.put('L', 'a');
        f15450a.put('Y', 'b');
        f15450a.put('h', 'c');
        f15450a.put('J', 'd');
        f15450a.put('4', 'e');
        f15450a.put('6', 'f');
        f15450a.put('l', 'g');
        f15450a.put('t', 'h');
        f15450a.put('0', 'i');
        f15450a.put('U', 'j');
        f15450a.put('3', 'k');
        f15450a.put('Q', 'l');
        f15450a.put('r', 'm');
        f15450a.put('g', 'n');
        f15450a.put('E', 'o');
        f15450a.put('u', 'p');
        f15450a.put('q', 'q');
        f15450a.put('8', 'r');
        f15450a.put('s', 's');
        f15450a.put('w', 't');
        f15450a.put('/', 'u');
        f15450a.put('X', 'v');
        f15450a.put('M', 'w');
        f15450a.put('e', 'x');
        f15450a.put('B', 'y');
        f15450a.put('A', 'z');
        f15450a.put('T', '0');
        f15450a.put('2', '1');
        f15450a.put('F', '2');
        f15450a.put('b', '3');
        f15450a.put('9', '4');
        f15450a.put('P', '5');
        f15450a.put('1', '6');
        f15450a.put('O', '7');
        f15450a.put('I', '8');
        f15450a.put('K', '9');
        f15450a.put('m', '+');
        f15450a.put('C', '/');
        HashMap map2 = new HashMap();
        f15451b = map2;
        map2.put('A', 'v');
        f15451b.put('B', 'S');
        f15451b.put('C', 'o');
        f15451b.put('D', 'a');
        f15451b.put('E', 'j');
        f15451b.put('F', 'c');
        f15451b.put('G', '7');
        f15451b.put('H', 'd');
        f15451b.put('I', 'R');
        f15451b.put('J', 'z');
        f15451b.put('K', 'p');
        f15451b.put('L', 'W');
        f15451b.put('M', 'i');
        f15451b.put('N', 'f');
        f15451b.put('O', 'G');
        f15451b.put('P', 'y');
        f15451b.put('Q', 'N');
        f15451b.put('R', 'x');
        f15451b.put('S', 'Z');
        f15451b.put('T', 'n');
        f15451b.put('U', 'V');
        f15451b.put('V', '5');
        f15451b.put('W', 'k');
        f15451b.put('X', '+');
        f15451b.put('Y', 'D');
        f15451b.put('Z', 'H');
        f15451b.put('a', 'L');
        f15451b.put('b', 'Y');
        f15451b.put('c', 'h');
        f15451b.put('d', 'J');
        f15451b.put('e', '4');
        f15451b.put('f', '6');
        f15451b.put('g', 'l');
        f15451b.put('h', 't');
        f15451b.put('i', '0');
        f15451b.put('j', 'U');
        f15451b.put('k', '3');
        f15451b.put('l', 'Q');
        f15451b.put('m', 'r');
        f15451b.put('n', 'g');
        f15451b.put('o', 'E');
        f15451b.put('p', 'u');
        f15451b.put('q', 'q');
        f15451b.put('r', '8');
        f15451b.put('s', 's');
        f15451b.put('t', 'w');
        f15451b.put('u', '/');
        f15451b.put('v', 'X');
        f15451b.put('w', 'M');
        f15451b.put('x', 'e');
        f15451b.put('y', 'B');
        f15451b.put('z', 'A');
        f15451b.put('0', 'T');
        f15451b.put('1', '2');
        f15451b.put('2', 'F');
        f15451b.put('3', 'b');
        f15451b.put('4', '9');
        f15451b.put('5', 'P');
        f15451b.put('6', '1');
        f15451b.put('7', 'O');
        f15451b.put('8', 'I');
        f15451b.put('9', 'K');
        f15451b.put('+', 'm');
        f15451b.put('/', 'C');
    }

    public static String a(String str) {
        return r0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : r0.c(str);
    }
}
