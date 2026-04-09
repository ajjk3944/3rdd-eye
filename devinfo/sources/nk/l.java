package nk;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class l implements h, Serializable {
    private final int arity;

    public l(int i4) {
        this.arity = i4;
    }

    @Override // nk.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        v.f29987a.getClass();
        String strA = w.a(this);
        k.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
