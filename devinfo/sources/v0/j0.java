package v0;

import u0.e2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f35582a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35583b;

    public j0(int i4, int i10) {
        this.f35582a = i4;
        this.f35583b = i10;
    }

    public abstract void a(androidx.datastore.preferences.protobuf.k kVar, u0.c cVar, e2 e2Var, c1.o oVar, k0 k0Var);

    public u0.a b(androidx.datastore.preferences.protobuf.k kVar) {
        return null;
    }

    public final String toString() {
        String strC = nk.v.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    public /* synthetic */ j0(int i4, int i10, int i11) {
        this((i11 & 1) != 0 ? 0 : i4, (i11 & 2) != 0 ? 0 : i10);
    }
}
