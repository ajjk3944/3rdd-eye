package l0;

/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6529e {

    /* renamed from: a, reason: collision with root package name */
    private float f52331a;

    /* renamed from: b, reason: collision with root package name */
    private float f52332b;

    /* renamed from: c, reason: collision with root package name */
    private float f52333c;

    /* renamed from: d, reason: collision with root package name */
    private float f52334d;

    public C6529e(float f10, float f11, float f12, float f13) {
        this.f52331a = f10;
        this.f52332b = f11;
        this.f52333c = f12;
        this.f52334d = f13;
    }

    public final float a() {
        return this.f52334d;
    }

    public final float b() {
        return this.f52331a;
    }

    public final float c() {
        return this.f52333c;
    }

    public final float d() {
        return this.f52332b;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f52331a = Math.max(f10, this.f52331a);
        this.f52332b = Math.max(f11, this.f52332b);
        this.f52333c = Math.min(f12, this.f52333c);
        this.f52334d = Math.min(f13, this.f52334d);
    }

    public final boolean f() {
        return this.f52331a >= this.f52333c || this.f52332b >= this.f52334d;
    }

    public final void g(float f10, float f11, float f12, float f13) {
        this.f52331a = f10;
        this.f52332b = f11;
        this.f52333c = f12;
        this.f52334d = f13;
    }

    public final void h(float f10) {
        this.f52334d = f10;
    }

    public final void i(float f10) {
        this.f52331a = f10;
    }

    public final void j(float f10) {
        this.f52333c = f10;
    }

    public final void k(float f10) {
        this.f52332b = f10;
    }

    public String toString() {
        return "MutableRect(" + AbstractC6527c.a(this.f52331a, 1) + ", " + AbstractC6527c.a(this.f52332b, 1) + ", " + AbstractC6527c.a(this.f52333c, 1) + ", " + AbstractC6527c.a(this.f52334d, 1) + ')';
    }
}
