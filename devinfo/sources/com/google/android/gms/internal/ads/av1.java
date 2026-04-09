package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class av1 implements ru1 {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9425a;

    /* renamed from: c, reason: collision with root package name */
    public final yu1 f9427c;

    /* renamed from: d, reason: collision with root package name */
    public final PlaybackSession f9428d;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f9433k;

    /* renamed from: l, reason: collision with root package name */
    public int f9434l;

    /* renamed from: o, reason: collision with root package name */
    public us1 f9437o;

    /* renamed from: p, reason: collision with root package name */
    public zu1 f9438p;

    /* renamed from: q, reason: collision with root package name */
    public zu1 f9439q;

    /* renamed from: r, reason: collision with root package name */
    public zu1 f9440r;

    /* renamed from: s, reason: collision with root package name */
    public mx1 f9441s;

    /* renamed from: t, reason: collision with root package name */
    public mx1 f9442t;

    /* renamed from: u, reason: collision with root package name */
    public mx1 f9443u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9444v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9445w;

    /* renamed from: x, reason: collision with root package name */
    public int f9446x;

    /* renamed from: y, reason: collision with root package name */
    public int f9447y;

    /* renamed from: z, reason: collision with root package name */
    public int f9448z;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9426b = a80.e();

    /* renamed from: f, reason: collision with root package name */
    public final fh f9430f = new fh();
    public final tg g = new tg();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f9432i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f9431h = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final long f9429e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    public int f9435m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f9436n = 0;

    public av1(Context context, PlaybackSession playbackSession) {
        this.f9425a = context.getApplicationContext();
        this.f9428d = playbackSession;
        yu1 yu1Var = new yu1();
        this.f9427c = yu1Var;
        yu1Var.f18879d = this;
    }

    public static av1 p(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new av1(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void a(int i4) {
        if (i4 == 1) {
            this.f9444v = true;
            i4 = 1;
        }
        this.f9434l = i4;
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void c(os1 os1Var) {
        this.f9446x += os1Var.g;
        this.f9447y += os1Var.f14782e;
    }

    public final void d(int i4, long j, mx1 mx1Var, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i4).setTimeSinceCreatedMillis(j - this.f9429e);
        if (mx1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i10 != 1 ? 1 : 2);
            String str = mx1Var.f14051l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = mx1Var.f14052m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = mx1Var.j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i11 = mx1Var.f14049i;
            if (i11 != -1) {
                timeSinceCreatedMillis.setBitrate(i11);
            }
            int i12 = mx1Var.f14059t;
            if (i12 != -1) {
                timeSinceCreatedMillis.setWidth(i12);
            }
            int i13 = mx1Var.f14060u;
            if (i13 != -1) {
                timeSinceCreatedMillis.setHeight(i13);
            }
            int i14 = mx1Var.E;
            if (i14 != -1) {
                timeSinceCreatedMillis.setChannelCount(i14);
            }
            int i15 = mx1Var.F;
            if (i15 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i15);
            }
            String str4 = mx1Var.f14045d;
            if (str4 != null) {
                String str5 = bq0.f9768a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = mx1Var.f14063x;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f9426b.execute(new uh0(21, this, timeSinceCreatedMillis.build()));
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void e(us1 us1Var) {
        this.f9437o = us1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.gms.internal.ads.uh r9, com.google.android.gms.internal.ads.jy1 r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.av1.g(com.google.android.gms.internal.ads.uh, com.google.android.gms.internal.ads.jy1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd A[PHI: r6
  0x01cd: PHI (r6v17 int) = (r6v7 int), (r6v41 int) binds: [B:186:0x02b0, B:114:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d0 A[PHI: r6
  0x01d0: PHI (r6v16 int) = (r6v7 int), (r6v41 int) binds: [B:186:0x02b0, B:114:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d3 A[PHI: r6
  0x01d3: PHI (r6v15 int) = (r6v7 int), (r6v41 int) binds: [B:186:0x02b0, B:114:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d6 A[PHI: r6
  0x01d6: PHI (r6v14 int) = (r6v7 int), (r6v41 int) binds: [B:186:0x02b0, B:114:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.ru1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.google.android.gms.internal.ads.hp1 r24, com.google.android.gms.internal.ads.rt r25) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.av1.h(com.google.android.gms.internal.ads.hp1, com.google.android.gms.internal.ads.rt):void");
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void i(vr vrVar) {
        zu1 zu1Var = this.f9438p;
        if (zu1Var != null) {
            mx1 mx1Var = (mx1) zu1Var.f19184a;
            if (mx1Var.f14060u == -1) {
                lw1 lw1Var = new lw1(mx1Var);
                lw1Var.f13668s = vrVar.f17693a;
                lw1Var.f13669t = vrVar.f17694b;
                this.f9438p = new zu1(new mx1(lw1Var), (String) zu1Var.f19185b);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void k(qu1 qu1Var, a0.c0 c0Var) {
        jy1 jy1Var = qu1Var.f15450d;
        if (jy1Var == null) {
            return;
        }
        mx1 mx1Var = (mx1) c0Var.f23d;
        mx1Var.getClass();
        zu1 zu1Var = new zu1(mx1Var, this.f9427c.a(qu1Var.f15448b, jy1Var));
        int i4 = c0Var.f20a;
        if (i4 != 0) {
            if (i4 == 1) {
                this.f9439q = zu1Var;
                return;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                this.f9440r = zu1Var;
                return;
            }
        }
        this.f9438p = zu1Var;
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void m(qu1 qu1Var, int i4, long j) {
        jy1 jy1Var = qu1Var.f15450d;
        if (jy1Var != null) {
            String strA = this.f9427c.a(qu1Var.f15448b, jy1Var);
            HashMap map = this.f9432i;
            Long l10 = (Long) map.get(strA);
            HashMap map2 = this.f9431h;
            Long l11 = (Long) map2.get(strA);
            map.put(strA, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j));
            map2.put(strA, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i4));
        }
    }

    public final void n() {
        PlaybackMetrics.Builder builder = this.f9433k;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f9448z);
            this.f9433k.setVideoFramesDropped(this.f9446x);
            this.f9433k.setVideoFramesPlayed(this.f9447y);
            Long l10 = (Long) this.f9431h.get(this.j);
            this.f9433k.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f9432i.get(this.j);
            this.f9433k.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f9433k.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f9426b.execute(new uh0(22, this, this.f9433k.build()));
        }
        this.f9433k = null;
        this.j = null;
        this.f9448z = 0;
        this.f9446x = 0;
        this.f9447y = 0;
        this.f9441s = null;
        this.f9442t = null;
        this.f9443u = null;
        this.A = false;
    }

    public final LogSessionId q() {
        return this.f9428d.getSessionId();
    }

    public final void r(qu1 qu1Var, String str) {
        jy1 jy1Var = qu1Var.f15450d;
        if (jy1Var == null || !jy1Var.b()) {
            n();
            this.j = str;
            this.f9433k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.9.0-beta01");
            g(qu1Var.f15448b, jy1Var);
        }
    }

    public final void s(qu1 qu1Var, String str) {
        jy1 jy1Var = qu1Var.f15450d;
        if ((jy1Var == null || !jy1Var.b()) && str.equals(this.j)) {
            n();
        }
        this.f9431h.remove(str);
        this.f9432i.remove(str);
    }

    public final /* synthetic */ void t(PlaybackErrorEvent playbackErrorEvent) {
        this.f9428d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void u(NetworkEvent networkEvent) {
        this.f9428d.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void v(PlaybackStateEvent playbackStateEvent) {
        this.f9428d.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void w(TrackChangeEvent trackChangeEvent) {
        this.f9428d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final /* synthetic */ void x(PlaybackMetrics playbackMetrics) {
        this.f9428d.reportPlaybackMetrics(playbackMetrics);
    }

    public final boolean y(zu1 zu1Var) {
        String str;
        if (zu1Var == null) {
            return false;
        }
        yu1 yu1Var = this.f9427c;
        String str2 = (String) zu1Var.f19185b;
        synchronized (yu1Var) {
            str = yu1Var.f18881f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ void H1() {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ void b(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ void f(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ void j(mx1 mx1Var) {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ void l(mx1 mx1Var) {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void o(IOException iOException) {
    }
}
