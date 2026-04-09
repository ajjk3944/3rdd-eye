package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1947r0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17955a = C2092m.W(new a7.j(EnumC1667d.DICT, false), new a7.j(EnumC1667d.STRING, true));

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f17956b = EnumC1667d.NUMBER;

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objR = A9.I.r(c(), list, j());
        Number number = objR instanceof Number ? (Number) objR : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        A9.I.E(c(), list, this.f17956b, objR, j());
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17955a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17956b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
