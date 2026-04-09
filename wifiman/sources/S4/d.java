package S4;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f20250a;

    /* renamed from: b, reason: collision with root package name */
    public final a f20251b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20252c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20253d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20254e;

    /* renamed from: f, reason: collision with root package name */
    public final double f20255f;

    /* renamed from: g, reason: collision with root package name */
    public final double f20256g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20257h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20258a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20259b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f20260c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f20258a = z10;
            this.f20259b = z11;
            this.f20260c = z12;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20261a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20262b;

        public b(int i10, int i11) {
            this.f20261a = i10;
            this.f20262b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f20252c = j10;
        this.f20250a = bVar;
        this.f20251b = aVar;
        this.f20253d = i10;
        this.f20254e = i11;
        this.f20255f = d10;
        this.f20256g = d11;
        this.f20257h = i12;
    }

    public boolean a(long j10) {
        return this.f20252c < j10;
    }
}
