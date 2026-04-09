package h7;

import f7.x;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r implements i7.a, d {

    /* renamed from: a, reason: collision with root package name */
    public final x f24996a;

    /* renamed from: b, reason: collision with root package name */
    public final i7.e f24997b;

    /* renamed from: c, reason: collision with root package name */
    public m7.k f24998c;

    public r(x xVar, n7.a aVar, m7.j jVar) {
        this.f24996a = xVar;
        i7.e eVarG = jVar.f28923a.g();
        this.f24997b = eVarG;
        aVar.e(eVarG);
        eVarG.a(this);
    }

    public static int e(int i4, int i10) {
        int i11 = i4 / i10;
        if ((i4 ^ i10) < 0 && i11 * i10 != i4) {
            i11--;
        }
        return i4 - (i11 * i10);
    }

    @Override // i7.a
    public final void a() {
        this.f24996a.invalidateSelf();
    }

    @Override // h7.d
    public final void c(List list, List list2) {
    }
}
