package R9;

import Q9.C0;
import Q9.C1549p0;
import Q9.M;
import S9.S;

/* compiled from: JsonElement.kt */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final M f11806a = C1549p0.a(C0.f11399a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final C a(Number number) {
        return new u(number, false, null);
    }

    public static final C b(String str) {
        return str == null ? x.INSTANCE : new u(str, true, null);
    }

    public static final void c(i iVar, String str) {
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.x.a(iVar.getClass()) + " is not a " + str);
    }

    public static final Boolean d(C c10) {
        kotlin.jvm.internal.l.f(c10, "<this>");
        String strC = c10.c();
        String[] strArr = S.f12064a;
        kotlin.jvm.internal.l.f(strC, "<this>");
        if (strC.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strC.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }
}
