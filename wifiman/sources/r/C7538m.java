package r;

/* renamed from: r.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7538m extends AbstractC7542q {

    /* renamed from: a, reason: collision with root package name */
    private float f59730a;

    /* renamed from: b, reason: collision with root package name */
    private final int f59731b;

    public C7538m(float f10) {
        super(null);
        this.f59730a = f10;
        this.f59731b = 1;
    }

    @Override // r.AbstractC7542q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f59730a;
        }
        return 0.0f;
    }

    @Override // r.AbstractC7542q
    public int b() {
        return this.f59731b;
    }

    @Override // r.AbstractC7542q
    public void d() {
        this.f59730a = 0.0f;
    }

    @Override // r.AbstractC7542q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f59730a = f10;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7538m) && ((C7538m) obj).f59730a == this.f59730a;
    }

    public final float f() {
        return this.f59730a;
    }

    @Override // r.AbstractC7542q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C7538m c() {
        return new C7538m(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f59730a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f59730a;
    }
}
