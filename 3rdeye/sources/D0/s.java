package d0;

import C.E;
import C.S;
import C.T;
import I.m;
import W.X;
import Y.c;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.Q0;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import b0.C1811b;
import com.applovin.impl.K;
import com.yandex.mobile.ads.impl.A3;
import com.yandex.mobile.ads.impl.Y2;
import d0.k;
import d0.s;
import e0.C4300a;
import f0.d;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: EncoderImpl.java */
/* loaded from: classes.dex */
public final class s implements k {

    /* renamed from: E, reason: collision with root package name */
    public static final Range<Long> f37253E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: D, reason: collision with root package name */
    public ScheduledFuture f37257D;

    /* renamed from: a, reason: collision with root package name */
    public final String f37258a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37260c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaFormat f37261d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodec f37262e;

    /* renamed from: f, reason: collision with root package name */
    public final k.b f37263f;

    /* renamed from: g, reason: collision with root package name */
    public final v f37264g;

    /* renamed from: h, reason: collision with root package name */
    public final H.g f37265h;
    public final A4.a<Void> i;

    /* renamed from: j, reason: collision with root package name */
    public final b.a<Void> f37266j;

    /* renamed from: p, reason: collision with root package name */
    public final Q0 f37272p;

    /* renamed from: t, reason: collision with root package name */
    public b f37276t;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37259b = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f37267k = new ArrayDeque();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f37268l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f37269m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f37270n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f37271o = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    public final E.u f37273q = new E.u(22);

    /* renamed from: r, reason: collision with root package name */
    public l f37274r = l.f37241a;

    /* renamed from: s, reason: collision with root package name */
    public Executor f37275s = E.u.y();

    /* renamed from: u, reason: collision with root package name */
    public Range<Long> f37277u = f37253E;

    /* renamed from: v, reason: collision with root package name */
    public long f37278v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f37279w = false;

    /* renamed from: x, reason: collision with root package name */
    public Long f37280x = null;

    /* renamed from: y, reason: collision with root package name */
    public ScheduledFuture f37281y = null;

    /* renamed from: z, reason: collision with root package name */
    public c f37282z = null;

    /* renamed from: A, reason: collision with root package name */
    public boolean f37254A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f37255B = false;

    /* renamed from: C, reason: collision with root package name */
    public boolean f37256C = false;

    /* compiled from: EncoderImpl.java */
    public class a implements k.a {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f37283a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        public c.a f37284b = c.a.INACTIVE;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f37285c = new ArrayList();

        public a() {
        }

        @Override // androidx.camera.core.impl.InterfaceC1715t0
        public final void a(InterfaceC1715t0.a<? super c.a> aVar) {
            s.this.f37265h.execute(new E(17, this, aVar));
        }

        @Override // Y.c
        public final b.d c() {
            return o0.b.a(new B8.b(this, 9));
        }

        @Override // androidx.camera.core.impl.InterfaceC1715t0
        public final A4.a<c.a> d() {
            return o0.b.a(new B.d(this, 20));
        }

        @Override // androidx.camera.core.impl.InterfaceC1715t0
        public final void e(Executor executor, InterfaceC1715t0.a<? super c.a> aVar) {
            s.this.f37265h.execute(new N.d(this, aVar, executor, 10));
        }

        public final void f(boolean z10) {
            c.a aVar = z10 ? c.a.ACTIVE : c.a.INACTIVE;
            if (this.f37284b == aVar) {
                return;
            }
            this.f37284b = aVar;
            if (aVar == c.a.INACTIVE) {
                ArrayList arrayList = this.f37285c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((A4.a) it.next()).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.f37283a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new A3(3, entry, aVar));
                } catch (RejectedExecutionException e4) {
                    S.c(s.this.f37258a, "Unable to post to the supplied executor.", e4);
                }
            }
        }
    }

    /* compiled from: EncoderImpl.java */
    public enum b {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    /* compiled from: EncoderImpl.java */
    public class c extends MediaCodec.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final f0.d f37287a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f37288b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f37289c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f37290d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f37291e = false;

        /* renamed from: f, reason: collision with root package name */
        public long f37292f = 0;

        /* renamed from: g, reason: collision with root package name */
        public long f37293g = 0;

        /* renamed from: h, reason: collision with root package name */
        public boolean f37294h = false;
        public boolean i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f37295j = false;

        /* compiled from: EncoderImpl.java */
        public class a implements I.c<Void> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f37297b;

            public a(j jVar) {
                this.f37297b = jVar;
            }

            @Override // I.c
            public final void onFailure(Throwable th) {
                c cVar = c.this;
                s.this.f37270n.remove(this.f37297b);
                boolean z10 = th instanceof MediaCodec.CodecException;
                s sVar = s.this;
                if (!z10) {
                    sVar.b(0, th.getMessage(), th);
                    return;
                }
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                sVar.getClass();
                sVar.b(1, codecException.getMessage(), codecException);
            }

            @Override // I.c
            public final void onSuccess(Void r22) {
                s.this.f37270n.remove(this.f37297b);
            }
        }

        public c() {
            this.f37288b = true;
            if (s.this.f37260c) {
                this.f37287a = new f0.d(s.this.f37273q, s.this.f37272p, (CameraUseInconsistentTimebaseQuirk) C1811b.f17055a.e(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.f37287a = null;
            }
            if (((CodecStuckOnFlushQuirk) C1811b.f17055a.e(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(s.this.f37261d.getString("mime"))) {
                return;
            }
            this.f37288b = false;
        }

        public final boolean a(MediaCodec.BufferInfo bufferInfo) {
            boolean z10;
            boolean z11;
            boolean z12;
            Executor executor;
            l lVar;
            int i;
            int i10;
            f0.d dVar;
            String str;
            boolean z13 = true;
            boolean z14 = false;
            if (this.f37291e) {
                S.a(s.this.f37258a, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                S.a(s.this.f37258a, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                S.a(s.this.f37258a, "Drop buffer by codec config.");
                return false;
            }
            f0.d dVar2 = this.f37287a;
            if (dVar2 != null) {
                long j4 = bufferInfo.presentationTimeUs;
                Q0 q02 = dVar2.f37808e;
                E.u uVar = dVar2.f37804a;
                if (q02 == null) {
                    CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = dVar2.f37806c;
                    Q0 q03 = dVar2.f37805b;
                    if (cameraUseInconsistentTimebaseQuirk != null) {
                        S.g("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
                        z11 = false;
                    } else {
                        uVar.getClass();
                        z11 = false;
                        if (TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) - E.u.S() > 3000000) {
                            z14 = true;
                        } else {
                            i = 2;
                            i10 = 3;
                            dVar2.f37808e = q03;
                        }
                    }
                    uVar.getClass();
                    i = 2;
                    i10 = 3;
                    Q0 q04 = Math.abs(j4 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) < Math.abs(j4 - E.u.S()) ? Q0.REALTIME : Q0.UPTIME;
                    if (!z14 || q04 == q03) {
                        S.a("VideoTimebaseConverter", "Detect input timebase = " + q04);
                    } else {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31) {
                            str = ", SOC: " + Build.SOC_MODEL;
                        } else {
                            str = "";
                        }
                        Integer numValueOf = Integer.valueOf(i11);
                        Q0 q05 = dVar2.f37805b;
                        Object[] objArr = new Object[7];
                        objArr[z11 ? 1 : 0] = Build.MANUFACTURER;
                        objArr[1] = Build.MODEL;
                        objArr[2] = Build.HARDWARE;
                        objArr[3] = numValueOf;
                        objArr[4] = str;
                        objArr[5] = q05;
                        objArr[6] = q04;
                        S.b("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", objArr));
                    }
                    q03 = q04;
                    dVar2.f37808e = q03;
                } else {
                    i = 2;
                    z11 = false;
                    i10 = 3;
                }
                int i12 = d.a.f37809a[dVar2.f37808e.ordinal()];
                if (i12 == 1) {
                    if (dVar2.f37807d == -1) {
                        long j10 = Long.MAX_VALUE;
                        int i13 = z11 ? 1 : 0;
                        long j11 = 0;
                        while (i13 < i10) {
                            uVar.getClass();
                            long jS = E.u.S();
                            boolean z15 = z13;
                            f0.d dVar3 = dVar2;
                            long micros = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
                            long jS2 = E.u.S();
                            long j12 = jS2 - jS;
                            if (i13 == 0 || j12 < j10) {
                                j11 = micros - ((jS + jS2) >> (z15 ? 1L : 0L));
                                j10 = j12;
                            }
                            i13 += z15 ? 1 : 0;
                            z13 = z15 ? 1 : 0;
                            dVar2 = dVar3;
                        }
                        z10 = z13;
                        dVar = dVar2;
                        dVar.f37807d = Math.max(0L, j11);
                        S.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + dVar.f37807d);
                    } else {
                        z10 = true;
                        dVar = dVar2;
                    }
                    j4 -= dVar.f37807d;
                } else {
                    if (i12 != i) {
                        throw new AssertionError("Unknown timebase: " + dVar2.f37808e);
                    }
                    z10 = true;
                }
                bufferInfo.presentationTimeUs = j4;
            } else {
                z10 = true;
                z11 = false;
            }
            long j13 = bufferInfo.presentationTimeUs;
            if (j13 <= this.f37292f) {
                S.a(s.this.f37258a, "Drop buffer by out of order buffer from MediaCodec.");
                return z11;
            }
            this.f37292f = j13;
            if (s.this.f37277u.contains((Range<Long>) Long.valueOf(j13))) {
                s sVar = s.this;
                long j14 = bufferInfo.presentationTimeUs;
                while (true) {
                    ArrayDeque arrayDeque = sVar.f37271o;
                    if (!arrayDeque.isEmpty()) {
                        Range range = (Range) arrayDeque.getFirst();
                        if (j14 <= ((Long) range.getUpper()).longValue()) {
                            break;
                        }
                        arrayDeque.removeFirst();
                        long jLongValue = (((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue()) + sVar.f37278v;
                        sVar.f37278v = jLongValue;
                        S.a(sVar.f37258a, "Total paused duration = ".concat(Y.d.a(jLongValue)));
                    } else {
                        break;
                    }
                }
                s sVar2 = s.this;
                long j15 = bufferInfo.presentationTimeUs;
                Iterator it = sVar2.f37271o.iterator();
                while (it.hasNext()) {
                    Range range2 = (Range) it.next();
                    if (range2.contains((Range) Long.valueOf(j15))) {
                        z12 = true;
                        break;
                    }
                    if (j15 < ((Long) range2.getLower()).longValue()) {
                        break;
                    }
                }
                z12 = false;
                boolean z16 = this.f37294h;
                if (!z16 && z12) {
                    S.a(s.this.f37258a, "Switch to pause state");
                    this.f37294h = true;
                    synchronized (s.this.f37259b) {
                        s sVar3 = s.this;
                        executor = sVar3.f37275s;
                        lVar = sVar3.f37274r;
                    }
                    Objects.requireNonNull(lVar);
                    executor.execute(new u(lVar, 0));
                    s sVar4 = s.this;
                    if (sVar4.f37276t == b.PAUSED && ((sVar4.f37260c || C1811b.f17055a.e(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!s.this.f37260c || C1811b.f17055a.e(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                        k.b bVar = s.this.f37263f;
                        if (bVar instanceof a) {
                            ((a) bVar).f(false);
                        }
                        s sVar5 = s.this;
                        sVar5.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putInt("drop-input-frames", 1);
                        sVar5.f37262e.setParameters(bundle);
                    }
                    s.this.f37280x = Long.valueOf(bufferInfo.presentationTimeUs);
                    s sVar6 = s.this;
                    if (sVar6.f37279w) {
                        ScheduledFuture scheduledFuture = sVar6.f37281y;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(true);
                        }
                        s.this.l();
                        s.this.f37279w = false;
                    }
                } else if (z16 && !z12) {
                    S.a(s.this.f37258a, "Switch to resume state");
                    this.f37294h = false;
                    if (s.this.f37260c && (bufferInfo.flags & 1) == 0) {
                        this.i = true;
                    }
                }
                if (this.f37294h) {
                    S.a(s.this.f37258a, "Drop buffer by pause.");
                    return false;
                }
                s sVar7 = s.this;
                long j16 = sVar7.f37278v;
                if ((j16 > 0 ? bufferInfo.presentationTimeUs - j16 : bufferInfo.presentationTimeUs) > this.f37293g) {
                    if (!this.f37290d && !this.i && sVar7.f37260c) {
                        this.i = true;
                    }
                    if (!this.i) {
                        return true;
                    }
                    if ((bufferInfo.flags & 1) != 0) {
                        this.i = false;
                        return true;
                    }
                    S.a(sVar7.f37258a, "Drop buffer by not a key frame.");
                    s.this.h();
                    return false;
                }
                S.a(sVar7.f37258a, "Drop buffer by adjusted time is less than the last sent time.");
                if (s.this.f37260c && (bufferInfo.flags & 1) != 0) {
                    this.i = true;
                    return false;
                }
            } else {
                S.a(s.this.f37258a, "Drop buffer by not in start-stop range.");
                s sVar8 = s.this;
                if (sVar8.f37279w && bufferInfo.presentationTimeUs >= ((Long) sVar8.f37277u.getUpper()).longValue()) {
                    ScheduledFuture scheduledFuture2 = s.this.f37281y;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(z10);
                    }
                    s.this.f37280x = Long.valueOf(bufferInfo.presentationTimeUs);
                    s.this.l();
                    boolean z17 = z11;
                    s.this.f37279w = z17;
                    return z17;
                }
            }
            return false;
        }

        public final void b() {
            s sVar;
            l lVar;
            Executor executor;
            if (this.f37291e) {
                return;
            }
            this.f37291e = true;
            ScheduledFuture scheduledFuture = s.this.f37257D;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                s.this.f37257D = null;
            }
            synchronized (s.this.f37259b) {
                sVar = s.this;
                lVar = sVar.f37274r;
                executor = sVar.f37275s;
            }
            sVar.o(new J4.h(this, executor, lVar, 18));
        }

        public final void c(j jVar, l lVar, Executor executor) {
            s sVar = s.this;
            sVar.f37270n.add(jVar);
            I.j.a(I.j.f(jVar.f37238f), new a(jVar), sVar.f37265h);
            try {
                executor.execute(new B.a(21, lVar, jVar));
            } catch (RejectedExecutionException e4) {
                S.c(sVar.f37258a, "Unable to post to the supplied executor.", e4);
                jVar.close();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            s.this.f37265h.execute(new B.a(20, this, codecException));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            s.this.f37265h.execute(new K(i, 3, this));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
            s.this.f37265h.execute(new Runnable() { // from class: d0.t
                @Override // java.lang.Runnable
                public final void run() {
                    l lVar;
                    Executor executor;
                    MediaCodec.BufferInfo bufferInfo2;
                    s.c cVar = this.f37305b;
                    MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                    MediaCodec mediaCodec2 = mediaCodec;
                    int i10 = i;
                    if (cVar.f37295j) {
                        S.g(s.this.f37258a, "Receives frame after codec is reset.");
                        return;
                    }
                    switch (s.this.f37276t) {
                        case CONFIGURED:
                        case ERROR:
                        case RELEASED:
                            return;
                        case STARTED:
                        case PAUSED:
                        case STOPPING:
                        case PENDING_START:
                        case PENDING_START_PAUSED:
                        case PENDING_RELEASE:
                            synchronized (s.this.f37259b) {
                                s sVar = s.this;
                                lVar = sVar.f37274r;
                                executor = sVar.f37275s;
                            }
                            if (!cVar.f37289c) {
                                cVar.f37289c = true;
                                try {
                                    Objects.requireNonNull(lVar);
                                    executor.execute(new u(lVar, 0));
                                } catch (RejectedExecutionException e4) {
                                    S.c(s.this.f37258a, "Unable to post to the supplied executor.", e4);
                                }
                            }
                            if (cVar.a(bufferInfo3)) {
                                if (!cVar.f37290d) {
                                    cVar.f37290d = true;
                                    S.a(s.this.f37258a, "data timestampUs = " + bufferInfo3.presentationTimeUs + ", data timebase = " + s.this.f37272p + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                                }
                                long j4 = s.this.f37278v;
                                long j10 = j4 > 0 ? bufferInfo3.presentationTimeUs - j4 : bufferInfo3.presentationTimeUs;
                                if (bufferInfo3.presentationTimeUs == j10) {
                                    bufferInfo2 = bufferInfo3;
                                } else {
                                    A2.l.q(null, j10 > cVar.f37293g);
                                    bufferInfo2 = new MediaCodec.BufferInfo();
                                    bufferInfo2.set(bufferInfo3.offset, bufferInfo3.size, j10, bufferInfo3.flags);
                                }
                                cVar.f37293g = bufferInfo2.presentationTimeUs;
                                try {
                                    cVar.c(new j(mediaCodec2, i10, bufferInfo2), lVar, executor);
                                } catch (MediaCodec.CodecException e10) {
                                    s sVar2 = s.this;
                                    sVar2.getClass();
                                    sVar2.b(1, e10.getMessage(), e10);
                                    return;
                                }
                            } else {
                                try {
                                    s.this.f37262e.releaseOutputBuffer(i10, false);
                                } catch (MediaCodec.CodecException e11) {
                                    s sVar3 = s.this;
                                    sVar3.getClass();
                                    sVar3.b(1, e11.getMessage(), e11);
                                    return;
                                }
                            }
                            if (cVar.f37291e) {
                                return;
                            }
                            if ((bufferInfo3.flags & 4) == 0) {
                                if (!cVar.f37288b) {
                                    return;
                                }
                                s sVar4 = s.this;
                                if (!sVar4.f37256C || bufferInfo3.presentationTimeUs <= ((Long) sVar4.f37277u.getUpper()).longValue()) {
                                    return;
                                }
                            }
                            cVar.b();
                            return;
                        default:
                            throw new IllegalStateException("Unknown state: " + s.this.f37276t);
                    }
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            s.this.f37265h.execute(new r(1, this, mediaFormat));
        }
    }

    /* compiled from: EncoderImpl.java */
    public class d implements k.c {

        /* renamed from: b, reason: collision with root package name */
        public Surface f37300b;

        /* renamed from: d, reason: collision with root package name */
        public X f37302d;

        /* renamed from: e, reason: collision with root package name */
        public H.g f37303e;

        /* renamed from: a, reason: collision with root package name */
        public final Object f37299a = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f37301c = new HashSet();

        public d() {
        }

        @Override // d0.k.c
        public final void b(H.g gVar, X x10) {
            Surface surface;
            synchronized (this.f37299a) {
                this.f37302d = x10;
                gVar.getClass();
                this.f37303e = gVar;
                surface = this.f37300b;
            }
            if (surface != null) {
                try {
                    gVar.execute(new E(19, x10, surface));
                } catch (RejectedExecutionException e4) {
                    S.c(s.this.f37258a, "Unable to post to the supplied executor.", e4);
                }
            }
        }
    }

    public s(Executor executor, m mVar) throws y, IOException {
        executor.getClass();
        mVar.getClass();
        LruCache<String, MediaCodecInfo> lruCache = C4300a.f37630a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(mVar.c());
            this.f37262e = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.f37265h = new H.g(executor);
            MediaFormat mediaFormatA = mVar.a();
            this.f37261d = mediaFormatA;
            Q0 q0B = mVar.b();
            this.f37272p = q0B;
            if (mVar instanceof AbstractC4257a) {
                this.f37258a = "AudioEncoder";
                this.f37260c = false;
                this.f37263f = new a();
                C4258b c4258b = new C4258b(codecInfo, mVar.c());
                Objects.requireNonNull(c4258b.f37311a.getAudioCapabilities());
                this.f37264g = c4258b;
            } else {
                if (!(mVar instanceof AbstractC4254A)) {
                    throw new y("Unknown encoder config type");
                }
                this.f37258a = "VideoEncoder";
                this.f37260c = true;
                this.f37263f = new d();
                D d10 = new D(codecInfo, mVar.c());
                if (mediaFormatA.containsKey("bitrate")) {
                    int integer = mediaFormatA.getInteger("bitrate");
                    int iIntValue = ((Integer) d10.f37197b.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatA.setInteger("bitrate", iIntValue);
                        S.a("VideoEncoder", "updated bitrate from " + integer + " to " + iIntValue);
                    }
                }
                this.f37264g = d10;
            }
            S.a(this.f37258a, "mInputTimebase = " + q0B);
            S.a(this.f37258a, "mMediaFormat = " + mediaFormatA);
            try {
                i();
                AtomicReference atomicReference = new AtomicReference();
                this.i = I.j.f(o0.b.a(new o(atomicReference, 0)));
                b.a<Void> aVar = (b.a) atomicReference.get();
                aVar.getClass();
                this.f37266j = aVar;
                k(b.CONFIGURED);
            } catch (MediaCodec.CodecException e4) {
                throw new y(e4);
            }
        } catch (IOException | IllegalArgumentException e10) {
            throw new y(e10);
        }
    }

    public final A4.a<w> a() {
        switch (this.f37276t) {
            case CONFIGURED:
                return new m.a(new IllegalStateException("Encoder is not started yet."));
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                AtomicReference atomicReference = new AtomicReference();
                b.d dVarA = o0.b.a(new B.f(atomicReference, 13));
                b.a aVar = (b.a) atomicReference.get();
                aVar.getClass();
                this.f37268l.offer(aVar);
                aVar.a(new T(28, this, aVar), this.f37265h);
                c();
                return dVarA;
            case ERROR:
                return new m.a(new IllegalStateException("Encoder is in error state."));
            case RELEASED:
                return new m.a(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f37276t);
        }
    }

    public final void b(int i, String str, Throwable th) {
        switch (this.f37276t) {
            case CONFIGURED:
                d(i, str, th);
                i();
                break;
            case STARTED:
            case PAUSED:
            case STOPPING:
            case PENDING_START:
            case PENDING_START_PAUSED:
            case PENDING_RELEASE:
                k(b.ERROR);
                o(new com.applovin.impl.B(this, i, str, th));
                break;
            case ERROR:
                S.h(this.f37258a, "Get more than one error: " + str + "(" + i + ")", th);
                break;
        }
    }

    public final void c() {
        while (true) {
            ArrayDeque arrayDeque = this.f37268l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.f37267k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            b.a aVar = (b.a) arrayDeque.poll();
            Objects.requireNonNull(aVar);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                x xVar = new x(this.f37262e, num.intValue());
                if (aVar.b(xVar)) {
                    this.f37269m.add(xVar);
                    I.j.f(xVar.f37315d).addListener(new T(29, this, xVar), this.f37265h);
                } else {
                    xVar.cancel();
                }
            } catch (MediaCodec.CodecException e4) {
                b(1, e4.getMessage(), e4);
                return;
            }
        }
    }

    public final void d(int i, String str, Throwable th) {
        l lVar;
        Executor executor;
        synchronized (this.f37259b) {
            lVar = this.f37274r;
            executor = this.f37275s;
        }
        try {
            executor.execute(new J4.f(lVar, i, str, th));
        } catch (RejectedExecutionException e4) {
            S.c(this.f37258a, "Unable to post to the supplied executor.", e4);
        }
    }

    public final void e() {
        this.f37273q.getClass();
        this.f37265h.execute(new Y2(this, E.u.S(), 1));
    }

    public final void f() {
        this.f37265h.execute(new n(this, 1));
    }

    public final void g() {
        Surface surface;
        HashSet hashSet;
        if (this.f37254A) {
            this.f37262e.stop();
            this.f37254A = false;
        }
        this.f37262e.release();
        k.b bVar = this.f37263f;
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            synchronized (dVar.f37299a) {
                surface = dVar.f37300b;
                dVar.f37300b = null;
                hashSet = new HashSet(dVar.f37301c);
                dVar.f37301c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        k(b.RELEASED);
        this.f37266j.b(null);
    }

    public final void h() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f37262e.setParameters(bundle);
    }

    public final void i() {
        X x10;
        H.g gVar;
        this.f37277u = f37253E;
        this.f37278v = 0L;
        this.f37271o.clear();
        this.f37267k.clear();
        Iterator it = this.f37268l.iterator();
        while (it.hasNext()) {
            ((b.a) it.next()).c();
        }
        this.f37268l.clear();
        this.f37262e.reset();
        this.f37254A = false;
        this.f37255B = false;
        this.f37256C = false;
        this.f37279w = false;
        ScheduledFuture scheduledFuture = this.f37281y;
        Surface surfaceCreateInputSurface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f37281y = null;
        }
        ScheduledFuture scheduledFuture2 = this.f37257D;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.f37257D = null;
        }
        c cVar = this.f37282z;
        if (cVar != null) {
            cVar.f37295j = true;
        }
        c cVar2 = new c();
        this.f37282z = cVar2;
        this.f37262e.setCallback(cVar2);
        this.f37262e.configure(this.f37261d, (Surface) null, (MediaCrypto) null, 1);
        k.b bVar = this.f37263f;
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            dVar.getClass();
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) C1811b.f17055a.e(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (dVar.f37299a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (dVar.f37300b == null) {
                            surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                            dVar.f37300b = surfaceCreateInputSurface;
                        }
                        s.this.f37262e.setInputSurface(dVar.f37300b);
                    } else {
                        Surface surface = dVar.f37300b;
                        if (surface != null) {
                            dVar.f37301c.add(surface);
                        }
                        surfaceCreateInputSurface = s.this.f37262e.createInputSurface();
                        dVar.f37300b = surfaceCreateInputSurface;
                    }
                    x10 = dVar.f37302d;
                    gVar = dVar.f37303e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || x10 == null || gVar == null) {
                return;
            }
            try {
                gVar.execute(new E(19, x10, surfaceCreateInputSurface));
            } catch (RejectedExecutionException e4) {
                S.c(s.this.f37258a, "Unable to post to the supplied executor.", e4);
            }
        }
    }

    public final void j(l lVar, H.g gVar) {
        synchronized (this.f37259b) {
            this.f37274r = lVar;
            this.f37275s = gVar;
        }
    }

    public final void k(b bVar) {
        if (this.f37276t == bVar) {
            return;
        }
        S.a(this.f37258a, "Transitioning encoder internal state: " + this.f37276t + " --> " + bVar);
        this.f37276t = bVar;
    }

    public final void l() {
        S.a(this.f37258a, "signalCodecStop");
        k.b bVar = this.f37263f;
        if (bVar instanceof a) {
            ((a) bVar).f(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f37269m.iterator();
            while (it.hasNext()) {
                arrayList.add(((w) it.next()).b());
            }
            I.q qVarI = I.j.i(arrayList);
            qVarI.f2378f.addListener(new n(this, 0), this.f37265h);
            return;
        }
        if (bVar instanceof d) {
            try {
                if (C1811b.f17055a.e(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    c cVar = this.f37282z;
                    H.g gVar = this.f37265h;
                    ScheduledFuture scheduledFuture = this.f37257D;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f37257D = E.u.H().schedule(new A3(2, gVar, cVar), 1000L, TimeUnit.MILLISECONDS);
                }
                this.f37262e.signalEndOfInputStream();
                this.f37256C = true;
            } catch (MediaCodec.CodecException e4) {
                b(1, e4.getMessage(), e4);
            }
        }
    }

    public final void m() {
        this.f37273q.getClass();
        this.f37265h.execute(new com.vungle.ads.internal.presenter.f(this, E.u.S(), 1));
    }

    public final void n(final long j4) {
        this.f37273q.getClass();
        final long jS = E.u.S();
        this.f37265h.execute(new Runnable() { // from class: d0.p
            @Override // java.lang.Runnable
            public final void run() {
                s sVar = this.f37246b;
                switch (sVar.f37276t) {
                    case CONFIGURED:
                    case STOPPING:
                    case ERROR:
                        return;
                    case STARTED:
                    case PAUSED:
                        s.b bVar = sVar.f37276t;
                        sVar.k(s.b.STOPPING);
                        Long l5 = (Long) sVar.f37277u.getLower();
                        long jLongValue = l5.longValue();
                        if (jLongValue == Long.MAX_VALUE) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        long j10 = j4;
                        String str = sVar.f37258a;
                        if (j10 == -1) {
                            j10 = jS;
                        } else if (j10 < jLongValue) {
                            S.g(str, "The expected stop time is less than the start time. Use current time as stop time.");
                            j10 = jS;
                        }
                        if (j10 < jLongValue) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        sVar.f37277u = Range.create(l5, Long.valueOf(j10));
                        S.a(str, "Stop on ".concat(Y.d.a(j10)));
                        if (bVar == s.b.PAUSED && sVar.f37280x != null) {
                            sVar.l();
                            return;
                        } else {
                            sVar.f37279w = true;
                            sVar.f37281y = E.u.H().schedule(new com.vungle.ads.internal.util.a(sVar, 1), 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case PENDING_START:
                    case PENDING_START_PAUSED:
                        sVar.k(s.b.CONFIGURED);
                        return;
                    case PENDING_RELEASE:
                    case RELEASED:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + sVar.f37276t);
                }
            }
        });
    }

    public final void o(Runnable runnable) {
        String str = this.f37258a;
        S.a(str, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.f37270n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(I.j.f(((j) it.next()).f37238f));
        }
        HashSet hashSet2 = this.f37269m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((w) it2.next()).b());
        }
        if (!arrayList.isEmpty()) {
            S.a(str, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        I.j.i(arrayList).f2378f.addListener(new J4.h(this, arrayList, runnable), this.f37265h);
    }
}
