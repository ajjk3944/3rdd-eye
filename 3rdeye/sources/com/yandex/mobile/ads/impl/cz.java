package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.yandex.mobile.ads.impl.dz;
import com.yandex.mobile.ads.impl.nh;
import com.yandex.mobile.ads.impl.ph;
import com.yandex.mobile.ads.impl.sh;
import com.yandex.mobile.ads.impl.vu0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class cz implements ph {

    /* renamed from: A, reason: collision with root package name */
    private int f25805A;

    /* renamed from: B, reason: collision with root package name */
    private long f25806B;

    /* renamed from: C, reason: collision with root package name */
    private long f25807C;

    /* renamed from: D, reason: collision with root package name */
    private long f25808D;

    /* renamed from: E, reason: collision with root package name */
    private long f25809E;

    /* renamed from: F, reason: collision with root package name */
    private int f25810F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f25811G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f25812H;

    /* renamed from: I, reason: collision with root package name */
    private long f25813I;

    /* renamed from: J, reason: collision with root package name */
    private float f25814J;

    /* renamed from: K, reason: collision with root package name */
    private nh[] f25815K;

    /* renamed from: L, reason: collision with root package name */
    private ByteBuffer[] f25816L;

    /* renamed from: M, reason: collision with root package name */
    private ByteBuffer f25817M;

    /* renamed from: N, reason: collision with root package name */
    private int f25818N;

    /* renamed from: O, reason: collision with root package name */
    private ByteBuffer f25819O;

    /* renamed from: P, reason: collision with root package name */
    private byte[] f25820P;

    /* renamed from: Q, reason: collision with root package name */
    private int f25821Q;

    /* renamed from: R, reason: collision with root package name */
    private int f25822R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f25823S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f25824T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f25825U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f25826V;

    /* renamed from: W, reason: collision with root package name */
    private int f25827W;

    /* renamed from: X, reason: collision with root package name */
    private ci f25828X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f25829Y;

    /* renamed from: Z, reason: collision with root package name */
    private long f25830Z;

    /* renamed from: a, reason: collision with root package name */
    private final kh f25831a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f25832a0;

    /* renamed from: b, reason: collision with root package name */
    private final c f25833b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f25834b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25835c;

    /* renamed from: d, reason: collision with root package name */
    private final bo f25836d;

    /* renamed from: e, reason: collision with root package name */
    private final u62 f25837e;

    /* renamed from: f, reason: collision with root package name */
    private final nh[] f25838f;

    /* renamed from: g, reason: collision with root package name */
    private final nh[] f25839g;

    /* renamed from: h, reason: collision with root package name */
    private final cr f25840h;
    private final sh i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<i> f25841j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f25842k;

    /* renamed from: l, reason: collision with root package name */
    private final int f25843l;

    /* renamed from: m, reason: collision with root package name */
    private l f25844m;

    /* renamed from: n, reason: collision with root package name */
    private final j<ph.b> f25845n;

    /* renamed from: o, reason: collision with root package name */
    private final j<ph.e> f25846o;

    /* renamed from: p, reason: collision with root package name */
    private final dz f25847p;

    /* renamed from: q, reason: collision with root package name */
    private gi1 f25848q;

    /* renamed from: r, reason: collision with root package name */
    private ph.c f25849r;

    /* renamed from: s, reason: collision with root package name */
    private f f25850s;

    /* renamed from: t, reason: collision with root package name */
    private f f25851t;

    /* renamed from: u, reason: collision with root package name */
    private AudioTrack f25852u;

    /* renamed from: v, reason: collision with root package name */
    private ih f25853v;

    /* renamed from: w, reason: collision with root package name */
    private i f25854w;

    /* renamed from: x, reason: collision with root package name */
    private i f25855x;

    /* renamed from: y, reason: collision with root package name */
    private vh1 f25856y;

    /* renamed from: z, reason: collision with root package name */
    private ByteBuffer f25857z;

    public class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AudioTrack f25858b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f25858b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                this.f25858b.flush();
                this.f25858b.release();
            } finally {
                cz.this.f25840h.e();
            }
        }
    }

    public static final class b {
        public static void a(AudioTrack audioTrack, gi1 gi1Var) {
            LogSessionId logSessionIdA = gi1Var.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public interface c {
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final dz f25860a = new dz(new dz.a());
    }

    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        private g f25862b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f25863c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f25864d;

        /* renamed from: a, reason: collision with root package name */
        private kh f25861a = kh.f29661d;

        /* renamed from: e, reason: collision with root package name */
        private int f25865e = 0;

        /* renamed from: f, reason: collision with root package name */
        dz f25866f = d.f25860a;

        public final cz a() {
            int i = 0;
            if (this.f25862b == null) {
                this.f25862b = new g(new nh[0], new yx1(0), new b12());
            }
            return new cz(this, i);
        }

        public final e b() {
            this.f25864d = false;
            return this;
        }

        public final e c() {
            this.f25863c = false;
            return this;
        }

        public final e d() {
            this.f25865e = 0;
            return this;
        }

        public final e a(kh khVar) {
            khVar.getClass();
            this.f25861a = khVar;
            return this;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final dc0 f25867a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25868b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25869c;

        /* renamed from: d, reason: collision with root package name */
        public final int f25870d;

        /* renamed from: e, reason: collision with root package name */
        public final int f25871e;

        /* renamed from: f, reason: collision with root package name */
        public final int f25872f;

        /* renamed from: g, reason: collision with root package name */
        public final int f25873g;

        /* renamed from: h, reason: collision with root package name */
        public final int f25874h;
        public final nh[] i;

        public f(dc0 dc0Var, int i, int i10, int i11, int i12, int i13, int i14, int i15, nh[] nhVarArr) {
            this.f25867a = dc0Var;
            this.f25868b = i;
            this.f25869c = i10;
            this.f25870d = i11;
            this.f25871e = i12;
            this.f25872f = i13;
            this.f25873g = i14;
            this.f25874h = i15;
            this.i = nhVarArr;
        }

        private AudioTrack b(boolean z10, ih ihVar, int i) {
            int i10 = s82.f32899a;
            if (i10 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : ihVar.a().f28667a).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f25871e).setChannelMask(this.f25872f).setEncoding(this.f25873g).build()).setTransferMode(1).setBufferSizeInBytes(this.f25874h).setSessionId(i).setOffloadedPlayback(this.f25869c == 1).build();
            }
            if (i10 < 21) {
                int iC = s82.c(ihVar.f28663d);
                return i == 0 ? new AudioTrack(iC, this.f25871e, this.f25872f, this.f25873g, this.f25874h, 1) : new AudioTrack(iC, this.f25871e, this.f25872f, this.f25873g, this.f25874h, 1, i);
            }
            return new AudioTrack(z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : ihVar.a().f28667a, new AudioFormat.Builder().setSampleRate(this.f25871e).setChannelMask(this.f25872f).setEncoding(this.f25873g).build(), this.f25874h, 1, i);
        }

        public final AudioTrack a(boolean z10, ih ihVar, int i) throws ph.b {
            try {
                AudioTrack audioTrackB = b(z10, ihVar, i);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (Exception unused) {
                }
                throw new ph.b(state, this.f25871e, this.f25872f, this.f25874h, this.f25867a, this.f25869c == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e4) {
                throw new ph.b(0, this.f25871e, this.f25872f, this.f25874h, this.f25867a, this.f25869c == 1, e4);
            }
        }
    }

    public static class g implements c {

        /* renamed from: a, reason: collision with root package name */
        private final nh[] f25875a;

        /* renamed from: b, reason: collision with root package name */
        private final yx1 f25876b;

        /* renamed from: c, reason: collision with root package name */
        private final b12 f25877c;

        public g(nh[] nhVarArr, yx1 yx1Var, b12 b12Var) {
            nh[] nhVarArr2 = new nh[nhVarArr.length + 2];
            this.f25875a = nhVarArr2;
            System.arraycopy(nhVarArr, 0, nhVarArr2, 0, nhVarArr.length);
            this.f25876b = yx1Var;
            this.f25877c = b12Var;
            nhVarArr2[nhVarArr.length] = yx1Var;
            nhVarArr2[nhVarArr.length + 1] = b12Var;
        }

        public final nh[] a() {
            return this.f25875a;
        }
    }

    public static final class h extends RuntimeException {
    }

    public static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final vh1 f25878a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f25879b;

        /* renamed from: c, reason: collision with root package name */
        public final long f25880c;

        /* renamed from: d, reason: collision with root package name */
        public final long f25881d;

        public /* synthetic */ i(vh1 vh1Var, boolean z10, long j4, long j10, int i) {
            this(vh1Var, z10, j4, j10);
        }

        private i(vh1 vh1Var, boolean z10, long j4, long j10) {
            this.f25878a = vh1Var;
            this.f25879b = z10;
            this.f25880c = j4;
            this.f25881d = j10;
        }
    }

    public static final class j<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        private T f25882a;

        /* renamed from: b, reason: collision with root package name */
        private long f25883b;
    }

    public final class k implements sh.a {
        public /* synthetic */ k(cz czVar, int i) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.sh.a
        public final void a(long j4) {
            ph.c cVar = cz.this.f25849r;
            if (cVar != null) {
                ((vu0.a) cVar).a(j4);
            }
        }

        @Override // com.yandex.mobile.ads.impl.sh.a
        public final void b(long j4, long j10, long j11, long j12) {
            StringBuilder sbJ = androidx.work.s.j("Spurious audio timestamp (system clock mismatch): ", ", ", j4);
            sbJ.append(j10);
            sbJ.append(", ");
            sbJ.append(j11);
            sbJ.append(", ");
            sbJ.append(j12);
            sbJ.append(", ");
            cz czVar = cz.this;
            sbJ.append(czVar.f25851t.f25869c == 0 ? czVar.f25806B / r5.f25868b : czVar.f25807C);
            sbJ.append(", ");
            sbJ.append(cz.this.j());
            rs0.d("DefaultAudioSink", sbJ.toString());
        }

        private k() {
        }

        @Override // com.yandex.mobile.ads.impl.sh.a
        public final void a(long j4, long j10, long j11, long j12) {
            StringBuilder sbJ = androidx.work.s.j("Spurious audio timestamp (frame position mismatch): ", ", ", j4);
            sbJ.append(j10);
            sbJ.append(", ");
            sbJ.append(j11);
            sbJ.append(", ");
            sbJ.append(j12);
            sbJ.append(", ");
            cz czVar = cz.this;
            sbJ.append(czVar.f25851t.f25869c == 0 ? czVar.f25806B / r5.f25868b : czVar.f25807C);
            sbJ.append(", ");
            sbJ.append(cz.this.j());
            rs0.d("DefaultAudioSink", sbJ.toString());
        }

        @Override // com.yandex.mobile.ads.impl.sh.a
        public final void b(long j4) {
            rs0.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j4);
        }

        @Override // com.yandex.mobile.ads.impl.sh.a
        public final void a(int i, long j4) {
            if (cz.this.f25849r != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                cz czVar = cz.this;
                ((vu0.a) czVar.f25849r).a(i, j4, jElapsedRealtime - czVar.f25830Z);
            }
        }
    }

    public final class l {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f25885a = new Handler();

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f25886b = new a();

        public class a extends AudioTrack$StreamEventCallback {
            public a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i) {
                cz czVar = cz.this;
                if (audioTrack != czVar.f25852u) {
                    throw new IllegalStateException();
                }
                ph.c cVar = czVar.f25849r;
                if (cVar == null || !czVar.f25825U) {
                    return;
                }
                ((vu0.a) cVar).a();
            }

            public final void onTearDown(AudioTrack audioTrack) {
                cz czVar = cz.this;
                if (audioTrack != czVar.f25852u) {
                    throw new IllegalStateException();
                }
                ph.c cVar = czVar.f25849r;
                if (cVar == null || !czVar.f25825U) {
                    return;
                }
                ((vu0.a) cVar).a();
            }
        }

        public l() {
        }

        public final void a(AudioTrack audioTrack) {
            Handler handler = this.f25885a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new W(handler), this.f25886b);
        }

        public final void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f25886b);
            this.f25885a.removeCallbacksAndMessages(null);
        }
    }

    public /* synthetic */ cz(e eVar, int i10) {
        this(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        return this.f25851t.f25869c == 0 ? this.f25808D / r0.f25870d : this.f25809E;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean k() throws com.yandex.mobile.ads.impl.ph.b {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cz.k():boolean");
    }

    private boolean l() {
        return this.f25852u != null;
    }

    private void m() {
        this.f25806B = 0L;
        this.f25807C = 0L;
        this.f25808D = 0L;
        this.f25809E = 0L;
        int i10 = 0;
        this.f25834b0 = false;
        this.f25810F = 0;
        this.f25855x = new i(i().f25878a, i().f25879b, 0L, 0L, 0);
        this.f25813I = 0L;
        this.f25854w = null;
        this.f25841j.clear();
        this.f25817M = null;
        this.f25818N = 0;
        this.f25819O = null;
        this.f25824T = false;
        this.f25823S = false;
        this.f25822R = -1;
        this.f25857z = null;
        this.f25805A = 0;
        this.f25837e.j();
        while (true) {
            nh[] nhVarArr = this.f25815K;
            if (i10 >= nhVarArr.length) {
                return;
            }
            nh nhVar = nhVarArr[i10];
            nhVar.flush();
            this.f25816L[i10] = nhVar.c();
            i10++;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void flush() throws IllegalStateException {
        if (l()) {
            m();
            if (this.i.b()) {
                this.f25852u.pause();
            }
            if (a(this.f25852u)) {
                l lVar = this.f25844m;
                lVar.getClass();
                lVar.b(this.f25852u);
            }
            AudioTrack audioTrack = this.f25852u;
            this.f25852u = null;
            if (s82.f32899a < 21 && !this.f25826V) {
                this.f25827W = 0;
            }
            f fVar = this.f25850s;
            if (fVar != null) {
                this.f25851t = fVar;
                this.f25850s = null;
            }
            this.i.d();
            this.f25840h.c();
            new a(audioTrack).start();
        }
        ((j) this.f25846o).f25882a = null;
        ((j) this.f25845n).f25882a = null;
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final vh1 getPlaybackParameters() {
        return this.f25842k ? this.f25856y : i().f25878a;
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void pause() throws IllegalStateException {
        this.f25825U = false;
        if (l() && this.i.c()) {
            this.f25852u.pause();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void play() throws IllegalStateException {
        this.f25825U = true;
        if (l()) {
            this.i.e();
            this.f25852u.play();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void setVolume(float f10) {
        if (this.f25814J != f10) {
            this.f25814J = f10;
            if (l()) {
                if (s82.f32899a >= 21) {
                    this.f25852u.setVolume(this.f25814J);
                    return;
                }
                AudioTrack audioTrack = this.f25852u;
                float f11 = this.f25814J;
                audioTrack.setStereoVolume(f11, f11);
            }
        }
    }

    private cz(e eVar) {
        this.f25831a = eVar.f25861a;
        g gVar = eVar.f25862b;
        this.f25833b = gVar;
        int i10 = s82.f32899a;
        int i11 = 0;
        this.f25835c = i10 >= 21 && eVar.f25863c;
        this.f25842k = i10 >= 23 && eVar.f25864d;
        this.f25843l = i10 >= 29 ? eVar.f25865e : 0;
        this.f25847p = eVar.f25866f;
        cr crVar = new cr(0);
        this.f25840h = crVar;
        crVar.e();
        this.i = new sh(new k(this, i11));
        bo boVar = new bo();
        this.f25836d = boVar;
        u62 u62Var = new u62();
        this.f25837e = u62Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new nq1(), boVar, u62Var);
        Collections.addAll(arrayList, gVar.a());
        this.f25838f = (nh[]) arrayList.toArray(new nh[0]);
        this.f25839g = new nh[]{new wb0()};
        this.f25814J = 1.0f;
        this.f25853v = ih.f28660h;
        this.f25827W = 0;
        this.f25828X = new ci();
        vh1 vh1Var = vh1.f34541e;
        this.f25855x = new i(vh1Var, false, 0L, 0L, 0);
        this.f25856y = vh1Var;
        this.f25822R = -1;
        this.f25815K = new nh[0];
        this.f25816L = new ByteBuffer[0];
        this.f25841j = new ArrayDeque<>();
        this.f25845n = new j<>();
        this.f25846o = new j<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(long r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cz.a(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean h() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.f25822R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f25822R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f25822R
            com.yandex.mobile.ads.impl.nh[] r5 = r9.f25815K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.d()
        L1f:
            r9.b(r7)
            boolean r0 = r4.a()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.f25822R
            int r0 = r0 + r1
            r9.f25822R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f25819O
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.f25819O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.f25822R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cz.h():boolean");
    }

    private i i() {
        i iVar = this.f25854w;
        return iVar != null ? iVar : !this.f25841j.isEmpty() ? this.f25841j.getLast() : this.f25855x;
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final int b(dc0 dc0Var) {
        if (!"audio/raw".equals(dc0Var.f26083m)) {
            return ((this.f25832a0 || !a(dc0Var, this.f25853v)) && this.f25831a.a(dc0Var) == null) ? 0 : 2;
        }
        if (s82.e(dc0Var.f26067B)) {
            int i10 = dc0Var.f26067B;
            return (i10 == 2 || (this.f25835c && i10 == 4)) ? 2 : 1;
        }
        rs0.d("DefaultAudioSink", "Invalid PCM encoding: " + dc0Var.f26067B);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void c() throws IllegalStateException {
        if (s82.f32899a < 21) {
            throw new IllegalStateException();
        }
        if (!this.f25826V) {
            throw new IllegalStateException();
        }
        if (this.f25829Y) {
            return;
        }
        this.f25829Y = true;
        flush();
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void d() throws IllegalStateException, ph.e {
        if (!this.f25823S && l() && h()) {
            if (!this.f25824T) {
                this.f25824T = true;
                this.i.c(j());
                this.f25852u.stop();
                this.f25805A = 0;
            }
            this.f25823S = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final boolean e() {
        return l() && this.i.d(j());
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void f() throws IllegalStateException {
        if (this.f25829Y) {
            this.f25829Y = false;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void g() {
        this.f25811G = true;
    }

    private void b(long j4) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.f25815K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.f25816L[i10 - 1];
            } else {
                byteBuffer = this.f25817M;
                if (byteBuffer == null) {
                    byteBuffer = nh.f30865a;
                }
            }
            if (i10 == length) {
                a(byteBuffer, j4);
            } else {
                nh nhVar = this.f25815K[i10];
                if (i10 > this.f25822R) {
                    nhVar.a(byteBuffer);
                }
                ByteBuffer byteBufferC = nhVar.c();
                this.f25816L[i10] = byteBufferC;
                if (byteBufferC.hasRemaining()) {
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

    @Override // com.yandex.mobile.ads.impl.ph
    public final void b() throws IllegalStateException {
        flush();
        for (nh nhVar : this.f25838f) {
            nhVar.b();
        }
        for (nh nhVar2 : this.f25839g) {
            nhVar2.b();
        }
        this.f25825U = false;
        this.f25832a0 = false;
    }

    private void b(vh1 vh1Var) {
        if (l()) {
            try {
                this.f25852u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(vh1Var.f34542b).setPitch(vh1Var.f34543c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e4) {
                rs0.b("DefaultAudioSink", "Failed to set playback params", e4);
            }
            vh1Var = new vh1(this.f25852u.getPlaybackParams().getSpeed(), this.f25852u.getPlaybackParams().getPitch());
            this.i.a(vh1Var.f34542b);
        }
        this.f25856y = vh1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void b(boolean z10) {
        vh1 vh1Var = i().f25878a;
        i iVarI = i();
        if (vh1Var.equals(iVarI.f25878a) && z10 == iVarI.f25879b) {
            return;
        }
        i iVar = new i(vh1Var, z10, -9223372036854775807L, -9223372036854775807L, 0);
        if (l()) {
            this.f25854w = iVar;
        } else {
            this.f25855x = iVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.ph
    public final void a(dc0 dc0Var, int[] iArr) throws ph.a {
        int iB;
        int iIntValue;
        nh[] nhVarArr;
        int i10;
        int iIntValue2;
        int i11;
        int iB2;
        int i12;
        int iMax;
        boolean z10;
        nh[] nhVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(dc0Var.f26083m)) {
            if (s82.e(dc0Var.f26067B)) {
                iB2 = s82.b(dc0Var.f26067B, dc0Var.f26096z);
                int i13 = dc0Var.f26067B;
                if (this.f25835c && (i13 == 536870912 || i13 == 805306368 || i13 == 4)) {
                    nhVarArr2 = this.f25839g;
                } else {
                    nhVarArr2 = this.f25838f;
                }
                this.f25837e.a(dc0Var.f26068C, dc0Var.f26069D);
                if (s82.f32899a < 21 && dc0Var.f26096z == 8 && iArr == null) {
                    iArr2 = new int[6];
                    for (int i14 = 0; i14 < 6; i14++) {
                        iArr2[i14] = i14;
                    }
                } else {
                    iArr2 = iArr;
                }
                this.f25836d.a(iArr2);
                nh.a aVar = new nh.a(dc0Var.f26066A, dc0Var.f26096z, dc0Var.f26067B);
                for (nh nhVar : nhVarArr2) {
                    try {
                        nh.a aVarA = nhVar.a(aVar);
                        if (nhVar.isActive()) {
                            aVar = aVarA;
                        }
                    } catch (nh.b e4) {
                        throw new ph.a(e4, dc0Var);
                    }
                }
                iIntValue = aVar.f30869c;
                int i15 = aVar.f30867a;
                int iA = s82.a(aVar.f30868b);
                iB = s82.b(iIntValue, aVar.f30868b);
                nhVarArr = nhVarArr2;
                i10 = i15;
                iIntValue2 = iA;
                i11 = 0;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            nh[] nhVarArr3 = new nh[0];
            int i16 = dc0Var.f26066A;
            iB = -1;
            if (a(dc0Var, this.f25853v)) {
                String str = dc0Var.f26083m;
                str.getClass();
                iIntValue = k01.b(str, dc0Var.f26080j);
                nhVarArr = nhVarArr3;
                i10 = i16;
                iIntValue2 = s82.a(dc0Var.f26096z);
                i11 = 1;
            } else {
                Pair<Integer, Integer> pairA = this.f25831a.a(dc0Var);
                if (pairA != null) {
                    iIntValue = ((Integer) pairA.first).intValue();
                    nhVarArr = nhVarArr3;
                    i10 = i16;
                    iIntValue2 = ((Integer) pairA.second).intValue();
                    i11 = 2;
                } else {
                    throw new ph.a("Unable to configure passthrough for: " + dc0Var, dc0Var);
                }
            }
            iB2 = -1;
        }
        dz dzVar = this.f25847p;
        int minBufferSize = AudioTrack.getMinBufferSize(i10, iIntValue2, iIntValue);
        if (minBufferSize != -2) {
            double d10 = this.f25842k ? 8.0d : 1.0d;
            dzVar.getClass();
            if (i11 != 0) {
                int i17 = 80000;
                if (i11 == 1) {
                    switch (iIntValue) {
                        case 5:
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 6:
                        case 18:
                            i17 = 768000;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 7:
                            i17 = 192000;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 8:
                            i17 = 2250000;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 9:
                            i17 = 40000;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 10:
                            i17 = 100000;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 11:
                            i17 = 16000;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 12:
                            i17 = 7000;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 13:
                        default:
                            throw new IllegalArgumentException();
                        case 14:
                            i17 = 3062500;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 15:
                            i17 = 8000;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 16:
                            i17 = 256000;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                        case 17:
                            i17 = 336000;
                            i12 = iB2;
                            iMax = up0.a((50000000 * i17) / 1000000);
                            break;
                    }
                } else if (i11 == 2) {
                    int i18 = iIntValue == 5 ? 500000 : 250000;
                    switch (iIntValue) {
                        case 5:
                            z10 = true;
                            break;
                        case 6:
                        case 18:
                            z10 = true;
                            i17 = 768000;
                            break;
                        case 7:
                            z10 = true;
                            i17 = 192000;
                            break;
                        case 8:
                            z10 = true;
                            i17 = 2250000;
                            break;
                        case 9:
                            z10 = true;
                            i17 = 40000;
                            break;
                        case 10:
                            z10 = true;
                            i17 = 100000;
                            break;
                        case 11:
                            z10 = true;
                            i17 = 16000;
                            break;
                        case 12:
                            z10 = true;
                            i17 = 7000;
                            break;
                        case 13:
                        default:
                            throw new IllegalArgumentException();
                        case 14:
                            z10 = true;
                            i17 = 3062500;
                            break;
                        case 15:
                            z10 = true;
                            i17 = 8000;
                            break;
                        case 16:
                            z10 = true;
                            i17 = 256000;
                            break;
                        case 17:
                            z10 = true;
                            i17 = 336000;
                            break;
                    }
                    iMax = up0.a((i18 * i17) / 1000000);
                    i12 = iB2;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                i12 = iB2;
                long j4 = i10;
                long j10 = iB;
                int iA2 = up0.a(((250000 * j4) * j10) / 1000000);
                int iA3 = up0.a(((750000 * j4) * j10) / 1000000);
                int i19 = s82.f32899a;
                iMax = Math.max(iA2, Math.min(4 * minBufferSize, iA3));
            }
            int iMax2 = (((Math.max(minBufferSize, (int) (iMax * d10)) + iB) - 1) / iB) * iB;
            if (iIntValue == 0) {
                throw new ph.a("Invalid output encoding (mode=" + i11 + ") for: " + dc0Var, dc0Var);
            }
            if (iIntValue2 != 0) {
                this.f25832a0 = false;
                f fVar = new f(dc0Var, i12, i11, iB, i10, iIntValue2, iIntValue, iMax2, nhVarArr);
                if (l()) {
                    this.f25850s = fVar;
                    return;
                } else {
                    this.f25851t = fVar;
                    return;
                }
            }
            throw new ph.a("Invalid output channel config (mode=" + i11 + ") for: " + dc0Var, dc0Var);
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final long a(boolean z10) {
        long jA;
        if (!l() || this.f25812H) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.i.a(z10), (j() * 1000000) / this.f25851t.f25871e);
        while (!this.f25841j.isEmpty() && jMin >= this.f25841j.getFirst().f25881d) {
            this.f25855x = this.f25841j.remove();
        }
        i iVar = this.f25855x;
        long j4 = jMin - iVar.f25881d;
        if (iVar.f25878a.equals(vh1.f34541e)) {
            jA = this.f25855x.f25880c + j4;
        } else if (this.f25841j.isEmpty()) {
            jA = ((g) this.f25833b).f25877c.a(j4) + this.f25855x.f25880c;
        } else {
            i first = this.f25841j.getFirst();
            long jRound = first.f25881d - jMin;
            float f10 = this.f25855x.f25878a.f34542b;
            int i10 = s82.f32899a;
            if (f10 != 1.0f) {
                jRound = Math.round(jRound * f10);
            }
            jA = first.f25880c - jRound;
        }
        return ((((g) this.f25833b).f25876b.i() * 1000000) / this.f25851t.f25871e) + jA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0277, code lost:
    
        if (r6 == 0) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    @Override // com.yandex.mobile.ads.impl.ph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.nio.ByteBuffer r20, long r21, int r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cz.a(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final boolean a() {
        if (l()) {
            return this.f25823S && !e();
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void a(ih ihVar) throws IllegalStateException {
        if (this.f25853v.equals(ihVar)) {
            return;
        }
        this.f25853v = ihVar;
        if (this.f25829Y) {
            return;
        }
        flush();
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void a(int i10) throws IllegalStateException {
        if (this.f25827W != i10) {
            this.f25827W = i10;
            this.f25826V = i10 != 0;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void a(ci ciVar) {
        if (this.f25828X.equals(ciVar)) {
            return;
        }
        int i10 = ciVar.f25655a;
        float f10 = ciVar.f25656b;
        AudioTrack audioTrack = this.f25852u;
        if (audioTrack != null) {
            if (this.f25828X.f25655a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f25852u.setAuxEffectSendLevel(f10);
            }
        }
        this.f25828X = ciVar;
    }

    public final void a(ph.c cVar) {
        this.f25849r = cVar;
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void a(vh1 vh1Var) {
        float f10 = vh1Var.f34542b;
        int i10 = s82.f32899a;
        vh1 vh1Var2 = new vh1(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(vh1Var.f34543c, 8.0f)));
        if (this.f25842k && s82.f32899a >= 23) {
            b(vh1Var2);
            return;
        }
        boolean z10 = i().f25879b;
        i iVarI = i();
        if (vh1Var2.equals(iVarI.f25878a) && z10 == iVarI.f25879b) {
            return;
        }
        i iVar = new i(vh1Var2, z10, -9223372036854775807L, -9223372036854775807L, 0);
        if (l()) {
            this.f25854w = iVar;
        } else {
            this.f25855x = iVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final void a(gi1 gi1Var) {
        this.f25848q = gi1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ph
    public final boolean a(dc0 dc0Var) {
        return b(dc0Var) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.nio.ByteBuffer r12, long r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cz.a(java.nio.ByteBuffer, long):void");
    }

    private boolean a(dc0 dc0Var, ih ihVar) {
        int iA;
        int playbackOffloadSupport;
        int i10 = s82.f32899a;
        if (i10 >= 29 && this.f25843l != 0) {
            String str = dc0Var.f26083m;
            str.getClass();
            int iB = k01.b(str, dc0Var.f26080j);
            if (iB != 0 && (iA = s82.a(dc0Var.f26096z)) != 0) {
                AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(dc0Var.f26066A).setChannelMask(iA).setEncoding(iB).build();
                AudioAttributes audioAttributes = ihVar.a().f28667a;
                if (i10 >= 31) {
                    playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, audioAttributes);
                } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, audioAttributes)) {
                    playbackOffloadSupport = (i10 == 30 && s82.f32902d.startsWith("Pixel")) ? 2 : 1;
                } else {
                    playbackOffloadSupport = 0;
                }
                if (playbackOffloadSupport != 0) {
                    if (playbackOffloadSupport == 1) {
                        boolean z10 = (dc0Var.f26068C == 0 && dc0Var.f26069D == 0) ? false : true;
                        boolean z11 = this.f25843l == 1;
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

    private static boolean a(AudioTrack audioTrack) {
        return s82.f32899a >= 29 && audioTrack.isOffloadedPlayback();
    }
}
