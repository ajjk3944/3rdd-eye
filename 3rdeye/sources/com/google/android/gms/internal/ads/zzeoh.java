package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeoh implements zzetu {
    private final zzeyr zza;

    public zzeoh(zzeyr zzeyrVar) {
        this.zza = zzeyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        zzeyr zzeyrVar = this.zza;
        if (zzeyrVar == null) {
            return zzgdb.zzh(new zzeog(null));
        }
        String strZza = zzeyrVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzgdb.zzh(new zzeog(null)) : zzgdb.zzh(new zzeog(strZza));
    }
}
