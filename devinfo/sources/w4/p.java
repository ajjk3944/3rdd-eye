package w4;

import android.util.SparseArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f36453a;

    /* renamed from: b, reason: collision with root package name */
    public s f36454b;

    public p(int i4) {
        this.f36453a = new SparseArray(i4);
    }

    public final void a(s sVar, int i4, int i10) {
        int iA = sVar.a(i4);
        SparseArray sparseArray = this.f36453a;
        p pVar = sparseArray == null ? null : (p) sparseArray.get(iA);
        if (pVar == null) {
            pVar = new p(1);
            sparseArray.put(sVar.a(i4), pVar);
        }
        if (i10 > i4) {
            pVar.a(sVar, i4 + 1, i10);
        } else {
            pVar.f36454b = sVar;
        }
    }
}
