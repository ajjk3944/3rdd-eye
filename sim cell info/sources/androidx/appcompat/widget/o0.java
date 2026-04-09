package androidx.appcompat.widget;

/* loaded from: classes.dex */
class o0 {

    /* renamed from: a, reason: collision with root package name */
    private int f1058a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f1059b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f1060c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f1061d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f1062e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f1063f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1064g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1065h = false;

    o0() {
    }

    public int a() {
        return this.f1064g ? this.f1058a : this.f1059b;
    }

    public int b() {
        return this.f1058a;
    }

    public int c() {
        return this.f1059b;
    }

    public int d() {
        return this.f1064g ? this.f1059b : this.f1058a;
    }

    public void e(int i2, int i3) {
        this.f1065h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f1062e = i2;
            this.f1058a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1063f = i3;
            this.f1059b = i3;
        }
    }

    public void f(boolean z2) {
        int i2;
        if (z2 == this.f1064g) {
            return;
        }
        this.f1064g = z2;
        if (this.f1065h) {
            if (z2) {
                int i3 = this.f1061d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1062e;
                }
                this.f1058a = i3;
                i2 = this.f1060c;
                if (i2 == Integer.MIN_VALUE) {
                }
            } else {
                int i4 = this.f1060c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1062e;
                }
                this.f1058a = i4;
                i2 = this.f1061d;
                if (i2 == Integer.MIN_VALUE) {
                }
            }
            this.f1059b = i2;
        }
        this.f1058a = this.f1062e;
        i2 = this.f1063f;
        this.f1059b = i2;
    }

    public void g(int i2, int i3) {
        this.f1060c = i2;
        this.f1061d = i3;
        this.f1065h = true;
        if (this.f1064g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1058a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1059b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1058a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1059b = i3;
        }
    }
}
