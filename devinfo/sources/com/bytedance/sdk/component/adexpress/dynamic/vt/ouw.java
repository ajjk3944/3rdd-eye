package com.bytedance.sdk.component.adexpress.dynamic.vt;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.yu.le;
import com.bytedance.sdk.component.adexpress.dynamic.yu.ra;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static int ouw(ra raVar) {
        if (raVar == null) {
            return 0;
        }
        le leVar = raVar.yu;
        String str = leVar.jae;
        String str2 = leVar.ksc;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || !str2.equals("creative")) {
            return 0;
        }
        if (str.equals("shake")) {
            return 2;
        }
        if (str.equals("twist")) {
            return 3;
        }
        return str.equals("slide") ? 1 : 0;
    }
}
