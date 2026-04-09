package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static b f36935c;

    /* renamed from: a, reason: collision with root package name */
    private j f36936a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36937b;

    private b(Context context) {
        this.f36937b = context.getApplicationContext();
    }

    public static a a(Context context, String str) {
        try {
            return new a(context.getPackageManager().getResourcesForApplication(str), str, null);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("OssLicenses", "Unable to get resources for " + str + ", using local resources.");
            return new a(context.getResources(), context.getPackageName(), null);
        }
    }

    public static b b(Context context) {
        if (f36935c == null) {
            b bVar = new b(context);
            f36935c = bVar;
            bVar.f36936a = new j(bVar.f36937b);
        }
        return f36935c;
    }

    public static final int d(a aVar) {
        return aVar.f36933a.getIdentifier("libraries_social_licenses_license", "layout", aVar.f36934b);
    }

    public static final int e(a aVar) {
        return aVar.f36933a.getIdentifier("license", "id", aVar.f36934b);
    }

    public final j c() {
        return this.f36936a;
    }
}
