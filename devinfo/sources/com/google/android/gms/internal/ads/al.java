package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    public u.p f9344a;

    /* renamed from: b, reason: collision with root package name */
    public u.n f9345b;

    /* renamed from: c, reason: collision with root package name */
    public ms1 f9346c;

    /* renamed from: d, reason: collision with root package name */
    public se.b f9347d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i4 = 0; i4 < listQueryIntentActivities.size(); i4++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i4).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(yo0.g(context));
                    }
                }
            }
        }
        return false;
    }
}
