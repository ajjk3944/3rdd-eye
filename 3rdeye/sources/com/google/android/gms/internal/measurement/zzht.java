package com.google.android.gms.internal.measurement;

import N7.B8;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzht extends zzia {
    public zzht(zzhx zzhxVar, String str, Long l5, boolean z10) {
        super(zzhxVar, str, l5, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
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
