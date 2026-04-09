package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class we0 implements w40 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f34923q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f34924a;

    /* renamed from: b, reason: collision with root package name */
    private n52 f34925b;

    /* renamed from: c, reason: collision with root package name */
    private final r82 f34926c;

    /* renamed from: d, reason: collision with root package name */
    private final uf1 f34927d;

    /* renamed from: e, reason: collision with root package name */
    private final t31 f34928e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f34929f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    private final a f34930g = new a();

    /* renamed from: h, reason: collision with root package name */
    private long f34931h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f34932j;

    /* renamed from: k, reason: collision with root package name */
    private long f34933k;

    /* renamed from: l, reason: collision with root package name */
    private long f34934l;

    /* renamed from: m, reason: collision with root package name */
    private long f34935m;

    /* renamed from: n, reason: collision with root package name */
    private long f34936n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f34937o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f34938p;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f34939e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f34940a;

        /* renamed from: b, reason: collision with root package name */
        public int f34941b;

        /* renamed from: c, reason: collision with root package name */
        public int f34942c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f34943d = new byte[128];

        public final void a(byte[] bArr, int i, int i10) {
            if (this.f34940a) {
                int i11 = i10 - i;
                byte[] bArr2 = this.f34943d;
                int length = bArr2.length;
                int i12 = this.f34941b + i11;
                if (length < i12) {
                    this.f34943d = Arrays.copyOf(bArr2, i12 * 2);
                }
                System.arraycopy(bArr, i, this.f34943d, this.f34941b, i11);
                this.f34941b += i11;
            }
        }
    }

    public we0(r82 r82Var) {
        this.f34926c = r82Var;
        if (r82Var != null) {
            this.f34928e = new t31(178);
            this.f34927d = new uf1();
        } else {
            this.f34928e = null;
            this.f34927d = null;
        }
        this.f34934l = -9223372036854775807L;
        this.f34936n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0219  */
    @Override // com.yandex.mobile.ads.impl.w40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.uf1 r30) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.we0.a(com.yandex.mobile.ads.impl.uf1):void");
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        dVar.a();
        this.f34924a = dVar.b();
        this.f34925b = w70Var.a(dVar.c(), 2);
        r82 r82Var = this.f34926c;
        if (r82Var != null) {
            r82Var.a(w70Var, dVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        this.f34934l = j4;
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        u31.a(this.f34929f);
        a aVar = this.f34930g;
        aVar.f34940a = false;
        aVar.f34941b = 0;
        aVar.f34942c = 0;
        t31 t31Var = this.f34928e;
        if (t31Var != null) {
            t31Var.b();
        }
        this.f34931h = 0L;
        this.i = false;
        this.f34934l = -9223372036854775807L;
        this.f34936n = -9223372036854775807L;
    }
}
