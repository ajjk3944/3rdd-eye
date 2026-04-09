package k5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import d5.c;
import t1.AbstractC8021a;

/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6393a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f51229a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f51230b;

    /* renamed from: c, reason: collision with root package name */
    private final c f51231c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f51232d;

    public C6393a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f51229a = contextA;
        this.f51230b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f51231c = cVar;
        this.f51232d = c();
    }

    private static Context a(Context context) {
        return AbstractC8021a.b(context);
    }

    private boolean c() {
        return this.f51230b.contains("firebase_data_collection_default_enabled") ? this.f51230b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f51229a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f51229a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f51232d;
    }
}
