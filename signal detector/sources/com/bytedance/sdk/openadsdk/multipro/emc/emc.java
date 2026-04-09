package com.bytedance.sdk.openadsdk.multipro.emc;

import A.f;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ycc.emc.ycc;
import com.bytedance.sdk.openadsdk.core.bw;
import com.bytedance.sdk.openadsdk.multipro.dg;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class emc {
    public static ycc emc;
    private static final ConcurrentHashMap<String, Object> ypw = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.ycc.emc.ycc emc(android.content.Context r1) {
        /*
            if (r1 != 0) goto L5
            com.bytedance.sdk.openadsdk.core.aa.emc()     // Catch: java.lang.Throwable -> L26
        L5:
            com.bytedance.sdk.component.ycc.emc.ycc r1 = com.bytedance.sdk.openadsdk.multipro.emc.emc.emc     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L2b
            boolean r1 = com.bytedance.sdk.openadsdk.multipro.ypw.xq()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1f
            com.bytedance.sdk.openadsdk.multipro.aidl.emc r1 = com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc()     // Catch: java.lang.Throwable -> L26
            r0 = 5
            android.os.IBinder r1 = r1.emc(r0)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.component.ycc.emc.ycc r1 = com.bytedance.sdk.component.ycc.emc.ycc.emc.emc(r1)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.emc.emc.emc = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L1f:
            com.bytedance.sdk.openadsdk.multipro.aidl.emc.ycc r1 = com.bytedance.sdk.openadsdk.multipro.aidl.emc.ycc.ypw()     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.emc.emc.emc = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            java.lang.String r1 = "binder error"
            com.bytedance.sdk.openadsdk.utils.tp.msw(r1)
        L2b:
            com.bytedance.sdk.component.ycc.emc.ycc r1 = com.bytedance.sdk.openadsdk.multipro.emc.emc.emc
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(android.content.Context):com.bytedance.sdk.component.ycc.emc.ycc");
    }

    private static String emc() {
        return f.p(new StringBuilder(), dg.ypw, "/t_db/ttopensdk.db/");
    }

    public static void emc(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (emc(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                bw.emc(context).emc().emc(str, (String) null, contentValues);
                return;
            }
            ycc yccVarEmc = emc(context);
            if (yccVarEmc != null) {
                yccVarEmc.emc(Uri.parse(emc() + str), contentValues);
            }
        }
    }

    public static int emc(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (emc(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                return bw.emc(context).emc().emc(str, str2, strArr);
            }
            ycc yccVarEmc = emc(context);
            if (yccVarEmc != null) {
                return yccVarEmc.emc(Uri.parse(emc() + str), str2, strArr);
            }
            return 0;
        }
    }

    public static int emc(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (emc(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                    return bw.emc(context).emc().emc(str, contentValues, str2, strArr);
                }
                ycc yccVarEmc = emc(context);
                if (yccVarEmc != null) {
                    return yccVarEmc.emc(Uri.parse(emc() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> emc(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (emc(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                return emc(bw.emc(context).emc().emc(str, strArr, str2, strArr2, str3, str4, str5));
            }
            ycc yccVarEmc = emc(context);
            if (yccVarEmc != null) {
                return yccVarEmc.emc(Uri.parse(emc() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    public static Map<String, List<String>> emc(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return map;
            } catch (Throwable unused) {
                cursor.close();
            }
        }
        return map;
    }

    private static Object emc(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = ypw;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (emc.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
