package fb;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.bs0;
import com.google.android.gms.internal.ads.cs0;
import com.google.android.gms.internal.ads.ct0;
import com.google.android.gms.internal.ads.dl;
import com.google.android.gms.internal.ads.e81;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.f81;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.jq0;
import com.google.android.gms.internal.ads.k10;
import com.google.android.gms.internal.ads.mw;
import com.google.android.gms.internal.ads.n81;
import com.google.android.gms.internal.ads.nt;
import com.google.android.gms.internal.ads.oe;
import com.google.android.gms.internal.ads.ol;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.pt;
import com.google.android.gms.internal.ads.q81;
import com.google.android.gms.internal.ads.rk;
import com.google.android.gms.internal.ads.rq0;
import com.google.android.gms.internal.ads.rw;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.ud0;
import com.google.android.gms.internal.ads.w71;
import com.google.android.gms.internal.ads.w81;
import com.google.android.gms.internal.ads.x10;
import com.google.android.gms.internal.ads.x41;
import com.google.android.gms.internal.ads.yo0;
import com.google.android.gms.internal.ads.yr1;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import va.z2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends mw {
    public static final ArrayList H = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList I = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList J = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList K = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public final ArrayList A;
    public final AtomicBoolean B;
    public final AtomicBoolean C;
    public final AtomicInteger D;
    public final dl E;
    public final z F;
    public final v G;

    /* renamed from: b, reason: collision with root package name */
    public final k10 f23912b;

    /* renamed from: c, reason: collision with root package name */
    public Context f23913c;

    /* renamed from: d, reason: collision with root package name */
    public final oe f23914d;

    /* renamed from: e, reason: collision with root package name */
    public final jq0 f23915e;

    /* renamed from: f, reason: collision with root package name */
    public final rq0 f23916f;
    public final w81 g;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f23917h;

    /* renamed from: i, reason: collision with root package name */
    public st f23918i;
    public Point j;

    /* renamed from: k, reason: collision with root package name */
    public Point f23919k;

    /* renamed from: l, reason: collision with root package name */
    public final ud0 f23920l;

    /* renamed from: m, reason: collision with root package name */
    public final ct0 f23921m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f23922n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f23923o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f23924p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f23925q;

    /* renamed from: r, reason: collision with root package name */
    public final String f23926r;

    /* renamed from: s, reason: collision with root package name */
    public final String f23927s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicInteger f23928t;

    /* renamed from: u, reason: collision with root package name */
    public final za.a f23929u;

    /* renamed from: v, reason: collision with root package name */
    public String f23930v;

    /* renamed from: w, reason: collision with root package name */
    public final String f23931w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f23932x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f23933y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f23934z;

    public h(k10 k10Var, Context context, oe oeVar, rq0 rq0Var, w81 w81Var, ScheduledExecutorService scheduledExecutorService, ud0 ud0Var, ct0 ct0Var, za.a aVar, dl dlVar, jq0 jq0Var, z zVar, v vVar) {
        ArrayList arrayListP4;
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        this.j = new Point();
        this.f23919k = new Point();
        this.f23928t = new AtomicInteger(0);
        this.B = new AtomicBoolean(false);
        this.C = new AtomicBoolean(false);
        this.D = new AtomicInteger(0);
        this.f23912b = k10Var;
        this.f23913c = context;
        this.f23914d = oeVar;
        this.f23915e = jq0Var;
        this.f23916f = rq0Var;
        this.g = w81Var;
        this.f23917h = scheduledExecutorService;
        this.f23920l = ud0Var;
        this.f23921m = ct0Var;
        this.f23929u = aVar;
        this.E = dlVar;
        pk pkVar = sk.Z7;
        va.s sVar = va.s.f36163e;
        this.f23922n = ((Boolean) sVar.f36166c.a(pkVar)).booleanValue();
        pk pkVar2 = sk.Y7;
        rk rkVar = sVar.f36166c;
        this.f23923o = ((Boolean) rkVar.a(pkVar2)).booleanValue();
        this.f23924p = ((Boolean) rkVar.a(sk.f16059b8)).booleanValue();
        this.f23925q = ((Boolean) rkVar.a(sk.f16092d8)).booleanValue();
        this.f23926r = (String) rkVar.a(sk.f16076c8);
        this.f23927s = (String) rkVar.a(sk.f16107e8);
        this.f23931w = (String) rkVar.a(sk.f16124f8);
        this.F = zVar;
        this.G = vVar;
        if (((Boolean) rkVar.a(sk.f16139g8)).booleanValue()) {
            this.f23932x = p4((String) rkVar.a(sk.h8));
            this.f23933y = p4((String) rkVar.a(sk.f16169i8));
            this.f23934z = p4((String) rkVar.a(sk.j8));
            arrayListP4 = p4((String) rkVar.a(sk.f16197k8));
        } else {
            this.f23932x = H;
            this.f23933y = I;
            this.f23934z = J;
            arrayListP4 = K;
        }
        this.A = arrayListP4;
    }

    public static boolean l4(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri o4(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i4 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(string.substring(0, i4));
        je.u.B(sb2, str, "=", str2, "&");
        sb2.append(string.substring(i4));
        return Uri.parse(sb2.toString());
    }

    public static final ArrayList p4(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!yr1.k(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static bs0 q4(vd.b bVar, rw rwVar) {
        if (cs0.a() && ((Boolean) ol.f14726e.u()).booleanValue()) {
            try {
                bs0 bs0Var = (bs0) ((x10) yo0.H(bVar)).f18258a.a();
                bs0Var.b(new ArrayList(Collections.singletonList(rwVar.f15773b)));
                z2 z2Var = rwVar.f15775d;
                bs0Var.c(z2Var == null ? "" : z2Var.f36201p);
                bs0Var.d(z2Var.f36198m);
                return bs0Var;
            } catch (ExecutionException e2) {
                ua.j.C.f35265h.f("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e2);
            }
        }
        return null;
    }

    public final void h4(ArrayList arrayList, vb.a aVar, pt ptVar, boolean z3) {
        Map map;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16385w8)).booleanValue()) {
            try {
                nt ntVar = (nt) ptVar;
                Parcel parcelT = ntVar.T();
                parcelT.writeString("The updating URL feature is not enabled.");
                ntVar.g1(parcelT, 2);
                return;
            } catch (RemoteException e2) {
                za.i.f("", e2);
                return;
            }
        }
        com.google.android.gms.internal.consent_sdk.i iVar = new com.google.android.gms.internal.consent_sdk.i(this, arrayList, aVar, 1);
        ex exVar = (ex) this.g;
        vd.b bVarE = exVar.e(iVar);
        st stVar = this.f23918i;
        if (stVar == null || (map = stVar.f16545b) == null || map.isEmpty()) {
            za.i.g("Asset view map is empty.");
        } else {
            bVarE = yo0.F(bVarE, new c(0, this), exVar);
        }
        bVarE.a(new q81(0, bVarE, new i4(this, ptVar, z3)), this.f23912b.b());
    }

    public final void i4(ArrayList arrayList, vb.a aVar, pt ptVar, boolean z3) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        vd.b bVarF;
        Map map;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16385w8)).booleanValue()) {
            za.i.h("The updating URL feature is not enabled.");
            try {
                nt ntVar = (nt) ptVar;
                Parcel parcelT = ntVar.T();
                parcelT.writeString("The updating URL feature is not enabled.");
                ntVar.g1(parcelT, 2);
                return;
            } catch (RemoteException e2) {
                za.i.f("", e2);
                return;
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList2 = this.f23933y;
            arrayList3 = this.f23932x;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            if (l4((Uri) obj, arrayList3, arrayList2)) {
                i10++;
            }
        }
        if (i10 > 1) {
            za.i.h("Multiple google urls found: ".concat(String.valueOf(arrayList)));
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            Uri uri = (Uri) obj2;
            if (l4(uri, arrayList3, arrayList2)) {
                com.google.android.gms.internal.consent_sdk.i iVar = new com.google.android.gms.internal.consent_sdk.i(this, uri, aVar, 2);
                ex exVar = (ex) this.g;
                vd.b bVarE = exVar.e(iVar);
                st stVar = this.f23918i;
                if (stVar == null || (map = stVar.f16545b) == null || map.isEmpty()) {
                    za.i.g("Asset view map is empty.");
                    bVarF = bVarE;
                } else {
                    bVarF = yo0.F(bVarE, new c(1, this), exVar);
                }
            } else {
                za.i.h("Not a Google URL: ".concat(String.valueOf(uri)));
                bVarF = yo0.e(uri);
            }
            arrayList4.add(bVarF);
        }
        f81 f81Var = new f81(x41.q(arrayList4), true);
        f81Var.a(new q81(0, f81Var, new m8.s(this, ptVar, z3)), this.f23912b.b());
    }

    public final void j4() {
        pk pkVar = sk.Qa;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (!((Boolean) rkVar.a(pkVar)).booleanValue() || ((Boolean) rkVar2.a(sk.Ta)).booleanValue()) {
            return;
        }
        if (((Boolean) rkVar2.a(sk.Xa)).booleanValue() && this.B.getAndSet(true)) {
            return;
        }
        k4();
    }

    public final void k4() {
        h hVar;
        vd.b bVarB;
        if (((Boolean) zl.f19114e.u()).booleanValue()) {
            z zVar = this.F;
            synchronized (zVar) {
                zVar.c(true);
                zVar.c(false);
            }
            return;
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16294qc)).booleanValue()) {
            bVarB = yo0.B(new o7.d(20, this), fx.f11274a);
            hVar = this;
        } else {
            hVar = this;
            bVarB = (vd.b) hVar.m4(this.f23913c, null, "BANNER", null, null, 0, null, new Bundle(), null).f18259b.a();
        }
        o7.c cVar = new o7.c(19, this);
        bVarB.a(new q81(0, bVarB, cVar), hVar.f23912b.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.x10 m4(android.content.Context r41, java.lang.String r42, java.lang.String r43, va.c3 r44, va.z2 r45, int r46, java.lang.String r47, android.os.Bundle r48, com.google.android.gms.internal.ads.rw r49) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.h.m4(android.content.Context, java.lang.String, java.lang.String, va.c3, va.z2, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.rw):com.google.android.gms.internal.ads.x10");
    }

    public final n81 n4(final String str) {
        final hc0[] hc0VarArr = new hc0[1];
        vd.b bVarB = this.f23916f.b();
        e81 e81Var = new e81() { // from class: fb.g
            @Override // com.google.android.gms.internal.ads.e81
            public final /* synthetic */ vd.b c(Object obj) throws JSONException {
                hc0 hc0Var = (hc0) obj;
                h hVar = this.f23905a;
                hVar.getClass();
                hc0VarArr[0] = hc0Var;
                Context context = hVar.f23913c;
                st stVar = hVar.f23918i;
                Map map = stVar.f16545b;
                JSONObject jSONObjectJ = pk.a.J(context, map, map, stVar.f16544a, null);
                JSONObject jSONObjectE = pk.a.E(hVar.f23913c, hVar.f23918i.f16544a);
                JSONObject jSONObjectF = pk.a.F(hVar.f23918i.f16544a);
                JSONObject jSONObjectH = pk.a.H(hVar.f23913c, hVar.f23918i.f16544a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectJ);
                jSONObject.put("ad_view_signal", jSONObjectE);
                jSONObject.put("scroll_view_signal", jSONObjectF);
                jSONObject.put("lock_screen_signal", jSONObjectH);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", pk.a.L(null, hVar.f23913c, hVar.f23919k, hVar.j));
                }
                return hc0Var.a(str2, jSONObject);
            }
        };
        w81 w81Var = this.g;
        w71 w71VarF = yo0.F(bVarB, e81Var, w81Var);
        w71VarF.a(new vd.a(28, this, hc0VarArr), w81Var);
        return yo0.C(yo0.G((n81) yo0.E(n81.s(w71VarF), ((Integer) va.s.f36163e.f36166c.a(sk.f16402x8)).intValue(), TimeUnit.MILLISECONDS, this.f23917h), f.f23898b, w81Var), Exception.class, f.f23899c, w81Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    @Override // com.google.android.gms.internal.ads.nw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v3(vb.a r12, com.google.android.gms.internal.ads.rw r13, com.google.android.gms.internal.ads.kw r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.h.v3(vb.a, com.google.android.gms.internal.ads.rw, com.google.android.gms.internal.ads.kw):void");
    }
}
