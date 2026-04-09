package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* loaded from: classes.dex */
public abstract class H extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17309a = C2092m.W(new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f17310b = EnumC1667d.BOOLEAN;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objR = A9.I.r(c(), list, j());
        Boolean bool = objR instanceof Boolean ? (Boolean) objR : null;
        if (bool != null) {
            return bool;
        }
        A9.I.E(c(), list, this.f17310b, objR, j());
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17309a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17310b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
