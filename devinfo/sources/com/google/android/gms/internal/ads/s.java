package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.webkit.ProfileStore;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15815a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15816b;

    public /* synthetic */ s(int i4, Object obj) {
        this.f15815a = i4;
        this.f15816b = obj;
    }

    private final void a() {
        boolean zBooleanValue;
        le leVar = (le) this.f15816b;
        if (leVar.f13469b != null) {
            return;
        }
        synchronized (le.f13465c) {
            if (leVar.f13469b != null) {
                return;
            }
            boolean z3 = false;
            try {
                zBooleanValue = ((Boolean) sk.f16071c3.u()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    le.f13466d = fw0.a(((le) this.f15816b).f13468a.f11116a, "ADSHIELD");
                    z3 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z3 = zBooleanValue;
            }
            ((le) this.f15816b).f13469b = Boolean.valueOf(z3);
            le.f13465c.open();
        }
    }

    private final void b() {
        dh dhVar = (dh) this.f15816b;
        synchronized (dhVar.f10475c) {
            if (dhVar.f10476d.get() && dhVar.f10477e) {
                dhVar.f10476d.set(false);
                za.i.c("App went background");
                ArrayList arrayList = dhVar.f10478f;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    try {
                        ((eh) obj).S(false);
                    } catch (Exception e2) {
                        za.i.f("", e2);
                    }
                }
            } else {
                za.i.c("App is still foreground");
            }
        }
    }

    private final void c() {
        oa oaVar = (oa) this.f15816b;
        synchronized (oaVar) {
            try {
                m8.s sVar = (m8.s) oaVar.f14619d;
                if (sVar.f28982a) {
                    ug ugVar = (ug) sVar.f28983b;
                    byte[] bArr = (byte[]) oaVar.f14618c;
                    rg rgVar = (rg) ugVar;
                    Parcel parcelT = rgVar.T();
                    parcelT.writeByteArray(bArr);
                    rgVar.g1(parcelT, 5);
                    rg rgVar2 = (rg) ((ug) sVar.f28983b);
                    Parcel parcelT2 = rgVar2.T();
                    parcelT2.writeInt(0);
                    rgVar2.g1(parcelT2, 6);
                    ug ugVar2 = (ug) sVar.f28983b;
                    int i4 = oaVar.f14617b;
                    rg rgVar3 = (rg) ugVar2;
                    Parcel parcelT3 = rgVar3.T();
                    parcelT3.writeInt(i4);
                    rgVar3.g1(parcelT3, 7);
                    rg rgVar4 = (rg) ((ug) sVar.f28983b);
                    Parcel parcelT4 = rgVar4.T();
                    parcelT4.writeIntArray(null);
                    rgVar4.g1(parcelT4, 4);
                    rg rgVar5 = (rg) ((ug) sVar.f28983b);
                    rgVar5.g1(rgVar5.T(), 3);
                }
            } catch (RemoteException e2) {
                za.i.d("Clearcut log failed", e2);
            }
        }
    }

    private final void d() throws Throwable {
        LinkedHashMap linkedHashMap;
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f15816b;
        dVar.getClass();
        while (true) {
            try {
                vk vkVar = (vk) ((ArrayBlockingQueue) dVar.f19295a).take();
                l90 l90VarB = vkVar.b();
                if (!TextUtils.isEmpty((String) l90VarB.f13426b)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) dVar.f19296b;
                    synchronized (vkVar.f17639c) {
                        ua.j.C.f35265h.a();
                        linkedHashMap = vkVar.f17638b;
                    }
                    dVar.k(dVar.i(linkedHashMap2, linkedHashMap), l90VarB);
                }
            } catch (InterruptedException e2) {
                za.i.i("CsiReporter:reporter interrupted", e2);
                return;
            }
        }
    }

    private final void e() {
        va.s sVar;
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        va.s sVar2;
        long j;
        long j8;
        long j9;
        long j10;
        yy yyVar = (yy) this.f15816b;
        String strT = yy.t(yyVar.f18928e);
        try {
            pk pkVar = sk.Y;
            sVar = va.s.f36163e;
            jLongValue = ((Long) sVar.f36166c.a(pkVar)).longValue() * 1000;
            jIntValue = ((Integer) sVar.f36166c.a(sk.f16376w)).intValue();
            zBooleanValue = ((Boolean) sVar.f36166c.a(sk.f16237n2)).booleanValue();
        } catch (Exception e2) {
            String str = yyVar.f18928e;
            String message = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            za.i.h(sb2.toString());
            ua.j.C.f35265h.g("VideoStreamExoPlayerCache.preload", e2);
            yyVar.a();
            yyVar.r(yyVar.f18928e, strT, "error", yy.u("error", e2));
        }
        synchronized (yyVar) {
            ua.j.C.f35267k.getClass();
            if (System.currentTimeMillis() - yyVar.f18931i > jLongValue) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                sb3.append("Timeout reached. Limit: ");
                sb3.append(jLongValue);
                sb3.append(" ms");
                throw new IOException(sb3.toString());
            }
            if (yyVar.f18929f) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!yyVar.g) {
                ou1 ou1Var = yyVar.f18927d.g;
                if (!(ou1Var != null)) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long jV1 = ou1Var.v1();
                if (jV1 > 0) {
                    long jW1 = yyVar.f18927d.g.w1();
                    if (jW1 != yyVar.j) {
                        boolean z3 = jW1 > 0;
                        String str2 = yyVar.f18928e;
                        if (zBooleanValue) {
                            fz fzVar = yyVar.f18927d;
                            j10 = (fzVar.f11310s == null || !fzVar.f11310s.f10272p) ? fzVar.f11302k : 0L;
                        } else {
                            j10 = -1;
                        }
                        long jP = zBooleanValue ? yyVar.f18927d.p() : -1L;
                        j = jIntValue;
                        sVar2 = sVar;
                        j9 = jW1;
                        j8 = jV1;
                        za.d.f38136b.post(new py(yyVar, str2, strT, jW1, jV1, j10, jP, zBooleanValue ? yyVar.f18927d.q() : -1L, z3, fz.f11292u.get(), fz.f11293v.get()));
                        yyVar.j = j9;
                    } else {
                        sVar2 = sVar;
                        j = jIntValue;
                        j8 = jV1;
                        j9 = jW1;
                    }
                    if (j9 >= j8) {
                        za.d.f38136b.post(new sy(yyVar, yyVar.f18928e, strT, j8));
                    } else if (yyVar.f18927d.f11302k >= j && j9 > 0) {
                    }
                } else {
                    sVar2 = sVar;
                }
                ya.f0.f37440l.postDelayed(new s(21, yyVar), ((Long) sVar2.f36166c.a(sk.Z)).longValue());
                return;
            }
            ua.j.C.A.f14477a.remove(yyVar.f18930h);
        }
    }

    private final void f() {
        boolean z3;
        sf0 sf0Var = (sf0) this.f15816b;
        sf0Var.getClass();
        try {
            ya.c0 c0Var = sf0Var.f16008d;
            c0Var.m();
            synchronized (c0Var.f37402a) {
                z3 = c0Var.E;
            }
            if (z3) {
                return;
            }
            rf0 rf0Var = sf0Var.f16006b;
            rf0Var.f15649b = new p9(rf0Var.f15648a);
            rf0Var.a(new ne0(sf0Var));
        } catch (Exception e2) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.G5)).booleanValue()) {
                if (sf0Var.f16010f == null) {
                    sf0Var.f16010f = ut.c(sf0Var.f16005a);
                }
                sf0Var.f16010f.d("InstallReferrerUnsampled.initializeAndReport", e2);
            } else {
                if (sf0Var.f16009e == null) {
                    sf0Var.f16009e = ut.a(sf0Var.f16005a);
                }
                sf0Var.f16009e.d("InstallReferrer.initializeAndReport", e2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strB;
        qd0 qd0Var;
        ActivityManager.MemoryInfo memoryInfoI;
        ProfileStore profileStore = null;
        int i4 = 1;
        switch (this.f15815a) {
            case 0:
                bz1 bz1Var = (bz1) ((r) this.f15816b);
                for (hz1 hz1Var : bz1Var.f9877s) {
                    hz1Var.l(true);
                    if (hz1Var.g != null) {
                        hz1Var.g = null;
                        hz1Var.f12046f = null;
                    }
                }
                av0 av0Var = bz1Var.f9869k;
                x1 x1Var = (x1) av0Var.f9423c;
                if (x1Var != null) {
                    x1Var.d();
                    av0Var.f9423c = null;
                }
                av0Var.f9424d = null;
                return;
            case 1:
                ((a0) this.f15816b).f9160h.mo169b();
                return;
            case 2:
                q0 q0Var = (q0) this.f15816b;
                q0Var.f15176m--;
                return;
            case 3:
                je jeVar = (je) this.f15816b;
                synchronized (jeVar.f12735o) {
                    if (jeVar.f12736p) {
                        return;
                    }
                    jeVar.f12736p = true;
                    try {
                        jeVar.l();
                    } catch (Exception e2) {
                        ((je) this.f15816b).f12728f.c(2023, -1L, e2);
                    }
                    je jeVar2 = (je) this.f15816b;
                    synchronized (jeVar2.f12735o) {
                        jeVar2.f12736p = false;
                    }
                    return;
                }
            case 4:
                a();
                return;
            case 5:
                ((lf) this.f15816b).c();
                return;
            case 6:
                yf yfVar = (yf) this.f15816b;
                yfVar.getClass();
                try {
                    ff ffVar = yfVar.f18721a;
                    DexClassLoader dexClassLoader = ffVar.f11118c;
                    byte[] bArr = ffVar.f11120e;
                    String str = yfVar.f18722b;
                    ffVar.f11119d.getClass();
                    Class<?> clsLoadClass = dexClassLoader.loadClass(new String(w5.y(str, bArr), "UTF-8"));
                    if (clsLoadClass != null) {
                        byte[] bArr2 = ffVar.f11120e;
                        String str2 = yfVar.f18723c;
                        yfVar.f18721a.f11119d.getClass();
                        yfVar.f18724d = clsLoadClass.getMethod(new String(w5.y(str2, bArr2), "UTF-8"), yfVar.f18725e);
                    }
                } catch (ue | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
                } catch (Throwable th2) {
                    yfVar.f18726f.countDown();
                    throw th2;
                }
                yfVar.f18726f.countDown();
                return;
            case 7:
                ((yg) this.f15816b).d(3);
                return;
            case 8:
                b();
                return;
            case 9:
                ((ai) this.f15816b).r();
                return;
            case 10:
                c();
                return;
            case 11:
                d();
                return;
            case 12:
                zk zkVar = (zk) this.f15816b;
                Context context = zkVar.f19096c;
                if (zkVar.f19099f != null || context == null || (strB = u.h.b(context, null, false)) == null || strB.equals(context.getPackageName())) {
                    return;
                }
                u.h.a(context, strB, zkVar);
                return;
            case 13:
                ((dl) this.f15816b).j();
                return;
            case 14:
                hp hpVar = (hp) this.f15816b;
                if (((di) hpVar.f11935b) == null) {
                    return;
                }
                ((di) hpVar.f11935b).f();
                Binder.flushPendingCommands();
                return;
            case 15:
                ((AtomicBoolean) ((b7) this.f15816b).f9610f).set(false);
                return;
            case 16:
                ((AtomicBoolean) this.f15816b).getAndSet(true);
                return;
            case 17:
                cx cxVar = (cx) this.f15816b;
                while (cxVar.f10246e.get()) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    ya.f0.f37440l.post(new s(16, atomicBoolean));
                    try {
                        Thread.sleep(cxVar.f10247f);
                        if (!atomicBoolean.get()) {
                            pk pkVar = sk.f16098df;
                            rk rkVar = va.s.f36163e.f36166c;
                            if (((Boolean) rkVar.a(pkVar)).booleanValue() && (qd0Var = cxVar.f10243b) != null) {
                                rt rtVarA = qd0Var.a();
                                rtVarA.u("action", "panr");
                                if (((Boolean) rkVar.a(sk.Gf)).booleanValue() && (memoryInfoI = za.d.i(cxVar.f10244c)) != null) {
                                    rtVarA.u("mem_avl", String.valueOf(memoryInfoI.availMem));
                                    rtVarA.u("mem_tt", String.valueOf(memoryInfoI.totalMem));
                                    rtVarA.u("low_m", true != memoryInfoI.lowMemory ? "0" : "1");
                                }
                                rtVarA.x();
                            }
                            if (((Boolean) rkVar.a(sk.f16114ef)).booleanValue()) {
                                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                                lq lqVar = new lq("Potential ANR detected");
                                lqVar.setStackTrace(stackTrace);
                                if (((Boolean) rkVar.a(sk.f16131ff)).booleanValue()) {
                                    ut.c(cxVar.f10244c).e(lqVar, "AnrWatchdog", ((Integer) rkVar.a(sk.gf)).intValue() / 100.0f);
                                } else {
                                    ua.j.C.f35265h.f("AnrWatchdog", lqVar);
                                }
                            }
                        }
                        do {
                            try {
                                Thread.sleep(cxVar.g);
                            } catch (InterruptedException unused2) {
                                Thread.currentThread().interrupt();
                            }
                        } while (!atomicBoolean.get());
                    } catch (InterruptedException unused3) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                return;
            case 18:
                ((px) this.f15816b).g();
                return;
            case 19:
                sx sxVar = (sx) ((ox) this.f15816b);
                boolean z3 = sxVar.f16573h;
                ImageView imageView = sxVar.f16581q;
                if (z3 && imageView.getParent() != null) {
                    sxVar.f16568b.removeView(imageView);
                }
                px pxVar = sxVar.g;
                if (pxVar == null || sxVar.f16580p == null) {
                    return;
                }
                ua.j jVar = ua.j.C;
                jVar.f35267k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (pxVar.getBitmap(sxVar.f16580p) != null) {
                    sxVar.f16582r = true;
                }
                jVar.f35267k.getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (ya.a0.o()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
                    sb2.append("Spinner frame grab took ");
                    sb2.append(jElapsedRealtime2);
                    sb2.append("ms");
                    ya.a0.m(sb2.toString());
                }
                if (jElapsedRealtime2 > sxVar.f16572f) {
                    za.i.h("Spinner frame grab crossed jank threshold! Suspending spinner.");
                    sxVar.f16575k = false;
                    sxVar.f16580p = null;
                    vk vkVar = sxVar.f16570d;
                    if (vkVar != null) {
                        vkVar.c("spinner_jank", Long.toString(jElapsedRealtime2));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ua.j.C.A.f14477a.remove((my) this.f15816b);
                return;
            case 21:
                e();
                return;
            case 22:
                b00 b00Var = ((i00) this.f15816b).f12081a;
                p.r rVar = b00Var.f9521a.P;
                rVar.f30839e = true;
                if (rVar.f30838d) {
                    rVar.e();
                }
                xa.i iVarK0 = b00Var.f9521a.k0();
                if (iVarK0 != null) {
                    iVarK0.f37052l.removeView(iVarK0.f37048f);
                    iVarK0.n4(true);
                    return;
                }
                return;
            case 23:
                int i10 = i00.I;
                com.google.android.gms.internal.consent_sdk.d dVarA = ua.j.C.f35265h.a();
                String str3 = (String) this.f15816b;
                if (((HashSet) dVarA.g).contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) dVarA.f19300f);
                linkedHashMap.put("ue", str3);
                dVarA.k(dVarA.i((LinkedHashMap) dVarA.f19296b, linkedHashMap), null);
                return;
            case 24:
                h80 h80Var = ua.j.C.f35280x;
                vt0 vt0Var = ((xh0) this.f15816b).f18390a;
                h80Var.getClass();
                h80.s(new rh0(vt0Var, i4));
                return;
            case 25:
                r00 r00Var = (r00) this.f15816b;
                qd0 qd0Var2 = r00Var.f15494b;
                ua.j.C.f35267k.getClass();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                o00 o00Var = r00Var.f15493a;
                o00Var.getClass();
                if (!ii.a.s("MULTI_PROFILE")) {
                    za.i.c("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
                    za.i.c("Unable to get ProfileStore instance: ".concat(String.valueOf(e10.getMessage())));
                    try {
                        profileStore = (ProfileStore) o6.c.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e11) {
                        za.i.c("Unable to get ProfileStore instance: ".concat(String.valueOf(e11.getMessage())));
                    }
                }
                if (profileStore == null) {
                    za.i.h("WebViewCompat failure: No instance");
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16249nf)).booleanValue()) {
                        rt rtVarA2 = qd0Var2.a();
                        rtVarA2.u("action", "webview_p_f");
                        rtVarA2.u("webview_p_f", "No instance");
                        rtVarA2.v();
                        return;
                    }
                    return;
                }
                o00Var.f14496a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16249nf)).booleanValue()) {
                    ua.j.C.f35267k.getClass();
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                    rt rtVarA3 = qd0Var2.a();
                    rtVarA3.u("action", "webview_p_l");
                    rtVarA3.u("webview_p_l", Long.toString(jElapsedRealtime4));
                    rtVarA3.v();
                    return;
                }
                return;
            case 26:
                ((t00) this.f15816b).a();
                return;
            case 27:
                f();
                return;
            case 28:
                ((d30) this.f15816b).f10312b.f10689d.B1();
                return;
            default:
                ((d30) this.f15816b).f10312b.f10689d.a();
                return;
        }
    }
}
