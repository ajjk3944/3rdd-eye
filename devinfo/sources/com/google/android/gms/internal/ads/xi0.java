package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xi0 implements f90 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18392a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18393b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18394c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18395d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18396e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f18397f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f18398h;

    /* renamed from: i, reason: collision with root package name */
    public Object f18399i;
    public Object j;

    public xi0(Context context, za.a aVar, gx gxVar, wp0 wp0Var, qz qzVar, hq0 hq0Var, boolean z3, qo qoVar, qh0 qh0Var, qd0 qd0Var) {
        this.f18392a = context;
        this.f18394c = aVar;
        this.f18395d = gxVar;
        this.f18396e = wp0Var;
        this.f18397f = qzVar;
        this.g = hq0Var;
        this.f18398h = qoVar;
        this.f18393b = z3;
        this.f18399i = qh0Var;
        this.j = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.f90
    public wp0 a() {
        return (wp0) this.f18396e;
    }

    public void b(int i4, long j) {
        if (i4 == 0) {
            new kf.f("Unable to fetch the latest version of the template.");
            f();
        } else {
            ((ScheduledExecutorService) this.g).schedule(new e1(this, i4, j, 1), ((Random) this.f18398h).nextInt(4), TimeUnit.SECONDS);
        }
    }

    public void c(InputStream inputStream) throws JSONException, IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strS = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strS = d.h.s(strS, line);
            if (line.contains("}")) {
                int iIndexOf = strS.indexOf(123);
                int iLastIndexOf = strS.lastIndexOf(125);
                strS = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strS.substring(iIndexOf, iLastIndexOf + 1);
                if (!strS.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strS);
                    } catch (JSONException e2) {
                        new kf.c("Unable to parse config update message.", e2.getCause());
                        f();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e2);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        lf.i iVar = (lf.i) this.f18397f;
                        new kf.f("The server is temporarily unavailable. Try again in a few minutes.");
                        iVar.a();
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = ((LinkedHashSet) this.f18392a).isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = ((lf.g) this.f18395d).g.f28797a.getLong("last_template_version", 0L);
                        long j8 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j8 > j) {
                            b(3, j8);
                        }
                    }
                    if (jSONObject.has("retryIntervalSeconds")) {
                        g(jSONObject.getInt("retryIntervalSeconds"));
                    }
                    strS = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public void d() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f18394c;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    c(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e2);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                if (!this.f18393b) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e10);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (IOException e11) {
            Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.android.gms.internal.ads.f90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(boolean r18, android.content.Context r19, com.google.android.gms.internal.ads.m60 r20) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r0 = r1.f18398h
            r2 = r0
            com.google.android.gms.internal.ads.qo r2 = (com.google.android.gms.internal.ads.qo) r2
            java.lang.Object r0 = r1.f18395d
            com.google.android.gms.internal.ads.gx r0 = (com.google.android.gms.internal.ads.gx) r0
            java.lang.Object r0 = com.google.android.gms.internal.ads.yo0.I(r0)
            com.google.android.gms.internal.ads.s10 r0 = (com.google.android.gms.internal.ads.s10) r0
            java.lang.Object r3 = r1.f18397f
            r6 = r3
            com.google.android.gms.internal.ads.qz r6 = (com.google.android.gms.internal.ads.qz) r6
            r3 = 1
            r6.T0(r3)
            ua.f r7 = new ua.f
            boolean r4 = r1.f18393b
            r5 = 0
            if (r4 == 0) goto L26
            boolean r8 = r2.b(r5)
            goto L27
        L26:
            r8 = r5
        L27:
            ua.j r9 = ua.j.C
            ya.f0 r9 = r9.f35261c
            java.lang.Object r9 = r1.f18392a
            android.content.Context r9 = (android.content.Context) r9
            boolean r9 = ya.f0.j(r9)
            if (r4 == 0) goto L3d
            monitor-enter(r2)
            boolean r10 = r2.f15383b     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            if (r10 == 0) goto L3d
            r10 = r3
            goto L42
        L3d:
            r10 = r5
            goto L42
        L3f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r0
        L42:
            if (r4 == 0) goto L4a
            float r2 = r2.c()
        L48:
            r11 = r2
            goto L4c
        L4a:
            r2 = 0
            goto L48
        L4c:
            java.lang.Object r2 = r1.f18396e
            com.google.android.gms.internal.ads.wp0 r2 = (com.google.android.gms.internal.ads.wp0) r2
            boolean r13 = r2.O
            r14 = 0
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            if (r20 == 0) goto L5d
            r20.v1()
        L5d:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.es1 r0 = r0.f15838e0
            java.lang.Object r0 = r0.a()
            r5 = r0
            com.google.android.gms.internal.ads.d90 r5 = (com.google.android.gms.internal.ads.d90) r5
            r10 = r7
            int r7 = r2.Q
            java.lang.Object r0 = r1.f18394c
            r8 = r0
            za.a r8 = (za.a) r8
            java.lang.String r9 = r2.B
            com.google.android.gms.internal.ads.aq0 r0 = r2.f18106s
            java.lang.String r11 = r0.f9387b
            java.lang.String r12 = r0.f9386a
            java.lang.Object r0 = r1.g
            com.google.android.gms.internal.ads.hq0 r0 = (com.google.android.gms.internal.ads.hq0) r0
            boolean r2 = r2.b()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r1.f18399i
            com.google.android.gms.internal.ads.qh0 r2 = (com.google.android.gms.internal.ads.qh0) r2
        L86:
            r15 = r2
            goto L8a
        L88:
            r2 = 0
            goto L86
        L8a:
            java.lang.String r13 = r0.g
            java.lang.String r16 = r6.G1()
            r14 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r1.j
            com.google.android.gms.internal.ads.qd0 r0 = (com.google.android.gms.internal.ads.qd0) r0
            r2 = r19
            ja.c.E(r2, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xi0.e(boolean, android.content.Context, com.google.android.gms.internal.ads.m60):void");
    }

    public synchronized void f() {
        Iterator it = ((LinkedHashSet) this.f18392a).iterator();
        while (it.hasNext()) {
            ((lf.i) it.next()).a();
        }
    }

    public synchronized void g(int i4) {
        ((tb.a) this.f18399i).getClass();
        ((lf.l) this.j).f(new Date(new Date(System.currentTimeMillis()).getTime() + (i4 * 1000)));
    }

    public void h(ev1 ev1Var) {
        if (!this.f18393b || ev1Var.equals((ev1) this.f18398h)) {
            return;
        }
        this.f18398h = ev1Var;
        cw1 cw1Var = (cw1) ((rg0) this.f18394c).f15651b;
        cw1Var.e();
        ev1 ev1Var2 = cw1Var.f10238e;
        if (ev1Var2 == null || ev1Var.equals(ev1Var2)) {
            return;
        }
        cw1Var.f10238e = ev1Var;
        yf0 yf0Var = cw1Var.f10236c;
        if (yf0Var != null) {
            yf0Var.c(-1, uu1.g);
            yf0Var.d();
        }
    }

    public void i(Runnable runnable) {
        ((Handler) ((l31) this.f18394c).b()).post(new v21(this, runnable, 1));
    }

    public xi0(Context context, rg0 rg0Var, p50 p50Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f18392a = applicationContext;
        this.f18394c = rg0Var;
        this.j = p50Var;
        this.f18399i = audioDeviceInfo;
        String str = bq0.f9768a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f18395d = handler;
        this.f18396e = new fv1(this);
        this.f18397f = new kf(5, this);
        ev1 ev1Var = ev1.f10889c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new gv1(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public xi0(Context context, ka1 ka1Var, Intent intent) {
        this.f18397f = new ArrayList();
        this.f18392a = context;
        this.f18395d = ka1Var;
        this.f18396e = "OverlayDisplayService";
        this.g = intent;
        this.f18394c = yo0.d(new tk0((byte) 0, 18));
        this.f18398h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.u21
            @Override // android.os.IBinder.DeathRecipient
            public final /* synthetic */ void binderDied() {
                xi0 xi0Var = this.f17040a;
                ((ka1) xi0Var.f18395d).a("%s : Binder has died.", (String) xi0Var.f18396e);
                ArrayList arrayList = (ArrayList) xi0Var.f18397f;
                synchronized (arrayList) {
                    arrayList.clear();
                }
            }
        };
    }

    public xi0(HttpURLConnection httpURLConnection, lf.g gVar, lf.b bVar, LinkedHashSet linkedHashSet, lf.i iVar, ScheduledExecutorService scheduledExecutorService, lf.l lVar) {
        this.f18394c = httpURLConnection;
        this.f18395d = gVar;
        this.f18396e = bVar;
        this.f18392a = linkedHashSet;
        this.f18397f = iVar;
        this.g = scheduledExecutorService;
        this.f18398h = new Random();
        this.f18393b = false;
        this.j = lVar;
        this.f18399i = tb.a.f34528a;
    }
}
