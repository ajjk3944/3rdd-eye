package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rd4 implements bd4 {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public final Context f;
    public final od4 h;
    public final PlaybackSession i;
    public String o;
    public PlaybackMetrics.Builder p;
    public b84 s;
    public lv2 t;
    public lv2 u;
    public lv2 v;
    public ph4 w;
    public ph4 x;
    public ph4 y;
    public boolean z;
    public final Executor g = wl2.B();
    public final ez1 k = new ez1();
    public final sw1 l = new sw1();
    public final HashMap n = new HashMap();
    public final HashMap m = new HashMap();
    public final long j = SystemClock.elapsedRealtime();
    public int q = 0;
    public int r = 0;

    public rd4(Context context, PlaybackSession playbackSession) {
        this.f = context.getApplicationContext();
        this.i = playbackSession;
        od4 od4Var = new od4();
        this.h = od4Var;
        od4Var.d = this;
    }

    @Override // defpackage.bd4
    public final void b(n34 n34Var) {
        this.B += n34Var.g;
        this.C += n34Var.e;
    }

    public final void c(int i, long j, ph4 ph4Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = qd4.p(i).setTimeSinceCreatedMillis(j - this.j);
        if (ph4Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = ph4Var.l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = ph4Var.m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = ph4Var.j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = ph4Var.i;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = ph4Var.t;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = ph4Var.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = ph4Var.E;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = ph4Var.F;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = ph4Var.d;
            if (str4 != null) {
                String str5 = v23.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = ph4Var.x;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.E = true;
        this.g.execute(new sz2(this, timeSinceCreatedMillis.build(), 26));
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
    public final void e(defpackage.oz1 r9, defpackage.kh4 r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd4.e(oz1, kh4):void");
    }

    public final void f() {
        PlaybackMetrics.Builder builder = this.p;
        if (builder != null && this.E) {
            builder.setAudioUnderrunCount(this.D);
            this.p.setVideoFramesDropped(this.B);
            this.p.setVideoFramesPlayed(this.C);
            Long l = (Long) this.m.get(this.o);
            this.p.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.n.get(this.o);
            this.p.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.p.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.g.execute(new sz2(this, this.p.build(), 27));
        }
        this.p = null;
        this.o = null;
        this.D = 0;
        this.B = 0;
        this.C = 0;
        this.w = null;
        this.x = null;
        this.y = null;
        this.E = false;
    }

    @Override // defpackage.bd4
    public final void h(int i) {
        if (i == 1) {
            this.z = true;
        }
    }

    @Override // defpackage.bd4
    public final void i(ad4 ad4Var, int i, long j) {
        kh4 kh4Var = ad4Var.d;
        if (kh4Var != null) {
            String strA = this.h.a(ad4Var.b, kh4Var);
            HashMap map = this.n;
            Long l = (Long) map.get(strA);
            HashMap map2 = this.m;
            Long l2 = (Long) map2.get(strA);
            map.put(strA, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strA, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // defpackage.bd4
    public final void j(b84 b84Var) {
        this.s = b84Var;
    }

    @Override // defpackage.bd4
    public final void k(t82 t82Var) {
        lv2 lv2Var = this.t;
        if (lv2Var != null) {
            ph4 ph4Var = (ph4) lv2Var.g;
            if (ph4Var.u == -1) {
                gg4 gg4Var = new gg4(ph4Var);
                gg4Var.s = t82Var.a;
                gg4Var.t = t82Var.b;
                this.t = new lv2(new ph4(gg4Var), (String) lv2Var.h, 16);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x020c A[PHI: r6
  0x020c: PHI (r6v50 int) = (r6v31 int), (r6v81 int) binds: [B:209:0x02fc, B:135:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020f A[PHI: r6
  0x020f: PHI (r6v49 int) = (r6v31 int), (r6v81 int) binds: [B:209:0x02fc, B:135:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0212 A[PHI: r6
  0x0212: PHI (r6v48 int) = (r6v31 int), (r6v81 int) binds: [B:209:0x02fc, B:135:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0215 A[PHI: r6
  0x0215: PHI (r6v47 int) = (r6v31 int), (r6v81 int) binds: [B:209:0x02fc, B:135:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0264 A[PHI: r8
  0x0264: PHI (r8v20 int) = (r8v19 int), (r8v24 int), (r8v24 int) binds: [B:197:0x02d0, B:159:0x0256, B:161:0x025e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02a4  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Throwable, lv2] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // defpackage.bd4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.f74 r24, defpackage.mr2 r25) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd4.m(f74, mr2):void");
    }

    @Override // defpackage.bd4
    public final void n(ad4 ad4Var, hh4 hh4Var) {
        kh4 kh4Var = ad4Var.d;
        if (kh4Var == null) {
            return;
        }
        ph4 ph4Var = hh4Var.b;
        ph4Var.getClass();
        lv2 lv2Var = new lv2(ph4Var, this.h.a(ad4Var.b, kh4Var), 16);
        int i = hh4Var.a;
        if (i != 0) {
            if (i == 1) {
                this.u = lv2Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.v = lv2Var;
                return;
            }
        }
        this.t = lv2Var;
    }

    public final void q(ad4 ad4Var, String str) {
        kh4 kh4Var = ad4Var.d;
        if ((kh4Var == null || !kh4Var.b()) && str.equals(this.o)) {
            f();
        }
        this.m.remove(str);
        this.n.remove(str);
    }

    public final boolean r(lv2 lv2Var) {
        String str;
        if (lv2Var == null) {
            return false;
        }
        od4 od4Var = this.h;
        String str2 = (String) lv2Var.h;
        synchronized (od4Var) {
            str = od4Var.f;
        }
        return str2.equals(str);
    }

    @Override // defpackage.bd4
    public final void o(IOException iOException) {
    }
}
