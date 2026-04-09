package z7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x implements y, u8.b {

    /* renamed from: e, reason: collision with root package name */
    public static final i0.f f38107e = u8.d.a(20, new z2.k());

    /* renamed from: a, reason: collision with root package name */
    public final u8.e f38108a = new u8.e();

    /* renamed from: b, reason: collision with root package name */
    public y f38109b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38110c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38111d;

    @Override // z7.y
    public final synchronized void a() {
        this.f38108a.a();
        this.f38111d = true;
        if (!this.f38110c) {
            this.f38109b.a();
            this.f38109b = null;
            f38107e.i(this);
        }
    }

    @Override // z7.y
    public final Class b() {
        return this.f38109b.b();
    }

    public final synchronized void c() {
        this.f38108a.a();
        if (!this.f38110c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f38110c = false;
        if (this.f38111d) {
            a();
        }
    }

    @Override // u8.b
    public final u8.e d() {
        return this.f38108a;
    }

    @Override // z7.y
    public final Object get() {
        return this.f38109b.get();
    }

    @Override // z7.y
    public final int getSize() {
        return this.f38109b.getSize();
    }
}
