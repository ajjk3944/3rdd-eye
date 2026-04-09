package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhgl implements zzhgh {
    private static final Object zza = new Object();
    private volatile zzhgh zzb;
    private volatile Object zzc = zza;

    private zzhgl(zzhgh zzhghVar) {
        this.zzb = zzhghVar;
    }

    public static zzhgh zza(zzhgh zzhghVar) {
        return ((zzhghVar instanceof zzhgl) || (zzhghVar instanceof zzhfx)) ? zzhghVar : new zzhgl(zzhghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhgh zzhghVar = this.zzb;
        if (zzhghVar == null) {
            return this.zzc;
        }
        Object objZzb = zzhghVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
