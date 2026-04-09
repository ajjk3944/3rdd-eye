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
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641Ng implements InterfaceC1958uK, CO {

    /* renamed from: I, reason: collision with root package name */
    public static final AtomicInteger f10012I = new AtomicInteger(0);

    /* renamed from: J, reason: collision with root package name */
    public static final AtomicInteger f10013J = new AtomicInteger(0);

    /* renamed from: C, reason: collision with root package name */
    public final int f10014C;

    /* renamed from: E, reason: collision with root package name */
    public Integer f10016E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f10017F;

    /* renamed from: G, reason: collision with root package name */
    public volatile C0590Kg f10018G;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10020a;

    /* renamed from: b, reason: collision with root package name */
    public final C0573Jg f10021b;

    /* renamed from: c, reason: collision with root package name */
    public final C0911b f10022c;

    /* renamed from: d, reason: collision with root package name */
    public final C1272hg f10023d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f10024e;

    /* renamed from: f, reason: collision with root package name */
    public final C1728q5 f10025f;

    /* renamed from: g, reason: collision with root package name */
    public C2232zO f10026g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f10027h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1000cg f10028j;

    /* renamed from: k, reason: collision with root package name */
    public int f10029k;

    /* renamed from: l, reason: collision with root package name */
    public int f10030l;

    /* renamed from: m, reason: collision with root package name */
    public long f10031m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10032n;

    /* renamed from: D, reason: collision with root package name */
    public final Object f10015D = new Object();

    /* renamed from: H, reason: collision with root package name */
    public final HashSet f10019H = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0641Ng(android.content.Context r6, com.google.android.gms.internal.ads.C1272hg r7, com.google.android.gms.internal.ads.InterfaceC0828Yg r8, java.lang.Integer r9) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0641Ng.<init>(android.content.Context, com.google.android.gms.internal.ads.hg, com.google.android.gms.internal.ads.Yg, java.lang.Integer):void");
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final /* synthetic */ void a(int i) {
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void b(int i) {
        this.f10030l += i;
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final /* synthetic */ void c(BN bn) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC1958uK
    public final void d(AbstractC2003vB abstractC2003vB, TE te, boolean z6) {
        if (abstractC2003vB instanceof InterfaceC1742qJ) {
            synchronized (this.f10015D) {
                this.f10017F.add((InterfaceC1742qJ) abstractC2003vB);
            }
        } else if (abstractC2003vB instanceof C0590Kg) {
            this.f10018G = (C0590Kg) abstractC2003vB;
            InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f10024e.get();
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8792n2)).booleanValue() && interfaceC0828Yg != null && this.f10018G.f9497C) {
                HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f10018G.f9499E));
                map.put("gcacheDownloaded", String.valueOf(this.f10018G.f9500F));
                C2911G.f23576l.post(new CD(interfaceC0828Yg, 14, map));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void e(HN hn) {
        InterfaceC1000cg interfaceC1000cg = this.f10028j;
        if (interfaceC1000cg != null) {
            interfaceC1000cg.w("onPlayerError", hn);
        }
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void f(int i) {
        InterfaceC1000cg interfaceC1000cg = this.f10028j;
        if (interfaceC1000cg != null) {
            interfaceC1000cg.U(i);
        }
    }

    public final void finalize() {
        f10012I.decrementAndGet();
        if (AbstractC2907C.o()) {
            AbstractC2907C.m("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1958uK
    public final void g(TE te, boolean z6, int i) {
        this.f10029k += i;
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final /* synthetic */ void h(BO bo, C1587nQ c1587nQ) {
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final /* synthetic */ void i(VL vl, Vu vu) {
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void j(C1161fd c1161fd) {
        InterfaceC1000cg interfaceC1000cg = this.f10028j;
        if (interfaceC1000cg != null) {
            interfaceC1000cg.v(c1161fd.f14103a, c1161fd.f14104b);
        }
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void k(TP tp) {
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f10024e.get();
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8792n2)).booleanValue() || interfaceC0828Yg == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = tp.f11396l;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = tp.f11397m;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = tp.f11394j;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        interfaceC0828Yg.a("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void l(TP tp) {
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f10024e.get();
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8792n2)).booleanValue() || interfaceC0828Yg == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(tp.f11408x));
        map.put("bitRate", String.valueOf(tp.i));
        int i = tp.f11404t;
        int i3 = tp.f11405u;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i3).length());
        sb.append(i);
        sb.append("x");
        sb.append(i3);
        map.put("resolution", sb.toString());
        String str = tp.f11396l;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = tp.f11397m;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = tp.f11394j;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        interfaceC0828Yg.a("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final /* synthetic */ void n(BO bo, int i, long j6) {
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void o(IOException iOException) {
        InterfaceC1000cg interfaceC1000cg = this.f10028j;
        if (interfaceC1000cg != null) {
            if (this.f10023d.f14527j) {
                interfaceC1000cg.x(iOException);
            } else {
                interfaceC1000cg.w("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.CO
    public final void p() {
        InterfaceC1000cg interfaceC1000cg = this.f10028j;
        if (interfaceC1000cg != null) {
            interfaceC1000cg.t();
        }
    }

    public final long q() {
        if (this.f10018G != null && this.f10018G.f9498D && this.f10018G.f9499E) {
            return Math.min(this.f10029k, this.f10018G.f9501G);
        }
        return 0L;
    }

    public final long r() {
        if (this.f10018G != null && this.f10018G.f9498D) {
            return this.f10018G.k();
        }
        synchronized (this.f10015D) {
            while (true) {
                ArrayList arrayList = this.f10017F;
                if (!arrayList.isEmpty()) {
                    long j6 = this.f10031m;
                    Map mapH = ((InterfaceC1742qJ) arrayList.remove(0)).h();
                    long j7 = 0;
                    if (mapH != null) {
                        Iterator it = mapH.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && AbstractC0582Jp.Z("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j7 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.f10031m = j6 + j7;
                }
            }
        }
        return this.f10031m;
    }

    public final void s(boolean z6) {
        C0884aR c0884aR;
        if (this.f10026g == null) {
            return;
        }
        int i = 0;
        while (true) {
            C2232zO c2232zO = this.f10026g;
            c2232zO.f17873d.d();
            UN un = c2232zO.f17872c;
            un.A0();
            int length = un.f11679h.length;
            if (i >= 2) {
                return;
            }
            C0911b c0911b = this.f10022c;
            synchronized (c0911b.f13272c) {
                c0884aR = c0911b.f13274e;
            }
            c0884aR.getClass();
            ZQ zq = new ZQ(c0884aR);
            boolean z7 = !z6;
            SparseBooleanArray sparseBooleanArray = zq.f12898E;
            if (sparseBooleanArray.get(i) != z7) {
                if (z6) {
                    sparseBooleanArray.delete(i);
                } else {
                    sparseBooleanArray.put(i, true);
                }
            }
            c0911b.d(zq);
            i++;
        }
    }

    public final JQ t(Uri uri) {
        JB jb = LB.f9635b;
        C1197gC c1197gC = C1197gC.f14227e;
        List list = Collections.EMPTY_LIST;
        C1197gC c1197gC2 = C1197gC.f14227e;
        C1993v1 c1993v1 = C1993v1.f17203a;
        C1241h2 c1241h2 = new C1241h2("", new G(), uri != null ? new N0(uri, c1197gC2) : null, new C2154y0(), C1348j3.f14865B);
        int i = this.f10023d.f14524f;
        C1728q5 c1728q5 = this.f10025f;
        c1728q5.f16317a = i;
        c1241h2.f14415b.getClass();
        return new JQ(c1241h2, (KD) c1728q5.f16318b, (C2255zu) c1728q5.f16319c, (C1994v2) c1728q5.f16320d, c1728q5.f16317a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.net.Uri[] r10, java.nio.ByteBuffer r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0641Ng.u(android.net.Uri[], java.nio.ByteBuffer, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1958uK
    public final void m(TE te, boolean z6) {
    }
}
