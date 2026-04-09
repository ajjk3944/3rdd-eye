package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhfw implements zzhfy {
    private zzhgh zza;

    public static void zza(zzhgh zzhghVar, zzhgh zzhghVar2) {
        zzhfw zzhfwVar = (zzhfw) zzhghVar;
        if (zzhfwVar.zza != null) {
            throw new IllegalStateException();
        }
        zzhfwVar.zza = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        zzhgh zzhghVar = this.zza;
        if (zzhghVar != null) {
            return zzhghVar.zzb();
        }
        throw new IllegalStateException();
    }
}
