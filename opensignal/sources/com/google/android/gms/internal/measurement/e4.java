package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: i, reason: collision with root package name */
    public static final ConcurrentHashMap f4967i = new ConcurrentHashMap();
    public static final String[] j = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f4968a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4969b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f4970c;

    /* renamed from: g, reason: collision with root package name */
    public volatile Map f4974g;

    /* renamed from: d, reason: collision with root package name */
    public z3 f4971d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f4972e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4973f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4975h = new ArrayList();

    public e4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f4968a = contentResolver;
        this.f4969b = uri;
        this.f4970c = runnable;
    }

    public static e4 a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        e4 e4Var = (e4) f4967i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.d4
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new e4(contentResolver, uri, runnable);
            }
        });
        try {
            if (!e4Var.f4972e) {
                return e4Var;
            }
            synchronized (e4Var) {
                try {
                    if (e4Var.f4972e) {
                        z3 z3Var = new z3(e4Var);
                        e4Var.f4968a.registerContentObserver(e4Var.f4969b, false, z3Var);
                        e4Var.f4971d = z3Var;
                        e4Var.f4972e = false;
                    }
                } finally {
                }
            }
            return e4Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void c() {
        Iterator it = f4967i.values().iterator();
        while (it.hasNext()) {
            e4 e4Var = (e4) it.next();
            synchronized (e4Var) {
                try {
                    if (e4Var.f4972e) {
                        e4Var.f4972e = false;
                    } else {
                        z3 z3Var = e4Var.f4971d;
                        if (z3Var != null) {
                            e4Var.f4968a.unregisterContentObserver(z3Var);
                            e4Var.f4971d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map b() {
        /*
            r5 = this;
            java.util.Map r0 = r5.f4974g
            if (r0 != 0) goto L4f
            java.lang.Object r1 = r5.f4973f
            monitor-enter(r1)
            java.util.Map r0 = r5.f4974g     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L4b
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.measurement.w5 r2 = new com.google.android.gms.internal.measurement.w5     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.c()     // Catch: java.lang.SecurityException -> L19 java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30
            goto L24
        L19:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            java.lang.Object r2 = r2.c()     // Catch: java.lang.Throwable -> L34
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L24:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L26:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            goto L43
        L2a:
            r0 = move-exception
            goto L4d
        L2c:
            r2 = move-exception
            goto L47
        L2e:
            r2 = move-exception
            goto L39
        L30:
            r2 = move-exception
            goto L39
        L32:
            r2 = move-exception
            goto L39
        L34:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
            throw r2     // Catch: java.lang.Throwable -> L2c java.lang.IllegalStateException -> L2e android.database.sqlite.SQLiteException -> L30 java.lang.SecurityException -> L32
        L39:
            java.lang.String r3 = "ConfigurationContentLdr"
            java.lang.String r4 = "Unable to query ContentProvider, using default values"
            io.sentry.android.core.e0.q(r3, r4, r2)     // Catch: java.lang.Throwable -> L2c
            java.util.Map r2 = java.util.Collections.EMPTY_MAP     // Catch: java.lang.Throwable -> L2c
            goto L26
        L43:
            r5.f4974g = r2     // Catch: java.lang.Throwable -> L2a
            r0 = r2
            goto L4b
        L47:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L2a
        L4b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            goto L4f
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L4f:
            if (r0 == 0) goto L52
            return r0
        L52:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e4.b():java.util.Map");
    }
}
