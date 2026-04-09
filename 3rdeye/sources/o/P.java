package o;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public int f44581a;

    /* renamed from: b, reason: collision with root package name */
    public int f44582b;

    /* renamed from: c, reason: collision with root package name */
    public int f44583c;

    /* renamed from: d, reason: collision with root package name */
    public int f44584d;

    /* renamed from: e, reason: collision with root package name */
    public int f44585e;

    /* renamed from: f, reason: collision with root package name */
    public int f44586f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f44587g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f44588h;

    public final void a(int i, int i10) {
        this.f44583c = i;
        this.f44584d = i10;
        this.f44588h = true;
        if (this.f44587g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f44581a = i10;
            }
            if (i != Integer.MIN_VALUE) {
                this.f44582b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f44581a = i;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f44582b = i10;
        }
    }
}
