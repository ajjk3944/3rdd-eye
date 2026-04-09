package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.c72;
import com.yandex.mobile.ads.impl.u31;

/* loaded from: classes3.dex */
public final class ye0 implements w40 {

    /* renamed from: a, reason: collision with root package name */
    private final yw1 f35728a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35729b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35730c;

    /* renamed from: g, reason: collision with root package name */
    private long f35734g;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private n52 f35736j;

    /* renamed from: k, reason: collision with root package name */
    private a f35737k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f35738l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f35740n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f35735h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final t31 f35731d = new t31(7);

    /* renamed from: e, reason: collision with root package name */
    private final t31 f35732e = new t31(8);

    /* renamed from: f, reason: collision with root package name */
    private final t31 f35733f = new t31(6);

    /* renamed from: m, reason: collision with root package name */
    private long f35739m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final uf1 f35741o = new uf1();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final n52 f35742a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f35743b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f35744c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<u31.c> f35745d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<u31.b> f35746e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        private final vf1 f35747f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f35748g;

        /* renamed from: h, reason: collision with root package name */
        private int f35749h;
        private int i;

        /* renamed from: j, reason: collision with root package name */
        private long f35750j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f35751k;

        /* renamed from: l, reason: collision with root package name */
        private long f35752l;

        /* renamed from: m, reason: collision with root package name */
        private C0426a f35753m;

        /* renamed from: n, reason: collision with root package name */
        private C0426a f35754n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f35755o;

        /* renamed from: p, reason: collision with root package name */
        private long f35756p;

        /* renamed from: q, reason: collision with root package name */
        private long f35757q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f35758r;

        /* renamed from: com.yandex.mobile.ads.impl.ye0$a$a, reason: collision with other inner class name */
        public static final class C0426a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f35759a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f35760b;

            /* renamed from: c, reason: collision with root package name */
            private u31.c f35761c;

            /* renamed from: d, reason: collision with root package name */
            private int f35762d;

            /* renamed from: e, reason: collision with root package name */
            private int f35763e;

            /* renamed from: f, reason: collision with root package name */
            private int f35764f;

            /* renamed from: g, reason: collision with root package name */
            private int f35765g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f35766h;
            private boolean i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f35767j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f35768k;

            /* renamed from: l, reason: collision with root package name */
            private int f35769l;

            /* renamed from: m, reason: collision with root package name */
            private int f35770m;

            /* renamed from: n, reason: collision with root package name */
            private int f35771n;

            /* renamed from: o, reason: collision with root package name */
            private int f35772o;

            /* renamed from: p, reason: collision with root package name */
            private int f35773p;

            public /* synthetic */ C0426a(int i) {
                this();
            }

            private C0426a() {
            }
        }

        public a(n52 n52Var, boolean z10, boolean z11) {
            this.f35742a = n52Var;
            this.f35743b = z10;
            this.f35744c = z11;
            int i = 0;
            this.f35753m = new C0426a(i);
            this.f35754n = new C0426a(i);
            byte[] bArr = new byte[128];
            this.f35748g = bArr;
            this.f35747f = new vf1(bArr, 0, 0);
            a();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(byte[] r17, int r18, int r19) {
            /*
                Method dump skipped, instructions count: 444
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ye0.a.a(byte[], int, int):void");
        }

        public final void a() {
            this.f35751k = false;
            this.f35755o = false;
            C0426a c0426a = this.f35754n;
            c0426a.f35760b = false;
            c0426a.f35759a = false;
        }
    }

    public ye0(yw1 yw1Var, boolean z10, boolean z11) {
        this.f35728a = yw1Var;
        this.f35729b = z10;
        this.f35730c = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    @Override // com.yandex.mobile.ads.impl.w40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.uf1 r29) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ye0.a(com.yandex.mobile.ads.impl.uf1):void");
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(w70 w70Var, c72.d dVar) {
        dVar.a();
        this.i = dVar.b();
        n52 n52VarA = w70Var.a(dVar.c(), 2);
        this.f35736j = n52VarA;
        this.f35737k = new a(n52VarA, this.f35729b, this.f35730c);
        this.f35728a.a(w70Var, dVar);
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a(int i, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f35739m = j4;
        }
        this.f35740n = ((i & 2) != 0) | this.f35740n;
    }

    @Override // com.yandex.mobile.ads.impl.w40
    public final void a() {
        this.f35734g = 0L;
        this.f35740n = false;
        this.f35739m = -9223372036854775807L;
        u31.a(this.f35735h);
        this.f35731d.b();
        this.f35732e.b();
        this.f35733f.b();
        a aVar = this.f35737k;
        if (aVar != null) {
            aVar.a();
        }
    }
}
