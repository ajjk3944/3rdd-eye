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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10284a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10285b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10286c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10287d;

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, int i4) {
        this.f10284a = i4;
        this.f10285b = obj;
        this.f10286c = obj2;
        this.f10287d = obj3;
    }

    private final void a() {
        ja jaVar;
        ha haVar = (ha) this.f10285b;
        haVar.e();
        b5.i0 i0Var = (b5.i0) this.f10286c;
        ka kaVar = (ka) i0Var.f1823d;
        if (kaVar == null) {
            haVar.j(i0Var.f1821b);
        } else {
            synchronized (haVar.f11784e) {
                jaVar = haVar.f11785f;
            }
            jaVar.f(kaVar);
        }
        if (i0Var.f1820a) {
            haVar.a("intermediate-response");
        } else {
            haVar.b("done");
        }
        Runnable runnable = (Runnable) this.f10287d;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i4 = 1;
        final int i10 = 0;
        switch (this.f10284a) {
            case 0:
                g1 g1Var = (g1) this.f10285b;
                final mx1 mx1Var = (mx1) this.f10286c;
                final ps1 ps1Var = (ps1) this.f10287d;
                g1Var.getClass();
                String str = bq0.f9768a;
                wu1 wu1Var = g1Var.f11342b.f9804a.f12465s;
                final qu1 qu1VarP = wu1Var.p();
                wu1Var.l(qu1VarP, 1017, new rd0(qu1VarP, mx1Var, ps1Var, i10) { // from class: com.google.android.gms.internal.ads.tu1

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f16966a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ mx1 f16967b;

                    {
                        this.f16966a = i10;
                        this.f16967b = mx1Var;
                    }

                    @Override // com.google.android.gms.internal.ads.rd0
                    /* renamed from: c */
                    public final /* synthetic */ void mo160c(Object obj) {
                        ru1 ru1Var = (ru1) obj;
                        switch (this.f16966a) {
                            case 0:
                                ru1Var.l(this.f16967b);
                                break;
                            default:
                                ru1Var.j(this.f16967b);
                                break;
                        }
                    }
                });
                return;
            case 1:
                a();
                return;
            case 2:
                gh ghVar = (gh) this.f10285b;
                WebView webView = (WebView) this.f10286c;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", ghVar);
                        return;
                    } catch (Throwable unused) {
                        ghVar.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 3:
                sx sxVar = ((nx) this.f10287d).f14473q;
                if (sxVar != null) {
                    sxVar.c("error", "what", (String) this.f10285b, "extra", (String) this.f10286c);
                    return;
                }
                return;
            case 4:
                ((e00) this.f10285b).t((String) this.f10286c, (ValueCallback) this.f10287d);
                return;
            case 5:
                r00 r00Var = (r00) this.f10285b;
                Context context = (Context) this.f10286c;
                za.a aVar = (za.a) this.f10287d;
                ua.j jVar = ua.j.C;
                jVar.f35267k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                jVar.f35261c.F(context, aVar.f38129a);
                pk pkVar = sk.f16188jf;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    jVar.f35267k.getClass();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    rt rtVarA = r00Var.f15494b.a();
                    rtVarA.u("action", "webview_startup_l");
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
                    sb2.append(jElapsedRealtime2);
                    rtVarA.u("webview_startup_l", sb2.toString());
                    rtVarA.v();
                }
                if (!((Boolean) sVar.f36166c.a(sk.f16281pf)).booleanValue() || Build.VERSION.SDK_INT < 24) {
                    return;
                }
                fx.f11279f.execute(new s(25, r00Var));
                return;
            case 6:
                ((ct0) this.f10285b).b((String) this.f10286c, (z.e) this.f10287d, null, null);
                return;
            case 7:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f10285b;
                String str2 = (String) this.f10286c;
                za.l lVar = (za.l) this.f10287d;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str2});
                lh0.g(sQLiteDatabase, lVar);
                return;
            case 8:
                sj0.c((dq0) this.f10285b, (wp0) this.f10286c, (ci0) this.f10287d);
                return;
            case 9:
                c11 c11Var = (c11) this.f10285b;
                HashMap map = (HashMap) this.f10286c;
                Context context2 = (Context) this.f10287d;
                map.putAll(c11Var.f9918d.a());
                c11Var.h(map);
                map.put("f", "q");
                map.put("ctx", context2);
                return;
            case 10:
                s21 s21Var = (s21) this.f10285b;
                l21 l21Var = (l21) this.f10286c;
                km.y yVar = (km.y) this.f10287d;
                String str3 = s21Var.f15848b;
                try {
                    xi0 xi0Var = s21Var.f15847a;
                    if (xi0Var == null) {
                        throw null;
                    }
                    k21 k21Var = (k21) xi0Var.j;
                    if (k21Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str3);
                    String str4 = l21Var.f13335a;
                    if (!s21.b(str4)) {
                        str4.getClass();
                        bundle.putString("sessionToken", str4.trim());
                    }
                    String str5 = l21Var.f13336b;
                    if (!s21.b(str5)) {
                        str5.getClass();
                        bundle.putString("appId", str5.trim());
                    }
                    r21 r21Var = new r21(s21Var, yVar);
                    i21 i21Var = (i21) k21Var;
                    Parcel parcelT = i21Var.T();
                    ng.c(parcelT, bundle);
                    ng.e(parcelT, r21Var);
                    i21Var.u1(parcelT, 2);
                    return;
                } catch (RemoteException e2) {
                    s21.f15845c.e(e2, "dismiss overlay display from: %s", str3);
                    return;
                }
            case 11:
                s21 s21Var2 = (s21) this.f10285b;
                n21 n21Var = (n21) this.f10286c;
                km.y yVar2 = (km.y) this.f10287d;
                String str6 = s21Var2.f15848b;
                try {
                    xi0 xi0Var2 = s21Var2.f15847a;
                    if (xi0Var2 == null) {
                        throw null;
                    }
                    k21 k21Var2 = (k21) xi0Var2.j;
                    if (k21Var2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str6);
                    bundle2.putBinder("windowToken", n21Var.f14134a);
                    String str7 = n21Var.f14139f;
                    if (!s21.b(str7)) {
                        str7.getClass();
                        bundle2.putString("adFieldEnifd", str7.trim());
                    }
                    bundle2.putInt("layoutGravity", n21Var.f14136c);
                    bundle2.putFloat("layoutVerticalMargin", n21Var.f14137d);
                    bundle2.putInt("displayMode", 0);
                    bundle2.putInt("triggerMode", 0);
                    bundle2.putInt("windowWidthPx", n21Var.f14138e);
                    if (!s21.b(null) || !s21.b(null)) {
                        throw null;
                    }
                    String str8 = n21Var.f14135b;
                    if (!s21.b(str8)) {
                        str8.getClass();
                        bundle2.putString("appId", str8.trim());
                    }
                    if (!s21.b(null)) {
                        throw null;
                    }
                    bundle2.putBoolean("stableSessionToken", true);
                    r21 r21Var2 = new r21(s21Var2, yVar2);
                    i21 i21Var2 = (i21) k21Var2;
                    Parcel parcelT2 = i21Var2.T();
                    parcelT2.writeString(str6);
                    ng.c(parcelT2, bundle2);
                    ng.e(parcelT2, r21Var2);
                    i21Var2.u1(parcelT2, 1);
                    return;
                } catch (RemoteException e10) {
                    s21.f15845c.e(e10, "show overlay display from: %s", str6);
                    return;
                }
            case 12:
                vt1 vt1Var = (vt1) this.f10285b;
                u41 u41Var = (u41) this.f10286c;
                jy1 jy1Var = (jy1) this.f10287d;
                wu1 wu1Var2 = vt1Var.f17707c;
                u51 u51VarF = u41Var.f();
                hp1 hp1Var = wu1Var2.g;
                hp1Var.getClass();
                ai aiVar = wu1Var2.f18200d;
                aiVar.getClass();
                aiVar.f9331b = x41.q(u51VarF);
                if (!u51VarF.isEmpty()) {
                    aiVar.f9334e = (jy1) u51VarF.get(0);
                    jy1Var.getClass();
                    aiVar.f9335f = jy1Var;
                }
                if (((jy1) aiVar.f9333d) == null) {
                    aiVar.f9333d = ai.w(hp1Var, (x41) aiVar.f9331b, (jy1) aiVar.f9334e, (tg) aiVar.f9330a);
                }
                aiVar.u(hp1Var.l1());
                return;
            case 13:
                Pair pair = (Pair) this.f10286c;
                ((wu1) ((zt1) this.f10285b).f19181b.f18038i).k(((Integer) pair.first).intValue(), (jy1) pair.second, (a0.c0) this.f10287d);
                return;
            case 14:
                g1 g1Var2 = (g1) this.f10285b;
                final mx1 mx1Var2 = (mx1) this.f10286c;
                final ps1 ps1Var2 = (ps1) this.f10287d;
                g1Var2.getClass();
                String str9 = bq0.f9768a;
                wu1 wu1Var3 = g1Var2.f11342b.f9804a.f12465s;
                final qu1 qu1VarP2 = wu1Var3.p();
                wu1Var3.l(qu1VarP2, 1009, new rd0(qu1VarP2, mx1Var2, ps1Var2, i4) { // from class: com.google.android.gms.internal.ads.tu1

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f16966a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ mx1 f16967b;

                    {
                        this.f16966a = i4;
                        this.f16967b = mx1Var2;
                    }

                    @Override // com.google.android.gms.internal.ads.rd0
                    /* renamed from: c */
                    public final /* synthetic */ void mo160c(Object obj) {
                        ru1 ru1Var = (ru1) obj;
                        switch (this.f16966a) {
                            case 0:
                                ru1Var.l(this.f16967b);
                                break;
                            default:
                                ru1Var.j(this.f16967b);
                                break;
                        }
                    }
                });
                return;
            default:
                AudioTrack audioTrack = (AudioTrack) this.f10285b;
                Handler handler = (Handler) this.f10286c;
                final yf0 yf0Var = (yf0) this.f10287d;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vv1
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i10) {
                                    case 0:
                                        uu1 uu1Var = uu1.f17345b;
                                        yf0 yf0Var2 = yf0Var;
                                        yf0Var2.c(-1, uu1Var);
                                        yf0Var2.d();
                                        break;
                                    default:
                                        uu1 uu1Var2 = uu1.f17345b;
                                        yf0 yf0Var3 = yf0Var;
                                        yf0Var3.c(-1, uu1Var2);
                                        yf0Var3.d();
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (bw1.f9818p) {
                        try {
                            int i11 = bw1.f9820r - 1;
                            bw1.f9820r = i11;
                            if (i11 == 0) {
                                ScheduledExecutorService scheduledExecutorService = bw1.f9819q;
                                if (scheduledExecutorService == null) {
                                    throw null;
                                }
                                scheduledExecutorService.shutdown();
                                bw1.f9819q = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vv1
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i4) {
                                    case 0:
                                        uu1 uu1Var = uu1.f17345b;
                                        yf0 yf0Var2 = yf0Var;
                                        yf0Var2.c(-1, uu1Var);
                                        yf0Var2.d();
                                        break;
                                    default:
                                        uu1 uu1Var2 = uu1.f17345b;
                                        yf0 yf0Var3 = yf0Var;
                                        yf0Var3.c(-1, uu1Var2);
                                        yf0Var3.d();
                                        break;
                                }
                            }
                        });
                    }
                    synchronized (bw1.f9818p) {
                        try {
                            int i12 = bw1.f9820r - 1;
                            bw1.f9820r = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = bw1.f9819q;
                                if (scheduledExecutorService2 == null) {
                                    throw null;
                                }
                                scheduledExecutorService2.shutdown();
                                bw1.f9819q = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
        }
    }

    public d1(hh hhVar, ch chVar, WebView webView, boolean z3) {
        this.f10284a = 2;
        this.f10286c = webView;
        this.f10287d = hhVar;
        this.f10285b = new gh(this, chVar, webView, z3);
    }

    public d1(nx nxVar, String str, String str2) {
        this.f10284a = 3;
        this.f10285b = str;
        this.f10286c = str2;
        this.f10287d = nxVar;
    }
}
