package com.bytedance.sdk.openadsdk.core.ouw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.qbp;
import java.util.ArrayList;
import java.util.List;
import u.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    private static String ouw;
    private static Boolean vt;

    public static String ouw(Context context) {
        String str = ouw;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                ouw = null;
            } else if (TextUtils.isEmpty(str2) || ouw(context, intent) || !arrayList.contains(str2)) {
                ouw = (String) arrayList.get(0);
            } else {
                ouw = str2;
            }
        } catch (Throwable th2) {
            qbp.lh("CustomTabsHelper", th2.getMessage());
        }
        return ouw;
    }

    public static int vt(Context context) {
        return !TextUtils.isEmpty(ouw(context)) ? 1 : 0;
    }

    private static boolean ouw(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities;
        try {
            listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (listQueryIntentActivities.size() == 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                return true;
            }
        }
        return false;
    }

    public static int ouw() {
        Boolean bool = vt;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void ouw(Context context, String str, m mVar, Uri uri) {
        mVar.f34718a.setPackage(str);
        mVar.a(context, uri);
    }
}
