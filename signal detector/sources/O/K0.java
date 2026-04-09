package o;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    public int f22399a;

    /* renamed from: b, reason: collision with root package name */
    public int f22400b;

    /* renamed from: c, reason: collision with root package name */
    public int f22401c;

    /* renamed from: d, reason: collision with root package name */
    public int f22402d;

    /* renamed from: e, reason: collision with root package name */
    public int f22403e;

    /* renamed from: f, reason: collision with root package name */
    public int f22404f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22405g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22406h;

    public final void a(int i, int i3) {
        this.f22401c = i;
        this.f22402d = i3;
        this.f22406h = true;
        if (this.f22405g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f22399a = i3;
            }
            if (i != Integer.MIN_VALUE) {
                this.f22400b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f22399a = i;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f22400b = i3;
        }
    }
}
