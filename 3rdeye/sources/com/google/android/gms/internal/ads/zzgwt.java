package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgwt {
    private final zzgws zza;

    private zzgwt(zzgws zzgwsVar) {
        this.zza = zzgwsVar;
    }

    public static zzgwt zzb(byte[] bArr, zzgfb zzgfbVar) {
        return new zzgwt(zzgws.zzb(bArr));
    }

    public static zzgwt zzc(int i) {
        return new zzgwt(zzgws.zzb(zzgoo.zzb(i)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzgfb zzgfbVar) {
        return this.zza.zzd();
    }
}
