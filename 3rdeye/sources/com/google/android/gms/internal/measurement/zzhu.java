package com.google.android.gms.internal.measurement;

import N7.B8;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzhu extends zzia {
    public zzhu(zzhx zzhxVar, String str, Boolean bool, boolean z10) {
        super(zzhxVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzia
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzgz.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzgz.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbK = B8.k("Invalid boolean value for ", zzc(), ": ");
        sbK.append((String) obj);
        Log.e("PhenotypeFlag", sbK.toString());
        return null;
    }
}
