package p;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f20037a;

    /* renamed from: b, reason: collision with root package name */
    public int f20038b;

    /* renamed from: c, reason: collision with root package name */
    public int f20039c;

    /* renamed from: d, reason: collision with root package name */
    public int f20040d;

    /* renamed from: e, reason: collision with root package name */
    public int f20041e;

    /* renamed from: f, reason: collision with root package name */
    public int f20042f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20043g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20044h;

    public final void a(int i10, int i11) {
        this.f20039c = i10;
        this.f20040d = i11;
        this.f20044h = true;
        if (this.f20043g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f20037a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f20038b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f20037a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f20038b = i11;
        }
    }
}
