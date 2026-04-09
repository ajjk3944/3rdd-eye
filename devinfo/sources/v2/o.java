package v2;

import android.graphics.Typeface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements n {
    public static Typeface a(String str, k kVar, int i4) {
        if (i4 == 0 && nk.k.a(kVar, k.f35777c) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), kVar.f35780a, i4 == 1);
    }

    @Override // v2.n
    public final Typeface f(k kVar, int i4) {
        return a(null, kVar, i4);
    }

    @Override // v2.n
    public final Typeface g(m mVar, k kVar, int i4) {
        mVar.getClass();
        return a("sans-serif", kVar, i4);
    }
}
