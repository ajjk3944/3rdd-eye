package com.google.android.gms.internal.auth;

import android.net.Uri;
import m0.C5308a;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzcr {
    private static final C5308a zza = new C5308a();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        C5308a c5308a = zza;
        Uri uri = (Uri) c5308a.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        c5308a.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
