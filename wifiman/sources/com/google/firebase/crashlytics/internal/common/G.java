package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f38719a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f38720b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f38721c;

    /* renamed from: d, reason: collision with root package name */
    TaskCompletionSource f38722d;

    /* renamed from: e, reason: collision with root package name */
    boolean f38723e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f38724f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f38725g;

    /* renamed from: h, reason: collision with root package name */
    private final TaskCompletionSource f38726h;

    public G(com.google.firebase.f fVar) {
        Object obj = new Object();
        this.f38721c = obj;
        this.f38722d = new TaskCompletionSource();
        this.f38723e = false;
        this.f38724f = false;
        this.f38726h = new TaskCompletionSource();
        Context contextK = fVar.k();
        this.f38720b = fVar;
        this.f38719a = AbstractC5107i.q(contextK);
        Boolean boolB = b();
        this.f38725g = boolB == null ? a(contextK) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f38722d.trySetResult(null);
                    this.f38723e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f38724f = false;
            return null;
        }
        this.f38724f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    private Boolean b() {
        if (!this.f38719a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f38724f = false;
        return Boolean.valueOf(this.f38719a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f38720b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z10) {
        I4.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f38725g == null ? "global Firebase setting" : this.f38724f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            I4.g.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }

    public void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f38726h.trySetResult(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f38725g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th2) {
            throw th2;
        }
        return zBooleanValue;
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f38724f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f38725g = bool != null ? bool : a(this.f38720b.k());
        i(this.f38719a, bool);
        synchronized (this.f38721c) {
            try {
                if (d()) {
                    if (!this.f38723e) {
                        this.f38722d.trySetResult(null);
                        this.f38723e = true;
                    }
                } else if (this.f38723e) {
                    this.f38722d = new TaskCompletionSource();
                    this.f38723e = false;
                }
            } finally {
            }
        }
    }

    public Task j() {
        Task task;
        synchronized (this.f38721c) {
            task = this.f38722d.getTask();
        }
        return task;
    }

    public Task k() {
        return L4.b.c(this.f38726h.getTask(), j());
    }
}
