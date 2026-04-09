package d5;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final r5.e f6957a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6958b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6959c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6960d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6961e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6962f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6963g;

    /* renamed from: h, reason: collision with root package name */
    public int f6964h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6965i;

    public e(r5.e eVar, int i10, int i11, int i12, int i13) {
        a("bufferForPlaybackMs", i12, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", i13, 0, "0");
        a("minBufferMs", i10, i12, "bufferForPlaybackMs");
        a("minBufferMs", i10, i13, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", i11, i10, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.f6957a = eVar;
        this.f6958b = a5.d0.G(i10);
        this.f6959c = a5.d0.G(i11);
        this.f6960d = a5.d0.G(i12);
        this.f6961e = a5.d0.G(i13);
        this.f6962f = -1;
        this.f6964h = 13107200;
        this.f6963g = a5.d0.G(0);
    }

    public static void a(String str, int i10, int i11, String str2) {
        a5.a.d(str + " cannot be less than " + str2, i10 >= i11);
    }

    public final void b(boolean z10) {
        int i10 = this.f6962f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f6964h = i10;
        this.f6965i = false;
        if (z10) {
            r5.e eVar = this.f6957a;
            synchronized (eVar) {
                if (eVar.f21232a) {
                    eVar.a(0);
                }
            }
        }
    }

    public final boolean c(long j, float f10) {
        int i10;
        long j7 = this.f6959c;
        r5.e eVar = this.f6957a;
        synchronized (eVar) {
            i10 = eVar.f21235d * eVar.f21233b;
        }
        boolean z10 = i10 >= this.f6964h;
        long jMin = this.f6958b;
        if (f10 > 1.0f) {
            jMin = Math.min(a5.d0.t(jMin, f10), j7);
        }
        if (j < Math.max(jMin, 500000L)) {
            this.f6965i = !z10;
            if (z10 && j < 500000) {
                a5.a.B("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j7 || z10) {
            this.f6965i = false;
        }
        return this.f6965i;
    }
}
