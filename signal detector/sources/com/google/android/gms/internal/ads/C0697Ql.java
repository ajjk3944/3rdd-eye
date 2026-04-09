package com.google.android.gms.internal.ads;

import M2.InterfaceC0163c;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import b4.C0355t;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j2.C2545a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import q2.C2852x0;
import t2.AbstractC2907C;
import u2.C2951a;
import w2.InterfaceC2973e;

/* renamed from: com.google.android.gms.internal.ads.Ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0697Ql implements InterfaceC1615o0, InterfaceC2104x4, InterfaceC0163c, InterfaceC0674Pf, InterfaceC2973e, BD, KD, InterfaceC0482Ea, InterfaceC1864sh, InterfaceC0803Wp, InterfaceC0595Kl, Iu, InterfaceC1223gl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10690a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10691b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10692c;

    public /* synthetic */ C0697Ql() {
        this.f10690a = 3;
    }

    public void A(int i, int i3, int i6, int i7) throws JSONException {
        try {
            ((InterfaceC0828Yg) this.f10691b).p("onSizeChanged", new JSONObject().put("x", i).put("y", i3).put("width", i6).put("height", i7));
        } catch (JSONException e6) {
            u2.k.f("Error occurred while dispatching size change.", e6);
        }
    }

    public void B(BN bn) {
        synchronized (bn) {
        }
        Handler handler = (Handler) this.f10691b;
        if (handler != null) {
            handler.post(new CD(this, 2, bn));
        }
    }

    public void C(String str) throws JSONException {
        try {
            ((InterfaceC0828Yg) this.f10691b).p("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e6) {
            u2.k.f("Error occurred while dispatching state change.", e6);
        }
    }

    public void D(int i, int i3, int i6, int i7, int i8, float f2) {
        try {
            ((InterfaceC0828Yg) this.f10691b).p("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i3).put("maxSizeWidth", i6).put("maxSizeHeight", i7).put("density", f2).put("rotation", i8));
        } catch (JSONException e6) {
            u2.k.f("Error occurred while obtaining screen information.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: a */
    public /* synthetic */ XD mo10a() {
        AtomicInteger atomicInteger = C0641Ng.f10012I;
        XD xdMo10a = ((KD) this.f10691b).mo10a();
        byte[] bArr = (byte[]) this.f10692c;
        return new C0607Lg(new C1142fC(bArr), bArr.length, xdMo10a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) {
        Ju ju = (Ju) this.f10691b;
        ((Nu) obj).p((Ku) ju.f9392a, ju.f9393b, (Throwable) this.f10692c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public Qt c() {
        return (Qt) this.f10692c;
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        switch (this.f10690a) {
            case 11:
                ((InterfaceC0691Qf) this.f10691b).mo4b(obj);
                return;
            case 15:
                List list = ((C1974uj) obj).f17148a;
                C1726q3 c1726q3 = (C1726q3) this.f10691b;
                C2136xj c2136xj = (C2136xj) this.f10692c;
                Executor executor = c2136xj.f17621a;
                if (list == null || list.isEmpty()) {
                    executor.execute(new RunnableC2082wj(c1726q3, 0));
                    return;
                }
                InterfaceFutureC2326a interfaceFutureC2326aF = ED.f7928b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    interfaceFutureC2326aF = AbstractC1984ut.F(AbstractC1984ut.D(interfaceFutureC2326aF, Throwable.class, new C0738Tb(3, c1726q3), executor), new C2028vj(c2136xj, c1726q3, (InterfaceFutureC2326a) it.next(), 0), executor);
                }
                interfaceFutureC2326aF.a(new CD(interfaceFutureC2326aF, 0, new C0889ae(c2136xj, c1726q3)), executor);
                return;
            case 19:
                ((InterfaceC0828Yg) obj).j1((String) this.f10691b, (InterfaceC0466Db) this.f10692c);
                return;
            case 21:
                String str = (String) obj;
                try {
                    C1700pe c1700pe = (C1700pe) this.f10692c;
                    C1324ie c1324ie = (C1324ie) this.f10691b;
                    Parcel parcelH0 = c1700pe.h0();
                    parcelH0.writeString(str);
                    C7.c(parcelH0, c1324ie);
                    c1700pe.I0(parcelH0, 1);
                    return;
                } catch (RemoteException e6) {
                    AbstractC2907C.n("Service can't call client", e6);
                    return;
                }
            default:
                K4.c cVar = (K4.c) this.f10692c;
                InterfaceC0719Rq interfaceC0719Rq = (InterfaceC0719Rq) obj;
                synchronized (cVar) {
                    try {
                        ((C0583Jq) cVar.f2211d).b(interfaceC0719Rq, (Qt) this.f10691b);
                        Qt qtA = ((C0583Jq) cVar.f2211d).a();
                        if (qtA != null) {
                            cVar.q(qtA);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0482Ea
    public JSONObject f() {
        return ((B7) this.f10691b).q();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a2 A[LOOP:0: B:177:0x0012->B:155:0x02a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c2 A[EDGE_INSN: B:189:0x02c2->B:156:0x02c2 BREAK  A[LOOP:0: B:177:0x0012->B:155:0x02a2], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2104x4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.A4 g(com.google.android.gms.internal.ads.C4 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0697Ql.g(com.google.android.gms.internal.ads.C4):com.google.android.gms.internal.ads.A4");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnTouchListener, com.google.android.gms.internal.ads.B7] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0482Ea
    public void h(MotionEvent motionEvent) {
        ((B7) this.f10691b).onTouch(null, motionEvent);
    }

    public void i(Eu eu) {
        J6 j6 = new J6(5, (C0480Dp) this.f10691b);
        C0623Mf c0623Mf = (C0623Mf) ((ID) this.f10692c);
        InterfaceFutureC2326a interfaceFutureC2326aB = c0623Mf.b(j6);
        interfaceFutureC2326aB.a(new CD(interfaceFutureC2326aB, 0, new L6(this, eu)), c0623Mf);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a A[EDGE_INSN: B:67:0x011a->B:51:0x011a BREAK  A[LOOP:1: B:39:0x00e3->B:50:0x0109], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1615o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.C1561n0 j(com.google.android.gms.internal.ads.InterfaceC2046w0 r17, long r18) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0697Ql.j(com.google.android.gms.internal.ads.w0, long):com.google.android.gms.internal.ads.n0");
    }

    @Override // w2.InterfaceC2973e
    public void k(C2545a c2545a) {
        try {
            ((InterfaceC1429kd) this.f10691b).a(c2545a.b());
        } catch (RemoteException e6) {
            u2.k.f("", e6);
        }
    }

    @Override // M2.InterfaceC0163c
    public void k0(J2.b bVar) {
        synchronized (((A1.s) this.f10692c).f125d) {
            ((C2000v8) this.f10691b).c(new RuntimeException("Connection failed."));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1864sh
    public /* synthetic */ void l(String str, int i, String str2, boolean z6) {
        C0511Fm c0511Fm = (C0511Fm) this.f10691b;
        Map map = (Map) this.f10692c;
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        c0511Fm.f8182b.d(map2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0482Ea
    public JSONObject m() {
        return ((B7) this.f10691b).l();
    }

    public void o(Qt qt) {
        r("aai", qt.f10798w);
        r("request_id", qt.f10782n0);
        r("ad_format", Qt.a(qt.f10759b));
    }

    @Override // w2.InterfaceC2973e
    public Object onSuccess(Object obj) {
        try {
            ((InterfaceC1429kd) this.f10691b).p0(new S2.b(((i2.f) obj).f20564e));
        } catch (RemoteException e6) {
            u2.k.f("", e6);
        }
        return new C2130xd((InterfaceC0688Qc) this.f10692c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public void p(boolean z6, Context context, C1760qk c1760qk) throws C0578Jl {
        C1123eu c1123eu;
        try {
            C1392ju c1392ju = (C1392ju) ((C1119eq) this.f10691b).f13987b;
            c1392ju.b(z6);
            try {
                c1392ju.f15016a.I();
            } finally {
            }
        } catch (C1123eu e6) {
            u2.k.i("Cannot show rewarded video.", e6);
            throw new C0578Jl(e6.getCause());
        }
    }

    public void q(boolean z6, boolean z7) {
        synchronized (this) {
            boolean z8 = false;
            if (z6) {
                if (((PowerManager.WakeLock) this.f10692c) == null) {
                    Context context = (Context) this.f10691b;
                    if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        AbstractC2022vd.v("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        AbstractC2022vd.v("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f10692c = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f10692c;
            if (wakeLock == null) {
                return;
            }
            if (z6 && z7) {
                z8 = true;
            }
            if (z8) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public void r(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        ((ConcurrentHashMap) this.f10691b).put(str, str2);
    }

    public void s() {
        ((C0784Vn) this.f10692c).f12084b.execute(new RunnableC0767Un(this, 2));
    }

    public Set t(C0695Qj c0695Qj) {
        return Collections.singleton(new C1922tl(c0695Qj, AbstractC0640Nf.f10011g));
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        switch (this.f10690a) {
            case 11:
                ((InterfaceC0674Pf) this.f10692c).mo6a();
                return;
            case 15:
                ((C1726q3) this.f10691b).u(th);
                C2136xj c2136xj = (C2136xj) this.f10692c;
                c2136xj.getClass();
                AbstractC0640Nf.f10010f.execute(new RunnableC0558Ii(2, c2136xj));
                return;
            case 19:
                return;
            case 21:
                try {
                    C1700pe c1700pe = (C1700pe) this.f10692c;
                    C2852x0 c2852x0I = AbstractC1984ut.i(th);
                    t2.o oVar = new t2.o(C1476lN.k(th.getMessage()) ? c2852x0I.f23274b : th.getMessage(), c2852x0I.f23273a);
                    Parcel parcelH0 = c1700pe.h0();
                    C7.c(parcelH0, oVar);
                    c1700pe.I0(parcelH0, 2);
                    return;
                } catch (RemoteException e6) {
                    AbstractC2907C.n("Service can't call client", e6);
                    return;
                }
            default:
                K4.c cVar = (K4.c) this.f10692c;
                synchronized (cVar) {
                    try {
                        C0583Jq c0583Jq = (C0583Jq) cVar.f2211d;
                        Qt qt = (Qt) this.f10691b;
                        c0583Jq.c(qt);
                        Qt qtA = ((C0583Jq) cVar.f2211d).a();
                        if (qt.v0) {
                            while (qtA != null) {
                                cVar.q(qtA);
                                qtA = ((C0583Jq) cVar.f2211d).a();
                            }
                        } else if (qtA != null) {
                            cVar.q(qtA);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public u2.m v() {
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.xf)).booleanValue();
        u2.m mVar = u2.m.f23816a;
        if (!zBooleanValue) {
            s();
            return mVar;
        }
        C0784Vn c0784Vn = (C0784Vn) this.f10692c;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f10691b;
        C0852Zn c0852Zn = c0784Vn.f12083a;
        c0852Zn.getClass();
        if (concurrentHashMap.isEmpty()) {
            u2.k.c("Empty paramMap.");
            return mVar;
        }
        String strA = c0852Zn.f12963f.a(concurrentHashMap);
        AbstractC2907C.m(strA);
        return c0852Zn.f12961d.a(null, strA);
    }

    public Set w(C0695Qj c0695Qj) {
        return Collections.singleton(new C1922tl(c0695Qj, AbstractC0640Nf.f10011g));
    }

    public void x() {
        ((C0784Vn) this.f10692c).f12084b.execute(new RunnableC0767Un(this, 0));
    }

    public void y(C1161fd c1161fd) {
        Handler handler = (Handler) this.f10691b;
        if (handler != null) {
            handler.post(new CD(this, 1, c1161fd));
        }
    }

    public void z(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, str).put("action", (String) this.f10692c);
            InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f10691b;
            if (interfaceC0828Yg != null) {
                interfaceC0828Yg.p("onError", jSONObjectPut);
            }
        } catch (JSONException e6) {
            u2.k.f("Error occurred while dispatching error event.", e6);
        }
    }

    public C0697Ql(Context context) {
        this.f10690a = 28;
        this.f10691b = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1615o0
    /* renamed from: c, reason: collision with other method in class */
    public void mo9c() {
        byte[] bArr = Vt.f12097b;
        int length = bArr.length;
        ((C2036vr) this.f10692c).z(0, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0697Ql(InterfaceViewOnClickListenerC0528Gm interfaceViewOnClickListenerC0528Gm, ViewGroup viewGroup) {
        this.f10690a = 17;
        this.f10691b = (B7) interfaceViewOnClickListenerC0528Gm;
        this.f10692c = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0803Wp
    /* renamed from: a, reason: collision with other method in class */
    public Object mo8a() {
        C2951a c2951a = (C2951a) this.f10691b;
        int i = c2951a.f23785b;
        int i3 = c2951a.f23786c;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i3).length());
        sb.append(i);
        sb.append(".");
        sb.append(i3);
        String string = sb.toString();
        if (!TextUtils.isEmpty("Google")) {
            if (!TextUtils.isEmpty(string)) {
                return new Vv(new K9("Google", string), (WebView) this.f10692c);
            }
            throw new IllegalArgumentException("Version is null or empty");
        }
        throw new IllegalArgumentException("Name is null or empty");
    }

    public /* synthetic */ C0697Ql(Object obj, int i, Object obj2) {
        this.f10690a = i;
        this.f10691b = obj;
        this.f10692c = obj2;
    }

    public /* synthetic */ C0697Ql(Object obj, Object obj2, int i, boolean z6) {
        this.f10690a = i;
        this.f10691b = obj2;
        this.f10692c = obj;
    }

    public /* synthetic */ C0697Ql(Object obj, Object obj2, Object obj3, int i) {
        this.f10690a = i;
        this.f10691b = obj2;
        this.f10692c = obj3;
    }

    public C0697Ql(Handler handler, NN nn) {
        this.f10690a = 1;
        if (nn != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f10691b = handler;
        this.f10692c = nn;
    }

    public C0697Ql(C1994v2 c1994v2) {
        this.f10690a = 5;
        J4 j42 = new J4(0, (byte) 0);
        this.f10691b = c1994v2;
        this.f10692c = j42;
    }

    public C0697Ql(C1547mn c1547mn, String str, InterfaceC0466Db interfaceC0466Db) {
        this.f10690a = 19;
        this.f10691b = str;
        this.f10692c = interfaceC0466Db;
        Objects.requireNonNull(c1547mn);
    }

    public C0697Ql(C0784Vn c0784Vn) {
        this.f10690a = 20;
        this.f10692c = c0784Vn;
        this.f10691b = new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View$OnClickListener, com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0674Pf, com.google.android.gms.internal.ads.InterfaceC0482Ea, com.google.android.gms.internal.ads.Dr
    /* renamed from: a */
    public void mo6a() {
        switch (this.f10690a) {
            case 7:
                AbstractC2907C.m("callJs > getEngine: Promise rejected");
                ((C0657Of) this.f10691b).c(new C0355t("Unable to obtain a JavascriptEngine."));
                ((C1967uc) this.f10692c).D();
                break;
            case 17:
                C1197gC c1197gC = ViewTreeObserverOnGlobalLayoutListenerC1923tm.f16962D;
                ?? r12 = (B7) this.f10691b;
                Map mapK = r12.k();
                if (mapK != null) {
                    int i = c1197gC.f14229d;
                    int i3 = 0;
                    while (i3 < i) {
                        Object obj = mapK.get((String) c1197gC.get(i3));
                        i3++;
                        if (obj != null) {
                            r12.onClick((ViewGroup) this.f10692c);
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                C1120er c1120er = (C1120er) this.f10691b;
                M9 m9 = (M9) this.f10692c;
                N9 n9 = (N9) c1120er.f13992d;
                Parcel parcelH0 = n9.h0();
                C7.e(parcelH0, m9);
                n9.I0(parcelH0, 1);
                break;
        }
    }

    public C0697Ql(BinderC2196yp binderC2196yp, C1700pe c1700pe, C1324ie c1324ie) {
        this.f10690a = 21;
        this.f10692c = c1700pe;
        this.f10691b = c1324ie;
    }

    public /* synthetic */ C0697Ql(C2038vt c2038vt) {
        this.f10690a = 4;
        this.f10691b = c2038vt;
        this.f10692c = new C2036vr();
    }

    private final void n(Throwable th) {
    }
}
