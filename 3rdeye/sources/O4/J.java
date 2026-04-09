package O4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.appmetrica.analytics.impl.Oo;

/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes2.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final B4.e f10261a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10264d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f10265e;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10262b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource<Void> f10263c = new TaskCompletionSource<>();

    /* renamed from: f, reason: collision with root package name */
    public final TaskCompletionSource<Void> f10266f = new TaskCompletionSource<>();

    public J(B4.e eVar) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f10264d = false;
        eVar.a();
        Context context = eVar.f487a;
        this.f10261a = eVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f10264d = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e4);
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f10264d = false;
                boolValueOf = null;
            } else {
                this.f10264d = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f10265e = boolValueOf;
        synchronized (this.f10262b) {
            try {
                if (a()) {
                    this.f10263c.trySetResult(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zH;
        Boolean bool = this.f10265e;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = this.f10261a.h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        String strH = Oo.h("Crashlytics automatic data collection ", zH ? "ENABLED" : "DISABLED", " by ", this.f10265e == null ? "global Firebase setting" : this.f10264d ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strH, null);
        }
        return zH;
    }
}
