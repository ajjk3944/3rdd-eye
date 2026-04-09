package com.google.android.gms.internal.ads;

import B4.i;
import N7.B8;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgpi extends zzgqc {
    private final int zza;
    private final int zzb;
    private final zzgpg zzc;

    public /* synthetic */ zzgpi(int i, int i10, zzgpg zzgpgVar, zzgph zzgphVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = zzgpgVar;
    }

    public static zzgpf zze() {
        return new zzgpf(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpi)) {
            return false;
        }
        zzgpi zzgpiVar = (zzgpi) obj;
        return zzgpiVar.zza == this.zza && zzgpiVar.zzd() == zzd() && zzgpiVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzgpi.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        StringBuilder sbK = B8.k("AES-CMAC Parameters (variant: ", String.valueOf(this.zzc), ", ");
        sbK.append(this.zzb);
        sbK.append("-byte tags, and ");
        return i.j(sbK, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzc != zzgpg.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgpg zzgpgVar = this.zzc;
        if (zzgpgVar == zzgpg.zzd) {
            return this.zzb;
        }
        if (zzgpgVar == zzgpg.zza || zzgpgVar == zzgpg.zzb || zzgpgVar == zzgpg.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgpg zzf() {
        return this.zzc;
    }
}
