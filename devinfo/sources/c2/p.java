package c2;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f2658a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2659b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2660c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2661d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2662e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2663f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2664h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2665i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2666k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2667l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2668m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2669n;

    /* renamed from: o, reason: collision with root package name */
    public p f2670o;

    public p(long j, long j8, long j9, boolean z3, float f10, long j10, long j11, boolean z10, boolean z11, int i4, long j12) {
        this.f2658a = j;
        this.f2659b = j8;
        this.f2660c = j9;
        this.f2661d = z3;
        this.f2662e = f10;
        this.f2663f = j10;
        this.g = j11;
        this.f2664h = z10;
        this.f2665i = i4;
        this.j = j12;
        this.f2667l = 0L;
        this.f2668m = z11;
        this.f2669n = z11;
    }

    public final void a() {
        p pVar = this.f2670o;
        if (pVar == null) {
            this.f2668m = true;
            this.f2669n = true;
        } else if (pVar != null) {
            pVar.a();
        }
    }

    public final boolean b() {
        p pVar = this.f2670o;
        return pVar != null ? pVar.b() : this.f2668m || this.f2669n;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) h0.h(this.f2658a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f2659b);
        sb2.append(", position=");
        sb2.append((Object) o1.b.j(this.f2660c));
        sb2.append(", pressed=");
        sb2.append(this.f2661d);
        sb2.append(", pressure=");
        sb2.append(this.f2662e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f2663f);
        sb2.append(", previousPosition=");
        sb2.append((Object) o1.b.j(this.g));
        sb2.append(", previousPressed=");
        sb2.append(this.f2664h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        sb2.append((Object) c0.a(this.f2665i));
        sb2.append(", historical=");
        Object obj = this.f2666k;
        if (obj == null) {
            obj = zj.s.f38317a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) o1.b.j(this.j));
        sb2.append(')');
        return sb2.toString();
    }

    public p(long j, long j8, long j9, boolean z3, float f10, long j10, long j11, boolean z10, int i4, ArrayList arrayList, long j12, long j13) {
        this(j, j8, j9, z3, f10, j10, j11, z10, false, i4, j12);
        this.f2666k = arrayList;
        this.f2667l = j13;
    }
}
