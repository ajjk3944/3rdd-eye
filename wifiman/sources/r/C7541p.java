package r;

/* renamed from: r.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7541p extends AbstractC7542q {

    /* renamed from: a, reason: collision with root package name */
    private float f59826a;

    /* renamed from: b, reason: collision with root package name */
    private float f59827b;

    /* renamed from: c, reason: collision with root package name */
    private float f59828c;

    /* renamed from: d, reason: collision with root package name */
    private float f59829d;

    /* renamed from: e, reason: collision with root package name */
    private final int f59830e;

    public C7541p(float f10, float f11, float f12, float f13) {
        super(null);
        this.f59826a = f10;
        this.f59827b = f11;
        this.f59828c = f12;
        this.f59829d = f13;
        this.f59830e = 4;
    }

    @Override // r.AbstractC7542q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f59826a;
        }
        if (i10 == 1) {
            return this.f59827b;
        }
        if (i10 == 2) {
            return this.f59828c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f59829d;
    }

    @Override // r.AbstractC7542q
    public int b() {
        return this.f59830e;
    }

    @Override // r.AbstractC7542q
    public void d() {
        this.f59826a = 0.0f;
        this.f59827b = 0.0f;
        this.f59828c = 0.0f;
        this.f59829d = 0.0f;
    }

    @Override // r.AbstractC7542q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f59826a = f10;
            return;
        }
        if (i10 == 1) {
            this.f59827b = f10;
        } else if (i10 == 2) {
            this.f59828c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f59829d = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7541p) {
            C7541p c7541p = (C7541p) obj;
            if (c7541p.f59826a == this.f59826a && c7541p.f59827b == this.f59827b && c7541p.f59828c == this.f59828c && c7541p.f59829d == this.f59829d) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f59826a;
    }

    public final float g() {
        return this.f59827b;
    }

    public final float h() {
        return this.f59828c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f59826a) * 31) + Float.hashCode(this.f59827b)) * 31) + Float.hashCode(this.f59828c)) * 31) + Float.hashCode(this.f59829d);
    }

    public final float i() {
        return this.f59829d;
    }

    @Override // r.AbstractC7542q
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C7541p c() {
        return new C7541p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f59826a + ", v2 = " + this.f59827b + ", v3 = " + this.f59828c + ", v4 = " + this.f59829d;
    }
}
