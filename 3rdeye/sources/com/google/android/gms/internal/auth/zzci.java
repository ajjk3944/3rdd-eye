package com.google.android.gms.internal.auth;

import android.net.Uri;
import m0.C5316i;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzci {
    private final C5316i zza;

    public zzci(C5316i c5316i) {
        this.zza = c5316i;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        C5316i c5316i = (C5316i) this.zza.get(uri.toString());
        if (c5316i == null) {
            return null;
        }
        return (String) c5316i.get("".concat(String.valueOf(str3)));
    }
}
