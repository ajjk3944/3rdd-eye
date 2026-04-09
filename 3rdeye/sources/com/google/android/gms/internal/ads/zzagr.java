package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzagr implements zzau {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzagr(int i, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = bArr;
    }

    public static zzagr zzb(zzen zzenVar) {
        int iZzg = zzenVar.zzg();
        String strZze = zzay.zze(zzenVar.zzB(zzenVar.zzg(), StandardCharsets.US_ASCII));
        String strZzB = zzenVar.zzB(zzenVar.zzg(), StandardCharsets.UTF_8);
        int iZzg2 = zzenVar.zzg();
        int iZzg3 = zzenVar.zzg();
        int iZzg4 = zzenVar.zzg();
        int iZzg5 = zzenVar.zzg();
        int iZzg6 = zzenVar.zzg();
        byte[] bArr = new byte[iZzg6];
        zzenVar.zzH(bArr, 0, iZzg6);
        return new zzagr(iZzg, strZze, strZzB, iZzg2, iZzg3, iZzg4, iZzg5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagr.class == obj.getClass()) {
            zzagr zzagrVar = (zzagr) obj;
            if (this.zza == zzagrVar.zza && this.zzb.equals(zzagrVar.zzb) && this.zzc.equals(zzagrVar.zzc) && this.zzd == zzagrVar.zzd && this.zze == zzagrVar.zze && this.zzf == zzagrVar.zzf && this.zzg == zzagrVar.zzg && Arrays.equals(this.zzh, zzagrVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza + 527;
        int iHashCode = this.zzb.hashCode() + (i * 31);
        int iHashCode2 = this.zzc.hashCode() + (iHashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((iHashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        zzarVar.zza(this.zzh, this.zza);
    }
}
