package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgyo implements zzhae {
    private static final zzgyo zza = new zzgyo();

    private zzgyo() {
    }

    public static zzgyo zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final zzhad zzb(Class cls) {
        if (!zzgyv.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzhad) zzgyv.zzbh(cls.asSubclass(zzgyv.class)).zzbO();
        } catch (Exception e4) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean zzc(Class cls) {
        return zzgyv.class.isAssignableFrom(cls);
    }
}
