package z1;

import c2.h0;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f37832a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37833b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37834c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f37835d;

    /* renamed from: e, reason: collision with root package name */
    public final float f37836e;

    /* renamed from: f, reason: collision with root package name */
    public final long f37837f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f37838h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f37839i;

    public b(long j, long j8, long j9, boolean z3, float f10, long j10, long j11, boolean z10) {
        this.f37832a = j;
        this.f37833b = j8;
        this.f37834c = j9;
        this.f37835d = z3;
        this.f37836e = f10;
        this.f37837f = j10;
        this.g = j11;
        this.f37838h = z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndirectPointerInputChange(id=");
        sb2.append((Object) h0.h(this.f37832a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f37833b);
        sb2.append(", position=");
        sb2.append((Object) o1.b.j(this.f37834c));
        sb2.append(", pressed=");
        sb2.append(this.f37835d);
        sb2.append(", pressure=");
        sb2.append(this.f37836e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f37837f);
        sb2.append(", previousPosition=");
        sb2.append((Object) o1.b.j(this.g));
        sb2.append(", previousPressed=");
        sb2.append(this.f37838h);
        sb2.append(", isConsumed=");
        return h.x(sb2, this.f37839i, ')');
    }
}
