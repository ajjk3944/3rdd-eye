package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.nz;
import com.yandex.mobile.ads.impl.qr0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
final class mz implements b40 {

    /* renamed from: a, reason: collision with root package name */
    public final List<a40.b> f30586a;

    /* renamed from: b, reason: collision with root package name */
    private final g60 f30587b;

    /* renamed from: c, reason: collision with root package name */
    private final a f30588c;

    /* renamed from: d, reason: collision with root package name */
    private final b f30589d;

    /* renamed from: e, reason: collision with root package name */
    private final int f30590e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f30591f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f30592g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f30593h;
    private final ls<c40.a> i;

    /* renamed from: j, reason: collision with root package name */
    private final qr0 f30594j;

    /* renamed from: k, reason: collision with root package name */
    private final gi1 f30595k;

    /* renamed from: l, reason: collision with root package name */
    final pv0 f30596l;

    /* renamed from: m, reason: collision with root package name */
    final UUID f30597m;

    /* renamed from: n, reason: collision with root package name */
    final e f30598n;

    /* renamed from: o, reason: collision with root package name */
    private int f30599o;

    /* renamed from: p, reason: collision with root package name */
    private int f30600p;

    /* renamed from: q, reason: collision with root package name */
    private HandlerThread f30601q;

    /* renamed from: r, reason: collision with root package name */
    private c f30602r;

    /* renamed from: s, reason: collision with root package name */
    private yu f30603s;

    /* renamed from: t, reason: collision with root package name */
    private b40.a f30604t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f30605u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f30606v;

    /* renamed from: w, reason: collision with root package name */
    private g60.a f30607w;

    /* renamed from: x, reason: collision with root package name */
    private g60.d f30608x;

    public interface a {
    }

    public interface b {
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f30609a;

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Throwable thA;
            d dVar = (d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    thA = ((jh0) mz.this.f30596l).a((g60.d) dVar.f30613c);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    mz mzVar = mz.this;
                    thA = ((jh0) mzVar.f30596l).a(mzVar.f30597m, (g60.a) dVar.f30613c);
                }
            } catch (qv0 e4) {
                boolean zA = a(message, e4);
                thA = e4;
                if (zA) {
                    return;
                }
            } catch (Exception e10) {
                rs0.b("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e10);
                thA = e10;
            }
            qr0 qr0Var = mz.this.f30594j;
            long j4 = dVar.f30611a;
            qr0Var.getClass();
            synchronized (this) {
                try {
                    if (!this.f30609a) {
                        mz.this.f30598n.obtainMessage(message.what, Pair.create(dVar.f30613c, thA)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        private boolean a(Message message, qv0 qv0Var) {
            d dVar = (d) message.obj;
            if (!dVar.f30612b) {
                return false;
            }
            int i = dVar.f30614d + 1;
            dVar.f30614d = i;
            if (i > mz.this.f30594j.a(3)) {
                return false;
            }
            SystemClock.elapsedRealtime();
            SystemClock.elapsedRealtime();
            long jA = mz.this.f30594j.a(new qr0.a(qv0Var.getCause() instanceof IOException ? (IOException) qv0Var.getCause() : new f(qv0Var.getCause()), dVar.f30614d));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f30609a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jA);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f30611a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f30612b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f30613c;

        /* renamed from: d, reason: collision with root package name */
        public int f30614d;

        public d(long j4, boolean z10, long j10, Object obj) {
            this.f30611a = j4;
            this.f30612b = z10;
            this.f30613c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                mz.this.a(obj, obj2);
                return;
            }
            mz mzVar = mz.this;
            if (obj == mzVar.f30608x) {
                if (mzVar.f30599o == 2 || mzVar.a()) {
                    mzVar.f30608x = null;
                    if (obj2 instanceof Exception) {
                        ((nz.f) mzVar.f30588c).a((Exception) obj2, false);
                        return;
                    }
                    try {
                        mzVar.f30587b.c((byte[]) obj2);
                        ((nz.f) mzVar.f30588c).a();
                    } catch (Exception e4) {
                        ((nz.f) mzVar.f30588c).a(e4, true);
                    }
                }
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public mz(UUID uuid, g60 g60Var, a aVar, b bVar, List<a40.b> list, int i, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> map, pv0 pv0Var, Looper looper, qr0 qr0Var, gi1 gi1Var) {
        if (i == 1 || i == 3) {
            zf.a(bArr);
        }
        this.f30597m = uuid;
        this.f30588c = aVar;
        this.f30589d = bVar;
        this.f30587b = g60Var;
        this.f30590e = i;
        this.f30591f = z10;
        this.f30592g = z11;
        if (bArr != null) {
            this.f30606v = bArr;
            this.f30586a = null;
        } else {
            this.f30586a = Collections.unmodifiableList((List) zf.a(list));
        }
        this.f30593h = map;
        this.f30596l = pv0Var;
        this.i = new ls<>();
        this.f30594j = qr0Var;
        this.f30595k = gi1Var;
        this.f30599o = 2;
        this.f30598n = new e(looper);
    }

    private void a(sr<c40.a> srVar) {
        Iterator<c40.a> it = this.i.a().iterator();
        while (it.hasNext()) {
            srVar.accept(it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final yu getCryptoConfig() {
        return this.f30603s;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final b40.a getError() {
        if (this.f30599o == 1) {
            return this.f30604t;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final UUID getSchemeUuid() {
        return this.f30597m;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final int getState() {
        return this.f30599o;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final boolean playClearSamplesWithoutKeys() {
        return this.f30591f;
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final Map<String, String> queryKeyStatus() {
        byte[] bArr = this.f30605u;
        if (bArr == null) {
            return null;
        }
        return this.f30587b.a(bArr);
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final boolean requiresSecureDecoder(String str) {
        g60 g60Var = this.f30587b;
        byte[] bArr = this.f30605u;
        if (bArr != null) {
            return g60Var.a(str, bArr);
        }
        throw new IllegalStateException();
    }

    private boolean c() {
        if (a()) {
            return true;
        }
        try {
            byte[] bArrC = this.f30587b.c();
            this.f30605u = bArrC;
            this.f30587b.a(bArrC, this.f30595k);
            this.f30603s = this.f30587b.d(this.f30605u);
            this.f30599o = 3;
            a(new L2(0));
            this.f30605u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ((nz.f) this.f30588c).a(this);
            return false;
        } catch (Exception e4) {
            a(1, e4);
            return false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final void b(c40.a aVar) {
        if (this.f30600p < 0) {
            rs0.b("DefaultDrmSession", "Session reference count less than zero: " + this.f30600p);
            this.f30600p = 0;
        }
        if (aVar != null) {
            this.i.a(aVar);
        }
        int i = this.f30600p + 1;
        this.f30600p = i;
        if (i == 1) {
            if (this.f30599o != 2) {
                throw new IllegalStateException();
            }
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f30601q = handlerThread;
            handlerThread.start();
            this.f30602r = new c(this.f30601q.getLooper());
            if (c()) {
                a(true);
            }
        } else if (aVar != null && a() && this.i.b(aVar) == 1) {
            aVar.a(this.f30599o);
        }
        ((nz.g) this.f30589d).b(this);
    }

    public final void d() {
        g60.d dVarA = this.f30587b.a();
        this.f30608x = dVarA;
        c cVar = this.f30602r;
        int i = s82.f32899a;
        dVarA.getClass();
        cVar.getClass();
        cVar.obtainMessage(0, new d(rr0.a(), true, SystemClock.elapsedRealtime(), dVarA)).sendToTarget();
    }

    private void a(boolean z10) {
        long jMin;
        int i = 4;
        if (this.f30592g) {
            return;
        }
        byte[] bArr = this.f30605u;
        int i10 = s82.f32899a;
        int i11 = this.f30590e;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f30606v.getClass();
                this.f30605u.getClass();
                a(this.f30606v, 3, z10);
                return;
            }
            byte[] bArr2 = this.f30606v;
            if (bArr2 != null) {
                try {
                    this.f30587b.a(bArr, bArr2);
                } catch (Exception e4) {
                    a(1, e4);
                    return;
                }
            }
            a(bArr, 2, z10);
            return;
        }
        byte[] bArr3 = this.f30606v;
        if (bArr3 == null) {
            a(bArr, 1, z10);
            return;
        }
        if (this.f30599o != 4) {
            try {
                this.f30587b.a(bArr, bArr3);
            } catch (Exception e10) {
                a(1, e10);
                return;
            }
        }
        if (lm.f30041d.equals(this.f30597m)) {
            Pair<Long, Long> pairA = tj2.a(this);
            pairA.getClass();
            jMin = Math.min(((Long) pairA.first).longValue(), ((Long) pairA.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (this.f30590e == 0 && jMin <= 60) {
            rs0.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            a(bArr, 2, z10);
            return;
        }
        if (jMin <= 0) {
            a(2, new nq0());
        } else {
            this.f30599o = 4;
            a(new E0(i));
        }
    }

    public final void b() {
        if (c()) {
            a(true);
        }
    }

    public final boolean a(byte[] bArr) {
        return Arrays.equals(this.f30605u, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        int i = this.f30599o;
        return i == 3 || i == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.f30607w && a()) {
            this.f30607w = null;
            if (obj2 instanceof Exception) {
                Exception exc = (Exception) obj2;
                if (exc instanceof NotProvisionedException) {
                    ((nz.f) this.f30588c).a(this);
                    return;
                } else {
                    a(2, exc);
                    return;
                }
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f30590e == 3) {
                    g60 g60Var = this.f30587b;
                    byte[] bArr2 = this.f30606v;
                    int i = s82.f32899a;
                    g60Var.b(bArr2, bArr);
                    a(new J0(6));
                    return;
                }
                byte[] bArrB = this.f30587b.b(this.f30605u, bArr);
                int i10 = this.f30590e;
                if ((i10 == 2 || (i10 == 0 && this.f30606v != null)) && bArrB != null && bArrB.length != 0) {
                    this.f30606v = bArrB;
                }
                this.f30599o = 4;
                a(new S1(5));
            } catch (Exception e4) {
                if (e4 instanceof NotProvisionedException) {
                    ((nz.f) this.f30588c).a(this);
                } else {
                    a(1, e4);
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 2 && this.f30590e == 0 && this.f30599o == 4) {
            int i10 = s82.f32899a;
            a(false);
        }
    }

    public final void a(Exception exc, boolean z10) {
        a(z10 ? 1 : 3, exc);
    }

    private void a(byte[] bArr, int i, boolean z10) {
        try {
            g60.a aVarA = this.f30587b.a(bArr, this.f30586a, i, this.f30593h);
            this.f30607w = aVarA;
            c cVar = this.f30602r;
            int i10 = s82.f32899a;
            aVarA.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new d(rr0.a(), z10, SystemClock.elapsedRealtime(), aVarA)).sendToTarget();
        } catch (Exception e4) {
            if (e4 instanceof NotProvisionedException) {
                ((nz.f) this.f30588c).a(this);
            } else {
                a(1, e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.b40
    public final void a(c40.a aVar) {
        int i = this.f30600p;
        if (i <= 0) {
            rs0.b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i - 1;
        this.f30600p = i10;
        if (i10 == 0) {
            this.f30599o = 0;
            e eVar = this.f30598n;
            int i11 = s82.f32899a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.f30602r;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.f30609a = true;
            }
            this.f30602r = null;
            this.f30601q.quit();
            this.f30601q = null;
            this.f30603s = null;
            this.f30604t = null;
            this.f30607w = null;
            this.f30608x = null;
            byte[] bArr = this.f30605u;
            if (bArr != null) {
                this.f30587b.b(bArr);
                this.f30605u = null;
            }
        }
        if (aVar != null) {
            this.i.c(aVar);
            if (this.i.b(aVar) == 0) {
                aVar.d();
            }
        }
        ((nz.g) this.f30589d).a(this, this.f30600p);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r6, java.lang.Exception r7) {
        /*
            r5 = this;
            com.yandex.mobile.ads.impl.b40$a r0 = new com.yandex.mobile.ads.impl.b40$a
            int r1 = com.yandex.mobile.ads.impl.s82.f32899a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = com.yandex.mobile.ads.impl.g40.a(r7)
            if (r2 == 0) goto L14
            int r6 = com.yandex.mobile.ads.impl.g40.b(r7)
            goto L5a
        L14:
            r2 = 23
            if (r1 < r2) goto L1f
            boolean r2 = com.yandex.mobile.ads.impl.h40.a(r7)
            if (r2 == 0) goto L1f
            goto L4c
        L1f:
            r2 = 18
            if (r1 < r2) goto L2a
            boolean r4 = com.yandex.mobile.ads.impl.f40.b(r7)
            if (r4 == 0) goto L2a
            goto L58
        L2a:
            if (r1 < r2) goto L35
            boolean r1 = com.yandex.mobile.ads.impl.f40.a(r7)
            if (r1 == 0) goto L35
            r6 = 6007(0x1777, float:8.418E-42)
            goto L5a
        L35:
            boolean r1 = r7 instanceof com.yandex.mobile.ads.impl.y72
            if (r1 == 0) goto L3c
            r6 = 6001(0x1771, float:8.409E-42)
            goto L5a
        L3c:
            boolean r1 = r7 instanceof com.yandex.mobile.ads.impl.nz.d
            if (r1 == 0) goto L43
            r6 = 6003(0x1773, float:8.412E-42)
            goto L5a
        L43:
            boolean r1 = r7 instanceof com.yandex.mobile.ads.impl.nq0
            if (r1 == 0) goto L4a
            r6 = 6008(0x1778, float:8.419E-42)
            goto L5a
        L4a:
            if (r6 != r3) goto L4f
        L4c:
            r6 = 6006(0x1776, float:8.416E-42)
            goto L5a
        L4f:
            r1 = 2
            if (r6 != r1) goto L55
            r6 = 6004(0x1774, float:8.413E-42)
            goto L5a
        L55:
            r1 = 3
            if (r6 != r1) goto L77
        L58:
            r6 = 6002(0x1772, float:8.41E-42)
        L5a:
            r0.<init>(r7, r6)
            r5.f30604t = r0
            java.lang.String r6 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            com.yandex.mobile.ads.impl.rs0.a(r6, r0, r7)
            com.yandex.mobile.ads.impl.U1 r6 = new com.yandex.mobile.ads.impl.U1
            r0 = 2
            r6.<init>(r7, r0)
            r5.a(r6)
            int r6 = r5.f30599o
            r7 = 4
            if (r6 == r7) goto L76
            r5.f30599o = r3
        L76:
            return
        L77:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mz.a(int, java.lang.Exception):void");
    }
}
