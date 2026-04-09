package com.bytedance.sdk.openadsdk.multipro.xq;

import A.f;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.ycc.emc.ycc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.multipro.dg;
import j$.util.Objects;

/* loaded from: classes.dex */
public class emc implements com.bytedance.sdk.openadsdk.multipro.emc {
    private static String bw() {
        return f.p(new StringBuilder(), dg.ypw, "/t_frequent/");
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
    public int emc(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public int emc(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public Cursor emc(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public Uri emc(Uri uri, ContentValues contentValues) {
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
    public String emc() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public String emc(Uri uri) {
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
