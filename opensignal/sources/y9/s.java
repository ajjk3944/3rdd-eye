package y9;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.b1;
import com.squareup.picasso.b0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {
    public long A;
    public long B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public float G;
    public g[] H;
    public ByteBuffer[] I;
    public ByteBuffer J;
    public int K;
    public ByteBuffer L;
    public byte[] M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public o U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;

    /* renamed from: a, reason: collision with root package name */
    public final d f25970a;

    /* renamed from: b, reason: collision with root package name */
    public final qm.c f25971b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25972c;

    /* renamed from: d, reason: collision with root package name */
    public final q f25973d;

    /* renamed from: e, reason: collision with root package name */
    public final z f25974e;

    /* renamed from: f, reason: collision with root package name */
    public final g[] f25975f;

    /* renamed from: g, reason: collision with root package name */
    public final g[] f25976g;

    /* renamed from: h, reason: collision with root package name */
    public final ConditionVariable f25977h;

    /* renamed from: i, reason: collision with root package name */
    public final n f25978i;
    public final ArrayDeque j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public qm.c f25979l;

    /* renamed from: m, reason: collision with root package name */
    public final f5.w f25980m;

    /* renamed from: n, reason: collision with root package name */
    public final f5.w f25981n;

    /* renamed from: o, reason: collision with root package name */
    public u f25982o;

    /* renamed from: p, reason: collision with root package name */
    public f5.u f25983p;

    /* renamed from: q, reason: collision with root package name */
    public f5.u f25984q;

    /* renamed from: r, reason: collision with root package name */
    public AudioTrack f25985r;

    /* renamed from: s, reason: collision with root package name */
    public b f25986s;

    /* renamed from: t, reason: collision with root package name */
    public r f25987t;

    /* renamed from: u, reason: collision with root package name */
    public r f25988u;

    /* renamed from: v, reason: collision with root package name */
    public b1 f25989v;

    /* renamed from: w, reason: collision with root package name */
    public ByteBuffer f25990w;

    /* renamed from: x, reason: collision with root package name */
    public int f25991x;

    /* renamed from: y, reason: collision with root package name */
    public long f25992y;

    /* renamed from: z, reason: collision with root package name */
    public long f25993z;

    public s(d dVar, qm.c cVar) {
        this.f25970a = dVar;
        this.f25971b = cVar;
        int i10 = qb.v.f20828a;
        this.f25972c = false;
        this.k = false;
        this.f25977h = new ConditionVariable(true);
        this.f25978i = new n(new oh.p(28, this));
        q qVar = new q();
        this.f25973d = qVar;
        z zVar = new z();
        zVar.f26032m = qb.v.f20833f;
        this.f25974e = zVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new w(), qVar, zVar);
        Collections.addAll(arrayList, (g[]) cVar.f20918d);
        this.f25975f = (g[]) arrayList.toArray(new g[0]);
        this.f25976g = new g[]{new t()};
        this.G = 1.0f;
        this.f25986s = b.f25910b;
        this.T = 0;
        this.U = new o();
        b1 b1Var = b1.f4069d;
        this.f25988u = new r(b1Var, false, 0L, 0L);
        this.f25989v = b1Var;
        this.O = -1;
        this.H = new g[0];
        this.I = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.f25980m = new f5.w(1);
        this.f25981n = new f5.w(1);
    }

    public static AudioFormat e(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair f(com.google.android.exoplayer2.Format r12, y9.d r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.s.f(com.google.android.exoplayer2.Format, y9.d):android.util.Pair");
    }

    public static boolean o(AudioTrack audioTrack) {
        return qb.v.f20828a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j) {
        b1 b1Var;
        boolean z10;
        boolean zU = u();
        qm.c cVar = this.f25971b;
        if (zU) {
            b1Var = h().f25966a;
            y yVar = (y) cVar.f20920r;
            float f10 = b1Var.f4070a;
            if (yVar.f26018c != f10) {
                yVar.f26018c = f10;
                yVar.f26024i = true;
            }
            float f11 = b1Var.f4071b;
            if (yVar.f26019d != f11) {
                yVar.f26019d = f11;
                yVar.f26024i = true;
            }
        } else {
            b1Var = b1.f4069d;
        }
        b1 b1Var2 = b1Var;
        int i10 = 0;
        if (u()) {
            boolean z11 = h().f25967b;
            ((x) cVar.f20919g).f26009m = z11;
            z10 = z11;
        } else {
            z10 = false;
        }
        this.j.add(new r(b1Var2, z10, Math.max(0L, j), (j() * 1000000) / this.f25984q.f8585d));
        g[] gVarArr = (g[]) this.f25984q.f8590i;
        ArrayList arrayList = new ArrayList();
        for (g gVar : gVarArr) {
            if (gVar.b()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.H = (g[]) arrayList.toArray(new g[size]);
        this.I = new ByteBuffer[size];
        while (true) {
            g[] gVarArr2 = this.H;
            if (i10 >= gVarArr2.length) {
                break;
            }
            g gVar2 = gVarArr2[i10];
            gVar2.flush();
            this.I[i10] = gVar2.a();
            i10++;
        }
        u uVar = this.f25982o;
        if (uVar != null) {
            xr.a aVar = ((v) uVar.f25996d).f25997a1;
            Handler handler = (Handler) aVar.f25482d;
            if (handler != null) {
                handler.post(new f5.h(aVar, z10, 2));
            }
        }
    }

    public final void b(Format format, int[] iArr) throws k {
        int iIntValue;
        int i10;
        int i11;
        int i12;
        g[] gVarArr;
        int i13;
        int i14;
        int[] iArr2;
        String str = format.H;
        int i15 = format.V;
        int i16 = format.U;
        int i17 = format.W;
        if ("audio/raw".equals(str)) {
            qb.b.g(qb.v.A(i17));
            int iU = qb.v.u(i17, i16);
            g[] gVarArr2 = (this.f25972c && (i17 == 536870912 || i17 == 805306368 || i17 == 4)) ? this.f25976g : this.f25975f;
            int i18 = format.X;
            int i19 = format.Y;
            z zVar = this.f25974e;
            zVar.f26030i = i18;
            zVar.j = i19;
            if (qb.v.f20828a < 21 && i16 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i20 = 0; i20 < 6; i20++) {
                    iArr2[i20] = i20;
                }
            } else {
                iArr2 = iArr;
            }
            this.f25973d.f25965i = iArr2;
            e eVar = new e(i15, i16, i17);
            for (g gVar : gVarArr2) {
                try {
                    e eVarF = gVar.f(eVar);
                    if (gVar.b()) {
                        eVar = eVarF;
                    }
                } catch (f e4) {
                    throw new k(e4, format);
                }
            }
            int i21 = eVar.f25920c;
            int i22 = eVar.f25919b;
            int i23 = eVar.f25918a;
            iIntValue = qb.v.n(i22);
            int iU2 = qb.v.u(i21, i22);
            i13 = iU;
            i10 = iU2;
            i12 = i21;
            gVarArr = gVarArr2;
            i14 = i23;
            i11 = 0;
        } else {
            g[] gVarArr3 = new g[0];
            int i24 = qb.v.f20828a;
            Pair pairF = f(format, this.f25970a);
            if (pairF == null) {
                String strValueOf = String.valueOf(format);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 37);
                sb2.append("Unable to configure passthrough for: ");
                sb2.append(strValueOf);
                throw new k(sb2.toString(), format);
            }
            int iIntValue2 = ((Integer) pairF.first).intValue();
            iIntValue = ((Integer) pairF.second).intValue();
            i10 = -1;
            i11 = 2;
            i12 = iIntValue2;
            gVarArr = gVarArr3;
            i13 = -1;
            i14 = i15;
        }
        if (i12 == 0) {
            String strValueOf2 = String.valueOf(format);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 48);
            sb3.append("Invalid output encoding (mode=");
            sb3.append(i11);
            sb3.append(") for: ");
            sb3.append(strValueOf2);
            throw new k(sb3.toString(), format);
        }
        if (iIntValue != 0) {
            this.X = false;
            f5.u uVar = new f5.u(format, i13, i11, i10, i14, iIntValue, i12, this.k, gVarArr);
            if (n()) {
                this.f25983p = uVar;
                return;
            } else {
                this.f25984q = uVar;
                return;
            }
        }
        String strValueOf3 = String.valueOf(format);
        StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 54);
        sb4.append("Invalid output channel config (mode=");
        sb4.append(i11);
        sb4.append(") for: ");
        sb4.append(strValueOf3);
        throw new k(sb4.toString(), format);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r9.L != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.O
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.O = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.O
            y9.g[] r5 = r9.H
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.e()
        L1f:
            r9.q(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L29
            goto L3a
        L29:
            int r0 = r9.O
            int r0 = r0 + r1
            r9.O = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.L
            if (r0 == 0) goto L3b
            r9.v(r0, r7)
            java.nio.ByteBuffer r0 = r9.L
            if (r0 == 0) goto L3b
        L3a:
            return r2
        L3b:
            r9.O = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.s.c():boolean");
    }

    public final void d() throws IllegalStateException {
        if (n()) {
            this.f25992y = 0L;
            this.f25993z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.Y = false;
            this.C = 0;
            this.f25988u = new r(h().f25966a, h().f25967b, 0L, 0L);
            this.F = 0L;
            this.f25987t = null;
            this.j.clear();
            this.J = null;
            this.K = 0;
            this.L = null;
            this.Q = false;
            this.P = false;
            this.O = -1;
            this.f25990w = null;
            this.f25991x = 0;
            this.f25974e.f26034o = 0L;
            int i10 = 0;
            while (true) {
                g[] gVarArr = this.H;
                if (i10 >= gVarArr.length) {
                    break;
                }
                g gVar = gVarArr[i10];
                gVar.flush();
                this.I[i10] = gVar.a();
                i10++;
            }
            n nVar = this.f25978i;
            AudioTrack audioTrack = nVar.f25936c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f25985r.pause();
            }
            if (o(this.f25985r)) {
                qm.c cVar = this.f25979l;
                cVar.getClass();
                this.f25985r.unregisterStreamEventCallback((f5.y) cVar.f20919g);
                ((Handler) cVar.f20918d).removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.f25985r;
            this.f25985r = null;
            if (qb.v.f20828a < 21 && !this.S) {
                this.T = 0;
            }
            f5.u uVar = this.f25983p;
            if (uVar != null) {
                this.f25984q = uVar;
                this.f25983p = null;
            }
            nVar.f25943l = 0L;
            nVar.f25954w = 0;
            nVar.f25953v = 0;
            nVar.f25944m = 0L;
            nVar.C = 0L;
            nVar.F = 0L;
            nVar.k = false;
            nVar.f25936c = null;
            nVar.f25939f = null;
            this.f25977h.close();
            new b0(this, audioTrack2).start();
        }
        this.f25981n.f8596b = null;
        this.f25980m.f8596b = null;
    }

    public final int g(Format format) {
        String str = format.H;
        int i10 = format.W;
        if (!"audio/raw".equals(str)) {
            if (!this.X) {
                int i11 = qb.v.f20828a;
            }
            if (f(format, this.f25970a) == null) {
                return 0;
            }
        } else {
            if (!qb.v.A(i10)) {
                c7.a.y("Invalid PCM encoding: ", 33, i10, "DefaultAudioSink");
                return 0;
            }
            if (i10 != 2 && (!this.f25972c || i10 != 4)) {
                return 1;
            }
        }
        return 2;
    }

    public final r h() {
        r rVar = this.f25987t;
        if (rVar != null) {
            return rVar;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (r) arrayDeque.getLast() : this.f25988u;
    }

    public final long i() {
        return this.f25984q.f8583b == 0 ? this.f25992y / r0.f8582a : this.f25993z;
    }

    public final long j() {
        return this.f25984q.f8583b == 0 ? this.A / r0.f8584c : this.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x02cc, code lost:
    
        if (r13 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f4, code lost:
    
        if (r9.a() == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(java.nio.ByteBuffer r27, long r28, int r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.s.k(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean l() {
        return n() && this.f25978i.b(j());
    }

    public final void m() throws l {
        this.f25977h.block();
        try {
            f5.u uVar = this.f25984q;
            uVar.getClass();
            AudioTrack audioTrackB = uVar.b(this.V, this.f25986s, this.T);
            this.f25985r = audioTrackB;
            if (o(audioTrackB)) {
                AudioTrack audioTrack = this.f25985r;
                if (this.f25979l == null) {
                    this.f25979l = new qm.c(this);
                }
                qm.c cVar = this.f25979l;
                Handler handler = (Handler) cVar.f20918d;
                Objects.requireNonNull(handler);
                audioTrack.registerStreamEventCallback(new f5.x(handler), (f5.y) cVar.f20919g);
                AudioTrack audioTrack2 = this.f25985r;
                Format format = (Format) this.f25984q.f8589h;
                audioTrack2.setOffloadDelayPadding(format.X, format.Y);
            }
            this.T = this.f25985r.getAudioSessionId();
            AudioTrack audioTrack3 = this.f25985r;
            f5.u uVar2 = this.f25984q;
            boolean z10 = uVar2.f8583b == 2;
            int i10 = uVar2.f8587f;
            int i11 = uVar2.f8584c;
            int i12 = uVar2.f8588g;
            n nVar = this.f25978i;
            nVar.f25936c = audioTrack3;
            nVar.f25937d = i11;
            nVar.f25938e = i12;
            nVar.f25939f = new f5.n(audioTrack3, 1);
            nVar.f25940g = audioTrack3.getSampleRate();
            nVar.f25941h = z10 && qb.v.f20828a < 23 && (i10 == 5 || i10 == 6);
            boolean zA = qb.v.A(i10);
            nVar.f25948q = zA;
            nVar.f25942i = zA ? ((i12 / i11) * 1000000) / nVar.f25940g : -9223372036854775807L;
            nVar.f25950s = 0L;
            nVar.f25951t = 0L;
            nVar.f25952u = 0L;
            nVar.f25947p = false;
            nVar.f25955x = -9223372036854775807L;
            nVar.f25956y = -9223372036854775807L;
            nVar.f25949r = 0L;
            nVar.f25946o = 0L;
            nVar.j = 1.0f;
            if (n()) {
                if (qb.v.f20828a >= 21) {
                    this.f25985r.setVolume(this.G);
                } else {
                    AudioTrack audioTrack4 = this.f25985r;
                    float f10 = this.G;
                    audioTrack4.setStereoVolume(f10, f10);
                }
            }
            this.U.getClass();
            this.E = true;
        } catch (l e4) {
            if (this.f25984q.f8583b == 1) {
                this.X = true;
            }
            u uVar3 = this.f25982o;
            if (uVar3 != null) {
                uVar3.c(e4);
            }
            throw e4;
        }
    }

    public final boolean n() {
        return this.f25985r != null;
    }

    public final void p() throws IllegalStateException {
        if (this.Q) {
            return;
        }
        this.Q = true;
        long j = j();
        n nVar = this.f25978i;
        nVar.f25957z = nVar.a();
        nVar.f25955x = SystemClock.elapsedRealtime() * 1000;
        nVar.A = j;
        this.f25985r.stop();
        this.f25991x = 0;
    }

    public final void q(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.H.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.I[i10 - 1];
            } else {
                byteBuffer = this.J;
                if (byteBuffer == null) {
                    byteBuffer = g.f25922a;
                }
            }
            if (i10 == length) {
                v(byteBuffer, j);
            } else {
                g gVar = this.H[i10];
                if (i10 > this.O) {
                    gVar.d(byteBuffer);
                }
                ByteBuffer byteBufferA = gVar.a();
                this.I[i10] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void r() throws IllegalStateException {
        d();
        for (g gVar : this.f25975f) {
            gVar.reset();
        }
        for (g gVar2 : this.f25976g) {
            gVar2.reset();
        }
        this.R = false;
        this.X = false;
    }

    public final void s(b1 b1Var, boolean z10) {
        r rVarH = h();
        if (b1Var.equals(rVarH.f25966a) && z10 == rVarH.f25967b) {
            return;
        }
        r rVar = new r(b1Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (n()) {
            this.f25987t = rVar;
        } else {
            this.f25988u = rVar;
        }
    }

    public final void t(b1 b1Var) {
        if (n()) {
            try {
                this.f25985r.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(b1Var.f4070a).setPitch(b1Var.f4071b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e4) {
                qb.b.J("DefaultAudioSink", "Failed to set playback params", e4);
            }
            b1Var = new b1(this.f25985r.getPlaybackParams().getSpeed(), this.f25985r.getPlaybackParams().getPitch());
            float f10 = b1Var.f4070a;
            n nVar = this.f25978i;
            nVar.j = f10;
            f5.n nVar2 = nVar.f25939f;
            if (nVar2 != null) {
                nVar2.a();
            }
        }
        this.f25989v = b1Var;
    }

    public final boolean u() {
        if (this.V || !"audio/raw".equals(((Format) this.f25984q.f8589h).H)) {
            return false;
        }
        int i10 = ((Format) this.f25984q.f8589h).W;
        if (!this.f25972c) {
            return true;
        }
        int i11 = qb.v.f20828a;
        return (i10 == 536870912 || i10 == 805306368 || i10 == 4) ? false : true;
    }

    public final void v(ByteBuffer byteBuffer, long j) throws Exception {
        ByteBuffer byteBuffer2;
        int iWrite;
        int iWrite2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.L;
            if (byteBuffer3 != null) {
                qb.b.g(byteBuffer3 == byteBuffer);
            } else {
                this.L = byteBuffer;
                if (qb.v.f20828a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.M;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.M = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.M, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.N = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = qb.v.f20828a;
            n nVar = this.f25978i;
            if (i10 < 21) {
                int iA = nVar.f25938e - ((int) (this.A - (nVar.a() * nVar.f25937d)));
                if (iA > 0) {
                    iWrite = this.f25985r.write(this.M, this.N, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.N += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.V) {
                qb.b.j(j != -9223372036854775807L);
                AudioTrack audioTrack = this.f25985r;
                if (i10 >= 26) {
                    byteBuffer2 = byteBuffer;
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1, 1000 * j);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f25990w == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f25990w = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f25990w.putInt(1431633921);
                    }
                    if (this.f25991x == 0) {
                        this.f25990w.putInt(4, iRemaining2);
                        this.f25990w.putLong(8, j * 1000);
                        this.f25990w.position(0);
                        this.f25991x = iRemaining2;
                    }
                    int iRemaining3 = this.f25990w.remaining();
                    if (iRemaining3 > 0) {
                        iWrite = audioTrack.write(this.f25990w, iRemaining3, 1);
                        if (iWrite < 0) {
                            this.f25991x = 0;
                        } else if (iWrite < iRemaining3) {
                            iWrite = 0;
                        }
                    }
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f25991x = 0;
                    } else {
                        this.f25991x -= iWrite2;
                    }
                }
                iWrite = iWrite2;
            } else {
                byteBuffer2 = byteBuffer;
                iWrite = this.f25985r.write(byteBuffer2, iRemaining2, 1);
            }
            this.W = SystemClock.elapsedRealtime();
            f5.w wVar = this.f25981n;
            if (iWrite < 0) {
                boolean z10 = (i10 >= 24 && iWrite == -6) || iWrite == -32;
                if (z10 && this.f25984q.f8583b == 1) {
                    this.X = true;
                }
                m mVar = new m(iWrite, (Format) this.f25984q.f8589h, z10);
                u uVar = this.f25982o;
                if (uVar != null) {
                    uVar.c(mVar);
                }
                if (mVar.f25932a) {
                    throw mVar;
                }
                wVar.a(mVar);
                return;
            }
            wVar.f8596b = null;
            if (o(this.f25985r)) {
                long j7 = this.B;
                if (j7 > 0) {
                    this.Y = false;
                }
                if (this.R && this.f25982o != null && iWrite < iRemaining2 && !this.Y) {
                    long jD = com.google.android.exoplayer2.h.d(((j7 - nVar.a()) * 1000000) / nVar.f25940g);
                    a0 a0Var = ((v) this.f25982o.f25996d).f26006j1;
                    if (a0Var != null && jD >= ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS) {
                        a0Var.f4046a.f4115b0 = true;
                    }
                }
            }
            int i11 = this.f25984q.f8583b;
            if (i11 == 0) {
                this.A += iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i11 != 0) {
                    qb.b.j(byteBuffer2 == this.J);
                    this.B += this.C * this.K;
                }
                this.L = null;
            }
        }
    }
}
