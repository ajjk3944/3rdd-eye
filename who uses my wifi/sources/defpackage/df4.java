package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class df4 {
    public static final Object f0 = new Object();
    public static ScheduledExecutorService g0;
    public static int h0;
    public long A;
    public long B;
    public long C;
    public long D;
    public int E;
    public boolean F;
    public boolean G;
    public long H;
    public float I;
    public ByteBuffer J;
    public int K;
    public ByteBuffer L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public jx2 S;
    public AudioDeviceInfo T;
    public long U;
    public boolean V;
    public Looper W;
    public long X;
    public long Y;
    public Handler Z;
    public final Context a;
    public Context a0;
    public final re4 b;
    public final boolean b0;
    public final hf4 c;
    public int c0;
    public final ih2 d;
    public final jr3 d0;
    public final gf4 e;
    public final wt2 e0;
    public final sn3 f;
    public final qe4 g;
    public final ArrayDeque h;
    public pb3 i;
    public final rn1 j;
    public final rn1 k;
    public final int l;
    public xd4 m;
    public bi3 n;
    public se4 o;
    public se4 p;
    public nd2 q;
    public AudioTrack r;
    public ae4 s;
    public x03 t;
    public mc2 u;
    public in2 v;
    public ue4 w;
    public ue4 x;
    public sr1 y;
    public boolean z;

    public df4(de3 de3Var) {
        int deviceId;
        Context context = (Context) de3Var.g;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        this.a = applicationContext;
        this.v = in2.b;
        this.s = applicationContext == null ? (ae4) de3Var.h : null;
        this.d0 = (jr3) de3Var.i;
        wt2 wt2Var = (wt2) de3Var.j;
        wt2Var.getClass();
        this.e0 = wt2Var;
        this.g = new qe4(new rc3(9, this));
        re4 re4Var = new re4();
        this.b = re4Var;
        hf4 hf4Var = new hf4();
        hf4Var.m = v23.b;
        this.c = hf4Var;
        this.d = new ih2();
        this.e = new gf4();
        this.f = xm3.j(hf4Var, re4Var);
        this.I = 1.0f;
        this.Q = 0;
        this.S = new jx2();
        sr1 sr1Var = sr1.d;
        this.x = new ue4(sr1Var, 0L, 0L);
        this.y = sr1Var;
        this.z = false;
        this.h = new ArrayDeque();
        this.j = new rn1();
        this.k = new rn1();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.l = i;
        this.b0 = true;
    }

    public static boolean l(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static final AudioTrack n(le4 le4Var, in2 in2Var, int i, ph4 ph4Var, Context context) throws UnsupportedOperationException, IllegalArgumentException, ne4 {
        ph4 ph4Var2;
        RuntimeException runtimeException;
        int i2;
        int i3;
        int i4;
        try {
            i2 = le4Var.b;
            i3 = le4Var.c;
            i4 = le4Var.a;
        } catch (IllegalArgumentException e) {
            e = e;
        } catch (UnsupportedOperationException e2) {
            e = e2;
        }
        try {
            String str = v23.a;
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(in2Var.a()).setAudioFormat(audioFormatBuild).setTransferMode(1).setBufferSizeInBytes(le4Var.e).setSessionId(i);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 29) {
                try {
                    sessionId.setOffloadedPlayback(le4Var.d);
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    runtimeException = e;
                    ph4Var2 = ph4Var;
                    throw new ne4(0, le4Var.b, le4Var.c, le4Var.a, le4Var.e, ph4Var2, le4Var.d, runtimeException);
                } catch (UnsupportedOperationException e4) {
                    e = e4;
                    runtimeException = e;
                    ph4Var2 = ph4Var;
                    throw new ne4(0, le4Var.b, le4Var.c, le4Var.a, le4Var.e, ph4Var2, le4Var.d, runtimeException);
                }
            }
            if (i5 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new ne4(state, le4Var.b, le4Var.c, le4Var.a, le4Var.e, ph4Var, le4Var.d, null);
        } catch (IllegalArgumentException e5) {
            e = e5;
            ph4Var2 = ph4Var;
            runtimeException = e;
            throw new ne4(0, le4Var.b, le4Var.c, le4Var.a, le4Var.e, ph4Var2, le4Var.d, runtimeException);
        } catch (UnsupportedOperationException e6) {
            e = e6;
            ph4Var2 = ph4Var;
            runtimeException = e;
            throw new ne4(0, le4Var.b, le4Var.c, le4Var.a, le4Var.e, ph4Var2, le4Var.d, runtimeException);
        }
    }

    public final void a() throws IllegalStateException {
        t();
        sn3 sn3Var = this.f;
        int i = sn3Var.i;
        for (int i2 = 0; i2 < i; i2++) {
            ((qf2) sn3Var.get(i2)).g();
        }
        this.d.g();
        this.e.g();
        nd2 nd2Var = this.q;
        if (nd2Var != null) {
            int i3 = 0;
            while (true) {
                xm3 xm3Var = nd2Var.a;
                if (i3 >= xm3Var.size()) {
                    break;
                }
                qf2 qf2Var = (qf2) xm3Var.get(i3);
                pe2 pe2Var = pe2.b;
                qf2Var.j();
                qf2Var.g();
                i3++;
            }
            nd2Var.c = new ByteBuffer[0];
            ce2 ce2Var = ce2.e;
            nd2Var.d = false;
        }
        this.P = false;
        this.V = false;
    }

    public final AudioTrack b(se4 se4Var) throws ne4 {
        Context context;
        try {
            int i = this.Q;
            int i2 = this.l;
            Context context2 = null;
            if (i2 != -1 && (context = this.a) != null && Build.VERSION.SDK_INT >= 34) {
                if (this.a0 == null) {
                    this.a0 = context.createDeviceContext(i2);
                }
                context2 = this.a0;
                i = 0;
            }
            return n(se4Var.a(), this.v, i, se4Var.a, context2);
        } catch (ne4 e) {
            bi3 bi3Var = this.n;
            if (bi3Var != null) {
                bi3Var.a(e);
            }
            throw e;
        }
    }

    public final void c() throws Exception {
        ByteBuffer byteBuffer;
        f();
        if (this.L != null) {
            return;
        }
        if (!this.q.c()) {
            ByteBuffer byteBuffer2 = this.J;
            if (byteBuffer2 != null) {
                e(byteBuffer2);
                f();
                return;
            }
            return;
        }
        while (!this.q.d()) {
            do {
                nd2 nd2Var = this.q;
                if (nd2Var.c()) {
                    ByteBuffer byteBuffer3 = nd2Var.c[nd2Var.f()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        nd2Var.e(qf2.a);
                        byteBuffer = nd2Var.c[nd2Var.f()];
                    }
                } else {
                    byteBuffer = qf2.a;
                }
                if (byteBuffer.hasRemaining()) {
                    e(byteBuffer);
                    f();
                } else {
                    ByteBuffer byteBuffer4 = this.J;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    nd2 nd2Var2 = this.q;
                    ByteBuffer byteBuffer5 = this.J;
                    if (nd2Var2.c() && !nd2Var2.d) {
                        nd2Var2.e(byteBuffer5);
                    }
                }
            } while (this.L == null);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() throws java.lang.Exception {
        /*
            r4 = this;
            nd2 r0 = r4.q
            boolean r0 = r0.c()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L12
            r4.f()
            java.nio.ByteBuffer r0 = r4.L
            if (r0 != 0) goto L43
            goto L42
        L12:
            nd2 r0 = r4.q
            boolean r3 = r0.c()
            if (r3 == 0) goto L2c
            boolean r3 = r0.d
            if (r3 == 0) goto L1f
            goto L2c
        L1f:
            r0.d = r2
            java.util.ArrayList r0 = r0.b
            java.lang.Object r0 = r0.get(r1)
            qf2 r0 = (defpackage.qf2) r0
            r0.b()
        L2c:
            r4.c()
            nd2 r0 = r4.q
            boolean r0 = r0.d()
            if (r0 == 0) goto L43
            java.nio.ByteBuffer r0 = r4.L
            if (r0 == 0) goto L42
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L42
            goto L43
        L42:
            return r2
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df4.d():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df4.e(java.nio.ByteBuffer):void");
    }

    public final void f() throws Exception {
        boolean z;
        if (this.L == null) {
            return;
        }
        rn1 rn1Var = this.k;
        if (((Exception) rn1Var.h) != null) {
            synchronized (f0) {
                z = h0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < rn1Var.g) {
                return;
            }
        }
        int iRemaining = this.L.remaining();
        int iWrite = this.r.write(this.L, iRemaining, 1);
        this.U = SystemClock.elapsedRealtime();
        if (iWrite >= 0) {
            rn1Var.h = null;
            rn1Var.f = -9223372036854775807L;
            rn1Var.g = -9223372036854775807L;
            l(this.r);
            int i = this.p.c;
            if (i == 0) {
                this.C += iWrite;
            }
            if (iWrite == iRemaining) {
                if (i != 0) {
                    zt0.b0(this.L == this.J);
                    this.D = (this.E * this.K) + this.D;
                }
                this.L = null;
                return;
            }
            return;
        }
        if (iWrite == -6 || iWrite == -32) {
            if (j() > 0) {
                z = true;
            } else if (l(this.r)) {
                if (this.p.c == 1) {
                    this.V = true;
                }
                z = true;
            }
        }
        oe4 oe4Var = new oe4(iWrite, this.p.a, z);
        bi3 bi3Var = this.n;
        if (bi3Var != null) {
            bi3Var.a(oe4Var);
        }
        if (!oe4Var.g || this.a == null) {
            rn1Var.b(oe4Var);
            return;
        }
        ae4 ae4Var = ae4.c;
        this.s = ae4Var;
        this.t.b(ae4Var);
        throw oe4Var;
    }

    public final void g(long j) {
        sr1 sr1Var;
        se4 se4Var = this.p;
        int i = se4Var.c;
        boolean z = false;
        jr3 jr3Var = this.d0;
        if (i == 0) {
            int i2 = se4Var.a.G;
            sr1Var = this.y;
            xg2 xg2Var = (xg2) jr3Var.i;
            float f = sr1Var.a;
            xg2Var.getClass();
            zt0.D(f > 0.0f);
            if (xg2Var.c != f) {
                xg2Var.c = f;
                xg2Var.i = true;
            }
            float f2 = sr1Var.b;
            zt0.D(f2 > 0.0f);
            if (xg2Var.d != f2) {
                xg2Var.d = f2;
                xg2Var.i = true;
            }
        } else {
            sr1Var = sr1.d;
        }
        sr1 sr1Var2 = sr1Var;
        this.y = sr1Var2;
        se4 se4Var2 = this.p;
        if (se4Var2.c == 0) {
            int i3 = se4Var2.a.G;
            z = this.z;
            ((ff4) jr3Var.h).j = z;
        }
        this.z = z;
        this.h.add(new ue4(sr1Var2, Math.max(0L, j), v23.s(this.p.e, j())));
        nd2 nd2Var = this.p.i;
        this.q = nd2Var;
        nd2Var.b(pe2.b);
        bi3 bi3Var = this.n;
        if (bi3Var != null) {
            boolean z2 = this.z;
            wt2 wt2Var = ((ef4) bi3Var.g).A0;
            Handler handler = (Handler) wt2Var.g;
            if (handler != null) {
                handler.post(new n82(wt2Var, z2, 4));
            }
        }
    }

    public final boolean h() {
        return this.r != null;
    }

    public final long i() {
        return this.p.c == 0 ? this.A / r0.b : this.B;
    }

    public final long j() {
        se4 se4Var = this.p;
        if (se4Var.c != 0) {
            return this.D;
        }
        long j = this.C;
        long j2 = se4Var.d;
        String str = v23.a;
        return ((j + j2) - 1) / j2;
    }

    public final void k() {
        Context context;
        ae4 ae4Var;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.t == null || this.W == looperMyLooper;
        Looper looper = this.W;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (!z) {
            throw new IllegalStateException(qb1.J("DefaultAudioSink accessed on multiple threads: %s and %s", name, name2));
        }
        if (this.t == null && (context = this.a) != null) {
            this.W = looperMyLooper;
            x03 x03Var = new x03(context, new it3(5, this), this.v, this.T);
            this.t = x03Var;
            if (x03Var.f) {
                ae4Var = (ae4) x03Var.m;
                ae4Var.getClass();
            } else {
                x03Var.f = true;
                ce4 ce4Var = (ce4) x03Var.l;
                if (ce4Var != null) {
                    ce4Var.a.registerContentObserver(ce4Var.b, false, ce4Var);
                }
                Context context2 = (Context) x03Var.g;
                be4 be4Var = (be4) x03Var.j;
                Handler handler = (Handler) x03Var.i;
                bd2.B(context2).registerAudioDeviceCallback(be4Var, handler);
                ae4 ae4VarB = ae4.b(context2, context2.registerReceiver((d6) x03Var.k, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (in2) x03Var.o, (AudioDeviceInfo) x03Var.n);
                x03Var.m = ae4VarB;
                ae4Var = ae4VarB;
            }
            this.s = ae4Var;
        }
        this.s.getClass();
    }

    public final void m() throws IllegalStateException {
        if (this.N) {
            return;
        }
        this.N = true;
        long j = j();
        qe4 qe4Var = this.g;
        qe4Var.w = qe4Var.e();
        qe4Var.B.getClass();
        qe4Var.u = v23.r(SystemClock.elapsedRealtime());
        qe4Var.x = j;
        if (l(this.r)) {
            this.O = false;
        }
        this.r.stop();
    }

    public final int o(ph4 ph4Var) {
        k();
        if ("audio/raw".equals(ph4Var.m)) {
            int i = ph4Var.G;
            if (!v23.a(i)) {
                ga1.q(new StringBuilder(String.valueOf(i).length() + 22), i, "Invalid PCM encoding: ");
                return 0;
            }
            if (i != 2) {
                return 1;
            }
        } else if (this.s.c(ph4Var, this.v) == null) {
            return 0;
        }
        return 2;
    }

    public final void p(ph4 ph4Var, int[] iArr) throws me4 {
        nd2 nd2Var;
        int i;
        int iD;
        int i2;
        int i3;
        int iD2;
        int i4;
        int iMax;
        int i5;
        int i6;
        int i7;
        int iM;
        k();
        String str = ph4Var.m;
        int i8 = ph4Var.F;
        int i9 = 2;
        if ("audio/raw".equals(str)) {
            int i10 = ph4Var.G;
            zt0.D(v23.a(i10));
            int i11 = ph4Var.E;
            iD2 = v23.d(i10) * i11;
            um3 um3Var = new um3(4);
            um3Var.b(this.f);
            um3Var.a(this.d);
            qf2[] qf2VarArr = (qf2[]) this.d0.g;
            wl2.G(qf2VarArr, 2);
            um3Var.e(2);
            System.arraycopy(qf2VarArr, 0, um3Var.a, um3Var.b, 2);
            um3Var.b += 2;
            nd2 nd2Var2 = new nd2(um3Var.f());
            if (nd2Var2.equals(this.q)) {
                nd2Var2 = this.q;
            }
            int i12 = ph4Var.H;
            int i13 = ph4Var.I;
            hf4 hf4Var = this.c;
            hf4Var.i = i12;
            hf4Var.j = i13;
            this.b.i = iArr;
            try {
                ce2 ce2VarA = nd2Var2.a(new ce2(i8, i11, i10));
                int i14 = ce2VarA.c;
                i = ce2VarA.a;
                int i15 = ce2VarA.b;
                int iB = v23.b(i15);
                iD = v23.d(i14) * i15;
                nd2Var = nd2Var2;
                i9 = 0;
                i2 = iB;
                i3 = i14;
            } catch (af2 e) {
                throw new me4(e, ph4Var);
            }
        } else {
            nd2 nd2Var3 = new nd2(sn3.j);
            de4 de4Var = de4.d;
            Pair pairC = this.s.c(ph4Var, this.v);
            if (pairC == null) {
                throw new me4("Unable to configure passthrough for: ".concat(String.valueOf(ph4Var)), ph4Var);
            }
            int iIntValue = ((Integer) pairC.first).intValue();
            int iIntValue2 = ((Integer) pairC.second).intValue();
            nd2Var = nd2Var3;
            i = i8;
            iD = -1;
            i2 = iIntValue2;
            i3 = iIntValue;
            iD2 = -1;
        }
        if (i3 == 0) {
            int i16 = i9;
            String strValueOf = String.valueOf(ph4Var);
            StringBuilder sb = new StringBuilder(ga1.f(i16, 37) + strValueOf.length());
            sb.append("Invalid output encoding (mode=");
            sb.append(i16);
            sb.append(") for: ");
            sb.append(strValueOf);
            throw new me4(sb.toString(), ph4Var);
        }
        if (i2 == 0) {
            int i17 = i9;
            String strValueOf2 = String.valueOf(ph4Var);
            StringBuilder sb2 = new StringBuilder(ga1.f(i17, 43) + strValueOf2.length());
            sb2.append("Invalid output channel config (mode=");
            sb2.append(i17);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new me4(sb2.toString(), ph4Var);
        }
        int i18 = ph4Var.i;
        if ("audio/vnd.dts.hd;profile=lbr".equals(ph4Var.m) && i18 == -1) {
            i18 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        zt0.b0(minBufferSize != -2);
        int i19 = iD != -1 ? iD : 1;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i3 == 5) {
                    i7 = 500000;
                    i6 = i3;
                } else if (i3 == 8) {
                    i7 = 1000000;
                    i6 = 8;
                } else {
                    i6 = i3;
                    i7 = 250000;
                }
                if (i18 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iM = a30.r(i18, 8);
                } else {
                    iM = qb1.M(i6);
                    zt0.b0(iM != -2147483647);
                }
                i5 = i;
                iMax = zt0.y((i7 * iM) / 1000000);
            } else {
                i5 = i;
                int iM2 = qb1.M(i3);
                zt0.b0(iM2 != -2147483647);
                iMax = zt0.y((iM2 * 50000000) / 1000000);
            }
            i4 = i9;
            i = i5;
        } else {
            long j = i;
            i4 = i9;
            long j2 = i19;
            int iY = zt0.y(((250000 * j) * j2) / 1000000);
            int iY2 = zt0.y(((750000 * j) * j2) / 1000000);
            String str2 = v23.a;
            iMax = Math.max(iY, Math.min(minBufferSize * 4, iY2));
        }
        this.V = false;
        se4 se4Var = new se4(ph4Var, iD2, i4, iD, i, i2, i3, (((Math.max(minBufferSize, iMax) + i19) - 1) / i19) * i19, nd2Var);
        if (h()) {
            this.o = se4Var;
        } else {
            this.p = se4Var;
        }
    }

    public final void q() throws IllegalStateException {
        this.P = true;
        if (h()) {
            qe4 qe4Var = this.g;
            if (qe4Var.u != -9223372036854775807L) {
                qe4Var.B.getClass();
                qe4Var.u = v23.r(SystemClock.elapsedRealtime());
            }
            qe4Var.i = v23.s(qe4Var.e, qe4Var.e());
            pe4 pe4Var = qe4Var.d;
            pe4Var.getClass();
            pe4Var.a(0);
            if (!this.N || l(this.r)) {
                this.r.play();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05d2 A[Catch: ne4 -> 0x00fd, TryCatch #0 {ne4 -> 0x00fd, blocks: (B:35:0x0075, B:66:0x00e7, B:68:0x00ef, B:70:0x00f5, B:73:0x0100, B:74:0x011a, B:76:0x0120, B:78:0x0124, B:79:0x0126, B:83:0x012f, B:84:0x0130, B:86:0x0139, B:91:0x0140, B:92:0x0141, B:94:0x0167, B:95:0x016e, B:97:0x0177, B:99:0x0180, B:100:0x0185, B:102:0x0189, B:103:0x0192, B:105:0x01a3, B:107:0x01b5, B:109:0x01c0, B:111:0x01cb, B:113:0x01d3, B:114:0x01d6, B:116:0x01e2, B:60:0x00ad, B:62:0x00b6, B:296:0x05c8, B:297:0x05cb, B:299:0x05d2, B:300:0x05d4, B:38:0x007e, B:39:0x0080, B:47:0x008e, B:303:0x05d7, B:40:0x0081, B:44:0x0088, B:54:0x00a0, B:56:0x00a4, B:59:0x00ac, B:80:0x0127, B:82:0x012b, B:88:0x013d, B:64:0x00e0), top: B:309:0x0075, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[Catch: ne4 -> 0x00fd, SYNTHETIC, TRY_LEAVE, TryCatch #0 {ne4 -> 0x00fd, blocks: (B:35:0x0075, B:66:0x00e7, B:68:0x00ef, B:70:0x00f5, B:73:0x0100, B:74:0x011a, B:76:0x0120, B:78:0x0124, B:79:0x0126, B:83:0x012f, B:84:0x0130, B:86:0x0139, B:91:0x0140, B:92:0x0141, B:94:0x0167, B:95:0x016e, B:97:0x0177, B:99:0x0180, B:100:0x0185, B:102:0x0189, B:103:0x0192, B:105:0x01a3, B:107:0x01b5, B:109:0x01c0, B:111:0x01cb, B:113:0x01d3, B:114:0x01d6, B:116:0x01e2, B:60:0x00ad, B:62:0x00b6, B:296:0x05c8, B:297:0x05cb, B:299:0x05d2, B:300:0x05d4, B:38:0x007e, B:39:0x0080, B:47:0x008e, B:303:0x05d7, B:40:0x0081, B:44:0x0088, B:54:0x00a0, B:56:0x00a4, B:59:0x00ac, B:80:0x0127, B:82:0x012b, B:88:0x013d, B:64:0x00e0), top: B:309:0x0075, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(java.nio.ByteBuffer r39, long r40, int r42) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df4.r(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean s() {
        if (!h()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.r.isOffloadedPlayback() && this.O) {
            return false;
        }
        long j = j();
        long jB = this.g.b();
        AudioTrack audioTrack = this.r;
        audioTrack.getClass();
        int sampleRate = audioTrack.getSampleRate();
        String str = v23.a;
        return j > v23.t(jB, (long) sampleRate, 1000000L, RoundingMode.UP);
    }

    public final void t() throws IllegalStateException {
        if (h()) {
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0;
            this.x = new ue4(this.y, 0L, 0L);
            this.H = 0L;
            this.w = null;
            this.h.clear();
            this.J = null;
            this.K = 0;
            this.L = null;
            this.N = false;
            this.M = false;
            this.O = false;
            this.c.o = 0L;
            nd2 nd2Var = this.p.i;
            this.q = nd2Var;
            nd2Var.b(pe2.b);
            qe4 qe4Var = this.g;
            AudioTrack audioTrack = qe4Var.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.r.pause();
            }
            if (l(this.r)) {
                pb3 pb3Var = this.i;
                pb3Var.getClass();
                this.r.unregisterStreamEventCallback((cf4) pb3Var.h);
                ((Handler) pb3Var.g).removeCallbacksAndMessages(null);
            }
            le4 le4VarA = this.p.a();
            se4 se4Var = this.o;
            if (se4Var != null) {
                this.p = se4Var;
                this.o = null;
            }
            qe4Var.j = 0L;
            qe4Var.t = 0;
            qe4Var.s = 0;
            qe4Var.k = 0L;
            qe4Var.z = -9223372036854775807L;
            qe4Var.A = -9223372036854775807L;
            qe4Var.h = false;
            qe4Var.c = null;
            qe4Var.d = null;
            mc2 mc2Var = this.u;
            if (mc2Var != null) {
                bf4 bf4Var = (bf4) mc2Var.j;
                bf4Var.getClass();
                ((AudioTrack) mc2Var.g).removeOnRoutingChangedListener(bf4Var);
                mc2Var.j = null;
                this.u = null;
            }
            AudioTrack audioTrack2 = this.r;
            bi3 bi3Var = this.n;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f0) {
                try {
                    if (g0 == null) {
                        String str = v23.a;
                        g0 = Executors.newSingleThreadScheduledExecutor(new rp0(1));
                    }
                    h0++;
                    g0.schedule(new vd(audioTrack2, bi3Var, handler, le4VarA, 8, false), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.r = null;
        }
        rn1 rn1Var = this.k;
        rn1Var.h = null;
        rn1Var.f = -9223372036854775807L;
        rn1Var.g = -9223372036854775807L;
        rn1 rn1Var2 = this.j;
        rn1Var2.h = null;
        rn1Var2.f = -9223372036854775807L;
        rn1Var2.g = -9223372036854775807L;
        this.X = 0L;
        this.Y = 0L;
        Handler handler2 = this.Z;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }
}
