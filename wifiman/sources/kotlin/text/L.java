package kotlin.text;

import Zg.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class L extends J {
    public static final List A1(CharSequence charSequence, int i10, int i11, boolean z10, InterfaceC6835l transform) {
        AbstractC6492s.i(charSequence, "<this>");
        AbstractC6492s.i(transform, "transform");
        h0.a(i10, i11);
        int length = charSequence.length();
        int i12 = 0;
        ArrayList arrayList = new ArrayList((length / i11) + (length % i11 == 0 ? 0 : 1));
        while (i12 >= 0 && i12 < length) {
            int i13 = i12 + i10;
            if (i13 < 0 || i13 > length) {
                if (!z10) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i12, i13)));
            i12 += i11;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String B1(CharSequence it) {
        AbstractC6492s.i(it, "it");
        return it.toString();
    }

    public static List s1(CharSequence charSequence, int i10) {
        AbstractC6492s.i(charSequence, "<this>");
        return z1(charSequence, i10, i10, true);
    }

    public static String t1(String str, int i10) {
        AbstractC6492s.i(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(AbstractC7978m.g(i10, str.length()));
            AbstractC6492s.h(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char u1(CharSequence charSequence) {
        AbstractC6492s.i(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char v1(CharSequence charSequence) {
        AbstractC6492s.i(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(t.e0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char w1(CharSequence charSequence) {
        AbstractC6492s.i(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String x1(String str, int i10) {
        AbstractC6492s.i(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, AbstractC7978m.g(i10, str.length()));
            AbstractC6492s.h(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String y1(String str, int i10) {
        AbstractC6492s.i(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - AbstractC7978m.g(i10, length));
            AbstractC6492s.h(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static final List z1(CharSequence charSequence, int i10, int i11, boolean z10) {
        AbstractC6492s.i(charSequence, "<this>");
        return A1(charSequence, i10, i11, z10, new InterfaceC6835l() { // from class: kotlin.text.K
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return L.B1((CharSequence) obj);
            }
        });
    }
}
