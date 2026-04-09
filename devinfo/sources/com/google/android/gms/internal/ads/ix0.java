package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ix0 implements q21, ra, pb.c, hx, bb.e, p81, c80, m00, qg0 {

    /* renamed from: c, reason: collision with root package name */
    public static ix0 f12498c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f12499d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static ix0 f12500e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12501a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12502b;

    public /* synthetic */ ix0(int i4, Object obj) {
        this.f12501a = i4;
        this.f12502b = obj;
    }

    public static final ix0 d(Context context) {
        ix0 ix0Var;
        synchronized (ix0.class) {
            try {
                if (f12498c == null) {
                    f12498c = new ix0(context);
                }
                ix0Var = f12498c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ix0Var;
    }

    private final void q(Object obj) {
        dq0 dq0Var = (dq0) obj;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.W6)).booleanValue()) {
            bg0 bg0Var = (bg0) this.f12502b;
            yp0 yp0Var = (yp0) dq0Var.f10544b.f9452c;
            bg0Var.f9680e.c(yp0Var.f18824f);
            eh0 eh0Var = bg0Var.f9680e;
            long j = yp0Var.g;
            synchronized (eh0Var.f10791h) {
                eh0Var.f10787c = j;
            }
        }
    }

    @Override // pb.c
    public void O(nb.b bVar) {
        ai aiVar = (ai) this.f12502b;
        synchronized (aiVar.f9332c) {
            try {
                aiVar.f9335f = null;
                if (((di) aiVar.f9333d) != null) {
                    aiVar.f9333d = null;
                }
                aiVar.f9332c.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.v8 a(com.google.android.gms.internal.ads.y1 r18, com.google.android.gms.internal.ads.w5 r19, int r20) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ix0.a(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.w5, int):com.google.android.gms.internal.ads.v8");
    }

    @Override // com.google.android.gms.internal.ads.ra
    public File b() {
        return (File) this.f12502b;
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public /* synthetic */ void mo162c(Object obj) {
        switch (this.f12501a) {
            case 18:
                ((n60) obj).b((va.w1) this.f12502b);
                break;
            case 19:
                ((y60) obj).v((o40) this.f12502b);
                break;
            case 20:
                ((y70) obj).r((pj) this.f12502b);
                break;
            default:
                ((xo) obj).E((xu) this.f12502b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        gx gxVar;
        switch (this.f12501a) {
            case 16:
                ((y40) this.f12502b).f18632f.k(true);
                return;
            case 17:
                ((n50) this.f12502b).f14152a.a();
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            default:
                ((mg0) this.f12502b).f13890c.l((dq0) obj);
                return;
            case 22:
                ca0 ca0Var = (ca0) this.f12502b;
                ca0Var.f10023m.P((qz) obj);
                ga0 ga0Var = ca0Var.f10023m;
                synchronized (ga0Var) {
                    gxVar = ga0Var.f11424n;
                }
                xh0 xh0VarG = ca0Var.g("Google", true);
                if (xh0VarG != null && gxVar != null) {
                    gxVar.b(xh0VarG);
                    return;
                } else {
                    if (gxVar != null) {
                        gxVar.cancel(false);
                        return;
                    }
                    return;
                }
            case 24:
                ((qz) obj).a("sendMessageToNativeJs", (Map) this.f12502b);
                return;
            case 25:
                ((we0) obj).f18003m = true;
                ((pf0) this.f12502b).f14998d.b();
                return;
            case 26:
                q(obj);
                return;
        }
    }

    @Override // bb.e
    public void i(pa.a aVar) {
        try {
            ((es) this.f12502b).b(aVar.a());
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public vd.b j(iu iuVar) {
        jg0 jg0Var = (jg0) ((pq0) this.f12502b).f15074c;
        String str = iuVar.f12479h;
        synchronized (jg0Var.f11859b) {
            try {
                int i4 = jg0Var.f12744h;
                if (i4 != 1 && i4 != 3) {
                    return yo0.w(new og0(2));
                }
                if (jg0Var.f11860c) {
                    return jg0Var.f11858a;
                }
                jg0Var.f12744h = 3;
                jg0Var.f11860c = true;
                jg0Var.g = str;
                jg0Var.f11863f.n();
                gx gxVar = jg0Var.f11858a;
                gxVar.f11625a.a(new ig0(jg0Var, 0), fx.g);
                return gxVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.q21
    public /* synthetic */ void l(long j, sk0 sk0Var) {
        a80.f(j, sk0Var, ((r5) this.f12502b).I);
    }

    public void m() {
        ny0 ny0Var = ((px0) this.f12502b).f15134a;
        synchronized (ny0Var) {
            try {
                if (ny0Var.f14482e != null) {
                    return;
                }
                Set set = (Set) ny0Var.f14479b.a();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((my0) it.next()).b());
                }
                g21 g21Var = (g21) ny0Var.f14481d.a();
                x71 x71VarG = yo0.G(new f81(x41.q(arrayList), true), o5.f14557t, ny0Var.f14480c);
                g21Var.e(2, x71VarG);
                ny0Var.f14482e = x71VarG;
                Iterator it2 = ((Set) ny0Var.f14478a.a()).iterator();
                while (it2.hasNext()) {
                    ((my0) it2.next()).b();
                }
                if (ny0Var.f14482e != null) {
                } else {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) throws NumberFormatException {
        switch (this.f12501a) {
            case 16:
                ((y40) this.f12502b).f18632f.k(false);
                break;
            case 22:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16167i6)).booleanValue()) {
                    ua.j.C.f35265h.g("omid native display exp", th2);
                    break;
                }
                break;
            case 26:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.W6)).booleanValue()) {
                    Matcher matcher = bg0.f9675h.matcher(th2.getMessage());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        bg0 bg0Var = (bg0) this.f12502b;
                        bg0Var.f9680e.c(Integer.parseInt(strGroup));
                        break;
                    }
                }
                break;
        }
    }

    public void o(boolean z3) {
        synchronized (ix0.class) {
            try {
                ce1 ce1Var = (ce1) this.f12502b;
                ce1Var.k(Boolean.valueOf(z3), "paidv2_publisher_option");
                if (!z3) {
                    ce1Var.m("paidv2_creation_time");
                    ce1Var.m("paidv2_id");
                    ce1Var.m("vendor_scoped_gpid_v2_id");
                    ce1Var.m("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bb.e
    public Object onSuccess(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        za.i.h("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            ((es) this.f12502b).g("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            za.i.f("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.m00
    public void p(String str, int i4, String str2, boolean z3) {
        gi giVar = (gi) this.f12502b;
        if (z3) {
            giVar.e();
            return;
        }
        int length = String.valueOf(i4).length();
        StringBuilder sb2 = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Image Web View failed to load. Error code: ");
        sb2.append(i4);
        sb2.append(", Description: ");
        sb2.append(str);
        giVar.d(new qj0(1, d.h.w(sb2, ", Failing URL: ", str2)));
    }

    public String r(Context context) {
        String string;
        x71 x71Var;
        px0 px0Var = (px0) this.f12502b;
        dy0 dy0Var = px0Var.f15138e;
        g21 g21Var = px0Var.f15137d;
        long j = px0Var.f15141i;
        boolean z3 = false;
        if (px0Var.j && System.currentTimeMillis() - j <= px0Var.f15142k) {
            z3 = true;
        }
        f21 f21VarA = g21Var.a(3);
        try {
            try {
                try {
                    try {
                        f21VarA.a();
                        ny0 ny0Var = px0Var.f15134a;
                        synchronized (ny0Var) {
                            x71Var = ny0Var.f14482e;
                            if (x71Var == null) {
                                throw null;
                            }
                        }
                        string = (String) yo0.F(x71Var, new sq(14, px0Var, context), k81.f13081a).get(z3 ? px0Var.f15140h : px0Var.f15139f, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        f21VarA.b(e2);
                        string = "";
                    } catch (TimeoutException unused) {
                        if (z3) {
                            string = ((j01) px0Var.g.a()).a(j);
                        } else {
                            g21Var.b(56);
                            string = Integer.toString(17);
                        }
                    }
                } catch (Throwable th2) {
                    f21VarA.b(th2);
                    throw th2;
                }
            } catch (ExecutionException e10) {
                e = e10;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                f21VarA.b(e);
                string = Integer.toString(3);
            }
            f21VarA.c();
            dy0Var.a();
            return string;
        } catch (Throwable th3) {
            f21VarA.c();
            dy0Var.a();
            throw th3;
        }
    }

    public boolean s() {
        boolean z3;
        synchronized (ix0.class) {
            z3 = ((SharedPreferences) ((ce1) this.f12502b).f10095c).getBoolean("paidv2_publisher_option", true);
        }
        return z3;
    }

    public String t(Context context, String str, View view) {
        String string;
        x71 x71Var;
        px0 px0Var = (px0) this.f12502b;
        dy0 dy0Var = px0Var.f15138e;
        g21 g21Var = px0Var.f15137d;
        f21 f21VarA = g21Var.a(5);
        try {
            try {
                try {
                    f21VarA.a();
                    ny0 ny0Var = px0Var.f15134a;
                    synchronized (ny0Var) {
                        x71Var = ny0Var.f14482e;
                        if (x71Var == null) {
                            throw null;
                        }
                    }
                    string = (String) yo0.F(x71Var, new qq(7, px0Var, context, view, str), k81.f13081a).get(px0Var.f15139f, TimeUnit.MILLISECONDS);
                } catch (ExecutionException e2) {
                    Throwable th2 = e2;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    f21VarA.b(th2);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    g21Var.b(58);
                    string = Integer.toString(17);
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                f21VarA.b(e10);
                string = "";
            } catch (Throwable th3) {
                f21VarA.b(th3);
                throw th3;
            }
            f21VarA.c();
            dy0Var.a();
            return string;
        } catch (Throwable th4) {
            f21VarA.c();
            dy0Var.a();
            throw th4;
        }
    }

    public void u(MotionEvent motionEvent) {
        ez0 ez0Var = ((px0) this.f12502b).f15135b;
        az0 az0Var = (az0) ez0Var.f10931f.get();
        if (az0Var == null) {
            ez0Var.f10930e.b(54);
        } else {
            az0Var.d(motionEvent);
        }
    }

    public ix0(k10 k10Var) {
        this.f12501a = 15;
        this.f12502b = new g40((js1) k10Var.g, (js1) k10Var.T, (fs1) new f20(k10Var.U, 18), (js1) k10Var.V, (js1) k10Var.f12958t, 8);
    }

    @Override // com.google.android.gms.internal.ads.hx
    /* renamed from: b, reason: collision with other method in class */
    public void mo164b() {
        switch (this.f12501a) {
            case 10:
                ((hq) this.f12502b).f11939d.z();
                break;
            default:
                vd.b bVarA = ((b7) this.f12502b).a();
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.C8)).booleanValue()) {
                    nn1.e(bVarA, "persistFlags");
                    break;
                } else {
                    m91 m91Var = new m91("persistFlags", 6);
                    bVarA.a(new q81(0, bVarA, m91Var), fx.g);
                    break;
                }
        }
    }

    public ix0(int i4) {
        this.f12501a = i4;
        switch (i4) {
            case 3:
                this.f12502b = new sk0(10);
                break;
            case 12:
                this.f12502b = new WeakHashMap();
                break;
            default:
                this.f12502b = new CopyOnWriteArrayList();
                break;
        }
    }

    public ix0(Context context) {
        this.f12501a = 0;
        if (ce1.f10092d == null) {
            ce1.f10092d = new ce1(context, 20);
        }
        this.f12502b = ce1.f10092d;
    }

    public ix0(sa saVar, File file) {
        this.f12501a = 7;
        this.f12502b = file;
    }

    public ix0(hq hqVar) {
        this.f12501a = 10;
        Objects.requireNonNull(hqVar);
        this.f12502b = hqVar;
    }

    public ix0(ms msVar, es esVar, fr frVar) {
        this.f12501a = 11;
        this.f12502b = esVar;
    }

    public ix0(hc0 hc0Var, Map map) {
        this.f12501a = 24;
        this.f12502b = map;
        Objects.requireNonNull(hc0Var);
    }

    public ix0(Context context, ex exVar, sx0 sx0Var) {
        this.f12501a = 1;
        context.getClass();
        exVar.getClass();
        this.f12502b = (px0) ((es1) new d80(exVar, context, sx0Var).f10373m).a();
    }

    private final void e(Throwable th2) {
    }

    private final void f(Throwable th2) {
    }

    private final void g(Throwable th2) {
    }

    private final void k(Throwable th2) {
    }
}
