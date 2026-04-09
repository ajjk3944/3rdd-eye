package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.ads.AdError;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ss1 implements pt1 {

    /* renamed from: p, reason: collision with root package name */
    public static final u51 f16530p;

    /* renamed from: a, reason: collision with root package name */
    public final fh f16531a;

    /* renamed from: b, reason: collision with root package name */
    public final tg f16532b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f16533c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16534d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16535e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16536f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16537h;

    /* renamed from: i, reason: collision with root package name */
    public final long f16538i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f16539k;

    /* renamed from: l, reason: collision with root package name */
    public final long f16540l;

    /* renamed from: m, reason: collision with root package name */
    public final z41 f16541m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f16542n;

    /* renamed from: o, reason: collision with root package name */
    public long f16543o;

    static {
        v41 v41Var = x41.f18307b;
        Object[] objArr = {"file", AppLovinEventTypes.USER_VIEWED_CONTENT, "data", "android.resource", "rawresource", "asset"};
        yo0.m(objArr, 6);
        f16530p = x41.s(objArr, 6);
    }

    public ss1() {
        androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k(2);
        k(1000, 0, "bufferForPlaybackMs", "0");
        k(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        k(AdError.SERVER_ERROR_CODE, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        k(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        k(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        k(50000, AdError.SERVER_ERROR_CODE, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        k(50000, 50000, "maxBufferMs", "minBufferMs");
        k(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        k(0, 0, "backBufferDurationMs", "0");
        this.f16531a = new fh();
        this.f16532b = new tg();
        this.f16533c = kVar;
        long jS = bq0.s(50000L);
        this.f16534d = jS;
        long jS2 = bq0.s(1000L);
        this.f16535e = jS2;
        this.f16536f = jS;
        this.g = jS;
        this.f16537h = jS2;
        this.f16538i = jS2;
        this.j = bq0.s(2000L);
        this.f16539k = jS2;
        this.f16540l = bq0.s(0L);
        this.f16542n = new ConcurrentHashMap();
        this.f16541m = z41.a(z51.g);
        this.f16543o = -1L;
    }

    public static void k(int i4, int i10, String str, String str2) {
        if (!(i4 >= i10)) {
            throw new IllegalArgumentException(al0.H("%s cannot be less than %s", str, str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final boolean A1() {
        Iterator it = this.f16542n.values().iterator();
        while (it.hasNext()) {
            if (((rs1) it.next()).f15748b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final void a(cv1 cv1Var) {
        long id2 = Thread.currentThread().getId();
        long j = this.f16543o;
        mq0.d0("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id2);
        this.f16543o = id2;
        ConcurrentHashMap concurrentHashMap = this.f16542n;
        rs1 rs1Var = (rs1) concurrentHashMap.get(cv1Var);
        if (rs1Var == null) {
            rs1 rs1Var2 = new rs1();
            rs1Var2.f15747a = 1;
            concurrentHashMap.put(cv1Var, rs1Var2);
        } else {
            rs1Var.f15747a++;
        }
        rs1 rs1Var3 = (rs1) concurrentHashMap.get(cv1Var);
        rs1Var3.getClass();
        Integer num = (Integer) this.f16541m.get(cv1Var.f10228a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        rs1Var3.f15749c = iIntValue;
        rs1Var3.f15748b = false;
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final void b(cv1 cv1Var) {
        ConcurrentHashMap concurrentHashMap = this.f16542n;
        rs1 rs1Var = (rs1) concurrentHashMap.get(cv1Var);
        if (rs1Var != null) {
            int i4 = rs1Var.f15747a - 1;
            rs1Var.f15747a = i4;
            if (i4 == 0) {
                concurrentHashMap.remove(cv1Var);
                i();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.f16543o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final boolean c(ot1 ot1Var) {
        long jMin;
        boolean z3;
        int i4;
        boolean z10 = ot1Var.f14799f;
        long jRound = ot1Var.f14797d;
        float f10 = ot1Var.f14798e;
        boolean zJ = j(ot1Var);
        String str = bq0.f9768a;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / f10);
        }
        if (z10) {
            if (zJ) {
                jMin = this.f16539k;
                z3 = true;
            } else {
                jMin = this.j;
                z3 = false;
            }
        } else if (zJ) {
            jMin = this.f16538i;
            z3 = true;
        } else {
            jMin = this.f16537h;
            z3 = false;
        }
        long j = ot1Var.g;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin > 0 && jRound < jMin) {
            if (!z3) {
                cv1 cv1Var = ot1Var.f14794a;
                rs1 rs1Var = (rs1) this.f16542n.get(cv1Var);
                rs1Var.getClass();
                synchronized (rs1Var) {
                    i4 = rs1Var.f15750d;
                }
                int i10 = i4 * 65536;
                rs1 rs1Var2 = (rs1) this.f16542n.get(cv1Var);
                rs1Var2.getClass();
                if (i10 >= rs1Var2.f15749c) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final long d() {
        return this.f16540l;
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final void e(cv1 cv1Var) {
        ConcurrentHashMap concurrentHashMap = this.f16542n;
        rs1 rs1Var = (rs1) concurrentHashMap.get(cv1Var);
        if (rs1Var != null) {
            int i4 = rs1Var.f15747a - 1;
            rs1Var.f15747a = i4;
            if (i4 == 0) {
                concurrentHashMap.remove(cv1Var);
                i();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final boolean f(ot1 ot1Var) {
        int i4;
        ConcurrentHashMap concurrentHashMap = this.f16542n;
        cv1 cv1Var = ot1Var.f14794a;
        rs1 rs1Var = (rs1) concurrentHashMap.get(cv1Var);
        rs1Var.getClass();
        rs1 rs1Var2 = (rs1) this.f16542n.get(cv1Var);
        rs1Var2.getClass();
        synchronized (rs1Var2) {
            i4 = rs1Var2.f15750d;
        }
        int i10 = i4 * 65536;
        rs1 rs1Var3 = (rs1) this.f16542n.get(cv1Var);
        rs1Var3.getClass();
        int i11 = rs1Var3.f15749c;
        if (cv1Var.equals(cv1.f10227c)) {
            return i10 < i11;
        }
        boolean zJ = j(ot1Var);
        long jMin = zJ ? this.f16535e : this.f16534d;
        long j = zJ ? this.g : this.f16536f;
        float f10 = ot1Var.f14798e;
        if (f10 > 1.0f) {
            jMin = Math.min(bq0.w(jMin, f10), j);
        }
        long j8 = ot1Var.f14797d;
        if (j8 < Math.max(jMin, 500000L)) {
            boolean z3 = zJ || i10 < i11;
            rs1Var.f15748b = z3;
            if (!z3 && j8 < 500000) {
                ls.t("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j8 >= j || i10 >= i11) {
            rs1Var.f15748b = false;
        }
        return rs1Var.f15748b;
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final void g(ot1 ot1Var, d[] dVarArr) {
        cv1 cv1Var = ot1Var.f14794a;
        Integer num = (Integer) this.f16541m.get(cv1Var.f10228a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        rs1 rs1Var = (rs1) this.f16542n.get(cv1Var);
        rs1Var.getClass();
        if (iIntValue == -1) {
            boolean zJ = j(ot1Var);
            int length = dVarArr.length;
            int i4 = 0;
            int i10 = 0;
            while (true) {
                int i11 = 13107200;
                if (i4 >= length) {
                    break;
                }
                d dVar = dVarArr[i4];
                if (dVar != null) {
                    int i12 = dVar.b().f12339c;
                    if (i12 != -1) {
                        if (i12 == 0) {
                            i11 = 144310272;
                        } else if (i12 != 1) {
                            i11 = i12 != 2 ? i12 != 4 ? 131072 : 26214400 : zJ ? 19660800 : 131072000;
                        }
                    }
                    i10 += i11;
                }
                i4++;
            }
            iIntValue = Math.max(13107200, i10);
        }
        rs1Var.f15749c = iIntValue;
        i();
    }

    @Override // com.google.android.gms.internal.ads.pt1
    public final i h(cv1 cv1Var) {
        return new av0(this, cv1Var);
    }

    public final void i() {
        androidx.datastore.preferences.protobuf.k kVar = this.f16533c;
        ConcurrentHashMap concurrentHashMap = this.f16542n;
        int i4 = 0;
        if (concurrentHashMap.isEmpty()) {
            synchronized (kVar) {
                kVar.g0(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i4 += ((rs1) it.next()).f15749c;
            }
            kVar.g0(i4);
        }
    }

    public final boolean j(ot1 ot1Var) {
        uh uhVar = ot1Var.f14795b;
        o2 o2Var = uhVar.b(uhVar.o(ot1Var.f14796c.f12875a, this.f16532b).f16811c, this.f16531a, 0L).f11165b.f11706b;
        if (o2Var == null) {
            return false;
        }
        String scheme = o2Var.f14513a.getScheme();
        return TextUtils.isEmpty(scheme) || f16530p.contains(scheme);
    }
}
