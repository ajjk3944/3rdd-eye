package Ib;

import Zg.AbstractC3689v;
import java.io.IOException;
import java.text.Normalizer;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.p;
import sh.C7968c;

/* loaded from: classes3.dex */
public abstract class a {
    public static final String a(String str) throws IOException {
        AbstractC6492s.i(str, "<this>");
        List listN0 = AbstractC3689v.N0(AbstractC3689v.i1(new C7968c(' ', '~')), '\t');
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (listN0.contains(Character.valueOf(cCharAt))) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static final String b(String str) {
        AbstractC6492s.i(str, "<this>");
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        AbstractC6492s.h(strNormalize, "normalize(...)");
        return new p("\\p{InCombiningDiacriticalMarks}+").n(strNormalize, "");
    }
}
