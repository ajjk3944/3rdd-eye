package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import r.C2867j;

/* loaded from: classes.dex */
public final class Q9 {

    /* renamed from: a, reason: collision with root package name */
    public c1.g f10581a;

    /* renamed from: b, reason: collision with root package name */
    public C2867j f10582b;

    /* renamed from: c, reason: collision with root package name */
    public C2231zN f10583c;

    /* renamed from: d, reason: collision with root package name */
    public c1.g f10584d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(AbstractC1984ut.g(context));
                    }
                }
            }
        }
        return false;
    }
}
