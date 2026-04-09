package com.google.android.gms.internal.ads;

import B4.i;
import j6.l;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgpz extends zzgqc {
    private final int zza;
    private final int zzb;
    private final zzgpx zzc;
    private final zzgpw zzd;

    public /* synthetic */ zzgpz(int i, int i10, zzgpx zzgpxVar, zzgpw zzgpwVar, zzgpy zzgpyVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = zzgpxVar;
        this.zzd = zzgpwVar;
    }

    public static zzgpv zze() {
        return new zzgpv(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpz)) {
            return false;
        }
        zzgpz zzgpzVar = (zzgpz) obj;
        return zzgpzVar.zza == this.zza && zzgpzVar.zzd() == zzd() && zzgpzVar.zzc == this.zzc && zzgpzVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgpz.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        StringBuilder sbD = l.d("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        sbD.append(this.zzb);
        sbD.append("-byte tags, and ");
        return i.j(sbD, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzc != zzgpx.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgpx zzgpxVar = this.zzc;
        if (zzgpxVar == zzgpx.zzd) {
            return this.zzb;
        }
        if (zzgpxVar == zzgpx.zza || zzgpxVar == zzgpx.zzb || zzgpxVar == zzgpx.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgpw zzf() {
        return this.zzd;
    }

    public final zzgpx zzg() {
        return this.zzc;
    }
}
