package oh;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import androidx.media3.common.a1;
import androidx.media3.common.z0;
import bc.e0;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;
import com.staircase3.opensignal.goldstar.videotest.test.VideoTestActivity;
import h7.r1;
import h9.r2;
import i.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import mi.d0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class t {
    public transient p A0;
    public transient o2.g B0;
    public Boolean D;
    public transient Messenger D0;
    public Object E0;
    public d0 M;
    public boolean Q;
    public boolean R;
    public dh.f S;

    /* renamed from: a, reason: collision with root package name */
    public i4.b f19487a;

    /* renamed from: d, reason: collision with root package name */
    public su.l f19491d;

    /* renamed from: e0, reason: collision with root package name */
    public int[] f19493e0;

    /* renamed from: f0, reason: collision with root package name */
    public ak.a f19494f0;

    /* renamed from: g0, reason: collision with root package name */
    public Thread f19496g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f19497h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f19498i0;

    /* renamed from: j0, reason: collision with root package name */
    public long f19499j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f19500k0;

    /* renamed from: l0, reason: collision with root package name */
    public s f19501l0;

    /* renamed from: m0, reason: collision with root package name */
    public s f19502m0;

    /* renamed from: n0, reason: collision with root package name */
    public s f19503n0;

    /* renamed from: o0, reason: collision with root package name */
    public HandlerThread f19504o0;

    /* renamed from: q0, reason: collision with root package name */
    public final q3.a f19506q0;

    /* renamed from: r0, reason: collision with root package name */
    public final r2 f19508r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Context f19509s0;

    /* renamed from: u0, reason: collision with root package name */
    public final df.c f19511u0;

    /* renamed from: v0, reason: collision with root package name */
    public final ch.f f19512v0;

    /* renamed from: w0, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f19513w0;

    /* renamed from: x0, reason: collision with root package name */
    public final io.sentry.t f19515x0;

    /* renamed from: y0, reason: collision with root package name */
    public final ThreadFactory f19517y0;

    /* renamed from: z0, reason: collision with root package name */
    public transient g0 f19518z0;

    /* renamed from: g, reason: collision with root package name */
    public long f19495g = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f19507r = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f19514x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f19516y = 0;
    public long B = 0;
    public long E = 0;
    public long F = -1;
    public String I = "";
    public String J = "";
    public kk.b K = kk.b.UNKNOWN;
    public final AtomicBoolean L = new AtomicBoolean(false);
    public long N = 0;
    public long O = -1;
    public final AtomicBoolean P = new AtomicBoolean(false);
    public int T = -1;
    public long U = -1;
    public String V = "";
    public int W = -1;
    public int X = -1;
    public String Y = "";
    public int Z = -1;

    /* renamed from: a0, reason: collision with root package name */
    public int f19488a0 = -1;

    /* renamed from: b0, reason: collision with root package name */
    public int f19489b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public long f19490c0 = -1;

    /* renamed from: d0, reason: collision with root package name */
    public String f19492d0 = "";

    /* renamed from: p0, reason: collision with root package name */
    public long f19505p0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public d0 f19510t0 = null;
    public boolean C0 = true;
    public final AtomicBoolean F0 = new AtomicBoolean(false);
    public final q G0 = new q(this, 1);
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();

    public t(Context context, q3.a aVar, r2 r2Var, df.c cVar, ch.f fVar, io.sentry.internal.debugmeta.c cVar2, ThreadFactory threadFactory, io.sentry.t tVar) {
        this.f19509s0 = context;
        this.f19506q0 = aVar;
        this.f19508r0 = r2Var;
        this.f19511u0 = cVar;
        this.f19512v0 = fVar;
        this.f19513w0 = cVar2;
        this.f19515x0 = tVar;
        this.f19517y0 = threadFactory;
        M();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void D(oh.p r13, nh.i r14) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oh.t.D(oh.p, nh.i):void");
    }

    public static ArrayList b(b bVar) {
        boolean z10;
        u pVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Long.valueOf(bVar.f19453e), "CURRENT_PLAYBACK_POSITION_MS"));
        arrayList.add(new fh.d(Long.valueOf(bVar.f19452d), "EVENT_PLAYBACK_POSITION_MS"));
        arrayList.add(new fh.d(Long.valueOf(bVar.f19449a), "REALTIME_MS"));
        arrayList.add(new fh.d(Long.valueOf(bVar.f19454f), "TOTAL_BUFFERED_DURATION_MS"));
        int i10 = bVar.f19451c;
        ab.g gVar = bVar.f19450b;
        if (i10 >= 0) {
            switch (gVar.f307a) {
                case 12:
                    z10 = gVar.f308d;
                    break;
                default:
                    z10 = gVar.f308d;
                    break;
            }
            if (!z10) {
                switch (gVar.f307a) {
                    case 12:
                        v1 v1VarM = ((w1) gVar.f309g).m(i10, new v1(), 0L);
                        br.l.d(v1VarM, "getWindow(...)");
                        pVar = new p(6, v1VarM);
                        break;
                    default:
                        z0 z0VarM = ((a1) gVar.f309g).m(i10, new z0(), 0L);
                        br.l.d(z0VarM, "getWindow(...)");
                        pVar = new o2.g(11, z0VarM);
                        break;
                }
                if (pVar.M()) {
                    long jG = pVar.G();
                    if (jG != -9223372036854775807L) {
                        long j = jG + bVar.f19453e;
                        arrayList.add(new fh.d(Long.valueOf(pVar.r() - j), "LIVE_OFFSET_MS"));
                        arrayList.add(new fh.d(Long.valueOf(j), "CURRENT_PLAYBACK_TIME_MS"));
                        arrayList.add(new fh.d(Long.valueOf(pVar.P()), "DEFAULT_POSITION_MS"));
                        arrayList.add(new fh.d(Long.valueOf(pVar.a()), "WINDOW_DURATION_MS"));
                    }
                }
            }
        }
        return arrayList;
    }

    public static ArrayList c(l lVar) {
        ArrayList arrayList = new ArrayList();
        if (lVar != null) {
            arrayList.add(new fh.d(lVar.t(), "BITRATE"));
            arrayList.add(new fh.d(lVar.e(), "CODECS"));
            arrayList.add(new fh.d(lVar.f(), "CONTAINER_MIME_TYPE"));
            arrayList.add(new fh.d(lVar.n(), "FRAME_RATE"));
            arrayList.add(new fh.d(lVar.c(), "HEIGHT"));
            arrayList.add(new fh.d(lVar.i(), "WIDTH"));
            arrayList.add(new fh.d(lVar.g(), "PIXEL_WIDTH_HEIGHT_RATIO"));
            arrayList.add(new fh.d(lVar.u(), "SAMPLE_MIME_TYPE"));
            arrayList.add(new fh.d(lVar.l(), "SAMPLE_RATE"));
            k kVarK = lVar.k();
            if (kVarK != null) {
                arrayList.add(new fh.d(Integer.valueOf(kVarK.f19476a), "PROFILE"));
                arrayList.add(new fh.d(Integer.valueOf(kVarK.f19477b), "LEVEL"));
            }
        }
        return arrayList;
    }

    public static ArrayList d(d dVar) {
        ArrayList arrayList = new ArrayList(c(dVar.v()));
        arrayList.add(new fh.d(Integer.valueOf(dVar.x()), "TRACK_TYPE"));
        arrayList.add(new fh.d(Long.valueOf(dVar.w()), "MEDIA_START_TIME_MS"));
        arrayList.add(new fh.d(Long.valueOf(dVar.b()), "MEDIA_END_TIME_MS"));
        arrayList.add(new fh.d(Integer.valueOf(dVar.r()), "DATA_TYPE"));
        return arrayList;
    }

    public static void f(CountDownTimer... countDownTimerArr) {
        for (CountDownTimer countDownTimer : countDownTimerArr) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
    }

    public static ArrayList j(b bVar, c cVar, d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(d(dVar));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new fh.d(Long.valueOf(cVar.w()), "LOAD_INFO_BYTES_LOADED"));
        arrayList2.add(new fh.d(Long.valueOf(cVar.N()), "LOAD_INFO_ELAPSED_REALTIME_MS"));
        arrayList2.add(new fh.d(Long.valueOf(cVar.A()), "LOAD_INFO_LOAD_DURATION_MS"));
        arrayList2.add(new fh.d(cVar.b().f19475a, "LOAD_INFO_URI"));
        arrayList2.add(new fh.d(cVar.b().f19475a.getHost(), "LOAD_INFO_HOST"));
        arrayList.addAll(arrayList2);
        arrayList.addAll(b(bVar));
        return arrayList;
    }

    public static String q(ArrayList arrayList) {
        if (arrayList == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nh.b bVar = (nh.b) it.next();
            bVar.getClass();
            jSONArray.put(new JSONArray().put(bVar.f17550a).put(bVar.f17551b));
        }
        return jSONArray.toString();
    }

    public final void A() {
        this.F0.set(false);
        i4.b bVar = this.f19487a;
        if (bVar != null) {
            ch.n.b("VideoJob", "onVideoStarted");
            lm.a aVar = ((d0) bVar.f11196a).f16803h0;
            if (aVar != null) {
                aVar.g();
            }
        }
        a("VIDEO_STARTED", null);
    }

    public final void B() {
        if (this.f19505p0 <= 0) {
            J();
        }
        Boolean bool = this.D;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        f(this.f19502m0);
        this.f19514x += SystemClock.uptimeMillis() - this.f19516y;
        this.f19516y = 0L;
        i4.b bVar = this.f19487a;
        if (bVar != null) {
            ch.n.b("VideoJob", "onVideoStopBuffering");
            lm.a aVar = ((d0) bVar.f11196a).f16803h0;
            if (aVar != null) {
                aVar.g();
            }
        }
        a("VIDEO_STOP_BUFFERING", null);
        this.D = Boolean.FALSE;
    }

    public abstract void C();

    public abstract void E(p pVar);

    public abstract void F(g0 g0Var);

    public final void G(int i10, Bundle bundle) {
        ch.n.b("VideoTest", "sendMessage() called with: what = [" + i10 + "], bundle = [" + bundle + "]");
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.replyTo = this.D0;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        H(messageObtain);
    }

    public abstract void H(Message message);

    public abstract void I(nh.l lVar);

    public final void J() {
        if (this.F <= 0) {
            return;
        }
        this.E = SystemClock.uptimeMillis() - this.F;
        if (this.M != null && this.P.get()) {
            d0 d0Var = this.M;
            d0Var.getClass();
            ch.n.b(d0Var.f16807l0, "onRemoveEvent() called with: eventName = ".concat("FIRST_FRAME"));
            fh.f fVar = d0Var.F;
            fh.e eVar = new fh.e("FIRST_FRAME", null, d0Var.m(), 0);
            synchronized (fVar.f8871a) {
                fVar.f8871a.remove(eVar);
            }
        }
        this.P.set(true);
        a("FIRST_FRAME", null);
    }

    public abstract void K();

    public abstract void L();

    public final void M() {
        if (this.f19504o0 == null) {
            HandlerThread handlerThreadL = this.f19515x0.l("VideoTest-Handler");
            this.f19504o0 = handlerThreadL;
            handlerThreadL.start();
        }
    }

    public final void a(String str, ArrayList arrayList) {
        d0 d0Var;
        ch.n.b("VideoTest", "Video recordEvent() called with: eventName = [" + str + "], extras = [" + arrayList + "]");
        if (str.isEmpty() || (d0Var = this.M) == null) {
            return;
        }
        d0Var.q(str, arrayList != null ? (fh.d[]) arrayList.toArray(new fh.d[0]) : null);
    }

    public final void e() {
        f(this.f19503n0, this.f19502m0, null, this.f19501l0);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "level"
            java.lang.String r1 = "profile"
            java.lang.String r2 = "mime"
            android.media.MediaExtractor r3 = new android.media.MediaExtractor
            r3.<init>()
            r4 = 0
            r3.setDataSource(r9)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            r9 = 0
        L10:
            int r5 = r3.getTrackCount()     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r9 >= r5) goto L79
            android.media.MediaFormat r5 = r3.getTrackFormat(r9)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            java.lang.String r6 = r8.V     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r6 == 0) goto L3d
            boolean r6 = r5.containsKey(r2)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r6 == 0) goto L3d
            java.lang.String r6 = r5.getString(r2)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            java.lang.String r7 = "video/"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r7 == 0) goto L3d
            r8.V = r6     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            goto L3d
        L37:
            r9 = move-exception
            goto La4
        L39:
            r9 = move-exception
            goto L96
        L3b:
            r9 = move-exception
            goto L96
        L3d:
            java.lang.String r6 = r8.V     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            r7 = -1
            if (r6 != 0) goto L56
            int r6 = r8.Z     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r6 != r7) goto L56
            boolean r6 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r6 == 0) goto L56
            int r6 = r5.getInteger(r1)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            r8.Z = r6     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
        L56:
            java.lang.String r6 = r8.V     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r6 != 0) goto L76
            int r6 = r8.f19488a0     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r6 != r7) goto L76
            ch.f r6 = r8.f19512v0     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            boolean r6 = r6.a()     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r6 == 0) goto L76
            boolean r6 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r6 == 0) goto L76
            int r5 = r5.getInteger(r0)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            r8.f19488a0 = r5     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
        L76:
            int r9 = r9 + 1
            goto L10
        L79:
            java.lang.String r9 = r8.V     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            if (r9 != 0) goto L8d
            java.lang.String r9 = r8.V     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            android.media.MediaCodec r4 = android.media.MediaCodec.createDecoderByType(r9)     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            java.lang.String r9 = r4.getName()     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
            r8.Y = r9     // Catch: java.lang.Throwable -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b
        L8d:
            r3.release()
            if (r4 == 0) goto La3
            r4.release()
            return
        L96:
            java.lang.String r0 = "VideoTest"
            ch.n.e(r0, r9)     // Catch: java.lang.Throwable -> L37
            r3.release()
            if (r4 == 0) goto La3
            r4.release()
        La3:
            return
        La4:
            r3.release()
            if (r4 == 0) goto Lac
            r4.release()
        Lac:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oh.t.g(java.lang.String):void");
    }

    public final void h(String str) {
        io.sentry.internal.debugmeta.c cVar = this.f19513w0;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                cVar.b(Thread.currentThread());
                mediaMetadataRetriever.setDataSource(str, Collections.EMPTY_MAP);
                try {
                    y(Integer.parseInt(mediaMetadataRetriever.extractMetadata(18)), Integer.parseInt(mediaMetadataRetriever.extractMetadata(19)));
                } catch (NumberFormatException e4) {
                    ch.n.e("VideoTest", e4);
                }
                try {
                    this.U = Long.parseLong(mediaMetadataRetriever.extractMetadata(20));
                } catch (NumberFormatException e10) {
                    ch.n.e("VideoTest", e10);
                }
            } catch (RuntimeException e11) {
                ch.n.e("VideoTest", e11);
            }
            cVar.B(Thread.currentThread());
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e12) {
                ch.n.e("VideoTest", e12);
            }
        } catch (Throwable th2) {
            cVar.B(Thread.currentThread());
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e13) {
                ch.n.e("VideoTest", e13);
            }
            throw th2;
        }
    }

    public abstract Point i(Context context);

    public abstract String k();

    public final nh.d l(nh.l lVar) {
        int i10 = r.f19484a[this.S.f7376f.ordinal()];
        if (i10 == 1) {
            return nh.d.DASH;
        }
        if (i10 == 2) {
            return nh.d.HLS;
        }
        String str = lVar.f17619a;
        return str.contains(".mpd") ? nh.d.DASH : str.contains(".m3u8") ? nh.d.HLS : this.S.f7375e.contains("ADAPTIVE") ? nh.d.DASH : nh.d.PROGRESSIVE;
    }

    public abstract void m(nh.l lVar);

    public abstract void n();

    public abstract void o(int i10);

    public abstract boolean p(nh.l lVar);

    public abstract void r();

    public final void s(Object obj, String str) {
        if (this.f19487a != null) {
            ch.n.b("VideoJob", "onCustomEvent: " + nh.k.CUSTOM);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(obj, "CUSTOM"));
        a(str, arrayList);
    }

    public final void t() {
        this.D = Boolean.FALSE;
        if (this.f19487a != null) {
            ch.n.b("VideoJob", "onIntentionalInterrupt");
        }
        a("INTENTIONAL_INTERRUPT", null);
    }

    public void u(b bVar, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(Boolean.valueOf(z10), "IS_PLAYING"));
        arrayList.addAll(b(bVar));
        a("IS_PLAYING_CHANGED", arrayList);
    }

    public final void v() {
        StringBuilder sb2 = new StringBuilder("onPlayerReady() called From thread: ");
        sb2.append(Thread.currentThread().getId());
        sb2.append(" isMainThread [");
        sb2.append(Looper.myLooper() == Looper.getMainLooper());
        sb2.append("]");
        ch.n.b("VideoTest", sb2.toString());
        if (this.Q) {
            return;
        }
        this.Q = true;
        f(this.f19501l0);
        ch.n.b("VideoTest", "finishPlayerInitialisation() called");
        a("END_INITIALISATION", null);
        ch.n.b("VideoTest", "setInitialisationTime() called");
        this.f19495g = SystemClock.uptimeMillis() - this.f19507r;
        if (this.f19487a != null) {
            ch.n.b("VideoJob", "onPlayerReady");
        }
        a("PLAYER_READY", null);
        F(new g0(this));
    }

    public final void w(String str) {
        r1 r1Var;
        this.F0.set(true);
        this.D = Boolean.FALSE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fh.d(str, "ERROR_DESCRIPTION"));
        a("VIDEO_ERROR", arrayList);
        i4.b bVar = this.f19487a;
        if (bVar != null) {
            br.l.e(str, "error");
            ch.n.c("VideoJob", "onVideoError: ".concat(str));
            d0 d0Var = (d0) bVar.f11196a;
            lm.a aVar = d0Var.f16803h0;
            if (aVar != null && (r1Var = aVar.f15552g) != null) {
                VideoTestActivity videoTestActivity = (VideoTestActivity) ((r2) r1Var.f10199d).f10470a;
                videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 1));
                videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 2));
            }
            d0Var.f16802g0 = str;
        }
    }

    public final void x() throws JSONException {
        String string;
        if (this.L.getAndSet(true)) {
            return;
        }
        su.l lVar = this.f19491d;
        if (lVar != null) {
            StringBuilder sb2 = new StringBuilder("interrupt() called From thread: ");
            sb2.append(Thread.currentThread().getId());
            sb2.append(" isMainThread [");
            sb2.append(Looper.myLooper() == Looper.getMainLooper());
            sb2.append("]");
            ch.n.b("ContinuousTrafficStatsDetector", sb2.toString());
            Thread thread = (Thread) lVar.f22359d;
            if (thread != null && thread.isAlive()) {
                ((Thread) lVar.f22359d).interrupt();
            }
        }
        e();
        String string2 = null;
        a("VIDEO_FINISHED", null);
        p pVar = new p(1, this);
        String str = this.S.f7375e;
        boolean z10 = (this.F0.get() || str.contains("ADAPTIVE") || str.contains("LIVE")) ? false : true;
        nh.i iVar = new nh.i();
        iVar.f17571a = -1L;
        iVar.f17572b = -1L;
        iVar.f17573c = -1L;
        iVar.f17574d = -1L;
        iVar.f17575e = -1L;
        iVar.f17576f = -1L;
        iVar.f17577g = "";
        iVar.f17578h = "";
        iVar.f17579i = "";
        iVar.j = -1L;
        iVar.k = "";
        iVar.f17580l = "";
        iVar.f17581m = 0L;
        iVar.f17582n = -1L;
        iVar.f17583o = "";
        iVar.f17584p = -1;
        iVar.f17585q = -1;
        iVar.f17586r = "";
        iVar.f17587s = -1;
        iVar.f17588t = -1;
        iVar.f17589u = -1L;
        iVar.f17590v = false;
        iVar.f17591w = false;
        iVar.f17592x = null;
        iVar.f17593y = kk.b.UNKNOWN.getPlatformName();
        iVar.A = 0;
        iVar.B = "HD_720";
        synchronized (this.G) {
            try {
                if (this.G.isEmpty()) {
                    string = "";
                } else {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.G.iterator();
                    while (it.hasNext()) {
                        wh.g gVar = (wh.g) it.next();
                        dv.d dVar = gVar.f24529a;
                        jSONArray.put(new JSONArray().put(dVar.f7597a).put(dVar.f7598b).put(gVar.f24530b));
                    }
                    string = jSONArray.toString();
                }
            } finally {
            }
        }
        iVar.f17577g = string;
        synchronized (this.H) {
            iVar.f17578h = q(this.H);
        }
        iVar.j = this.O;
        iVar.f17571a = this.f19495g;
        iVar.f17572b = this.E;
        iVar.f17590v = this.R;
        iVar.f17574d = this.B;
        iVar.f17573c = this.f19514x;
        iVar.f17576f = 0L;
        iVar.f17575e = 0L;
        iVar.f17593y = this.K.getPlatformName();
        iVar.f17594z = k();
        kk.b bVar = this.K;
        dh.f fVar = this.S;
        if ((fVar.f7382n == 6 && bVar == kk.b.YOUTUBE) || bVar == kk.b.FACEBOOK || bVar == kk.b.TWITCH) {
            iVar.f17579i = this.f19492d0;
        } else {
            iVar.f17579i = fVar.f7374d;
        }
        iVar.f17581m = this.N != 0 ? SystemClock.uptimeMillis() - this.N : 0L;
        iVar.A = this.f19489b0;
        iVar.f17589u = this.f19490c0;
        dh.f fVar2 = this.S;
        iVar.B = fVar2 == null ? "HD_720" : fVar2.f7375e;
        iVar.k = this.I;
        iVar.f17580l = this.J;
        try {
            Point pointI = i(this.f19509s0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exoplayer_height_landscape", pointI.x);
            jSONObject.put("exoplayer_width_landscape", pointI.y);
            string2 = jSONObject.toString();
        } catch (Exception e4) {
            ch.n.e("VideoTest", e4);
        }
        iVar.C = string2;
        ak.a aVar = this.f19494f0;
        if (aVar != null) {
            iVar.f17591w = aVar.O;
        }
        if (!z10) {
            D(pVar, iVar);
            return;
        }
        e0 e0Var = new e0(this, iVar, pVar, 3);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            e0Var.run();
            return;
        }
        Thread threadNewThread = this.f19517y0.newThread(e0Var);
        threadNewThread.setName("GETTING-INFORMATION-THREAD");
        threadNewThread.start();
    }

    public final void y(int i10, int i11) {
        int i12 = this.X;
        boolean z10 = (i12 == -1 || i10 <= 0 || i10 == i12) ? false : true;
        int i13 = this.W;
        if (i13 != -1 && i11 > 0 && i11 != i13) {
            z10 = true;
        }
        this.W = i11;
        this.X = i10;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new fh.d(Integer.valueOf(i11), "VIDEO_HEIGHT"));
            arrayList.add(new fh.d(Integer.valueOf(i10), "VIDEO_WIDTH"));
            a("VIDEO_QUALITY_CHANGED", arrayList);
            this.R = true;
        }
    }

    public final void z() {
        r1 r1Var;
        if (this.f19505p0 <= 0) {
            return;
        }
        Boolean bool = this.D;
        if (bool == null || !bool.booleanValue()) {
            this.D = Boolean.TRUE;
            this.f19516y = SystemClock.uptimeMillis();
            this.B++;
            i4.b bVar = this.f19487a;
            if (bVar != null) {
                ch.n.b("VideoJob", "onVideoStartBuffering");
                lm.a aVar = ((d0) bVar.f11196a).f16803h0;
                if (aVar != null && (r1Var = aVar.f15552g) != null) {
                    VideoTestActivity videoTestActivity = (VideoTestActivity) ((r2) r1Var.f10199d).f10470a;
                    videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 5));
                    videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 4));
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new fh.d(Long.valueOf(this.f19505p0), "VIDEO_TIME"));
            a("VIDEO_START_BUFFERING", arrayList);
            new Handler(this.f19504o0.getLooper()).post(new q(this, 3));
        }
    }
}
