package E0;

/* renamed from: E0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2647z {

    /* renamed from: c, reason: collision with root package name */
    private float f4004c;

    /* renamed from: d, reason: collision with root package name */
    private float f4005d;

    /* renamed from: e, reason: collision with root package name */
    private float f4006e;

    /* renamed from: f, reason: collision with root package name */
    private float f4007f;

    /* renamed from: g, reason: collision with root package name */
    private float f4008g;

    /* renamed from: a, reason: collision with root package name */
    private float f4002a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    private float f4003b = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f4009h = 8.0f;

    /* renamed from: i, reason: collision with root package name */
    private long f4010i = androidx.compose.ui.graphics.f.f28939b.a();

    public final void a(C2647z c2647z) {
        this.f4002a = c2647z.f4002a;
        this.f4003b = c2647z.f4003b;
        this.f4004c = c2647z.f4004c;
        this.f4005d = c2647z.f4005d;
        this.f4006e = c2647z.f4006e;
        this.f4007f = c2647z.f4007f;
        this.f4008g = c2647z.f4008g;
        this.f4009h = c2647z.f4009h;
        this.f4010i = c2647z.f4010i;
    }

    public final void b(androidx.compose.ui.graphics.c cVar) {
        this.f4002a = cVar.n();
        this.f4003b = cVar.K();
        this.f4004c = cVar.F();
        this.f4005d = cVar.C();
        this.f4006e = cVar.H();
        this.f4007f = cVar.u();
        this.f4008g = cVar.w();
        this.f4009h = cVar.E();
        this.f4010i = cVar.t1();
    }

    public final boolean c(C2647z c2647z) {
        return this.f4002a == c2647z.f4002a && this.f4003b == c2647z.f4003b && this.f4004c == c2647z.f4004c && this.f4005d == c2647z.f4005d && this.f4006e == c2647z.f4006e && this.f4007f == c2647z.f4007f && this.f4008g == c2647z.f4008g && this.f4009h == c2647z.f4009h && androidx.compose.ui.graphics.f.e(this.f4010i, c2647z.f4010i);
    }
}
