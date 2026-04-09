package com.google.android.gms.internal.ads;

import B4.i;
import j6.l;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzggf extends zzgfo {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzggd zze;
    private final zzggc zzf;

    public /* synthetic */ zzggf(int i, int i10, int i11, int i12, zzggd zzggdVar, zzggc zzggcVar, zzgge zzggeVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzggdVar;
        this.zzf = zzggcVar;
    }

    public static zzggb zzf() {
        return new zzggb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggf)) {
            return false;
        }
        zzggf zzggfVar = (zzggf) obj;
        return zzggfVar.zza == this.zza && zzggfVar.zzb == this.zzb && zzggfVar.zzc == this.zzc && zzggfVar.zzd == this.zzd && zzggfVar.zze == this.zze && zzggfVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzggf.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        StringBuilder sbD = l.d("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.zze), ", hashType: ", String.valueOf(this.zzf), ", ");
        sbD.append(this.zzc);
        sbD.append("-byte IV, and ");
        sbD.append(this.zzd);
        sbD.append("-byte tags, and ");
        sbD.append(this.zza);
        sbD.append("-byte AES key, and ");
        return i.j(sbD, this.zzb, "-byte HMAC key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zze != zzggd.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzggc zzg() {
        return this.zzf;
    }

    public final zzggd zzh() {
        return this.zze;
    }
}
