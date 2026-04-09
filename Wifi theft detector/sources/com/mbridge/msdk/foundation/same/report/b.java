package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f15217a = "DomainReport";

    public static boolean a(com.mbridge.msdk.setting.g gVar, String str) {
        if (gVar != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    int iL = gVar.L();
                    JSONArray jSONArrayJ = gVar.J();
                    JSONArray jSONArrayI = gVar.I();
                    if (jSONArrayI != null) {
                        for (int i10 = 0; i10 < jSONArrayI.length(); i10++) {
                            if (str.contains(jSONArrayI.getString(i10))) {
                                return false;
                            }
                        }
                    }
                    if (iL == 2) {
                        if (jSONArrayJ != null) {
                            for (int i11 = 0; i11 < jSONArrayJ.length(); i11++) {
                                if (str.contains(jSONArrayJ.getString(i11))) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            } catch (Exception e10) {
                q0.b(f15217a, e10.getMessage());
            }
        }
        return true;
    }
}
