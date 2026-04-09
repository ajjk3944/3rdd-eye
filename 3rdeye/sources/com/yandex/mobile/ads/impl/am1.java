package com.yandex.mobile.ads.impl;

import android.os.Looper;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.ov;
import com.yandex.mobile.ads.impl.xl1;
import com.yandex.mobile.ads.impl.xv0;
import com.yandex.mobile.ads.impl.yl1;

/* loaded from: classes3.dex */
public final class am1 extends jk implements yl1.b {

    /* renamed from: h, reason: collision with root package name */
    private final xv0 f24724h;
    private final xv0.f i;

    /* renamed from: j, reason: collision with root package name */
    private final ov.a f24725j;

    /* renamed from: k, reason: collision with root package name */
    private final xl1.a f24726k;

    /* renamed from: l, reason: collision with root package name */
    private final d40 f24727l;

    /* renamed from: m, reason: collision with root package name */
    private final qr0 f24728m;

    /* renamed from: n, reason: collision with root package name */
    private final int f24729n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f24730o;

    /* renamed from: p, reason: collision with root package name */
    private long f24731p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f24732q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f24733r;

    /* renamed from: s, reason: collision with root package name */
    private q62 f24734s;

    public static final class a implements jw0.a {

        /* renamed from: a, reason: collision with root package name */
        private final ov.a f24735a;

        /* renamed from: b, reason: collision with root package name */
        private xl1.a f24736b;

        /* renamed from: c, reason: collision with root package name */
        private e40 f24737c;

        /* renamed from: d, reason: collision with root package name */
        private qr0 f24738d;

        public a(ov.a aVar, y70 y70Var) {
            this(aVar, new U1(y70Var, 3));
        }

        public final am1 a(xv0 xv0Var) {
            xv0Var.f35439c.getClass();
            Object obj = xv0Var.f35439c.f35492g;
            return new am1(xv0Var, this.f24735a, this.f24736b, this.f24737c.a(xv0Var), this.f24738d);
        }

        public a(ov.a aVar, xl1.a aVar2) {
            this(aVar, aVar2, new oz(), new yz());
        }

        public a(ov.a aVar, xl1.a aVar2, oz ozVar, yz yzVar) {
            this.f24735a = aVar;
            this.f24736b = aVar2;
            this.f24737c = ozVar;
            this.f24738d = yzVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ xl1 a(y70 y70Var, gi1 gi1Var) {
            return new hm(y70Var);
        }
    }

    public /* synthetic */ am1(xv0 xv0Var, ov.a aVar, xl1.a aVar2, d40 d40Var, qr0 qr0Var) {
        this(xv0Var, aVar, aVar2, d40Var, qr0Var, 1048576);
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final dw0 a(jw0.b bVar, vc vcVar, long j4) {
        ov ovVarA = this.f24725j.a();
        q62 q62Var = this.f24734s;
        if (q62Var != null) {
            ovVarA.a(q62Var);
        }
        return new yl1(this.i.f35486a, ovVarA, this.f24726k.a(c()), this.f24727l, a(bVar), this.f24728m, b(bVar), this, vcVar, this.i.f35490e, this.f24729n);
    }

    @Override // com.yandex.mobile.ads.impl.jk
    public final void e() {
        this.f24727l.release();
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final xv0 getMediaItem() {
        return this.f24724h;
    }

    private am1(xv0 xv0Var, ov.a aVar, xl1.a aVar2, d40 d40Var, qr0 qr0Var, int i) {
        this.i = (xv0.f) zf.a(xv0Var.f35439c);
        this.f24724h = xv0Var;
        this.f24725j = aVar;
        this.f24726k = aVar2;
        this.f24727l = d40Var;
        this.f24728m = qr0Var;
        this.f24729n = i;
        this.f24730o = true;
        this.f24731p = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.mobile.ads.impl.am1, com.yandex.mobile.ads.impl.jk] */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.yandex.mobile.ads.impl.zl1] */
    public final void a(long j4, boolean z10, boolean z11) {
        if (j4 == -9223372036854775807L) {
            j4 = this.f24731p;
        }
        if (!this.f24730o && this.f24731p == j4 && this.f24732q == z10 && this.f24733r == z11) {
            return;
        }
        this.f24731p = j4;
        this.f24732q = z10;
        this.f24733r = z11;
        this.f24730o = false;
        long j10 = this.f24731p;
        ry1 ry1Var = new ry1(j10, j10, this.f24732q, this.f24733r, this.f24724h);
        if (this.f24730o) {
            ry1Var = new zl1(ry1Var);
        }
        a(ry1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.yandex.mobile.ads.impl.am1, com.yandex.mobile.ads.impl.jk] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.yandex.mobile.ads.impl.zl1] */
    @Override // com.yandex.mobile.ads.impl.jk
    public final void a(q62 q62Var) {
        this.f24734s = q62Var;
        this.f24727l.prepare();
        d40 d40Var = this.f24727l;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        d40Var.a(looperMyLooper, c());
        long j4 = this.f24731p;
        ry1 ry1Var = new ry1(j4, j4, this.f24732q, this.f24733r, this.f24724h);
        if (this.f24730o) {
            ry1Var = new zl1(ry1Var);
        }
        a(ry1Var);
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void a(dw0 dw0Var) {
        ((yl1) dw0Var).i();
    }
}
