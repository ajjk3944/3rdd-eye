package com.bytedance.sdk.openadsdk.multipro.xq;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.ycc.emc.ycc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.multipro.dg;
import java.util.Objects;

/* loaded from: classes.dex */
public class emc implements com.bytedance.sdk.openadsdk.multipro.emc {
    private static String bw() {
        return dg.ypw + "/t_frequent/";
    }

    private static ycc dg() {
        try {
            if (aa.emc() != null) {
                return com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(aa.emc());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String xq() {
        if (aa.emc() == null) {
            return null;
        }
        try {
            ycc yccVarDg = dg();
            if (yccVarDg != null) {
                return yccVarDg.emc(Uri.parse(bw() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean ypw() {
        if (aa.emc() == null) {
            return false;
        }
        try {
            ycc yccVarDg = dg();
            if (yccVarDg != null) {
                return "true".equals(yccVarDg.emc(Uri.parse(bw() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public int emc(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public int emc(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public Cursor emc(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public Uri emc(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public static boolean emc(String str) {
        if (aa.emc() == null) {
            return false;
        }
        try {
            ycc yccVarDg = dg();
            if (yccVarDg != null) {
                return "true".equals(yccVarDg.emc(Uri.parse(bw() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    @NonNull
    public String emc() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public String emc(@NonNull Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.msw.emc.emc().emc(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.msw.emc.emc().ypw() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.msw.emc.emc().xq();
        }
        return null;
    }
}
