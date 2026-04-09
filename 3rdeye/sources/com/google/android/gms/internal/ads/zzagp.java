package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzagp implements zzau {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzx zzxVar = new zzx();
        zzxVar.zzah("application/id3");
        zzxVar.zzan();
        zzx zzxVar2 = new zzx();
        zzxVar2.zzah("application/x-scte35");
        zzxVar2.zzan();
    }

    public zzagp(String str, String str2, long j4, long j10, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j4;
        this.zzd = j10;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagp.class == obj.getClass()) {
            zzagp zzagpVar = (zzagp) obj;
            if (this.zzc == zzagpVar.zzc && this.zzd == zzagpVar.zzd && Objects.equals(this.zza, zzagpVar.zza) && Objects.equals(this.zzb, zzagpVar.zzb) && Arrays.equals(this.zze, zzagpVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zza.hashCode() + 527;
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        long j4 = this.zzc;
        long j10 = this.zzd;
        int iHashCode3 = Arrays.hashCode(this.zze) + (((((iHashCode2 * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) j10)) * 31);
        this.zzf = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
