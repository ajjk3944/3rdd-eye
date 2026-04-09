package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzhdm extends zzhch {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhdl zzd;

    public /* synthetic */ zzhdm(int i10, int i11, int i12, zzhdl zzhdlVar, byte[] bArr) {
        this.zza = i10;
        this.zzd = zzhdlVar;
    }

    public static zzhdk zzb() {
        return new zzhdk(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhdm)) {
            return false;
        }
        zzhdm zzhdmVar = (zzhdm) obj;
        return zzhdmVar.zza == this.zza && zzhdmVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhdm.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i10).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(12);
        sb.append("-byte IV, ");
        sb.append(16);
        sb.append("-byte tag, and ");
        sb.append(i10);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhdl.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhdl zzd() {
        return this.zzd;
    }
}
