package com.bytedance.sdk.openadsdk.multipro.aidl.ouw;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.le.ouw.le;
import com.bytedance.sdk.openadsdk.core.zih;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class le extends le.ouw {
    private static volatile le ouw;

    public static le vt() {
        if (ouw == null) {
            synchronized (le.class) {
                try {
                    if (ouw == null) {
                        ouw = new le();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le
    public final Map ouw(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(com.bytedance.sdk.openadsdk.multipro.fkw.ouw(zih.ouw()).ouw(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.le
    public final String ouw(Uri uri) {
        if (com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            return com.bytedance.sdk.openadsdk.multipro.fkw.ouw(zih.ouw()).ouw(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le
    public final String ouw(Uri uri, ContentValues contentValues) {
        Uri uriOuw;
        if (com.bytedance.sdk.openadsdk.core.settings.ra.ouw() && (uriOuw = com.bytedance.sdk.openadsdk.multipro.fkw.ouw(zih.ouw()).ouw(uri, contentValues)) != null) {
            return uriOuw.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le
    public final int ouw(Uri uri, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            return com.bytedance.sdk.openadsdk.multipro.fkw.ouw(zih.ouw()).ouw(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le
    public final int ouw(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            return com.bytedance.sdk.openadsdk.multipro.fkw.ouw(zih.ouw()).ouw(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
