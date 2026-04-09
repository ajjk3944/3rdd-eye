package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import m4.AbstractC6768g;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.measurement.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4445r3 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile AbstractC6768g f35445a = AbstractC6768g.a();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f35446b = new Object();

    private static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean b(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (f35445a.d()) {
            return ((Boolean) f35445a.c()).booleanValue();
        }
        synchronized (f35446b) {
            try {
                if (f35445a.d()) {
                    return ((Boolean) f35445a.c()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : SQLiteDatabase.CREATE_IF_NECESSARY);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    }
                    f35445a = AbstractC6768g.g(Boolean.valueOf(z10));
                    return ((Boolean) f35445a.c()).booleanValue();
                }
                if (a(context)) {
                    z10 = true;
                }
                f35445a = AbstractC6768g.g(Boolean.valueOf(z10));
                return ((Boolean) f35445a.c()).booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
