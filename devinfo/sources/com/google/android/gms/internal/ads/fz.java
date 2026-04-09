package com.google.android.gms.internal.ads;

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
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fz implements hm1, ru1 {

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicInteger f11292u = new AtomicInteger(0);

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicInteger f11293v = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f11294a;

    /* renamed from: b, reason: collision with root package name */
    public final bz f11295b;

    /* renamed from: c, reason: collision with root package name */
    public final b f11296c;

    /* renamed from: d, reason: collision with root package name */
    public final yx f11297d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f11298e;

    /* renamed from: f, reason: collision with root package name */
    public final wb f11299f;
    public ou1 g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f11300h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11301i;
    public tx j;

    /* renamed from: k, reason: collision with root package name */
    public int f11302k;

    /* renamed from: l, reason: collision with root package name */
    public int f11303l;

    /* renamed from: m, reason: collision with root package name */
    public long f11304m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11305n;

    /* renamed from: o, reason: collision with root package name */
    public final int f11306o;

    /* renamed from: q, reason: collision with root package name */
    public Integer f11308q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f11309r;

    /* renamed from: s, reason: collision with root package name */
    public volatile cz f11310s;

    /* renamed from: p, reason: collision with root package name */
    public final Object f11307p = new Object();

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f11311t = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fz(android.content.Context r6, com.google.android.gms.internal.ads.yx r7, com.google.android.gms.internal.ads.qz r8, java.lang.Integer r9) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz.<init>(android.content.Context, com.google.android.gms.internal.ads.yx, com.google.android.gms.internal.ads.qz, java.lang.Integer):void");
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void H1() {
        tx txVar = this.j;
        if (txVar != null) {
            txVar.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void b(int i4) {
        this.f11303l += i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.hm1
    public final void d(h41 h41Var, gb1 gb1Var, boolean z3) {
        if (h41Var instanceof dk1) {
            synchronized (this.f11307p) {
                this.f11309r.add((dk1) h41Var);
            }
        } else if (h41Var instanceof cz) {
            this.f11310s = (cz) h41Var;
            qz qzVar = (qz) this.f11298e.get();
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue() && qzVar != null && this.f11310s.f10271o) {
                HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f11310s.f10273q));
                map.put("gcacheDownloaded", String.valueOf(this.f11310s.f10274r));
                ya.f0.f37440l.post(new q81(13, qzVar, map));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void e(us1 us1Var) {
        tx txVar = this.j;
        if (txVar != null) {
            txVar.l("onPlayerError", us1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void f(int i4) {
        tx txVar = this.j;
        if (txVar != null) {
            txVar.F(i4);
        }
    }

    public final void finalize() {
        f11292u.decrementAndGet();
        if (ya.a0.o()) {
            ya.a0.m("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.hm1
    public final void g(gb1 gb1Var, boolean z3, int i4) {
        this.f11302k += i4;
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void i(vr vrVar) {
        tx txVar = this.j;
        if (txVar != null) {
            txVar.k(vrVar.f17693a, vrVar.f17694b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void j(mx1 mx1Var) {
        qz qzVar = (qz) this.f11298e.get();
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue() || qzVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = mx1Var.f14051l;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = mx1Var.f14052m;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = mx1Var.j;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        qzVar.a("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void l(mx1 mx1Var) {
        qz qzVar = (qz) this.f11298e.get();
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue() || qzVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(mx1Var.f14063x));
        map.put("bitRate", String.valueOf(mx1Var.f14049i));
        int i4 = mx1Var.f14059t;
        int i10 = mx1Var.f14060u;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 1 + String.valueOf(i10).length());
        sb2.append(i4);
        sb2.append("x");
        sb2.append(i10);
        map.put("resolution", sb2.toString());
        String str = mx1Var.f14051l;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = mx1Var.f14052m;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = mx1Var.j;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        qzVar.a("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final void o(IOException iOException) {
        tx txVar = this.j;
        if (txVar != null) {
            if (this.f11297d.j) {
                txVar.m(iOException);
            } else {
                txVar.l("onLoadError", iOException);
            }
        }
    }

    public final long p() {
        if (this.f11310s != null && this.f11310s.f10272p && this.f11310s.f10273q) {
            return Math.min(this.f11302k, this.f11310s.f10275s);
        }
        return 0L;
    }

    public final long q() {
        if (this.f11310s != null && this.f11310s.f10272p) {
            return this.f11310s.i();
        }
        synchronized (this.f11307p) {
            while (true) {
                ArrayList arrayList = this.f11309r;
                if (!arrayList.isEmpty()) {
                    long j = this.f11304m;
                    Map mapA1 = ((dk1) arrayList.remove(0)).A1();
                    long j8 = 0;
                    if (mapA1 != null) {
                        Iterator it = mapA1.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && mq0.X("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j8 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f11304m = j + j8;
                }
            }
        }
        return this.f11304m;
    }

    public final void r(boolean z3) {
        wz1 wz1Var;
        if (this.g == null) {
            return;
        }
        int i4 = 0;
        while (true) {
            ou1 ou1Var = this.g;
            ou1Var.f14807d.d();
            it1 it1Var = ou1Var.f14806c;
            it1Var.o0();
            int length = it1Var.f12455h.length;
            if (i4 >= 2) {
                return;
            }
            b bVar = this.f11296c;
            synchronized (bVar.f9508c) {
                wz1Var = bVar.f9510e;
            }
            wz1Var.getClass();
            vz1 vz1Var = new vz1(wz1Var);
            boolean z10 = !z3;
            SparseBooleanArray sparseBooleanArray = vz1Var.E;
            if (sparseBooleanArray.get(i4) != z10) {
                if (z3) {
                    sparseBooleanArray.delete(i4);
                } else {
                    sparseBooleanArray.put(i4, true);
                }
            }
            bVar.d(vz1Var);
            i4++;
        }
    }

    public final ez1 s(Uri uri) {
        v41 v41Var = x41.f18307b;
        u51 u51Var = u51.f17096e;
        List list = Collections.EMPTY_LIST;
        u51 u51Var2 = u51.f17096e;
        w3 w3Var = w3.f17852a;
        h5 h5Var = new h5("", new g0(), uri != null ? new o2(uri, u51Var2) : null, new a2(), j7.B);
        int i4 = this.f11297d.f18918f;
        wb wbVar = this.f11299f;
        wbVar.f17957a = i4;
        h5Var.f11706b.getClass();
        return new ez1(h5Var, (y81) wbVar.f17958b, (dz1) wbVar.f17959c, (w5) wbVar.f17960d, wbVar.f17957a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.net.Uri[] r10, java.nio.ByteBuffer r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz.t(android.net.Uri[], java.nio.ByteBuffer, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ void a(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ void c(os1 os1Var) {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ void h(hp1 hp1Var, rt rtVar) {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ void k(qu1 qu1Var, a0.c0 c0Var) {
    }

    @Override // com.google.android.gms.internal.ads.hm1
    public final void n(gb1 gb1Var, boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.ru1
    public final /* synthetic */ void m(qu1 qu1Var, int i4, long j) {
    }
}
