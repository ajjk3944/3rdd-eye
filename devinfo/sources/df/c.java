package df;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import de.m;
import ec.z;
import ee.k;
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
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f22231m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final wd.f f22232a;

    /* renamed from: b, reason: collision with root package name */
    public final ff.c f22233b;

    /* renamed from: c, reason: collision with root package name */
    public final y4.a f22234c;

    /* renamed from: d, reason: collision with root package name */
    public final j f22235d;

    /* renamed from: e, reason: collision with root package name */
    public final m f22236e;

    /* renamed from: f, reason: collision with root package name */
    public final h f22237f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f22238h;

    /* renamed from: i, reason: collision with root package name */
    public final k f22239i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f22240k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f22241l;

    static {
        new AtomicInteger(1);
    }

    public c(wd.f fVar, cf.b bVar, ExecutorService executorService, k kVar) {
        fVar.a();
        ff.c cVar = new ff.c(fVar.f36614a, bVar);
        y4.a aVar = new y4.a((Object) fVar, false);
        if (z.f23236x == null) {
            z.f23236x = new z(27);
        }
        z zVar = z.f23236x;
        if (j.f22249d == null) {
            j.f22249d = new j(zVar);
        }
        j jVar = j.f22249d;
        m mVar = new m(new de.c(2, fVar));
        h hVar = new h();
        this.g = new Object();
        this.f22240k = new HashSet();
        this.f22241l = new ArrayList();
        this.f22232a = fVar;
        this.f22233b = cVar;
        this.f22234c = aVar;
        this.f22235d = jVar;
        this.f22236e = mVar;
        this.f22237f = hVar;
        this.f22238h = executorService;
        this.f22239i = kVar;
    }

    public static c e() {
        wd.f fVarB = wd.f.b();
        fVarB.a();
        return (c) fVarB.f36617d.a(d.class);
    }

    public final void a(i iVar) {
        synchronized (this.g) {
            this.f22241l.add(iVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        ef.b bVarT;
        synchronized (f22231m) {
            try {
                wd.f fVar = this.f22232a;
                fVar.a();
                y4.a aVarA = y4.a.a(fVar.f36614a);
                try {
                    bVarT = this.f22234c.t();
                    int i4 = bVarT.f23442b;
                    boolean z3 = true;
                    if (i4 != 2 && i4 != 1) {
                        z3 = false;
                    }
                    if (z3) {
                        String strI = i(bVarT);
                        y4.a aVar = this.f22234c;
                        ef.a aVarA2 = bVarT.a();
                        aVarA2.f23433a = strI;
                        aVarA2.f23434b = 3;
                        bVarT = aVarA2.a();
                        aVar.l(bVarT);
                    }
                    if (aVarA != null) {
                        aVarA.v();
                    }
                } catch (Throwable th2) {
                    if (aVarA != null) {
                        aVarA.v();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        l(bVarT);
        this.f22239i.execute(new b(this, 2));
    }

    public final ef.b c(ef.b bVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        int responseCode;
        String str;
        ff.b bVarF;
        wd.f fVar = this.f22232a;
        fVar.a();
        String str2 = fVar.f36616c.f36627a;
        String str3 = bVar.f23441a;
        fVar.a();
        String str4 = fVar.f36616c.g;
        String str5 = bVar.f23444d;
        ff.c cVar = this.f22233b;
        ff.d dVar = cVar.f24031c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = ff.c.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        for (int i4 = 0; i4 <= 1; i4++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str2);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    httpURLConnectionC.setDoOutput(true);
                    ff.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dVar.d(responseCode);
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = httpURLConnectionC;
                }
            } catch (IOException | AssertionError unused) {
                httpURLConnection = httpURLConnectionC;
            }
            if (responseCode >= 200 && responseCode < 300) {
                bVarF = ff.c.f(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                str = null;
            } else {
                ff.c.b(httpURLConnectionC, null, str2, str4);
                httpURLConnection = httpURLConnectionC;
                try {
                    if (responseCode == 401 || responseCode == 404) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        str = null;
                        ff.b bVar2 = new ff.b(3, 0L, null);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVarF = bVar2;
                    } else {
                        if (responseCode == 429) {
                            throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            ff.b bVar3 = new ff.b(2, 0L, null);
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            bVarF = bVar3;
                            str = null;
                        }
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            int iC = i3.e.c(bVarF.f24026c);
            if (iC != 0) {
                if (iC == 1) {
                    ef.a aVarA = bVar.a();
                    aVarA.g = "BAD CONFIG";
                    aVarA.f23434b = 5;
                    return aVarA.a();
                }
                if (iC != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                m(str);
                ef.a aVarA2 = bVar.a();
                aVarA2.f23434b = 2;
                return aVarA2.a();
            }
            String str6 = bVarF.f24024a;
            long j = bVarF.f24025b;
            j jVar = this.f22235d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.f22250a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            ef.a aVarA3 = bVar.a();
            aVarA3.f23435c = str6;
            aVarA3.f23437e = j;
            byte b10 = (byte) (aVarA3.f23439h | 1);
            aVarA3.f23438f = seconds;
            aVarA3.f23439h = (byte) (b10 | 2);
            return aVarA3.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        h();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new g(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.f22238h.execute(new b(this, 0));
        return task;
    }

    public final Task f() {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new f(this.f22235d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.f22238h.execute(new b(this, 1));
        return task;
    }

    /* JADX WARN: Finally extract failed */
    public final void g(ef.b bVar) {
        synchronized (f22231m) {
            try {
                wd.f fVar = this.f22232a;
                fVar.a();
                y4.a aVarA = y4.a.a(fVar.f36614a);
                try {
                    this.f22234c.l(bVar);
                    if (aVarA != null) {
                        aVarA.v();
                    }
                } catch (Throwable th2) {
                    if (aVarA != null) {
                        aVarA.v();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void h() {
        wd.f fVar = this.f22232a;
        fVar.a();
        y.f(fVar.f36616c.f36628b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        y.f(fVar.f36616c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        y.f(fVar.f36616c.f36627a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        String str = fVar.f36616c.f36628b;
        Pattern pattern = j.f22248c;
        y.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        fVar.a();
        y.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f22248c.matcher(fVar.f36616c.f36627a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String i(ef.b r3) {
        /*
            r2 = this;
            wd.f r0 = r2.f22232a
            r0.a()
            java.lang.String r0 = r0.f36615b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            wd.f r0 = r2.f22232a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f36615b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
        L1e:
            int r3 = r3.f23442b
            r0 = 1
            if (r3 != r0) goto L50
            de.m r3 = r2.f22236e
            java.lang.Object r3 = r3.get()
            ef.c r3 = (ef.c) r3
            android.content.SharedPreferences r0 = r3.f23448a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4e
        L38:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4d
            df.h r3 = r2.f22237f
            r3.getClass()
            java.lang.String r3 = df.h.a()
            return r3
        L4d:
            return r1
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L50:
            df.h r3 = r2.f22237f
            r3.getClass()
            java.lang.String r3 = df.h.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df.c.i(ef.b):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ff.c] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ff.a] */
    public final ef.b j(ef.b bVar) throws e {
        int responseCode;
        String str = bVar.f23441a;
        String string = null;
        if (str != null && str.length() == 11) {
            ef.c cVar = (ef.c) this.f22236e.get();
            synchronized (cVar.f23448a) {
                try {
                    String[] strArr = ef.c.f23447c;
                    int i4 = 0;
                    while (true) {
                        if (i4 < 4) {
                            String str2 = strArr[i4];
                            String string2 = cVar.f23448a.getString("|T|" + cVar.f23449b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i4++;
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
        ff.c cVar2 = this.f22233b;
        wd.f fVar = this.f22232a;
        fVar.a();
        String str3 = fVar.f36616c.f36627a;
        String str4 = bVar.f23441a;
        wd.f fVar2 = this.f22232a;
        fVar2.a();
        String str5 = fVar2.f36616c.g;
        wd.f fVar3 = this.f22232a;
        fVar3.a();
        String str6 = fVar3.f36616c.f36628b;
        ff.d dVar = cVar2.f24031c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = ff.c.a("projects/" + str5 + "/installations");
        int i10 = 0;
        ff.a aVar = cVar2;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    ff.c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dVar.d(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                ff.a aVarE = ff.c.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                aVar = aVarE;
            } else {
                try {
                    ff.c.b(httpURLConnectionC, str6, str3, str5);
                } catch (IOException | AssertionError unused3) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                    aVar = aVar;
                }
                if (responseCode == 429) {
                    throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    ff.a aVar2 = new ff.a(null, null, null, null, 2);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = aVar2;
                } else {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                    aVar = aVar;
                }
            }
            int iC = i3.e.c(aVar.f24023e);
            if (iC != 0) {
                if (iC != 1) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                ef.a aVarA = bVar.a();
                aVarA.g = "BAD CONFIG";
                aVarA.f23434b = 5;
                return aVarA.a();
            }
            String str7 = aVar.f24020b;
            String str8 = aVar.f24021c;
            j jVar = this.f22235d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.f22250a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            ff.b bVar2 = aVar.f24022d;
            String str9 = bVar2.f24024a;
            long j = bVar2.f24025b;
            ef.a aVarA2 = bVar.a();
            aVarA2.f23433a = str7;
            aVarA2.f23434b = 4;
            aVarA2.f23435c = str9;
            aVarA2.f23436d = str8;
            aVarA2.f23437e = j;
            byte b10 = (byte) (aVarA2.f23439h | 1);
            aVarA2.f23438f = seconds;
            aVarA2.f23439h = (byte) (b10 | 2);
            return aVarA2.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.f22241l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(ef.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.f22241l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void m(String str) {
        this.j = str;
    }

    public final synchronized void n(ef.b bVar, ef.b bVar2) {
        try {
            if (this.f22240k.size() != 0 && !TextUtils.equals(bVar.f23441a, bVar2.f23441a)) {
                Iterator it = this.f22240k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }
}
