package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.v42;

/* loaded from: classes3.dex */
public final class xt0 extends zq<Void> {

    /* renamed from: k, reason: collision with root package name */
    private final jw0 f35410k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f35411l;

    /* renamed from: m, reason: collision with root package name */
    private final v42.d f35412m;

    /* renamed from: n, reason: collision with root package name */
    private final v42.b f35413n;

    /* renamed from: o, reason: collision with root package name */
    private a f35414o;

    /* renamed from: p, reason: collision with root package name */
    private wt0 f35415p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f35416q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f35417r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f35418s;

    public static final class a extends ic0 {

        /* renamed from: f, reason: collision with root package name */
        public static final Object f35419f = new Object();

        /* renamed from: d, reason: collision with root package name */
        private final Object f35420d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f35421e;

        public /* synthetic */ a(v42 v42Var, Object obj, Object obj2, int i) {
            this(v42Var, obj, obj2);
        }

        @Override // com.yandex.mobile.ads.impl.ic0, com.yandex.mobile.ads.impl.v42
        public final int a(Object obj) {
            Object obj2;
            v42 v42Var = this.f28643c;
            if (f35419f.equals(obj) && (obj2 = this.f35421e) != null) {
                obj = obj2;
            }
            return v42Var.a(obj);
        }

        private a(v42 v42Var, Object obj, Object obj2) {
            super(v42Var);
            this.f35420d = obj;
            this.f35421e = obj2;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final v42.b a(int i, v42.b bVar, boolean z10) {
            this.f28643c.a(i, bVar, z10);
            if (s82.a(bVar.f34344c, this.f35421e) && z10) {
                bVar.f34344c = f35419f;
            }
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.ic0, com.yandex.mobile.ads.impl.v42
        public final Object a(int i) {
            Object objA = this.f28643c.a(i);
            return s82.a(objA, this.f35421e) ? f35419f : objA;
        }

        @Override // com.yandex.mobile.ads.impl.ic0, com.yandex.mobile.ads.impl.v42
        public final v42.d a(int i, v42.d dVar, long j4) {
            this.f28643c.a(i, dVar, j4);
            if (s82.a(dVar.f34358b, this.f35420d)) {
                dVar.f34358b = v42.d.f34354s;
            }
            return dVar;
        }

        public static a a(xv0 xv0Var) {
            return new a(new b(xv0Var), v42.d.f34354s, f35419f);
        }
    }

    public static final class b extends v42 {

        /* renamed from: c, reason: collision with root package name */
        private final xv0 f35422c;

        public b(xv0 xv0Var) {
            this.f35422c = xv0Var;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int b() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int a(Object obj) {
            return obj == a.f35419f ? 0 : -1;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final v42.b a(int i, v42.b bVar, boolean z10) {
            bVar.a(z10 ? 0 : null, z10 ? a.f35419f : null, 0, -9223372036854775807L, 0L, C4246z4.f36166h, true);
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final v42.d a(int i, v42.d dVar, long j4) {
            dVar.a(v42.d.f34354s, this.f35422c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f34368m = true;
            return dVar;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final Object a(int i) {
            return a.f35419f;
        }
    }

    public xt0(jw0 jw0Var, boolean z10) {
        boolean z11;
        this.f35410k = jw0Var;
        if (z10) {
            jw0Var.getClass();
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35411l = z11;
        this.f35412m = new v42.d();
        this.f35413n = new v42.b();
        jw0Var.getClass();
        this.f35414o = a.a(jw0Var.getMediaItem());
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wt0 a(jw0.b bVar, vc vcVar, long j4) {
        wt0 wt0Var = new wt0(bVar, vcVar, j4);
        wt0Var.a(this.f35410k);
        if (!this.f35417r) {
            this.f35415p = wt0Var;
            if (!this.f35416q) {
                this.f35416q = true;
                a((xt0) null, this.f35410k);
            }
            return wt0Var;
        }
        Object obj = bVar.f27470a;
        if (this.f35414o.f35421e != null && obj.equals(a.f35419f)) {
            obj = this.f35414o.f35421e;
        }
        wt0Var.a(new jw0.b(bVar.a(obj)));
        return wt0Var;
    }

    @Override // com.yandex.mobile.ads.impl.zq, com.yandex.mobile.ads.impl.jk
    public final void e() {
        this.f35417r = false;
        this.f35416q = false;
        super.e();
    }

    public final v42 f() {
        return this.f35414o;
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final xv0 getMediaItem() {
        return this.f35410k.getMediaItem();
    }

    @Override // com.yandex.mobile.ads.impl.zq
    public final jw0.b a(Void r22, jw0.b bVar) {
        Object obj = bVar.f27470a;
        Object obj2 = this.f35414o.f35421e;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f35419f;
        }
        return new jw0.b(bVar.a(obj));
    }

    @Override // com.yandex.mobile.ads.impl.zq, com.yandex.mobile.ads.impl.jk
    public final void a(q62 q62Var) {
        super.a(q62Var);
        if (this.f35411l) {
            return;
        }
        this.f35416q = true;
        a((xt0) null, this.f35410k);
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void a(dw0 dw0Var) {
        ((wt0) dw0Var).c();
        if (dw0Var == this.f35415p) {
            this.f35415p = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.zq
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Void r12, com.yandex.mobile.ads.impl.jw0 r13, com.yandex.mobile.ads.impl.v42 r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xt0.a(java.lang.Object, com.yandex.mobile.ads.impl.jw0, com.yandex.mobile.ads.impl.v42):void");
    }

    private void a(long j4) {
        wt0 wt0Var = this.f35415p;
        int iA = this.f35414o.a(wt0Var.f35050b.f27470a);
        if (iA == -1) {
            return;
        }
        long j10 = this.f35414o.a(iA, this.f35413n, false).f34346e;
        if (j10 != -9223372036854775807L && j4 >= j10) {
            j4 = Math.max(0L, j10 - 1);
        }
        wt0Var.a(j4);
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
