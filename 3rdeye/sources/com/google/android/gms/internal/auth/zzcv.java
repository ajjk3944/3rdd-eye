package com.google.android.gms.internal.auth;

import N7.B8;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l5, boolean z10) {
        super(zzczVar, str, l5, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbK = B8.k("Invalid long value for ", zzc(), ": ");
            sbK.append((String) obj);
            Log.e("PhenotypeFlag", sbK.toString());
            return null;
        }
    }
}
