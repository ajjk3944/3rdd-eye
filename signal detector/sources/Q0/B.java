package q0;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22908a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22909b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22910c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22911d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22912e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22913f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22914g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22915h;
    public final int i;

    public B(boolean z6, boolean z7, int i, boolean z8, boolean z9, int i3, int i6, int i7, int i8) {
        this.f22908a = z6;
        this.f22909b = z7;
        this.f22910c = i;
        this.f22911d = z8;
        this.f22912e = z9;
        this.f22913f = i3;
        this.f22914g = i6;
        this.f22915h = i7;
        this.i = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !B.class.equals(obj.getClass())) {
            return false;
        }
        B b5 = (B) obj;
        return this.f22908a == b5.f22908a && this.f22909b == b5.f22909b && this.f22910c == b5.f22910c && this.f22911d == b5.f22911d && this.f22912e == b5.f22912e && this.f22913f == b5.f22913f && this.f22914g == b5.f22914g && this.f22915h == b5.f22915h && this.i == b5.i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f22908a ? 1 : 0) * 31) + (this.f22909b ? 1 : 0)) * 31) + this.f22910c) * 961) + (this.f22911d ? 1 : 0)) * 31) + (this.f22912e ? 1 : 0)) * 31) + this.f22913f) * 31) + this.f22914g) * 31) + this.f22915h) * 31) + this.i;
    }
}
