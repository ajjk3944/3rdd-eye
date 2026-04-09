package com.zipoapps.blytics;

import A8.d;
import A9.C0575f;
import A9.F;
import A9.U;
import J8.C0691f;
import J8.C0702q;
import a8.C1674f;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import androidx.work.m;
import androidx.work.p;
import b2.C1842w;
import c2.C2057g;
import com.google.gson.Gson;
import com.zipoapps.blytics.SessionManager;
import com.zipoapps.premiumhelper.c;
import com.zipoapps.premiumhelper.e;
import g2.AbstractC4381e;
import i8.C4461a;
import java.time.Duration;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import v9.h;
import va.a;

/* compiled from: SessionManager.kt */
/* loaded from: classes3.dex */
public final class a implements InterfaceC1771d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SessionManager f36985b;

    public a(SessionManager sessionManager) {
        this.f36985b = sessionManager;
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onDestroy(InterfaceC1790x interfaceC1790x) {
        a.b bVar = va.a.f47104a;
        bVar.a("onDestroy()-> Application is destroyed", new Object[0]);
        SessionManager sessionManager = this.f36985b;
        C0702q.c(AbstractC4381e.d(sessionManager.f36982a), new C1674f(0), new d(1), 2);
        SessionManager.SessionData sessionData = sessionManager.f36984c;
        if (sessionData == null) {
            bVar.a("No active session found !", new Object[0]);
            return;
        }
        sessionManager.f36984c = null;
        sessionData.calculateDuration();
        bVar.a("closeSessionOnDestroy()-> called. ID: " + sessionData.getSessionId() + " Session duration: " + sessionData.getDuration() + " millis", new Object[0]);
        sessionManager.a(sessionData.createCloseSessionData());
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStart(InterfaceC1790x interfaceC1790x) throws PackageManager.NameNotFoundException {
        SessionManager sessionManager = this.f36985b;
        SessionManager.SessionData sessionData = sessionManager.f36984c;
        com.zipoapps.premiumhelper.d dVar = sessionManager.f36982a;
        if (sessionData == null) {
            va.a.f47104a.a("New session created", new Object[0]);
            String string = UUID.randomUUID().toString();
            l.e(string, "toString(...)");
            SessionManager.SessionData sessionData2 = new SessionManager.SessionData(string, System.currentTimeMillis(), 0L, 4, null);
            sessionManager.f36984c = sessionData2;
            C0575f.e(F.a(U.f211a), null, null, new b(sessionData2, null), 3);
            SessionManager.SessionData sessionData3 = sessionManager.f36984c;
            if (sessionData3 != null) {
                e.f37006D.getClass();
                c preferences = e.a.a().i;
                l.f(preferences, "preferences");
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? dVar.getPackageManager().getPackageInfo(dVar.getPackageName(), 0).getLongVersionCode() : r4.versionCode;
                SharedPreferences sharedPreferences = preferences.f37004a;
                long j4 = sharedPreferences.getLong("last_installed_version", -1L);
                if (j4 != longVersionCode) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong("last_installed_version", longVersionCode);
                    editorEdit.apply();
                    if (j4 != -1) {
                        e eVarA = e.a.a();
                        String sessionId = sessionData3.getSessionId();
                        C4461a c4461a = eVarA.f37021k;
                        c4461a.getClass();
                        l.f(sessionId, "sessionId");
                        c4461a.r(c4461a.c("App_update", false, G0.d.a(new b9.l("session_id", sessionId))));
                    }
                }
            }
        }
        C0702q.c(AbstractC4381e.d(dVar), new C1674f(0), new d(1), 2);
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStop(InterfaceC1790x interfaceC1790x) throws Throwable {
        SessionManager sessionManager;
        SessionManager.SessionData sessionData;
        e.f37006D.getClass();
        if (!e.a.a().i.k() && (sessionData = (sessionManager = this.f36985b).f36984c) != null) {
            sessionData.calculateDuration();
            l8.d<Integer> PH_SESSION_TIMEOUT_SECONDS = i8.d.f38544X;
            l.e(PH_SESSION_TIMEOUT_SECONDS, "PH_SESSION_TIMEOUT_SECONDS");
            long jIntValue = ((Number) sessionManager.f36983b.h(PH_SESSION_TIMEOUT_SECONDS)).intValue();
            HashMap map = new HashMap();
            map.put("session", new Gson().g(sessionData.createCloseSessionData()));
            p.a aVar = new p.a(SessionManager.CloseSessionWorker.class);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            l.f(timeUnit, "timeUnit");
            aVar.f17047c.f17144g = timeUnit.toMillis(jIntValue);
            if (Long.MAX_VALUE - System.currentTimeMillis() <= aVar.f17047c.f17144g) {
                throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
            }
            androidx.work.e eVar = new androidx.work.e(map);
            androidx.work.e.i(eVar);
            aVar.f17047c.f17142e = eVar;
            if (Build.VERSION.SDK_INT >= 26) {
                androidx.work.a backoffPolicy = androidx.work.a.EXPONENTIAL;
                Duration durationOfMinutes = Duration.ofMinutes(1L);
                l.e(durationOfMinutes, "ofMinutes(...)");
                l.f(backoffPolicy, "backoffPolicy");
                aVar.f17045a = true;
                C1842w c1842w = aVar.f17047c;
                c1842w.f17148l = backoffPolicy;
                long jA = C2057g.a(durationOfMinutes);
                String str = C1842w.f17136x;
                if (jA > 18000000) {
                    m.e().h(str, "Backoff delay duration exceeds maximum value");
                }
                if (jA < 10000) {
                    m.e().h(str, "Backoff delay duration less than minimum value");
                }
                c1842w.f17149m = h.M(jA, 10000L, 18000000L);
            }
            va.a.f47104a.a("The close session task will run in " + jIntValue + " seconds", new Object[0]);
            C0702q.c(AbstractC4381e.d(sessionManager.f36982a), null, new C0691f(aVar, 1), 3);
        }
        e eVarA = e.a.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVarA.i.getClass();
        c.o(jCurrentTimeMillis);
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onCreate(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onPause(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onResume(InterfaceC1790x interfaceC1790x) {
    }
}
