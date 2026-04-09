package A2;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractBinderC2078wf;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.AbstractC1049da;
import com.google.android.gms.internal.ads.AbstractC1642oa;
import com.google.android.gms.internal.ads.AbstractC1984ut;
import com.google.android.gms.internal.ads.AbstractC2221zD;
import com.google.android.gms.internal.ads.C0436Bf;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.C0710Rh;
import com.google.android.gms.internal.ads.C0791Wd;
import com.google.android.gms.internal.ads.C0852Zn;
import com.google.android.gms.internal.ads.C0944be;
import com.google.android.gms.internal.ads.C1057di;
import com.google.android.gms.internal.ads.C1068du;
import com.google.android.gms.internal.ads.C1306iD;
import com.google.android.gms.internal.ads.C1446ku;
import com.google.android.gms.internal.ads.C1476lN;
import com.google.android.gms.internal.ads.C1547mn;
import com.google.android.gms.internal.ads.C1789rD;
import com.google.android.gms.internal.ads.C2202yv;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.G9;
import com.google.android.gms.internal.ads.H6;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.ID;
import com.google.android.gms.internal.ads.InterfaceC0825Yd;
import com.google.android.gms.internal.ads.InterfaceC1736qD;
import com.google.android.gms.internal.ads.LB;
import com.google.android.gms.internal.ads.S9;
import com.google.android.gms.internal.ads.Xu;
import com.google.android.gms.internal.ads.Yu;
import f4.InterfaceFutureC2326a;
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
import q2.C2841s;
import q2.a1;
import u2.C2951a;

/* renamed from: A2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0126n extends AbstractBinderC2078wf {

    /* renamed from: V, reason: collision with root package name */
    public static final ArrayList f267V = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: W, reason: collision with root package name */
    public static final ArrayList f268W = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: X, reason: collision with root package name */
    public static final ArrayList f269X = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: Y, reason: collision with root package name */
    public static final ArrayList f270Y = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: C, reason: collision with root package name */
    public final boolean f271C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f272D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f273E;

    /* renamed from: F, reason: collision with root package name */
    public final String f274F;

    /* renamed from: G, reason: collision with root package name */
    public final String f275G;

    /* renamed from: H, reason: collision with root package name */
    public final AtomicInteger f276H;

    /* renamed from: I, reason: collision with root package name */
    public final C2951a f277I;

    /* renamed from: J, reason: collision with root package name */
    public String f278J;

    /* renamed from: K, reason: collision with root package name */
    public final String f279K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f280L;
    public final ArrayList M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f281N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f282O;

    /* renamed from: P, reason: collision with root package name */
    public final AtomicBoolean f283P;

    /* renamed from: Q, reason: collision with root package name */
    public final AtomicBoolean f284Q;

    /* renamed from: R, reason: collision with root package name */
    public final AtomicInteger f285R;

    /* renamed from: S, reason: collision with root package name */
    public final S9 f286S;

    /* renamed from: T, reason: collision with root package name */
    public final L f287T;

    /* renamed from: U, reason: collision with root package name */
    public final G f288U;

    /* renamed from: b, reason: collision with root package name */
    public final C0710Rh f289b;

    /* renamed from: c, reason: collision with root package name */
    public Context f290c;

    /* renamed from: d, reason: collision with root package name */
    public final H6 f291d;

    /* renamed from: e, reason: collision with root package name */
    public final C1068du f292e;

    /* renamed from: f, reason: collision with root package name */
    public final C1446ku f293f;

    /* renamed from: g, reason: collision with root package name */
    public final ID f294g;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f295h;
    public C0944be i;

    /* renamed from: j, reason: collision with root package name */
    public Point f296j;

    /* renamed from: k, reason: collision with root package name */
    public Point f297k;

    /* renamed from: l, reason: collision with root package name */
    public final C0852Zn f298l;

    /* renamed from: m, reason: collision with root package name */
    public final C2202yv f299m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f300n;

    public BinderC0126n(C0710Rh c0710Rh, Context context, H6 h6, C1446ku c1446ku, ID id, ScheduledExecutorService scheduledExecutorService, C0852Zn c0852Zn, C2202yv c2202yv, C2951a c2951a, S9 s9, C1068du c1068du, L l2, G g2) {
        ArrayList arrayListS3;
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        this.f296j = new Point();
        this.f297k = new Point();
        this.f276H = new AtomicInteger(0);
        this.f283P = new AtomicBoolean(false);
        this.f284Q = new AtomicBoolean(false);
        this.f285R = new AtomicInteger(0);
        this.f289b = c0710Rh;
        this.f290c = context;
        this.f291d = h6;
        this.f292e = c1068du;
        this.f293f = c1446ku;
        this.f294g = id;
        this.f295h = scheduledExecutorService;
        this.f298l = c0852Zn;
        this.f299m = c2202yv;
        this.f277I = c2951a;
        this.f286S = s9;
        E9 e9 = H9.Z7;
        C2841s c2841s = C2841s.f23267e;
        this.f300n = ((Boolean) c2841s.f23270c.a(e9)).booleanValue();
        E9 e92 = H9.Y7;
        G9 g9 = c2841s.f23270c;
        this.f271C = ((Boolean) g9.a(e92)).booleanValue();
        this.f272D = ((Boolean) g9.a(H9.b8)).booleanValue();
        this.f273E = ((Boolean) g9.a(H9.d8)).booleanValue();
        this.f274F = (String) g9.a(H9.c8);
        this.f275G = (String) g9.a(H9.e8);
        this.f279K = (String) g9.a(H9.f8);
        this.f287T = l2;
        this.f288U = g2;
        if (((Boolean) g9.a(H9.g8)).booleanValue()) {
            this.f280L = S3((String) g9.a(H9.h8));
            this.M = S3((String) g9.a(H9.i8));
            this.f281N = S3((String) g9.a(H9.j8));
            arrayListS3 = S3((String) g9.a(H9.k8));
        } else {
            this.f280L = f267V;
            this.M = f268W;
            this.f281N = f269X;
            arrayListS3 = f270Y;
        }
        this.f282O = arrayListS3;
    }

    public static boolean O3(Uri uri, List list, List list2) {
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

    public static final Uri R3(Uri uri, String str, String str2) {
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
        A.f.w(sb, str, "=", str2, "&");
        sb.append(string.substring(i));
        return Uri.parse(sb.toString());
    }

    public static final ArrayList S3(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!C1476lN.k(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static Xu T3(InterfaceFutureC2326a interfaceFutureC2326a, C0436Bf c0436Bf) {
        if (Yu.a() && ((Boolean) AbstractC1049da.f13770e.v()).booleanValue()) {
            try {
                Xu xu = (Xu) ((C1057di) AbstractC1984ut.H(interfaceFutureC2326a)).f13793a.c();
                xu.b(new ArrayList(Collections.singletonList(c0436Bf.f7378b)));
                a1 a1Var = c0436Bf.f7380d;
                xu.c(a1Var == null ? "" : a1Var.f23153D);
                xu.d(a1Var.f23176m);
                return xu;
            } catch (ExecutionException e6) {
                p2.j.f22785C.f22795h.f("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e6);
            }
        }
        return null;
    }

    public final void K3(ArrayList arrayList, S2.a aVar, InterfaceC0825Yd interfaceC0825Yd, boolean z6) {
        Map map;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.w8)).booleanValue()) {
            try {
                C0791Wd c0791Wd = (C0791Wd) interfaceC0825Yd;
                Parcel parcelH0 = c0791Wd.h0();
                parcelH0.writeString("The updating URL feature is not enabled.");
                c0791Wd.I0(parcelH0, 2);
                return;
            } catch (RemoteException e6) {
                u2.k.f("", e6);
                return;
            }
        }
        CallableC0119g callableC0119g = new CallableC0119g(this, arrayList, aVar, 0);
        C0623Mf c0623Mf = (C0623Mf) this.f294g;
        InterfaceFutureC2326a interfaceFutureC2326aB = c0623Mf.b(callableC0119g);
        C0944be c0944be = this.i;
        if (c0944be == null || (map = c0944be.f13396b) == null || map.isEmpty()) {
            u2.k.g("Asset view map is empty.");
        } else {
            interfaceFutureC2326aB = AbstractC1984ut.F(interfaceFutureC2326aB, new C0120h(0, this), c0623Mf);
        }
        int i = 0;
        interfaceFutureC2326aB.a(new CD(interfaceFutureC2326aB, i, new C0116d(this, interfaceC0825Yd, z6, i)), this.f289b.b());
    }

    public final void L3(ArrayList arrayList, S2.a aVar, InterfaceC0825Yd interfaceC0825Yd, boolean z6) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        InterfaceFutureC2326a interfaceFutureC2326aF;
        Map map;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.w8)).booleanValue()) {
            u2.k.h("The updating URL feature is not enabled.");
            try {
                C0791Wd c0791Wd = (C0791Wd) interfaceC0825Yd;
                Parcel parcelH0 = c0791Wd.h0();
                parcelH0.writeString("The updating URL feature is not enabled.");
                c0791Wd.I0(parcelH0, 2);
                return;
            } catch (RemoteException e6) {
                u2.k.f("", e6);
                return;
            }
        }
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        int i6 = 0;
        while (true) {
            arrayList2 = this.M;
            arrayList3 = this.f280L;
            if (i6 >= size) {
                break;
            }
            Object obj = arrayList.get(i6);
            i6++;
            if (O3((Uri) obj, arrayList3, arrayList2)) {
                i3++;
            }
        }
        if (i3 > 1) {
            u2.k.h("Multiple google urls found: ".concat(String.valueOf(arrayList)));
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            Uri uri = (Uri) obj2;
            if (O3(uri, arrayList3, arrayList2)) {
                CallableC0119g callableC0119g = new CallableC0119g(this, uri, aVar, 1);
                C0623Mf c0623Mf = (C0623Mf) this.f294g;
                InterfaceFutureC2326a interfaceFutureC2326aB = c0623Mf.b(callableC0119g);
                C0944be c0944be = this.i;
                if (c0944be == null || (map = c0944be.f13396b) == null || map.isEmpty()) {
                    u2.k.g("Asset view map is empty.");
                    interfaceFutureC2326aF = interfaceFutureC2326aB;
                } else {
                    interfaceFutureC2326aF = AbstractC1984ut.F(interfaceFutureC2326aB, new C0120h(1, this), c0623Mf);
                }
            } else {
                u2.k.h("Not a Google URL: ".concat(String.valueOf(uri)));
                interfaceFutureC2326aF = AbstractC1984ut.e(uri);
            }
            arrayList4.add(interfaceFutureC2326aF);
        }
        C1789rD c1789rD = new C1789rD(LB.m(arrayList4), true);
        c1789rD.a(new CD(c1789rD, 0, new C0116d(this, interfaceC0825Yd, z6, 1)), this.f289b.b());
    }

    public final void M3() {
        E9 e9 = H9.Oa;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (!((Boolean) g9.a(e9)).booleanValue() || ((Boolean) g92.a(H9.Ra)).booleanValue()) {
            return;
        }
        if (((Boolean) g92.a(H9.Va)).booleanValue() && this.f283P.getAndSet(true)) {
            return;
        }
        N3();
    }

    public final void N3() {
        BinderC0126n binderC0126n;
        InterfaceFutureC2326a interfaceFutureC2326aB;
        if (((Boolean) AbstractC1642oa.f15959e.v()).booleanValue()) {
            L l2 = this.f287T;
            synchronized (l2) {
                l2.c(true);
                l2.c(false);
            }
            return;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.oc)).booleanValue()) {
            interfaceFutureC2326aB = AbstractC1984ut.B(new A0.e(1, this), AbstractC0640Nf.f10005a);
            binderC0126n = this;
        } else {
            binderC0126n = this;
            interfaceFutureC2326aB = (InterfaceFutureC2326a) binderC0126n.P3(this.f290c, null, "BANNER", null, null, 0, null, new Bundle(), null).f13794b.c();
        }
        C0117e c0117e = new C0117e(0, this);
        interfaceFutureC2326aB.a(new CD(interfaceFutureC2326aB, 0, c0117e), binderC0126n.f289b.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1057di P3(android.content.Context r43, java.lang.String r44, java.lang.String r45, q2.d1 r46, q2.a1 r47, int r48, java.lang.String r49, android.os.Bundle r50, com.google.android.gms.internal.ads.C0436Bf r51) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.BinderC0126n.P3(android.content.Context, java.lang.String, java.lang.String, q2.d1, q2.a1, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.Bf):com.google.android.gms.internal.ads.di");
    }

    public final AbstractC2221zD Q3(final String str) {
        final C1547mn[] c1547mnArr = new C1547mn[1];
        InterfaceFutureC2326a interfaceFutureC2326aB = this.f293f.b();
        InterfaceC1736qD interfaceC1736qD = new InterfaceC1736qD() { // from class: A2.l
            @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
            public final /* synthetic */ InterfaceFutureC2326a b(Object obj) throws JSONException {
                C1547mn c1547mn = (C1547mn) obj;
                BinderC0126n binderC0126n = this.f259a;
                binderC0126n.getClass();
                c1547mnArr[0] = c1547mn;
                Context context = binderC0126n.f290c;
                C0944be c0944be = binderC0126n.i;
                Map map = c0944be.f13396b;
                JSONObject jSONObjectC = a4.t.C(context, map, map, c0944be.f13395a, null);
                JSONObject jSONObjectZ = a4.t.z(binderC0126n.f290c, binderC0126n.i.f13395a);
                JSONObject jSONObjectA = a4.t.A(binderC0126n.i.f13395a);
                JSONObject jSONObjectB = a4.t.B(binderC0126n.f290c, binderC0126n.i.f13395a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectC);
                jSONObject.put("ad_view_signal", jSONObjectZ);
                jSONObject.put("scroll_view_signal", jSONObjectA);
                jSONObject.put("lock_screen_signal", jSONObjectB);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", a4.t.D(null, binderC0126n.f290c, binderC0126n.f297k, binderC0126n.f296j));
                }
                return c1547mn.a(str2, jSONObject);
            }
        };
        ID id = this.f294g;
        C1306iD c1306iDF = AbstractC1984ut.F(interfaceFutureC2326aB, interfaceC1736qD, id);
        c1306iDF.a(new A1.d(this, c1547mnArr, 1, false), id);
        return AbstractC1984ut.C(AbstractC1984ut.G((AbstractC2221zD) AbstractC1984ut.E(AbstractC2221zD.r(c1306iDF), ((Integer) C2841s.f23267e.f23270c.a(H9.x8)).intValue(), TimeUnit.MILLISECONDS, this.f295h), C0123k.f256b, id), Exception.class, C0123k.f257c, id);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2132xf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T2(S2.a r11, com.google.android.gms.internal.ads.C0436Bf r12, com.google.android.gms.internal.ads.InterfaceC1970uf r13) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.BinderC0126n.T2(S2.a, com.google.android.gms.internal.ads.Bf, com.google.android.gms.internal.ads.uf):void");
    }
}
