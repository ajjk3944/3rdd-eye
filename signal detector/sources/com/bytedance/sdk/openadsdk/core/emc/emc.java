package com.bytedance.sdk.openadsdk.core.emc;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.ul;
import java.util.ArrayList;
import java.util.List;
import r.C2866i;

/* loaded from: classes.dex */
public class emc {
    private static String emc;
    private static Boolean ypw;

    public static String emc(Context context) {
        String str = emc;
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
                emc = null;
            } else if (TextUtils.isEmpty(str2) || emc(context, intent) || !arrayList.contains(str2)) {
                emc = (String) arrayList.get(0);
            } else {
                emc = str2;
            }
        } catch (Throwable th) {
            ul.xq("CustomTabsHelper", th.getMessage());
        }
        return emc;
    }

    public static int ypw(Context context) {
        return !TextUtils.isEmpty(emc(context)) ? 1 : 0;
    }

    private static boolean emc(Context context, Intent intent) {
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

    public static int emc() {
        Boolean bool = ypw;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void emc(Context context, String str, C2866i c2866i, Uri uri) {
        c2866i.f23314a.setPackage(str);
        Intent intent = c2866i.f23314a;
        intent.setData(uri);
        context.startActivity(intent, c2866i.f23315b);
    }
}
