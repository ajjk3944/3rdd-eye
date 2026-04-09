package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w54 implements lb4 {
    public static final sn3 p;
    public final ez1 a;
    public final sw1 b;
    public final vj4 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final xn3 m;
    public final ConcurrentHashMap n;
    public long o;

    static {
        vm3 vm3Var = xm3.g;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        wl2.G(objArr, 6);
        p = xm3.o(objArr, 6);
    }

    public w54() {
        vj4 vj4Var = new vj4();
        l(1000, 0, "bufferForPlaybackMs", "0");
        l(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        l(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        l(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        l(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        l(50000, 50000, "maxBufferMs", "minBufferMs");
        l(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        l(0, 0, "backBufferDurationMs", "0");
        this.a = new ez1();
        this.b = new sw1();
        this.c = vj4Var;
        long jR = v23.r(50000L);
        this.d = jR;
        long jR2 = v23.r(1000L);
        this.e = jR2;
        this.f = jR;
        this.g = jR;
        this.h = jR2;
        this.i = jR2;
        this.j = v23.r(2000L);
        this.k = jR2;
        this.l = v23.r(0L);
        this.n = new ConcurrentHashMap();
        this.m = xn3.a(xn3.l);
        this.o = -1L;
    }

    public static void l(int i, int i2, String str, String str2) {
        if (i < i2) {
            throw new IllegalArgumentException(qb1.J("%s cannot be less than %s", str, str2));
        }
    }

    @Override // defpackage.lb4
    public final boolean a(kb4 kb4Var) {
        int i;
        ConcurrentHashMap concurrentHashMap = this.n;
        xd4 xd4Var = kb4Var.a;
        i54 i54Var = (i54) concurrentHashMap.get(xd4Var);
        i54Var.getClass();
        i54 i54Var2 = (i54) this.n.get(xd4Var);
        i54Var2.getClass();
        synchronized (i54Var2) {
            i = i54Var2.d;
        }
        int i2 = i * 65536;
        i54 i54Var3 = (i54) this.n.get(xd4Var);
        i54Var3.getClass();
        int i3 = i54Var3.c;
        if (xd4Var.equals(xd4.d)) {
            return i2 < i3;
        }
        boolean zK = k(kb4Var);
        long jMin = zK ? this.e : this.d;
        long j = zK ? this.g : this.f;
        float f = kb4Var.e;
        if (f > 1.0f) {
            jMin = Math.min(v23.v(jMin, f), j);
        }
        long j2 = kb4Var.d;
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = zK || i2 < i3;
            i54Var.b = z;
            if (!z && j2 < 500000) {
                a30.x("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || i2 >= i3) {
            i54Var.b = false;
        }
        return i54Var.b;
    }

    @Override // defpackage.lb4
    public final void b(kb4 kb4Var, nj4[] nj4VarArr) {
        xd4 xd4Var = kb4Var.a;
        Integer num = (Integer) this.m.get(xd4Var.a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        i54 i54Var = (i54) this.n.get(xd4Var);
        i54Var.getClass();
        if (iIntValue == -1) {
            boolean zK = k(kb4Var);
            int length = nj4VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i >= length) {
                    break;
                }
                nj4 nj4Var = nj4VarArr[i];
                if (nj4Var != null) {
                    int i4 = nj4Var.a().c;
                    if (i4 != -1) {
                        if (i4 == 0) {
                            i3 = 144310272;
                        } else if (i4 != 1) {
                            i3 = i4 != 2 ? i4 != 4 ? 131072 : 26214400 : zK ? 19660800 : 131072000;
                        }
                    }
                    i2 += i3;
                }
                i++;
            }
            iIntValue = Math.max(13107200, i2);
        }
        i54Var.c = iIntValue;
        j();
    }

    @Override // defpackage.lb4
    public final long c() {
        return this.l;
    }

    @Override // defpackage.lb4
    public final void d(xd4 xd4Var) {
        long id = Thread.currentThread().getId();
        long j = this.o;
        zt0.c0("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.o = id;
        ConcurrentHashMap concurrentHashMap = this.n;
        i54 i54Var = (i54) concurrentHashMap.get(xd4Var);
        if (i54Var == null) {
            i54 i54Var2 = new i54();
            i54Var2.a = 1;
            concurrentHashMap.put(xd4Var, i54Var2);
        } else {
            i54Var.a++;
        }
        i54 i54Var3 = (i54) concurrentHashMap.get(xd4Var);
        i54Var3.getClass();
        Integer num = (Integer) this.m.get(xd4Var.a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        i54Var3.c = iIntValue;
        i54Var3.b = false;
    }

    @Override // defpackage.lb4
    public final void e(xd4 xd4Var) {
        ConcurrentHashMap concurrentHashMap = this.n;
        i54 i54Var = (i54) concurrentHashMap.get(xd4Var);
        if (i54Var != null) {
            int i = i54Var.a - 1;
            i54Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(xd4Var);
                j();
            }
        }
    }

    @Override // defpackage.lb4
    public final boolean f(kb4 kb4Var) {
        long jMin;
        boolean z;
        int i;
        boolean z2 = kb4Var.f;
        long j = kb4Var.d;
        float f = kb4Var.e;
        boolean zK = k(kb4Var);
        long jW = v23.w(j, f);
        if (z2) {
            if (zK) {
                jMin = this.k;
                z = true;
            } else {
                jMin = this.j;
                z = false;
            }
        } else if (zK) {
            jMin = this.i;
            z = true;
        } else {
            jMin = this.h;
            z = false;
        }
        long j2 = kb4Var.g;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin > 0 && jW < jMin) {
            if (!z) {
                xd4 xd4Var = kb4Var.a;
                i54 i54Var = (i54) this.n.get(xd4Var);
                i54Var.getClass();
                synchronized (i54Var) {
                    i = i54Var.d;
                }
                int i2 = i * 65536;
                i54 i54Var2 = (i54) this.n.get(xd4Var);
                i54Var2.getClass();
                if (i2 >= i54Var2.c) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.lb4
    public final boolean g() {
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            if (((i54) it.next()).b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.lb4
    public final void h(xd4 xd4Var) {
        ConcurrentHashMap concurrentHashMap = this.n;
        i54 i54Var = (i54) concurrentHashMap.get(xd4Var);
        if (i54Var != null) {
            int i = i54Var.a - 1;
            i54Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(xd4Var);
                j();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.o = -1L;
        }
    }

    @Override // defpackage.lb4
    public final rj4 i(xd4 xd4Var) {
        return new pb3(this, xd4Var);
    }

    public final void j() {
        vj4 vj4Var = this.c;
        ConcurrentHashMap concurrentHashMap = this.n;
        int i = 0;
        if (concurrentHashMap.isEmpty()) {
            synchronized (vj4Var) {
                vj4Var.c(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += ((i54) it.next()).c;
            }
            vj4Var.c(i);
        }
    }

    public final boolean k(kb4 kb4Var) {
        oz1 oz1Var = kb4Var.b;
        kh1 kh1Var = oz1Var.b(oz1Var.o(kb4Var.c.a, this.b).c, this.a, 0L).b.b;
        if (kh1Var == null) {
            return false;
        }
        String scheme = kh1Var.a.getScheme();
        return TextUtils.isEmpty(scheme) || p.contains(scheme);
    }
}
