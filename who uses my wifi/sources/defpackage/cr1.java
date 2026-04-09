package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cr1 extends vc2 {
    public static final ArrayList M = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList N = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList O = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList P = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public String A;
    public final String B;
    public final ArrayList C;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public final AtomicInteger I;
    public final b02 J;
    public final jd4 K;
    public final k63 L;
    public final th2 g;
    public Context h;
    public final vs1 i;
    public final m83 j;
    public final v83 k;
    public final pq3 l;
    public final ScheduledExecutorService m;
    public o92 n;
    public Point o;
    public Point p;
    public final pv2 q;
    public final eb3 r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final String x;
    public final AtomicInteger y;
    public final e51 z;

    public cr1(th2 th2Var, Context context, vs1 vs1Var, v83 v83Var, pq3 pq3Var, ScheduledExecutorService scheduledExecutorService, pv2 pv2Var, eb3 eb3Var, e51 e51Var, b02 b02Var, m83 m83Var, jd4 jd4Var, k63 k63Var) {
        ArrayList arrayListJ3;
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        this.o = new Point();
        this.p = new Point();
        this.y = new AtomicInteger(0);
        this.G = new AtomicBoolean(false);
        this.H = new AtomicBoolean(false);
        this.I = new AtomicInteger(0);
        this.g = th2Var;
        this.h = context;
        this.i = vs1Var;
        this.j = m83Var;
        this.k = v83Var;
        this.l = pq3Var;
        this.m = scheduledExecutorService;
        this.q = pv2Var;
        this.r = eb3Var;
        this.z = e51Var;
        this.J = b02Var;
        iz1 iz1Var = mz1.E7;
        tw1 tw1Var = tw1.e;
        this.s = ((Boolean) tw1Var.c.a(iz1Var)).booleanValue();
        iz1 iz1Var2 = mz1.D7;
        kz1 kz1Var = tw1Var.c;
        this.t = ((Boolean) kz1Var.a(iz1Var2)).booleanValue();
        this.u = ((Boolean) kz1Var.a(mz1.G7)).booleanValue();
        this.v = ((Boolean) kz1Var.a(mz1.I7)).booleanValue();
        this.w = (String) kz1Var.a(mz1.H7);
        this.x = (String) kz1Var.a(mz1.J7);
        this.B = (String) kz1Var.a(mz1.K7);
        this.K = jd4Var;
        this.L = k63Var;
        if (((Boolean) kz1Var.a(mz1.L7)).booleanValue()) {
            this.C = J3((String) kz1Var.a(mz1.M7));
            this.D = J3((String) kz1Var.a(mz1.N7));
            this.E = J3((String) kz1Var.a(mz1.O7));
            arrayListJ3 = J3((String) kz1Var.a(mz1.P7));
        } else {
            this.C = M;
            this.D = N;
            this.E = O;
            arrayListJ3 = P;
        }
        this.F = arrayListJ3;
    }

    public static boolean F3(Uri uri, List list, List list2) {
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

    public static final Uri I3(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(string.substring(0, i));
        ex0.q(sb, str, "=", str2, "&");
        sb.append(string.substring(i));
        return Uri.parse(sb.toString());
    }

    public static final ArrayList J3(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!yc0.s(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static da3 K3(n70 n70Var, ad2 ad2Var) {
        if (ea3.a() && ((Boolean) n02.e.w()).booleanValue()) {
            try {
                da3 da3Var = (da3) ((ki2) pu1.R(n70Var)).a.d();
                da3Var.b(new ArrayList(Collections.singletonList(ad2Var.g)));
                pc4 pc4Var = ad2Var.i;
                da3Var.c(pc4Var == null ? "" : pc4Var.u);
                da3Var.d(pc4Var.r);
                return da3Var;
            } catch (ExecutionException e) {
                hg4.C.h.d("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e);
            }
        }
        return null;
    }

    public final void B3(ArrayList arrayList, u10 u10Var, j92 j92Var, boolean z) {
        Map map;
        if (!((Boolean) tw1.e.c.a(mz1.b8)).booleanValue()) {
            try {
                h92 h92Var = (h92) j92Var;
                Parcel parcelU = h92Var.U();
                parcelU.writeString("The updating URL feature is not enabled.");
                h92Var.M0(parcelU, 2);
                return;
            } catch (RemoteException e) {
                gi2.c0("", e);
                return;
            }
        }
        yi1 yi1Var = new yi1(this, arrayList, u10Var, 0);
        ld2 ld2Var = (ld2) this.l;
        n70 n70VarC = ld2Var.c(yi1Var);
        o92 o92Var = this.n;
        if (o92Var == null || (map = o92Var.g) == null || map.isEmpty()) {
            gi2.f0("Asset view map is empty.");
        } else {
            n70VarC = pu1.O(n70VarC, new ek1(this, 0), ld2Var);
        }
        int i = 0;
        n70VarC.c(new jq3(n70VarC, new zf1(this, j92Var, z, i), i), this.g.b());
    }

    public final void C3(ArrayList arrayList, u10 u10Var, j92 j92Var, boolean z) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        n70 n70VarO;
        Map map;
        if (!((Boolean) tw1.e.c.a(mz1.b8)).booleanValue()) {
            gi2.i0("The updating URL feature is not enabled.");
            try {
                h92 h92Var = (h92) j92Var;
                Parcel parcelU = h92Var.U();
                parcelU.writeString("The updating URL feature is not enabled.");
                h92Var.M0(parcelU, 2);
                return;
            } catch (RemoteException e) {
                gi2.c0("", e);
                return;
            }
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            arrayList2 = this.D;
            arrayList3 = this.C;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            if (F3((Uri) obj, arrayList3, arrayList2)) {
                i2++;
            }
        }
        if (i2 > 1) {
            gi2.i0("Multiple google urls found: ".concat(String.valueOf(arrayList)));
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            Uri uri = (Uri) obj2;
            if (F3(uri, arrayList3, arrayList2)) {
                yi1 yi1Var = new yi1(this, uri, u10Var, 1);
                ld2 ld2Var = (ld2) this.l;
                n70 n70VarC = ld2Var.c(yi1Var);
                o92 o92Var = this.n;
                if (o92Var == null || (map = o92Var.g) == null || map.isEmpty()) {
                    gi2.f0("Asset view map is empty.");
                    n70VarO = n70VarC;
                } else {
                    n70VarO = pu1.O(n70VarC, new ek1(this, 1), ld2Var);
                }
            } else {
                gi2.i0("Not a Google URL: ".concat(String.valueOf(uri)));
                n70VarO = pu1.r(uri);
            }
            arrayList4.add(n70VarO);
        }
        zp3 zp3Var = new zp3(xm3.m(arrayList4), true);
        zp3Var.c(new jq3(zp3Var, new zf1(this, j92Var, z, 1), 0), this.g.b());
    }

    public final void D3() {
        iz1 iz1Var = mz1.ra;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (!((Boolean) kz1Var.a(iz1Var)).booleanValue() || ((Boolean) kz1Var2.a(mz1.ua)).booleanValue()) {
            return;
        }
        if (((Boolean) kz1Var2.a(mz1.ya)).booleanValue() && this.G.getAndSet(true)) {
            return;
        }
        E3();
    }

    public final void E3() {
        cr1 cr1Var;
        n70 n70VarH;
        if (((Boolean) x02.e.w()).booleanValue()) {
            jd4 jd4Var = this.K;
            synchronized (jd4Var) {
                jd4Var.c(true);
                jd4Var.c(false);
            }
            return;
        }
        if (((Boolean) tw1.e.c.a(mz1.Rb)).booleanValue()) {
            n70VarH = pu1.H(new zs1(10, this), md2.a);
            cr1Var = this;
        } else {
            cr1Var = this;
            n70VarH = (n70) cr1Var.G3(this.h, null, "BANNER", null, null, 0, null, new Bundle(), null).b.d();
        }
        z71 z71Var = new z71(12, this);
        n70VarH.c(new jq3(n70VarH, z71Var, 0), cr1Var.g.b());
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
    public final defpackage.ki2 G3(android.content.Context r41, java.lang.String r42, java.lang.String r43, defpackage.xe4 r44, defpackage.pc4 r45, int r46, java.lang.String r47, android.os.Bundle r48, defpackage.ad2 r49) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr1.G3(android.content.Context, java.lang.String, java.lang.String, xe4, pc4, int, java.lang.String, android.os.Bundle, ad2):ki2");
    }

    public final gq3 H3(String str) {
        au2[] au2VarArr = new au2[1];
        n70 n70VarB = this.k.b();
        op1 op1Var = new op1(this, au2VarArr, str, 0);
        pq3 pq3Var = this.l;
        qp3 qp3VarO = pu1.O(n70VarB, op1Var, pq3Var);
        qp3VarO.c(new jq3(this, au2VarArr, 22), pq3Var);
        return pu1.J(pu1.P((gq3) pu1.N(gq3.r(qp3VarO), ((Integer) tw1.e.c.a(mz1.c8)).intValue(), TimeUnit.MILLISECONDS, this.m), gj1.c, pq3Var), Exception.class, gj1.d, pq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    @Override // defpackage.wc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e2(defpackage.u10 r12, defpackage.ad2 r13, defpackage.tc2 r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr1.e2(u10, ad2, tc2):void");
    }
}
