package p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public int f30769a;

    /* renamed from: b, reason: collision with root package name */
    public int f30770b;

    /* renamed from: c, reason: collision with root package name */
    public int f30771c;

    /* renamed from: d, reason: collision with root package name */
    public int f30772d;

    /* renamed from: e, reason: collision with root package name */
    public int f30773e;

    /* renamed from: f, reason: collision with root package name */
    public int f30774f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30775h;

    public final void a(int i4, int i10) {
        this.f30771c = i4;
        this.f30772d = i10;
        this.f30775h = true;
        if (this.g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f30769a = i10;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f30770b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f30769a = i4;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f30770b = i10;
        }
    }
}
