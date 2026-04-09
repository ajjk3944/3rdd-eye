package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class LO implements CO {

    /* renamed from: C, reason: collision with root package name */
    public HN f9665C;

    /* renamed from: D, reason: collision with root package name */
    public C1879sw f9666D;

    /* renamed from: E, reason: collision with root package name */
    public C1879sw f9667E;

    /* renamed from: F, reason: collision with root package name */
    public C1879sw f9668F;

    /* renamed from: G, reason: collision with root package name */
    public TP f9669G;

    /* renamed from: H, reason: collision with root package name */
    public TP f9670H;

    /* renamed from: I, reason: collision with root package name */
    public TP f9671I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f9672J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f9673K;

    /* renamed from: L, reason: collision with root package name */
    public int f9674L;
    public int M;

    /* renamed from: N, reason: collision with root package name */
    public int f9675N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f9676O;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9677a;

    /* renamed from: c, reason: collision with root package name */
    public final IO f9679c;

    /* renamed from: d, reason: collision with root package name */
    public final PlaybackSession f9680d;

    /* renamed from: j, reason: collision with root package name */
    public String f9685j;

    /* renamed from: k, reason: collision with root package name */
    public PlaybackMetrics.Builder f9686k;

    /* renamed from: l, reason: collision with root package name */
    public int f9687l;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9678b = AbstractC1114el.e();

    /* renamed from: f, reason: collision with root package name */
    public final U7 f9682f = new U7();

    /* renamed from: g, reason: collision with root package name */
    public final I7 f9683g = new I7();
    public final HashMap i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f9684h = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final long f9681e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    public int f9688m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f9689n = 0;

    public LO(Context context, PlaybackSession playbackSession) {
        this.f9677a = context.getApplicationContext();
        this.f9680d = playbackSession;
        IO io = new IO();
        this.f9679c = io;
        io.f9097d = this;
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void a(int i) {
        if (i == 1) {
            this.f9672J = true;
            i = 1;
        }
        this.f9687l = i;
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final /* synthetic */ void b(int i) {
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void c(BN bn) {
        this.f9674L += bn.f7338g;
        this.M += bn.f7336e;
    }

    public final void d(int i, long j6, TP tp, int i3) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = KO.o(i).setTimeSinceCreatedMillis(j6 - this.f9681e);
        if (tp != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i3 != 1 ? 1 : 2);
            String str = tp.f11396l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = tp.f11397m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = tp.f11394j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i6 = tp.i;
            if (i6 != -1) {
                timeSinceCreatedMillis.setBitrate(i6);
            }
            int i7 = tp.f11404t;
            if (i7 != -1) {
                timeSinceCreatedMillis.setWidth(i7);
            }
            int i8 = tp.f11405u;
            if (i8 != -1) {
                timeSinceCreatedMillis.setHeight(i8);
            }
            int i9 = tp.f11378E;
            if (i9 != -1) {
                timeSinceCreatedMillis.setChannelCount(i9);
            }
            int i10 = tp.f11379F;
            if (i10 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i10);
            }
            String str4 = tp.f11389d;
            if (str4 != null) {
                String str5 = Vt.f12096a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f2 = tp.f11408x;
            if (f2 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f2);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f9676O = true;
        this.f9678b.execute(new RunnableC0786Vp(this, 22, timeSinceCreatedMillis.build()));
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void e(HN hn) {
        this.f9665C = hn;
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final /* synthetic */ void f(int i) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.gms.internal.ads.AbstractC1353j8 r10, com.google.android.gms.internal.ads.C1749qQ r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.LO.g(com.google.android.gms.internal.ads.j8, com.google.android.gms.internal.ads.qQ):void");
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void h(BO bo, C1587nQ c1587nQ) {
        C1749qQ c1749qQ = bo.f7346d;
        if (c1749qQ == null) {
            return;
        }
        TP tp = c1587nQ.f15779b;
        tp.getClass();
        C1879sw c1879sw = new C1879sw(tp, 10, this.f9679c.a(bo.f7344b, c1749qQ));
        int i = c1587nQ.f15778a;
        if (i != 0) {
            if (i == 1) {
                this.f9667E = c1879sw;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f9668F = c1879sw;
                return;
            }
        }
        this.f9666D = c1879sw;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01d0 A[PHI: r6
  0x01d0: PHI (r6v41 int) = (r6v30 int), (r6v63 int) binds: [B:185:0x02b6, B:112:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d3 A[PHI: r6
  0x01d3: PHI (r6v40 int) = (r6v30 int), (r6v63 int) binds: [B:185:0x02b6, B:112:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d6 A[PHI: r6
  0x01d6: PHI (r6v39 int) = (r6v30 int), (r6v63 int) binds: [B:185:0x02b6, B:112:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d9 A[PHI: r6
  0x01d9: PHI (r6v38 int) = (r6v30 int), (r6v63 int) binds: [B:185:0x02b6, B:112:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.CO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.google.android.gms.internal.ads.VL r25, com.google.android.gms.internal.ads.Vu r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.LO.i(com.google.android.gms.internal.ads.VL, com.google.android.gms.internal.ads.Vu):void");
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void j(C1161fd c1161fd) {
        C1879sw c1879sw = this.f9666D;
        if (c1879sw != null) {
            TP tp = (TP) c1879sw.f16823b;
            if (tp.f11405u == -1) {
                C1855sP c1855sP = new C1855sP(tp);
                c1855sP.f16739s = c1161fd.f14103a;
                c1855sP.f16740t = c1161fd.f14104b;
                this.f9666D = new C1879sw(new TP(c1855sP), 10, (String) c1879sw.f16824c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final /* synthetic */ void k(TP tp) {
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final /* synthetic */ void l(TP tp) {
    }

    public final void m() {
        PlaybackMetrics.Builder builder = this.f9686k;
        if (builder != null && this.f9676O) {
            builder.setAudioUnderrunCount(this.f9675N);
            this.f9686k.setVideoFramesDropped(this.f9674L);
            this.f9686k.setVideoFramesPlayed(this.M);
            Long l2 = (Long) this.f9684h.get(this.f9685j);
            this.f9686k.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l6 = (Long) this.i.get(this.f9685j);
            this.f9686k.setNetworkBytesRead(l6 == null ? 0L : l6.longValue());
            this.f9686k.setStreamSource((l6 == null || l6.longValue() <= 0) ? 0 : 1);
            this.f9678b.execute(new RunnableC0786Vp(this, 23, this.f9686k.build()));
        }
        this.f9686k = null;
        this.f9685j = null;
        this.f9675N = 0;
        this.f9674L = 0;
        this.M = 0;
        this.f9669G = null;
        this.f9670H = null;
        this.f9671I = null;
        this.f9676O = false;
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void n(BO bo, int i, long j6) {
        C1749qQ c1749qQ = bo.f7346d;
        if (c1749qQ != null) {
            String strA = this.f9679c.a(bo.f7344b, c1749qQ);
            HashMap map = this.i;
            Long l2 = (Long) map.get(strA);
            HashMap map2 = this.f9684h;
            Long l6 = (Long) map2.get(strA);
            map.put(strA, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j6));
            map2.put(strA, Long.valueOf((l6 != null ? l6.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final /* synthetic */ void p() {
    }

    public final void q(BO bo, String str) {
        C1749qQ c1749qQ = bo.f7346d;
        if ((c1749qQ == null || !c1749qQ.b()) && str.equals(this.f9685j)) {
            m();
        }
        this.f9684h.remove(str);
        this.i.remove(str);
    }

    public final boolean r(C1879sw c1879sw) {
        String str;
        if (c1879sw == null) {
            return false;
        }
        IO io = this.f9679c;
        String str2 = (String) c1879sw.f16824c;
        synchronized (io) {
            str = io.f9099f;
        }
        return str2.equals(str);
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void o(IOException iOException) {
    }
}
