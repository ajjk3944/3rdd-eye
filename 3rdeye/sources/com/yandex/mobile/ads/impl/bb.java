package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.dc0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class bb implements w40 {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f25154v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25155a;

    /* renamed from: b, reason: collision with root package name */
    private final tf1 f25156b;

    /* renamed from: c, reason: collision with root package name */
    private final uf1 f25157c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25158d;

    /* renamed from: e, reason: collision with root package name */
    private String f25159e;

    /* renamed from: f, reason: collision with root package name */
    private n52 f25160f;

    /* renamed from: g, reason: collision with root package name */
    private n52 f25161g;

    /* renamed from: h, reason: collision with root package name */
    private int f25162h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f25163j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25164k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f25165l;

    /* renamed from: m, reason: collision with root package name */
    private int f25166m;

    /* renamed from: n, reason: collision with root package name */
    private int f25167n;

    /* renamed from: o, reason: collision with root package name */
    private int f25168o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25169p;

    /* renamed from: q, reason: collision with root package name */
    private long f25170q;

    /* renamed from: r, reason: collision with root package name */
    private int f25171r;

    /* renamed from: s, reason: collision with root package name */
    private long f25172s;

    /* renamed from: t, reason: collision with root package name */
    private n52 f25173t;

    /* renamed from: u, reason: collision with root package name */
    private long f25174u;

    public bb() {
        this(null, true);
    }

    private void d() {
        this.f25162h = 0;
        this.i = 0;
        this.f25163j = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0262  */
    @Override // com.yandex.mobile.ads.impl.w40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.uf1 r21) throws com.yandex.mobile.ads.impl.yf1 {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bb.a(com.yandex.mobile.ads.impl.uf1):void");
    }

    public final long c() {
        return this.f25170q;
    }

    public bb(String str, boolean z10) {
        this.f25156b = new tf1(new byte[7]);
        this.f25157c = new uf1(Arrays.copyOf(f25154v, 10));
        d();
        this.f25166m = -1;
        this.f25167n = -1;
        this.f25170q = -9223372036854775807L;
        this.f25172s = -9223372036854775807L;
        this.f25155a = z10;
        this.f25158d = str;
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        dVar.a();
        this.f25159e = dVar.b();
        n52 n52VarA = w70Var.a(dVar.c(), 1);
        this.f25160f = n52VarA;
        this.f25173t = n52VarA;
        if (this.f25155a) {
            dVar.a();
            n52 n52VarA2 = w70Var.a(dVar.c(), 5);
            this.f25161g = n52VarA2;
            n52VarA2.a(new dc0.a().b(dVar.b()).e("application/id3").a());
            return;
        }
        this.f25161g = new m40();
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f25172s = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        this.f25172s = -9223372036854775807L;
        this.f25165l = false;
        d();
    }
}
