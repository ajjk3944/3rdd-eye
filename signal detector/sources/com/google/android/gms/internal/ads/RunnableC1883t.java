package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.webkit.ProfileStore;
import b4.C0355t;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C2841s;
import r.C2867j;
import s2.BinderC2894d;
import t2.AbstractC2907C;
import t2.C2909E;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1883t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16830a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16831b;

    public /* synthetic */ RunnableC1883t(int i, Object obj) {
        this.f16830a = i;
        this.f16831b = obj;
    }

    private final void a() {
        boolean zBooleanValue;
        E6 e6 = (E6) this.f16831b;
        if (e6.f7916b != null) {
            return;
        }
        synchronized (E6.f7912c) {
            if (e6.f7916b != null) {
                return;
            }
            boolean z6 = false;
            try {
                zBooleanValue = ((Boolean) H9.f8723c3.v()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    E6.f7913d = C0963bx.a(((E6) this.f16831b).f7915a.f12375a, "ADSHIELD");
                    z6 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z6 = zBooleanValue;
            }
            ((E6) this.f16831b).f7916b = Boolean.valueOf(z6);
            E6.f7912c.open();
        }
    }

    private final void b() {
        S7 s7 = (S7) this.f16831b;
        synchronized (s7.f11132c) {
            if (s7.f11133d.get() && s7.f11134e) {
                s7.f11133d.set(false);
                u2.k.c("App went background");
                ArrayList arrayList = s7.f11135f;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        ((T7) obj).g0(false);
                    } catch (Exception e6) {
                        u2.k.f("", e6);
                    }
                }
            } else {
                u2.k.c("App is still foreground");
            }
        }
    }

    private final void c() {
        J4 j42 = (J4) this.f16831b;
        synchronized (j42) {
            try {
                A1.w wVar = (A1.w) j42.f9226d;
                if (wVar.f140c) {
                    J7 j7 = (J7) wVar.f141d;
                    byte[] bArr = (byte[]) j42.f9225c;
                    G7 g7 = (G7) j7;
                    Parcel parcelH0 = g7.h0();
                    parcelH0.writeByteArray(bArr);
                    g7.I0(parcelH0, 5);
                    G7 g72 = (G7) ((J7) wVar.f141d);
                    Parcel parcelH02 = g72.h0();
                    parcelH02.writeInt(0);
                    g72.I0(parcelH02, 6);
                    J7 j72 = (J7) wVar.f141d;
                    int i = j42.f9224b;
                    G7 g73 = (G7) j72;
                    Parcel parcelH03 = g73.h0();
                    parcelH03.writeInt(i);
                    g73.I0(parcelH03, 7);
                    G7 g74 = (G7) ((J7) wVar.f141d);
                    Parcel parcelH04 = g74.h0();
                    parcelH04.writeIntArray(null);
                    g74.I0(parcelH04, 4);
                    G7 g75 = (G7) ((J7) wVar.f141d);
                    g75.I0(g75.h0(), 3);
                }
            } catch (RemoteException e6) {
                u2.k.d("Clearcut log failed", e6);
            }
        }
    }

    private final void d() throws Throwable {
        LinkedHashMap linkedHashMap;
        K4.c cVar = (K4.c) this.f16831b;
        cVar.getClass();
        while (true) {
            try {
                L9 l9 = (L9) ((ArrayBlockingQueue) cVar.f2209b).take();
                K9 k9B = l9.b();
                if (!TextUtils.isEmpty(k9B.f9465a)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.f2212e;
                    synchronized (l9.f9633c) {
                        p2.j.f22785C.f22795h.a();
                        linkedHashMap = l9.f9632b;
                    }
                    cVar.s(cVar.p(linkedHashMap2, linkedHashMap), k9B);
                }
            } catch (InterruptedException e6) {
                u2.k.i("CsiReporter:reporter interrupted", e6);
                return;
            }
        }
    }

    private final void e() {
        C2841s c2841s;
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        C2841s c2841s2;
        long j6;
        long j7;
        long j8;
        long j9;
        C0522Gg c0522Gg = (C0522Gg) this.f16831b;
        String strO = C0522Gg.o(c0522Gg.f8412e);
        try {
            E9 e9 = H9.f8698Y;
            c2841s = C2841s.f23267e;
            jLongValue = ((Long) c2841s.f23270c.a(e9)).longValue() * 1000;
            jIntValue = ((Integer) c2841s.f23270c.a(H9.f8847w)).intValue();
            zBooleanValue = ((Boolean) c2841s.f23270c.a(H9.f8792n2)).booleanValue();
        } catch (Exception e6) {
            String str = c0522Gg.f8412e;
            String message = e6.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            u2.k.h(sb.toString());
            p2.j.f22785C.f22795h.g("VideoStreamExoPlayerCache.preload", e6);
            c0522Gg.a();
            c0522Gg.l(c0522Gg.f8412e, strO, "error", C0522Gg.p("error", e6));
        }
        synchronized (c0522Gg) {
            p2.j.f22785C.f22797k.getClass();
            if (System.currentTimeMillis() - c0522Gg.i > jLongValue) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                sb2.append("Timeout reached. Limit: ");
                sb2.append(jLongValue);
                sb2.append(" ms");
                throw new IOException(sb2.toString());
            }
            if (c0522Gg.f8413f) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!c0522Gg.f8414g) {
                C2232zO c2232zO = c0522Gg.f8411d.f10026g;
                if (!(c2232zO != null)) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long jH1 = c2232zO.H1();
                if (jH1 > 0) {
                    long jI1 = c0522Gg.f8411d.f10026g.I1();
                    if (jI1 != c0522Gg.f8416j) {
                        boolean z6 = jI1 > 0;
                        String str2 = c0522Gg.f8412e;
                        if (zBooleanValue) {
                            C0641Ng c0641Ng = c0522Gg.f8411d;
                            j9 = (c0641Ng.f10018G == null || !c0641Ng.f10018G.f9498D) ? c0641Ng.f10029k : 0L;
                        } else {
                            j9 = -1;
                        }
                        long jQ = zBooleanValue ? c0522Gg.f8411d.q() : -1L;
                        j6 = jIntValue;
                        c2841s2 = c2841s;
                        j8 = jI1;
                        j7 = jH1;
                        u2.f.f23795b.post(new RunnableC2133xg(c0522Gg, str2, strO, jI1, jH1, j9, jQ, zBooleanValue ? c0522Gg.f8411d.r() : -1L, z6, C0641Ng.f10012I.get(), C0641Ng.f10013J.get()));
                        c0522Gg.f8416j = j8;
                    } else {
                        c2841s2 = c2841s;
                        j6 = jIntValue;
                        j7 = jH1;
                        j8 = jI1;
                    }
                    if (j8 >= j7) {
                        u2.f.f23795b.post(new RunnableC0420Ag(c0522Gg, c0522Gg.f8412e, strO, j7));
                    } else if (c0522Gg.f8411d.f10029k >= j6 && j8 > 0) {
                    }
                } else {
                    c2841s2 = c2841s;
                }
                C2911G.f23576l.postDelayed(new RunnableC1883t(22, c0522Gg), ((Long) c2841s2.f23270c.a(H9.f8703Z)).longValue());
                return;
            }
            p2.j.f22785C.f22786A.f17315a.remove(c0522Gg.f8415h);
        }
    }

    private final void f() {
        boolean z6;
        C0802Wo c0802Wo = (C0802Wo) this.f16831b;
        c0802Wo.getClass();
        try {
            C2909E c2909e = c0802Wo.f12320d;
            c2909e.m();
            synchronized (c2909e.f23548a) {
                z6 = c2909e.f23547E;
            }
            if (z6) {
                return;
            }
            C0785Vo c0785Vo = c0802Wo.f12318b;
            c0785Vo.f12087b = new C1184g(c0785Vo.f12086a);
            c0785Vo.a(new C1283hr(c0802Wo));
        } catch (Exception e6) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8600G5)).booleanValue()) {
                if (c0802Wo.f12322f == null) {
                    c0802Wo.f12322f = C1053de.c(c0802Wo.f12317a);
                }
                c0802Wo.f12322f.e("InstallReferrerUnsampled.initializeAndReport", e6);
            } else {
                if (c0802Wo.f12321e == null) {
                    c0802Wo.f12321e = C1053de.a(c0802Wo.f12317a);
                }
                c0802Wo.f12321e.e("InstallReferrer.initializeAndReport", e6);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA;
        C0784Vn c0784Vn;
        ActivityManager.MemoryInfo memoryInfoI;
        ProfileStore profileStore = null;
        int i = 1;
        switch (this.f16830a) {
            case 0:
                HQ hq = (HQ) ((InterfaceC1829s) this.f16831b);
                for (LQ lq : hq.f8927G) {
                    lq.l(true);
                    if (lq.f9708g != null) {
                        lq.f9708g = null;
                        lq.f9707f = null;
                    }
                }
                C2041vw c2041vw = hq.f8956k;
                InterfaceC1992v0 interfaceC1992v0 = (InterfaceC1992v0) c2041vw.f17370c;
                if (interfaceC1992v0 != null) {
                    interfaceC1992v0.d();
                    c2041vw.f17370c = null;
                }
                c2041vw.f17371d = null;
                return;
            case 1:
                ((B) this.f16831b).f7092h.mo6a();
                return;
            case 2:
                P p6 = (P) this.f16831b;
                p6.f10305m--;
                return;
            case 3:
                X x6 = (X) this.f16831b;
                x6.f11854a.postVsyncCallback(x6);
                return;
            case 4:
                C6 c6 = (C6) this.f16831b;
                synchronized (c6.f7528C) {
                    if (c6.f7529D) {
                        return;
                    }
                    c6.f7529D = true;
                    try {
                        c6.l();
                    } catch (Exception e6) {
                        ((C6) this.f16831b).f7536f.c(2023, -1L, e6);
                    }
                    C6 c62 = (C6) this.f16831b;
                    synchronized (c62.f7528C) {
                        c62.f7529D = false;
                    }
                    return;
                }
            case 5:
                a();
                return;
            case 6:
                ((ViewOnAttachStateChangeListenerC0919b7) this.f16831b).c();
                return;
            case 7:
                C1622o7 c1622o7 = (C1622o7) this.f16831b;
                c1622o7.getClass();
                try {
                    X6 x62 = c1622o7.f15897a;
                    DexClassLoader dexClassLoader = x62.f12377c;
                    byte[] bArr = x62.f12379e;
                    String str = c1622o7.f15898b;
                    x62.f12378d.getClass();
                    Class<?> clsLoadClass = dexClassLoader.loadClass(new String(C1994v2.y(str, bArr), "UTF-8"));
                    if (clsLoadClass != null) {
                        byte[] bArr2 = x62.f12379e;
                        String str2 = c1622o7.f15899c;
                        c1622o7.f15897a.f12378d.getClass();
                        c1622o7.f15900d = clsLoadClass.getMethod(new String(C1994v2.y(str2, bArr2), "UTF-8"), c1622o7.f15901e);
                    }
                } catch (M6 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
                } catch (Throwable th) {
                    c1622o7.f15902f.countDown();
                    throw th;
                }
                c1622o7.f15902f.countDown();
                return;
            case 8:
                ((N7) this.f16831b).d(3);
                return;
            case 9:
                b();
                return;
            case 10:
                ((C1677p8) this.f16831b).s();
                return;
            case 11:
                c();
                return;
            case 12:
                d();
                return;
            case 13:
                P9 p9 = (P9) this.f16831b;
                Context context = p9.f10327c;
                if (p9.f10330f != null || context == null || (strA = C2867j.a(context)) == null || strA.equals(context.getPackageName())) {
                    return;
                }
                p9.f23319a = context.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strA)) {
                    intent.setPackage(strA);
                }
                context.bindService(intent, p9, 33);
                return;
            case 14:
                ((S9) this.f16831b).d();
                return;
            case 15:
                H1.h hVar = (H1.h) this.f16831b;
                if (((C1838s8) hVar.f1765a) == null) {
                    return;
                }
                ((C1838s8) hVar.f1765a).h();
                Binder.flushPendingCommands();
                return;
            case 16:
                ((AtomicBoolean) ((C0969c3) this.f16831b).f13525f).set(false);
                return;
            case 17:
                ((AtomicBoolean) this.f16831b).getAndSet(true);
                return;
            case 18:
                C0589Kf c0589Kf = (C0589Kf) this.f16831b;
                while (c0589Kf.f9494e.get()) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    C2911G.f23576l.post(new RunnableC1883t(17, atomicBoolean));
                    try {
                        Thread.sleep(c0589Kf.f9495f);
                        if (!atomicBoolean.get()) {
                            E9 e9 = H9.bf;
                            G9 g9 = C2841s.f23267e.f23270c;
                            if (((Boolean) g9.a(e9)).booleanValue() && (c0784Vn = c0589Kf.f9491b) != null) {
                                C0697Ql c0697QlA = c0784Vn.a();
                                c0697QlA.r("action", "panr");
                                if (((Boolean) g9.a(H9.Ef)).booleanValue() && (memoryInfoI = u2.f.i(c0589Kf.f9492c)) != null) {
                                    c0697QlA.r("mem_avl", String.valueOf(memoryInfoI.availMem));
                                    c0697QlA.r("mem_tt", String.valueOf(memoryInfoI.totalMem));
                                    c0697QlA.r("low_m", true != memoryInfoI.lowMemory ? "0" : "1");
                                }
                                c0697QlA.x();
                            }
                            if (((Boolean) g9.a(H9.cf)).booleanValue()) {
                                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                                C0355t c0355t = new C0355t("Potential ANR detected");
                                c0355t.setStackTrace(stackTrace);
                                if (((Boolean) g9.a(H9.df)).booleanValue()) {
                                    C1053de.c(c0589Kf.f9492c).f(c0355t, "AnrWatchdog", ((Integer) g9.a(H9.ef)).intValue() / 100.0f);
                                } else {
                                    p2.j.f22785C.f22795h.f("AnrWatchdog", c0355t);
                                }
                            }
                        }
                        do {
                            try {
                                Thread.sleep(c0589Kf.f9496g);
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
            case 19:
                ((AbstractC0827Yf) this.f16831b).g();
                return;
            case 20:
                C0946bg c0946bg = (C0946bg) ((InterfaceC0810Xf) this.f16831b);
                boolean z6 = c0946bg.f13419h;
                ImageView imageView = c0946bg.f13410E;
                if (z6 && imageView.getParent() != null) {
                    c0946bg.f13413b.removeView(imageView);
                }
                AbstractC0827Yf abstractC0827Yf = c0946bg.f13418g;
                if (abstractC0827Yf == null || c0946bg.f13409D == null) {
                    return;
                }
                p2.j jVar = p2.j.f22785C;
                jVar.f22797k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (abstractC0827Yf.getBitmap(c0946bg.f13409D) != null) {
                    c0946bg.f13411F = true;
                }
                jVar.f22797k.getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (AbstractC2907C.o()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
                    sb.append("Spinner frame grab took ");
                    sb.append(jElapsedRealtime2);
                    sb.append("ms");
                    AbstractC2907C.m(sb.toString());
                }
                if (jElapsedRealtime2 > c0946bg.f13417f) {
                    u2.k.h("Spinner frame grab crossed jank threshold! Suspending spinner.");
                    c0946bg.f13421k = false;
                    c0946bg.f13409D = null;
                    L9 l9 = c0946bg.f13415d;
                    if (l9 != null) {
                        l9.c("spinner_jank", Long.toString(jElapsedRealtime2));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                p2.j.f22785C.f22786A.f17315a.remove((C1971ug) this.f16831b);
                return;
            case 22:
                e();
                return;
            case 23:
                C1273hh c1273hh = ((C1649oh) this.f16831b).f16008a;
                F0.f fVar = c1273hh.f14532a.f15216g0;
                fVar.f1437c = true;
                if (fVar.f1436b) {
                    fVar.h();
                }
                BinderC2894d binderC2894dX0 = c1273hh.f14532a.x0();
                if (binderC2894dX0 != null) {
                    binderC2894dX0.f23469l.removeView(binderC2894dX0.f23464f);
                    binderC2894dX0.Q3(true);
                    return;
                }
                return;
            case 24:
                int i3 = C1649oh.f15988W;
                K4.c cVarA = p2.j.f22785C.f22795h.a();
                String str3 = (String) this.f16831b;
                if (((HashSet) cVarA.i).contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) cVarA.f2215h);
                linkedHashMap.put("ue", str3);
                cVarA.s(cVarA.p((LinkedHashMap) cVarA.f2212e, linkedHashMap), null);
                return;
            case 25:
                C1437kl c1437kl = p2.j.f22785C.f22810x;
                Rv rv = ((C0837Yp) this.f16831b).f12708a;
                c1437kl.getClass();
                C1437kl.q(new RunnableC0735Sp(rv, i));
                return;
            case 26:
                C2188yh c2188yh = (C2188yh) this.f16831b;
                C0784Vn c0784Vn2 = c2188yh.f17740b;
                p2.j.f22785C.f22797k.getClass();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                C1972uh c1972uh = c2188yh.f17739a;
                c1972uh.getClass();
                if (!AbstractC0241a.k("MULTI_PROFILE")) {
                    u2.k.c("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e7) {
                    u2.k.c("Unable to get ProfileStore instance: ".concat(String.valueOf(e7.getMessage())));
                    try {
                        profileStore = (ProfileStore) T0.c.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e8) {
                        u2.k.c("Unable to get ProfileStore instance: ".concat(String.valueOf(e8.getMessage())));
                    }
                }
                if (profileStore == null) {
                    u2.k.h("WebViewCompat failure: No instance");
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.lf)).booleanValue()) {
                        C0697Ql c0697QlA2 = c0784Vn2.a();
                        c0697QlA2.r("action", "webview_p_f");
                        c0697QlA2.r("webview_p_f", "No instance");
                        c0697QlA2.s();
                        return;
                    }
                    return;
                }
                c1972uh.f17147a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.lf)).booleanValue()) {
                    p2.j.f22785C.f22797k.getClass();
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
                    C0697Ql c0697QlA3 = c0784Vn2.a();
                    c0697QlA3.r("action", "webview_p_l");
                    c0697QlA3.r("webview_p_l", Long.toString(jElapsedRealtime4));
                    c0697QlA3.s();
                    return;
                }
                return;
            case 27:
                ((C0421Ah) this.f16831b).a();
                return;
            case 28:
                f();
                return;
            default:
                ((C0541Hi) this.f16831b).f8987b.f9338d.i();
                return;
        }
    }
}
