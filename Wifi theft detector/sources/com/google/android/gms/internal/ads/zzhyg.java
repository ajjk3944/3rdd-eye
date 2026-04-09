package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhyg {
    private final zzhye zza;

    private zzhyg(zzhye zzhyeVar) {
        this.zza = zzhyeVar;
    }

    public static zzhyg zza(byte[] bArr, zzhbt zzhbtVar) {
        return new zzhyg(zzhye.zza(bArr));
    }

    public static zzhyg zzb(int i10) {
        return new zzhyg(zzhye.zza(zzhle.zza(i10)));
    }

    public final byte[] zzc(zzhbt zzhbtVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
