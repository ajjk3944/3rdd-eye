package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0912b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13279a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13280b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13281c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13282d;

    public /* synthetic */ RunnableC0912b0(Object obj, Object obj2, Object obj3, int i) {
        this.f13279a = i;
        this.f13280b = obj;
        this.f13281c = obj2;
        this.f13282d = obj3;
    }

    private final void a() {
        E4 e42;
        C4 c42 = (C4) this.f13280b;
        c42.e();
        A1.s sVar = (A1.s) this.f13281c;
        F4 f42 = (F4) sVar.f125d;
        if (f42 == null) {
            c42.j(sVar.f123b);
        } else {
            synchronized (c42.f7520e) {
                e42 = c42.f7521f;
            }
            e42.a(f42);
        }
        if (sVar.f122a) {
            c42.a("intermediate-response");
        } else {
            c42.b("done");
        }
        Runnable runnable = (Runnable) this.f13282d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i = 1;
        final int i3 = 0;
        switch (this.f13279a) {
            case 0:
                C0697Ql c0697Ql = (C0697Ql) this.f13280b;
                TP tp = (TP) this.f13281c;
                CN cn = (CN) this.f13282d;
                c0697Ql.getClass();
                String str = Vt.f12096a;
                GO go = ((NN) c0697Ql.f10692c).f9997a.f11649G;
                BO boY = go.y();
                go.t(boY, 1017, new C2255zu(boY, tp, cn));
                return;
            case 1:
                a();
                return;
            case 2:
                V7 v7 = (V7) this.f13280b;
                WebView webView = (WebView) this.f13281c;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", v7);
                        return;
                    } catch (Throwable unused) {
                        v7.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 3:
                C0946bg c0946bg = ((TextureViewSurfaceTextureListenerC0793Wf) this.f13282d).f12233E;
                if (c0946bg != null) {
                    c0946bg.c("error", "what", (String) this.f13280b, "extra", (String) this.f13281c);
                    return;
                }
                return;
            case 4:
                ((ViewTreeObserverOnGlobalLayoutListenerC1433kh) this.f13280b).E((String) this.f13281c, (ValueCallback) this.f13282d);
                return;
            case 5:
                C2188yh c2188yh = (C2188yh) this.f13280b;
                Context context = (Context) this.f13281c;
                C2951a c2951a = (C2951a) this.f13282d;
                p2.j jVar = p2.j.f22785C;
                jVar.f22797k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                jVar.f22790c.F(context, c2951a.f23784a);
                E9 e9 = H9.gf;
                C2841s c2841s = C2841s.f23267e;
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    jVar.f22797k.getClass();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    C0697Ql c0697QlA = c2188yh.f17740b.a();
                    c0697QlA.r("action", "webview_startup_l");
                    StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
                    sb.append(jElapsedRealtime2);
                    c0697QlA.r("webview_startup_l", sb.toString());
                    c0697QlA.s();
                }
                if (!((Boolean) c2841s.f23270c.a(H9.nf)).booleanValue() || Build.VERSION.SDK_INT < 24) {
                    return;
                }
                AbstractC0640Nf.f10010f.execute(new RunnableC1883t(26, c2188yh));
                return;
            case 6:
                ((C2202yv) this.f13280b).b((String) this.f13281c, (d4.h) this.f13282d, null, null);
                return;
            case 7:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f13280b;
                String str2 = (String) this.f13281c;
                u2.n nVar = (u2.n) this.f13282d;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str2});
                C0633Mp.d(sQLiteDatabase, nVar);
                return;
            case 8:
                C0770Uq.c((Xt) this.f13280b, (Qt) this.f13281c, (C1119eq) this.f13282d);
                return;
            case 9:
                Pz pz = (Pz) this.f13280b;
                HashMap map = (HashMap) this.f13281c;
                Context context2 = (Context) this.f13282d;
                map.putAll(pz.f10549d.a());
                pz.h(map);
                map.put("f", "q");
                map.put("ctx", context2);
                return;
            case 10:
                GA ga = (GA) this.f13280b;
                C2218zA c2218zA = (C2218zA) this.f13281c;
                h2.d dVar = (h2.d) this.f13282d;
                String str3 = ga.f8330b;
                try {
                    C0447Bq c0447Bq = ga.f8329a;
                    if (c0447Bq == null) {
                        throw null;
                    }
                    InterfaceC2164yA interfaceC2164yA = (InterfaceC2164yA) c0447Bq.f7453j;
                    if (interfaceC2164yA == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str3);
                    String str4 = c2218zA.f17832a;
                    if (!GA.b(str4)) {
                        str4.getClass();
                        bundle.putString("sessionToken", str4.trim());
                    }
                    String str5 = c2218zA.f17833b;
                    if (!GA.b(str5)) {
                        str5.getClass();
                        bundle.putString("appId", str5.trim());
                    }
                    FA fa = new FA(ga, dVar);
                    C2056wA c2056wA = (C2056wA) interfaceC2164yA;
                    Parcel parcelH0 = c2056wA.h0();
                    C7.c(parcelH0, bundle);
                    C7.e(parcelH0, fa);
                    c2056wA.d1(parcelH0, 2);
                    return;
                } catch (RemoteException e6) {
                    GA.f8327c.g(e6, "dismiss overlay display from: %s", str3);
                    return;
                }
            case 11:
                GA ga2 = (GA) this.f13280b;
                BA ba = (BA) this.f13281c;
                h2.d dVar2 = (h2.d) this.f13282d;
                String str6 = ga2.f8330b;
                try {
                    C0447Bq c0447Bq2 = ga2.f8329a;
                    if (c0447Bq2 == null) {
                        throw null;
                    }
                    InterfaceC2164yA interfaceC2164yA2 = (InterfaceC2164yA) c0447Bq2.f7453j;
                    if (interfaceC2164yA2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str6);
                    bundle2.putBinder("windowToken", ba.f7312a);
                    String str7 = ba.f7317f;
                    if (!GA.b(str7)) {
                        str7.getClass();
                        bundle2.putString("adFieldEnifd", str7.trim());
                    }
                    bundle2.putInt("layoutGravity", ba.f7314c);
                    bundle2.putFloat("layoutVerticalMargin", ba.f7315d);
                    bundle2.putInt("displayMode", 0);
                    bundle2.putInt("triggerMode", 0);
                    bundle2.putInt("windowWidthPx", ba.f7316e);
                    if (!GA.b(null) || !GA.b(null)) {
                        throw null;
                    }
                    String str8 = ba.f7313b;
                    if (!GA.b(str8)) {
                        str8.getClass();
                        bundle2.putString("appId", str8.trim());
                    }
                    if (!GA.b(null)) {
                        throw null;
                    }
                    bundle2.putBoolean("stableSessionToken", true);
                    FA fa2 = new FA(ga2, dVar2);
                    C2056wA c2056wA2 = (C2056wA) interfaceC2164yA2;
                    Parcel parcelH02 = c2056wA2.h0();
                    parcelH02.writeString(str6);
                    C7.c(parcelH02, bundle2);
                    C7.e(parcelH02, fa2);
                    c2056wA2.d1(parcelH02, 1);
                    return;
                } catch (RemoteException e7) {
                    GA.f8327c.g(e7, "show overlay display from: %s", str6);
                    return;
                }
            case 12:
                C1263hO c1263hO = (C1263hO) this.f13280b;
                IB ib = (IB) this.f13281c;
                C1749qQ c1749qQ = (C1749qQ) this.f13282d;
                GO go2 = c1263hO.f14479c;
                C1197gC c1197gCF = ib.f();
                VL vl = go2.f8370g;
                vl.getClass();
                C1677p8 c1677p8 = go2.f8367d;
                c1677p8.getClass();
                c1677p8.f16138b = LB.m(c1197gCF);
                if (!c1197gCF.isEmpty()) {
                    c1677p8.f16141e = (C1749qQ) c1197gCF.get(0);
                    c1749qQ.getClass();
                    c1677p8.f16142f = c1749qQ;
                }
                if (((C1749qQ) c1677p8.f16140d) == null) {
                    c1677p8.f16140d = C1677p8.x(vl, (LB) c1677p8.f16138b, (C1749qQ) c1677p8.f16141e, (I7) c1677p8.f16137a);
                }
                c1677p8.v(vl.y1());
                return;
            case 13:
                Pair pair = (Pair) this.f13281c;
                ((GO) ((C1477lO) this.f13280b).f15385b.i).p(((Integer) pair.first).intValue(), (C1749qQ) pair.second, (C1587nQ) this.f13282d);
                return;
            case 14:
                Vu vu = (Vu) this.f13280b;
                TP tp2 = (TP) this.f13281c;
                CN cn2 = (CN) this.f13282d;
                vu.getClass();
                String str9 = Vt.f12096a;
                GO go3 = ((NN) vu.f12106b).f9997a.f11649G;
                BO boY2 = go3.y();
                go3.t(boY2, 1009, new C1448kw(boY2, tp2, cn2));
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f13280b;
                Handler handler = (Handler) this.f13281c;
                final C1009cp c1009cp = (C1009cp) this.f13282d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.fP
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i3) {
                                    case 0:
                                        EO eo = EO.f7949b;
                                        C1009cp c1009cp2 = c1009cp;
                                        c1009cp2.c(-1, eo);
                                        c1009cp2.d();
                                        break;
                                    default:
                                        EO eo2 = EO.f7949b;
                                        C1009cp c1009cp3 = c1009cp;
                                        c1009cp3.c(-1, eo2);
                                        c1009cp3.d();
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (C1424kP.f15146p) {
                        try {
                            int i6 = C1424kP.f15148r - 1;
                            C1424kP.f15148r = i6;
                            if (i6 == 0) {
                                ScheduledExecutorService scheduledExecutorService = C1424kP.f15147q;
                                if (scheduledExecutorService == null) {
                                    throw null;
                                }
                                scheduledExecutorService.shutdown();
                                C1424kP.f15147q = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.fP
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i) {
                                    case 0:
                                        EO eo = EO.f7949b;
                                        C1009cp c1009cp2 = c1009cp;
                                        c1009cp2.c(-1, eo);
                                        c1009cp2.d();
                                        break;
                                    default:
                                        EO eo2 = EO.f7949b;
                                        C1009cp c1009cp3 = c1009cp;
                                        c1009cp3.c(-1, eo2);
                                        c1009cp3.d();
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (C1424kP.f15146p) {
                        try {
                            int i7 = C1424kP.f15148r - 1;
                            C1424kP.f15148r = i7;
                            if (i7 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = C1424kP.f15147q;
                                if (scheduledExecutorService2 == null) {
                                    throw null;
                                }
                                scheduledExecutorService2.shutdown();
                                C1424kP.f15147q = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
        }
    }

    public RunnableC0912b0(W7 w7, R7 r7, WebView webView, boolean z6) {
        this.f13279a = 2;
        this.f13281c = webView;
        this.f13282d = w7;
        this.f13280b = new V7(this, r7, webView, z6);
    }

    public RunnableC0912b0(TextureViewSurfaceTextureListenerC0793Wf textureViewSurfaceTextureListenerC0793Wf, String str, String str2) {
        this.f13279a = 3;
        this.f13280b = str;
        this.f13281c = str2;
        this.f13282d = textureViewSurfaceTextureListenerC0793Wf;
    }
}
