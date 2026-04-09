package A1;

import A2.BinderC0126n;
import A2.C0113a;
import M2.AbstractBinderC0161a;
import M2.H;
import M2.InterfaceC0169i;
import Y2.A;
import Y2.C0207i;
import Y2.C0209k;
import Y2.C0213o;
import android.app.Application;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.SurfaceHolder;
import android.webkit.WebView;
import b3.C0335e;
import c1.AbstractC0400d;
import c3.InterfaceC0402a;
import com.google.android.gms.internal.ads.AbstractC1984ut;
import com.google.android.gms.internal.ads.C1068du;
import com.google.android.gms.internal.ads.C1446ku;
import com.google.android.gms.internal.ads.C1547mn;
import com.google.android.gms.internal.ads.ED;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.I6;
import com.google.android.gms.internal.ads.Zs;
import d4.C2267a;
import h5.C2376j;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import q2.C2841s;
import z5.AbstractC3042s;
import z5.AbstractC3046w;
import z5.C3030f;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99a;

    /* renamed from: b, reason: collision with root package name */
    public Object f100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f101c;

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f99a = i;
        this.f101c = obj;
        this.f100b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() throws org.json.JSONException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f100b
            A2.x r0 = (A2.x) r0
            java.lang.Object r1 = r8.f101c
            A2.w r1 = (A2.w) r1
            A2.r r2 = r0.f348a
            java.lang.String r0 = r0.f350c
            r2.getClass()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto La5
            boolean r3 = r2.a()
            if (r3 == 0) goto L1d
            goto La5
        L1d:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4d
            r4.<init>()     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "params"
            java.lang.String r6 = r1.f340a     // Catch: org.json.JSONException -> L4d
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "signal_dictionary"
            q2.r r6 = q2.r.f23260g     // Catch: org.json.JSONException -> L4d
            u2.f r6 = r6.f23261a     // Catch: org.json.JSONException -> L4d
            android.os.Bundle r7 = r1.f345f     // Catch: org.json.JSONException -> L4d
            org.json.JSONObject r6 = r6.k(r7)     // Catch: org.json.JSONException -> L4d
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L4d
            java.lang.String r5 = "sr"
            r3.put(r5, r4)     // Catch: org.json.JSONException -> L4d
            java.lang.String r1 = r1.f342c     // Catch: org.json.JSONException -> L4d
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L4d
            if (r4 == 0) goto L4f
            java.lang.String r1 = ""
            goto L89
        L4d:
            r1 = move-exception
            goto L7c
        L4f:
            if (r1 != 0) goto L54
            java.lang.String r1 = ""
            goto L5a
        L54:
            java.lang.String r4 = "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2"
            java.lang.String r1 = t2.C2911G.J(r1, r4)     // Catch: org.json.JSONException -> L4d
        L5a:
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L4d
            byte[] r1 = r1.getBytes(r4)     // Catch: org.json.JSONException -> L4d
            r4 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r4)     // Catch: org.json.JSONException -> L4d
            java.lang.String r4 = "rs"
            r3.put(r4, r1)     // Catch: org.json.JSONException -> L4d
            java.lang.String r1 = "ts_ms"
            p2.j r4 = p2.j.f22785C     // Catch: org.json.JSONException -> L4d
            Q2.a r4 = r4.f22797k     // Catch: org.json.JSONException -> L4d
            r4.getClass()     // Catch: org.json.JSONException -> L4d
            long r4 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L4d
            r3.put(r1, r4)     // Catch: org.json.JSONException -> L4d
            goto L85
        L7c:
            java.lang.String r4 = "DiskCachingManager.createStringToWrite"
            p2.j r5 = p2.j.f22785C
            com.google.android.gms.internal.ads.Hf r5 = r5.f22795h
            r5.f(r4, r1)
        L85:
            java.lang.String r1 = r3.toString()
        L89:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto La5
            A2.E r2 = r2.f319b
            r2.h()
            java.lang.Object r3 = r2.f160d
            monitor-enter(r3)
            android.content.SharedPreferences$Editor r2 = r2.f158b     // Catch: java.lang.Throwable -> La2
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)     // Catch: java.lang.Throwable -> La2
            r0.commit()     // Catch: java.lang.Throwable -> La2
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La2
            goto La5
        La2:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La2
            throw r0
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.d.a():void");
    }

    private final void b() {
        boolean zBooleanValue;
        C0213o c0213o = (C0213o) this.f100b;
        String str = (String) this.f101c;
        synchronized (A.class) {
            if (A.f4253a == null) {
                try {
                    c0213o.evaluateJavascript("(function(){})()", null);
                    A.f4253a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    A.f4253a = Boolean.FALSE;
                }
                zBooleanValue = A.f4253a.booleanValue();
            } else {
                zBooleanValue = A.f4253a.booleanValue();
            }
        }
        if (zBooleanValue) {
            c0213o.evaluateJavascript(str, null);
        } else {
            c0213o.loadUrl("javascript:".concat(str));
        }
    }

    private final void c() {
        synchronized (((c3.h) this.f101c).f5908d) {
            ((c3.b) ((c3.h) this.f101c).f5907c).e((c3.j) this.f100b);
        }
    }

    private final void d() {
        synchronized (((c3.h) this.f101c).f5908d) {
            c3.c cVar = (c3.c) ((c3.h) this.f101c).f5907c;
            Exception excB = ((c3.j) this.f100b).b();
            M2.u.e(excB);
            cVar.a(excB);
        }
    }

    private final void e() {
        synchronized (((c3.h) this.f101c).f5908d) {
            ((c3.d) ((c3.h) this.f101c).f5907c).onSuccess(((c3.j) this.f100b).c());
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, V2.d {
        C1068du c1068du;
        InterfaceC0169i interfaceC0169i;
        InterfaceC0169i h6;
        int i = 0;
        switch (this.f99a) {
            case 0:
                u1.x xVarA = u1.x.a();
                xVarA.getClass();
                H1.p.a();
                xVarA.f23777d.set(true);
                ((e) this.f101c).f103b.f105b = true;
                ((e) this.f101c).f102a.getViewTreeObserver().removeOnDrawListener((e) this.f100b);
                ((e) this.f101c).f103b.f104a.clear();
                return;
            case 1:
                BinderC0126n binderC0126n = (BinderC0126n) this.f100b;
                C1547mn c1547mn = ((C1547mn[]) this.f101c)[0];
                if (c1547mn != null) {
                    C1446ku c1446ku = binderC0126n.f293f;
                    ED edE = AbstractC1984ut.e(c1547mn);
                    synchronized (c1446ku) {
                        c1446ku.f15310a.addFirst(edE);
                    }
                    return;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                C0113a c0113a = (C0113a) this.f100b;
                String str = (String) this.f101c;
                WebView webView = c0113a.f219b;
                Context context = c0113a.f218a;
                Uri uriB = Uri.parse(str);
                try {
                    uriB = (!((Boolean) C2841s.f23267e.f23270c.a(H9.jd)).booleanValue() || (c1068du = c0113a.f221d) == null) ? c0113a.f220c.b(uriB, context, webView, null) : c1068du.a(uriB, context, webView, null);
                } catch (I6 e6) {
                    u2.k.d("Failed to append the click signal to URL: ", e6);
                    p2.j.f22785C.f22795h.f("TaggingLibraryJsInterface.recordClick", e6);
                }
                c0113a.i.b(uriB.toString(), null, null, null);
                return;
            case 4:
                ((C3030f) this.f100b).D((A5.d) this.f101c);
                return;
            case 5:
                E5.i iVar = (E5.i) this.f101c;
                AbstractC3042s abstractC3042s = iVar.f1391c;
                while (true) {
                    try {
                        ((Runnable) this.f100b).run();
                    } catch (Throwable th) {
                        AbstractC3046w.j(C2376j.f20486a, th);
                    }
                    Runnable runnableK = iVar.k();
                    if (runnableK == null) {
                        return;
                    }
                    this.f100b = runnableK;
                    i++;
                    if (i >= 16 && abstractC3042s.e()) {
                        abstractC3042s.d(iVar, this);
                        return;
                    }
                }
                break;
            case 6:
                ((G.a) this.f100b).f1462a = this.f101c;
                return;
            case 7:
                ((Application) this.f100b).unregisterActivityLifecycleCallbacks((G.a) this.f101c);
                return;
            case 8:
                Object obj = this.f101c;
                Object obj2 = this.f100b;
                try {
                    Method method = G.b.f1471d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        G.b.f1472e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e7) {
                    if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                        throw e7;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case 9:
                J2.b bVar = (J2.b) this.f100b;
                L2.m mVar = (L2.m) this.f101c;
                K2.c cVar = (K2.c) mVar.f2537b;
                L2.k kVar = (L2.k) ((L2.c) mVar.f2541f).f2514j.get((L2.a) mVar.f2538c);
                if (kVar == null) {
                    return;
                }
                if (bVar.f2045b != 0) {
                    kVar.l(bVar, null);
                    return;
                }
                mVar.f2536a = true;
                if (cVar.m()) {
                    if (!mVar.f2536a || (interfaceC0169i = (InterfaceC0169i) mVar.f2539d) == null) {
                        return;
                    }
                    cVar.b(interfaceC0169i, (Set) mVar.f2540e);
                    return;
                }
                try {
                    cVar.b(null, cVar.a());
                    return;
                } catch (SecurityException e8) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e8);
                    cVar.c("Failed to get service from broker.");
                    kVar.l(new J2.b(10, null, null), null);
                    return;
                }
            case 10:
                L2.t tVar = (L2.t) this.f101c;
                C0335e c0335e = (C0335e) this.f100b;
                J2.b bVar2 = c0335e.f5729b;
                if (bVar2.f2045b == 0) {
                    M2.r rVar = c0335e.f5730c;
                    M2.u.e(rVar);
                    J2.b bVar3 = rVar.f2807c;
                    if (bVar3.f2045b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        tVar.f2563h.d(bVar3);
                        tVar.f2562g.h();
                        return;
                    }
                    L2.m mVar2 = tVar.f2563h;
                    IBinder iBinder = rVar.f2806b;
                    if (iBinder == null) {
                        h6 = null;
                    } else {
                        int i3 = AbstractBinderC0161a.f2731b;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        h6 = iInterfaceQueryLocalInterface instanceof InterfaceC0169i ? (InterfaceC0169i) iInterfaceQueryLocalInterface : new H(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    Set set = tVar.f2560e;
                    mVar2.getClass();
                    if (h6 == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        mVar2.d(new J2.b(4, null, null));
                    } else {
                        mVar2.f2539d = h6;
                        mVar2.f2540e = set;
                        if (mVar2.f2536a) {
                            ((K2.c) mVar2.f2537b).b(h6, set);
                        }
                    }
                } else {
                    tVar.f2563h.d(bVar2);
                }
                tVar.f2562g.h();
                return;
            case 11:
                U0.j jVar = (U0.j) this.f100b;
                Typeface typeface = (Typeface) this.f101c;
                I.b bVar4 = (I.b) jVar.f3677b;
                if (bVar4 != null) {
                    bVar4.i(typeface);
                    return;
                }
                return;
            case 12:
                ((O.f) this.f100b).accept(this.f101c);
                return;
            case 13:
                V1.e eVar = (V1.e) this.f101c;
                V1.e.ru(eVar);
                if (eVar.vk != null) {
                    eVar.vk.obtainMessage(111, (SurfaceTexture) this.f100b).sendToTarget();
                    return;
                }
                return;
            case 14:
                V1.e eVar2 = (V1.e) this.f101c;
                V1.e.ru(eVar2);
                if (eVar2.vk != null) {
                    eVar2.vk.obtainMessage(110, (SurfaceHolder) this.f100b).sendToTarget();
                    return;
                }
                return;
            case 15:
                V1.e eVar3 = (V1.e) this.f101c;
                V1.e.ru(eVar3);
                if (eVar3.vk != null) {
                    eVar3.vk.obtainMessage(107, (com.bykv.vk.openvk.emc.emc.emc.xq.b) this.f100b).sendToTarget();
                    return;
                }
                return;
            case 16:
                V2.e eVar4 = (V2.e) this.f100b;
                c3.j jVar2 = ((c3.f) this.f101c).f5902a;
                Context context2 = (Context) eVar4.f3868b;
                String string = V2.e.D(context2).getString("app_set_id", null);
                long j6 = V2.e.D(context2).getLong("app_set_id_last_used_time", -1L);
                long j7 = j6 != -1 ? 33696000000L + j6 : -1L;
                if (string == null || System.currentTimeMillis() > j7) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String strValueOf = String.valueOf(context2.getPackageName());
                            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                            throw new V2.d("Failed to store the app set ID.");
                        }
                        V2.e.E(context2);
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context2.getPackageName());
                            Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new V2.d("Failed to store the app set ID creation time.");
                        }
                    } catch (V2.d e9) {
                        jVar2.f(e9);
                        return;
                    }
                } else {
                    try {
                        V2.e.E(context2);
                    } catch (V2.d e10) {
                        jVar2.f(e10);
                        return;
                    }
                }
                jVar2.g(new G2.b(string, 1));
                return;
            case 17:
                V0.m mVarF = V0.m.f();
                String str2 = X0.a.f4146d;
                e1.h hVar = (e1.h) this.f100b;
                mVarF.a(str2, A.f.l("Scheduling work ", hVar.f19908a), new Throwable[0]);
                ((X0.a) this.f101c).f4147a.e(hVar);
                return;
            case 18:
                C0209k c0209k = (C0209k) this.f100b;
                C0207i c0207i = (C0207i) this.f101c;
                AtomicReference atomicReference = c0209k.f4345d;
                Objects.requireNonNull(atomicReference);
                c0207i.b(new U0.j(19, atomicReference), new S4.r(12));
                return;
            case 19:
                b();
                return;
            case 20:
                try {
                    ((Z3.a) this.f101c).b((HashSet) this.f100b);
                    return;
                } catch (Exception e11) {
                    Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e11);
                    return;
                }
            case 21:
                a4.v vVar = ((a4.e) this.f101c).f4688b;
                V2.h hVar2 = (V2.h) this.f100b;
                ArrayList arrayList = (ArrayList) hVar2.f3875b;
                ArrayList arrayListD = a4.e.d((ArrayList) hVar2.f3876c);
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", 0);
                bundle.putInt("status", 5);
                bundle.putInt("error_code", 0);
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("module_names", new ArrayList<>(arrayList));
                }
                if (!arrayListD.isEmpty()) {
                    bundle.putStringArrayList("languages", new ArrayList<>(arrayListD));
                }
                bundle.putLong("total_bytes_to_download", 0L);
                bundle.putLong("bytes_downloaded", 0L);
                vVar.f(a4.d.b(bundle));
                return;
            case 22:
                ArrayList arrayList2 = (ArrayList) this.f100b;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    b1.c cVar2 = (b1.c) obj3;
                    Object obj4 = ((AbstractC0400d) this.f101c).f5889e;
                    cVar2.f5711b = obj4;
                    cVar2.d(cVar2.f5713d, obj4);
                }
                return;
            case 23:
                if (((c3.j) this.f100b).f5914d) {
                    ((c3.j) ((c3.h) this.f101c).f5907c).h();
                    return;
                }
                try {
                    ((c3.j) ((c3.h) this.f101c).f5907c).g(((InterfaceC0402a) ((c3.h) this.f101c).f5908d).l((c3.j) this.f100b));
                    return;
                } catch (c3.e e12) {
                    if (e12.getCause() instanceof Exception) {
                        ((c3.j) ((c3.h) this.f101c).f5907c).f((Exception) e12.getCause());
                        return;
                    } else {
                        ((c3.j) ((c3.h) this.f101c).f5907c).f(e12);
                        return;
                    }
                } catch (Exception e13) {
                    ((c3.j) ((c3.h) this.f101c).f5907c).f(e13);
                    return;
                }
            case 24:
                c3.h hVar3 = (c3.h) this.f101c;
                c3.j jVar3 = (c3.j) hVar3.f5907c;
                try {
                    c3.j jVar4 = (c3.j) ((A0.e) hVar3.f5908d).l((c3.j) this.f100b);
                    if (jVar4 == null) {
                        hVar3.a(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    w wVar = jVar4.f5912b;
                    H1.f fVar = c3.g.f5904b;
                    wVar.i(new c3.h((Executor) fVar, (c3.d) hVar3));
                    jVar4.j();
                    wVar.i(new c3.h((Executor) fVar, (c3.c) hVar3));
                    jVar4.j();
                    wVar.i(new c3.h((Executor) fVar, hVar3));
                    jVar4.j();
                    return;
                } catch (c3.e e14) {
                    if (e14.getCause() instanceof Exception) {
                        jVar3.f((Exception) e14.getCause());
                        return;
                    } else {
                        jVar3.f(e14);
                        return;
                    }
                } catch (Exception e15) {
                    jVar3.f(e15);
                    return;
                }
            case 25:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                e();
                return;
            case 28:
                c3.j jVar5 = (c3.j) this.f100b;
                try {
                    jVar5.g(((Zs) this.f101c).call());
                    return;
                } catch (Exception e16) {
                    jVar5.f(e16);
                    return;
                } catch (Throwable th3) {
                    jVar5.f(new RuntimeException(th3));
                    return;
                }
            default:
                C2267a c2267a = (C2267a) this.f100b;
                a4.d dVar = (a4.d) this.f101c;
                c2267a.f19779f.y(dVar);
                c2267a.f19780g.y(dVar);
                return;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, int i, boolean z6) {
        this.f99a = i;
        this.f100b = obj;
        this.f101c = obj2;
    }
}
