package lf;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import b5.o;
import com.google.android.gms.internal.ads.xi0;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f28775s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f28776t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f28777a;

    /* renamed from: c, reason: collision with root package name */
    public int f28779c;

    /* renamed from: f, reason: collision with root package name */
    public HttpURLConnection f28782f;
    public xi0 g;

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f28783h;

    /* renamed from: i, reason: collision with root package name */
    public final g f28784i;
    public final wd.f j;

    /* renamed from: k, reason: collision with root package name */
    public final df.d f28785k;

    /* renamed from: l, reason: collision with root package name */
    public final b f28786l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f28787m;

    /* renamed from: q, reason: collision with root package name */
    public final l f28791q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28778b = false;

    /* renamed from: o, reason: collision with root package name */
    public final Random f28789o = new Random();

    /* renamed from: p, reason: collision with root package name */
    public final tb.a f28790p = tb.a.f34528a;

    /* renamed from: n, reason: collision with root package name */
    public final String f28788n = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f28780d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28781e = false;

    /* renamed from: r, reason: collision with root package name */
    public final Object f28792r = new Object();

    public j(wd.f fVar, df.d dVar, g gVar, b bVar, Context context, LinkedHashSet linkedHashSet, l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.f28777a = linkedHashSet;
        this.f28783h = scheduledExecutorService;
        this.f28779c = Math.max(8 - lVar.c().f28793a, 1);
        this.j = fVar;
        this.f28784i = gVar;
        this.f28785k = dVar;
        this.f28786l = bVar;
        this.f28787m = context;
        this.f28791q = lVar;
    }

    public static boolean d(int i4) {
        return i4 == 408 || i4 == 429 || i4 == 502 || i4 == 503 || i4 == 504;
    }

    public static String f(InputStream inputStream) {
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
            java.util.LinkedHashSet r0 = r1.f28777a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f28778b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f28780d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f28781e     // Catch: java.lang.Throwable -> L17
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
        throw new UnsupportedOperationException("Method not decompiled: lf.j.a():boolean");
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f28782f;
        if (httpURLConnection != null && !this.f28781e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
    }

    public final String c(String str) {
        wd.f fVar = this.j;
        fVar.a();
        Matcher matcher = f28776t.matcher(fVar.f36616c.f36628b);
        return a0.g.n("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i4 = this.f28779c;
                if (i4 > 0) {
                    this.f28779c = i4 - 1;
                    this.f28783h.schedule(new o(25, this), j, TimeUnit.MILLISECONDS);
                } else if (!this.f28781e) {
                    new kf.c("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f28777a.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }

    public final synchronized void h() {
        this.f28779c = 8;
    }

    public final synchronized void i() {
        this.f28790p.getClass();
        e(Math.max(0L, this.f28791q.c().f28794b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final synchronized void j(boolean z3) {
        this.f28778b = z3;
    }

    public final void k(boolean z3) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f28792r) {
            try {
                this.f28781e = z3;
                xi0 xi0Var = this.g;
                if (xi0Var != null) {
                    xi0Var.f18393b = z3;
                }
                if (Build.VERSION.SDK_INT >= 26 && z3 && (httpURLConnection = this.f28782f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            wd.f r9 = r6.j
            r9.a()
            wd.h r0 = r9.f36616c
            java.lang.String r1 = r0.f36627a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f28787m
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            byte[] r5 = tb.b.f(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
        L45:
            r1 = r4
            goto L62
        L47:
            java.lang.String r1 = tb.b.c(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L62
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L62:
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
            java.lang.String r2 = r0.f36628b
            java.util.regex.Pattern r3 = lf.j.f28776t
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9c
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9c:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f28788n
            r1.put(r2, r3)
            lf.g r2 = r6.f28784i
            lf.l r2 = r2.g
            android.content.SharedPreferences r2 = r2.f28797a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = r0.f36628b
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
        throw new UnsupportedOperationException("Method not decompiled: lf.j.l(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized xi0 m(HttpURLConnection httpURLConnection) {
        return new xi0(httpURLConnection, this.f28784i, this.f28786l, this.f28777a, new i(this), this.f28783h, this.f28791q);
    }

    public final void n(Date date) {
        l lVar = this.f28791q;
        int i4 = lVar.c().f28793a + 1;
        lVar.g(i4, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f28775s[(i4 < 8 ? i4 : 8) - 1]) / 2) + this.f28789o.nextInt((int) r2)));
    }
}
