package y9;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.s;

/* compiled from: StringNumberConversions.kt */
/* loaded from: classes3.dex */
public class m extends C5830l {
    public static final void N(String str) {
        throw new NumberFormatException(s.e("Invalid number format: '", str, '\''));
    }

    public static Double O(String str) {
        kotlin.jvm.internal.l.f(str, "<this>");
        try {
            if (C5827i.f48381a.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float P(String str) {
        try {
            if (C5827i.f48381a.a(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Integer Q(String str) {
        boolean z10;
        int i;
        int i10;
        kotlin.jvm.internal.l.f(str, "<this>");
        com.google.gson.internal.c.e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = -2147483647;
        if (kotlin.jvm.internal.l.h(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i12 = RecyclerView.UNDEFINED_DURATION;
                z10 = true;
            }
        } else {
            z10 = false;
            i = 0;
        }
        int i13 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + iDigit) {
                return null;
            }
            i11 = i10 - iDigit;
            i++;
        }
        return z10 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }

    public static Long R(String str) {
        boolean z10;
        kotlin.jvm.internal.l.f(str, "<this>");
        com.google.gson.internal.c.e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j4 = -9223372036854775807L;
        if (kotlin.jvm.internal.l.h(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j4 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z10 = false;
        }
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 != -256204778801521550L) {
                    return null;
                }
                j11 = j4 / 10;
                if (j10 < j11) {
                    return null;
                }
            }
            long j12 = j10 * 10;
            long j13 = iDigit;
            if (j12 < j4 + j13) {
                return null;
            }
            j10 = j12 - j13;
            i++;
        }
        return z10 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }
}
