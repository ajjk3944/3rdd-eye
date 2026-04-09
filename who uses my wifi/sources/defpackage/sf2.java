package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.SparseBooleanArray;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sf2 implements ws3, bd4 {
    public final Context f;
    public final mf2 g;
    public final lj4 h;
    public final je2 i;
    public final WeakReference j;
    public final r2 k;
    public mc4 l;
    public ByteBuffer m;
    public boolean n;
    public fe2 o;
    public int p;
    public int q;
    public long r;
    public final String s;
    public final int t;
    public Integer v;
    public final ArrayList w;
    public volatile nf2 x;
    public static final AtomicInteger z = new AtomicInteger(0);
    public static final AtomicInteger A = new AtomicInteger(0);
    public final Object u = new Object();
    public final HashSet y = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sf2(android.content.Context r5, defpackage.je2 r6, defpackage.ag2 r7, java.lang.Integer r8) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf2.<init>(android.content.Context, je2, ag2, java.lang.Integer):void");
    }

    @Override // defpackage.bd4
    public final void a(int i) {
        this.q += i;
    }

    @Override // defpackage.bd4
    public final void d(int i) {
        fe2 fe2Var = this.o;
        if (fe2Var != null) {
            fe2Var.f0(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ws3
    public final void e(zd3 zd3Var, ij3 ij3Var, boolean z2) {
        if (zd3Var instanceof fq3) {
            synchronized (this.u) {
                this.w.add((fq3) zd3Var);
            }
        } else if (zd3Var instanceof nf2) {
            this.x = (nf2) zd3Var;
            ag2 ag2Var = (ag2) this.j.get();
            if (((Boolean) tw1.e.c.a(mz1.Y1)).booleanValue() && ag2Var != null && this.x.t) {
                HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.x.v));
                map.put("gcacheDownloaded", String.valueOf(this.x.w));
                lf4.l.post(new n62(ag2Var, map, 9));
            }
        }
    }

    @Override // defpackage.ws3
    public final void f(ij3 ij3Var, boolean z2, int i) {
        this.p += i;
    }

    public final void finalize() {
        z.decrementAndGet();
        if (gi2.R()) {
            gi2.G("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // defpackage.bd4
    public final void g(ph4 ph4Var) {
        ag2 ag2Var = (ag2) this.j.get();
        if (!((Boolean) tw1.e.c.a(mz1.Y1)).booleanValue() || ag2Var == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = ph4Var.l;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = ph4Var.m;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = ph4Var.j;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        ag2Var.a("onMetadataEvent", map);
    }

    @Override // defpackage.bd4
    public final void j(b84 b84Var) {
        fe2 fe2Var = this.o;
        if (fe2Var != null) {
            fe2Var.x("onPlayerError", b84Var);
        }
    }

    @Override // defpackage.bd4
    public final void k(t82 t82Var) {
        fe2 fe2Var = this.o;
        if (fe2Var != null) {
            fe2Var.w(t82Var.a, t82Var.b);
        }
    }

    @Override // defpackage.bd4
    public final void l(ph4 ph4Var) {
        ag2 ag2Var = (ag2) this.j.get();
        if (!((Boolean) tw1.e.c.a(mz1.Y1)).booleanValue() || ag2Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(ph4Var.x));
        map.put("bitRate", String.valueOf(ph4Var.i));
        int i = ph4Var.t;
        int i2 = ph4Var.u;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        map.put("resolution", sb.toString());
        String str = ph4Var.l;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = ph4Var.m;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = ph4Var.j;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        ag2Var.a("onMetadataEvent", map);
    }

    @Override // defpackage.bd4
    public final void o(IOException iOException) {
        fe2 fe2Var = this.o;
        if (fe2Var != null) {
            if (this.i.j) {
                fe2Var.u(iOException);
            } else {
                fe2Var.x("onLoadError", iOException);
            }
        }
    }

    @Override // defpackage.bd4
    public final void p() {
        fe2 fe2Var = this.o;
        if (fe2Var != null) {
            fe2Var.t();
        }
    }

    public final long q() {
        if (this.x != null && this.x.u && this.x.v) {
            return Math.min(this.p, this.x.x);
        }
        return 0L;
    }

    public final long r() {
        if (this.x != null && this.x.u) {
            nf2 nf2Var = this.x;
            if (nf2Var.s != null) {
                AtomicLong atomicLong = nf2Var.z;
                if (atomicLong.get() != -1) {
                    return atomicLong.get();
                }
                synchronized (nf2Var) {
                    try {
                        if (nf2Var.y == null) {
                            nf2Var.y = md2.a.c(new xs1(4, nf2Var));
                        }
                    } finally {
                    }
                }
                if (nf2Var.y.isDone()) {
                    try {
                        nf2Var.z.compareAndSet(-1L, ((Long) nf2Var.y.get()).longValue());
                        return nf2Var.z.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.u) {
            while (true) {
                ArrayList arrayList = this.w;
                if (!arrayList.isEmpty()) {
                    long j = this.r;
                    Map mapG = ((fq3) arrayList.remove(0)).g();
                    long j2 = 0;
                    if (mapG != null) {
                        Iterator it = mapG.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && um.L("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.r = j + j2;
                }
            }
        }
        return this.r;
    }

    public final void s(boolean z2) {
        dj4 dj4Var;
        boolean zEquals;
        if (this.l == null) {
            return;
        }
        int i = 0;
        while (true) {
            mc4 mc4Var = this.l;
            mc4Var.j.b();
            ya4 ya4Var = mc4Var.i;
            ya4Var.j2();
            int length = ya4Var.n.length;
            if (i >= 2) {
                return;
            }
            lj4 lj4Var = this.h;
            synchronized (lj4Var.c) {
                dj4Var = lj4Var.e;
            }
            dj4Var.getClass();
            cj4 cj4Var = new cj4(dj4Var);
            boolean z3 = !z2;
            SparseBooleanArray sparseBooleanArray = cj4Var.E;
            if (sparseBooleanArray.get(i) != z3) {
                if (z2) {
                    sparseBooleanArray.delete(i);
                } else {
                    sparseBooleanArray.put(i, true);
                }
            }
            dj4 dj4Var2 = new dj4(cj4Var);
            synchronized (lj4Var.c) {
                zEquals = lj4Var.e.equals(dj4Var2);
                lj4Var.e = dj4Var2;
            }
            if (!zEquals) {
                if (dj4Var2.A && lj4Var.d == null) {
                    a30.x("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                jb4 jb4Var = lj4Var.a;
                if (jb4Var != null) {
                    jb4Var.m.b(10);
                }
            }
            i++;
        }
    }

    public final hi4 t(Uri uri) {
        vm3 vm3Var = xm3.g;
        sn3 sn3Var = sn3.j;
        List list = Collections.EMPTY_LIST;
        sn3 sn3Var2 = sn3.j;
        zi1 zi1Var = zi1.a;
        fk1 fk1Var = new fk1("", new se1(), uri != null ? new kh1(uri, sn3Var2) : null, new qg1(), rm1.B);
        int i = this.i.f;
        r2 r2Var = this.k;
        r2Var.g = i;
        fk1Var.b.getClass();
        return new hi4(fk1Var, (hh3) r2Var.h, (yf3) r2Var.i, (hd4) r2Var.j, r2Var.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.net.Uri[] r19, java.nio.ByteBuffer r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf2.u(android.net.Uri[], java.nio.ByteBuffer, boolean):void");
    }

    @Override // defpackage.ws3
    public final void c(ij3 ij3Var, boolean z2) {
    }
}
