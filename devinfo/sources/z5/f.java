package z5;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f37933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37934b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37935c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37936d;

    public f(int i4, int i10, String str, String str2) {
        k.e(str, "from");
        k.e(str2, "to");
        this.f37933a = i4;
        this.f37934b = i10;
        this.f37935c = str;
        this.f37936d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        k.e(fVar, "other");
        int i4 = this.f37933a - fVar.f37933a;
        return i4 == 0 ? this.f37934b - fVar.f37934b : i4;
    }
}
