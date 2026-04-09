package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.AdError;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.d40;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.mz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class nz implements d40 {

    /* renamed from: b, reason: collision with root package name */
    private final UUID f31061b;

    /* renamed from: c, reason: collision with root package name */
    private final g60.c f31062c;

    /* renamed from: d, reason: collision with root package name */
    private final pv0 f31063d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f31064e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f31065f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f31066g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f31067h;
    private final f i;

    /* renamed from: j, reason: collision with root package name */
    private final qr0 f31068j;

    /* renamed from: k, reason: collision with root package name */
    private final g f31069k;

    /* renamed from: l, reason: collision with root package name */
    private final long f31070l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f31071m;

    /* renamed from: n, reason: collision with root package name */
    private final Set<e> f31072n;

    /* renamed from: o, reason: collision with root package name */
    private final Set<mz> f31073o;

    /* renamed from: p, reason: collision with root package name */
    private int f31074p;

    /* renamed from: q, reason: collision with root package name */
    private g60 f31075q;

    /* renamed from: r, reason: collision with root package name */
    private mz f31076r;

    /* renamed from: s, reason: collision with root package name */
    private mz f31077s;

    /* renamed from: t, reason: collision with root package name */
    private Looper f31078t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f31079u;

    /* renamed from: v, reason: collision with root package name */
    private int f31080v;

    /* renamed from: w, reason: collision with root package name */
    private byte[] f31081w;

    /* renamed from: x, reason: collision with root package name */
    private gi1 f31082x;

    /* renamed from: y, reason: collision with root package name */
    volatile c f31083y;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f31087d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f31089f;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f31084a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private UUID f31085b = lm.f30041d;

        /* renamed from: c, reason: collision with root package name */
        private g60.c f31086c = mc0.f30341e;

        /* renamed from: g, reason: collision with root package name */
        private yz f31090g = new yz();

        /* renamed from: e, reason: collision with root package name */
        private int[] f31088e = new int[0];

        /* renamed from: h, reason: collision with root package name */
        private long f31091h = 300000;

        public final a a(boolean z10) {
            this.f31087d = z10;
            return this;
        }

        public final a b(boolean z10) {
            this.f31089f = z10;
            return this;
        }

        public final a a(int... iArr) {
            for (int i : iArr) {
                if (i != 2 && i != 1) {
                    throw new IllegalArgumentException();
                }
            }
            this.f31088e = (int[]) iArr.clone();
            return this;
        }

        public final a a(UUID uuid, g60.c cVar) {
            uuid.getClass();
            this.f31085b = uuid;
            cVar.getClass();
            this.f31086c = cVar;
            return this;
        }

        public final nz a(jh0 jh0Var) {
            return new nz(this.f31085b, this.f31086c, jh0Var, this.f31084a, this.f31087d, this.f31088e, this.f31089f, this.f31090g, this.f31091h, 0);
        }
    }

    public class b implements g60.b {
        public /* synthetic */ b(nz nzVar, int i) {
            this();
        }

        private b() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator it = nz.this.f31071m.iterator();
            while (it.hasNext()) {
                mz mzVar = (mz) it.next();
                if (mzVar.a(bArr)) {
                    mzVar.a(message.what);
                    return;
                }
            }
        }
    }

    public static final class d extends Exception {
        public /* synthetic */ d(UUID uuid, int i) {
            this(uuid);
        }

        private d(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public class e implements d40.b {

        /* renamed from: b, reason: collision with root package name */
        private final c40.a f31094b;

        /* renamed from: c, reason: collision with root package name */
        private b40 f31095c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f31096d;

        public e(c40.a aVar) {
            this.f31094b = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.d40.b
        public final void release() {
            Handler handler = nz.this.f31079u;
            handler.getClass();
            s82.a(handler, (Runnable) new P0(this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(dc0 dc0Var) {
            nz nzVar = nz.this;
            if (nzVar.f31074p == 0 || this.f31096d) {
                return;
            }
            Looper looper = nzVar.f31078t;
            looper.getClass();
            this.f31095c = nz.o(nzVar, looper, this.f31094b, dc0Var);
            nz.this.f31072n.add(this);
        }

        public final void a(dc0 dc0Var) {
            Handler handler = nz.this.f31079u;
            handler.getClass();
            handler.post(new V1(1, this, dc0Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (this.f31096d) {
                return;
            }
            b40 b40Var = this.f31095c;
            if (b40Var != null) {
                b40Var.a(this.f31094b);
            }
            nz.this.f31072n.remove(this);
            this.f31096d = true;
        }
    }

    public class f implements mz.a {

        /* renamed from: a, reason: collision with root package name */
        private final HashSet f31098a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private mz f31099b;

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            this.f31099b = null;
            xj0 xj0VarA = xj0.a((Collection) this.f31098a);
            this.f31098a.clear();
            w72 w72VarA = xj0VarA.listIterator(0);
            while (w72VarA.hasNext()) {
                ((mz) w72VarA.next()).b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Exception exc, boolean z10) {
            this.f31099b = null;
            xj0 xj0VarA = xj0.a((Collection) this.f31098a);
            this.f31098a.clear();
            w72 w72VarA = xj0VarA.listIterator(0);
            while (w72VarA.hasNext()) {
                ((mz) w72VarA.next()).a(exc, z10);
            }
        }

        public final void a(mz mzVar) {
            this.f31098a.add(mzVar);
            if (this.f31099b != null) {
                return;
            }
            this.f31099b = mzVar;
            mzVar.d();
        }
    }

    public class g implements mz.b {
        public /* synthetic */ g(nz nzVar, int i) {
            this();
        }

        public final void b(mz mzVar) {
            nz nzVar = nz.this;
            if (nzVar.f31070l != -9223372036854775807L) {
                nzVar.f31073o.remove(mzVar);
                Handler handler = nz.this.f31079u;
                handler.getClass();
                handler.removeCallbacksAndMessages(mzVar);
            }
        }

        private g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.yandex.mobile.ads.impl.mz r6, int r7) {
            /*
                r5 = this;
                r0 = 1
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r7 != r0) goto L3d
                com.yandex.mobile.ads.impl.nz r0 = com.yandex.mobile.ads.impl.nz.this
                int r3 = com.yandex.mobile.ads.impl.nz.f(r0)
                if (r3 <= 0) goto L3d
                long r3 = com.yandex.mobile.ads.impl.nz.b(r0)
                int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r3 == 0) goto L3d
                java.util.Set r7 = com.yandex.mobile.ads.impl.nz.e(r0)
                r7.add(r6)
                com.yandex.mobile.ads.impl.nz r7 = com.yandex.mobile.ads.impl.nz.this
                android.os.Handler r7 = com.yandex.mobile.ads.impl.nz.k(r7)
                r7.getClass()
                com.yandex.mobile.ads.impl.Z r0 = new com.yandex.mobile.ads.impl.Z
                r1 = 1
                r0.<init>(r6, r1)
                long r1 = android.os.SystemClock.uptimeMillis()
                com.yandex.mobile.ads.impl.nz r3 = com.yandex.mobile.ads.impl.nz.this
                long r3 = com.yandex.mobile.ads.impl.nz.b(r3)
                long r3 = r3 + r1
                r7.postAtTime(r0, r6, r3)
                goto Lac
            L3d:
                if (r7 != 0) goto Lac
                com.yandex.mobile.ads.impl.nz r7 = com.yandex.mobile.ads.impl.nz.this
                java.util.ArrayList r7 = com.yandex.mobile.ads.impl.nz.c(r7)
                r7.remove(r6)
                com.yandex.mobile.ads.impl.nz r7 = com.yandex.mobile.ads.impl.nz.this
                com.yandex.mobile.ads.impl.mz r0 = com.yandex.mobile.ads.impl.nz.h(r7)
                if (r0 != r6) goto L53
                com.yandex.mobile.ads.impl.nz.m(r7)
            L53:
                com.yandex.mobile.ads.impl.mz r0 = com.yandex.mobile.ads.impl.nz.i(r7)
                if (r0 != r6) goto L5c
                com.yandex.mobile.ads.impl.nz.n(r7)
            L5c:
                com.yandex.mobile.ads.impl.nz$f r7 = com.yandex.mobile.ads.impl.nz.a(r7)
                java.util.HashSet r0 = com.yandex.mobile.ads.impl.nz.f.a(r7)
                r0.remove(r6)
                com.yandex.mobile.ads.impl.mz r0 = com.yandex.mobile.ads.impl.nz.f.b(r7)
                if (r0 != r6) goto L8f
                r0 = 0
                com.yandex.mobile.ads.impl.nz.f.c(r7, r0)
                java.util.HashSet r0 = com.yandex.mobile.ads.impl.nz.f.a(r7)
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L8f
                java.util.HashSet r0 = com.yandex.mobile.ads.impl.nz.f.a(r7)
                java.util.Iterator r0 = r0.iterator()
                java.lang.Object r0 = r0.next()
                com.yandex.mobile.ads.impl.mz r0 = (com.yandex.mobile.ads.impl.mz) r0
                com.yandex.mobile.ads.impl.nz.f.c(r7, r0)
                r0.d()
            L8f:
                com.yandex.mobile.ads.impl.nz r7 = com.yandex.mobile.ads.impl.nz.this
                long r3 = com.yandex.mobile.ads.impl.nz.b(r7)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto Lac
                android.os.Handler r7 = com.yandex.mobile.ads.impl.nz.k(r7)
                r7.getClass()
                r7.removeCallbacksAndMessages(r6)
                com.yandex.mobile.ads.impl.nz r7 = com.yandex.mobile.ads.impl.nz.this
                java.util.Set r7 = com.yandex.mobile.ads.impl.nz.e(r7)
                r7.remove(r6)
            Lac:
                com.yandex.mobile.ads.impl.nz r6 = com.yandex.mobile.ads.impl.nz.this
                com.yandex.mobile.ads.impl.g60 r7 = com.yandex.mobile.ads.impl.nz.g(r6)
                if (r7 == 0) goto Ldb
                int r7 = com.yandex.mobile.ads.impl.nz.f(r6)
                if (r7 != 0) goto Ldb
                java.util.ArrayList r7 = com.yandex.mobile.ads.impl.nz.c(r6)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto Ldb
                java.util.Set r7 = com.yandex.mobile.ads.impl.nz.d(r6)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto Ldb
                com.yandex.mobile.ads.impl.g60 r7 = com.yandex.mobile.ads.impl.nz.g(r6)
                r7.getClass()
                r7.release()
                com.yandex.mobile.ads.impl.nz.l(r6)
            Ldb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nz.g.a(com.yandex.mobile.ads.impl.mz, int):void");
        }
    }

    public /* synthetic */ nz(UUID uuid, g60.c cVar, jh0 jh0Var, HashMap map, boolean z10, int[] iArr, boolean z11, yz yzVar, long j4, int i) {
        this(uuid, cVar, jh0Var, map, z10, iArr, z11, yzVar, j4);
    }

    public static /* bridge */ /* synthetic */ b40 o(nz nzVar, Looper looper, c40.a aVar, dc0 dc0Var) {
        return nzVar.a(looper, aVar, dc0Var, false);
    }

    @Override // com.yandex.mobile.ads.impl.d40
    public final void prepare() {
        int i = this.f31074p;
        this.f31074p = i + 1;
        if (i != 0) {
            return;
        }
        int i10 = 0;
        if (this.f31075q == null) {
            g60 g60VarA = this.f31062c.a(this.f31061b);
            this.f31075q = g60VarA;
            g60VarA.a(new b(this, i10));
        } else if (this.f31070l != -9223372036854775807L) {
            while (i10 < this.f31071m.size()) {
                ((mz) this.f31071m.get(i10)).b(null);
                i10++;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.d40
    public final void release() {
        int i = this.f31074p - 1;
        this.f31074p = i;
        if (i != 0) {
            return;
        }
        if (this.f31070l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f31071m);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((mz) arrayList.get(i10)).a((c40.a) null);
            }
        }
        Iterator it = zj0.a(this.f31072n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
        if (this.f31075q != null && this.f31074p == 0 && this.f31071m.isEmpty() && this.f31072n.isEmpty()) {
            g60 g60Var = this.f31075q;
            g60Var.getClass();
            g60Var.release();
            this.f31075q = null;
        }
    }

    private nz(UUID uuid, g60.c cVar, jh0 jh0Var, HashMap map, boolean z10, int[] iArr, boolean z11, yz yzVar, long j4) {
        zf.a(uuid);
        zf.a("Use C.CLEARKEY_UUID instead", !lm.f30039b.equals(uuid));
        this.f31061b = uuid;
        this.f31062c = cVar;
        this.f31063d = jh0Var;
        this.f31064e = map;
        this.f31065f = z10;
        this.f31066g = iArr;
        this.f31067h = z11;
        this.f31068j = yzVar;
        this.i = new f();
        this.f31069k = new g(this, 0);
        this.f31080v = 0;
        this.f31071m = new ArrayList();
        this.f31072n = lx1.a();
        this.f31073o = lx1.a();
        this.f31070l = j4;
    }

    private b40 a(Looper looper, c40.a aVar, dc0 dc0Var, boolean z10) {
        ArrayList arrayListA;
        if (this.f31083y == null) {
            this.f31083y = new c(looper);
        }
        a40 a40Var = dc0Var.f26086p;
        int i = 0;
        mz mzVar = null;
        if (a40Var == null) {
            int iC = k01.c(dc0Var.f26083m);
            g60 g60Var = this.f31075q;
            g60Var.getClass();
            if (g60Var.b() != 2 || !lc0.f29968d) {
                int[] iArr = this.f31066g;
                while (true) {
                    if (i >= iArr.length) {
                        break;
                    }
                    if (iArr[i] != iC) {
                        i++;
                    } else if (i != -1 && g60Var.b() != 1) {
                        mz mzVar2 = this.f31076r;
                        if (mzVar2 == null) {
                            mz mzVarA = a(xj0.h(), true, (c40.a) null, z10);
                            this.f31071m.add(mzVarA);
                            this.f31076r = mzVarA;
                        } else {
                            mzVar2.b(null);
                        }
                        return this.f31076r;
                    }
                }
            }
            return null;
        }
        if (this.f31081w == null) {
            arrayListA = a(a40Var, this.f31061b, false);
            if (arrayListA.isEmpty()) {
                d dVar = new d(this.f31061b, i);
                rs0.a("DefaultDrmSessionMgr", "DRM error", dVar);
                if (aVar != null) {
                    aVar.a(dVar);
                }
                return new p50(new b40.a(dVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            arrayListA = null;
        }
        if (this.f31065f) {
            Iterator it = this.f31071m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                mz mzVar3 = (mz) it.next();
                if (s82.a(mzVar3.f30586a, arrayListA)) {
                    mzVar = mzVar3;
                    break;
                }
            }
        } else {
            mzVar = this.f31077s;
        }
        if (mzVar != null) {
            mzVar.b(aVar);
            return mzVar;
        }
        mz mzVarA2 = a((List<a40.b>) arrayListA, false, aVar, z10);
        if (!this.f31065f) {
            this.f31077s = mzVarA2;
        }
        this.f31071m.add(mzVarA2);
        return mzVarA2;
    }

    @Override // com.yandex.mobile.ads.impl.d40
    public final b40 b(c40.a aVar, dc0 dc0Var) {
        if (this.f31074p <= 0) {
            throw new IllegalStateException();
        }
        Looper looper = this.f31078t;
        if (looper != null) {
            return a(looper, aVar, dc0Var, true);
        }
        throw new IllegalStateException();
    }

    private mz a(List<a40.b> list, boolean z10, c40.a aVar) {
        this.f31075q.getClass();
        boolean z11 = this.f31067h | z10;
        UUID uuid = this.f31061b;
        g60 g60Var = this.f31075q;
        f fVar = this.i;
        g gVar = this.f31069k;
        int i = this.f31080v;
        byte[] bArr = this.f31081w;
        HashMap<String, String> map = this.f31064e;
        pv0 pv0Var = this.f31063d;
        Looper looper = this.f31078t;
        looper.getClass();
        qr0 qr0Var = this.f31068j;
        gi1 gi1Var = this.f31082x;
        gi1Var.getClass();
        mz mzVar = new mz(uuid, g60Var, fVar, gVar, list, i, z11, z10, bArr, map, pv0Var, looper, qr0Var, gi1Var);
        mzVar.b(aVar);
        if (this.f31070l != -9223372036854775807L) {
            mzVar.b(null);
        }
        return mzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.mobile.ads.impl.mz a(java.util.List<com.yandex.mobile.ads.impl.a40.b> r10, boolean r11, com.yandex.mobile.ads.impl.c40.a r12, boolean r13) {
        /*
            r9 = this;
            com.yandex.mobile.ads.impl.mz r0 = r9.a(r10, r11, r12)
            int r1 = r0.getState()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 19
            r5 = 0
            r6 = 1
            if (r1 != r6) goto L58
            int r1 = com.yandex.mobile.ads.impl.s82.f32899a
            if (r1 < r4) goto L26
            com.yandex.mobile.ads.impl.b40$a r1 = r0.getError()
            r1.getClass()
            java.lang.Throwable r1 = r1.getCause()
            boolean r1 = r1 instanceof android.media.ResourceBusyException
            if (r1 == 0) goto L58
        L26:
            java.util.Set<com.yandex.mobile.ads.impl.mz> r1 = r9.f31073o
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L58
            java.util.Set<com.yandex.mobile.ads.impl.mz> r1 = r9.f31073o
            com.yandex.mobile.ads.impl.zj0 r1 = com.yandex.mobile.ads.impl.zj0.a(r1)
            com.yandex.mobile.ads.impl.v72 r1 = r1.iterator()
        L38:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L48
            java.lang.Object r7 = r1.next()
            com.yandex.mobile.ads.impl.b40 r7 = (com.yandex.mobile.ads.impl.b40) r7
            r7.a(r5)
            goto L38
        L48:
            r0.a(r12)
            long r7 = r9.f31070l
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 == 0) goto L54
            r0.a(r5)
        L54:
            com.yandex.mobile.ads.impl.mz r0 = r9.a(r10, r11, r12)
        L58:
            int r1 = r0.getState()
            if (r1 != r6) goto Lc8
            int r1 = com.yandex.mobile.ads.impl.s82.f32899a
            if (r1 < r4) goto L71
            com.yandex.mobile.ads.impl.b40$a r1 = r0.getError()
            r1.getClass()
            java.lang.Throwable r1 = r1.getCause()
            boolean r1 = r1 instanceof android.media.ResourceBusyException
            if (r1 == 0) goto Lc8
        L71:
            if (r13 == 0) goto Lc8
            java.util.Set<com.yandex.mobile.ads.impl.nz$e> r13 = r9.f31072n
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto Lc8
            java.util.Set<com.yandex.mobile.ads.impl.nz$e> r13 = r9.f31072n
            com.yandex.mobile.ads.impl.zj0 r13 = com.yandex.mobile.ads.impl.zj0.a(r13)
            com.yandex.mobile.ads.impl.v72 r13 = r13.iterator()
        L85:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r13.next()
            com.yandex.mobile.ads.impl.nz$e r1 = (com.yandex.mobile.ads.impl.nz.e) r1
            r1.release()
            goto L85
        L95:
            java.util.Set<com.yandex.mobile.ads.impl.mz> r13 = r9.f31073o
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto Lb7
            java.util.Set<com.yandex.mobile.ads.impl.mz> r13 = r9.f31073o
            com.yandex.mobile.ads.impl.zj0 r13 = com.yandex.mobile.ads.impl.zj0.a(r13)
            com.yandex.mobile.ads.impl.v72 r13 = r13.iterator()
        La7:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r13.next()
            com.yandex.mobile.ads.impl.b40 r1 = (com.yandex.mobile.ads.impl.b40) r1
            r1.a(r5)
            goto La7
        Lb7:
            r0.a(r12)
            long r6 = r9.f31070l
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 == 0) goto Lc3
            r0.a(r5)
        Lc3:
            com.yandex.mobile.ads.impl.mz r10 = r9.a(r10, r11, r12)
            return r10
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nz.a(java.util.List, boolean, com.yandex.mobile.ads.impl.c40$a, boolean):com.yandex.mobile.ads.impl.mz");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return 0;
     */
    @Override // com.yandex.mobile.ads.impl.d40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.dc0 r7) {
        /*
            r6 = this;
            com.yandex.mobile.ads.impl.g60 r0 = r6.f31075q
            r0.getClass()
            int r0 = r0.b()
            com.yandex.mobile.ads.impl.a40 r1 = r7.f26086p
            r2 = 0
            if (r1 != 0) goto L27
            java.lang.String r7 = r7.f26083m
            int r7 = com.yandex.mobile.ads.impl.k01.c(r7)
            int[] r1 = r6.f31066g
            r3 = r2
        L17:
            int r4 = r1.length
            if (r3 >= r4) goto L26
            r4 = r1[r3]
            if (r4 != r7) goto L23
            r7 = -1
            if (r3 == r7) goto L26
            goto L9a
        L23:
            int r3 = r3 + 1
            goto L17
        L26:
            return r2
        L27:
            byte[] r7 = r6.f31081w
            if (r7 == 0) goto L2c
            goto L9a
        L2c:
            java.util.UUID r7 = r6.f31061b
            r3 = 1
            java.util.ArrayList r7 = a(r1, r7, r3)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L6d
            int r7 = r1.f24432e
            if (r7 != r3) goto L99
            com.yandex.mobile.ads.impl.a40$b r7 = r1.a(r2)
            java.util.UUID r2 = com.yandex.mobile.ads.impl.lm.f30039b
            r7.getClass()
            java.util.UUID r4 = com.yandex.mobile.ads.impl.lm.f30038a
            java.util.UUID r5 = r7.f24434c
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L58
            java.util.UUID r7 = r7.f24434c
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L99
        L58:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r7.<init>(r2)
            java.util.UUID r2 = r6.f31061b
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "DefaultDrmSessionMgr"
            com.yandex.mobile.ads.impl.rs0.d(r2, r7)
        L6d:
            java.lang.String r7 = r1.f24431d
            if (r7 == 0) goto L9a
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L7a
            goto L9a
        L7a:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L89
            int r7 = com.yandex.mobile.ads.impl.s82.f32899a
            r1 = 25
            if (r7 < r1) goto L99
            goto L9a
        L89:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L99
            java.lang.String r1 = "cens"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L9a
        L99:
            return r3
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nz.a(com.yandex.mobile.ads.impl.dc0):int");
    }

    @Override // com.yandex.mobile.ads.impl.d40
    public final d40.b a(c40.a aVar, dc0 dc0Var) {
        if (this.f31074p > 0) {
            if (this.f31078t != null) {
                e eVar = new e(aVar);
                eVar.a(dc0Var);
                return eVar;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void a(byte[] bArr) {
        if (this.f31071m.isEmpty()) {
            this.f31080v = 0;
            this.f31081w = bArr;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.d40
    public final void a(Looper looper, gi1 gi1Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.f31078t;
                if (looper2 == null) {
                    this.f31078t = looper;
                    this.f31079u = new Handler(looper);
                } else if (looper2 == looper) {
                    this.f31079u.getClass();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f31082x = gi1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList a(com.yandex.mobile.ads.impl.a40 r6, java.util.UUID r7, boolean r8) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.f24432e
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r6.f24432e
            if (r1 >= r2) goto L4c
            com.yandex.mobile.ads.impl.a40$b r2 = r6.a(r1)
            r2.getClass()
            java.util.UUID r3 = com.yandex.mobile.ads.impl.lm.f30038a
            java.util.UUID r4 = r2.f24434c
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L40
            java.util.UUID r4 = r2.f24434c
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L26
            goto L40
        L26:
            java.util.UUID r4 = com.yandex.mobile.ads.impl.lm.f30040c
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L49
            java.util.UUID r4 = com.yandex.mobile.ads.impl.lm.f30039b
            java.util.UUID r5 = r2.f24434c
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L40
            java.util.UUID r3 = r2.f24434c
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L49
        L40:
            byte[] r3 = r2.f24437f
            if (r3 != 0) goto L46
            if (r8 == 0) goto L49
        L46:
            r0.add(r2)
        L49:
            int r1 = r1 + 1
            goto L8
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nz.a(com.yandex.mobile.ads.impl.a40, java.util.UUID, boolean):java.util.ArrayList");
    }
}
