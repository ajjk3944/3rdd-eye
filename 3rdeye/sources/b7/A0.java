package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;

/* compiled from: DictFunctions.kt */
/* loaded from: classes.dex */
public abstract class A0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17198a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f17199b;

    public A0() {
        a7.j jVar = new a7.j(EnumC1667d.DICT, false);
        EnumC1667d enumC1667d = EnumC1667d.STRING;
        this.f17198a = C2092m.W(jVar, new a7.j(enumC1667d, true));
        this.f17199b = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objR = A9.I.r(c(), list, j());
        String str = objR instanceof String ? (String) objR : null;
        if (str != null) {
            return str;
        }
        A9.I.E(c(), list, this.f17199b, objR, j());
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17198a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17199b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
