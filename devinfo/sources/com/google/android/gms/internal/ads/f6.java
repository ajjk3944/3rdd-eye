package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f6 implements j6 {

    /* renamed from: a, reason: collision with root package name */
    public final i6 f11008a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11009b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11010c;

    /* renamed from: d, reason: collision with root package name */
    public final l6 f11011d;

    /* renamed from: e, reason: collision with root package name */
    public int f11012e;

    /* renamed from: f, reason: collision with root package name */
    public long f11013f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f11014h;

    /* renamed from: i, reason: collision with root package name */
    public long f11015i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f11016k;

    /* renamed from: l, reason: collision with root package name */
    public long f11017l;

    public f6(l6 l6Var, long j, long j8, long j9, long j10, boolean z3) {
        mq0.m(j >= 0 && j8 > j);
        this.f11011d = l6Var;
        this.f11009b = j;
        this.f11010c = j8;
        if (j9 == j8 - j || z3) {
            this.f11013f = j10;
            this.f11012e = 4;
        } else {
            this.f11012e = 0;
        }
        this.f11008a = new i6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.google.android.gms.internal.ads.j6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(com.google.android.gms.internal.ads.y1 r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f6.c(com.google.android.gms.internal.ads.y1):long");
    }

    @Override // com.google.android.gms.internal.ads.j6
    public final void h(long j) {
        long j8 = this.f11013f - 1;
        String str = bq0.f9768a;
        this.f11014h = Math.max(0L, Math.min(j, j8));
        this.f11012e = 2;
        this.f11015i = this.f11009b;
        this.j = this.f11010c;
        this.f11016k = 0L;
        this.f11017l = this.f11013f;
    }

    @Override // com.google.android.gms.internal.ads.j6
    /* renamed from: zzc */
    public final /* bridge */ /* synthetic */ m2 mo173zzc() {
        if (this.f11013f != 0) {
            return new e6(this);
        }
        return null;
    }
}
