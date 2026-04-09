package com.google.android.gms.internal.ads;

import B4.g;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbdm extends zzbdn {
    private static final String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i10 = 0;
        while (i10 < str.length() && str.charAt(i10) == ',') {
            i10++;
        }
        while (length > 0) {
            int i11 = length - 1;
            if (str.charAt(i11) != ',') {
                break;
            }
            length = i11;
        }
        if (length < i10) {
            return null;
        }
        if (i10 != 0) {
            i = i10;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final String zza(String str, String str2) {
        String strZzb = zzb(str);
        String strZzb2 = zzb(str2);
        return TextUtils.isEmpty(strZzb) ? strZzb2 : TextUtils.isEmpty(strZzb2) ? strZzb : g.o(strZzb, StringUtils.COMMA, strZzb2);
    }
}
