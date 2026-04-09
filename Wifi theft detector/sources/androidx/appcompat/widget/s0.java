package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1310a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1311b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1312c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f1313d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f1314e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1315f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1316g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1317h = false;

    public int a() {
        return this.f1316g ? this.f1310a : this.f1311b;
    }

    public int b() {
        return this.f1310a;
    }

    public int c() {
        return this.f1311b;
    }

    public int d() {
        return this.f1316g ? this.f1311b : this.f1310a;
    }

    public void e(int i10, int i11) {
        this.f1317h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1314e = i10;
            this.f1310a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1315f = i11;
            this.f1311b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f1316g) {
            return;
        }
        this.f1316g = z10;
        if (!this.f1317h) {
            this.f1310a = this.f1314e;
            this.f1311b = this.f1315f;
            return;
        }
        if (z10) {
            int i10 = this.f1313d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f1314e;
            }
            this.f1310a = i10;
            int i11 = this.f1312c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f1315f;
            }
            this.f1311b = i11;
            return;
        }
        int i12 = this.f1312c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f1314e;
        }
        this.f1310a = i12;
        int i13 = this.f1313d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f1315f;
        }
        this.f1311b = i13;
    }

    public void g(int i10, int i11) {
        this.f1312c = i10;
        this.f1313d = i11;
        this.f1317h = true;
        if (this.f1316g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1310a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1311b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1310a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1311b = i11;
        }
    }
}
