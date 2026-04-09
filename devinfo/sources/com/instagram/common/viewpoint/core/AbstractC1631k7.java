package com.instagram.common.viewpoint.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.k7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1631k7 {
    public static String[] A00 = {"lKk5JaLmUx95KK", "mYuNW", "CjAKdLXppofA1D702KwO", "uXJpTDaVRtNVAp70rLVfm", "1hSAC5HvnjUxrHV2J", "HaqnzSsBrGrjOCqNCVI", "GKVrteGYxon0I6T9VCiXJnLEHrJ03INP", "n4WaWuAzWRB0VbcGBeRJywBcIsl3WCc7"};

    public static int A00(char c9) {
        return (char) ((c9 | ' ') - 97);
    }

    public static String A01(String string) {
        int length = string.length();
        int i4 = 0;
        while (i4 < length) {
            if (A02(string.charAt(i4))) {
                char[] chars = string.toCharArray();
                while (i4 < length) {
                    char c9 = chars[i4];
                    if (A02(c9)) {
                        int length2 = c9 ^ ' ';
                        chars[i4] = (char) length2;
                    }
                    i4++;
                }
                String strValueOf = String.valueOf(chars);
                int i10 = A00[5].length();
                if (i10 == 28) {
                    throw new RuntimeException();
                }
                A00[5] = "jxLLbSZUx5pXLcCA85YTs8Y";
                return strValueOf;
            }
            i4++;
        }
        return string;
    }

    public static boolean A02(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
    }

    public static boolean A03(CharSequence s12, CharSequence s22) {
        int length = s12.length();
        if (s12 == s22) {
            return true;
        }
        int length2 = s22.length();
        if (length != length2) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = s12.charAt(i4);
            char cCharAt2 = s22.charAt(i4);
            if (cCharAt != cCharAt2) {
                int iA00 = A00(cCharAt);
                if (A00[6].charAt(27) != '0') {
                    throw new RuntimeException();
                }
                A00[6] = "1S1N8LGAQqFvlHlBSY2lJ7CUB7v0Wvcl";
                if (iA00 < 26) {
                    int length3 = A00(cCharAt2);
                    if (iA00 == length3) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
