package n1;

import l1.InterfaceC2639e;

/* loaded from: classes.dex */
public final class t implements z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22287a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22288b;

    /* renamed from: c, reason: collision with root package name */
    public final z f22289c;

    /* renamed from: d, reason: collision with root package name */
    public final s f22290d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2639e f22291e;

    /* renamed from: f, reason: collision with root package name */
    public int f22292f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22293g;

    public t(z zVar, boolean z6, boolean z7, InterfaceC2639e interfaceC2639e, s sVar) {
        H1.g.c(zVar, "Argument must not be null");
        this.f22289c = zVar;
        this.f22287a = z6;
        this.f22288b = z7;
        this.f22291e = interfaceC2639e;
        H1.g.c(sVar, "Argument must not be null");
        this.f22290d = sVar;
    }

    public final synchronized void a() {
        if (this.f22293g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f22292f++;
    }

    @Override // n1.z
    public final synchronized void b() {
        if (this.f22292f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f22293g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f22293g = true;
        if (this.f22288b) {
            this.f22289c.b();
        }
    }

    @Override // n1.z
    public final int c() {
        return this.f22289c.c();
    }

    public final void d() {
        boolean z6;
        synchronized (this) {
            int i = this.f22292f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z6 = true;
            int i3 = i - 1;
            this.f22292f = i3;
            if (i3 != 0) {
                z6 = false;
            }
        }
        if (z6) {
            ((l) this.f22290d).f(this.f22291e, this);
        }
    }

    @Override // n1.z
    public final Class e() {
        return this.f22289c.e();
    }

    @Override // n1.z
    public final Object get() {
        return this.f22289c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f22287a + ", listener=" + this.f22290d + ", key=" + this.f22291e + ", acquired=" + this.f22292f + ", isRecycled=" + this.f22293g + ", resource=" + this.f22289c + '}';
    }
}
