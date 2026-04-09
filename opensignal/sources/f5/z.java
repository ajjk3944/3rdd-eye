package f5;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.j0;
import androidx.media3.common.n0;
import e5.o0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class z implements l {

    /* renamed from: d0, reason: collision with root package name */
    public static final Object f8601d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public static ExecutorService f8602e0;

    /* renamed from: f0, reason: collision with root package name */
    public static int f8603f0;
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public y4.c[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public androidx.media3.common.g X;
    public t Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f8604a;

    /* renamed from: a0, reason: collision with root package name */
    public long f8605a0;

    /* renamed from: b, reason: collision with root package name */
    public final bm.d f8606b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f8607b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8608c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f8609c0;

    /* renamed from: d, reason: collision with root package name */
    public final q f8610d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f8611e;

    /* renamed from: f, reason: collision with root package name */
    public final y4.c[] f8612f;

    /* renamed from: g, reason: collision with root package name */
    public final y4.c[] f8613g;

    /* renamed from: h, reason: collision with root package name */
    public final a5.d f8614h;

    /* renamed from: i, reason: collision with root package name */
    public final o f8615i;
    public final ArrayDeque j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8616l;

    /* renamed from: m, reason: collision with root package name */
    public bm.d f8617m;

    /* renamed from: n, reason: collision with root package name */
    public final w f8618n;

    /* renamed from: o, reason: collision with root package name */
    public final w f8619o;

    /* renamed from: p, reason: collision with root package name */
    public final a0 f8620p;

    /* renamed from: q, reason: collision with root package name */
    public o0 f8621q;

    /* renamed from: r, reason: collision with root package name */
    public b9.e f8622r;

    /* renamed from: s, reason: collision with root package name */
    public u f8623s;

    /* renamed from: t, reason: collision with root package name */
    public u f8624t;

    /* renamed from: u, reason: collision with root package name */
    public AudioTrack f8625u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.media3.common.f f8626v;

    /* renamed from: w, reason: collision with root package name */
    public v f8627w;

    /* renamed from: x, reason: collision with root package name */
    public v f8628x;

    /* renamed from: y, reason: collision with root package name */
    public n0 f8629y;

    /* renamed from: z, reason: collision with root package name */
    public ByteBuffer f8630z;

    public z(bm.d dVar) {
        this.f8604a = (b) dVar.f2826d;
        bm.d dVar2 = (bm.d) dVar.f2827g;
        this.f8606b = dVar2;
        int i10 = a5.d0.f105a;
        this.f8608c = false;
        this.k = false;
        this.f8616l = 0;
        this.f8620p = (a0) dVar.f2828r;
        a5.d dVar3 = new a5.d(0);
        this.f8614h = dVar3;
        dVar3.d();
        this.f8615i = new o(new b9.c(19, this));
        q qVar = new q();
        this.f8610d = qVar;
        i0 i0Var = new i0();
        i0Var.f8529m = a5.d0.f109e;
        this.f8611e = i0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new e0(), qVar, i0Var);
        Collections.addAll(arrayList, (y4.c[]) dVar2.f2826d);
        this.f8612f = (y4.c[]) arrayList.toArray(new y4.c[0]);
        this.f8613g = new y4.c[]{new b0()};
        this.J = 1.0f;
        this.f8626v = androidx.media3.common.f.B;
        this.W = 0;
        this.X = new androidx.media3.common.g();
        n0 n0Var = n0.f1724r;
        this.f8628x = new v(n0Var, false, 0L, 0L);
        this.f8629y = n0Var;
        this.R = -1;
        this.K = new y4.c[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.f8618n = new w(0);
        this.f8619o = new w(0);
    }

    public static AudioFormat e(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        return a5.d0.f105a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j) {
        n0 n0Var;
        boolean z10;
        boolean zT = t();
        bm.d dVar = this.f8606b;
        if (zT) {
            n0Var = g().f8591a;
            h0 h0Var = (h0) dVar.f2828r;
            float f10 = n0Var.f1725a;
            if (h0Var.f8514c != f10) {
                h0Var.f8514c = f10;
                h0Var.f8520i = true;
            }
            float f11 = n0Var.f1726d;
            if (h0Var.f8515d != f11) {
                h0Var.f8515d = f11;
                h0Var.f8520i = true;
            }
        } else {
            n0Var = n0.f1724r;
        }
        n0 n0Var2 = n0Var;
        int i10 = 0;
        if (t()) {
            boolean z11 = g().f8592b;
            ((f0) dVar.f2827g).f8476m = z11;
            z10 = z11;
        } else {
            z10 = false;
        }
        this.j.add(new v(n0Var2, z10, Math.max(0L, j), (i() * 1000000) / this.f8624t.f8585d));
        y4.c[] cVarArr = (y4.c[]) this.f8624t.f8590i;
        ArrayList arrayList = new ArrayList();
        for (y4.c cVar : cVarArr) {
            if (cVar.b()) {
                arrayList.add(cVar);
            } else {
                cVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (y4.c[]) arrayList.toArray(new y4.c[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            y4.c[] cVarArr2 = this.K;
            if (i10 >= cVarArr2.length) {
                break;
            }
            y4.c cVar2 = cVarArr2[i10];
            cVar2.flush();
            this.L[i10] = cVar2.a();
            i10++;
        }
        b9.e eVar = this.f8622r;
        if (eVar != null) {
            io.sentry.internal.debugmeta.c cVar3 = ((d0) eVar.f2481d).Y0;
            Handler handler = (Handler) cVar3.f12353d;
            if (handler != null) {
                handler.post(new h(cVar3, z10, 0));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.media3.common.r r24, int[] r25) throws f5.i {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.z.b(androidx.media3.common.r, int[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r9.O != null) goto L20;
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
            int r0 = r9.R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.R
            y4.c[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.e()
        L1f:
            r9.p(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L29
            goto L3a
        L29:
            int r0 = r9.R
            int r0 = r0 + r1
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.v(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
        L3a:
            return r2
        L3b:
            r9.R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.z.c():boolean");
    }

    public final void d() throws IllegalStateException {
        if (m()) {
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.f8609c0 = false;
            this.F = 0;
            this.f8628x = new v(g().f8591a, g().f8592b, 0L, 0L);
            this.I = 0L;
            this.f8627w = null;
            this.j.clear();
            this.M = null;
            this.N = 0;
            this.O = null;
            this.T = false;
            this.S = false;
            this.R = -1;
            this.f8630z = null;
            this.A = 0;
            this.f8611e.f8531o = 0L;
            int i10 = 0;
            while (true) {
                y4.c[] cVarArr = this.K;
                if (i10 >= cVarArr.length) {
                    break;
                }
                y4.c cVar = cVarArr[i10];
                cVar.flush();
                this.L[i10] = cVar.a();
                i10++;
            }
            AudioTrack audioTrack = this.f8615i.f8551c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f8625u.pause();
            }
            if (n(this.f8625u)) {
                bm.d dVar = this.f8617m;
                dVar.getClass();
                this.f8625u.unregisterStreamEventCallback((y) dVar.f2827g);
                ((Handler) dVar.f2826d).removeCallbacksAndMessages(null);
            }
            if (a5.d0.f105a < 21 && !this.V) {
                this.W = 0;
            }
            u uVar = this.f8623s;
            if (uVar != null) {
                this.f8624t = uVar;
                this.f8623s = null;
            }
            o oVar = this.f8615i;
            oVar.c();
            oVar.f8551c = null;
            oVar.f8554f = null;
            AudioTrack audioTrack2 = this.f8625u;
            a5.d dVar2 = this.f8614h;
            dVar2.c();
            synchronized (f8601d0) {
                try {
                    if (f8602e0 == null) {
                        f8602e0 = Executors.newSingleThreadExecutor(new a5.c0("ExoPlayer:AudioTrackReleaseThread", 0));
                    }
                    f8603f0++;
                    f8602e0.execute(new a5.o(audioTrack2, 14, dVar2));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f8625u = null;
        }
        this.f8619o.f8596b = null;
        this.f8618n.f8596b = null;
    }

    public final int f(androidx.media3.common.r rVar) {
        String str = rVar.H;
        int i10 = rVar.W;
        if ("audio/raw".equals(str)) {
            if (!a5.d0.C(i10)) {
                c7.a.z("Invalid PCM encoding: ", i10, "DefaultAudioSink");
                return 0;
            }
            if (i10 != 2 && (!this.f8608c || i10 != 4)) {
                return 1;
            }
        } else if ((this.f8607b0 || !u(this.f8626v, rVar)) && this.f8604a.a(rVar) == null) {
            return 0;
        }
        return 2;
    }

    public final v g() {
        v vVar = this.f8627w;
        if (vVar != null) {
            return vVar;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (v) arrayDeque.getLast() : this.f8628x;
    }

    public final long h() {
        return this.f8624t.f8583b == 0 ? this.B / r0.f8582a : this.C;
    }

    public final long i() {
        return this.f8624t.f8583b == 0 ? this.D / r0.f8584c : this.E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02fa, code lost:
    
        if (r5 != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        if (r10.a() == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.nio.ByteBuffer r27, long r28, int r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.z.j(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean k() {
        return m() && this.f8615i.b(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() throws f5.j {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.z.l():boolean");
    }

    public final boolean m() {
        return this.f8625u != null;
    }

    public final void o() throws IllegalStateException {
        if (this.T) {
            return;
        }
        this.T = true;
        long jI = i();
        o oVar = this.f8615i;
        oVar.A = oVar.a();
        oVar.f8571y = SystemClock.elapsedRealtime() * 1000;
        oVar.B = jI;
        this.f8625u.stop();
        this.A = 0;
    }

    public final void p(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = y4.c.f25844a;
                }
            }
            if (i10 == length) {
                v(byteBuffer, j);
            } else {
                y4.c cVar = this.K[i10];
                if (i10 > this.R) {
                    cVar.d(byteBuffer);
                }
                ByteBuffer byteBufferA = cVar.a();
                this.L[i10] = byteBufferA;
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

    public final void q() throws IllegalStateException {
        d();
        for (y4.c cVar : this.f8612f) {
            cVar.reset();
        }
        for (y4.c cVar2 : this.f8613g) {
            cVar2.reset();
        }
        this.U = false;
        this.f8607b0 = false;
    }

    public final void r(n0 n0Var, boolean z10) {
        v vVarG = g();
        if (n0Var.equals(vVarG.f8591a) && z10 == vVarG.f8592b) {
            return;
        }
        v vVar = new v(n0Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (m()) {
            this.f8627w = vVar;
        } else {
            this.f8628x = vVar;
        }
    }

    public final void s(n0 n0Var) {
        if (m()) {
            try {
                this.f8625u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(n0Var.f1725a).setPitch(n0Var.f1726d).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e4) {
                a5.a.C("DefaultAudioSink", "Failed to set playback params", e4);
            }
            n0Var = new n0(this.f8625u.getPlaybackParams().getSpeed(), this.f8625u.getPlaybackParams().getPitch());
            float f10 = n0Var.f1725a;
            o oVar = this.f8615i;
            oVar.j = f10;
            n nVar = oVar.f8554f;
            if (nVar != null) {
                nVar.a();
            }
            oVar.c();
        }
        this.f8629y = n0Var;
    }

    public final boolean t() {
        if (this.Z || !"audio/raw".equals(((androidx.media3.common.r) this.f8624t.f8589h).H)) {
            return false;
        }
        int i10 = ((androidx.media3.common.r) this.f8624t.f8589h).W;
        if (!this.f8608c) {
            return true;
        }
        int i11 = a5.d0.f105a;
        return (i10 == 536870912 || i10 == 805306368 || i10 == 4) ? false : true;
    }

    public final boolean u(androidx.media3.common.f fVar, androidx.media3.common.r rVar) {
        int i10;
        int iM;
        int i11 = a5.d0.f105a;
        if (i11 >= 29 && (i10 = this.f8616l) != 0) {
            String str = rVar.H;
            str.getClass();
            int iB = j0.b(str, rVar.E);
            if (iB != 0 && (iM = a5.d0.m(rVar.U)) != 0) {
                AudioFormat audioFormatE = e(rVar.V, iM, iB);
                AudioAttributes audioAttributes = (AudioAttributes) fVar.a().f2481d;
                int playbackOffloadSupport = i11 >= 31 ? AudioManager.getPlaybackOffloadSupport(audioFormatE, audioAttributes) : !AudioManager.isOffloadedPlaybackSupported(audioFormatE, audioAttributes) ? 0 : (i11 == 30 && a5.d0.f108d.startsWith("Pixel")) ? 2 : 1;
                if (playbackOffloadSupport != 0) {
                    if (playbackOffloadSupport == 1) {
                        boolean z10 = (rVar.X == 0 && rVar.Y == 0) ? false : true;
                        boolean z11 = i10 == 1;
                        if (!z10 || !z11) {
                        }
                    } else if (playbackOffloadSupport != 2) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void v(ByteBuffer byteBuffer, long j) throws Exception {
        ByteBuffer byteBuffer2;
        int iWrite;
        int iWrite2;
        b9.e eVar;
        d5.a0 a0Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.O;
            if (byteBuffer3 != null) {
                a5.a.e(byteBuffer3 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (a5.d0.f105a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.P = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.P, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.Q = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = a5.d0.f105a;
            if (i10 < 21) {
                long j7 = this.D;
                o oVar = this.f8615i;
                int iA = oVar.f8553e - ((int) (j7 - (oVar.a() * oVar.f8552d)));
                if (iA > 0) {
                    iWrite = this.f8625u.write(this.P, this.Q, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.Q += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.Z) {
                a5.a.i(j != -9223372036854775807L);
                AudioTrack audioTrack = this.f8625u;
                if (i10 >= 26) {
                    byteBuffer2 = byteBuffer;
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1, j * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f8630z == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f8630z = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f8630z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.f8630z.putInt(4, iRemaining2);
                        this.f8630z.putLong(8, j * 1000);
                        this.f8630z.position(0);
                        this.A = iRemaining2;
                    }
                    int iRemaining3 = this.f8630z.remaining();
                    if (iRemaining3 > 0) {
                        iWrite = audioTrack.write(this.f8630z, iRemaining3, 1);
                        if (iWrite < 0) {
                            this.A = 0;
                        } else if (iWrite < iRemaining3) {
                            iWrite = 0;
                        }
                    }
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.A = 0;
                    } else {
                        this.A -= iWrite2;
                    }
                }
                iWrite = iWrite2;
            } else {
                byteBuffer2 = byteBuffer;
                iWrite = this.f8625u.write(byteBuffer2, iRemaining2, 1);
            }
            this.f8605a0 = SystemClock.elapsedRealtime();
            w wVar = this.f8619o;
            if (iWrite < 0) {
                k kVar = new k(iWrite, (androidx.media3.common.r) this.f8624t.f8589h, ((i10 >= 24 && iWrite == -6) || iWrite == -32) && this.E > 0);
                b9.e eVar2 = this.f8622r;
                if (eVar2 != null) {
                    eVar2.B(kVar);
                }
                if (kVar.f8535d) {
                    throw kVar;
                }
                wVar.a(kVar);
                return;
            }
            wVar.f8596b = null;
            if (n(this.f8625u)) {
                if (this.E > 0) {
                    this.f8609c0 = false;
                }
                if (this.U && (eVar = this.f8622r) != null && iWrite < iRemaining2 && !this.f8609c0 && (a0Var = ((d0) eVar.f2481d).f8465i1) != null) {
                    a0Var.f6924a.f6969c0 = true;
                }
            }
            int i11 = this.f8624t.f8583b;
            if (i11 == 0) {
                this.D += iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i11 != 0) {
                    a5.a.i(byteBuffer2 == this.M);
                    this.E = (this.F * this.N) + this.E;
                }
                this.O = null;
            }
        }
    }
}
