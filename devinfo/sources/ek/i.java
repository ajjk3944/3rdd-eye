package ek;

import nk.k;
import nk.v;
import nk.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i extends h implements nk.h {
    private final int arity;

    public i(int i4, ck.c cVar) {
        super(cVar);
        this.arity = i4;
    }

    @Override // nk.h
    public int getArity() {
        return this.arity;
    }

    @Override // ek.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        v.f29987a.getClass();
        String strA = w.a(this);
        k.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
