package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgzy implements zzhba {
    private static final zzhae zza = new zzgzw();
    private final zzhae zzb;

    public zzgzy() {
        zzgyo zzgyoVarZza = zzgyo.zza();
        int i = zzhaq.zza;
        zzgzx zzgzxVar = new zzgzx(zzgyoVarZza, zza);
        byte[] bArr = zzgzi.zzb;
        this.zzb = zzgzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhba
    public final zzhaz zza(Class cls) {
        int i = zzhbb.zza;
        if (!zzgyv.class.isAssignableFrom(cls)) {
            int i10 = zzhaq.zza;
        }
        zzhad zzhadVarZzb = this.zzb.zzb(cls);
        if (zzhadVarZzb.zzb()) {
            int i11 = zzhaq.zza;
            return zzhak.zzc(zzhbb.zzm(), zzgyi.zza(), zzhadVarZzb.zza());
        }
        int i12 = zzhaq.zza;
        return zzhaj.zzm(cls, zzhadVarZzb, zzhan.zza(), zzgzu.zza(), zzhbb.zzm(), zzhadVarZzb.zzc() + (-1) != 1 ? zzgyi.zza() : null, zzhac.zza());
    }
}
