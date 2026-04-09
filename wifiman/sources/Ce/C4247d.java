package ce;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import org.snmp4j.util.SnmpConfigurator;

/* renamed from: ce.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4247d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4247d f33991a = new C4247d();

    private C4247d() {
    }

    public final S8.a a(String str) {
        AbstractC6492s.i(str, "str");
        Locale US = Locale.US;
        AbstractC6492s.h(US, "US");
        String lowerCase = str.toLowerCase(US);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        if (t.P(lowerCase, "ac", false, 2, null)) {
            return S8.a.AC;
        }
        if (t.P(lowerCase, "ad", false, 2, null)) {
            return S8.a.AD;
        }
        if (t.P(lowerCase, "ax", false, 2, null)) {
            return S8.a.AX;
        }
        if (t.P(lowerCase, "be", false, 2, null)) {
            return S8.a.BE;
        }
        if (t.W(lowerCase, SnmpConfigurator.O_CONTEXT_NAME, false, 2, null)) {
            return S8.a.f20357N;
        }
        if (t.W(lowerCase, "g", false, 2, null)) {
            return S8.a.f20356G;
        }
        if (t.W(lowerCase, SnmpConfigurator.O_BIND_ADDRESS, false, 2, null)) {
            return S8.a.f20355B;
        }
        if (t.W(lowerCase, SnmpConfigurator.O_AUTH_PROTOCOL, false, 2, null)) {
            return S8.a.f20354A;
        }
        return null;
    }
}
