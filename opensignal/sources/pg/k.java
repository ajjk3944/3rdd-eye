package pg;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pb.l0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f20529r = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f20530s = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f20531a;

    /* renamed from: c, reason: collision with root package name */
    public int f20533c;

    /* renamed from: f, reason: collision with root package name */
    public HttpURLConnection f20536f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f20537g;

    /* renamed from: h, reason: collision with root package name */
    public final h f20538h;

    /* renamed from: i, reason: collision with root package name */
    public final se.f f20539i;
    public final fg.e j;
    public final c k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f20540l;

    /* renamed from: p, reason: collision with root package name */
    public final m f20544p;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20532b = false;

    /* renamed from: n, reason: collision with root package name */
    public final Random f20542n = new Random();

    /* renamed from: o, reason: collision with root package name */
    public final gc.a f20543o = gc.a.f9479a;

    /* renamed from: m, reason: collision with root package name */
    public final String f20541m = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f20534d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20535e = false;

    /* renamed from: q, reason: collision with root package name */
    public final Object f20545q = new Object();

    public k(se.f fVar, fg.e eVar, h hVar, c cVar, Context context, LinkedHashSet linkedHashSet, m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f20531a = linkedHashSet;
        this.f20537g = scheduledExecutorService;
        this.f20533c = Math.max(8 - mVar.c().f20546a, 1);
        this.f20539i = fVar;
        this.f20538h = hVar;
        this.j = eVar;
        this.k = cVar;
        this.f20540l = context;
        this.f20544p = mVar;
    }

    public static boolean d(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public static String f(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f20531a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f20532b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f20534d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f20535e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.k.a():boolean");
    }

    public final void b(InputStream inputStream, InputStream inputStream2) throws IOException {
        HttpURLConnection httpURLConnection = this.f20536f;
        if (httpURLConnection != null && !this.f20535e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused2) {
            }
        }
    }

    public final String c(String str) {
        se.f fVar = this.f20539i;
        fVar.a();
        Matcher matcher = f20530s.matcher(fVar.f22009c.f22022b);
        return "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/" + (matcher.matches() ? matcher.group(1) : null) + "/namespaces/" + str + ":streamFetchInvalidations";
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i10 = this.f20533c;
                if (i10 > 0) {
                    this.f20533c = i10 - 1;
                    this.f20537g.schedule(new l0(1, this), j, TimeUnit.MILLISECONDS);
                } else if (!this.f20535e) {
                    og.d dVar = og.d.UNKNOWN;
                    new og.c("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f20531a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    public final synchronized void h() {
        this.f20543o.getClass();
        e(Math.max(0L, this.f20544p.c().f20547b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            se.f r9 = r6.f20539i
            r9.a()
            se.h r0 = r9.f22009c
            java.lang.String r1 = r0.f22021a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f20540l
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "Could not get fingerprint hash for package: "
            r3 = 0
            java.lang.String r4 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            byte[] r4 = gc.b.d(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r4 != 0) goto L47
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.<init>(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r2 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.append(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r2 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            io.sentry.android.core.e0.d(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
        L45:
            r1 = r3
            goto L50
        L47:
            java.lang.String r1 = gc.b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L50
        L4c:
            r1.getPackageName()
            goto L45
        L50:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.a()
            java.lang.String r2 = r0.f22022b
            java.util.regex.Pattern r4 = pg.k.f20530s
            java.util.regex.Matcher r2 = r4.matcher(r2)
            boolean r4 = r2.matches()
            if (r4 == 0) goto L8a
            r3 = 1
            java.lang.String r3 = r2.group(r3)
        L8a:
            java.lang.String r2 = "project"
            r1.put(r2, r3)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f20541m
            r1.put(r2, r3)
            pg.h r2 = r6.f20538h
            pg.m r2 = r2.f20520g
            android.content.SharedPreferences r2 = r2.f20550a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = r0.f22022b
            java.lang.String r0 = "appId"
            r1.put(r0, r9)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "23.0.1"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.k.i(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized al.b j(HttpURLConnection httpURLConnection) {
        al.b bVar;
        j jVar = new j(this);
        h hVar = this.f20538h;
        c cVar = this.k;
        LinkedHashSet linkedHashSet = this.f20531a;
        ScheduledExecutorService scheduledExecutorService = this.f20537g;
        m mVar = this.f20544p;
        bVar = new al.b();
        bVar.f811c = httpURLConnection;
        bVar.f812d = hVar;
        bVar.f813e = cVar;
        bVar.f810b = linkedHashSet;
        bVar.f814f = jVar;
        bVar.f815g = scheduledExecutorService;
        bVar.f816h = new Random();
        bVar.f817i = mVar;
        bVar.f809a = gc.a.f9479a;
        return bVar;
    }

    public final void k(Date date) {
        m mVar = this.f20544p;
        int i10 = mVar.c().f20546a + 1;
        mVar.e(i10, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f20529r[(i10 < 8 ? i10 : 8) - 1]) / 2) + this.f20542n.nextInt((int) r2)));
    }
}
