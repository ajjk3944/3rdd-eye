package Jh;

import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import vi.AbstractC8233a;

/* loaded from: classes4.dex */
public abstract class N {
    public static final List a(Zh.f name) {
        AbstractC6492s.i(name, "name");
        String strB = name.b();
        AbstractC6492s.h(strB, "asString(...)");
        return H.c(strB) ? AbstractC3689v.p(b(name)) : H.d(strB) ? f(name) : C3116j.f10189a.b(name);
    }

    public static final Zh.f b(Zh.f methodName) {
        AbstractC6492s.i(methodName, "methodName");
        Zh.f fVarE = e(methodName, "get", false, null, 12, null);
        return fVarE == null ? e(methodName, "is", false, null, 8, null) : fVarE;
    }

    public static final Zh.f c(Zh.f methodName, boolean z10) {
        AbstractC6492s.i(methodName, "methodName");
        return e(methodName, "set", false, z10 ? "is" : null, 4, null);
    }

    private static final Zh.f d(Zh.f fVar, String str, boolean z10, String str2) {
        if (fVar.j()) {
            return null;
        }
        String strD = fVar.d();
        AbstractC6492s.h(strD, "getIdentifier(...)");
        if (!kotlin.text.t.P(strD, str, false, 2, null) || strD.length() == str.length()) {
            return null;
        }
        char cCharAt = strD.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return Zh.f.h(str2 + kotlin.text.t.G0(strD, str));
        }
        if (!z10) {
            return fVar;
        }
        String strC = AbstractC8233a.c(kotlin.text.t.G0(strD, str), true);
        if (Zh.f.l(strC)) {
            return Zh.f.h(strC);
        }
        return null;
    }

    static /* synthetic */ Zh.f e(Zh.f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    public static final List f(Zh.f methodName) {
        AbstractC6492s.i(methodName, "methodName");
        return AbstractC3689v.q(c(methodName, false), c(methodName, true));
    }
}
