package n1;

import b4.C0344i;

/* loaded from: classes.dex */
public final class y implements z, I1.b {

    /* renamed from: e, reason: collision with root package name */
    public static final V2.e f22305e = I1.c.a(20, new C0344i(24));

    /* renamed from: a, reason: collision with root package name */
    public final I1.d f22306a = new I1.d();

    /* renamed from: b, reason: collision with root package name */
    public z f22307b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22308c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22309d;

    public final synchronized void a() {
        this.f22306a.a();
        if (!this.f22308c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f22308c = false;
        if (this.f22309d) {
            b();
        }
    }

    @Override // n1.z
    public final synchronized void b() {
        this.f22306a.a();
        this.f22309d = true;
        if (!this.f22308c) {
            this.f22307b.b();
            this.f22307b = null;
            f22305e.d(this);
        }
    }

    @Override // n1.z
    public final int c() {
        return this.f22307b.c();
    }

    @Override // I1.b
    public final I1.d d() {
        return this.f22306a;
    }

    @Override // n1.z
    public final Class e() {
        return this.f22307b.e();
    }

    @Override // n1.z
    public final Object get() {
        return this.f22307b.get();
    }
}
