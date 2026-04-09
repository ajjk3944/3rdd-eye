package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.C2911G;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Ii, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0558Ii implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9139b;

    public /* synthetic */ RunnableC0558Ii(int i, Object obj) {
        this.f9138a = i;
        this.f9139b = obj;
    }

    private final /* synthetic */ void a() {
        C0695Qj c0695Qj = (C0695Qj) this.f9139b;
        synchronized (c0695Qj) {
            try {
                PD pd = c0695Qj.f10686f;
                if (pd.isDone()) {
                    return;
                }
                pd.d(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final /* synthetic */ void b() {
        C0780Vj c0780Vj = (C0780Vj) this.f9139b;
        synchronized (c0780Vj.f12071a) {
            try {
                if (c0780Vj.i) {
                    return;
                }
                c0780Vj.i = true;
                c0780Vj.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        C1760qk c1760qk = (C1760qk) this.f9139b;
        synchronized (c1760qk) {
            u2.k.e("Timeout waiting for show call succeed to be called.");
            c1760qk.W(new C0578Jl("Timeout for show call succeed."));
            c1760qk.f16395e = true;
        }
    }

    private final void d() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        C0615Lo c0615Lo = (C0615Lo) this.f9139b;
        InterfaceC0828Yg interfaceC0828Yg = c0615Lo.f9761d;
        C0581Jo c0581Jo = c0615Lo.f9760c;
        synchronized (c0581Jo) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("platform", "ANDROID");
                    String str = c0581Jo.f9358k;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                        sb.append("afma-sdk-a-v");
                        sb.append(str);
                        jSONObject.put("sdkVersion", sb.toString());
                    }
                    jSONObject.put("internalSdkVersion", c0581Jo.i);
                    jSONObject.put("osVersion", Build.VERSION.RELEASE);
                    jSONObject.put("adapters", c0581Jo.f9352d.a());
                    E9 e9 = H9.Ga;
                    C2841s c2841s = C2841s.f23267e;
                    if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                        String str2 = p2.j.f22785C.f22795h.f8974g;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("plugin", str2);
                        }
                    }
                    long j6 = c0581Jo.f9364q;
                    p2.j jVar = p2.j.f22785C;
                    jVar.f22797k.getClass();
                    if (j6 < System.currentTimeMillis() / 1000) {
                        c0581Jo.f9362o = "{}";
                    }
                    jSONObject.put("networkExtras", c0581Jo.f9362o);
                    jSONObject.put("adSlots", c0581Jo.j());
                    jSONObject.put("appInfo", c0581Jo.f9353e.b());
                    String str3 = jVar.f22795h.i().s().f7976e;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("cld", new JSONObject(str3));
                    }
                    if (((Boolean) c2841s.f23270c.a(H9.va)).booleanValue() && (jSONObject2 = c0581Jo.f9363p) != null) {
                        String string = jSONObject2.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 13);
                        sb2.append("Server data: ");
                        sb2.append(string);
                        u2.k.c(sb2.toString());
                        jSONObject.put("serverData", c0581Jo.f9363p);
                    }
                    if (((Boolean) c2841s.f23270c.a(H9.ua)).booleanValue()) {
                        jSONObject.put("openAction", c0581Jo.f9369v);
                        jSONObject.put("gesture", c0581Jo.f9365r);
                    }
                    jSONObject.put("isGamRegisteredTestDevice", jVar.f22801o.g());
                    u2.f fVar = q2.r.f23260g.f23261a;
                    jSONObject.put("isSimulator", u2.f.o());
                    if (((Boolean) c2841s.f23270c.a(H9.Ia)).booleanValue()) {
                        jSONObject.put("uiStorage", new JSONObject(c0581Jo.f9371x));
                    }
                    if (!TextUtils.isEmpty((CharSequence) c2841s.f23270c.a(H9.Ka))) {
                        jSONObject.put("gmaDisk", (JSONObject) c0581Jo.f9356h.f15969b);
                    }
                    if (!TextUtils.isEmpty((CharSequence) c2841s.f23270c.a(H9.Ja))) {
                        jSONObject.put("userDisk", (JSONObject) c0581Jo.f9355g.f15969b);
                    }
                } catch (JSONException e6) {
                    p2.j.f22785C.f22795h.g("Inspector.toJson", e6);
                    u2.k.i("Ad inspector encountered an error", e6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        interfaceC0828Yg.f("window.inspectorInfo", jSONObject.toString());
    }

    private final /* synthetic */ void e() {
        C0819Xo c0819Xo = (C0819Xo) this.f9139b;
        AtomicReference atomicReference = c0819Xo.f12495d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(c0819Xo.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f() {
        C1281hp c1281hp = (C1281hp) this.f9139b;
        synchronized (c1281hp.f15280b) {
            try {
                if (c1281hp.f15281c) {
                    return;
                }
                c1281hp.f15281c = true;
                C1838s8 c1838s8 = new C1838s8(c1281hp.f14587g, p2.j.f22785C.f22806t.a(), c1281hp, c1281hp, 2);
                c1281hp.f15284f = c1838s8;
                c1838s8.n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x0017, B:8:0x001b, B:13:0x0023, B:19:0x002f, B:21:0x0033, B:23:0x0039, B:25:0x0043, B:27:0x004d, B:29:0x005e, B:28:0x0052, B:30:0x0060, B:32:0x006f, B:34:0x0077), top: B:42:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f9139b
            com.google.android.gms.internal.ads.qq r0 = (com.google.android.gms.internal.ads.C1766qq) r0
            java.lang.ref.WeakReference r1 = r0.f16403a
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.ads.n r1 = (com.google.android.gms.internal.ads.C1560n) r1
            if (r1 == 0) goto L9e
            com.google.android.gms.internal.ads.Zq r0 = r0.f16405c
            int r0 = r0.c()
            com.google.android.gms.internal.ads.o r2 = r1.f15696a
            monitor-enter(r2)
            int r1 = r2.f15874l     // Catch: java.lang.Throwable -> L20
            if (r1 != r0) goto L23
            java.lang.String r1 = r2.f15875m     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L9a
            goto L23
        L20:
            r0 = move-exception
            goto L9c
        L23:
            r2.f15874l = r0     // Catch: java.lang.Throwable -> L20
            r1 = 1
            if (r0 == r1) goto L9a
            if (r0 == 0) goto L9a
            r1 = 8
            if (r0 != r1) goto L2f
            goto L9a
        L2f:
            java.lang.String r1 = r2.f15875m     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L60
            android.content.Context r1 = r2.f15864a     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = com.google.android.gms.internal.ads.Vt.f12096a     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L52
            java.lang.String r3 = "phone"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.Throwable -> L20
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L52
            java.lang.String r1 = r1.getNetworkCountryIso()     // Catch: java.lang.Throwable -> L20
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L52
            java.lang.String r1 = com.google.android.gms.internal.ads.AbstractC0582Jp.u(r1)     // Catch: java.lang.Throwable -> L20
            goto L5e
        L52:
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r1.getCountry()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = com.google.android.gms.internal.ads.AbstractC0582Jp.u(r1)     // Catch: java.lang.Throwable -> L20
        L5e:
            r2.f15875m = r1     // Catch: java.lang.Throwable -> L20
        L60:
            long r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L20
            r2.f15872j = r0     // Catch: java.lang.Throwable -> L20
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L20
            int r3 = r2.f15868e     // Catch: java.lang.Throwable -> L20
            r8 = 0
            if (r3 <= 0) goto L76
            long r3 = r2.f15869f     // Catch: java.lang.Throwable -> L20
            long r3 = r0 - r3
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L20
            r7 = r3
            goto L77
        L76:
            r7 = r8
        L77:
            long r3 = r2.f15870g     // Catch: java.lang.Throwable -> L20
            long r5 = r2.f15872j     // Catch: java.lang.Throwable -> L20
            r2.a(r3, r5, r7)     // Catch: java.lang.Throwable -> L20
            r2.f15869f = r0     // Catch: java.lang.Throwable -> L20
            r0 = 0
            r2.f15870g = r0     // Catch: java.lang.Throwable -> L20
            r2.i = r0     // Catch: java.lang.Throwable -> L20
            r2.f15871h = r0     // Catch: java.lang.Throwable -> L20
            androidx.recyclerview.widget.p0 r0 = r2.f15867d     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r0.f5577b     // Catch: java.lang.Throwable -> L20
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L20
            r1.clear()     // Catch: java.lang.Throwable -> L20
            r1 = -1
            r0.f5578c = r1     // Catch: java.lang.Throwable -> L20
            r0.f5579d = r8     // Catch: java.lang.Throwable -> L20
            r0.f5580e = r8     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return
        L9a:
            monitor-exit(r2)
            return
        L9c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.RunnableC0558Ii.g():void");
    }

    private final void h() {
        C0702Qq c0702Qq = (C0702Qq) this.f9139b;
        synchronized (c0702Qq) {
            c0702Qq.f10710a.getClass();
            c0702Qq.f10717h = SystemClock.elapsedRealtime() - c0702Qq.i;
        }
    }

    private final void i() {
        BinderC1713pr binderC1713pr = (BinderC1713pr) this.f9139b;
        synchronized (binderC1713pr) {
            binderC1713pr.K3(3, "Signal collection timeout.");
        }
    }

    private final void j() {
        C0697Ql c0697Ql = (C0697Ql) this.f9139b;
        synchronized (c0697Ql) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) c0697Ql.f10692c;
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Gu gu;
        switch (this.f9138a) {
            case 0:
                ((C0541Hi) this.f9139b).f8987b.f9338d.a();
                return;
            case 1:
                C0830Yi c0830Yi = (C0830Yi) this.f9139b;
                C1321ib c1321ib = c0830Yi.f12658q.f16219d;
                if (c1321ib == null) {
                    return;
                }
                try {
                    q2.L l2 = (q2.L) c0830Yi.f12660s.c();
                    S2.b bVar = new S2.b(c0830Yi.f12653l);
                    Parcel parcelH0 = c1321ib.h0();
                    C7.e(parcelH0, l2);
                    C7.e(parcelH0, bVar);
                    c1321ib.I0(parcelH0, 1);
                    return;
                } catch (RemoteException e6) {
                    u2.k.f("RemoteException when notifyAdLoad is called", e6);
                    return;
                }
            case 2:
                ((C2136xj) this.f9139b).f17623c = false;
                return;
            case 3:
                C0593Kj c0593Kj = (C0593Kj) this.f9139b;
                AbstractC2022vd.E(c0593Kj.f9521c);
                c0593Kj.f9526h = true;
                return;
            case 4:
                a();
                return;
            case 5:
                b();
                return;
            case 6:
                c();
                return;
            case 7:
                ((InterfaceC1654om) this.f9139b).m();
                return;
            case 8:
                ViewTreeObserverOnGlobalLayoutListenerC1923tm viewTreeObserverOnGlobalLayoutListenerC1923tm = (ViewTreeObserverOnGlobalLayoutListenerC1923tm) this.f9139b;
                if (viewTreeObserverOnGlobalLayoutListenerC1923tm.f16969g == null) {
                    View view = new View(viewTreeObserverOnGlobalLayoutListenerC1923tm.f16966d.getContext());
                    viewTreeObserverOnGlobalLayoutListenerC1923tm.f16969g = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (viewTreeObserverOnGlobalLayoutListenerC1923tm.f16966d != viewTreeObserverOnGlobalLayoutListenerC1923tm.f16969g.getParent()) {
                    viewTreeObserverOnGlobalLayoutListenerC1923tm.f16966d.addView(viewTreeObserverOnGlobalLayoutListenerC1923tm.f16969g);
                    return;
                }
                return;
            case 9:
                ViewTreeObserverOnGlobalLayoutListenerC0953bn viewTreeObserverOnGlobalLayoutListenerC0953bn = (ViewTreeObserverOnGlobalLayoutListenerC0953bn) this.f9139b;
                try {
                    viewTreeObserverOnGlobalLayoutListenerC0953bn.getClass();
                    M2.u.c("#008 Must be called on the main UI thread.");
                    viewTreeObserverOnGlobalLayoutListenerC0953bn.L3();
                    C1278hm c1278hm = viewTreeObserverOnGlobalLayoutListenerC0953bn.f13463c;
                    if (c1278hm != null) {
                        c1278hm.t();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC0953bn.f13463c = null;
                    viewTreeObserverOnGlobalLayoutListenerC0953bn.f13461a = null;
                    viewTreeObserverOnGlobalLayoutListenerC0953bn.f13462b = null;
                    viewTreeObserverOnGlobalLayoutListenerC0953bn.f13464d = true;
                    return;
                } catch (RemoteException e7) {
                    u2.k.k("#007 Could not call remote method.", e7);
                    return;
                }
            case 10:
                String str = p2.j.f22785C.f22795h.i().s().f7976e;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                C0657Of c0657Of = (C0657Of) this.f9139b;
                if (zIsEmpty) {
                    c0657Of.c(new Exception());
                    return;
                } else {
                    c0657Of.b(str);
                    return;
                }
            case 11:
                d();
                return;
            case 12:
                e();
                return;
            case 13:
                ((C1227gp) this.f9139b).a();
                return;
            case 14:
                ((C1227gp) this.f9139b).a();
                return;
            case 15:
                C1338iu c1338iu = (C1338iu) this.f9139b;
                C0710Rh c0710Rh = ((C0710Rh) c1338iu.f14823c).f10986b;
                Cr.A((Context) c1338iu.f14822b, Context.class);
                Nx nx = new Nx(c0710Rh);
                C1799rN c1799rN = c0710Rh.f11000j;
                C0472Dh c0472Dh = c0710Rh.f10984a;
                C1381jj c1381jj = (C1381jj) nx.f10110b;
                Context context = c0472Dh.f7822b;
                Cr.v(context);
                C0623Mf c0623Mf = AbstractC0640Nf.f10006b;
                Cr.v(c0623Mf);
                C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf2);
                InterfaceC1692pN interfaceC1692pNB = C1799rN.b(c1381jj);
                C2951a c2951a = c0472Dh.f7821a;
                Cr.v(c2951a);
                C1431kf c1431kf = new C1431kf(context, c0623Mf, c0623Mf2, interfaceC1692pNB, c2951a, nx, (C0784Vn) c1799rN.c());
                C2911G c2911g = p2.j.f22785C.f22790c;
                if (C2911G.f(context.getPackageName())) {
                    c0623Mf2.execute(new RunnableC0558Ii(16, c1431kf));
                    return;
                }
                Nx nx2 = new Nx(21, c1431kf);
                Cr.v(context);
                Cr.v(c2951a);
                c0623Mf.execute(new RunnableC0558Ii(17, new C1281hp(context, c2951a, nx2)));
                return;
            case 16:
                ((C1431kf) this.f9139b).A();
                return;
            case 17:
                f();
                return;
            case 18:
                g();
                return;
            case 19:
                h();
                return;
            case 20:
                i();
                return;
            case 21:
                boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.Gb)).booleanValue();
                Throwable th = (Throwable) this.f9139b;
                if (zBooleanValue) {
                    p2.j.f22785C.f22795h.h("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    p2.j.f22785C.f22795h.g("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case 22:
                ((C1445kt) this.f9139b).f15304d.D(AbstractC1984ut.A(6, null, null));
                return;
            case 23:
                ((C1715pt) this.f9139b).f16239d.D(AbstractC1984ut.A(6, null, null));
                return;
            case 24:
                ((C2090wr) this.f9139b).e();
                return;
            case 25:
                ((Gt) this.f9139b).f8469d.D(AbstractC1984ut.A(6, null, null));
                return;
            case 26:
                ((It) this.f9139b).e();
                return;
            case 27:
                ((Lt) this.f9139b).f9777d.D(AbstractC1984ut.A(6, null, null));
                return;
            case 28:
                j();
                return;
            default:
                Gu gu2 = (Gu) this.f9139b;
                Hu hu = gu2.f8477d;
                synchronized (hu) {
                    try {
                        ScheduledFuture scheduledFuture = gu2.f8476c;
                        gu = scheduledFuture != null ? (Gu) hu.f9018c.remove(scheduledFuture) : null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (gu != null) {
                    gu2.f8477d.f9017b.execute(gu2.f8474a);
                    return;
                }
                return;
        }
    }
}
