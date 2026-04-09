package ek;

import nk.k;
import nk.v;
import nk.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class j extends c implements nk.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f23537a;

    public j(int i4, ck.c cVar) {
        super(cVar);
        this.f23537a = i4;
    }

    @Override // nk.h
    public final int getArity() {
        return this.f23537a;
    }

    @Override // ek.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        v.f29987a.getClass();
        String strA = w.a(this);
        k.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
