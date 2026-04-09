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
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s30 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15853b;

    public /* synthetic */ s30(int i4, Object obj) {
        this.f15852a = i4;
        this.f15853b = obj;
    }

    private final /* synthetic */ void a() {
        n50 n50Var = (n50) this.f15853b;
        synchronized (n50Var) {
            try {
                d91 d91Var = n50Var.f14157f;
                if (d91Var.isDone()) {
                    return;
                }
                d91Var.e(Boolean.TRUE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final /* synthetic */ void b() {
        s50 s50Var = (s50) this.f15853b;
        synchronized (s50Var.f15872a) {
            try {
                if (s50Var.f15879i) {
                    return;
                }
                s50Var.f15879i = true;
                s50Var.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        m60 m60Var = (m60) this.f15853b;
        synchronized (m60Var) {
            za.i.e("Timeout waiting for show call succeed to be called.");
            m60Var.K(new e90("Timeout for show call succeed."));
            m60Var.f13776e = true;
        }
    }

    private final void d() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        hf0 hf0Var = (hf0) this.f15853b;
        qz qzVar = hf0Var.f11853d;
        ff0 ff0Var = hf0Var.f11852c;
        synchronized (ff0Var) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("platform", "ANDROID");
                    String str = ff0Var.f11137k;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                        sb2.append("afma-sdk-a-v");
                        sb2.append(str);
                        jSONObject.put("sdkVersion", sb2.toString());
                    }
                    jSONObject.put("internalSdkVersion", ff0Var.f11136i);
                    jSONObject.put("osVersion", Build.VERSION.RELEASE);
                    jSONObject.put("adapters", ff0Var.f11132d.a());
                    pk pkVar = sk.Ia;
                    va.s sVar = va.s.f36163e;
                    if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                        String str2 = ua.j.C.f35265h.g;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("plugin", str2);
                        }
                    }
                    long j = ff0Var.f11143q;
                    ua.j jVar = ua.j.C;
                    jVar.f35267k.getClass();
                    if (j < System.currentTimeMillis() / 1000) {
                        ff0Var.f11141o = JsonUtils.EMPTY_JSON;
                    }
                    jSONObject.put("networkExtras", ff0Var.f11141o);
                    jSONObject.put("adSlots", ff0Var.j());
                    jSONObject.put("appInfo", ff0Var.f11133e.d());
                    String str3 = jVar.f35265h.i().s().f18213e;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("cld", new JSONObject(str3));
                    }
                    if (((Boolean) sVar.f36166c.a(sk.f16404xa)).booleanValue() && (jSONObject2 = ff0Var.f11142p) != null) {
                        String string = jSONObject2.toString();
                        StringBuilder sb3 = new StringBuilder(string.length() + 13);
                        sb3.append("Server data: ");
                        sb3.append(string);
                        za.i.c(sb3.toString());
                        jSONObject.put("serverData", ff0Var.f11142p);
                    }
                    if (((Boolean) sVar.f36166c.a(sk.f16387wa)).booleanValue()) {
                        jSONObject.put("openAction", ff0Var.f11148v);
                        jSONObject.put("gesture", ff0Var.f11144r);
                    }
                    jSONObject.put("isGamRegisteredTestDevice", jVar.f35271o.n());
                    za.d dVar = va.r.g.f36157a;
                    jSONObject.put("isSimulator", za.d.o());
                    if (((Boolean) sVar.f36166c.a(sk.Ka)).booleanValue()) {
                        jSONObject.put("uiStorage", new JSONObject(ff0Var.f11150x));
                    }
                    if (!TextUtils.isEmpty((CharSequence) sVar.f36166c.a(sk.Ma))) {
                        jSONObject.put("gmaDisk", (JSONObject) ff0Var.f11135h.f10895b);
                    }
                    if (!TextUtils.isEmpty((CharSequence) sVar.f36166c.a(sk.La))) {
                        jSONObject.put("userDisk", (JSONObject) ff0Var.g.f10895b);
                    }
                } catch (JSONException e2) {
                    ua.j.C.f35265h.g("Inspector.toJson", e2);
                    za.i.i("Ad inspector encountered an error", e2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        qzVar.f("window.inspectorInfo", jSONObject.toString());
    }

    private final /* synthetic */ void e() {
        tf0 tf0Var = (tf0) this.f15853b;
        AtomicReference atomicReference = tf0Var.f16808d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(tf0Var.b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f() {
        eg0 eg0Var = (eg0) this.f15853b;
        synchronized (eg0Var.f11859b) {
            try {
                if (eg0Var.f11860c) {
                    return;
                }
                eg0Var.f11860c = true;
                di diVar = new di(eg0Var.g, ua.j.C.f35276t.f(), eg0Var, eg0Var, 2);
                eg0Var.f11863f = diVar;
                diVar.n();
            } catch (Throwable th2) {
                throw th2;
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
            java.lang.Object r0 = r9.f15853b
            com.google.android.gms.internal.ads.oi0 r0 = (com.google.android.gms.internal.ads.oi0) r0
            java.lang.ref.WeakReference r1 = r0.f14704a
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.ads.m r1 = (com.google.android.gms.internal.ads.m) r1
            if (r1 == 0) goto L9e
            com.google.android.gms.internal.ads.yj0 r0 = r0.f14706c
            int r0 = r0.b()
            com.google.android.gms.internal.ads.n r2 = r1.f13694a
            monitor-enter(r2)
            int r1 = r2.f14094l     // Catch: java.lang.Throwable -> L20
            if (r1 != r0) goto L23
            java.lang.String r1 = r2.f14095m     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L9a
            goto L23
        L20:
            r0 = move-exception
            goto L9c
        L23:
            r2.f14094l = r0     // Catch: java.lang.Throwable -> L20
            r1 = 1
            if (r0 == r1) goto L9a
            if (r0 == 0) goto L9a
            r1 = 8
            if (r0 != r1) goto L2f
            goto L9a
        L2f:
            java.lang.String r1 = r2.f14095m     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L60
            android.content.Context r1 = r2.f14085a     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = com.google.android.gms.internal.ads.bq0.f9768a     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L52
            java.lang.String r3 = "phone"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.Throwable -> L20
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L52
            java.lang.String r1 = r1.getNetworkCountryIso()     // Catch: java.lang.Throwable -> L20
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L52
            java.lang.String r1 = com.google.android.gms.internal.ads.mq0.u(r1)     // Catch: java.lang.Throwable -> L20
            goto L5e
        L52:
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r1.getCountry()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = com.google.android.gms.internal.ads.mq0.u(r1)     // Catch: java.lang.Throwable -> L20
        L5e:
            r2.f14095m = r1     // Catch: java.lang.Throwable -> L20
        L60:
            long r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L20
            r2.j = r0     // Catch: java.lang.Throwable -> L20
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L20
            int r3 = r2.f14089e     // Catch: java.lang.Throwable -> L20
            r8 = 0
            if (r3 <= 0) goto L76
            long r3 = r2.f14090f     // Catch: java.lang.Throwable -> L20
            long r3 = r0 - r3
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L20
            r7 = r3
            goto L77
        L76:
            r7 = r8
        L77:
            long r3 = r2.g     // Catch: java.lang.Throwable -> L20
            long r5 = r2.j     // Catch: java.lang.Throwable -> L20
            r2.a(r3, r5, r7)     // Catch: java.lang.Throwable -> L20
            r2.f14090f = r0     // Catch: java.lang.Throwable -> L20
            r0 = 0
            r2.g = r0     // Catch: java.lang.Throwable -> L20
            r2.f14092i = r0     // Catch: java.lang.Throwable -> L20
            r2.f14091h = r0     // Catch: java.lang.Throwable -> L20
            androidx.recyclerview.widget.g2 r0 = r2.f14088d     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r0.f1379b     // Catch: java.lang.Throwable -> L20
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L20
            r1.clear()     // Catch: java.lang.Throwable -> L20
            r1 = -1
            r0.f1380c = r1     // Catch: java.lang.Throwable -> L20
            r0.f1381d = r8     // Catch: java.lang.Throwable -> L20
            r0.f1382e = r8     // Catch: java.lang.Throwable -> L20
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s30.g():void");
    }

    private final void h() {
        nj0 nj0Var = (nj0) this.f15853b;
        synchronized (nj0Var) {
            nj0Var.f14296a.getClass();
            nj0Var.f14302h = SystemClock.elapsedRealtime() - nj0Var.f14303i;
        }
    }

    private final void i() {
        mk0 mk0Var = (mk0) this.f15853b;
        synchronized (mk0Var) {
            mk0Var.h4(3, "Signal collection timeout.");
        }
    }

    private final void j() {
        l90 l90Var = (l90) this.f15853b;
        synchronized (l90Var) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) l90Var.f13427c;
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }

    private final /* synthetic */ void k() {
        mr0 mr0Var;
        mr0 mr0Var2 = (mr0) this.f15853b;
        nr0 nr0Var = mr0Var2.f13998d;
        synchronized (nr0Var) {
            try {
                ScheduledFuture scheduledFuture = mr0Var2.f13997c;
                mr0Var = scheduledFuture != null ? (mr0) nr0Var.f14401c.remove(scheduledFuture) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (mr0Var != null) {
            mr0Var2.f13998d.f14400b.execute(mr0Var2.f13995a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15852a) {
            case 0:
                u30 u30Var = (u30) this.f15853b;
                sn snVar = u30Var.f17047q.f13094d;
                if (snVar == null) {
                    return;
                }
                try {
                    va.l0 l0Var = (va.l0) u30Var.f17049s.a();
                    vb.b bVar = new vb.b(u30Var.f17042l);
                    Parcel parcelT = snVar.T();
                    ng.e(parcelT, l0Var);
                    ng.e(parcelT, bVar);
                    snVar.g1(parcelT, 1);
                    return;
                } catch (RemoteException e2) {
                    za.i.f("RemoteException when notifyAdLoad is called", e2);
                    return;
                }
            case 1:
                ((u40) this.f15853b).f17085c = false;
                return;
            case 2:
                f50 f50Var = (f50) this.f15853b;
                nn1.v(f50Var.f11001c);
                f50Var.f11005h = true;
                return;
            case 3:
                a();
                return;
            case 4:
                b();
                return;
            case 5:
                c();
                return;
            case 6:
                ((ja0) this.f15853b).z();
                return;
            case 7:
                oa0 oa0Var = (oa0) this.f15853b;
                if (oa0Var.g == null) {
                    View view = new View(oa0Var.f14623d.getContext());
                    oa0Var.g = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (oa0Var.f14623d != oa0Var.g.getParent()) {
                    oa0Var.f14623d.addView(oa0Var.g);
                    return;
                }
                return;
            case 8:
                wb0 wb0Var = (wb0) this.f15853b;
                try {
                    wb0Var.getClass();
                    pb.y.d("#008 Must be called on the main UI thread.");
                    wb0Var.i4();
                    ca0 ca0Var = wb0Var.f17963c;
                    if (ca0Var != null) {
                        ca0Var.s();
                    }
                    wb0Var.f17963c = null;
                    wb0Var.f17961a = null;
                    wb0Var.f17962b = null;
                    wb0Var.f17964d = true;
                    return;
                } catch (RemoteException e10) {
                    za.i.k("#007 Could not call remote method.", e10);
                    return;
                }
            case 9:
                String str = ua.j.C.f35265h.i().s().f18213e;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                gx gxVar = (gx) this.f15853b;
                if (zIsEmpty) {
                    gxVar.d(new Exception());
                    return;
                } else {
                    gxVar.b(str);
                    return;
                }
            case 10:
                d();
                return;
            case 11:
                e();
                return;
            case 12:
                ((dg0) this.f15853b).a();
                return;
            case 13:
                ((dg0) this.f15853b).a();
                return;
            case 14:
                pq0 pq0Var = (pq0) this.f15853b;
                k10 k10Var = ((k10) pq0Var.f15074c).f12924b;
                al0.E(Context.class, (Context) pq0Var.f15073b);
                ix0 ix0Var = new ix0(k10Var);
                es1 es1Var = k10Var.j;
                w00 w00Var = k10Var.f12922a;
                g40 g40Var = (g40) ix0Var.f12502b;
                Context context = w00Var.f17809b;
                al0.z(context);
                ex exVar = fx.f11275b;
                al0.z(exVar);
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                cs1 cs1VarC = es1.c(g40Var);
                za.a aVar = w00Var.f17808a;
                al0.z(aVar);
                aw awVar = new aw(context, exVar, exVar2, cs1VarC, aVar, ix0Var, (qd0) es1Var.a());
                ya.f0 f0Var = ua.j.C.f35261c;
                if (ya.f0.f(context.getPackageName())) {
                    exVar2.execute(new s30(15, awVar));
                    return;
                }
                ne0 ne0Var = new ne0(3, awVar);
                al0.z(context);
                al0.z(aVar);
                exVar.execute(new s30(16, new eg0(context, aVar, ne0Var)));
                return;
            case 15:
                ((aw) this.f15853b).z();
                return;
            case 16:
                f();
                return;
            case 17:
                g();
                return;
            case 18:
                h();
                return;
            case 19:
                i();
                return;
            case 20:
                boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.Ib)).booleanValue();
                Throwable th2 = (Throwable) this.f15853b;
                if (zBooleanValue) {
                    ua.j.C.f35265h.h("TopicsSignalUnsampled.fetchTopicsSignal", th2);
                    return;
                } else {
                    ua.j.C.f35265h.g("TopicsSignal.fetchTopicsSignal", th2);
                    return;
                }
            case 21:
                ((po0) this.f15853b).f15061d.o(yo0.A(6, null, null));
                return;
            case 22:
                ((to0) this.f15853b).f16899d.o(yo0.A(6, null, null));
                return;
            case 23:
                ((uk0) this.f15853b).e();
                return;
            case 24:
                ((lp0) this.f15853b).f13569d.o(yo0.A(6, null, null));
                return;
            case 25:
                ((np0) this.f15853b).e();
                return;
            case 26:
                ((qp0) this.f15853b).f15389d.o(yo0.A(6, null, null));
                return;
            case 27:
                j();
                return;
            case 28:
                k();
                return;
            default:
                nr0 nr0Var = (nr0) this.f15853b;
                synchronized (nr0Var) {
                    HashMap map = nr0Var.f14401c;
                    ArrayList arrayList = new ArrayList(map.keySet());
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i4);
                        mr0 mr0Var = (mr0) map.get(scheduledFuture);
                        if (mr0Var != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                            scheduledFuture.cancel(false);
                            map.remove(scheduledFuture);
                            ua.j.C.f35267k.getClass();
                            long jCurrentTimeMillis = mr0Var.f13996b - System.currentTimeMillis();
                            Runnable runnable = mr0Var.f13995a;
                            long jMax = Math.max(0L, jCurrentTimeMillis);
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            nr0Var.a(runnable, jMax);
                        }
                    }
                }
                return;
        }
    }
}
