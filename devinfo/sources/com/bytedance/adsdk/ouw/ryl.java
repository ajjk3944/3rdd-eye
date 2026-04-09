package com.bytedance.adsdk.ouw;

import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ryl implements bly {
    @Override // com.bytedance.adsdk.ouw.bly
    public final Object ouw(JSONObject jSONObject, Object[] objArr) {
        String string;
        int iIntValue;
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String str = objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr.length >= 3 ? objArr[2] : null;
        if (!(obj instanceof String)) {
            return null;
        }
        String str2 = (String) obj;
        if (str == null) {
            return null;
        }
        if (str instanceof String) {
            string = str;
        } else {
            if (!(str instanceof Number)) {
                return null;
            }
            string = str.toString();
        }
        String[] strArrSplit = string.split(Pattern.quote(str2), -1);
        if (obj2 == null) {
            return strArrSplit;
        }
        if (!(obj2 instanceof Number) || (iIntValue = ((Number) obj2).intValue()) < 0 || iIntValue >= strArrSplit.length) {
            return null;
        }
        return strArrSplit[iIntValue];
    }
}
