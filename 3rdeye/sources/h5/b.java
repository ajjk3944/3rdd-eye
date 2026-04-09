package h5;

import C.V;
import D9.G;
import I4.n;
import J4.o;
import android.annotation.SuppressLint;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f2.RunnableC4331a;
import g5.InterfaceC4392b;
import h5.d;
import i5.InterfaceC4457a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j5.C5194a;
import j5.c;
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
import k5.AbstractC5220d;
import k5.C5217a;
import k5.C5218b;
import k5.C5219c;
import k5.f;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f38246m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final B4.e f38247a;

    /* renamed from: b, reason: collision with root package name */
    public final C5219c f38248b;

    /* renamed from: c, reason: collision with root package name */
    public final j5.c f38249c;

    /* renamed from: d, reason: collision with root package name */
    public final j f38250d;

    /* renamed from: e, reason: collision with root package name */
    public final n<j5.b> f38251e;

    /* renamed from: f, reason: collision with root package name */
    public final h f38252f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f38253g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f38254h;
    public final o i;

    /* renamed from: j, reason: collision with root package name */
    public String f38255j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f38256k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f38257l;

    /* compiled from: FirebaseInstallations.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38258a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38259b;

        static {
            int[] iArr = new int[f.b.values().length];
            f38259b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38259b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38259b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC5220d.a.values().length];
            f38258a = iArr2;
            try {
                iArr2[AbstractC5220d.a.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38258a[AbstractC5220d.a.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public b() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public b(B4.e eVar, InterfaceC4392b interfaceC4392b, ExecutorService executorService, o oVar) {
        eVar.a();
        C5219c c5219c = new C5219c(eVar.f487a, interfaceC4392b);
        j5.c cVar = new j5.c(eVar);
        if (B7.d.f579c == null) {
            B7.d.f579c = new B7.d(23);
        }
        B7.d dVar = B7.d.f579c;
        if (j.f38267d == null) {
            j.f38267d = new j(dVar);
        }
        j jVar = j.f38267d;
        n<j5.b> nVar = new n<>(new I4.c(eVar, 2));
        h hVar = new h();
        this.f38253g = new Object();
        this.f38256k = new HashSet();
        this.f38257l = new ArrayList();
        this.f38247a = eVar;
        this.f38248b = c5219c;
        this.f38249c = cVar;
        this.f38250d = jVar;
        this.f38251e = nVar;
        this.f38252f = hVar;
        this.f38254h = executorService;
        this.i = oVar;
    }

    @Override // h5.c
    public final Task a() {
        f();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        b(new e(this.f38250d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.f38254h.execute(new RunnableC4331a(this, 1));
        return task;
    }

    public final void b(i iVar) {
        synchronized (this.f38253g) {
            this.f38257l.add(iVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void c() {
        C5194a c5194aC;
        synchronized (f38246m) {
            try {
                B4.e eVar = this.f38247a;
                eVar.a();
                G gF = G.f(eVar.f487a);
                try {
                    c5194aC = this.f38249c.c();
                    c.a aVar = c.a.NOT_GENERATED;
                    c.a aVar2 = c5194aC.f42957c;
                    if (aVar2 == aVar || aVar2 == c.a.ATTEMPT_MIGRATION) {
                        String strG = g(c5194aC);
                        j5.c cVar = this.f38249c;
                        C5194a.C0477a c0477aH = c5194aC.h();
                        c0477aH.f42963a = strG;
                        c0477aH.b(c.a.UNREGISTERED);
                        c5194aC = c0477aH.a();
                        cVar.b(c5194aC);
                    }
                    if (gF != null) {
                        gF.i();
                    }
                } catch (Throwable th) {
                    if (gF != null) {
                        gF.i();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j(c5194aC);
        this.i.execute(new C8.a(this, 17));
    }

    public final C5194a d(C5194a c5194a) throws d {
        int responseCode;
        C5218b c5218bF;
        B4.e eVar = this.f38247a;
        eVar.a();
        String str = eVar.f489c.f503a;
        eVar.a();
        String str2 = eVar.f489c.f509g;
        String str3 = c5194a.f42959e;
        C5219c c5219c = this.f38248b;
        k5.e eVar2 = c5219c.f43403c;
        if (!eVar2.b()) {
            d.a aVar = d.a.BAD_CONFIG;
            throw new d("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = C5219c.a("projects/" + str2 + "/installations/" + c5194a.f42956b + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = c5219c.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str3);
                    httpURLConnectionC.setDoOutput(true);
                    C5219c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar2.d(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    c5218bF = C5219c.f(httpURLConnectionC);
                } else {
                    C5219c.b(httpURLConnectionC, null, str, str2);
                    if (responseCode == 401 || responseCode == 404) {
                        C5218b.a aVarA = k5.f.a();
                        aVarA.f43398c = f.b.AUTH_ERROR;
                        c5218bF = aVarA.a();
                    } else {
                        if (responseCode == 429) {
                            d.a aVar2 = d.a.BAD_CONFIG;
                            throw new d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            C5218b.a aVarA2 = k5.f.a();
                            aVarA2.f43398c = f.b.BAD_CONFIG;
                            c5218bF = aVarA2.a();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                int i10 = a.f38259b[c5218bF.f43395c.ordinal()];
                if (i10 == 1) {
                    j jVar = this.f38250d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f38268a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    C5194a.C0477a c0477aH = c5194a.h();
                    c0477aH.f42965c = c5218bF.f43393a;
                    c0477aH.f42967e = Long.valueOf(c5218bF.f43394b);
                    c0477aH.f42968f = Long.valueOf(seconds);
                    return c0477aH.a();
                }
                if (i10 == 2) {
                    C5194a.C0477a c0477aH2 = c5194a.h();
                    c0477aH2.f42969g = "BAD CONFIG";
                    c0477aH2.b(c.a.REGISTER_ERROR);
                    return c0477aH2.a();
                }
                if (i10 != 3) {
                    d.a aVar3 = d.a.BAD_CONFIG;
                    throw new d("Firebase Installations Service is unavailable. Please try again later.");
                }
                k(null);
                C5194a.C0477a c0477aH3 = c5194a.h();
                c0477aH3.b(c.a.NOT_GENERATED);
                return c0477aH3.a();
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        d.a aVar4 = d.a.BAD_CONFIG;
        throw new d("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* JADX WARN: Finally extract failed */
    public final void e(C5194a c5194a) {
        synchronized (f38246m) {
            try {
                B4.e eVar = this.f38247a;
                eVar.a();
                G gF = G.f(eVar.f487a);
                try {
                    this.f38249c.b(c5194a);
                    if (gF != null) {
                        gF.i();
                    }
                } catch (Throwable th) {
                    if (gF != null) {
                        gF.i();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        B4.e eVar = this.f38247a;
        eVar.a();
        Preconditions.checkNotEmpty(eVar.f489c.f504b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        Preconditions.checkNotEmpty(eVar.f489c.f509g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        Preconditions.checkNotEmpty(eVar.f489c.f503a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        String str = eVar.f489c.f504b;
        Pattern pattern = j.f38266c;
        Preconditions.checkArgument(str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        Preconditions.checkArgument(j.f38266c.matcher(eVar.f489c.f503a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g(j5.C5194a r3) {
        /*
            r2 = this;
            B4.e r0 = r2.f38247a
            r0.a()
            java.lang.String r0 = r0.f488b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            B4.e r0 = r2.f38247a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f488b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L51
        L1e:
            j5.c$a r3 = r3.f42957c
            j5.c$a r0 = j5.c.a.ATTEMPT_MIGRATION
            if (r3 != r0) goto L51
            I4.n<j5.b> r3 = r2.f38251e
            java.lang.Object r3 = r3.get()
            j5.b r3 = (j5.b) r3
            android.content.SharedPreferences r0 = r3.f42971a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r3 = move-exception
            goto L4f
        L39:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
        L3e:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4e
            h5.h r3 = r2.f38252f
            r3.getClass()
            java.lang.String r3 = h5.h.a()
            return r3
        L4e:
            return r1
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r3
        L51:
            h5.h r3 = r2.f38252f
            r3.getClass()
            java.lang.String r3 = h5.h.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.b.g(j5.a):java.lang.String");
    }

    @Override // h5.c
    public final Task<String> getId() {
        String str;
        f();
        synchronized (this) {
            str = this.f38255j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        b(new f(taskCompletionSource));
        Task<String> task = taskCompletionSource.getTask();
        this.f38254h.execute(new V(this, 25));
        return task;
    }

    public final C5194a h(C5194a c5194a) throws d {
        int responseCode;
        C5217a c5217aE;
        String str = c5194a.f42956b;
        String string = null;
        if (str != null && str.length() == 11) {
            j5.b bVar = this.f38251e.get();
            synchronized (bVar.f42971a) {
                try {
                    String[] strArr = j5.b.f42970c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = bVar.f42971a.getString("|T|" + bVar.f42972b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
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
        C5219c c5219c = this.f38248b;
        B4.e eVar = this.f38247a;
        eVar.a();
        String str3 = eVar.f489c.f503a;
        String str4 = c5194a.f42956b;
        B4.e eVar2 = this.f38247a;
        eVar2.a();
        String str5 = eVar2.f489c.f509g;
        B4.e eVar3 = this.f38247a;
        eVar3.a();
        String str6 = eVar3.f489c.f504b;
        k5.e eVar4 = c5219c.f43403c;
        if (!eVar4.b()) {
            d.a aVar = d.a.BAD_CONFIG;
            throw new d("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = C5219c.a("projects/" + str5 + "/installations");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = c5219c.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C5219c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar4.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    c5217aE = C5219c.e(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    C5219c.b(httpURLConnectionC, str6, str3, str5);
                    if (responseCode == 429) {
                        d.a aVar2 = d.a.BAD_CONFIG;
                        throw new d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C5217a c5217a = new C5217a(null, null, null, null, AbstractC5220d.a.BAD_CONFIG);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c5217aE = c5217a;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                int i11 = a.f38258a[c5217aE.f43392e.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        d.a aVar3 = d.a.BAD_CONFIG;
                        throw new d("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    C5194a.C0477a c0477aH = c5194a.h();
                    c0477aH.f42969g = "BAD CONFIG";
                    c0477aH.b(c.a.REGISTER_ERROR);
                    return c0477aH.a();
                }
                String str7 = c5217aE.f43389b;
                String str8 = c5217aE.f43390c;
                j jVar = this.f38250d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f38268a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C5218b c5218b = c5217aE.f43391d;
                String str9 = c5218b.f43393a;
                long j4 = c5218b.f43394b;
                C5194a.C0477a c0477aH2 = c5194a.h();
                c0477aH2.f42963a = str7;
                c0477aH2.b(c.a.REGISTERED);
                c0477aH2.f42965c = str9;
                c0477aH2.f42966d = str8;
                c0477aH2.f42967e = Long.valueOf(j4);
                c0477aH2.f42968f = Long.valueOf(seconds);
                return c0477aH2.a();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        d.a aVar4 = d.a.BAD_CONFIG;
        throw new d("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void i(Exception exc) {
        synchronized (this.f38253g) {
            try {
                Iterator it = this.f38257l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(C5194a c5194a) {
        synchronized (this.f38253g) {
            try {
                Iterator it = this.f38257l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(c5194a)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void k(String str) {
        this.f38255j = str;
    }

    public final synchronized void l(C5194a c5194a, C5194a c5194a2) {
        if (this.f38256k.size() != 0 && !TextUtils.equals(c5194a.f42956b, c5194a2.f42956b)) {
            Iterator it = this.f38256k.iterator();
            while (it.hasNext()) {
                ((InterfaceC4457a) it.next()).a();
            }
        }
    }
}
