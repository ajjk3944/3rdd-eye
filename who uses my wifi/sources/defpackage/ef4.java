package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ef4 extends kg4 implements ob4 {
    public final wt2 A0;
    public final df4 B0;
    public final wt2 C0;
    public int D0;
    public boolean E0;
    public ph4 F0;
    public ph4 G0;
    public long H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public int L0;
    public boolean M0;
    public long N0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ef4(Context context, cy2 cy2Var, Handler handler, oa4 oa4Var, df4 df4Var) {
        hd4 hd4Var = hd4.g;
        wt2 wt2Var = Build.VERSION.SDK_INT >= 35 ? new wt2(13) : null;
        super(1, cy2Var, hd4Var, 44100.0f);
        context.getApplicationContext();
        this.B0 = df4Var;
        this.C0 = wt2Var;
        this.L0 = -1000;
        this.A0 = new wt2(handler, oa4Var, 11, false);
        this.N0 = -9223372036854775807L;
        df4Var.n = new bi3(5, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // defpackage.kg4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int K(defpackage.hd4 r19, defpackage.ph4 r20) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef4.K(hd4, ph4):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // defpackage.kg4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList M(defpackage.hd4 r4, defpackage.ph4 r5) {
        /*
            r3 = this;
            java.lang.String r0 = r5.m
            if (r0 != 0) goto L7
            sn3 r4 = defpackage.sn3.j
            goto L2f
        L7:
            df4 r0 = r3.B0
            int r0 = r0.o(r5)
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = defpackage.og4.a(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1e
            r0 = 0
            goto L24
        L1e:
            java.lang.Object r0 = r0.get(r1)
            bg4 r0 = (defpackage.bg4) r0
        L24:
            if (r0 == 0) goto L2b
            sn3 r4 = defpackage.xm3.i(r0)
            goto L2f
        L2b:
            sn3 r4 = defpackage.og4.b(r4, r5, r1, r1)
        L2f:
            java.util.HashMap r0 = defpackage.og4.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            ld4 r4 = new ld4
            r4.<init>(r5)
            sb3 r5 = new sb3
            r1 = 1
            r5.<init>(r1, r4)
            java.util.Collections.sort(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef4.M(hd4, ph4):java.util.ArrayList");
    }

    @Override // defpackage.kg4
    public final boolean N(ph4 ph4Var) {
        l();
        return this.B0.o(ph4Var) != 0;
    }

    @Override // defpackage.kg4
    public final g4 O(bg4 bg4Var, ph4 ph4Var, float f) {
        ph4[] ph4VarArr = this.o;
        ph4VarArr.getClass();
        int length = ph4VarArr.length;
        String str = bg4Var.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = ph4Var.n;
        if (length != 1) {
            for (ph4 ph4Var2 : ph4VarArr) {
                if (bg4Var.d(ph4Var, ph4Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, ph4Var2.n);
                }
            }
        }
        this.D0 = iMax;
        int i = Build.VERSION.SDK_INT;
        this.E0 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = bg4Var.c;
        int i2 = this.D0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i3 = ph4Var.E;
        mediaFormat.setInteger("channel-count", i3);
        int i4 = ph4Var.F;
        mediaFormat.setInteger("sample-rate", i4);
        gi2.F(mediaFormat, ph4Var.p);
        gi2.K(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = ph4Var.m;
        if ("audio/ac4".equals(str3)) {
            Pair pairB = mo2.b(ph4Var);
            if (pairB != null) {
                gi2.K(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                gi2.K(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (i <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        gg4 gg4Var = new gg4();
        gg4Var.e("audio/raw");
        gg4Var.D = i3;
        gg4Var.E = i4;
        gg4Var.F = 4;
        if (this.B0.o(new ph4(gg4Var)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.L0));
        }
        ph4 ph4Var3 = null;
        if ("audio/raw".equals(bg4Var.b) && !"audio/raw".equals(str3)) {
            ph4Var3 = ph4Var;
        }
        this.G0 = ph4Var3;
        return new g4(bg4Var, mediaFormat, ph4Var, null, this.C0, 19);
    }

    @Override // defpackage.kg4
    public final w34 P(bg4 bg4Var, ph4 ph4Var, ph4 ph4Var2) {
        int i;
        int i2;
        w34 w34VarD = bg4Var.d(ph4Var, ph4Var2);
        int i3 = w34VarD.e;
        if (this.K == null && N(ph4Var2)) {
            i3 |= 32768;
        }
        "OMX.google.raw.decoder".equals(bg4Var.a);
        if (ph4Var2.n > this.D0) {
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
    public final long Q(long j, long j2) {
        long jT;
        df4 df4Var = this.B0;
        boolean z = df4Var.s() && this.N0 != -9223372036854775807L;
        if (this.M0) {
            if (df4Var.h()) {
                se4 se4Var = df4Var.p;
                if (se4Var.c == 0) {
                    jT = v23.s(se4Var.e, df4Var.r.getBufferSizeInFrames());
                } else {
                    long bufferSizeInFrames = df4Var.r.getBufferSizeInFrames();
                    int iM = qb1.M(df4Var.p.g);
                    zt0.b0(iM != -2147483647);
                    jT = v23.t(bufferSizeInFrames, 1000000L, iM, RoundingMode.DOWN);
                }
            } else {
                jT = -9223372036854775807L;
            }
            if (z && jT != -9223372036854775807L) {
                float fMin = Math.min(jT, this.N0 - j);
                sr1 sr1Var = df4Var.y;
                float f = sr1Var != null ? sr1Var.a : 1.0f;
                this.l.getClass();
                return Math.max(10000L, ((long) ((fMin / f) / 2.0f)) - (v23.r(SystemClock.elapsedRealtime()) - j2));
            }
        } else if (z || this.r0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.kg4
    public final float R(float f, ph4 ph4Var, ph4[] ph4VarArr) {
        int iMax = -1;
        for (ph4 ph4Var2 : ph4VarArr) {
            int i = ph4Var2.F;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // defpackage.kg4
    public final void S(long j, long j2, String str) {
        wt2 wt2Var = this.A0;
        Handler handler = (Handler) wt2Var.g;
        if (handler != null) {
            handler.post(new ee4(wt2Var, str, j, j2));
        }
    }

    @Override // defpackage.kg4
    public final void T(String str) {
        wt2 wt2Var = this.A0;
        Handler handler = (Handler) wt2Var.g;
        if (handler != null) {
            handler.post(new ee4(wt2Var, str, 4));
        }
    }

    @Override // defpackage.kg4
    public final void U(Exception exc) {
        a30.C("MediaCodecAudioRenderer", "Audio codec error", exc);
        wt2 wt2Var = this.A0;
        Handler handler = (Handler) wt2Var.g;
        if (handler != null) {
            handler.post(new ee4(wt2Var, exc, 6));
        }
    }

    @Override // defpackage.kg4
    public final w34 V(mr2 mr2Var) {
        ph4 ph4Var = (ph4) mr2Var.h;
        ph4Var.getClass();
        this.F0 = ph4Var;
        w34 w34VarV = super.V(mr2Var);
        wt2 wt2Var = this.A0;
        Handler handler = (Handler) wt2Var.g;
        if (handler != null) {
            handler.post(new gi(wt2Var, ph4Var, w34VarV, 28));
        }
        return w34VarV;
    }

    @Override // defpackage.kg4
    public final void W(ph4 ph4Var, MediaFormat mediaFormat) throws b84 {
        ph4 ph4Var2 = this.G0;
        int[] iArr = null;
        boolean z = true;
        if (ph4Var2 != null) {
            ph4Var = ph4Var2;
        } else if (this.P != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(ph4Var.m) ? ph4Var.G : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? v23.y(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            gg4 gg4Var = new gg4();
            gg4Var.e("audio/raw");
            gg4Var.F = integer;
            gg4Var.G = ph4Var.H;
            gg4Var.H = ph4Var.I;
            gg4Var.j = ph4Var.k;
            gg4Var.a = ph4Var.a;
            gg4Var.b = ph4Var.b;
            gg4Var.c = xm3.m(ph4Var.c);
            gg4Var.d = ph4Var.d;
            gg4Var.e = ph4Var.e;
            gg4Var.f = ph4Var.f;
            gg4Var.D = mediaFormat.getInteger("channel-count");
            gg4Var.E = mediaFormat.getInteger("sample-rate");
            ph4Var = new ph4(gg4Var);
            if (this.E0) {
                int i = ph4Var.E;
                if (i == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                if (this.f0) {
                    l();
                }
                if (i2 < 29) {
                    z = false;
                }
                zt0.b0(z);
            }
            this.B0.p(ph4Var, iArr);
        } catch (me4 e) {
            throw m(e, e.f, false, 5001);
        }
    }

    @Override // defpackage.kg4
    public final void X() {
        this.B0.F = true;
    }

    @Override // defpackage.kg4
    public final boolean Y(long j, long j2, zf4 zf4Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, ph4 ph4Var) throws b84 {
        byteBuffer.getClass();
        this.N0 = -9223372036854775807L;
        if (this.G0 != null && (i2 & 2) != 0) {
            zf4Var.getClass();
            zf4Var.I(i);
            return true;
        }
        df4 df4Var = this.B0;
        if (z) {
            if (zf4Var != null) {
                zf4Var.I(i);
            }
            this.t0.f += i3;
            df4Var.F = true;
            return true;
        }
        try {
            if (!df4Var.r(byteBuffer, j3, i3)) {
                this.N0 = j3;
                return false;
            }
            if (zf4Var != null) {
                zf4Var.I(i);
            }
            this.t0.e += i3;
            return true;
        } catch (ne4 e) {
            ph4 ph4Var2 = this.F0;
            if (this.f0) {
                l();
            }
            throw m(e, ph4Var2, e.g, 5001);
        } catch (oe4 e2) {
            if (this.f0) {
                l();
            }
            throw m(e2, ph4Var, e2.g, 5002);
        }
    }

    @Override // defpackage.kg4
    public final void Z() throws IllegalStateException, b84 {
        try {
            df4 df4Var = this.B0;
            if (!df4Var.M && df4Var.h() && df4Var.d()) {
                df4Var.m();
                df4Var.M = true;
            }
            long j = this.u0.e;
            if (j != -9223372036854775807L) {
                this.N0 = j;
            }
        } catch (oe4 e) {
            throw m(e, e.h, e.g, true != this.f0 ? 5002 : 5003);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    @Override // defpackage.fc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r9, java.lang.Object r10) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef4.a(int, java.lang.Object):void");
    }

    @Override // defpackage.kg4
    public final void a0(vw3 vw3Var) {
        ph4 ph4Var;
        if (Build.VERSION.SDK_INT < 29 || (ph4Var = vw3Var.c) == null || !Objects.equals(ph4Var.m, "audio/opus") || !this.f0) {
            return;
        }
        ByteBuffer byteBuffer = vw3Var.h;
        byteBuffer.getClass();
        vw3Var.c.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            AudioTrack audioTrack = this.B0.r;
            if (audioTrack != null) {
                df4.l(audioTrack);
            }
        }
    }

    @Override // defpackage.ob4
    public final void b(sr1 sr1Var) {
        df4 df4Var = this.B0;
        df4Var.getClass();
        float f = sr1Var.a;
        String str = v23.a;
        df4Var.y = new sr1(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(sr1Var.b, 8.0f)));
        ue4 ue4Var = new ue4(sr1Var, -9223372036854775807L, -9223372036854775807L);
        if (df4Var.h()) {
            df4Var.w = ue4Var;
        } else {
            df4Var.x = ue4Var;
        }
    }

    @Override // defpackage.kg4
    public final void c(long j, boolean z, boolean z2) throws IllegalStateException {
        super.c(j, z, z2);
        this.B0.t();
        this.H0 = j;
        this.N0 = -9223372036854775807L;
        this.K0 = false;
        this.I0 = true;
    }

    @Override // defpackage.kg4
    public final void d() throws IllegalStateException {
        this.B0.q();
        this.M0 = true;
    }

    @Override // defpackage.ob4
    public final long e() {
        if (this.m == 2) {
            r0();
        }
        return this.H0;
    }

    @Override // defpackage.ob4
    public final boolean f() {
        boolean z = this.K0;
        this.K0 = false;
        return z;
    }

    @Override // defpackage.ob4
    public final sr1 g() {
        return this.B0.y;
    }

    @Override // defpackage.kg4
    public final void h() throws IllegalStateException {
        r0();
        this.M0 = false;
        df4 df4Var = this.B0;
        df4Var.P = false;
        if (df4Var.h()) {
            qe4 qe4Var = df4Var.g;
            qe4Var.j = 0L;
            qe4Var.t = 0;
            qe4Var.s = 0;
            qe4Var.k = 0L;
            qe4Var.z = -9223372036854775807L;
            qe4Var.A = -9223372036854775807L;
            qe4Var.h = false;
            if (qe4Var.u == -9223372036854775807L) {
                pe4 pe4Var = qe4Var.d;
                pe4Var.getClass();
                pe4Var.a(0);
            }
            qe4Var.w = qe4Var.e();
            if (!df4Var.N || df4.l(df4Var.r)) {
                df4Var.r.pause();
            }
        }
    }

    @Override // defpackage.kg4
    public final void i() {
        wt2 wt2Var = this.A0;
        this.J0 = true;
        this.F0 = null;
        this.N0 = -9223372036854775807L;
        try {
            try {
                this.B0.t();
                super.i();
                n34 n34Var = this.t0;
                wt2Var.getClass();
                synchronized (n34Var) {
                }
                Handler handler = (Handler) wt2Var.g;
                if (handler != null) {
                    handler.post(new sz2(wt2Var, n34Var, 29));
                }
            } catch (Throwable th) {
                super.i();
                n34 n34Var2 = this.t0;
                wt2Var.getClass();
                synchronized (n34Var2) {
                    Handler handler2 = (Handler) wt2Var.g;
                    if (handler2 != null) {
                        handler2.post(new sz2(wt2Var, n34Var2, 29));
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            n34 n34Var3 = this.t0;
            wt2Var.getClass();
            synchronized (n34Var3) {
                Handler handler3 = (Handler) wt2Var.g;
                if (handler3 != null) {
                    handler3.post(new sz2(wt2Var, n34Var3, 29));
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.kg4
    public final void j() throws IllegalStateException {
        df4 df4Var = this.B0;
        this.K0 = false;
        this.N0 = -9223372036854775807L;
        try {
            try {
                this.f0 = false;
                b0();
                x();
                if (this.J0) {
                    this.J0 = false;
                    df4Var.a();
                }
            } finally {
                this.K = null;
            }
        } catch (Throwable th) {
            if (this.J0) {
                this.J0 = false;
                df4Var.a();
            }
            throw th;
        }
    }

    @Override // defpackage.kg4
    public final void k() {
        wt2 wt2Var;
        x03 x03Var = this.B0.t;
        if (x03Var != null && x03Var.f) {
            x03Var.m = null;
            Context context = (Context) x03Var.g;
            bd2.B(context).unregisterAudioDeviceCallback((be4) x03Var.j);
            context.unregisterReceiver((d6) x03Var.k);
            ce4 ce4Var = (ce4) x03Var.l;
            if (ce4Var != null) {
                ce4Var.a.unregisterContentObserver(ce4Var);
            }
            x03Var.f = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (wt2Var = this.C0) == null) {
            return;
        }
        ((HashSet) wt2Var.g).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) wt2Var.h;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // defpackage.kg4
    public final String o() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.kg4
    public final void p0(boolean z, boolean z2) {
        n34 n34Var = new n34();
        this.t0 = n34Var;
        wt2 wt2Var = this.A0;
        Handler handler = (Handler) wt2Var.g;
        if (handler != null) {
            handler.post(new ee4(wt2Var, n34Var, 8));
        }
        l();
        xd4 xd4Var = this.k;
        xd4Var.getClass();
        df4 df4Var = this.B0;
        df4Var.m = xd4Var;
        pz pzVar = this.l;
        pzVar.getClass();
        df4Var.g.B = pzVar;
    }

    public final void r0() {
        long j;
        long jMax;
        ArrayDeque arrayDeque;
        long j2;
        u();
        df4 df4Var = this.B0;
        jr3 jr3Var = df4Var.d0;
        if (!df4Var.h() || df4Var.G) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(df4Var.g.b(), v23.s(df4Var.p.e, df4Var.j()));
            while (true) {
                arrayDeque = df4Var.h;
                if (arrayDeque.isEmpty() || jMin < ((ue4) arrayDeque.getFirst()).c) {
                    break;
                } else {
                    df4Var.x = (ue4) arrayDeque.remove();
                }
            }
            ue4 ue4Var = df4Var.x;
            long jT = jMin - ue4Var.c;
            long jV = v23.v(jT, ue4Var.a.a);
            if (arrayDeque.isEmpty()) {
                xg2 xg2Var = (xg2) jr3Var.i;
                if (xg2Var.h()) {
                    long j3 = xg2Var.o;
                    if (j3 >= 1024) {
                        long j4 = xg2Var.n;
                        mg2 mg2Var = xg2Var.j;
                        mg2Var.getClass();
                        int i = mg2Var.k * mg2Var.b;
                        j = Long.MIN_VALUE;
                        long j5 = j4 - (i + i);
                        int i2 = xg2Var.h.a;
                        int i3 = xg2Var.g.a;
                        jT = i2 == i3 ? v23.t(jT, j5, j3, RoundingMode.DOWN) : v23.t(jT, j5 * i2, j3 * i3, RoundingMode.DOWN);
                    } else {
                        j = Long.MIN_VALUE;
                        jT = (long) (xg2Var.c * jT);
                    }
                } else {
                    j = Long.MIN_VALUE;
                }
                ue4 ue4Var2 = df4Var.x;
                j2 = ue4Var2.b + jT;
                ue4Var2.d = jT - jV;
            } else {
                j = Long.MIN_VALUE;
                ue4 ue4Var3 = df4Var.x;
                j2 = ue4Var3.b + jV + ue4Var3.d;
            }
            long j6 = ((ff4) jr3Var.h).l;
            jMax = v23.s(df4Var.p.e, j6) + j2;
            long j7 = df4Var.X;
            if (j6 > j7) {
                long jS = v23.s(df4Var.p.e, j6 - j7);
                df4Var.X = j6;
                df4Var.Y += jS;
                if (df4Var.Z == null) {
                    df4Var.Z = new Handler(Looper.myLooper());
                }
                df4Var.Z.removeCallbacksAndMessages(null);
                df4Var.Z.postDelayed(new bh3(13, df4Var), 100L);
            }
        }
        if (jMax != j) {
            if (!this.I0) {
                jMax = Math.max(this.H0, jMax);
            }
            this.H0 = jMax;
            this.I0 = false;
        }
    }

    @Override // defpackage.kg4
    public final boolean t() {
        return this.B0.s();
    }

    @Override // defpackage.kg4
    public final boolean u() {
        if (!this.r0) {
            return false;
        }
        df4 df4Var = this.B0;
        if (df4Var.h()) {
            return df4Var.M && !df4Var.s();
        }
        return true;
    }

    @Override // defpackage.kg4
    public final ob4 m0() {
        return this;
    }
}
