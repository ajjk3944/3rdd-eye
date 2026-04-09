package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sd1 extends kg4 {
    public static final int[] m1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean n1;
    public static boolean o1;
    public final Context A0;
    public final boolean B0;
    public final gw3 C0;
    public final boolean D0;
    public final de1 E0;
    public final ib1 F0;
    public final long G0;
    public final PriorityQueue H0;
    public zq I0;
    public boolean J0;
    public boolean K0;
    public pe1 L0;
    public boolean M0;
    public int N0;
    public List O0;
    public Surface P0;
    public ud1 Q0;
    public uz2 R0;
    public boolean S0;
    public int T0;
    public int U0;
    public long V0;
    public int W0;
    public int X0;
    public int Y0;
    public kc4 Z0;
    public boolean a1;
    public long b1;
    public int c1;
    public long d1;
    public t82 e1;
    public t82 f1;
    public int g1;
    public int h1;
    public be1 i1;
    public long j1;
    public long k1;
    public boolean l1;

    public sd1(zb1 zb1Var) {
        super(2, (cy2) zb1Var.i, (hd4) zb1Var.h, 30.0f);
        Context applicationContext = ((Context) zb1Var.g).getApplicationContext();
        this.A0 = applicationContext;
        this.L0 = null;
        this.C0 = new gw3((Handler) zb1Var.j, (oa4) zb1Var.k);
        this.B0 = this.L0 == null;
        this.E0 = new de1(applicationContext, this);
        this.F0 = new ib1();
        this.D0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.R0 = uz2.c;
        this.T0 = 1;
        this.U0 = 0;
        this.e1 = t82.d;
        this.h1 = 0;
        this.f1 = null;
        this.g1 = -1000;
        this.j1 = -9223372036854775807L;
        this.k1 = -9223372036854775807L;
        this.H0 = new PriorityQueue();
        this.G0 = -9223372036854775807L;
        this.Z0 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int s0(defpackage.bg4 r8, defpackage.ph4 r9) {
        /*
            int r0 = r9.t
            int r1 = r9.u
            r2 = -1
            if (r0 == r2) goto Lcc
            if (r1 != r2) goto Lb
            goto Lcc
        Lb:
            java.lang.String r3 = r9.m
            r3.getClass()
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/av01"
            java.lang.String r7 = "video/hevc"
            if (r4 == 0) goto L42
            java.util.HashMap r3 = defpackage.og4.a
            android.util.Pair r9 = defpackage.mo2.b(r9)
            if (r9 == 0) goto L41
            java.lang.Object r9 = r9.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r9 == r3) goto L3f
            r3 = 1
            if (r9 == r3) goto L3f
            r3 = 2
            if (r9 != r3) goto L39
            goto L3f
        L39:
            r3 = 1024(0x400, float:1.435E-42)
            if (r9 != r3) goto L41
            r3 = r6
            goto L42
        L3f:
            r3 = r5
            goto L42
        L41:
            r3 = r7
        L42:
            int r9 = r3.hashCode()
            r4 = 4
            switch(r9) {
                case -1664118616: goto Lbf;
                case -1662735862: goto Lb8;
                case -1662541442: goto La7;
                case 1187890754: goto L9e;
                case 1331836730: goto L61;
                case 1599127256: goto L58;
                case 1599127257: goto L4c;
                default: goto L4a;
            }
        L4a:
            goto Lcc
        L4c:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            r4 = 8
            goto Lc7
        L58:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            goto Lc7
        L61:
            boolean r9 = r3.equals(r5)
            if (r9 == 0) goto Lcc
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lcc
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = android.os.Build.MANUFACTURER
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8f
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lcc
            java.lang.String r3 = "AFTS"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L8f
            boolean r8 = r8.f
            if (r8 != 0) goto Lcc
        L8f:
            java.lang.String r8 = defpackage.v23.a
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r1 = r1 * r0
            int r1 = r1 * 768
            int r1 = r1 / r4
            return r1
        L9e:
            java.lang.String r8 = "video/mp4v-es"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            goto Lc7
        La7:
            boolean r8 = r3.equals(r7)
            if (r8 == 0) goto Lcc
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            r8 = 2097152(0x200000, float:2.938736E-39)
            int r8 = java.lang.Math.max(r8, r0)
            return r8
        Lb8:
            boolean r8 = r3.equals(r6)
            if (r8 == 0) goto Lcc
            goto Lc7
        Lbf:
            java.lang.String r8 = "video/3gpp"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
        Lc7:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            return r0
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd1.s0(bg4, ph4):int");
    }

    public static int x0(bg4 bg4Var, ph4 ph4Var) {
        int i = ph4Var.n;
        if (i == -1) {
            return s0(bg4Var, ph4Var);
        }
        List list = ph4Var.p;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return i + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0656 A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean y0(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 2286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd1.y0(java.lang.String):boolean");
    }

    public static List z0(Context context, hd4 hd4Var, ph4 ph4Var, boolean z, boolean z2) {
        List listA;
        String str = ph4Var.m;
        if (str == null) {
            return sn3.j;
        }
        if ("video/dolby-vision".equals(str) && !i30.e0(context)) {
            String strC = og4.c(ph4Var);
            if (strC == null) {
                listA = sn3.j;
            } else {
                hd4Var.getClass();
                listA = og4.a(strC, z, z2);
            }
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return og4.b(hd4Var, ph4Var, z, z2);
    }

    @Override // defpackage.kg4
    public final void A() {
        super.A();
        this.H0.clear();
        this.Y0 = 0;
        this.a1 = false;
    }

    public final void A0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.P0;
        gw3 gw3Var = this.C0;
        if (surface2 == surface) {
            if (surface != null) {
                t82 t82Var = this.f1;
                if (t82Var != null) {
                    gw3Var.F(t82Var);
                }
                Surface surface3 = this.P0;
                if (surface3 == null || !this.S0 || (handler = (Handler) gw3Var.g) == null) {
                    return;
                }
                handler.post(new le1(gw3Var, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.P0 = surface;
        pe1 pe1Var = this.L0;
        de1 de1Var = this.E0;
        if (pe1Var == null) {
            de1Var.d(surface);
        }
        this.S0 = false;
        int i = this.m;
        zf4 zf4Var = this.P;
        if (zf4Var != null && this.L0 == null) {
            bg4 bg4Var = this.W;
            bg4Var.getClass();
            if (!C0(bg4Var) || this.J0) {
                x();
                v();
            } else {
                Surface surfaceD0 = D0(bg4Var);
                if (surfaceD0 != null) {
                    zf4Var.q(surfaceD0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zf4Var.o();
                }
            }
        }
        if (surface != null) {
            t82 t82Var2 = this.f1;
            if (t82Var2 != null) {
                gw3Var.F(t82Var2);
            }
        } else {
            this.f1 = null;
            pe1 pe1Var2 = this.L0;
            if (pe1Var2 != null) {
                pe1Var2.m();
            }
        }
        if (i == 2) {
            pe1 pe1Var3 = this.L0;
            if (pe1Var3 != null) {
                pe1Var3.x0(true);
            } else {
                de1Var.i = true;
                de1Var.h = -9223372036854775807L;
            }
        }
    }

    public final boolean B0(vw3 vw3Var) {
        if (n0() || vw3Var.h(536870912)) {
            return true;
        }
        long j = this.k1;
        return j == -9223372036854775807L || j - (vw3Var.g - this.u0.c) <= 100000;
    }

    @Override // defpackage.kg4
    public final ag4 C(IllegalStateException illegalStateException, bg4 bg4Var) {
        Surface surface = this.P0;
        pd1 pd1Var = new pd1(illegalStateException, bg4Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return pd1Var;
    }

    public final boolean C0(bg4 bg4Var) {
        if (this.L0 != null) {
            return true;
        }
        Surface surface = this.P0;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && bg4Var.h) {
            return true;
        }
        if (y0(bg4Var.a)) {
            return false;
        }
        return !bg4Var.f || ud1.a();
    }

    @Override // defpackage.kg4
    public final void D(ph4 ph4Var) throws b84 {
        pe1 pe1Var = this.L0;
        if (pe1Var == null || pe1Var.b()) {
            return;
        }
        try {
            pe1Var.A0(ph4Var);
        } catch (oe1 e) {
            throw m(e, ph4Var, false, 7000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.Surface D0(defpackage.bg4 r7) {
        /*
            r6 = this;
            pe1 r0 = r6.L0
            if (r0 == 0) goto L9
            android.view.Surface r7 = r0.k()
            return r7
        L9:
            android.view.Surface r0 = r6.P0
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r7.h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            java.lang.String r0 = r7.a
            boolean r0 = y0(r0)
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L31
            boolean r0 = r7.f
            if (r0 == 0) goto L2f
            boolean r0 = defpackage.ud1.a()
            if (r0 != 0) goto L2f
            goto L31
        L2f:
            r0 = r3
            goto L32
        L31:
            r0 = r1
        L32:
            defpackage.zt0.b0(r0)
            ud1 r0 = r6.Q0
            if (r0 == 0) goto L46
            boolean r4 = r7.f
            boolean r5 = r0.f
            if (r5 == r4) goto L46
            if (r0 == 0) goto L46
            r0.release()
            r6.Q0 = r2
        L46:
            ud1 r0 = r6.Q0
            if (r0 != 0) goto Lbc
            boolean r7 = r7.f
            if (r7 == 0) goto L58
            boolean r0 = defpackage.ud1.a()
            if (r0 == 0) goto L56
        L54:
            r0 = r3
            goto L5b
        L56:
            r0 = r1
            goto L5b
        L58:
            int r0 = defpackage.ud1.i
            goto L54
        L5b:
            defpackage.zt0.b0(r0)
            td1 r0 = new td1
            java.lang.String r2 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r2)
            if (r7 == 0) goto L6a
            int r7 = defpackage.ud1.i
            goto L6b
        L6a:
            r7 = r1
        L6b:
            r0.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r2.<init>(r4, r0)
            r0.g = r2
            jq2 r4 = new jq2
            r4.<init>(r2)
            r0.f = r4
            monitor-enter(r0)
            android.os.Handler r2 = r0.g     // Catch: java.lang.Throwable -> L9a
            android.os.Message r7 = r2.obtainMessage(r3, r7, r1)     // Catch: java.lang.Throwable -> L9a
            r7.sendToTarget()     // Catch: java.lang.Throwable -> L9a
        L8a:
            ud1 r7 = r0.j     // Catch: java.lang.Throwable -> L9a
            if (r7 != 0) goto L9e
            java.lang.RuntimeException r7 = r0.i     // Catch: java.lang.Throwable -> L9a
            if (r7 != 0) goto L9e
            java.lang.Error r7 = r0.h     // Catch: java.lang.Throwable -> L9a
            if (r7 != 0) goto L9e
            r0.wait()     // Catch: java.lang.Throwable -> L9a java.lang.InterruptedException -> L9c
            goto L8a
        L9a:
            r7 = move-exception
            goto Lba
        L9c:
            r1 = r3
            goto L8a
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto La8
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        La8:
            java.lang.RuntimeException r7 = r0.i
            if (r7 != 0) goto Lb9
            java.lang.Error r7 = r0.h
            if (r7 != 0) goto Lb8
            ud1 r7 = r0.j
            r7.getClass()
            r6.Q0 = r7
            goto Lbc
        Lb8:
            throw r7
        Lb9:
            throw r7
        Lba:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
            throw r7
        Lbc:
            ud1 r7 = r6.Q0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd1.D0(bg4):android.view.Surface");
    }

    @Override // defpackage.kg4
    public final void E(vw3 vw3Var) {
        int iF = F(vw3Var);
        if (Build.VERSION.SDK_INT < 34 || (iF & 32) == 0) {
            this.Y0++;
        }
    }

    @Override // defpackage.kg4
    public final int F(vw3 vw3Var) {
        return (Build.VERSION.SDK_INT < 34 || this.Z0 == null || vw3Var.g >= this.q || B0(vw3Var)) ? 0 : 32;
    }

    @Override // defpackage.kg4
    public final boolean G(vw3 vw3Var) {
        boolean z = false;
        if (!B0(vw3Var)) {
            if (vw3Var.g < this.q) {
                if (!vw3Var.h(268435456)) {
                    if (vw3Var.h(67108864)) {
                        vw3Var.i();
                        z = true;
                    }
                    if (z) {
                        this.t0.d++;
                    }
                }
            }
            return z;
        }
        return false;
    }

    @Override // defpackage.kg4
    public final void H(long j) {
        super.H(j);
        this.Y0--;
    }

    @Override // defpackage.kg4
    public final int K(hd4 hd4Var, ph4 ph4Var) {
        boolean z;
        String str = ph4Var.m;
        if (!pp1.b(str)) {
            return 128;
        }
        int i = 0;
        boolean z2 = ph4Var.q != null;
        Context context = this.A0;
        List listZ0 = z0(context, hd4Var, ph4Var, z2, false);
        if (z2 && listZ0.isEmpty()) {
            listZ0 = z0(context, hd4Var, ph4Var, false, false);
        }
        if (listZ0.isEmpty()) {
            return 129;
        }
        if (ph4Var.L != 0) {
            return 130;
        }
        bg4 bg4Var = (bg4) listZ0.get(0);
        boolean zB = bg4Var.b(ph4Var);
        if (zB) {
            z = true;
        } else {
            for (int i2 = 1; i2 < listZ0.size(); i2++) {
                bg4 bg4Var2 = (bg4) listZ0.get(i2);
                if (bg4Var2.b(ph4Var)) {
                    zB = true;
                    z = false;
                    bg4Var = bg4Var2;
                    break;
                }
            }
            z = true;
        }
        int i3 = true != zB ? 3 : 4;
        int i4 = true != bg4Var.c(ph4Var) ? 8 : 16;
        int i5 = true != bg4Var.g ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if ("video/dolby-vision".equals(str) && !i30.e0(context)) {
            i6 = 256;
        }
        if (zB) {
            List listZ02 = z0(context, hd4Var, ph4Var, z2, true);
            if (!listZ02.isEmpty()) {
                HashMap map = og4.a;
                ArrayList arrayList = new ArrayList(listZ02);
                Collections.sort(arrayList, new sb3(1, new ld4(ph4Var)));
                bg4 bg4Var3 = (bg4) arrayList.get(0);
                if (bg4Var3.b(ph4Var) && bg4Var3.c(ph4Var)) {
                    i = 32;
                }
            }
        }
        return i3 | i4 | i | i5 | i6;
    }

    @Override // defpackage.kg4
    public final ArrayList M(hd4 hd4Var, ph4 ph4Var) {
        List listZ0 = z0(this.A0, hd4Var, ph4Var, false, false);
        HashMap map = og4.a;
        ArrayList arrayList = new ArrayList(listZ0);
        Collections.sort(arrayList, new sb3(1, new ld4(ph4Var)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        r1 = null;
     */
    @Override // defpackage.kg4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.g4 O(defpackage.bg4 r22, defpackage.ph4 r23, float r24) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd1.O(bg4, ph4, float):g4");
    }

    @Override // defpackage.kg4
    public final w34 P(bg4 bg4Var, ph4 ph4Var, ph4 ph4Var2) {
        int i;
        int i2;
        w34 w34VarD = bg4Var.d(ph4Var, ph4Var2);
        int i3 = w34VarD.e;
        zq zqVar = this.I0;
        zqVar.getClass();
        if (ph4Var2.t > zqVar.a || ph4Var2.u > zqVar.b) {
            i3 |= 256;
        }
        if (x0(bg4Var, ph4Var2) > zqVar.c) {
            i3 |= 64;
        }
        String str = bg4Var.a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = w34VarD.d;
        }
        return new w34(str, ph4Var, ph4Var2, i2, i);
    }

    @Override // defpackage.kg4
    public final float R(float f, ph4 ph4Var, ph4[] ph4VarArr) {
        bg4 bg4Var;
        float fMax = -1.0f;
        for (ph4 ph4Var2 : ph4VarArr) {
            float f2 = ph4Var2.x;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.Z0 == null || (bg4Var = this.W) == null) {
            return f3;
        }
        int i = ph4Var.t;
        int i2 = ph4Var.u;
        float f4 = -3.4028235E38f;
        if (bg4Var.i) {
            float f5 = bg4Var.l;
            if (f5 != -3.4028235E38f && bg4Var.j == i && bg4Var.k == i2) {
                f4 = f5;
            } else {
                f4 = 1024.0f;
                if (!bg4Var.e(i, i2, 1024.0d)) {
                    float f6 = 0.0f;
                    while (true) {
                        float f7 = f4 - f6;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f6;
                        boolean zE = bg4Var.e(i, i2, f8);
                        if (true == zE) {
                            f6 = f8;
                        }
                        if (true != zE) {
                            f4 = f8;
                        }
                    }
                    f4 = f6;
                }
                bg4Var.l = f4;
                bg4Var.j = i;
                bg4Var.k = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    @Override // defpackage.kg4
    public final void S(long j, long j2, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        gw3 gw3Var = this.C0;
        Handler handler = (Handler) gw3Var.g;
        if (handler != null) {
            str2 = str;
            handler.post(new je1(gw3Var, str2, j, j2));
        } else {
            str2 = str;
        }
        this.J0 = y0(str2);
        bg4 bg4Var = this.W;
        bg4Var.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(bg4Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = bg4Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.K0 = z;
    }

    @Override // defpackage.kg4
    public final void T(String str) {
        gw3 gw3Var = this.C0;
        Handler handler = (Handler) gw3Var.g;
        if (handler != null) {
            handler.post(new je1(gw3Var, str, 2));
        }
    }

    @Override // defpackage.kg4
    public final void U(Exception exc) {
        a30.C("MediaCodecVideoRenderer", "Video codec error", exc);
        gw3 gw3Var = this.C0;
        Handler handler = (Handler) gw3Var.g;
        if (handler != null) {
            handler.post(new je1(gw3Var, exc, 3));
        }
    }

    @Override // defpackage.kg4
    public final w34 V(mr2 mr2Var) {
        w34 w34VarV = super.V(mr2Var);
        ph4 ph4Var = (ph4) mr2Var.h;
        ph4Var.getClass();
        gw3 gw3Var = this.C0;
        Handler handler = (Handler) gw3Var.g;
        if (handler != null) {
            handler.post(new gi(gw3Var, ph4Var, w34VarV, 10));
        }
        return w34VarV;
    }

    @Override // defpackage.kg4
    public final void W(ph4 ph4Var, MediaFormat mediaFormat) {
        zf4 zf4Var = this.P;
        if (zf4Var != null) {
            zf4Var.f(this.T0);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = ph4Var.z;
        int i = ph4Var.y;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.e1 = new t82(f, integer, integer2);
        pe1 pe1Var = this.L0;
        if (pe1Var == null || !this.l1) {
            this.E0.e(ph4Var.x);
        } else {
            gg4 gg4Var = new gg4(ph4Var);
            gg4Var.s = integer;
            gg4Var.t = integer2;
            gg4Var.y = f;
            ph4 ph4Var2 = new ph4(gg4Var);
            int i3 = this.N0;
            List list = this.O0;
            if (list == null) {
                list = sn3.j;
            }
            pe1Var.u0(ph4Var2, this.u0.b, i3, list);
            this.N0 = 2;
        }
        this.l1 = false;
    }

    @Override // defpackage.kg4
    public final void X() {
        pe1 pe1Var = this.L0;
        if (pe1Var != null) {
            pe1Var.j();
            long j = this.j1;
            if (j == -9223372036854775807L) {
                j = this.u0.b;
                this.j1 = j;
            }
            this.L0.y0(-j);
        } else {
            this.E0.a(2);
        }
        this.l1 = true;
    }

    @Override // defpackage.kg4
    public final boolean Y(long j, long j2, zf4 zf4Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ph4 ph4Var) {
        int i4;
        zf4Var.getClass();
        long j4 = j3 - this.u0.c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.H0;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i5++;
        }
        u0(i5, 0);
        pe1 pe1Var = this.L0;
        if (pe1Var != null) {
            if (!z || z2) {
                return pe1Var.r0(j3, new rd1(this, zf4Var, i, j4));
            }
            t0(zf4Var, i);
            return true;
        }
        long j5 = this.u0.b;
        de1 de1Var = this.E0;
        ib1 ib1Var = this.F0;
        int iG = de1Var.g(j3, j, j2, j5, z, z2, ib1Var);
        if (iG == 0) {
            this.l.getClass();
            long jNanoTime = System.nanoTime();
            be1 be1Var = this.i1;
            if (be1Var != null) {
                be1Var.b(j4, jNanoTime, ph4Var, this.R);
            }
            w0(zf4Var, i, jNanoTime);
            v0(ib1Var.a);
            return true;
        }
        if (iG != 1) {
            if (iG != 2) {
                if (iG != 3) {
                    return false;
                }
                t0(zf4Var, i);
                v0(ib1Var.a);
                return true;
            }
            Trace.beginSection("dropVideoBuffer");
            zf4Var.I(i);
            Trace.endSection();
            u0(0, 1);
            v0(ib1Var.a);
            return true;
        }
        long j6 = ib1Var.b;
        long j7 = ib1Var.a;
        if (j6 == this.d1) {
            t0(zf4Var, i);
        } else {
            be1 be1Var2 = this.i1;
            if (be1Var2 != null) {
                i4 = i;
                be1Var2.b(j4, j6, ph4Var, this.R);
            } else {
                i4 = i;
            }
            w0(zf4Var, i4, j6);
        }
        v0(j7);
        this.d1 = j6;
        return true;
    }

    @Override // defpackage.kg4
    public final void Z() {
        pe1 pe1Var = this.L0;
        if (pe1Var != null) {
            pe1Var.j();
        }
    }

    @Override // defpackage.fc4
    public final void a(int i, Object obj) {
        if (i == 1) {
            A0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            be1 be1Var = (be1) obj;
            this.i1 = be1Var;
            pe1 pe1Var = this.L0;
            if (pe1Var != null) {
                pe1Var.q0(be1Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.h1 != iIntValue) {
                this.h1 = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.T0 = iIntValue2;
            zf4 zf4Var = this.P;
            if (zf4Var != null) {
                zf4Var.f(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.U0 = iIntValue3;
            pe1 pe1Var2 = this.L0;
            if (pe1Var2 != null) {
                pe1Var2.t0(iIntValue3);
                return;
            }
            he1 he1Var = this.E0.b;
            if (he1Var.j == iIntValue3) {
                return;
            }
            he1Var.j = iIntValue3;
            he1Var.c(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(m62.a)) {
                pe1 pe1Var3 = this.L0;
                if (pe1Var3 == null || !pe1Var3.b()) {
                    return;
                }
                pe1Var3.c();
                return;
            }
            this.O0 = list;
            pe1 pe1Var4 = this.L0;
            if (pe1Var4 != null) {
                pe1Var4.v0(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            uz2 uz2Var = (uz2) obj;
            if (uz2Var.a == 0 || uz2Var.b == 0) {
                return;
            }
            this.R0 = uz2Var;
            pe1 pe1Var5 = this.L0;
            if (pe1Var5 != null) {
                Surface surface = this.P0;
                surface.getClass();
                pe1Var5.z0(surface, uz2Var);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.g1 = ((Integer) obj).intValue();
                zf4 zf4Var2 = this.P;
                if (zf4Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.g1));
                    zf4Var2.c0(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.P0;
                A0(null);
                obj.getClass();
                ((sd1) obj).a(1, surface2);
                break;
            case 18:
                boolean z = this.Z0 != null;
                kc4 kc4Var = (kc4) obj;
                this.Z0 = kc4Var;
                if (z != (kc4Var != null)) {
                    e0(this.Q);
                    break;
                }
                break;
            default:
                if (i == 11) {
                    za4 za4Var = (za4) obj;
                    za4Var.getClass();
                    this.L = za4Var;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.kg4
    public final void a0(vw3 vw3Var) {
        if (this.K0) {
            ByteBuffer byteBuffer = vw3Var.h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zf4 zf4Var = this.P;
                        zf4Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zf4Var.c0(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.kg4
    public final void c(long j, boolean z, boolean z2) {
        pe1 pe1Var = this.L0;
        if (pe1Var != null && !z) {
            pe1Var.o0(true);
        }
        super.c(j, z, z2);
        pe1 pe1Var2 = this.L0;
        de1 de1Var = this.E0;
        if (pe1Var2 == null) {
            he1 he1Var = de1Var.b;
            he1Var.m = 0L;
            he1Var.p = -1L;
            he1Var.n = -1L;
            de1Var.g = -9223372036854775807L;
            de1Var.e = -9223372036854775807L;
            de1Var.d = Math.min(de1Var.d, 1);
            de1Var.h = -9223372036854775807L;
        }
        if (z) {
            pe1 pe1Var3 = this.L0;
            if (pe1Var3 != null) {
                pe1Var3.x0(false);
            } else {
                de1Var.i = false;
                de1Var.h = -9223372036854775807L;
            }
        }
        this.X0 = 0;
    }

    @Override // defpackage.kg4
    public final void d() {
        this.W0 = 0;
        this.l.getClass();
        this.V0 = SystemClock.elapsedRealtime();
        this.b1 = 0L;
        this.c1 = 0;
        pe1 pe1Var = this.L0;
        if (pe1Var != null) {
            pe1Var.a();
        } else {
            this.E0.b();
        }
    }

    @Override // defpackage.kg4
    public final void h() {
        int i = this.W0;
        final gw3 gw3Var = this.C0;
        if (i > 0) {
            this.l.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j = jElapsedRealtime - this.V0;
            final int i2 = this.W0;
            Handler handler = (Handler) gw3Var.g;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ke1
                    @Override // java.lang.Runnable
                    public final void run() {
                        gw3 gw3Var2 = gw3Var;
                        gw3Var2.getClass();
                        String str = v23.a;
                        md4 md4Var = ((oa4) gw3Var2.h).f.y;
                        ad4 ad4VarX = md4Var.x((kh4) md4Var.i.k);
                        md4Var.s(ad4VarX, 1018, new h80(ad4VarX, i2, j));
                    }
                });
            }
            this.W0 = 0;
            this.V0 = jElapsedRealtime;
        }
        int i3 = this.c1;
        if (i3 != 0) {
            long j2 = this.b1;
            Handler handler2 = (Handler) gw3Var.g;
            if (handler2 != null) {
                handler2.post(new je1(i3, j2, gw3Var));
            }
            this.b1 = 0L;
            this.c1 = 0;
        }
        pe1 pe1Var = this.L0;
        if (pe1Var != null) {
            pe1Var.d();
        } else {
            this.E0.c();
        }
    }

    @Override // defpackage.kg4
    public final void i() {
        gw3 gw3Var = this.C0;
        this.f1 = null;
        this.k1 = -9223372036854775807L;
        this.S0 = false;
        this.a1 = true;
        try {
            super.i();
            n34 n34Var = this.t0;
            gw3Var.getClass();
            synchronized (n34Var) {
            }
            Handler handler = (Handler) gw3Var.g;
            if (handler != null) {
                handler.post(new jq3(gw3Var, n34Var, 21));
            }
            gw3Var.F(t82.d);
        } catch (Throwable th) {
            n34 n34Var2 = this.t0;
            gw3Var.getClass();
            synchronized (n34Var2) {
                Handler handler2 = (Handler) gw3Var.g;
                if (handler2 != null) {
                    handler2.post(new jq3(gw3Var, n34Var2, 21));
                }
                gw3Var.F(t82.d);
                throw th;
            }
        }
    }

    @Override // defpackage.kg4
    public final void j() {
        try {
            try {
                this.f0 = false;
                b0();
                x();
            } finally {
                this.K = null;
            }
        } finally {
            this.M0 = false;
            this.j1 = -9223372036854775807L;
            ud1 ud1Var = this.Q0;
            if (ud1Var != null) {
                ud1Var.release();
                this.Q0 = null;
            }
        }
    }

    @Override // defpackage.kg4
    public final void k() {
        pe1 pe1Var = this.L0;
        if (pe1Var == null || !this.B0) {
            return;
        }
        pe1Var.K();
    }

    @Override // defpackage.kg4
    public final String o() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.kg4
    public final boolean p(long j) {
        long j2 = this.v0;
        return j2 == -9223372036854775807L || j > j2 - this.u0.c;
    }

    @Override // defpackage.kg4
    public final void p0(boolean z, boolean z2) {
        pe1 pe1Var;
        this.t0 = new n34();
        l();
        n34 n34Var = this.t0;
        gw3 gw3Var = this.C0;
        Handler handler = (Handler) gw3Var.g;
        if (handler != null) {
            handler.post(new je1(gw3Var, n34Var, 4));
        }
        boolean z3 = this.M0;
        de1 de1Var = this.E0;
        if (!z3) {
            if (this.O0 != null && this.L0 == null) {
                vd1 vd1Var = new vd1(this.A0, de1Var);
                vd1Var.d = true;
                long j = this.G0;
                vd1Var.g = j != -9223372036854775807L ? -j : -9223372036854775807L;
                pz pzVar = this.l;
                pzVar.getClass();
                vd1Var.e = pzVar;
                zt0.b0(!vd1Var.f);
                if (vd1Var.c == null) {
                    vd1Var.c = new yd1();
                }
                ae1 ae1Var = new ae1(vd1Var);
                vd1Var.f = true;
                ae1Var.p = 1;
                SparseArray sparseArray = ae1Var.c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    pe1Var = (pe1) sparseArray.get(0);
                } else {
                    wd1 wd1Var = new wd1(ae1Var, ae1Var.a);
                    ae1Var.g.add(wd1Var);
                    sparseArray.put(0, wd1Var);
                    pe1Var = wd1Var;
                }
                this.L0 = pe1Var;
            }
            this.M0 = true;
        }
        int i = !z2 ? 1 : 0;
        pe1 pe1Var2 = this.L0;
        if (pe1Var2 == null) {
            pz pzVar2 = this.l;
            pzVar2.getClass();
            de1Var.k = pzVar2;
            de1Var.a(i);
            return;
        }
        pe1Var2.w0(new qd1(this));
        be1 be1Var = this.i1;
        if (be1Var != null) {
            this.L0.q0(be1Var);
        }
        if (this.P0 != null && !this.R0.equals(uz2.c)) {
            this.L0.z0(this.P0, this.R0);
        }
        this.L0.t0(this.U0);
        this.L0.p0(this.N);
        List list = this.O0;
        if (list != null) {
            this.L0.v0(list);
        }
        this.N0 = i;
        this.x0 = true;
    }

    @Override // defpackage.kg4
    public final void q(float f, float f2) {
        super.q(f, f2);
        pe1 pe1Var = this.L0;
        if (pe1Var != null) {
            pe1Var.p0(f);
        } else {
            this.E0.h(f);
        }
    }

    @Override // defpackage.kg4
    public final void q0(ph4[] ph4VarArr, long j, long j2, kh4 kh4Var) {
        super.q0(ph4VarArr, j, j2, kh4Var);
        oz1 oz1Var = this.u;
        if (oz1Var.g()) {
            this.k1 = -9223372036854775807L;
        } else {
            this.k1 = oz1Var.o(kh4Var.a, new sw1()).d;
        }
    }

    @Override // defpackage.kg4
    public final void r() {
        pe1 pe1Var = this.L0;
        if (pe1Var == null) {
            de1 de1Var = this.E0;
            if (de1Var.d == 0) {
                de1Var.d = 1;
                return;
            }
            return;
        }
        int i = this.N0;
        if (i == 0 || i == 1) {
            this.N0 = 0;
        } else {
            pe1Var.N();
        }
    }

    public final boolean r0(long j, long j2, boolean z, boolean z2) {
        if (this.L0 != null && this.B0) {
            j2 -= -this.j1;
        }
        if (j < -500000 && !z) {
            li4 li4Var = this.n;
            li4Var.getClass();
            int iF = li4Var.f(j2 - this.p);
            if (iF != 0) {
                PriorityQueue priorityQueue = this.H0;
                if (z2) {
                    n34 n34Var = this.t0;
                    int i = n34Var.d + iF;
                    n34Var.d = i;
                    n34Var.f += this.Y0;
                    n34Var.d = priorityQueue.size() + i;
                } else {
                    this.t0.j++;
                    u0(priorityQueue.size() + iF, this.Y0);
                }
                if (this.P != null) {
                    if (y()) {
                        x();
                        v();
                    } else if (z()) {
                        c0();
                    } else {
                        this.y0 = true;
                    }
                }
                pe1 pe1Var = this.L0;
                if (pe1Var != null) {
                    pe1Var.o0(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kg4
    public final void s(long j, long j2) throws b84 {
        pe1 pe1Var = this.L0;
        if (pe1Var != null) {
            try {
                pe1Var.s0(j, j2);
            } catch (oe1 e) {
                throw m(e, e.f, false, 7001);
            }
        }
        super.s(j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // defpackage.kg4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t() {
        /*
            r7 = this;
            ph4 r0 = r7.H
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3f
            boolean r0 = r7.n0()
            if (r0 == 0) goto Lf
            boolean r0 = r7.s
            goto L18
        Lf:
            li4 r0 = r7.n
            r0.getClass()
            boolean r0 = r0.d()
        L18:
            if (r0 != 0) goto L3e
            int r0 = r7.c0
            if (r0 < 0) goto L20
            r0 = r1
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != 0) goto L3e
            long r3 = r7.a0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L3f
            pz r0 = r7.l
            r0.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.a0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L3e
            goto L3f
        L3e:
            r2 = r1
        L3f:
            pe1 r0 = r7.L0
            if (r0 == 0) goto L48
            boolean r0 = r0.Q(r2)
            return r0
        L48:
            if (r2 == 0) goto L50
            zf4 r0 = r7.P
            if (r0 == 0) goto L4f
            goto L50
        L4f:
            return r1
        L50:
            de1 r0 = r7.E0
            boolean r0 = r0.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd1.t():boolean");
    }

    public final void t0(zf4 zf4Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        zf4Var.I(i);
        Trace.endSection();
        this.t0.f++;
    }

    @Override // defpackage.kg4
    public final boolean u() {
        if (!this.r0) {
            return false;
        }
        pe1 pe1Var = this.L0;
        return pe1Var == null || pe1Var.g();
    }

    public final void u0(int i, int i2) {
        n34 n34Var = this.t0;
        n34Var.h += i;
        int i3 = i + i2;
        n34Var.g += i3;
        this.W0 += i3;
        int i4 = this.X0 + i3;
        this.X0 = i4;
        n34Var.i = Math.max(i4, n34Var.i);
    }

    public final void v0(long j) {
        n34 n34Var = this.t0;
        n34Var.k += j;
        n34Var.l++;
        this.b1 += j;
        this.c1++;
    }

    @Override // defpackage.kg4
    public final boolean w(bg4 bg4Var) {
        return C0(bg4Var);
    }

    public final void w0(zf4 zf4Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        zf4Var.m(i, j);
        Trace.endSection();
        this.t0.e++;
        this.X0 = 0;
        if (this.L0 == null) {
            t82 t82Var = this.e1;
            boolean zEquals = t82Var.equals(t82.d);
            gw3 gw3Var = this.C0;
            if (!zEquals && !t82Var.equals(this.f1)) {
                this.f1 = t82Var;
                gw3Var.F(t82Var);
            }
            de1 de1Var = this.E0;
            int i2 = de1Var.d;
            de1Var.d = 3;
            de1Var.k.getClass();
            de1Var.f = v23.r(SystemClock.elapsedRealtime());
            if (i2 == 3 || (surface = this.P0) == null) {
                return;
            }
            Handler handler = (Handler) gw3Var.g;
            if (handler != null) {
                handler.post(new le1(gw3Var, surface, SystemClock.elapsedRealtime()));
            }
            this.S0 = true;
        }
    }

    @Override // defpackage.kg4
    public final boolean y() {
        bg4 bg4Var = this.W;
        if (this.L0 != null && bg4Var != null) {
            String str = bg4Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // defpackage.kg4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z() {
        /*
            r12 = this;
            ph4 r0 = r12.Q
            long r1 = r12.k1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L24
            r8 = 1
            long r8 = r8 + r1
            jg4 r5 = r12.u0
            long r10 = r5.c
            long r10 = r10 + r1
            long r1 = r12.z0
            long r1 = r1 + r8
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r8 - r10
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L26
        L24:
            r1 = r7
            goto L27
        L26:
            r1 = r6
        L27:
            kc4 r2 = r12.Z0
            if (r2 != 0) goto L2c
            goto L41
        L2c:
            boolean r2 = r12.a1
            if (r2 != 0) goto L41
            if (r0 == 0) goto L36
            int r0 = r0.o
            if (r0 > 0) goto L41
        L36:
            if (r1 != 0) goto L41
            jg4 r0 = r12.u0
            long r0 = r0.e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L41
            return r6
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd1.z():boolean");
    }
}
