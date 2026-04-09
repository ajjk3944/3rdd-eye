package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;

/* loaded from: classes3.dex */
public final class ze0 implements w40 {

    /* renamed from: a, reason: collision with root package name */
    private final yw1 f36435a;

    /* renamed from: b, reason: collision with root package name */
    private String f36436b;

    /* renamed from: c, reason: collision with root package name */
    private n52 f36437c;

    /* renamed from: d, reason: collision with root package name */
    private a f36438d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36439e;

    /* renamed from: l, reason: collision with root package name */
    private long f36445l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f36440f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final t31 f36441g = new t31(32);

    /* renamed from: h, reason: collision with root package name */
    private final t31 f36442h = new t31(33);
    private final t31 i = new t31(34);

    /* renamed from: j, reason: collision with root package name */
    private final t31 f36443j = new t31(39);

    /* renamed from: k, reason: collision with root package name */
    private final t31 f36444k = new t31(40);

    /* renamed from: m, reason: collision with root package name */
    private long f36446m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final uf1 f36447n = new uf1();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final n52 f36448a;

        /* renamed from: b, reason: collision with root package name */
        private long f36449b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f36450c;

        /* renamed from: d, reason: collision with root package name */
        private int f36451d;

        /* renamed from: e, reason: collision with root package name */
        private long f36452e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f36453f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f36454g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f36455h;
        private boolean i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f36456j;

        /* renamed from: k, reason: collision with root package name */
        private long f36457k;

        /* renamed from: l, reason: collision with root package name */
        private long f36458l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f36459m;

        public a(n52 n52Var) {
            this.f36448a = n52Var;
        }
    }

    public ze0(yw1 yw1Var) {
        this.f36435a = yw1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    @Override // com.yandex.mobile.ads.impl.w40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.uf1 r43) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ze0.a(com.yandex.mobile.ads.impl.uf1):void");
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        dVar.a();
        this.f36436b = dVar.b();
        n52 n52VarA = w70Var.a(dVar.c(), 2);
        this.f36437c = n52VarA;
        this.f36438d = new a(n52VarA);
        this.f36435a.a(w70Var, dVar);
    }

    private void a(byte[] bArr, int i, int i10) {
        a aVar = this.f36438d;
        if (aVar.f36453f) {
            int i11 = aVar.f36451d;
            int i12 = (i + 2) - i11;
            if (i12 < i10) {
                aVar.f36454g = (bArr[i12] & 128) != 0;
                aVar.f36453f = false;
            } else {
                aVar.f36451d = (i10 - i) + i11;
            }
        }
        if (!this.f36439e) {
            this.f36441g.a(bArr, i, i10);
            this.f36442h.a(bArr, i, i10);
            this.i.a(bArr, i, i10);
        }
        this.f36443j.a(bArr, i, i10);
        this.f36444k.a(bArr, i, i10);
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f36446m = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        this.f36445l = 0L;
        this.f36446m = -9223372036854775807L;
        u31.a(this.f36440f);
        this.f36441g.b();
        this.f36442h.b();
        this.i.b();
        this.f36443j.b();
        this.f36444k.b();
        a aVar = this.f36438d;
        if (aVar != null) {
            aVar.f36453f = false;
            aVar.f36454g = false;
            aVar.f36455h = false;
            aVar.i = false;
            aVar.f36456j = false;
        }
    }
}
