package fg;

import android.net.TrafficStats;
import bf.q;
import cc.s;
import cf.m;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.infrastructure.network.URLRequest;
import dd.r;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f8845m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final se.f f8846a;

    /* renamed from: b, reason: collision with root package name */
    public final hg.c f8847b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f8848c;

    /* renamed from: d, reason: collision with root package name */
    public final l f8849d;

    /* renamed from: e, reason: collision with root package name */
    public final q f8850e;

    /* renamed from: f, reason: collision with root package name */
    public final j f8851f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8852g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f8853h;

    /* renamed from: i, reason: collision with root package name */
    public final m f8854i;
    public String j;
    public final HashSet k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f8855l;

    static {
        new AtomicInteger(1);
    }

    public d(se.f fVar, eg.b bVar, ExecutorService executorService, m mVar) {
        fVar.a();
        hg.c cVar = new hg.c(fVar.f22007a, bVar);
        io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(fVar);
        if (sm.f.f22129x == null) {
            sm.f.f22129x = new sm.f(9);
        }
        sm.f fVar2 = sm.f.f22129x;
        if (l.f8863d == null) {
            l.f8863d = new l(fVar2);
        }
        l lVar = l.f8863d;
        q qVar = new q(new bf.e(2, fVar));
        j jVar = new j();
        this.f8852g = new Object();
        this.k = new HashSet();
        this.f8855l = new ArrayList();
        this.f8846a = fVar;
        this.f8847b = cVar;
        this.f8848c = cVar2;
        this.f8849d = lVar;
        this.f8850e = qVar;
        this.f8851f = jVar;
        this.f8853h = executorService;
        this.f8854i = mVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        gg.b bVarZ;
        synchronized (f8845m) {
            try {
                se.f fVar = this.f8846a;
                fVar.a();
                io.sentry.internal.debugmeta.c cVarA = io.sentry.internal.debugmeta.c.a(fVar.f22007a);
                try {
                    bVarZ = this.f8848c.z();
                    gg.d dVar = bVarZ.f9571b;
                    if (dVar == gg.d.NOT_GENERATED || dVar == gg.d.ATTEMPT_MIGRATION) {
                        String strF = f(bVarZ);
                        io.sentry.internal.debugmeta.c cVar = this.f8848c;
                        gg.a aVarA = bVarZ.a();
                        aVarA.f9561a = strF;
                        aVarA.b(gg.d.UNREGISTERED);
                        bVarZ = aVarA.a();
                        cVar.q(bVarZ);
                    }
                    if (cVarA != null) {
                        cVarA.A();
                    }
                } catch (Throwable th2) {
                    if (cVarA != null) {
                        cVarA.A();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        i(bVarZ);
        this.f8854i.execute(new b(this, 2));
    }

    public final gg.b b(gg.b bVar) throws g {
        int i10;
        int responseCode;
        hg.b bVar2;
        hg.b bVarF;
        hg.c cVar = this.f8847b;
        se.f fVar = this.f8846a;
        fVar.a();
        String str = fVar.f22009c.f22021a;
        String str2 = bVar.f9570a;
        se.f fVar2 = this.f8846a;
        fVar2.a();
        String str3 = fVar2.f22009c.f22027g;
        String str4 = bVar.f9573d;
        hg.e eVar = cVar.f10745c;
        if (!eVar.a()) {
            f fVar3 = f.BAD_CONFIG;
            throw new g("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = hg.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i11 = 0; i11 <= 1; i11 = i10 + 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(URLRequest.METHOD_POST);
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    hg.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar.b(responseCode);
                } catch (IOException | AssertionError unused) {
                    i10 = i11;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    bVarF = hg.c.f(httpURLConnectionC);
                } else {
                    hg.c.b(httpURLConnectionC, null, str, str3);
                    i10 = i11;
                    if (responseCode == 401 || responseCode == 404) {
                        byte b2 = (byte) (0 | 1);
                        hg.f fVar4 = hg.f.AUTH_ERROR;
                        if (b2 != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        bVar2 = new hg.b(null, 0L, fVar4);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVarF = bVar2;
                    } else {
                        if (responseCode == 429) {
                            f fVar5 = f.BAD_CONFIG;
                            throw new g("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            e0.d("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            byte b10 = (byte) (0 | 1);
                            hg.f fVar6 = hg.f.BAD_CONFIG;
                            if (b10 != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            bVar2 = new hg.b(null, 0L, fVar6);
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            bVarF = bVar2;
                        }
                    }
                }
                int i12 = c.f8844b[bVarF.f10740c.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        gg.a aVarA = bVar.a();
                        aVarA.f9567g = "BAD CONFIG";
                        aVarA.b(gg.d.REGISTER_ERROR);
                        return aVarA.a();
                    }
                    if (i12 != 3) {
                        f fVar7 = f.BAD_CONFIG;
                        throw new g("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    synchronized (this) {
                        this.j = null;
                    }
                    gg.a aVarA2 = bVar.a();
                    aVarA2.b(gg.d.NOT_GENERATED);
                    return aVarA2.a();
                }
                String str5 = bVarF.f10738a;
                long j = bVarF.f10739b;
                l lVar = this.f8849d;
                lVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                lVar.f8864a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                gg.a aVarA3 = bVar.a();
                aVarA3.f9563c = str5;
                aVarA3.f9565e = j;
                byte b11 = (byte) (aVarA3.f9568h | 1);
                aVarA3.f9566f = seconds;
                aVarA3.f9568h = (byte) (b11 | 2);
                return aVarA3.a();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        f fVar8 = f.BAD_CONFIG;
        throw new g("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final r c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return e5.u(str);
        }
        dd.h hVar = new dd.h();
        i iVar = new i(hVar);
        synchronized (this.f8852g) {
            this.f8855l.add(iVar);
        }
        r rVar = hVar.f7294a;
        this.f8853h.execute(new b(this, 0));
        return rVar;
    }

    public final r d() {
        e();
        dd.h hVar = new dd.h();
        h hVar2 = new h(this.f8849d, hVar);
        synchronized (this.f8852g) {
            this.f8855l.add(hVar2);
        }
        r rVar = hVar.f7294a;
        this.f8853h.execute(new b(this, 1));
        return rVar;
    }

    public final void e() {
        se.f fVar = this.f8846a;
        fVar.a();
        s.f(fVar.f22009c.f22022b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        s.f(fVar.f22009c.f22027g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        s.f(fVar.f22009c.f22021a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        String str = fVar.f22009c.f22022b;
        Pattern pattern = l.f8862c;
        s.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        fVar.a();
        s.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", l.f8862c.matcher(fVar.f22009c.f22021a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(gg.b r6) {
        /*
            r5 = this;
            se.f r0 = r5.f8846a
            r0.a()
            java.lang.String r0 = r0.f22008b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            se.f r0 = r5.f8846a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f22008b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5d
        L1e:
            gg.d r6 = r6.f9571b
            gg.d r0 = gg.d.ATTEMPT_MIGRATION
            if (r6 != r0) goto L5d
            bf.q r6 = r5.f8850e
            java.lang.Object r6 = r6.get()
            gg.c r6 = (gg.c) r6
            android.content.SharedPreferences r0 = r6.f9578a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f9578a     // Catch: java.lang.Throwable -> L40
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L40
            android.content.SharedPreferences r2 = r6.f9578a     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r6 = move-exception
            goto L5b
        L42:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
        L47:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L57
            fg.j r6 = r5.f8851f
            r6.getClass()
            java.lang.String r6 = fg.j.a()
            return r6
        L57:
            return r2
        L58:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r6     // Catch: java.lang.Throwable -> L40
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r6
        L5d:
            fg.j r6 = r5.f8851f
            r6.getClass()
            java.lang.String r6 = fg.j.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.d.f(gg.b):java.lang.String");
    }

    public final gg.b g(gg.b bVar) throws g {
        int responseCode;
        hg.a aVarE;
        String str = bVar.f9570a;
        String string = null;
        if (str != null && str.length() == 11) {
            gg.c cVar = (gg.c) this.f8850e.get();
            synchronized (cVar.f9578a) {
                try {
                    String[] strArr = gg.c.f9577c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str2 = strArr[i10];
                            String string2 = cVar.f9578a.getString("|T|" + cVar.f9579b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i10++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        hg.c cVar2 = this.f8847b;
        se.f fVar = this.f8846a;
        fVar.a();
        String str3 = fVar.f22009c.f22021a;
        String str4 = bVar.f9570a;
        se.f fVar2 = this.f8846a;
        fVar2.a();
        String str5 = fVar2.f22009c.f22027g;
        se.f fVar3 = this.f8846a;
        fVar3.a();
        String str6 = fVar3.f22009c.f22022b;
        hg.e eVar = cVar2.f10745c;
        if (!eVar.a()) {
            f fVar4 = f.BAD_CONFIG;
            throw new g("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = hg.c.a("projects/" + str5 + "/installations");
        for (int i11 = 0; i11 <= 1; i11++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = cVar2.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(URLRequest.METHOD_POST);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    hg.c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    aVarE = hg.c.e(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    hg.c.b(httpURLConnectionC, str6, str3, str5);
                    if (responseCode == 429) {
                        f fVar5 = f.BAD_CONFIG;
                        throw new g("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        e0.d("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        hg.a aVar = new hg.a(null, null, null, null, hg.d.BAD_CONFIG);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVarE = aVar;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                int i12 = c.f8843a[aVarE.f10737e.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        f fVar6 = f.BAD_CONFIG;
                        throw new g("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    gg.a aVarA = bVar.a();
                    aVarA.f9567g = "BAD CONFIG";
                    aVarA.b(gg.d.REGISTER_ERROR);
                    return aVarA.a();
                }
                String str7 = aVarE.f10734b;
                String str8 = aVarE.f10735c;
                l lVar = this.f8849d;
                lVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                lVar.f8864a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                hg.b bVar2 = aVarE.f10736d;
                String str9 = bVar2.f10738a;
                long j = bVar2.f10739b;
                gg.a aVarA2 = bVar.a();
                aVarA2.f9561a = str7;
                aVarA2.b(gg.d.REGISTERED);
                aVarA2.f9563c = str9;
                aVarA2.f9564d = str8;
                aVarA2.f9565e = j;
                byte b2 = (byte) (aVarA2.f9568h | 1);
                aVarA2.f9566f = seconds;
                aVarA2.f9568h = (byte) (b2 | 2);
                return aVarA2.a();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        f fVar7 = f.BAD_CONFIG;
        throw new g("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f8852g) {
            try {
                Iterator it = this.f8855l.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(gg.b bVar) {
        synchronized (this.f8852g) {
            try {
                Iterator it = this.f8855l.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
