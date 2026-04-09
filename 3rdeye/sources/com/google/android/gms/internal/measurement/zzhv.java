package com.google.android.gms.internal.measurement;

import N7.B8;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzhv extends zzia {
    public zzhv(zzhx zzhxVar, String str, Double d10, boolean z10) {
        super(zzhxVar, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbK = B8.k("Invalid double value for ", zzc(), ": ");
            sbK.append((String) obj);
            Log.e("PhenotypeFlag", sbK.toString());
            return null;
        }
    }
}
