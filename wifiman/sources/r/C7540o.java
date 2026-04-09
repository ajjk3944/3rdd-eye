package r;

/* renamed from: r.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7540o extends AbstractC7542q {

    /* renamed from: a, reason: collision with root package name */
    private float f59770a;

    /* renamed from: b, reason: collision with root package name */
    private float f59771b;

    /* renamed from: c, reason: collision with root package name */
    private float f59772c;

    /* renamed from: d, reason: collision with root package name */
    private final int f59773d;

    public C7540o(float f10, float f11, float f12) {
        super(null);
        this.f59770a = f10;
        this.f59771b = f11;
        this.f59772c = f12;
        this.f59773d = 3;
    }

    @Override // r.AbstractC7542q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f59770a;
        }
        if (i10 == 1) {
            return this.f59771b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f59772c;
    }

    @Override // r.AbstractC7542q
    public int b() {
        return this.f59773d;
    }

    @Override // r.AbstractC7542q
    public void d() {
        this.f59770a = 0.0f;
        this.f59771b = 0.0f;
        this.f59772c = 0.0f;
    }

    @Override // r.AbstractC7542q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f59770a = f10;
        } else if (i10 == 1) {
            this.f59771b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f59772c = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7540o) {
            C7540o c7540o = (C7540o) obj;
            if (c7540o.f59770a == this.f59770a && c7540o.f59771b == this.f59771b && c7540o.f59772c == this.f59772c) {
                return true;
            }
        }
        return false;
    }

    @Override // r.AbstractC7542q
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C7540o c() {
        return new C7540o(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f59770a) * 31) + Float.hashCode(this.f59771b)) * 31) + Float.hashCode(this.f59772c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f59770a + ", v2 = " + this.f59771b + ", v3 = " + this.f59772c;
    }
}
