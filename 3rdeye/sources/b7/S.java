package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4278a;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* loaded from: classes.dex */
public abstract class S extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17518a = C2092m.W(new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f17519b = EnumC1667d.COLOR;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objA;
        Object objR = A9.I.r(c(), list, j());
        if (!(objR instanceof String)) {
            A9.I.E(c(), list, this.f17519b, objR, j());
            throw null;
        }
        try {
            objA = new C4278a(C4278a.C0440a.a((String) objR));
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (b9.m.a(objA) == null) {
            return objA;
        }
        A9.I.C(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17518a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17519b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
