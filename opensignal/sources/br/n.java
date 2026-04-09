package br;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class n implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2912a;

    public n(int i10) {
        this.f2912a = i10;
    }

    @Override // br.i
    public final int f() {
        return this.f2912a;
    }

    public final String toString() {
        String strI = x.f2918a.i(this);
        l.d(strI, "renderLambdaToString(...)");
        return strI;
    }
}
