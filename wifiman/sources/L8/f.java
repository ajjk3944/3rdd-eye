package L8;

import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* loaded from: classes3.dex */
public abstract class f {
    public static final String a(inet.ipaddr.g gVar) {
        AbstractC6492s.i(gVar, "<this>");
        String strB = b(gVar, false);
        AbstractC6492s.f(strB);
        return strB;
    }

    public static final String b(inet.ipaddr.g gVar, boolean z10) {
        AbstractC6492s.i(gVar, "<this>");
        if (((z10 && gVar.g1()) ? null : gVar) == null) {
            return null;
        }
        if (gVar instanceof C6180b) {
            return gVar.Y();
        }
        if (!(gVar instanceof C6205b)) {
            throw new IllegalStateException();
        }
        String strY = ((C6205b) gVar).Y();
        AbstractC6492s.h(strY, "toCanonicalString(...)");
        String upperCase = t.l1(strY, "%", null, 2, null).toUpperCase(Locale.ROOT);
        AbstractC6492s.h(upperCase, "toUpperCase(...)");
        if (t.m0(upperCase) || AbstractC6492s.d(upperCase, "::")) {
            return null;
        }
        return upperCase;
    }
}
