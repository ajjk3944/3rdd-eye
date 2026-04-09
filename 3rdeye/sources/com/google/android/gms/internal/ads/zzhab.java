package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhab {
    public static final boolean zza(Object obj) {
        return !((zzhaa) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzhaa zzhaaVarZzb = (zzhaa) obj;
        zzhaa zzhaaVar = (zzhaa) obj2;
        if (!zzhaaVar.isEmpty()) {
            if (!zzhaaVarZzb.zze()) {
                zzhaaVarZzb = zzhaaVarZzb.zzb();
            }
            zzhaaVarZzb.zzd(zzhaaVar);
        }
        return zzhaaVarZzb;
    }
}
