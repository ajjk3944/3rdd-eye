package kotlin.reflect.jvm.internal.impl.types.error;

import Bh.G;
import Bh.InterfaceC2503m;
import Bh.Y;
import Zg.AbstractC3689v;
import Zg.d0;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import pi.S;
import pi.v0;
import si.AbstractC7984d;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f52198a = new l();

    /* renamed from: b, reason: collision with root package name */
    private static final G f52199b = e.f52179a;

    /* renamed from: c, reason: collision with root package name */
    private static final a f52200c;

    /* renamed from: d, reason: collision with root package name */
    private static final S f52201d;

    /* renamed from: e, reason: collision with root package name */
    private static final S f52202e;

    /* renamed from: f, reason: collision with root package name */
    private static final Y f52203f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set f52204g;

    static {
        String str = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        AbstractC6492s.h(str, "format(...)");
        Zh.f fVarN = Zh.f.n(str);
        AbstractC6492s.h(fVarN, "special(...)");
        f52200c = new a(fVarN);
        f52201d = d(k.CYCLIC_SUPERTYPES, new String[0]);
        f52202e = d(k.ERROR_PROPERTY_TYPE, new String[0]);
        f fVar = new f();
        f52203f = fVar;
        f52204g = d0.c(fVar);
    }

    private l() {
    }

    public static final g a(h kind, boolean z10, String... formatParams) {
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(formatParams, "formatParams");
        return z10 ? new m(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new g(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final g b(h kind, String... formatParams) {
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final i d(k kind, String... formatParams) {
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(formatParams, "formatParams");
        return f52198a.g(kind, AbstractC3689v.l(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean m(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m != null) {
            l lVar = f52198a;
            if (lVar.n(interfaceC2503m) || lVar.n(interfaceC2503m.b()) || interfaceC2503m == f52199b) {
                return true;
            }
        }
        return false;
    }

    private final boolean n(InterfaceC2503m interfaceC2503m) {
        return interfaceC2503m instanceof a;
    }

    public static final boolean o(S s10) {
        if (s10 == null) {
            return false;
        }
        v0 v0VarN0 = s10.N0();
        return (v0VarN0 instanceof j) && ((j) v0VarN0).f() == k.UNINFERRED_TYPE_VARIABLE;
    }

    public final i c(k kind, v0 typeConstructor, String... formatParams) {
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(typeConstructor, "typeConstructor");
        AbstractC6492s.i(formatParams, "formatParams");
        return f(kind, AbstractC3689v.l(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final j e(k kind, String... formatParams) {
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(formatParams, "formatParams");
        return new j(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final i f(k kind, List arguments, v0 typeConstructor, String... formatParams) {
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(arguments, "arguments");
        AbstractC6492s.i(typeConstructor, "typeConstructor");
        AbstractC6492s.i(formatParams, "formatParams");
        return new i(typeConstructor, b(h.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final i g(k kind, List arguments, String... formatParams) {
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(arguments, "arguments");
        AbstractC6492s.i(formatParams, "formatParams");
        return f(kind, arguments, e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final a h() {
        return f52200c;
    }

    public final G i() {
        return f52199b;
    }

    public final Set j() {
        return f52204g;
    }

    public final S k() {
        return f52202e;
    }

    public final S l() {
        return f52201d;
    }

    public final String p(S type) {
        AbstractC6492s.i(type, "type");
        AbstractC7984d.z(type);
        v0 v0VarN0 = type.N0();
        AbstractC6492s.g(v0VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((j) v0VarN0).g(0);
    }
}
