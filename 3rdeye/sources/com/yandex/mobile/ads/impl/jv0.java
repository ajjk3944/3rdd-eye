package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.if2;
import com.yandex.mobile.ads.impl.uu0;
import com.yandex.mobile.ads.impl.xj0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class jv0 extends av0 {

    /* renamed from: q1, reason: collision with root package name */
    private static final kv0 f29279q1 = hm1.h();

    /* renamed from: r1, reason: collision with root package name */
    private static final int[] f29280r1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: s1, reason: collision with root package name */
    private static boolean f29281s1;

    /* renamed from: t1, reason: collision with root package name */
    private static boolean f29282t1;

    /* renamed from: H0, reason: collision with root package name */
    private final Context f29283H0;

    /* renamed from: I0, reason: collision with root package name */
    private final ge2 f29284I0;

    /* renamed from: J0, reason: collision with root package name */
    private final if2.a f29285J0;

    /* renamed from: K0, reason: collision with root package name */
    private final long f29286K0;

    /* renamed from: L0, reason: collision with root package name */
    private final int f29287L0;

    /* renamed from: M0, reason: collision with root package name */
    private final boolean f29288M0;

    /* renamed from: N0, reason: collision with root package name */
    private a f29289N0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f29290O0;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f29291P0;

    /* renamed from: Q0, reason: collision with root package name */
    private Surface f29292Q0;

    /* renamed from: R0, reason: collision with root package name */
    private ih1 f29293R0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f29294S0;

    /* renamed from: T0, reason: collision with root package name */
    private int f29295T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f29296U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f29297V0;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f29298W0;

    /* renamed from: X0, reason: collision with root package name */
    private long f29299X0;

    /* renamed from: Y0, reason: collision with root package name */
    private long f29300Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private long f29301Z0;

    /* renamed from: a1, reason: collision with root package name */
    private int f29302a1;

    /* renamed from: b1, reason: collision with root package name */
    private int f29303b1;

    /* renamed from: c1, reason: collision with root package name */
    private int f29304c1;

    /* renamed from: d1, reason: collision with root package name */
    private long f29305d1;

    /* renamed from: e1, reason: collision with root package name */
    private long f29306e1;

    /* renamed from: f1, reason: collision with root package name */
    private long f29307f1;

    /* renamed from: g1, reason: collision with root package name */
    private int f29308g1;

    /* renamed from: h1, reason: collision with root package name */
    private int f29309h1;

    /* renamed from: i1, reason: collision with root package name */
    private int f29310i1;

    /* renamed from: j1, reason: collision with root package name */
    private int f29311j1;

    /* renamed from: k1, reason: collision with root package name */
    private float f29312k1;

    /* renamed from: l1, reason: collision with root package name */
    private pf2 f29313l1;

    /* renamed from: m1, reason: collision with root package name */
    private boolean f29314m1;

    /* renamed from: n1, reason: collision with root package name */
    private int f29315n1;

    /* renamed from: o1, reason: collision with root package name */
    b f29316o1;

    /* renamed from: p1, reason: collision with root package name */
    private fe2 f29317p1;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f29318a;

        /* renamed from: b, reason: collision with root package name */
        public final int f29319b;

        /* renamed from: c, reason: collision with root package name */
        public final int f29320c;

        public a(int i, int i10, int i11) {
            this.f29318a = i;
            this.f29319b = i10;
            this.f29320c = i11;
        }
    }

    public final class b implements uu0.c, Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f29321b;

        public b(uu0 uu0Var) {
            Handler handlerA = s82.a((Handler.Callback) this);
            this.f29321b = handlerA;
            uu0Var.a(this, handlerA);
        }

        @Override // com.yandex.mobile.ads.impl.uu0.c
        public final void a(long j4) {
            if (s82.f32899a < 30) {
                this.f29321b.sendMessageAtFrontOfQueue(Message.obtain(this.f29321b, 0, (int) (j4 >> 32), (int) j4));
                return;
            }
            jv0 jv0Var = jv0.this;
            if (this != jv0Var.f29316o1) {
                return;
            }
            if (j4 == Long.MAX_VALUE) {
                jv0Var.Y();
                return;
            }
            try {
                jv0Var.e(j4);
            } catch (h60 e4) {
                jv0.this.a(e4);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i10 = message.arg2;
            int i11 = s82.f32899a;
            long j4 = ((i & 4294967295L) << 32) | (4294967295L & i10);
            jv0 jv0Var = jv0.this;
            if (this != jv0Var.f29316o1) {
                return true;
            }
            if (j4 == Long.MAX_VALUE) {
                jv0Var.Y();
                return true;
            }
            try {
                jv0Var.e(j4);
                return true;
            } catch (h60 e4) {
                jv0.this.a(e4);
                return true;
            }
        }
    }

    public jv0(Context context, a00 a00Var, cv0 cv0Var, Handler handler, if2 if2Var) {
        super(2, a00Var, cv0Var, 30.0f);
        this.f29286K0 = 5000L;
        this.f29287L0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f29283H0 = applicationContext;
        this.f29284I0 = new ge2(applicationContext);
        this.f29285J0 = new if2.a(handler, if2Var);
        this.f29288M0 = V();
        this.f29300Y0 = -9223372036854775807L;
        this.f29309h1 = -1;
        this.f29310i1 = -1;
        this.f29312k1 = -1.0f;
        this.f29295T0 = 1;
        this.f29315n1 = 0;
        U();
    }

    private void T() {
        uu0 uu0VarE;
        this.f29296U0 = false;
        if (s82.f32899a < 23 || !this.f29314m1 || (uu0VarE = E()) == null) {
            return;
        }
        this.f29316o1 = new b(uu0VarE);
    }

    private void U() {
        this.f29313l1 = null;
    }

    private static boolean V() {
        return f29279q1.Z0().equals(s82.f32901c);
    }

    private static boolean W() {
        int i = s82.f32899a;
        if (i <= 28) {
            kv0 kv0Var = f29279q1;
            String strR = kv0Var.r();
            String str = s82.f32900b;
            if (strR.equals(str) || kv0Var.I().equals(str) || kv0Var.K().equals(str) || kv0Var.J().equals(str) || kv0Var.Q0().equals(str) || kv0Var.P0().equals(str) || kv0Var.d1().equals(str) || kv0Var.e1().equals(str)) {
                return true;
            }
        }
        if (i <= 27 && f29279q1.w0().equals(s82.f32900b)) {
            return true;
        }
        if (i > 26) {
            return false;
        }
        kv0 kv0Var2 = f29279q1;
        String strA = kv0Var2.a();
        String str2 = s82.f32900b;
        if (!strA.equals(str2) && !kv0Var2.b().equals(str2) && !kv0Var2.c().equals(str2) && !kv0Var2.d().equals(str2) && !kv0Var2.e().equals(str2) && !kv0Var2.f().equals(str2) && !kv0Var2.g().equals(str2) && !kv0Var2.h().equals(str2) && !kv0Var2.i().equals(str2) && !kv0Var2.j().equals(str2) && !kv0Var2.k().equals(str2) && !kv0Var2.l().equals(str2) && !kv0Var2.m().equals(str2) && !kv0Var2.s().equals(str2) && !kv0Var2.t().equals(str2) && !kv0Var2.u().equals(str2) && !kv0Var2.v().equals(str2) && !kv0Var2.w().equals(str2) && !kv0Var2.y().equals(str2) && !kv0Var2.z().equals(str2) && !kv0Var2.A().equals(str2) && !kv0Var2.B().equals(str2) && !kv0Var2.C().equals(str2) && !kv0Var2.D().equals(str2) && !kv0Var2.E().equals(str2) && !kv0Var2.F().equals(str2) && !kv0Var2.G().equals(str2) && !kv0Var2.H().equals(str2) && !kv0Var2.L().equals(str2) && !kv0Var2.M().equals(str2) && !kv0Var2.N().equals(str2) && !kv0Var2.O().equals(str2) && !kv0Var2.P().equals(str2) && !kv0Var2.Q().equals(str2) && !kv0Var2.R().equals(str2) && !kv0Var2.S().equals(str2) && !kv0Var2.T().equals(str2) && !kv0Var2.U().equals(str2) && !kv0Var2.V().equals(str2) && !kv0Var2.W().equals(str2) && !kv0Var2.X().equals(str2) && !kv0Var2.Y().equals(str2) && !kv0Var2.Z().equals(str2) && !kv0Var2.a0().equals(str2) && !kv0Var2.b0().equals(str2) && !kv0Var2.c0().equals(str2) && !kv0Var2.d0().equals(str2) && !kv0Var2.e0().equals(str2) && !kv0Var2.f0().equals(str2) && !kv0Var2.g0().equals(str2) && !kv0Var2.h0().equals(str2) && !kv0Var2.i0().equals(str2) && !kv0Var2.j0().equals(str2) && !kv0Var2.k0().equals(str2) && !kv0Var2.l0().equals(str2) && !kv0Var2.m0().equals(str2) && !kv0Var2.n0().equals(str2) && !kv0Var2.o0().equals(str2) && !kv0Var2.p0().equals(str2) && !kv0Var2.q0().equals(str2) && !kv0Var2.r0().equals(str2) && !kv0Var2.s0().equals(str2) && !kv0Var2.t0().equals(str2) && !kv0Var2.u0().equals(str2) && !kv0Var2.v0().equals(str2) && !kv0Var2.x0().equals(str2) && !kv0Var2.y0().equals(str2) && !kv0Var2.z0().equals(str2) && !kv0Var2.A0().equals(str2) && !kv0Var2.B0().equals(str2) && !kv0Var2.C0().equals(str2) && !kv0Var2.D0().equals(str2) && !kv0Var2.E0().equals(str2) && !kv0Var2.F0().equals(str2) && !kv0Var2.H0().equals(str2) && !kv0Var2.I0().equals(str2) && !kv0Var2.K0().equals(str2) && !kv0Var2.L0().equals(str2) && !kv0Var2.M0().equals(str2) && !kv0Var2.N0().equals(str2) && !kv0Var2.O0().equals(str2) && !kv0Var2.R0().equals(str2) && !kv0Var2.S0().equals(str2) && !kv0Var2.T0().equals(str2) && !kv0Var2.U0().equals(str2) && !kv0Var2.V0().equals(str2) && !kv0Var2.W0().equals(str2) && !kv0Var2.X0().equals(str2) && !kv0Var2.Y0().equals(str2) && !kv0Var2.a1().equals(str2) && !kv0Var2.b1().equals(str2) && !kv0Var2.f1().equals(str2) && !kv0Var2.g1().equals(str2) && !kv0Var2.h1().equals(str2) && !kv0Var2.i1().equals(str2) && !kv0Var2.j1().equals(str2) && !kv0Var2.k1().equals(str2) && !kv0Var2.l1().equals(str2) && !kv0Var2.m1().equals(str2) && !kv0Var2.n1().equals(str2) && !kv0Var2.o1().equals(str2) && !kv0Var2.p1().equals(str2) && !kv0Var2.q1().equals(str2) && !kv0Var2.r1().equals(str2) && !kv0Var2.s1().equals(str2) && !kv0Var2.t1().equals(str2) && !kv0Var2.u1().equals(str2) && !kv0Var2.v1().equals(str2) && !kv0Var2.w1().equals(str2) && !kv0Var2.x1().equals(str2) && !kv0Var2.y1().equals(str2) && !kv0Var2.z1().equals(str2) && !kv0Var2.A1().equals(str2) && !kv0Var2.B1().equals(str2) && !kv0Var2.C1().equals(str2) && !kv0Var2.D1().equals(str2) && !kv0Var2.E1().equals(str2) && !kv0Var2.G1().equals(str2) && !kv0Var2.H1().equals(str2) && !kv0Var2.I1().equals(str2) && !kv0Var2.F1().equals(str2) && !kv0Var2.J1().equals(str2) && !kv0Var2.K1().equals(str2) && !kv0Var2.L1().equals(str2) && !kv0Var2.M1().equals(str2) && !kv0Var2.N1().equals(str2) && !kv0Var2.O1().equals(str2) && !kv0Var2.P1().equals(str2) && !kv0Var2.Q1().equals(str2) && !kv0Var2.R1().equals(str2) && !kv0Var2.S1().equals(str2) && !kv0Var2.T1().equals(str2) && !kv0Var2.U1().equals(str2) && !kv0Var2.V1().equals(str2) && !kv0Var2.W1().equals(str2) && !kv0Var2.X1().equals(str2) && !kv0Var2.Y1().equals(str2) && !kv0Var2.Z1().equals(str2) && !kv0Var2.a2().equals(str2) && !kv0Var2.b2().equals(str2)) {
            String strN = kv0Var2.n();
            String str3 = s82.f32902d;
            if (!strN.equals(str3) && !kv0Var2.o().equals(str3) && !kv0Var2.G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    private void X() {
        int i = this.f29309h1;
        if (i == -1 && this.f29310i1 == -1) {
            return;
        }
        pf2 pf2Var = this.f29313l1;
        if (pf2Var != null && pf2Var.f31730b == i && pf2Var.f31731c == this.f29310i1 && pf2Var.f31732d == this.f29311j1 && pf2Var.f31733e == this.f29312k1) {
            return;
        }
        pf2 pf2Var2 = new pf2(i, this.f29310i1, this.f29311j1, this.f29312k1);
        this.f29313l1 = pf2Var2;
        this.f29285J0.b(pf2Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        R();
    }

    public static boolean b(String str) {
        if (str.startsWith(f29279q1.c1())) {
            return false;
        }
        synchronized (jv0.class) {
            try {
                if (!f29281s1) {
                    f29282t1 = W();
                    f29281s1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f29282t1;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final boolean G() {
        return this.f29314m1 && s82.f32899a < 23;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void L() {
        T();
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void P() {
        super.P();
        this.f29304c1 = 0;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void c(long j4) {
        super.c(j4);
        if (this.f29314m1) {
            return;
        }
        this.f29304c1--;
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.so1
    public final boolean d() {
        ih1 ih1Var;
        if (super.d() && (this.f29296U0 || (((ih1Var = this.f29293R0) != null && this.f29292Q0 == ih1Var) || E() == null || this.f29314m1))) {
            this.f29300Y0 = -9223372036854775807L;
            return true;
        }
        if (this.f29300Y0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f29300Y0) {
            return true;
        }
        this.f29300Y0 = -9223372036854775807L;
        return false;
    }

    public final void e(long j4) throws h60 {
        d(j4);
        X();
        this.f24856B0.f29813e++;
        this.f29298W0 = true;
        if (!this.f29296U0) {
            this.f29296U0 = true;
            this.f29285J0.a(this.f29292Q0);
            this.f29294S0 = true;
        }
        c(j4);
    }

    public final void f(long j4) {
        ky kyVar = this.f24856B0;
        kyVar.f29818k += j4;
        kyVar.f29819l++;
        this.f29307f1 += j4;
        this.f29308g1++;
    }

    @Override // com.yandex.mobile.ads.impl.so1, com.yandex.mobile.ads.impl.to1
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.mk
    public final void u() {
        this.f29313l1 = null;
        T();
        this.f29294S0 = false;
        this.f29316o1 = null;
        try {
            super.u();
        } finally {
            this.f29285J0.a(this.f24856B0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.mk
    @TargetApi(17)
    public final void v() {
        try {
            super.v();
            ih1 ih1Var = this.f29293R0;
            if (ih1Var != null) {
                if (this.f29292Q0 == ih1Var) {
                    this.f29292Q0 = null;
                }
                ih1Var.release();
                this.f29293R0 = null;
            }
        } catch (Throwable th) {
            if (this.f29293R0 != null) {
                Surface surface = this.f29292Q0;
                ih1 ih1Var2 = this.f29293R0;
                if (surface == ih1Var2) {
                    this.f29292Q0 = null;
                }
                ih1Var2.release();
                this.f29293R0 = null;
            }
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void w() {
        this.f29302a1 = 0;
        this.f29301Z0 = SystemClock.elapsedRealtime();
        this.f29306e1 = SystemClock.elapsedRealtime() * 1000;
        this.f29307f1 = 0L;
        this.f29308g1 = 0;
        this.f29284I0.b();
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void x() {
        this.f29300Y0 = -9223372036854775807L;
        if (this.f29302a1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f29285J0.a(this.f29302a1, jElapsedRealtime - this.f29301Z0);
            this.f29302a1 = 0;
            this.f29301Z0 = jElapsedRealtime;
        }
        int i = this.f29308g1;
        if (i != 0) {
            this.f29285J0.c(i, this.f29307f1);
            this.f29307f1 = 0L;
            this.f29308g1 = 0;
        }
        this.f29284I0.c();
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final oy a(yu0 yu0Var, dc0 dc0Var, dc0 dc0Var2) throws NumberFormatException {
        oy oyVarA = yu0Var.a(dc0Var, dc0Var2);
        int i = oyVarA.f31526e;
        int i10 = dc0Var2.f26088r;
        a aVar = this.f29289N0;
        if (i10 > aVar.f29318a || dc0Var2.f26089s > aVar.f29319b) {
            i |= 256;
        }
        if (b(dc0Var2, yu0Var) > this.f29289N0.f29320c) {
            i |= 64;
        }
        int i11 = i;
        return new oy(yu0Var.f35980a, dc0Var, dc0Var2, i11 != 0 ? 0 : oyVarA.f31525d, i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(com.yandex.mobile.ads.impl.dc0 r11, com.yandex.mobile.ads.impl.yu0 r12) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jv0.a(com.yandex.mobile.ads.impl.dc0, com.yandex.mobile.ads.impl.yu0):int");
    }

    public static int b(dc0 dc0Var, yu0 yu0Var) {
        if (dc0Var.f26084n != -1) {
            int size = dc0Var.f26085o.size();
            int length = 0;
            for (int i = 0; i < size; i++) {
                length += dc0Var.f26085o.get(i).length;
            }
            return dc0Var.f26084n + length;
        }
        return a(dc0Var, yu0Var);
    }

    public final boolean b(long j4, boolean z10) throws Exception {
        int iB = b(j4);
        if (iB == 0) {
            return false;
        }
        if (z10) {
            ky kyVar = this.f24856B0;
            kyVar.f29812d += iB;
            kyVar.f29814f += this.f29304c1;
        } else {
            this.f24856B0.f29817j++;
            a(iB, this.f29304c1);
        }
        C();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void b(my myVar) throws h60 {
        boolean z10 = this.f29314m1;
        if (!z10) {
            this.f29304c1++;
        }
        if (s82.f32899a >= 23 || !z10) {
            return;
        }
        e(myVar.f30574f);
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final float a(float f10, dc0[] dc0VarArr) {
        float fMax = -1.0f;
        for (dc0 dc0Var : dc0VarArr) {
            float f11 = dc0Var.f26090t;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    private boolean b(yu0 yu0Var) {
        if (s82.f32899a < 23 || this.f29314m1 || b(yu0Var.f35980a)) {
            return false;
        }
        return !yu0Var.f35985f || ih1.a(this.f29283H0);
    }

    private static xj0 a(cv0 cv0Var, dc0 dc0Var, boolean z10, boolean z11) throws gv0.b {
        String str = dc0Var.f26083m;
        if (str == null) {
            return xj0.h();
        }
        List<yu0> listA = cv0Var.a(str, z10, z11);
        String strA = gv0.a(dc0Var);
        if (strA == null) {
            return xj0.a((Collection) listA);
        }
        List<yu0> listA2 = cv0Var.a(strA, z10, z11);
        int i = xj0.f35328d;
        return new xj0.a().b((List) listA).b((List) listA2).a();
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final ArrayList a(cv0 cv0Var, dc0 dc0Var, boolean z10) throws gv0.b {
        return gv0.a(a(cv0Var, dc0Var, z10, this.f29314m1), dc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.av0
    @TargetApi(17)
    public final uu0.a a(yu0 yu0Var, dc0 dc0Var, MediaCrypto mediaCrypto, float f10) {
        a aVar;
        Point point;
        int i;
        int[] iArr;
        int i10;
        boolean z10;
        Pair<Integer, Integer> pairB;
        int iA;
        ih1 ih1Var = this.f29293R0;
        if (ih1Var != null && ih1Var.f28672b != yu0Var.f35985f) {
            if (this.f29292Q0 == ih1Var) {
                this.f29292Q0 = null;
            }
            ih1Var.release();
            this.f29293R0 = null;
        }
        String str = yu0Var.f35982c;
        dc0[] dc0VarArrS = s();
        int iMax = dc0Var.f26088r;
        int iMax2 = dc0Var.f26089s;
        int iB = b(dc0Var, yu0Var);
        if (dc0VarArrS.length == 1) {
            if (iB != -1 && (iA = a(dc0Var, yu0Var)) != -1) {
                iB = Math.min((int) (iB * 1.5f), iA);
            }
            aVar = new a(iMax, iMax2, iB);
        } else {
            int length = dc0VarArrS.length;
            boolean z11 = false;
            for (int i11 = 0; i11 < length; i11++) {
                dc0 dc0VarA = dc0VarArrS[i11];
                if (dc0Var.f26095y != null && dc0VarA.f26095y == null) {
                    dc0VarA = dc0VarA.a().a(dc0Var.f26095y).a();
                }
                if (yu0Var.a(dc0Var, dc0VarA).f31525d != 0) {
                    int i12 = dc0VarA.f26088r;
                    z11 |= i12 == -1 || dc0VarA.f26089s == -1;
                    iMax = Math.max(iMax, i12);
                    iMax2 = Math.max(iMax2, dc0VarA.f26089s);
                    iB = Math.max(iB, b(dc0VarA, yu0Var));
                }
            }
            if (z11) {
                rs0.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i13 = dc0Var.f26089s;
                int i14 = dc0Var.f26088r;
                boolean z12 = i13 > i14;
                int i15 = z12 ? i13 : i14;
                if (z12) {
                    i13 = i14;
                }
                float f11 = i13 / i15;
                int[] iArr2 = f29280r1;
                int length2 = iArr2.length;
                int i16 = 0;
                while (i16 < length2) {
                    int i17 = i16;
                    int i18 = iArr2[i17];
                    boolean z13 = z12;
                    int i19 = (int) (i18 * f11);
                    if (i18 <= i15 || i19 <= i13) {
                        break;
                    }
                    int i20 = i13;
                    if (s82.f32899a >= 21) {
                        point = yu0Var.a(z13 ? i19 : i18, z13 ? i18 : i19);
                        i = i15;
                        iArr = iArr2;
                        i10 = length2;
                        if (yu0Var.a(point.x, point.y, dc0Var.f26090t)) {
                            break;
                        }
                        i16 = i17 + 1;
                        z12 = z13;
                        i13 = i20;
                        i15 = i;
                        iArr2 = iArr;
                        length2 = i10;
                    } else {
                        i = i15;
                        iArr = iArr2;
                        i10 = length2;
                        try {
                            int i21 = ((i18 + 15) / 16) * 16;
                            int i22 = ((i19 + 15) / 16) * 16;
                            if (i21 * i22 <= gv0.a()) {
                                int i23 = z13 ? i22 : i21;
                                if (!z13) {
                                    i21 = i22;
                                }
                                point = new Point(i23, i21);
                            } else {
                                i16 = i17 + 1;
                                z12 = z13;
                                i13 = i20;
                                i15 = i;
                                iArr2 = iArr;
                                length2 = i10;
                            }
                        } catch (gv0.b unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iB = Math.max(iB, a(dc0Var.a().o(iMax).f(iMax2).a(), yu0Var));
                    rs0.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            aVar = new a(iMax, iMax2, iB);
        }
        this.f29289N0 = aVar;
        boolean z14 = this.f29288M0;
        int i24 = this.f29314m1 ? this.f29315n1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", dc0Var.f26088r);
        mediaFormat.setInteger("height", dc0Var.f26089s);
        List<byte[]> list = dc0Var.f26085o;
        for (int i25 = 0; i25 < list.size(); i25++) {
            mediaFormat.setByteBuffer(fe.a("csd-", i25), ByteBuffer.wrap(list.get(i25)));
        }
        float f12 = dc0Var.f26090t;
        if (f12 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f12);
        }
        wv0.a(mediaFormat, "rotation-degrees", dc0Var.f26091u);
        lq lqVar = dc0Var.f26095y;
        if (lqVar != null) {
            wv0.a(mediaFormat, "color-transfer", lqVar.f30070d);
            wv0.a(mediaFormat, "color-standard", lqVar.f30068b);
            wv0.a(mediaFormat, "color-range", lqVar.f30069c);
            byte[] bArr = lqVar.f30071e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(dc0Var.f26083m) && (pairB = gv0.b(dc0Var)) != null) {
            wv0.a(mediaFormat, Scopes.PROFILE, ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f29318a);
        mediaFormat.setInteger("max-height", aVar.f29319b);
        wv0.a(mediaFormat, "max-input-size", aVar.f29320c);
        if (s82.f32899a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z14) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i24 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i24);
        }
        if (this.f29292Q0 == null) {
            if (b(yu0Var)) {
                if (this.f29293R0 == null) {
                    this.f29293R0 = ih1.a(this.f29283H0, yu0Var.f35985f);
                }
                this.f29292Q0 = this.f29293R0;
            } else {
                throw new IllegalStateException();
            }
        }
        return uu0.a.a(yu0Var, mediaFormat, dc0Var, this.f29292Q0, mediaCrypto);
    }

    @Override // com.yandex.mobile.ads.impl.av0
    @TargetApi(29)
    public final void a(my myVar) throws h60 {
        if (this.f29291P0) {
            ByteBuffer byteBuffer = myVar.f30575g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    uu0 uu0VarE = E();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    uu0VarE.a(bundle);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.hi1.b
    public final void a(int i, Object obj) throws Exception {
        if (i == 1) {
            a(obj);
            return;
        }
        if (i == 7) {
            this.f29317p1 = (fe2) obj;
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.f29315n1 != iIntValue) {
                this.f29315n1 = iIntValue;
                if (this.f29314m1) {
                    N();
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            this.f29284I0.a(((Integer) obj).intValue());
        } else {
            this.f29295T0 = ((Integer) obj).intValue();
            uu0 uu0VarE = E();
            if (uu0VarE != null) {
                uu0VarE.a(this.f29295T0);
            }
        }
    }

    private void a(long j4, long j10, dc0 dc0Var) {
        fe2 fe2Var = this.f29317p1;
        if (fe2Var != null) {
            fe2Var.a(j4, j10, dc0Var, H());
        }
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void a(Exception exc) {
        rs0.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f29285J0.b(exc);
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void a(String str, long j4, long j10) {
        this.f29285J0.a(str, j4, j10);
        this.f29290O0 = b(str);
        yu0 yu0VarF = F();
        yu0VarF.getClass();
        this.f29291P0 = yu0VarF.a();
        if (s82.f32899a < 23 || !this.f29314m1) {
            return;
        }
        uu0 uu0VarE = E();
        uu0VarE.getClass();
        this.f29316o1 = new b(uu0VarE);
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void a(String str) {
        this.f29285J0.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.mk
    public final void a(boolean z10, boolean z11) throws h60 {
        super.a(z10, z11);
        boolean z12 = p().f34171a;
        if (z12 && this.f29315n1 == 0) {
            throw new IllegalStateException();
        }
        if (this.f29314m1 != z12) {
            this.f29314m1 = z12;
            N();
        }
        this.f29285J0.b(this.f24856B0);
        this.f29297V0 = z11;
        this.f29298W0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final oy a(ec0 ec0Var) throws h60 {
        oy oyVarA = super.a(ec0Var);
        this.f29285J0.a(ec0Var.f26789b, oyVarA);
        return oyVarA;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final void a(dc0 dc0Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        uu0 uu0VarE = E();
        if (uu0VarE != null) {
            uu0VarE.a(this.f29295T0);
        }
        if (this.f29314m1) {
            this.f29309h1 = dc0Var.f26088r;
            this.f29310i1 = dc0Var.f26089s;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f29309h1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f29310i1 = integer2;
        }
        float f10 = dc0Var.f26092v;
        this.f29312k1 = f10;
        if (s82.f32899a >= 21) {
            int i = dc0Var.f26091u;
            if (i == 90 || i == 270) {
                int i10 = this.f29309h1;
                this.f29309h1 = this.f29310i1;
                this.f29310i1 = i10;
                this.f29312k1 = 1.0f / f10;
            }
        } else {
            this.f29311j1 = dc0Var.f26091u;
        }
        this.f29284I0.a(dc0Var.f26090t);
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.mk
    public final void a(long j4, boolean z10) throws h60 {
        super.a(j4, z10);
        T();
        this.f29284I0.a();
        this.f29305d1 = -9223372036854775807L;
        this.f29299X0 = -9223372036854775807L;
        this.f29303b1 = 0;
        if (z10) {
            this.f29300Y0 = this.f29286K0 > 0 ? SystemClock.elapsedRealtime() + this.f29286K0 : -9223372036854775807L;
        } else {
            this.f29300Y0 = -9223372036854775807L;
        }
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final boolean a(long j4, long j10, uu0 uu0Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j11, boolean z10, boolean z11, dc0 dc0Var) throws InterruptedException, h60 {
        boolean z12;
        uu0Var.getClass();
        if (this.f29299X0 == -9223372036854775807L) {
            this.f29299X0 = j4;
        }
        if (j11 != this.f29305d1) {
            this.f29284I0.b(j11);
            this.f29305d1 = j11;
        }
        long jI = I();
        long j12 = j11 - jI;
        if (z10 && !z11) {
            h52.a("skipVideoBuffer");
            uu0Var.a(false, i);
            h52.a();
            this.f24856B0.f29814f++;
            return true;
        }
        double dJ = J();
        boolean z13 = getState() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j13 = (long) ((j11 - j4) / dJ);
        if (z13) {
            j13 -= jElapsedRealtime - j10;
        }
        if (this.f29292Q0 == this.f29293R0) {
            if (j13 >= -30000) {
                return false;
            }
            h52.a("skipVideoBuffer");
            uu0Var.a(false, i);
            h52.a();
            this.f24856B0.f29814f++;
            f(j13);
            return true;
        }
        long j14 = jElapsedRealtime - this.f29306e1;
        boolean z14 = this.f29298W0 ? !this.f29296U0 : z13 || this.f29297V0;
        if (this.f29300Y0 == -9223372036854775807L && j4 >= jI && (z14 || (z13 && j13 < -30000 && j14 > 100000))) {
            long jNanoTime = System.nanoTime();
            a(j12, jNanoTime, dc0Var);
            if (s82.f32899a >= 21) {
                a(uu0Var, i, jNanoTime);
            } else {
                a(uu0Var, i);
            }
            f(j13);
            return true;
        }
        if (!z13 || j4 == this.f29299X0) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long jA = this.f29284I0.a((j13 * 1000) + jNanoTime2);
        long j15 = (jA - jNanoTime2) / 1000;
        boolean z15 = this.f29300Y0 != -9223372036854775807L;
        if (j15 < -500000 && !z11 && b(j4, z15)) {
            return false;
        }
        if (j15 < -30000 && !z11) {
            if (z15) {
                h52.a("skipVideoBuffer");
                uu0Var.a(false, i);
                h52.a();
                this.f24856B0.f29814f++;
                z12 = true;
            } else {
                h52.a("dropVideoBuffer");
                uu0Var.a(false, i);
                h52.a();
                z12 = true;
                a(0, 1);
            }
            f(j15);
            return z12;
        }
        if (s82.f32899a >= 21) {
            if (j15 < 50000) {
                a(j12, jA, dc0Var);
                a(uu0Var, i, jA);
                f(j15);
                return true;
            }
        } else if (j15 < 30000) {
            if (j15 > 11000) {
                try {
                    Thread.sleep((j15 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            a(j12, jA, dc0Var);
            a(uu0Var, i);
            f(j15);
            return true;
        }
        return false;
    }

    public final void a(uu0 uu0Var, int i) {
        X();
        h52.a("releaseOutputBuffer");
        uu0Var.a(true, i);
        h52.a();
        this.f29306e1 = SystemClock.elapsedRealtime() * 1000;
        this.f24856B0.f29813e++;
        this.f29303b1 = 0;
        this.f29298W0 = true;
        if (this.f29296U0) {
            return;
        }
        this.f29296U0 = true;
        this.f29285J0.a(this.f29292Q0);
        this.f29294S0 = true;
    }

    public final void a(uu0 uu0Var, int i, long j4) {
        X();
        h52.a("releaseOutputBuffer");
        uu0Var.a(i, j4);
        h52.a();
        this.f29306e1 = SystemClock.elapsedRealtime() * 1000;
        this.f24856B0.f29813e++;
        this.f29303b1 = 0;
        this.f29298W0 = true;
        if (this.f29296U0) {
            return;
        }
        this.f29296U0 = true;
        this.f29285J0.a(this.f29292Q0);
        this.f29294S0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.view.Surface] */
    private void a(Object obj) throws Exception {
        ih1 ih1VarA = obj instanceof Surface ? (Surface) obj : null;
        if (ih1VarA == null) {
            ih1 ih1Var = this.f29293R0;
            if (ih1Var != null) {
                ih1VarA = ih1Var;
            } else {
                yu0 yu0VarF = F();
                if (yu0VarF != null && b(yu0VarF)) {
                    ih1VarA = ih1.a(this.f29283H0, yu0VarF.f35985f);
                    this.f29293R0 = ih1VarA;
                }
            }
        }
        if (this.f29292Q0 != ih1VarA) {
            this.f29292Q0 = ih1VarA;
            this.f29284I0.a(ih1VarA);
            this.f29294S0 = false;
            int state = getState();
            uu0 uu0VarE = E();
            if (uu0VarE != null) {
                if (s82.f32899a >= 23 && ih1VarA != null && !this.f29290O0) {
                    uu0VarE.a(ih1VarA);
                } else {
                    N();
                    K();
                }
            }
            if (ih1VarA != null && ih1VarA != this.f29293R0) {
                pf2 pf2Var = this.f29313l1;
                if (pf2Var != null) {
                    this.f29285J0.b(pf2Var);
                }
                T();
                if (state == 2) {
                    this.f29300Y0 = this.f29286K0 > 0 ? SystemClock.elapsedRealtime() + this.f29286K0 : -9223372036854775807L;
                    return;
                }
                return;
            }
            this.f29313l1 = null;
            T();
            return;
        }
        if (ih1VarA == null || ih1VarA == this.f29293R0) {
            return;
        }
        pf2 pf2Var2 = this.f29313l1;
        if (pf2Var2 != null) {
            this.f29285J0.b(pf2Var2);
        }
        if (this.f29294S0) {
            this.f29285J0.a(this.f29292Q0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.av0, com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.so1
    public final void a(float f10, float f11) throws Exception {
        super.a(f10, f11);
        this.f29284I0.b(f10);
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final boolean a(yu0 yu0Var) {
        return this.f29292Q0 != null || b(yu0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.av0
    public final int a(cv0 cv0Var, dc0 dc0Var) throws gv0.b {
        boolean z10;
        int i = 0;
        if (!k01.f(dc0Var.f26083m)) {
            return P3.b(0, 0, 0);
        }
        boolean z11 = dc0Var.f26086p != null;
        xj0 xj0VarA = a(cv0Var, dc0Var, z11, false);
        if (z11 && xj0VarA.isEmpty()) {
            xj0VarA = a(cv0Var, dc0Var, false, false);
        }
        if (xj0VarA.isEmpty()) {
            return P3.b(1, 0, 0);
        }
        int i10 = dc0Var.f26071F;
        if (i10 != 0 && i10 != 2) {
            return P3.b(2, 0, 0);
        }
        yu0 yu0Var = (yu0) xj0VarA.get(0);
        boolean zA = yu0Var.a(dc0Var);
        if (zA) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < xj0VarA.size(); i11++) {
                yu0 yu0Var2 = (yu0) xj0VarA.get(i11);
                if (yu0Var2.a(dc0Var)) {
                    z10 = false;
                    zA = true;
                    yu0Var = yu0Var2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = zA ? 4 : 3;
        int i13 = yu0Var.b(dc0Var) ? 16 : 8;
        int i14 = yu0Var.f35986g ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (zA) {
            xj0 xj0VarA2 = a(cv0Var, dc0Var, z11, true);
            if (!xj0VarA2.isEmpty()) {
                yu0 yu0Var3 = (yu0) gv0.a(xj0VarA2, dc0Var).get(0);
                if (yu0Var3.a(dc0Var) && yu0Var3.b(dc0Var)) {
                    i = 32;
                }
            }
        }
        return i12 | i13 | i | i14 | i15;
    }

    public final void a(int i, int i10) {
        int i11;
        ky kyVar = this.f24856B0;
        kyVar.f29816h += i;
        int i12 = i + i10;
        kyVar.f29815g += i12;
        this.f29302a1 += i12;
        int i13 = this.f29303b1 + i12;
        this.f29303b1 = i13;
        kyVar.i = Math.max(i13, kyVar.i);
        int i14 = this.f29287L0;
        if (i14 <= 0 || (i11 = this.f29302a1) < i14 || i11 <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f29285J0.a(this.f29302a1, jElapsedRealtime - this.f29301Z0);
        this.f29302a1 = 0;
        this.f29301Z0 = jElapsedRealtime;
    }

    @Override // com.yandex.mobile.ads.impl.av0
    public final xu0 a(IllegalStateException illegalStateException, yu0 yu0Var) {
        return new iv0(illegalStateException, yu0Var, this.f29292Q0);
    }
}
