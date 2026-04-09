package r;

/* renamed from: r.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7539n extends AbstractC7542q {

    /* renamed from: a, reason: collision with root package name */
    private float f59758a;

    /* renamed from: b, reason: collision with root package name */
    private float f59759b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59760c;

    public C7539n(float f10, float f11) {
        super(null);
        this.f59758a = f10;
        this.f59759b = f11;
        this.f59760c = 2;
    }

    @Override // r.AbstractC7542q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f59758a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f59759b;
    }

    @Override // r.AbstractC7542q
    public int b() {
        return this.f59760c;
    }

    @Override // r.AbstractC7542q
    public void d() {
        this.f59758a = 0.0f;
        this.f59759b = 0.0f;
    }

    @Override // r.AbstractC7542q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f59758a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f59759b = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7539n) {
            C7539n c7539n = (C7539n) obj;
            if (c7539n.f59758a == this.f59758a && c7539n.f59759b == this.f59759b) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f59758a;
    }

    public final float g() {
        return this.f59759b;
    }

    @Override // r.AbstractC7542q
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C7539n c() {
        return new C7539n(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f59758a) * 31) + Float.hashCode(this.f59759b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f59758a + ", v2 = " + this.f59759b;
    }
}
