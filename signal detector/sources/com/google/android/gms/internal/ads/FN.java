package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class FN implements InterfaceC0936bO {

    /* renamed from: p, reason: collision with root package name */
    public static final C1197gC f8097p;

    /* renamed from: a, reason: collision with root package name */
    public final U7 f8098a;

    /* renamed from: b, reason: collision with root package name */
    public final I7 f8099b;

    /* renamed from: c, reason: collision with root package name */
    public final C1506m f8100c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8101d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8102e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8103f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8104g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8105h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8106j;

    /* renamed from: k, reason: collision with root package name */
    public final long f8107k;

    /* renamed from: l, reason: collision with root package name */
    public final long f8108l;

    /* renamed from: m, reason: collision with root package name */
    public final C1465lC f8109m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f8110n;

    /* renamed from: o, reason: collision with root package name */
    public long f8111o;

    static {
        JB jb = LB.f9635b;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        AbstractC1984ut.k(6, objArr);
        f8097p = LB.o(6, objArr);
    }

    public FN() {
        C1506m c1506m = new C1506m(0);
        l(TTAdConstant.STYLE_SIZE_RADIO_1_1, 0, "bufferForPlaybackMs", "0");
        l(TTAdConstant.STYLE_SIZE_RADIO_1_1, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        l(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(TTAdConstant.STYLE_SIZE_RADIO_1_1, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        l(50000, TTAdConstant.STYLE_SIZE_RADIO_1_1, "minBufferMs", "bufferForPlaybackMs");
        l(TTAdConstant.STYLE_SIZE_RADIO_1_1, TTAdConstant.STYLE_SIZE_RADIO_1_1, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        l(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(TTAdConstant.STYLE_SIZE_RADIO_1_1, TTAdConstant.STYLE_SIZE_RADIO_1_1, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        l(50000, 50000, "maxBufferMs", "minBufferMs");
        l(50000, TTAdConstant.STYLE_SIZE_RADIO_1_1, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        l(0, 0, "backBufferDurationMs", "0");
        this.f8098a = new U7();
        this.f8099b = new I7();
        this.f8100c = c1506m;
        long jS = Vt.s(50000L);
        this.f8101d = jS;
        long jS2 = Vt.s(1000L);
        this.f8102e = jS2;
        this.f8103f = jS;
        this.f8104g = jS;
        this.f8105h = jS2;
        this.i = jS2;
        this.f8106j = Vt.s(2000L);
        this.f8107k = jS2;
        this.f8108l = Vt.s(0L);
        this.f8110n = new ConcurrentHashMap();
        this.f8109m = C1465lC.a(C1465lC.f15361g);
        this.f8111o = -1L;
    }

    public static void l(int i, int i3, String str, String str2) {
        if (!(i >= i3)) {
            throw new IllegalArgumentException(Cr.E("%s cannot be less than %s", str, str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final void a(MO mo) {
        long id = Thread.currentThread().getId();
        long j6 = this.f8111o;
        AbstractC0582Jp.i0("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j6 == -1 || j6 == id);
        this.f8111o = id;
        ConcurrentHashMap concurrentHashMap = this.f8110n;
        EN en = (EN) concurrentHashMap.get(mo);
        if (en == null) {
            EN en2 = new EN();
            en2.f7945a = 1;
            concurrentHashMap.put(mo, en2);
        } else {
            en.f7945a++;
        }
        EN en3 = (EN) concurrentHashMap.get(mo);
        en3.getClass();
        Integer num = (Integer) this.f8109m.get(mo.f9874a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        en3.f7947c = iIntValue;
        en3.f7946b = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final void b(MO mo) {
        ConcurrentHashMap concurrentHashMap = this.f8110n;
        EN en = (EN) concurrentHashMap.get(mo);
        if (en != null) {
            int i = en.f7945a - 1;
            en.f7945a = i;
            if (i == 0) {
                concurrentHashMap.remove(mo);
                j();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.f8111o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final boolean c(C0881aO c0881aO) {
        long jMin;
        boolean z6;
        int i;
        boolean z7 = c0881aO.f13119f;
        long jRound = c0881aO.f13117d;
        float f2 = c0881aO.f13118e;
        boolean zK = k(c0881aO);
        String str = Vt.f12096a;
        if (f2 != 1.0f) {
            jRound = Math.round(jRound / f2);
        }
        if (z7) {
            if (zK) {
                jMin = this.f8107k;
                z6 = true;
            } else {
                jMin = this.f8106j;
                z6 = false;
            }
        } else if (zK) {
            jMin = this.i;
            z6 = true;
        } else {
            jMin = this.f8105h;
            z6 = false;
        }
        long j6 = c0881aO.f13120g;
        if (j6 != -9223372036854775807L) {
            jMin = Math.min(j6 / 2, jMin);
        }
        if (jMin > 0 && jRound < jMin) {
            if (!z6) {
                MO mo = c0881aO.f13114a;
                EN en = (EN) this.f8110n.get(mo);
                en.getClass();
                synchronized (en) {
                    i = en.f7948d;
                }
                int i3 = i * 65536;
                EN en2 = (EN) this.f8110n.get(mo);
                en2.getClass();
                if (i3 >= en2.f7947c) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final long d() {
        return this.f8108l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final void e(MO mo) {
        ConcurrentHashMap concurrentHashMap = this.f8110n;
        EN en = (EN) concurrentHashMap.get(mo);
        if (en != null) {
            int i = en.f7945a - 1;
            en.f7945a = i;
            if (i == 0) {
                concurrentHashMap.remove(mo);
                j();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final boolean f(C0881aO c0881aO) {
        int i;
        ConcurrentHashMap concurrentHashMap = this.f8110n;
        MO mo = c0881aO.f13114a;
        EN en = (EN) concurrentHashMap.get(mo);
        en.getClass();
        EN en2 = (EN) this.f8110n.get(mo);
        en2.getClass();
        synchronized (en2) {
            i = en2.f7948d;
        }
        int i3 = i * 65536;
        EN en3 = (EN) this.f8110n.get(mo);
        en3.getClass();
        int i6 = en3.f7947c;
        if (mo.equals(MO.f9873c)) {
            return i3 < i6;
        }
        boolean zK = k(c0881aO);
        long jMin = zK ? this.f8102e : this.f8101d;
        long j6 = zK ? this.f8104g : this.f8103f;
        float f2 = c0881aO.f13118e;
        if (f2 > 1.0f) {
            jMin = Math.min(Vt.w(jMin, f2), j6);
        }
        long j7 = c0881aO.f13117d;
        if (j7 < Math.max(jMin, 500000L)) {
            boolean z6 = zK || i3 < i6;
            en.f7946b = z6;
            if (!z6 && j7 < 500000) {
                AbstractC2022vd.v("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j7 >= j6 || i3 >= i6) {
            en.f7946b = false;
        }
        return en.f7946b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final void g(C0881aO c0881aO, InterfaceC1020d[] interfaceC1020dArr) {
        MO mo = c0881aO.f13114a;
        Integer num = (Integer) this.f8109m.get(mo.f9874a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        EN en = (EN) this.f8110n.get(mo);
        en.getClass();
        if (iIntValue == -1) {
            boolean zK = k(c0881aO);
            int length = interfaceC1020dArr.length;
            int i = 0;
            int i3 = 0;
            while (true) {
                int i6 = 13107200;
                if (i >= length) {
                    break;
                }
                InterfaceC1020d interfaceC1020d = interfaceC1020dArr[i];
                if (interfaceC1020d != null) {
                    int i7 = interfaceC1020d.a().f17548c;
                    if (i7 != -1) {
                        if (i7 == 0) {
                            i6 = 144310272;
                        } else if (i7 != 1) {
                            i6 = i7 != 2 ? i7 != 4 ? 131072 : 26214400 : zK ? 19660800 : 131072000;
                        }
                    }
                    i3 += i6;
                }
                i++;
            }
            iIntValue = Math.max(13107200, i3);
        }
        en.f7947c = iIntValue;
        j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final boolean h() {
        Iterator it = this.f8110n.values().iterator();
        while (it.hasNext()) {
            if (((EN) it.next()).f7946b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0936bO
    public final InterfaceC1292i i(MO mo) {
        return new C2041vw(this, mo);
    }

    public final void j() {
        C1506m c1506m = this.f8100c;
        ConcurrentHashMap concurrentHashMap = this.f8110n;
        int i = 0;
        if (concurrentHashMap.isEmpty()) {
            synchronized (c1506m) {
                c1506m.D(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += ((EN) it.next()).f7947c;
            }
            c1506m.D(i);
        }
    }

    public final boolean k(C0881aO c0881aO) {
        AbstractC1353j8 abstractC1353j8 = c0881aO.f13115b;
        N0 n02 = abstractC1353j8.b(abstractC1353j8.o(c0881aO.f13116c.f16374a, this.f8099b).f9072c, this.f8098a, 0L).f11604b.f14415b;
        if (n02 == null) {
            return false;
        }
        String scheme = n02.f9935a.getScheme();
        return TextUtils.isEmpty(scheme) || f8097p.contains(scheme);
    }
}
