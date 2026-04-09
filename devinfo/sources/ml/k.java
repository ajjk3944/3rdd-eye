package ml;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final kl.d[] f29419a = new kl.d[0];

    public static final void a(int i4, int i10, kl.d dVar) {
        nk.k.e(dVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i4) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(dVar.g(i12));
            }
            i11 >>>= 1;
        }
        String strA = dVar.a();
        nk.k.e(strA, "serialName");
        throw new il.b(arrayList, arrayList.size() == 1 ? a0.g.p(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", strA, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + strA + "', but they were missing", null);
    }
}
