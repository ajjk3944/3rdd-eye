package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class kg4 implements fc4 {
    public final vw3 A;
    public final vw3 B;
    public final vw3 C;
    public final xf4 D;
    public final MediaCodec.BufferInfo E;
    public final ArrayDeque F;
    public final pi1 G;
    public ph4 H;
    public ph4 I;
    public ci3 J;
    public ci3 K;
    public za4 L;
    public final long M;
    public float N;
    public float O;
    public zf4 P;
    public ph4 Q;
    public MediaFormat R;
    public boolean S;
    public float T;
    public ArrayDeque U;
    public ig4 V;
    public bg4 W;
    public boolean X;
    public boolean Y;
    public long Z;
    public long a0;
    public int b0;
    public int c0;
    public ByteBuffer d0;
    public boolean e0;
    public boolean f0;
    public final int g;
    public boolean g0;
    public boolean h0;
    public jc4 i;
    public boolean i0;
    public int j;
    public int j0;
    public xd4 k;
    public int k0;
    public pz l;
    public int l0;
    public int m;
    public boolean m0;
    public li4 n;
    public boolean n0;
    public ph4[] o;
    public boolean o0;
    public long p;
    public long p0;
    public long q;
    public boolean q0;
    public boolean r0;
    public boolean s;
    public boolean s0;
    public boolean t;
    public n34 t0;
    public jg4 u0;
    public kh4 v;
    public long v0;
    public lj4 w;
    public boolean w0;
    public final cy2 x;
    public boolean x0;
    public final hd4 y;
    public boolean y0;
    public final float z;
    public long z0;
    public final Object f = new Object();
    public final mr2 h = new mr2(16);
    public long r = Long.MIN_VALUE;
    public oz1 u = oz1.a;

    public kg4(int i, cy2 cy2Var, hd4 hd4Var, float f) {
        this.g = i;
        this.x = cy2Var;
        hd4Var.getClass();
        this.y = hd4Var;
        this.z = f;
        this.A = new vw3(0);
        this.B = new vw3(0);
        this.C = new vw3(2);
        xf4 xf4Var = new xf4(2);
        xf4Var.l = 32;
        this.D = xf4Var;
        this.E = new MediaCodec.BufferInfo();
        this.N = 1.0f;
        this.O = 1.0f;
        this.M = -9223372036854775807L;
        this.F = new ArrayDeque();
        this.u0 = jg4.f;
        xf4Var.j(0);
        xf4Var.e.order(ByteOrder.nativeOrder());
        pi1 pi1Var = new pi1();
        pi1Var.h = qf2.a;
        pi1Var.g = 0;
        pi1Var.f = 2;
        this.G = pi1Var;
        this.T = -1.0f;
        this.j0 = 0;
        this.b0 = -1;
        this.c0 = -1;
        this.a0 = -9223372036854775807L;
        this.p0 = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
        this.k0 = 0;
        this.l0 = 0;
        this.t0 = new n34();
        this.y0 = false;
        this.z0 = 0L;
    }

    public static boolean I(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public void A() {
        this.b0 = -1;
        this.B.e = null;
        this.c0 = -1;
        this.d0 = null;
        this.p0 = -9223372036854775807L;
        this.u0.e = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        this.a0 = -9223372036854775807L;
        this.n0 = false;
        this.Z = -9223372036854775807L;
        this.m0 = false;
        this.e0 = false;
        this.k0 = 0;
        this.l0 = 0;
        this.j0 = this.i0 ? 1 : 0;
        this.y0 = false;
        this.z0 = 0L;
    }

    public final void B() {
        A();
        this.U = null;
        this.W = null;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.o0 = false;
        this.T = -1.0f;
        this.X = false;
        this.Y = false;
        this.i0 = false;
        this.j0 = 0;
    }

    public ag4 C(IllegalStateException illegalStateException, bg4 bg4Var) {
        return new ag4(illegalStateException, bg4Var);
    }

    public int F(vw3 vw3Var) {
        return 0;
    }

    public boolean G(vw3 vw3Var) {
        return false;
    }

    public void H(long j) {
        this.v0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.F;
            if (arrayDeque.isEmpty() || j < ((jg4) arrayDeque.peek()).a) {
                return;
            }
            jg4 jg4Var = (jg4) arrayDeque.poll();
            jg4Var.getClass();
            i0(jg4Var);
            X();
        }
    }

    public final int J(ph4 ph4Var) throws b84 {
        try {
            return K(this.y, ph4Var);
        } catch (mg4 e) {
            throw m(e, ph4Var, false, 4002);
        }
    }

    public abstract int K(hd4 hd4Var, ph4 ph4Var);

    public final void L(long j, boolean z, boolean z2) {
        this.s = false;
        this.q = j;
        this.r = j;
        if (!z2) {
            li4 li4Var = this.n;
            li4Var.getClass();
            z2 = li4Var.f(j - this.p) != 0;
        }
        c(j, z, z2);
    }

    public abstract ArrayList M(hd4 hd4Var, ph4 ph4Var);

    public boolean N(ph4 ph4Var) {
        return false;
    }

    public abstract g4 O(bg4 bg4Var, ph4 ph4Var, float f);

    public abstract w34 P(bg4 bg4Var, ph4 ph4Var, ph4 ph4Var2);

    public long Q(long j, long j2) {
        if (this.m == 1) {
            return (t() || u()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public abstract float R(float f, ph4 ph4Var, ph4[] ph4VarArr);

    public abstract void S(long j, long j2, String str);

    public abstract void T(String str);

    public abstract void U(Exception exc);

    public w34 V(mr2 mr2Var) {
        int i;
        this.s0 = true;
        ph4 ph4Var = (ph4) mr2Var.h;
        ph4Var.getClass();
        String str = ph4Var.m;
        if (str == null) {
            throw m(new IllegalArgumentException("Sample MIME type is null."), ph4Var, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9")) && !ph4Var.p.isEmpty()) {
            gg4 gg4Var = new gg4(ph4Var);
            gg4Var.o = null;
            ph4Var = new ph4(gg4Var);
        }
        ph4 ph4Var2 = ph4Var;
        this.K = (ci3) mr2Var.g;
        this.H = ph4Var2;
        if (this.f0) {
            this.h0 = true;
            return null;
        }
        zf4 zf4Var = this.P;
        if (zf4Var == null) {
            this.U = null;
            v();
            return null;
        }
        bg4 bg4Var = this.W;
        bg4Var.getClass();
        ph4 ph4Var3 = this.Q;
        ph4Var3.getClass();
        ci3 ci3Var = this.J;
        ci3 ci3Var2 = this.K;
        if (ci3Var != ci3Var2) {
            g0();
            return new w34(bg4Var.a, ph4Var3, ph4Var2, 0, 128);
        }
        w34 w34VarP = P(bg4Var, ph4Var3, ph4Var2);
        int i2 = w34VarP.d;
        if (i2 != 0) {
            if (i2 == 1) {
                if (e0(ph4Var2)) {
                    this.Q = ph4Var2;
                    if (ci3Var2 != ci3Var) {
                        f0();
                    } else if (this.m0) {
                        this.k0 = 1;
                        this.l0 = 1;
                    }
                }
                i = 16;
            } else if (i2 != 2) {
                if (e0(ph4Var2)) {
                    this.Q = ph4Var2;
                    if (ci3Var2 != ci3Var) {
                        f0();
                    }
                }
                i = 16;
            } else {
                if (e0(ph4Var2)) {
                    this.i0 = true;
                    this.j0 = 1;
                    this.Q = ph4Var2;
                    if (ci3Var2 != ci3Var) {
                        f0();
                    }
                }
                i = 16;
            }
            return (i2 != 0 || (this.P == zf4Var && this.l0 != 3)) ? w34VarP : new w34(bg4Var.a, ph4Var3, ph4Var2, 0, i);
        }
        g0();
        i = 0;
        if (i2 != 0) {
        }
    }

    public abstract void W(ph4 ph4Var, MediaFormat mediaFormat);

    public abstract void X();

    public abstract boolean Y(long j, long j2, zf4 zf4Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ph4 ph4Var);

    public abstract void Z();

    public abstract void a0(vw3 vw3Var);

    public final void b0() {
        this.p0 = -9223372036854775807L;
        this.u0.e = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        this.h0 = false;
        this.D.i();
        this.C.i();
        this.g0 = false;
        pi1 pi1Var = this.G;
        pi1Var.getClass();
        pi1Var.h = qf2.a;
        pi1Var.g = 0;
        pi1Var.f = 2;
    }

    public void c(long j, boolean z, boolean z2) {
        if (z2) {
            this.q0 = false;
            this.r0 = false;
            if (this.f0) {
                b0();
            } else if (this.P != null) {
                if (y()) {
                    x();
                    v();
                } else if (z()) {
                    c0();
                } else {
                    this.y0 = true;
                }
            }
            ts tsVar = this.u0.d;
            if (tsVar.c() > 0) {
                this.s0 = true;
            }
            synchronized (tsVar) {
                tsVar.a = 0;
                tsVar.b = 0;
                Arrays.fill((Object[]) tsVar.d, (Object) null);
            }
            this.F.clear();
        }
    }

    public final void c0() {
        try {
            zf4 zf4Var = this.P;
            if (zf4Var == null) {
                throw null;
            }
            zf4Var.g();
        } finally {
            A();
        }
    }

    public abstract void d();

    public final boolean d0(int i) {
        mr2 mr2Var = this.h;
        mr2Var.g = null;
        mr2Var.h = null;
        vw3 vw3Var = this.A;
        vw3Var.i();
        int iN = n(mr2Var, vw3Var, i | 4);
        if (iN == -5) {
            V(mr2Var);
            return true;
        }
        if (iN != -4 || !vw3Var.h(4)) {
            return false;
        }
        this.q0 = true;
        h0();
        return false;
    }

    public final boolean e0(ph4 ph4Var) {
        if (this.P != null && this.l0 != 3 && this.m != 0) {
            float f = this.O;
            ph4Var.getClass();
            ph4[] ph4VarArr = this.o;
            ph4VarArr.getClass();
            float fR = R(f, ph4Var, ph4VarArr);
            float f2 = this.T;
            if (f2 != fR) {
                if (fR == -1.0f) {
                    g0();
                    return false;
                }
                if (f2 != -1.0f || fR > this.z) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fR);
                    zf4 zf4Var = this.P;
                    zf4Var.getClass();
                    zf4Var.c0(bundle);
                    this.T = fR;
                }
            }
        }
        return true;
    }

    public final boolean f0() {
        if (this.m0) {
            this.k0 = 1;
            this.l0 = 2;
            return true;
        }
        ci3 ci3Var = this.K;
        ci3Var.getClass();
        this.J = ci3Var;
        this.k0 = 0;
        this.l0 = 0;
        return true;
    }

    public final void g0() {
        if (this.m0) {
            this.k0 = 1;
            this.l0 = 3;
        } else {
            x();
            v();
        }
    }

    public abstract void h();

    public final void h0() {
        int i = this.l0;
        if (i == 1) {
            c0();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.r0 = true;
                Z();
                return;
            } else {
                x();
                v();
                return;
            }
        }
        c0();
        ci3 ci3Var = this.K;
        ci3Var.getClass();
        this.J = ci3Var;
        this.k0 = 0;
        this.l0 = 0;
    }

    public void i() {
        this.H = null;
        i0(jg4.f);
        this.F.clear();
        if (this.f0) {
            this.f0 = false;
            b0();
        } else {
            if (this.P == null) {
                return;
            }
            if (y()) {
                x();
            } else if (z()) {
                c0();
            } else {
                this.y0 = true;
            }
        }
    }

    public final void i0(jg4 jg4Var) {
        this.u0 = jg4Var;
        if (jg4Var.c != -9223372036854775807L) {
            this.w0 = true;
        }
    }

    public abstract void j();

    public final jg4 j0() {
        ArrayDeque arrayDeque = this.F;
        return !arrayDeque.isEmpty() ? (jg4) arrayDeque.getLast() : this.u0;
    }

    public abstract void k();

    public final boolean k0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        ph4 ph4Var = this.I;
        return ph4Var == null || !Objects.equals(ph4Var.m, "audio/opus") || j - j2 > 80000;
    }

    public final void l() {
        this.i.getClass();
    }

    public final void l0(ph4[] ph4VarArr, li4 li4Var, long j, long j2, kh4 kh4Var) {
        zt0.b0(!this.s);
        this.n = li4Var;
        this.v = kh4Var;
        if (this.r == Long.MIN_VALUE) {
            this.r = j;
        }
        this.o = ph4VarArr;
        this.p = j2;
        q0(ph4VarArr, j, j2, kh4Var);
    }

    public final b84 m(Exception exc, ph4 ph4Var, boolean z, int i) {
        int iJ;
        if (ph4Var == null || this.t) {
            iJ = 4;
        } else {
            this.t = true;
            try {
                iJ = J(ph4Var) & 7;
            } catch (b84 unused) {
            } finally {
                this.t = false;
            }
        }
        return new b84(1, exc, i, o(), this.j, ph4Var, ph4Var == null ? 4 : iJ, this.v, z);
    }

    public ob4 m0() {
        return null;
    }

    public final int n(mr2 mr2Var, vw3 vw3Var, int i) {
        li4 li4Var = this.n;
        li4Var.getClass();
        int iA = li4Var.a(mr2Var, vw3Var, i);
        if (iA == -4) {
            if (vw3Var.h(4)) {
                this.r = Long.MIN_VALUE;
                return this.s ? -4 : -3;
            }
            long j = vw3Var.g + this.p;
            vw3Var.g = j;
            this.r = Math.max(this.r, j);
            return iA;
        }
        if (iA == -5) {
            ph4 ph4Var = (ph4) mr2Var.h;
            ph4Var.getClass();
            long j2 = ph4Var.r;
            if (j2 != Long.MAX_VALUE) {
                gg4 gg4Var = new gg4(ph4Var);
                gg4Var.q = j2 + this.p;
                mr2Var.h = new ph4(gg4Var);
                return -5;
            }
        }
        return iA;
    }

    public final boolean n0() {
        return this.r == Long.MIN_VALUE;
    }

    public abstract String o();

    public final void o0() {
        synchronized (this.f) {
            this.w = null;
        }
    }

    public boolean p(long j) {
        return false;
    }

    public abstract void p0(boolean z, boolean z2);

    public void q(float f, float f2) {
        this.N = f;
        this.O = f2;
        e0(this.Q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q0(defpackage.ph4[] r12, long r13, long r15, defpackage.kh4 r17) {
        /*
            r11 = this;
            jg4 r12 = r11.u0
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            jg4 r4 = new jg4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.i0(r4)
            boolean r12 = r11.x0
            if (r12 == 0) goto L56
            r11.X()
            return
        L24:
            java.util.ArrayDeque r12 = r11.F
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.p0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.v0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            jg4 r4 = new jg4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.i0(r4)
            jg4 r12 = r11.u0
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.X()
        L56:
            return
        L57:
            jg4 r0 = new jg4
            long r1 = r11.p0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg4.q0(ph4[], long, long, kh4):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e3 A[Catch: IllegalStateException -> 0x00a6, CryptoException -> 0x00ab, TryCatch #5 {CryptoException -> 0x00ab, blocks: (B:130:0x022a, B:46:0x00a3, B:56:0x00b6, B:58:0x00ba, B:60:0x00c0, B:64:0x00d8, B:65:0x00e7, B:69:0x00f4, B:71:0x00fa, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:125:0x021b, B:127:0x021f, B:73:0x010c, B:75:0x0113, B:76:0x0127, B:78:0x0137, B:82:0x0146, B:83:0x014e, B:86:0x0154, B:88:0x0158, B:90:0x0162, B:92:0x016c, B:93:0x0194, B:94:0x019c, B:95:0x019d, B:97:0x01a4, B:99:0x01ac, B:101:0x01b4, B:102:0x01bb, B:107:0x01ce, B:109:0x01dc, B:114:0x01f3, B:118:0x01fe, B:112:0x01e3, B:119:0x0201, B:133:0x0235, B:135:0x0242, B:136:0x0250, B:138:0x0254, B:144:0x0267, B:148:0x0270, B:150:0x0276, B:151:0x028a, B:152:0x028b, B:154:0x028f, B:156:0x0293, B:158:0x0297, B:159:0x029a, B:161:0x02a0, B:163:0x02b1, B:166:0x02c1, B:168:0x02ce, B:170:0x02d4, B:173:0x02e7, B:175:0x02f1, B:176:0x0300, B:178:0x030e, B:180:0x0312, B:182:0x0316, B:184:0x0322, B:189:0x032d, B:191:0x0331, B:194:0x033f, B:196:0x0343, B:200:0x034e, B:202:0x0356, B:206:0x035f, B:192:0x033b, B:185:0x0325, B:187:0x0329), top: B:398:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fa A[LOOP:4: B:65:0x00e7->B:117:0x01fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03bc A[Catch: CryptoException -> 0x0010, IllegalStateException -> 0x007e, TryCatch #3 {CryptoException -> 0x0010, blocks: (B:3:0x0003, B:5:0x0007, B:12:0x0014, B:14:0x0019, B:16:0x001f, B:23:0x0041, B:25:0x0060, B:27:0x0074, B:38:0x0091, B:33:0x0086, B:226:0x03bc, B:235:0x03e5, B:237:0x03e9, B:239:0x03ee, B:243:0x03f6, B:245:0x03fa, B:247:0x0402, B:249:0x0410, B:252:0x0415, B:254:0x0419, B:257:0x042c, B:258:0x042f, B:261:0x0434, B:263:0x0438, B:265:0x0440, B:267:0x044e, B:268:0x0454, B:269:0x0455, B:270:0x0458, B:271:0x0459, B:273:0x045d, B:209:0x0383, B:211:0x0389, B:216:0x0399, B:218:0x039d, B:220:0x03a1, B:221:0x03ac, B:223:0x03b4), top: B:395:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03d2 A[LOOP:0: B:136:0x0250->B:233:0x03d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05a4 A[Catch: IllegalStateException -> 0x047f, CryptoException -> 0x0482, TryCatch #13 {CryptoException -> 0x0482, IllegalStateException -> 0x047f, blocks: (B:365:0x05e6, B:359:0x05c0, B:275:0x0468, B:278:0x046f, B:280:0x0475, B:287:0x0488, B:289:0x048c, B:290:0x0491, B:350:0x05a4, B:292:0x0498, B:294:0x049e, B:296:0x04aa, B:297:0x04af, B:299:0x04b5, B:300:0x04ba, B:302:0x04be, B:303:0x04cf, B:305:0x04d3, B:307:0x04d9, B:309:0x04e0, B:310:0x04e3, B:312:0x04e9, B:314:0x04ef, B:315:0x04f4, B:317:0x04fa, B:319:0x0504, B:320:0x050a, B:321:0x050b, B:323:0x0519, B:327:0x0524, B:328:0x052c, B:330:0x0537, B:331:0x053a, B:333:0x053e, B:335:0x0546, B:336:0x0550, B:338:0x0557, B:340:0x0564, B:344:0x0583, B:341:0x0572, B:343:0x0578, B:345:0x0593, B:347:0x0595, B:358:0x05bf, B:361:0x05c8, B:363:0x05cc, B:364:0x05cd), top: B:398:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05b9 A[LOOP:1: B:235:0x03e5->B:356:0x05b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x05c0 A[EDGE_INSN: B:417:0x05c0->B:359:0x05c0 BREAK  A[LOOP:1: B:235:0x03e5->B:356:0x05b9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0154 A[Catch: IllegalStateException -> 0x00a6, CryptoException -> 0x00ab, TRY_ENTER, TryCatch #5 {CryptoException -> 0x00ab, blocks: (B:130:0x022a, B:46:0x00a3, B:56:0x00b6, B:58:0x00ba, B:60:0x00c0, B:64:0x00d8, B:65:0x00e7, B:69:0x00f4, B:71:0x00fa, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:125:0x021b, B:127:0x021f, B:73:0x010c, B:75:0x0113, B:76:0x0127, B:78:0x0137, B:82:0x0146, B:83:0x014e, B:86:0x0154, B:88:0x0158, B:90:0x0162, B:92:0x016c, B:93:0x0194, B:94:0x019c, B:95:0x019d, B:97:0x01a4, B:99:0x01ac, B:101:0x01b4, B:102:0x01bb, B:107:0x01ce, B:109:0x01dc, B:114:0x01f3, B:118:0x01fe, B:112:0x01e3, B:119:0x0201, B:133:0x0235, B:135:0x0242, B:136:0x0250, B:138:0x0254, B:144:0x0267, B:148:0x0270, B:150:0x0276, B:151:0x028a, B:152:0x028b, B:154:0x028f, B:156:0x0293, B:158:0x0297, B:159:0x029a, B:161:0x02a0, B:163:0x02b1, B:166:0x02c1, B:168:0x02ce, B:170:0x02d4, B:173:0x02e7, B:175:0x02f1, B:176:0x0300, B:178:0x030e, B:180:0x0312, B:182:0x0316, B:184:0x0322, B:189:0x032d, B:191:0x0331, B:194:0x033f, B:196:0x0343, B:200:0x034e, B:202:0x0356, B:206:0x035f, B:192:0x033b, B:185:0x0325, B:187:0x0329), top: B:398:0x002b }] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v3, types: [vw3] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r31v0, types: [kg4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(long r32, long r34) {
        /*
            Method dump skipped, instructions count: 1604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg4.s(long, long):void");
    }

    public abstract boolean t();

    public abstract boolean u();

    /* JADX WARN: Can't wrap try/catch for region: R(16:(5:194|65|e8|72|(2:182|74)(1:78))(1:85)|183|86|188|87|196|88|89|(1:91)|92|93|(1:98)(1:97)|99|(1:122)(1:114)|123|(7:125|126|(1:128)|129|130|208|131)(3:206|135|136)) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0220, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0221, code lost:
    
        r8 = r1;
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0222, code lost:
    
        r3 = r0;
        r8 = r8;
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0226, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0227, code lost:
    
        r8 = r8;
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0228, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0279 A[Catch: ig4 -> 0x0293, TryCatch #4 {ig4 -> 0x0293, blocks: (B:152:0x0247, B:154:0x0279, B:157:0x0286, B:159:0x0290, B:163:0x02aa, B:166:0x02b2, B:167:0x02b4, B:162:0x0295, B:169:0x02b8, B:170:0x02b9, B:172:0x02c0, B:173:0x02c1, B:174:0x02cb, B:176:0x02ce), top: B:187:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0290 A[Catch: ig4 -> 0x0293, TryCatch #4 {ig4 -> 0x0293, blocks: (B:152:0x0247, B:154:0x0279, B:157:0x0286, B:159:0x0290, B:163:0x02aa, B:166:0x02b2, B:167:0x02b4, B:162:0x0295, B:169:0x02b8, B:170:0x02b9, B:172:0x02c0, B:173:0x02c1, B:174:0x02cb, B:176:0x02ce), top: B:187:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0295 A[Catch: ig4 -> 0x0293, TryCatch #4 {ig4 -> 0x0293, blocks: (B:152:0x0247, B:154:0x0279, B:157:0x0286, B:159:0x0290, B:163:0x02aa, B:166:0x02b2, B:167:0x02b4, B:162:0x0295, B:169:0x02b8, B:170:0x02b9, B:172:0x02c0, B:173:0x02c1, B:174:0x02cb, B:176:0x02ce), top: B:187:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kg4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg4.v():void");
    }

    public boolean w(bg4 bg4Var) {
        return true;
    }

    public final void x() {
        try {
            zf4 zf4Var = this.P;
            if (zf4Var != null) {
                zf4Var.k();
                this.t0.b++;
                bg4 bg4Var = this.W;
                if (bg4Var == null) {
                    throw null;
                }
                T(bg4Var.a);
            }
            this.P = null;
            this.J = null;
            B();
        } catch (Throwable th) {
            this.P = null;
            this.J = null;
            B();
            throw th;
        }
    }

    public boolean y() {
        int i = this.l0;
        if (i == 3 || (this.X && !this.o0)) {
            return true;
        }
        if (i == 2) {
            try {
                ci3 ci3Var = this.K;
                ci3Var.getClass();
                this.J = ci3Var;
                this.k0 = 0;
                this.l0 = 0;
            } catch (b84 e) {
                a30.z("Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    public boolean z() {
        return true;
    }

    public void r() {
    }

    public void D(ph4 ph4Var) {
    }

    public void E(vw3 vw3Var) {
    }
}
