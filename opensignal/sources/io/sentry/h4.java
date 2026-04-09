package io.sentry;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.firebase.messaging.FirebaseMessaging;
import com.staircase3.opensignal.viewcontrollers.TabCoverage;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class h4 implements n3, l6, o3, dd.a, dd.g, pm.a, dd.e, u9.b, t9.f, qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12307a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12308d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12309g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f12310r;

    public /* synthetic */ h4(Object obj, Object obj2, Object obj3, int i10) {
        this.f12307a = i10;
        this.f12308d = obj;
        this.f12309g = obj2;
        this.f12310r = obj3;
    }

    @Override // qb.h, a5.j
    public void a(Object obj) {
        ((AnalyticsListener) obj).onTracksChanged((x9.q) this.f12308d, (TrackGroupArray) this.f12309g, (ob.j) this.f12310r);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[PHI: r14
  0x0046: PHI (r14v18 p9.c) = (r14v11 p9.c), (r14v12 p9.c), (r14v13 p9.c), (r14v14 p9.c), (r14v15 p9.c), (r14v16 p9.c) binds: [B:11:0x0044, B:14:0x004e, B:17:0x0057, B:20:0x0060, B:23:0x0069, B:26:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // t9.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.h4.apply(java.lang.Object):java.lang.Object");
    }

    @Override // pm.a
    public void b(String str) {
        switch (this.f12307a) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                TabCoverage tabCoverage = (TabCoverage) this.f12308d;
                View view = (View) this.f12309g;
                View view2 = (View) this.f12310r;
                view.setVisibility(8);
                view2.setVisibility(8);
                if (new JSONObject(str).getJSONObject("meta").getInt("status_code") == 200) {
                    ((LinearLayout) tabCoverage.f6203x0.f834d.f2830d).setVisibility(8);
                    tabCoverage.y0(true);
                    ((Button) tabCoverage.f6203x0.f831a.f14398r).setEnabled(true);
                    ArrayList arrayListN0 = TabCoverage.n0(str);
                    tabCoverage.q0();
                    if (!arrayListN0.isEmpty()) {
                        ((LinearLayout) tabCoverage.f6203x0.f834d.f2830d).setVisibility(8);
                        tabCoverage.y0(true);
                        ((Button) tabCoverage.f6203x0.f831a.f14398r).setEnabled(true);
                        h9.r2 r2Var = tabCoverage.f6203x0.f833c;
                        TextView textView = (TextView) r2Var.f10472g;
                        TextView textView2 = (TextView) r2Var.f10474x;
                        TextView textView3 = (TextView) r2Var.f10473r;
                        textView.setText(String.format("%.1f Mbps", Double.valueOf(((sm.d) arrayListN0.get(0)).f22123f / 1024.0d)));
                        textView2.setText(String.format("%.1f Mbps", Double.valueOf(((sm.d) arrayListN0.get(0)).f22124g / 1024.0d)));
                        textView3.setText(((int) ((sm.d) arrayListN0.get(0)).f22125h) + " ms");
                        break;
                    } else {
                        tabCoverage.A0(true);
                        break;
                    }
                } else {
                    tabCoverage.A0(false);
                    break;
                }
            default:
                TabCoverage tabCoverage2 = (TabCoverage) this.f12308d;
                ArrayList arrayList = (ArrayList) this.f12309g;
                ArrayList arrayList2 = (ArrayList) this.f12310r;
                TabCoverage.B0(TabCoverage.o0(str));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sm.d dVar = (sm.d) it.next();
                    cj.a aVarG = sm.f.G(dVar.f22120c);
                    if (aVarG != null) {
                        String str2 = (String) aVarG.f3977x;
                        String str3 = (String) aVarG.f3976r;
                        String str4 = (String) aVarG.f3974d;
                        if (str4 != null && !str4.isEmpty()) {
                            dVar.f22121d = str4;
                        }
                        if (str3 != null && !str3.isEmpty()) {
                            dVar.f22118a = str3;
                        }
                        if (str2 != null && !str2.isEmpty()) {
                            dVar.f22119b = str2;
                        }
                    }
                }
                if (arrayList2.size() == arrayList.size()) {
                    tabCoverage2.z0(arrayList);
                    break;
                }
                break;
        }
    }

    @Override // io.sentry.n3
    public void c(i6 i6Var) {
        ConcurrentHashMap concurrentHashMap;
        g1.f fVar = (g1.f) this.f12308d;
        t4 t4Var = (t4) this.f12309g;
        h0 h0Var = (h0) this.f12310r;
        if (i6Var == null) {
            ((x5) fVar.f9209d).getLogger().m(b5.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strE = null;
        h6 h6Var = t4Var.c() != null ? h6.Crashed : null;
        boolean z10 = h6.Crashed == h6Var || t4Var.d();
        io.sentry.protocol.n nVar = t4Var.f12271r;
        String str = (nVar == null || (concurrentHashMap = nVar.f12601y) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) t4Var.f12271r.f12601y.get("user-agent");
        Object objY = dr.a.y(h0Var);
        if (objY instanceof io.sentry.hints.a) {
            strE = ((io.sentry.hints.a) objY).e();
            h6Var = h6.Abnormal;
        }
        if (!i6Var.c(h6Var, str, z10, strE) || i6Var.B == h6.Ok) {
            return;
        }
        i6Var.b(dr.a.q());
    }

    @Override // io.sentry.o3
    public void d(k1 k1Var) {
        io.sentry.android.core.internal.gestures.f fVar = (io.sentry.android.core.internal.gestures.f) this.f12308d;
        z0 z0Var = (z0) this.f12309g;
        k1 k1Var2 = (k1) this.f12310r;
        if (k1Var == null) {
            z0Var.I(k1Var2);
        } else {
            fVar.f11609g.getLogger().m(b5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", k1Var2.getName());
        }
    }

    @Override // io.sentry.l6
    public void e(j6 j6Var) {
        io.sentry.android.core.c cVarB;
        g6 g6Var = (g6) this.f12308d;
        l6 l6Var = (l6) this.f12309g;
        AtomicReference atomicReference = (AtomicReference) this.f12310r;
        if (l6Var != null) {
            l6Var.e(j6Var);
        }
        io.sentry.android.core.e eVar = g6Var.f12290r.f12745i;
        if (eVar != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) eVar.f11559a;
            WeakReference weakReference = (WeakReference) eVar.f11560d;
            String str = (String) eVar.f11561g;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                p.v2 v2Var = activityLifecycleIntegration.M;
                io.sentry.protocol.t tVar = g6Var.f12275a;
                q qVarA = ((io.sentry.util.a) v2Var.B).a();
                try {
                    if (v2Var.f()) {
                        io.sentry.android.core.c cVar = null;
                        v2Var.h(new io.sentry.android.core.b(v2Var, activity, 1), null);
                        io.sentry.android.core.c cVar2 = (io.sentry.android.core.c) ((WeakHashMap) v2Var.f20204x).remove(activity);
                        if (cVar2 != null && (cVarB = v2Var.b()) != null) {
                            cVar = new io.sentry.android.core.c(cVarB.f11545a - cVar2.f11545a, cVarB.f11546b - cVar2.f11546b, cVarB.f11547c - cVar2.f11547c);
                        }
                        if (cVar != null) {
                            int i10 = cVar.f11547c;
                            int i11 = cVar.f11546b;
                            int i12 = cVar.f11545a;
                            if (i12 != 0 || i11 != 0 || i10 != 0) {
                                io.sentry.protocol.j jVar = new io.sentry.protocol.j("none", Integer.valueOf(i12));
                                io.sentry.protocol.j jVar2 = new io.sentry.protocol.j("none", Integer.valueOf(i11));
                                io.sentry.protocol.j jVar3 = new io.sentry.protocol.j("none", Integer.valueOf(i10));
                                HashMap map = new HashMap();
                                map.put("frames_total", jVar);
                                map.put("frames_slow", jVar2);
                                map.put("frames_frozen", jVar3);
                                ((ConcurrentHashMap) v2Var.f20203r).put(tVar, map);
                            }
                        }
                    }
                    qVarA.close();
                } catch (Throwable th2) {
                    try {
                        qVarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f11474r;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().m(b5.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        l lVar = g6Var.f12289q;
        if (lVar != null) {
            atomicReference.set(lVar.f(g6Var));
        }
    }

    @Override // u9.b
    public Object g() {
        r9.a aVar = (r9.a) this.f12308d;
        m9.i iVar = (m9.i) this.f12309g;
        m9.h hVar = (m9.h) this.f12310r;
        t9.h hVar2 = (t9.h) aVar.f21429d;
        hVar2.getClass();
        j9.d dVar = iVar.f16362c;
        if (Log.isLoggable(kc.f.z("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(dVar);
        }
        ((Long) hVar2.h(new h4(hVar2, hVar, iVar, 11))).getClass();
        aVar.f21426a.O(iVar, 1, false);
        return null;
    }

    @Override // dd.e
    public void h(Object obj) throws JSONException {
        js.e eVar = (js.e) this.f12308d;
        dd.r rVar = (dd.r) this.f12309g;
        ef.b bVar = (ef.b) this.f12310r;
        try {
            pg.d dVar = (pg.d) rVar.h();
            if (dVar != null) {
                ((Executor) eVar.f13800x).execute(new qg.a(bVar, ((q3.a) eVar.f13799r).x0(dVar), 0));
            }
        } catch (og.e e4) {
            io.sentry.android.core.e0.q("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e4);
        }
    }

    @Override // dd.a
    public Object j(dd.r rVar) throws NoSuchAlgorithmException {
        pg.d dVar;
        URL url;
        switch (this.f12307a) {
            case 3:
                dd.h hVar = (dd.h) this.f12308d;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f12309g;
                b9.e eVar = (b9.e) this.f12310r;
                if (rVar.j()) {
                    hVar.c(rVar.h());
                } else if (rVar.g() != null) {
                    hVar.b(rVar.g());
                } else if (atomicBoolean.getAndSet(true)) {
                    ((dd.r) ((b9.e) eVar.f2481d).f2481d).m(null);
                }
                return com.google.android.gms.internal.measurement.e5.u(null);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                og.b bVar = (og.b) this.f12308d;
                dd.r rVar2 = (dd.r) this.f12309g;
                dd.r rVar3 = (dd.r) this.f12310r;
                bVar.getClass();
                if (!rVar2.j() || rVar2.h() == null) {
                    return com.google.android.gms.internal.measurement.e5.u(Boolean.FALSE);
                }
                pg.d dVar2 = (pg.d) rVar2.h();
                return (rVar3.j() && (dVar = (pg.d) rVar3.h()) != null && dVar2.f20500c.equals(dVar.f20500c)) ? com.google.android.gms.internal.measurement.e5.u(Boolean.FALSE) : bVar.f19432e.d(dVar2).e(bVar.f19430c, new og.a(bVar));
            default:
                pg.k kVar = (pg.k) this.f12308d;
                dd.r rVar4 = (dd.r) this.f12309g;
                dd.r rVar5 = (dd.r) this.f12310r;
                if (!rVar4.j()) {
                    return com.google.android.gms.internal.measurement.e5.t(new og.c(rVar4.g(), "Firebase Installations failed to get installation auth token for config update listener connection."));
                }
                if (!rVar5.j()) {
                    return com.google.android.gms.internal.measurement.e5.t(new og.c(rVar5.g(), "Firebase Installations failed to get installation ID for config update listener connection."));
                }
                try {
                    try {
                        url = new URL(kVar.c(kVar.f20541m));
                    } catch (MalformedURLException unused) {
                        io.sentry.android.core.e0.d("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    kVar.i(httpURLConnection, (String) rVar5.h(), ((fg.a) rVar4.h()).f8838a);
                    return com.google.android.gms.internal.measurement.e5.u(httpURLConnection);
                } catch (IOException e4) {
                    return com.google.android.gms.internal.measurement.e5.t(new og.c(e4, "Failed to open HTTP stream connection"));
                }
        }
    }

    @Override // dd.g
    public dd.r o(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f12308d;
        String str = (String) this.f12309g;
        kg.s sVar = (kg.s) this.f12310r;
        String str2 = (String) obj;
        h7.r1 r1VarC = FirebaseMessaging.c(firebaseMessaging.f5823b);
        se.f fVar = firebaseMessaging.f5822a;
        fVar.a();
        String strD = "[DEFAULT]".equals(fVar.f22008b) ? "" : fVar.d();
        String strB = firebaseMessaging.f5829h.b();
        synchronized (r1VarC) {
            String strA = kg.s.a(System.currentTimeMillis(), str2, strB);
            if (strA != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) r1VarC.f10199d).edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strA);
                editorEdit.commit();
            }
        }
        if (sVar == null || !str2.equals(sVar.f14400a)) {
            se.f fVar2 = firebaseMessaging.f5822a;
            fVar2.a();
            if ("[DEFAULT]".equals(fVar2.f22008b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    fVar2.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new kg.i(firebaseMessaging.f5823b).b(intent);
            }
        }
        return com.google.android.gms.internal.measurement.e5.u(str2);
    }
}
