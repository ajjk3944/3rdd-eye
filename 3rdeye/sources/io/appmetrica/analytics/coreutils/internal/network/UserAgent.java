package io.appmetrica.analytics.coreutils.internal.network;

import N7.B8;
import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;
import y9.n;

/* loaded from: classes3.dex */
public final class UserAgent {
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    public static final String getFor(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        sb.append('.');
        sb.append(str3);
        sb.append(" (");
        INSTANCE.getClass();
        String str4 = Build.MODEL;
        String str5 = Build.MANUFACTURER;
        if (!n.a0(str4, str5, false)) {
            str4 = str5 + ' ' + str4;
        }
        sb.append(StringExtensionsKt.replaceFirstCharWithTitleCase(str4));
        sb.append("; Android ");
        return B8.j(sb, Build.VERSION.RELEASE, ')');
    }
}
