package eb;

import java.util.List;

/* loaded from: classes.dex */
public abstract class j extends z9.f implements e {

    /* renamed from: r, reason: collision with root package name */
    public e f8084r;

    /* renamed from: x, reason: collision with root package name */
    public long f8085x;

    @Override // eb.e, n6.b
    public final int a(long j) {
        e eVar = this.f8084r;
        eVar.getClass();
        return eVar.a(j - this.f8085x);
    }

    @Override // eb.e, n6.b
    public final long e(int i10) {
        e eVar = this.f8084r;
        eVar.getClass();
        return eVar.e(i10) + this.f8085x;
    }

    @Override // eb.e, n6.b
    public final List f(long j) {
        e eVar = this.f8084r;
        eVar.getClass();
        return eVar.f(j - this.f8085x);
    }

    @Override // eb.e, n6.b
    public final int h() {
        e eVar = this.f8084r;
        eVar.getClass();
        return eVar.h();
    }
}
