package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ix1 extends pr1 {
    public static final byte[] A0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final ArrayDeque A;
    public final w4 B;
    public final AtomicInteger C;
    public mx1 D;
    public mx1 E;
    public rg0 F;
    public rg0 G;
    public jt1 H;
    public final long I;
    public float J;
    public float K;
    public cx1 L;
    public mx1 M;
    public MediaFormat N;
    public boolean O;
    public float P;
    public ArrayDeque Q;
    public gx1 R;
    public ex1 S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public long Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f12503a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f12504b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f12505c0;

    /* renamed from: d0, reason: collision with root package name */
    public ByteBuffer f12506d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f12507e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f12508f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f12509g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f12510h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f12511i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f12512j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f12513k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f12514l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f12515m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f12516n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f12517o0;

    /* renamed from: p0, reason: collision with root package name */
    public long f12518p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f12519q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f12520r0;

    /* renamed from: s, reason: collision with root package name */
    public final mu0 f12521s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f12522s0;

    /* renamed from: t, reason: collision with root package name */
    public final uu1 f12523t;

    /* renamed from: t0, reason: collision with root package name */
    public os1 f12524t0;

    /* renamed from: u, reason: collision with root package name */
    public final float f12525u;

    /* renamed from: u0, reason: collision with root package name */
    public hx1 f12526u0;

    /* renamed from: v, reason: collision with root package name */
    public final rq1 f12527v;

    /* renamed from: v0, reason: collision with root package name */
    public long f12528v0;

    /* renamed from: w, reason: collision with root package name */
    public final rq1 f12529w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f12530w0;

    /* renamed from: x, reason: collision with root package name */
    public final rq1 f12531x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f12532x0;

    /* renamed from: y, reason: collision with root package name */
    public final zw1 f12533y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f12534y0;

    /* renamed from: z, reason: collision with root package name */
    public final MediaCodec.BufferInfo f12535z;

    /* renamed from: z0, reason: collision with root package name */
    public long f12536z0;

    public ix1(int i4, mu0 mu0Var, uu1 uu1Var, float f10) {
        super(i4);
        this.f12521s = mu0Var;
        uu1Var.getClass();
        this.f12523t = uu1Var;
        this.f12525u = f10;
        this.C = new AtomicInteger();
        this.f12527v = new rq1(0);
        this.f12529w = new rq1(0);
        this.f12531x = new rq1(2);
        zw1 zw1Var = new zw1(2);
        zw1Var.f19211l = 32;
        this.f12533y = zw1Var;
        this.f12535z = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = -9223372036854775807L;
        this.A = new ArrayDeque();
        this.f12526u0 = hx1.f12007f;
        zw1Var.j(0);
        zw1Var.f15735e.order(ByteOrder.nativeOrder());
        w4 w4Var = new w4();
        w4Var.f17862c = q10.f15188a;
        w4Var.f17861b = 0;
        w4Var.f17860a = 2;
        this.B = w4Var;
        this.P = -1.0f;
        this.T = 0;
        this.f12512j0 = 0;
        this.f12504b0 = -1;
        this.f12505c0 = -1;
        this.f12503a0 = -9223372036854775807L;
        this.f12518p0 = -9223372036854775807L;
        this.f12528v0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
        this.f12513k0 = 0;
        this.f12514l0 = 0;
        this.f12524t0 = new os1();
        this.f12534y0 = false;
        this.f12536z0 = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.pr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A(com.google.android.gms.internal.ads.mx1[] r12, long r13, long r15, com.google.android.gms.internal.ads.jy1 r17) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.hx1 r12 = r11.f12526u0
            long r0 = r12.f12010c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.hx1 r4 = new com.google.android.gms.internal.ads.hx1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.l0(r4)
            boolean r12 = r11.f12532x0
            if (r12 == 0) goto L56
            r11.a0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.A
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.f12518p0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.f12528v0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.hx1 r4 = new com.google.android.gms.internal.ads.hx1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.l0(r4)
            com.google.android.gms.internal.ads.hx1 r12 = r11.f12526u0
            long r12 = r12.f12010c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.a0()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.hx1 r0 = new com.google.android.gms.internal.ads.hx1
            long r1 = r11.f12518p0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ix1.A(com.google.android.gms.internal.ads.mx1[], long, long, com.google.android.gms.internal.ads.jy1):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:51|(11:226|52|53|54|(1:56)|57|58|59|247|60|61)|(5:235|63|e6|70|(2:244|72))(1:83)|237|84|233|85|242|86|87|(1:89)|90|91|(2:104|(7:111|121|122|(1:127)(1:126)|128|129|(5:238|131|(1:133)(1:134)|138|(3:(1:164)(1:143)|165|(8:167|(1:169)|170|171|230|172|173|260)(3:258|177|178))(0))(0))(5:112|(1:120)(0)|121|122|(5:124|127|128|129|(0)(0))(0)))(5:95|(1:103)(0)|121|122|(0)(0))|174) */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02b2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02b3, code lost:
    
        r9 = r9;
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02b5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02b6, code lost:
    
        r9 = r1;
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02bc, code lost:
    
        r9 = r1;
        r19 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f3 A[Catch: Exception -> 0x0108, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0108, blocks: (B:69:0x00ef, B:70:0x00f0, B:72:0x00fa, B:89:0x0156, B:93:0x0186, B:95:0x018e, B:97:0x0198, B:99:0x01a0, B:101:0x01a8, B:124:0x01f3, B:106:0x01b6, B:108:0x01be, B:112:0x01c9, B:114:0x01d3, B:116:0x01db, B:118:0x01e3, B:80:0x0113, B:66:0x00e9, B:68:0x00ed, B:78:0x0111), top: B:244:0x00fa, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0311 A[Catch: gx1 -> 0x032b, TryCatch #3 {gx1 -> 0x032b, blocks: (B:198:0x02df, B:200:0x0311, B:203:0x031e, B:205:0x0328, B:209:0x0342, B:212:0x034a, B:213:0x034c, B:208:0x032d, B:215:0x0350, B:216:0x0351, B:218:0x0358, B:219:0x0359, B:220:0x0363, B:222:0x0366), top: B:232:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0328 A[Catch: gx1 -> 0x032b, TryCatch #3 {gx1 -> 0x032b, blocks: (B:198:0x02df, B:200:0x0311, B:203:0x031e, B:205:0x0328, B:209:0x0342, B:212:0x034a, B:213:0x034c, B:208:0x032d, B:215:0x0350, B:216:0x0351, B:218:0x0358, B:219:0x0359, B:220:0x0363, B:222:0x0366), top: B:232:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x032d A[Catch: gx1 -> 0x032b, TryCatch #3 {gx1 -> 0x032b, blocks: (B:198:0x02df, B:200:0x0311, B:203:0x031e, B:205:0x0328, B:209:0x0342, B:212:0x034a, B:213:0x034c, B:208:0x032d, B:215:0x0350, B:216:0x0351, B:218:0x0358, B:219:0x0359, B:220:0x0363, B:222:0x0366), top: B:232:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x034a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B() throws com.google.android.gms.internal.ads.gx1, com.google.android.gms.internal.ads.us1 {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ix1.B():void");
    }

    public boolean C(ex1 ex1Var) {
        return true;
    }

    public final void D() {
        try {
            cx1 cx1Var = this.L;
            if (cx1Var != null) {
                cx1Var.B1();
                this.f12524t0.f14779b++;
                ex1 ex1Var = this.S;
                if (ex1Var == null) {
                    throw null;
                }
                W(ex1Var.f10904a);
            }
            this.L = null;
            this.F = null;
            H();
        } catch (Throwable th2) {
            this.L = null;
            this.F = null;
            H();
            throw th2;
        }
    }

    public boolean E() {
        int i4 = this.f12514l0;
        if (i4 == 3 || ((this.U && !this.f12517o0) || (this.V && this.f12516n0))) {
            return true;
        }
        if (i4 == 2) {
            try {
                rg0 rg0Var = this.G;
                rg0Var.getClass();
                this.F = rg0Var;
                this.f12513k0 = 0;
                this.f12514l0 = 0;
            } catch (us1 e2) {
                ls.y("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                return true;
            }
        }
        return false;
    }

    public boolean F() {
        return true;
    }

    public void G() {
        this.f12504b0 = -1;
        this.f12529w.f15735e = null;
        this.f12505c0 = -1;
        this.f12506d0 = null;
        this.f12518p0 = -9223372036854775807L;
        m0().f12012e = -9223372036854775807L;
        this.f12528v0 = -9223372036854775807L;
        this.f12503a0 = -9223372036854775807L;
        this.f12516n0 = false;
        this.Z = -9223372036854775807L;
        this.f12515m0 = false;
        this.W = false;
        this.X = false;
        this.f12507e0 = false;
        this.f12513k0 = 0;
        this.f12514l0 = 0;
        this.f12512j0 = this.f12511i0 ? 1 : 0;
        this.f12534y0 = false;
        this.f12536z0 = 0L;
    }

    public final void H() {
        G();
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.f12517o0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.Y = false;
        this.f12511i0 = false;
        this.f12512j0 = 0;
    }

    public dx1 I(IllegalStateException illegalStateException, ex1 ex1Var) {
        return new dx1(illegalStateException, ex1Var);
    }

    public int L(rq1 rq1Var) {
        return 0;
    }

    public boolean M(rq1 rq1Var) {
        return false;
    }

    public void N(long j) {
        this.f12528v0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.A;
            if (arrayDeque.isEmpty() || j < ((hx1) arrayDeque.peek()).f12008a) {
                return;
            }
            hx1 hx1Var = (hx1) arrayDeque.poll();
            hx1Var.getClass();
            l0(hx1Var);
            a0();
        }
    }

    public abstract int O(uu1 uu1Var, mx1 mx1Var);

    public abstract ArrayList P(uu1 uu1Var, mx1 mx1Var);

    public boolean Q(mx1 mx1Var) {
        return false;
    }

    public abstract r7 R(ex1 ex1Var, mx1 mx1Var, float f10);

    public abstract ps1 S(ex1 ex1Var, mx1 mx1Var, mx1 mx1Var2);

    public long T(long j, long j8) {
        if (this.f15088h == 1) {
            return (r() || s()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public abstract float U(float f10, mx1 mx1Var, mx1[] mx1VarArr);

    public abstract void V(String str, long j, long j8);

    public abstract void W(String str);

    public abstract void X(Exception exc);

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.ps1 Y(com.google.android.gms.internal.ads.ce1 r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ix1.Y(com.google.android.gms.internal.ads.ce1):com.google.android.gms.internal.ads.ps1");
    }

    public abstract void Z(mx1 mx1Var, MediaFormat mediaFormat);

    public abstract void a0();

    public abstract boolean b0(long j, long j8, cx1 cx1Var, ByteBuffer byteBuffer, int i4, int i10, int i11, long j9, boolean z3, boolean z10, mx1 mx1Var);

    @Override // com.google.android.gms.internal.ads.pr1
    public void c(long j, boolean z3, boolean z10) {
        ArrayDeque arrayDeque = this.A;
        if (!arrayDeque.isEmpty()) {
            this.f12526u0 = (hx1) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z10) {
            this.f12519q0 = false;
            this.f12520r0 = false;
            if (this.f12508f0) {
                e0();
            } else if (this.L != null) {
                if (E()) {
                    D();
                    B();
                } else if (F()) {
                    f0();
                } else {
                    this.f12534y0 = true;
                }
            }
            k5 k5Var = this.f12526u0.f12011d;
            if (k5Var.d() > 0) {
                this.f12522s0 = true;
            }
            k5Var.c();
        }
    }

    public abstract void c0();

    public abstract void d0(rq1 rq1Var);

    public final void e0() {
        this.f12518p0 = -9223372036854775807L;
        m0().f12012e = -9223372036854775807L;
        this.f12528v0 = -9223372036854775807L;
        this.f12510h0 = false;
        this.f12533y.i();
        this.f12531x.i();
        this.f12509g0 = false;
        w4 w4Var = this.B;
        w4Var.getClass();
        w4Var.f17862c = q10.f15188a;
        w4Var.f17861b = 0;
        w4Var.f17860a = 2;
    }

    public final void f0() {
        try {
            cx1 cx1Var = this.L;
            if (cx1Var == null) {
                throw null;
            }
            cx1Var.D1();
        } finally {
            G();
        }
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public void g() {
        this.D = null;
        l0(hx1.f12007f);
        this.A.clear();
        if (this.f12508f0) {
            this.f12508f0 = false;
            e0();
        } else {
            if (this.L == null) {
                return;
            }
            if (E()) {
                D();
            } else if (F()) {
                f0();
            } else {
                this.f12534y0 = true;
            }
        }
    }

    public final boolean g0(int i4) throws gx1, us1 {
        ce1 ce1Var = this.f15084c;
        ce1Var.f10094b = null;
        ce1Var.f10095c = null;
        rq1 rq1Var = this.f12527v;
        rq1Var.i();
        int iL = l(ce1Var, rq1Var, i4 | 4);
        if (iL == -5) {
            Y(ce1Var);
            return true;
        }
        if (iL != -4 || !rq1Var.h(4)) {
            return false;
        }
        this.f12519q0 = true;
        k0();
        return false;
    }

    public final boolean h0(mx1 mx1Var) throws gx1, us1 {
        if (this.L != null && this.f12514l0 != 3 && this.f15088h != 0) {
            float f10 = this.K;
            mx1Var.getClass();
            mx1[] mx1VarArr = this.j;
            mx1VarArr.getClass();
            float fU = U(f10, mx1Var, mx1VarArr);
            float f11 = this.P;
            if (f11 != fU) {
                if (fU == -1.0f) {
                    j0();
                    return false;
                }
                if (f11 != -1.0f || fU > this.f12525u) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fU);
                    cx1 cx1Var = this.L;
                    cx1Var.getClass();
                    cx1Var.d(bundle);
                    this.P = fU;
                }
            }
        }
        return true;
    }

    public final boolean i0() {
        if (this.f12515m0) {
            this.f12513k0 = 1;
            if (this.V) {
                this.f12514l0 = 3;
                return false;
            }
            this.f12514l0 = 2;
            return true;
        }
        rg0 rg0Var = this.G;
        rg0Var.getClass();
        this.F = rg0Var;
        this.f12513k0 = 0;
        this.f12514l0 = 0;
        return true;
    }

    public final void j0() throws gx1, us1 {
        if (this.f12515m0) {
            this.f12513k0 = 1;
            this.f12514l0 = 3;
        } else {
            D();
            B();
        }
    }

    public final void k0() throws gx1, us1 {
        int i4 = this.f12514l0;
        if (i4 == 1) {
            f0();
            return;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                this.f12520r0 = true;
                c0();
                return;
            } else {
                D();
                B();
                return;
            }
        }
        f0();
        rg0 rg0Var = this.G;
        rg0Var.getClass();
        this.F = rg0Var;
        this.f12513k0 = 0;
        this.f12514l0 = 0;
    }

    public final void l0(hx1 hx1Var) {
        this.f12526u0 = hx1Var;
        if (hx1Var.f12010c != -9223372036854775807L) {
            this.f12530w0 = true;
        }
    }

    public final hx1 m0() {
        ArrayDeque arrayDeque = this.A;
        return !arrayDeque.isEmpty() ? (hx1) arrayDeque.getLast() : this.f12526u0;
    }

    public final boolean n0(long j, long j8) {
        if (j8 >= j) {
            return false;
        }
        mx1 mx1Var = this.E;
        return mx1Var == null || !Objects.equals(mx1Var.f14052m, "audio/opus") || j - j8 > 80000;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public void o(float f10, float f11) throws gx1, us1 {
        this.J = f10;
        this.K = f11;
        h0(this.M);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @Override // com.google.android.gms.internal.ads.pr1
    public void q(long r32, long r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ix1.q(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final int t(mx1 mx1Var) throws us1 {
        try {
            return O(this.f12523t, mx1Var);
        } catch (kx1 e2) {
            throw k(e2, mx1Var, false, 4002);
        }
    }

    public void J(mx1 mx1Var) {
    }

    public void K(rq1 rq1Var) {
    }
}
