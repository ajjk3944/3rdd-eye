package com.google.firebase.remoteconfig.internal;

import C.f0;
import W.X;
import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.appmetrica.analytics.impl.Oo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r5.f;
import r5.g;
import s5.C5576b;

/* compiled from: ConfigRealtimeHttpClient.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f23334p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f23335q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f23336a;

    /* renamed from: c, reason: collision with root package name */
    public int f23338c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f23341f;

    /* renamed from: g, reason: collision with root package name */
    public final c f23342g;

    /* renamed from: h, reason: collision with root package name */
    public final B4.e f23343h;
    public final h5.c i;

    /* renamed from: j, reason: collision with root package name */
    public final C5576b f23344j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f23345k;

    /* renamed from: o, reason: collision with root package name */
    public final d f23349o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23337b = false;

    /* renamed from: m, reason: collision with root package name */
    public final Random f23347m = new Random();

    /* renamed from: n, reason: collision with root package name */
    public final Clock f23348n = DefaultClock.getInstance();

    /* renamed from: l, reason: collision with root package name */
    public final String f23346l = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f23339d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23340e = false;

    /* compiled from: ConfigRealtimeHttpClient.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            if (eVar.a()) {
                if (new Date(eVar.f23348n.currentTimeMillis()).before(eVar.f23349o.b().f23333b)) {
                    eVar.h();
                    return;
                }
                h5.c cVar = eVar.i;
                Task taskA = cVar.a();
                Task<String> id = cVar.getId();
                Task<List<Task<?>>> taskWhenAllComplete = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskA, id});
                X x10 = new X(eVar, taskA, id);
                ScheduledExecutorService scheduledExecutorService = eVar.f23341f;
                Task taskContinueWithTask = taskWhenAllComplete.continueWithTask(scheduledExecutorService, x10);
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(scheduledExecutorService, new f0(11, eVar, taskContinueWithTask));
            }
        }
    }

    /* compiled from: ConfigRealtimeHttpClient.java */
    public class b implements r5.c {
        public b() {
        }

        @Override // r5.c
        public final void a(g gVar) {
            e eVar = e.this;
            synchronized (eVar) {
                eVar.f23339d = true;
            }
            e.this.g(gVar);
        }
    }

    public e(B4.e eVar, h5.c cVar, c cVar2, C5576b c5576b, Context context, LinkedHashSet linkedHashSet, d dVar, ScheduledExecutorService scheduledExecutorService) {
        this.f23336a = linkedHashSet;
        this.f23341f = scheduledExecutorService;
        this.f23338c = Math.max(8 - dVar.b().f23332a, 1);
        this.f23343h = eVar;
        this.f23342g = cVar2;
        this.i = cVar;
        this.f23344j = c5576b;
        this.f23345k = context;
        this.f23349o = dVar;
    }

    public static void b(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
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
            java.util.LinkedHashSet r0 = r1.f23336a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f23337b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f23339d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f23340e     // Catch: java.lang.Throwable -> L17
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.e.a():boolean");
    }

    public final String c(String str) {
        B4.e eVar = this.f23343h;
        eVar.a();
        Matcher matcher = f23335q.matcher(eVar.f489c.f504b);
        return Oo.h("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j4) {
        try {
            if (a()) {
                int i = this.f23338c;
                if (i > 0) {
                    this.f23338c = i - 1;
                    this.f23341f.schedule(new a(), j4, TimeUnit.MILLISECONDS);
                } else if (!this.f23340e) {
                    g.a aVar = g.a.UNKNOWN;
                    g(new f("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(g gVar) {
        Iterator it = this.f23336a.iterator();
        while (it.hasNext()) {
            ((r5.c) it.next()).a(gVar);
        }
    }

    @SuppressLint({"VisibleForTests"})
    public final synchronized void h() {
        e(Math.max(0L, this.f23349o.b().f23333b.getTime() - new Date(this.f23348n.currentTimeMillis()).getTime()));
    }

    public final synchronized void i(boolean z10) {
        this.f23337b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    @android.annotation.SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            B4.e r9 = r6.f23343h
            r9.a()
            B4.k r0 = r9.f489c
            java.lang.String r1 = r0.f503a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f23345k
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            byte[] r5 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
        L45:
            r1 = r4
            goto L63
        L47:
            r3 = 0
            java.lang.String r1 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            goto L63
        L4d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L63:
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
            java.lang.String r2 = r0.f504b
            java.util.regex.Pattern r3 = com.google.firebase.remoteconfig.internal.e.f23335q
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9d
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9d:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f23346l
            r1.put(r2, r3)
            com.google.firebase.remoteconfig.internal.c r2 = r6.f23342g
            com.google.firebase.remoteconfig.internal.d r2 = r2.f23320h
            android.content.SharedPreferences r2 = r2.f23326a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = "appId"
            java.lang.String r0 = r0.f504b
            r1.put(r9, r0)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.0.0"
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.e.j(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    @SuppressLint({"VisibleForTests"})
    public final synchronized com.google.firebase.remoteconfig.internal.a k(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.f23342g, this.f23344j, this.f23336a, new b(), this.f23341f);
    }

    public final void l(Date date) {
        d dVar = this.f23349o;
        int i = dVar.b().f23332a + 1;
        dVar.e(i, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f23334p[(i < 8 ? i : 8) - 1]) / 2) + this.f23347m.nextInt((int) r2)));
    }
}
