package com.bytedance.sdk.component.adexpress.dynamic.ypw;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.dg.uym;

/* loaded from: classes.dex */
public class emc {
    public static int emc(uym uymVar) {
        if (uymVar == null) {
            return 0;
        }
        String strMxo = uymVar.mxo();
        String strHxp = uymVar.hxp();
        if (TextUtils.isEmpty(strHxp) || TextUtils.isEmpty(strMxo) || !strHxp.equals("creative")) {
            return 0;
        }
        if (strMxo.equals("shake")) {
            return 2;
        }
        if (strMxo.equals("twist")) {
            return 3;
        }
        return strMxo.equals("slide") ? 1 : 0;
    }
}
