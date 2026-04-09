package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import d7.C4280c;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* loaded from: classes.dex */
public abstract class e4 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17758a = C2092m.W(new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f17759b = EnumC1667d.URL;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        String strE;
        Object objR = A9.I.r(c(), list, j());
        String str = objR instanceof String ? (String) objR : null;
        if (str != null && (strE = C1902i.e(str)) != null) {
            return new C4280c(strE);
        }
        A9.I.E(c(), list, this.f17759b, objR, j());
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17758a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17759b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
