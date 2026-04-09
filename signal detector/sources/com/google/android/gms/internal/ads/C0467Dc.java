package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import b4.C0355t;
import f4.InterfaceFutureC2326a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0467Dc implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7789c;

    public /* synthetic */ C0467Dc(Object obj, int i, Object obj2) {
        this.f7787a = i;
        this.f7788b = obj;
        this.f7789c = obj2;
    }

    private final InterfaceFutureC2326a a(Object obj) {
        C1877su c1877su;
        C1338iu c1338iu = (C1338iu) this.f7788b;
        InterfaceC0848Zj interfaceC0848Zj = (InterfaceC0848Zj) this.f7789c;
        C2146xt c2146xt = (C2146xt) obj;
        C1338iu c1338iu2 = (C1338iu) c1338iu.f14822b;
        InterfaceC1931tu interfaceC1931tu = c2146xt.f17640b;
        C1807re c1807re = c2146xt.f17639a;
        synchronized (c1338iu2) {
            try {
                C1608nu c1608nu = (C1608nu) ((ConcurrentHashMap) c1338iu2.f14822b).get(interfaceC1931tu);
                c1877su = null;
                if (c1608nu != null) {
                    Bu bu = c1608nu.f15845d;
                    bu.getClass();
                    p2.j.f22785C.f22797k.getClass();
                    bu.f7461c = System.currentTimeMillis();
                    bu.f7462d++;
                    c1608nu.a();
                    LinkedList linkedList = c1608nu.f15842a;
                    if (!linkedList.isEmpty() && (c1877su = (C1877su) linkedList.remove()) != null) {
                        bu.f7463e++;
                        bu.f7460b.f7064a = true;
                    }
                    if (c1877su == null) {
                        ((C1716pu) c1338iu2.f14824d).f16254e++;
                    }
                    Au au = c1608nu.f15845d.f7460b;
                    Au auClone = au.clone();
                    au.f7064a = false;
                    au.f7065b = 0;
                    if (c1877su != null) {
                        Z8 z8A = C1084e9.A();
                        X8 x8B = Y8.B();
                        x8B.b();
                        ((Y8) x8B.f13551b).C();
                        C0866a9 c0866a9A = C0921b9.A();
                        boolean z6 = auClone.f7064a;
                        c0866a9A.b();
                        ((C0921b9) c0866a9A.f13551b).C(z6);
                        int i = auClone.f7065b;
                        c0866a9A.b();
                        ((C0921b9) c0866a9A.f13551b).D(i);
                        x8B.b();
                        ((Y8) x8B.f13551b).D((C0921b9) c0866a9A.d());
                        z8A.b();
                        ((C1084e9) z8A.f13551b).B((Y8) x8B.d());
                        c1877su.f16818a.a().f7399f.y((C1084e9) z8A.d());
                    }
                    c1338iu2.E();
                } else {
                    ((C1716pu) c1338iu2.f14824d).f16253d++;
                    c1338iu2.E();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1877su != null && c1807re != null) {
            C0440Bj c0440BjA = interfaceC0848Zj.a();
            C1338iu c1338iu3 = c0440BjA.f7401h;
            Ju juU = c0440BjA.f7396c.a(c1338iu3.F(c1807re, new L6(22, c1338iu3), new C1283hr(23, c1338iu3), C1704pi.f16205f), Ku.NOTIFY_CACHE_HIT).u();
            juU.a(new CD(juU, 0, new Nx(12, c0440BjA)), c0440BjA.f7402j);
            juU.a(new CD(juU, 0, (C1285ht) c1338iu.f14824d), (Executor) c1338iu.f14823c);
        }
        return AbstractC1984ut.e(new C1876st(interfaceC1931tu, c1807re, c1877su));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) throws JSONException, C0355t {
        C0736Sq c0736Sq;
        boolean z6 = false;
        switch (this.f7787a) {
            case 0:
                InterfaceC2075wc interfaceC2075wc = (InterfaceC2075wc) obj;
                interfaceC2075wc.e((String) this.f7788b, (InterfaceC0466Db) this.f7789c);
                return AbstractC1984ut.e(interfaceC2075wc);
            case 1:
                C0518Gc c0518Gc = (C0518Gc) this.f7788b;
                Object obj2 = this.f7789c;
                C0657Of c0657Of = new C0657Of();
                C2911G c2911g = p2.j.f22785C.f22790c;
                String string = UUID.randomUUID().toString();
                AbstractC0449Cb.f7607j.b(string, new C0585Kb(c0518Gc, c0657Of));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", string);
                jSONObject.put("args", (JSONObject) obj2);
                ((InterfaceC2075wc) obj).b("google.afma.activeView.handleUpdate", jSONObject);
                return c0657Of;
            case 2:
                C2189yi c2189yi = (C2189yi) this.f7788b;
                Uri.Builder builder = (Uri.Builder) this.f7789c;
                ((C0623Mf) c2189yi.f17745e).a(new RunnableC2135xi(c2189yi, (Throwable) obj, 0));
                builder.appendQueryParameter((String) C2841s.f23267e.f23270c.a(H9.vb), "9");
                return AbstractC1984ut.e(builder.toString());
            case 3:
                C0440Bj c0440Bj = (C0440Bj) this.f7788b;
                C1807re c1807re = (C1807re) obj;
                c1807re.i = (C1823ru) this.f7789c;
                C1338iu c1338iu = c0440Bj.f7401h;
                return c1338iu.F(c1807re, new Nx(20, (C1549mp) c1338iu.f14823c), new Rx(24, c1338iu), new C0955bp(c1807re, 2));
            case 4:
                C0851Zm c0851Zm = (C0851Zm) this.f7788b;
                JSONObject jSONObject2 = (JSONObject) this.f7789c;
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                C0942bc c0942bc = c0851Zm.f12949a.f13480b;
                C2000v8 c2000v8 = new C2000v8(interfaceC0828Yg);
                if (c0942bc != null) {
                    interfaceC0828Yg.f1(new T2.d(5, 0, 0));
                } else {
                    interfaceC0828Yg.f1(new T2.d(4, 0, 0));
                }
                interfaceC0828Yg.l0().f16014g = new C0834Ym(c0851Zm, interfaceC0828Yg, c2000v8, 1);
                interfaceC0828Yg.b("google.afma.nativeAds.renderVideo", jSONObject2);
                return c2000v8;
            case 5:
                C1173fp c1173fp = (C1173fp) this.f7788b;
                C0450Cc c0450Cc = (C0450Cc) this.f7789c;
                JSONObject jSONObject3 = (JSONObject) obj;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8578D2)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c1173fp.i.f11461e, "scar-preloader-processing-done");
                }
                return c0450Cc.a(jSONObject3);
            case 6:
                C1173fp c1173fp2 = (C1173fp) this.f7788b;
                List list = (List) this.f7789c;
                Exception exc = (Exception) obj;
                p2.j.f22785C.f22795h.g("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    c0736Sq = new C0736Sq(1, "Timed out waiting for ad response.");
                } else if (exc instanceof C0736Sq) {
                    c0736Sq = (C0736Sq) exc;
                } else {
                    c0736Sq = new C0736Sq(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                String message = c0736Sq.getMessage() == null ? "" : c0736Sq.getMessage();
                if (list != null && !list.isEmpty()) {
                    String str = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = "timeout";
                            str = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List listJ = C1448kw.f(new MA(':')).j(message);
                            if (listJ.size() == 2) {
                                message = (String) listJ.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C2148xv.c(C2148xv.c((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
                    }
                    c1173fp2.f14151j.a(arrayList, null);
                }
                return AbstractC1984ut.w(c0736Sq);
            case 7:
                return ((InterfaceC1711pp) ((InterfaceC2069wN) this.f7788b).c()).e((C1807re) this.f7789c);
            case 8:
                Bundle bundle = (Bundle) obj;
                C1431kf c1431kf = (C1431kf) this.f7788b;
                L2.w wVar = (L2.w) c1431kf.f15173b;
                C0710Rh c0710Rh = (C0710Rh) c1431kf.f15176e;
                Context context = c0710Rh.f10984a.f7822b;
                Cr.v(context);
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                C1807re c1807re2 = (C1807re) wVar.f2570c;
                Cr.v(c1807re2.f16579d);
                C0904at c0904at = new C0904at();
                C1799rN c1799rN = c0710Rh.f10989d;
                Lr lr = new Lr(c0904at, 0L, (ScheduledExecutorService) c1799rN.c());
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c1799rN.c();
                Context context2 = c0710Rh.f10984a.f7822b;
                Cr.v(context2);
                Lr lr2 = new Lr(new Gr(6, scheduledExecutorService), ((Long) C2841s.f23267e.f23270c.a(H9.f8681U4)).longValue(), (ScheduledExecutorService) c1799rN.c());
                W9 w9 = new W9(18);
                Cr.v(context2);
                Lr lr3 = new Lr(new Ws(w9, context2, (ScheduledExecutorService) c1799rN.c(), c0623Mf, wVar.f2569b, c1807re2.f16586l, c1807re2.f16585k), 0L, (ScheduledExecutorService) c1799rN.c());
                Lr lr4 = new Lr(new C1606ns(c0623Mf, 4), 0L, (ScheduledExecutorService) c1799rN.c());
                C1606ns c1606ns = new C1606ns(c0623Mf, 3);
                Cr.v(c0623Mf);
                List list2 = ((C1807re) wVar.f2570c).f16580e;
                Cr.v(list2);
                Yr yr = new Yr(c0623Mf, 7, list2);
                L2.w wVar2 = (L2.w) c1431kf.f15173b;
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                C1807re c1807re3 = (C1807re) wVar2.f2570c;
                String string2 = c1807re3.f16576a.getString("ms");
                if (string2 == null) {
                    string2 = "";
                }
                PackageInfo packageInfo = c1807re3.f16581f;
                Yr yr2 = new Yr(c0623Mf2, 6, string2);
                Ms ms = (Ms) c0710Rh.f10972O0.c();
                C1799rN c1799rN2 = c0710Rh.f10946B;
                Cr.v(c1807re2.f16579d);
                return new Ps(context, c0623Mf, RB.h(lr, lr2, lr3, lr4, c1606ns, yr, yr2, ms, new Qr((C0538Hf) c1799rN2.c(), (ScheduledExecutorService) c1799rN.c(), c0623Mf), new C1067dt((C0538Hf) c1799rN2.c(), c1807re2.f16585k, c0623Mf, (ScheduledExecutorService) c1799rN.c(), wVar.x(), c1807re2.f16575C)), (Xu) ((C1799rN) c1431kf.f15174c).c(), (C0784Vn) c0710Rh.f11000j.c()).a(q2.r.f23260g.f23261a.k(bundle), ((C1807re) this.f7789c).f16587m, false);
            case 9:
                return ((Ps) this.f7788b).a(q2.r.f23260g.f23261a.k((Bundle) obj), ((C1807re) this.f7789c).f16587m, false);
            case 10:
                C0532Gq c0532Gq = (C0532Gq) this.f7788b;
                C1547mn c1547mn = (C1547mn) this.f7789c;
                JSONObject jSONObject4 = (JSONObject) obj;
                C1446ku c1446ku = c0532Gq.f8449d;
                ED edE = AbstractC1984ut.e(c1547mn);
                synchronized (c1446ku) {
                    c1446ku.f15310a.addFirst(edE);
                }
                if (!jSONObject4.optBoolean("success")) {
                    throw new C0355t("process json failed");
                }
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8578D2)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0532Gq.f8451f.f11461e, "rendering-native-ads-preprocess-end");
                }
                return AbstractC1984ut.e(jSONObject4.getJSONObject("json").getJSONArray("ads"));
            case 11:
                C0532Gq c0532Gq2 = (C0532Gq) this.f7788b;
                Qt qt = (Qt) this.f7789c;
                C1547mn c1547mn2 = (C1547mn) obj;
                E9 e9 = H9.f8578D2;
                C2841s c2841s = C2841s.f23267e;
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    A.f.r(p2.j.f22785C.f22797k, c0532Gq2.f8451f.f11461e, "rendering-native-ads-preprocess-start");
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("isNonagon", true);
                if (((Boolean) c2841s.f23270c.a(H9.M9)).booleanValue() && Q2.b.f()) {
                    jSONObject5.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("response", qt.f10791s.f11813c);
                jSONObject6.put("sdk_params", jSONObject5);
                return AbstractC1984ut.F(c1547mn2.a("google.afma.nativeAds.preProcessJson", jSONObject6), new C0467Dc(c0532Gq2, 10, c1547mn2), c0532Gq2.f8447b);
            case 12:
                Xt xt = (Xt) obj;
                ((C1877su) this.f7788b).f16819b = xt;
                Iterator it2 = ((List) xt.f12510b.f15173b).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = ((Qt) it2.next()).f10757a.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()).contains("FirstPartyRenderer")) {
                                z6 = true;
                            }
                        }
                    } else if (z6) {
                        return ((C0440Bj) this.f7789c).c(AbstractC1984ut.e(xt));
                    }
                }
                return ED.f7928b;
            case 13:
                return a(obj);
            default:
                return ((My) ((Ux) this.f7788b).f11841b.f10818f.get()).f((Context) this.f7789c);
        }
    }
}
