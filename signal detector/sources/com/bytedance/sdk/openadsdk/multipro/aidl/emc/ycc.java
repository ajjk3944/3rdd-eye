package com.bytedance.sdk.openadsdk.multipro.aidl.emc;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.ycc.emc.ycc;
import com.bytedance.sdk.openadsdk.core.aa;
import java.util.Map;

/* loaded from: classes.dex */
public class ycc extends ycc.emc {
    private static volatile ycc emc;

    public static ycc ypw() {
        if (emc == null) {
            synchronized (ycc.class) {
                try {
                    if (emc == null) {
                        emc = new ycc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc
    public Map emc(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(com.bytedance.sdk.openadsdk.multipro.bw.emc(aa.emc()).emc(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc
    public String emc(Uri uri) {
        if (com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
            return com.bytedance.sdk.openadsdk.multipro.bw.emc(aa.emc()).emc(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc
    public String emc(Uri uri, ContentValues contentValues) {
        Uri uriEmc;
        if (com.bytedance.sdk.openadsdk.core.settings.uym.emc() && (uriEmc = com.bytedance.sdk.openadsdk.multipro.bw.emc(aa.emc()).emc(uri, contentValues)) != null) {
            return uriEmc.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc
    public int emc(Uri uri, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
            return com.bytedance.sdk.openadsdk.multipro.bw.emc(aa.emc()).emc(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.ycc
    public int emc(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
            return com.bytedance.sdk.openadsdk.multipro.bw.emc(aa.emc()).emc(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
