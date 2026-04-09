package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class sba {
    public static void emc() {
        Context contextEmc = com.bytedance.sdk.openadsdk.core.aa.emc();
        if (contextEmc != null && com.bytedance.sdk.component.utils.cf.dg()) {
            String packageName = contextEmc.getPackageName();
            int i10 = contextEmc.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = contextEmc.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> listYpw = ypw();
                for (String str : strArr) {
                    if (str != null) {
                        listYpw.remove(str);
                    }
                }
                if (listYpw.isEmpty()) {
                    return;
                }
                for (String str2 : listYpw) {
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static List<String> ypw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
