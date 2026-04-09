package com.bytedance.sdk.component.ycc.emc.ypw.ypw;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ycc.emc.emc.emc.uym;
import com.bytedance.sdk.component.ycc.emc.msw;
import com.bytedance.sdk.component.ycc.emc.ycc;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ypw {
    public static ycc emc;

    private static String dg() {
        return uym.ypw + "/ad_log_event/";
    }

    public static void ypw() {
        if (msw.uym().ycc() == null) {
            return;
        }
        try {
            ycc yccVarEmc = emc(msw.uym().ycc());
            if (yccVarEmc != null) {
                yccVarEmc.emc(Uri.parse(dg() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public int emc(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public String xq() {
        return "ad_log_event";
    }

    public int emc(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor emc(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri emc(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static ycc emc(Context context) {
        try {
            if (emc == null) {
                emc = msw.uym().vk().gbl();
            }
        } catch (Exception unused) {
        }
        return emc;
    }

    public static void emc() {
        if (msw.uym().ycc() == null) {
            return;
        }
        try {
            ycc yccVarEmc = emc(msw.uym().ycc());
            if (yccVarEmc != null) {
                yccVarEmc.emc(Uri.parse(dg() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar) {
        if (emcVar == null) {
            return;
        }
        try {
            ycc yccVarEmc = emc(msw.uym().ycc());
            if (yccVarEmc != null) {
                yccVarEmc.emc(Uri.parse(dg() + "adLogDispatch?event=" + com.bytedance.sdk.component.ycc.emc.emc.emc.ycc.emc(emcVar.ycc())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void emc(String str, List<String> list, boolean z10, int i10, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(com.bytedance.sdk.component.ycc.emc.emc.emc.ycc.emc(it.next()));
                sb.append(",");
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.ycc.emc.emc.emc.ycc.emc(sb.toString())) + "&replace=" + String.valueOf(z10) + "&urlType=" + String.valueOf(i10) + "&adId=" + str2;
            ycc yccVarEmc = emc(msw.uym().ycc());
            if (yccVarEmc != null) {
                yccVarEmc.emc(Uri.parse(dg() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void emc(String str, boolean z10) {
        if (msw.uym().vk().ycc() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ycc yccVarEmc = emc(msw.uym().ycc());
            if (yccVarEmc != null) {
                yccVarEmc.emc(Uri.parse(dg() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z10));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String emc(android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ycc.emc.ypw.ypw.ypw.emc(android.net.Uri):java.lang.String");
    }
}
