package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.v42;
import com.yandex.mobile.ads.impl.xv0;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class bw0 implements ed, yh1 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f25410A;

    /* renamed from: a, reason: collision with root package name */
    private final Context f25411a;

    /* renamed from: b, reason: collision with root package name */
    private final f00 f25412b;

    /* renamed from: c, reason: collision with root package name */
    private final PlaybackSession f25413c;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f25419j;

    /* renamed from: k, reason: collision with root package name */
    private int f25420k;

    /* renamed from: n, reason: collision with root package name */
    private sh1 f25423n;

    /* renamed from: o, reason: collision with root package name */
    private b f25424o;

    /* renamed from: p, reason: collision with root package name */
    private b f25425p;

    /* renamed from: q, reason: collision with root package name */
    private b f25426q;

    /* renamed from: r, reason: collision with root package name */
    private dc0 f25427r;

    /* renamed from: s, reason: collision with root package name */
    private dc0 f25428s;

    /* renamed from: t, reason: collision with root package name */
    private dc0 f25429t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f25430u;

    /* renamed from: v, reason: collision with root package name */
    private int f25431v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f25432w;

    /* renamed from: x, reason: collision with root package name */
    private int f25433x;

    /* renamed from: y, reason: collision with root package name */
    private int f25434y;

    /* renamed from: z, reason: collision with root package name */
    private int f25435z;

    /* renamed from: e, reason: collision with root package name */
    private final v42.d f25415e = new v42.d();

    /* renamed from: f, reason: collision with root package name */
    private final v42.b f25416f = new v42.b();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f25418h = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, Long> f25417g = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final long f25414d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    private int f25421l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f25422m = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f25436a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25437b;

        public a(int i, int i10) {
            this.f25436a = i;
            this.f25437b = i10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final dc0 f25438a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25439b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25440c;

        public b(dc0 dc0Var, int i, String str) {
            this.f25438a = dc0Var;
            this.f25439b = i;
            this.f25440c = str;
        }
    }

    private bw0(Context context, PlaybackSession playbackSession) {
        this.f25411a = context.getApplicationContext();
        this.f25413c = playbackSession;
        f00 f00Var = new f00();
        this.f25412b = f00Var;
        f00Var.a(this);
    }

    public static bw0 a(Context context) {
        MediaMetricsManager mediaMetricsManagerD = I0.f.d(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerD == null) {
            return null;
        }
        return new bw0(context, mediaMetricsManagerD.createPlaybackSession());
    }

    public final LogSessionId b() {
        return this.f25413c.getSessionId();
    }

    public final void b(ed.a aVar, String str) {
        jw0.b bVar = aVar.f26800d;
        if ((bVar == null || !bVar.a()) && str.equals(this.i)) {
            a();
        }
        this.f25417g.remove(str);
        this.f25418h.remove(str);
    }

    private void a() {
        PlaybackMetrics.Builder builder = this.f25419j;
        if (builder != null && this.f25410A) {
            builder.setAudioUnderrunCount(this.f25435z);
            this.f25419j.setVideoFramesDropped(this.f25433x);
            this.f25419j.setVideoFramesPlayed(this.f25434y);
            Long l5 = this.f25417g.get(this.i);
            this.f25419j.setNetworkTransferDurationMillis(l5 == null ? 0L : l5.longValue());
            Long l10 = this.f25418h.get(this.i);
            this.f25419j.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f25419j.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f25413c.reportPlaybackMetrics(this.f25419j.build());
        }
        this.f25419j = null;
        this.i = null;
        this.f25435z = 0;
        this.f25433x = 0;
        this.f25434y = 0;
        this.f25427r = null;
        this.f25428s = null;
        this.f25429t = null;
        this.f25410A = false;
    }

    private void a(v42 v42Var, jw0.b bVar) {
        int iA;
        PlaybackMetrics.Builder builder = this.f25419j;
        if (bVar == null || (iA = v42Var.a(bVar.f27470a)) == -1) {
            return;
        }
        int i = 0;
        v42Var.a(iA, this.f25416f, false);
        v42Var.a(this.f25416f.f34345d, this.f25415e, 0L);
        xv0.g gVar = this.f25415e.f34360d.f35439c;
        if (gVar != null) {
            int iA2 = s82.a(gVar.f35486a, gVar.f35487b);
            i = iA2 != 0 ? iA2 != 1 ? iA2 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        v42.d dVar = this.f25415e;
        if (dVar.f34370o != -9223372036854775807L && !dVar.f34368m && !dVar.f34365j && !dVar.a()) {
            builder.setMediaDurationMillis(s82.b(this.f25415e.f34370o));
        }
        builder.setPlaybackType(this.f25415e.a() ? 2 : 1);
        this.f25410A = true;
    }

    public final void a(ed.a aVar, int i, long j4) {
        jw0.b bVar = aVar.f26800d;
        if (bVar != null) {
            String strA = this.f25412b.a(aVar.f26798b, bVar);
            Long l5 = this.f25418h.get(strA);
            Long l10 = this.f25417g.get(strA);
            this.f25418h.put(strA, Long.valueOf((l5 == null ? 0L : l5.longValue()) + j4));
            this.f25417g.put(strA, Long.valueOf((l10 != null ? l10.longValue() : 0L) + i));
        }
    }

    public final void a(ed.a aVar, zv0 zv0Var) {
        if (aVar.f26800d == null) {
            return;
        }
        dc0 dc0Var = zv0Var.f36758c;
        dc0Var.getClass();
        int i = zv0Var.f36759d;
        f00 f00Var = this.f25412b;
        v42 v42Var = aVar.f26798b;
        jw0.b bVar = aVar.f26800d;
        bVar.getClass();
        b bVar2 = new b(dc0Var, i, f00Var.a(v42Var, bVar));
        int i10 = zv0Var.f36757b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f25425p = bVar2;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f25426q = bVar2;
                return;
            }
        }
        this.f25424o = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0542 A[PHI: r13
  0x0542: PHI (r13v22 int) = (r13v18 int), (r13v19 int) binds: [B:344:0x0540, B:371:0x057e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.bi1 r27, com.yandex.mobile.ads.impl.ed.b r28) {
        /*
            Method dump skipped, instructions count: 1594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bw0.a(com.yandex.mobile.ads.impl.bi1, com.yandex.mobile.ads.impl.ed$b):void");
    }

    public final void a(zv0 zv0Var) {
        this.f25431v = zv0Var.f36756a;
    }

    public final void a(sh1 sh1Var) {
        this.f25423n = sh1Var;
    }

    public final void a(int i) {
        if (i == 1) {
            this.f25430u = true;
        }
        this.f25420k = i;
    }

    public final void a(ed.a aVar, String str) {
        jw0.b bVar = aVar.f26800d;
        if (bVar == null || !bVar.a()) {
            a();
            this.i = str;
            this.f25419j = I0.j.g().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            a(aVar.f26798b, aVar.f26800d);
        }
    }

    public final void a(ky kyVar) {
        this.f25433x += kyVar.f29815g;
        this.f25434y += kyVar.f29813e;
    }

    public final void a(pf2 pf2Var) {
        b bVar = this.f25424o;
        if (bVar != null) {
            dc0 dc0Var = bVar.f25438a;
            if (dc0Var.f26089s == -1) {
                this.f25424o = new b(dc0Var.a().o(pf2Var.f31730b).f(pf2Var.f31731c).a(), bVar.f25439b, bVar.f25440c);
            }
        }
    }

    private void a(int i, long j4, dc0 dc0Var, int i10) {
        int i11;
        TrackChangeEvent.Builder timeSinceCreatedMillis = I0.f.h(i).setTimeSinceCreatedMillis(j4 - this.f25414d);
        if (dc0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    i11 = i10 != 3 ? 1 : 4;
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str = dc0Var.f26082l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = dc0Var.f26083m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = dc0Var.f26080j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = dc0Var.i;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = dc0Var.f26088r;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = dc0Var.f26089s;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = dc0Var.f26096z;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = dc0Var.f26066A;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = dc0Var.f26075d;
            if (str4 != null) {
                int i17 = s82.f32899a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = dc0Var.f26090t;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f25410A = true;
        this.f25413c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
