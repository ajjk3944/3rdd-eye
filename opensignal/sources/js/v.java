package js;

/* loaded from: classes.dex */
public final class v {
    public static final v k = new v(false, false, false, false, false, new v(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13829a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13830b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13831c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13832d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13833e;

    /* renamed from: f, reason: collision with root package name */
    public final v f13834f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13835g;

    /* renamed from: h, reason: collision with root package name */
    public final v f13836h;

    /* renamed from: i, reason: collision with root package name */
    public final v f13837i;
    public final boolean j;

    public v(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, v vVar, boolean z15, v vVar2, v vVar3, int i10) {
        z10 = (i10 & 1) != 0 ? true : z10;
        z11 = (i10 & 2) != 0 ? true : z11;
        z12 = (i10 & 4) != 0 ? false : z12;
        z13 = (i10 & 8) != 0 ? false : z13;
        z14 = (i10 & 16) != 0 ? false : z14;
        vVar = (i10 & 32) != 0 ? null : vVar;
        z15 = (i10 & 64) != 0 ? true : z15;
        vVar2 = (i10 & 128) != 0 ? vVar : vVar2;
        vVar3 = (i10 & 256) != 0 ? vVar : vVar3;
        boolean z16 = (i10 & 512) == 0;
        this.f13829a = z10;
        this.f13830b = z11;
        this.f13831c = z12;
        this.f13832d = z13;
        this.f13833e = z14;
        this.f13834f = vVar;
        this.f13835g = z15;
        this.f13836h = vVar2;
        this.f13837i = vVar3;
        this.j = z16;
    }
}
