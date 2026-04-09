package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class E2 implements J2 {

    /* renamed from: a, reason: collision with root package name */
    public final I2 f7871a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7872b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7873c;

    /* renamed from: d, reason: collision with root package name */
    public final L2 f7874d;

    /* renamed from: e, reason: collision with root package name */
    public int f7875e;

    /* renamed from: f, reason: collision with root package name */
    public long f7876f;

    /* renamed from: g, reason: collision with root package name */
    public long f7877g;

    /* renamed from: h, reason: collision with root package name */
    public long f7878h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f7879j;

    /* renamed from: k, reason: collision with root package name */
    public long f7880k;

    /* renamed from: l, reason: collision with root package name */
    public long f7881l;

    public E2(L2 l2, long j6, long j7, long j8, long j9, boolean z6) {
        AbstractC0582Jp.m(j6 >= 0 && j7 > j6);
        this.f7874d = l2;
        this.f7872b = j6;
        this.f7873c = j7;
        if (j8 == j7 - j6 || z6) {
            this.f7876f = j9;
            this.f7875e = 4;
        } else {
            this.f7875e = 0;
        }
        this.f7871a = new I2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.google.android.gms.internal.ads.J2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(com.google.android.gms.internal.ads.InterfaceC2046w0 r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.E2.b(com.google.android.gms.internal.ads.w0):long");
    }

    @Override // com.google.android.gms.internal.ads.J2
    public final void e(long j6) {
        long j7 = this.f7876f - 1;
        String str = Vt.f12096a;
        this.f7878h = Math.max(0L, Math.min(j6, j7));
        this.f7875e = 2;
        this.i = this.f7872b;
        this.f7879j = this.f7873c;
        this.f7880k = 0L;
        this.f7881l = this.f7876f;
    }

    @Override // com.google.android.gms.internal.ads.J2
    public final /* bridge */ /* synthetic */ L0 f() {
        if (this.f7876f != 0) {
            return new D2(this);
        }
        return null;
    }
}
