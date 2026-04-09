package com.bytedance.adsdk.ypw.dg;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.ypw.sup;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class msw {
    private final uym emc;
    private final ycc ypw;

    public msw(uym uymVar, ycc yccVar) {
        this.emc = uymVar;
        this.ypw = yccVar;
    }

    private sup<com.bytedance.adsdk.ypw.uym> xq(Context context, String str, String str2) throws IOException {
        Closeable closeable = null;
        try {
            try {
                dg dgVarEmc = this.ypw.emc(str);
                if (!dgVarEmc.emc()) {
                    sup<com.bytedance.adsdk.ypw.uym> supVar = new sup<>(new IllegalArgumentException(dgVarEmc.dg()));
                    try {
                        dgVarEmc.close();
                    } catch (IOException unused) {
                    }
                    return supVar;
                }
                sup<com.bytedance.adsdk.ypw.uym> supVarEmc = emc(context, str, dgVarEmc.ypw(), dgVarEmc.xq(), str2);
                supVarEmc.emc();
                try {
                    dgVarEmc.close();
                } catch (IOException unused2) {
                }
                return supVarEmc;
            } catch (Exception e6) {
                sup<com.bytedance.adsdk.ypw.uym> supVar2 = new sup<>(e6);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException unused3) {
                    }
                }
                return supVar2;
            }
        } finally {
        }
    }

    private com.bytedance.adsdk.ypw.uym ypw(Context context, String str, String str2) {
        uym uymVar;
        Pair<xq, InputStream> pairEmc;
        if (str2 == null || (uymVar = this.emc) == null || (pairEmc = uymVar.emc(str)) == null) {
            return null;
        }
        xq xqVar = (xq) pairEmc.first;
        InputStream inputStream = (InputStream) pairEmc.second;
        sup<com.bytedance.adsdk.ypw.uym> supVarEmc = xqVar == xq.ZIP ? com.bytedance.adsdk.ypw.msw.emc(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.ypw.msw.ypw(inputStream, str2);
        if (supVarEmc.emc() != null) {
            return supVarEmc.emc();
        }
        return null;
    }

    public sup<com.bytedance.adsdk.ypw.uym> emc(Context context, String str, String str2) {
        com.bytedance.adsdk.ypw.uym uymVarYpw = ypw(context, str, str2);
        return uymVarYpw != null ? new sup<>(uymVarYpw) : xq(context, str, str2);
    }

    private sup<com.bytedance.adsdk.ypw.uym> emc(Context context, String str, InputStream inputStream, String str2, String str3) {
        sup<com.bytedance.adsdk.ypw.uym> supVarEmc;
        xq xqVar;
        uym uymVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            xqVar = xq.JSON;
            supVarEmc = emc(str, inputStream, str3);
        } else {
            xq xqVar2 = xq.ZIP;
            supVarEmc = emc(context, str, inputStream, str3);
            xqVar = xqVar2;
        }
        if (str3 != null && supVarEmc.emc() != null && (uymVar = this.emc) != null) {
            uymVar.emc(str, xqVar);
        }
        return supVarEmc;
    }

    private sup<com.bytedance.adsdk.ypw.uym> emc(Context context, String str, InputStream inputStream, String str2) {
        uym uymVar;
        if (str2 != null && (uymVar = this.emc) != null) {
            return com.bytedance.adsdk.ypw.msw.emc(context, new ZipInputStream(new FileInputStream(uymVar.emc(str, inputStream, xq.ZIP))), str);
        }
        return com.bytedance.adsdk.ypw.msw.emc(context, new ZipInputStream(inputStream), (String) null);
    }

    private sup<com.bytedance.adsdk.ypw.uym> emc(String str, InputStream inputStream, String str2) {
        uym uymVar;
        if (str2 != null && (uymVar = this.emc) != null) {
            return com.bytedance.adsdk.ypw.msw.ypw(new FileInputStream(uymVar.emc(str, inputStream, xq.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.ypw.msw.ypw(inputStream, (String) null);
    }
}
