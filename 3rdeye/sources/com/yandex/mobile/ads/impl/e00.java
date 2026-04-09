package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
final class e00 implements td1 {

    /* renamed from: a, reason: collision with root package name */
    private final sd1 f26599a;

    /* renamed from: b, reason: collision with root package name */
    private final long f26600b;

    /* renamed from: c, reason: collision with root package name */
    private final long f26601c;

    /* renamed from: d, reason: collision with root package name */
    private final m22 f26602d;

    /* renamed from: e, reason: collision with root package name */
    private int f26603e;

    /* renamed from: f, reason: collision with root package name */
    private long f26604f;

    /* renamed from: g, reason: collision with root package name */
    private long f26605g;

    /* renamed from: h, reason: collision with root package name */
    private long f26606h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private long f26607j;

    /* renamed from: k, reason: collision with root package name */
    private long f26608k;

    /* renamed from: l, reason: collision with root package name */
    private long f26609l;

    public final class a implements tw1 {
        public /* synthetic */ a(e00 e00Var, int i) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final long c() {
            e00 e00Var = e00.this;
            return e00Var.f26602d.a(e00Var.f26604f);
        }

        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final tw1.a b(long j4) {
            long jB = e00.this.f26602d.b(j4);
            e00 e00Var = e00.this;
            long j10 = e00Var.f26600b;
            long j11 = e00Var.f26601c;
            int i = s82.f32899a;
            vw1 vw1Var = new vw1(j4, Math.max(j10, Math.min(((((j11 - j10) * jB) / e00Var.f26604f) + j10) - 30000, j11 - 1)));
            return new tw1.a(vw1Var, vw1Var);
        }
    }

    public e00(m22 m22Var, long j4, long j10, long j11, long j12, boolean z10) {
        zf.a(j4 >= 0 && j10 > j4);
        this.f26602d = m22Var;
        this.f26600b = j4;
        this.f26601c = j10;
        if (j11 == j10 - j4 || z10) {
            this.f26604f = j12;
            this.f26603e = 4;
        } else {
            this.f26603e = 0;
        }
        this.f26599a = new sd1();
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final tw1 a() {
        if (this.f26604f != 0) {
            return new a(this, 0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    @Override // com.yandex.mobile.ads.impl.td1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.yandex.mobile.ads.impl.rz r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e00.a(com.yandex.mobile.ads.impl.rz):long");
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j4) {
        long j10 = this.f26604f - 1;
        int i = s82.f32899a;
        this.f26606h = Math.max(0L, Math.min(j4, j10));
        this.f26603e = 2;
        this.i = this.f26600b;
        this.f26607j = this.f26601c;
        this.f26608k = 0L;
        this.f26609l = this.f26604f;
    }
}
