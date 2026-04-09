package io.appmetrica.analytics.logger.common.impl;

import N7.B8;
import N7.G8;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class a {
    public static String a(String str, String str2, Object... objArr) {
        StringBuilder sbV = G8.v(str, " ");
        if (str2 == null) {
            str2 = "";
        } else if (objArr != null && objArr.length != 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (Throwable th) {
                StringBuilder sbK = B8.k("Attention!!! Invalid log format. See exception details above. Message: ", str2, "; arguments: ");
                sbK.append(Arrays.toString(objArr));
                str2 = sbK.toString();
                Log.e("[LogMessageConstructor]", str2, th);
            }
        }
        Locale locale = Locale.US;
        sbV.append("[" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + "] " + str2);
        return sbV.toString();
    }
}
