package sf;

import pf.g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements o {
    public static final int g;

    /* renamed from: h, reason: collision with root package name */
    public static final vk.h f33566h;

    /* renamed from: a, reason: collision with root package name */
    public final g1 f33567a;

    /* renamed from: b, reason: collision with root package name */
    public final df.d f33568b;

    /* renamed from: c, reason: collision with root package name */
    public final pf.b f33569c;

    /* renamed from: d, reason: collision with root package name */
    public final d f33570d;

    /* renamed from: e, reason: collision with root package name */
    public final n f33571e;

    /* renamed from: f, reason: collision with root package name */
    public final gl.c f33572f;

    static {
        int i4 = wk.a.f36814d;
        g = (int) wk.a.f(com.bumptech.glide.d.D(24, wk.c.HOURS), wk.c.SECONDS);
        f33566h = new vk.h("/");
    }

    public c(g1 g1Var, df.d dVar, pf.b bVar, d dVar2, n nVar) {
        nk.k.e(g1Var, "timeProvider");
        nk.k.e(dVar, "firebaseInstallationsApi");
        nk.k.e(bVar, "appInfo");
        nk.k.e(dVar2, "configsFetcher");
        nk.k.e(nVar, "settingsCache");
        this.f33567a = g1Var;
        this.f33568b = dVar;
        this.f33569c = bVar;
        this.f33570d = dVar2;
        this.f33571e = nVar;
        this.f33572f = gl.d.a();
    }

    @Override // sf.o
    public final Boolean a() {
        return this.f33571e.a().f33576a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00a9, B:45:0x00b3, B:48:0x00bc, B:35:0x0086, B:37:0x008e, B:40:0x0097), top: B:59:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00a9, B:45:0x00b3, B:48:0x00bc, B:35:0x0086, B:37:0x008e, B:40:0x0097), top: B:59:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // sf.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ck.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.c.b(ck.c):java.lang.Object");
    }

    @Override // sf.o
    public final wk.a c() {
        Integer num = this.f33571e.a().f33578c;
        if (num == null) {
            return null;
        }
        int i4 = wk.a.f36814d;
        return new wk.a(com.bumptech.glide.d.D(num.intValue(), wk.c.SECONDS));
    }

    @Override // sf.o
    public final Double d() {
        return this.f33571e.a().f33577b;
    }
}
