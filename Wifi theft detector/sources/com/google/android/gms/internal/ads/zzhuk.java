package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzhuk extends zzhuu {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhuj zzd;
    private final zzhui zze;
    private final zzhui zzf;
    private final int zzg;

    public /* synthetic */ zzhuk(int i10, BigInteger bigInteger, zzhuj zzhujVar, zzhui zzhuiVar, zzhui zzhuiVar2, int i11, byte[] bArr) {
        this.zzb = i10;
        this.zzc = bigInteger;
        this.zzd = zzhujVar;
        this.zze = zzhuiVar;
        this.zzf = zzhuiVar2;
        this.zzg = i11;
    }

    public static zzhuh zzb() {
        return new zzhuh(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhuk)) {
            return false;
        }
        zzhuk zzhukVar = (zzhuk) obj;
        return zzhukVar.zzb == this.zzb && Objects.equals(zzhukVar.zzc, this.zzc) && Objects.equals(zzhukVar.zzd, this.zzd) && Objects.equals(zzhukVar.zze, this.zze) && Objects.equals(zzhukVar.zzf, this.zzf) && zzhukVar.zzg == this.zzg;
    }

    public final int hashCode() {
        return Objects.hash(zzhuk.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, Integer.valueOf(this.zzg));
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhui zzhuiVar = this.zzf;
        zzhui zzhuiVar2 = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhuiVar2);
        String strValueOf3 = String.valueOf(zzhuiVar);
        String strValueOf4 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i10 = this.zzg;
        int length4 = String.valueOf(i10).length();
        int length5 = strValueOf4.length();
        int i11 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i11).length() + 13);
        sb.append("RSA SSA PSS Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", signature hashType: ");
        sb.append(strValueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(strValueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i10);
        sb.append(", publicExponent: ");
        sb.append(strValueOf4);
        sb.append(", and ");
        sb.append(i11);
        sb.append("-bit modulus)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhuj.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhuj zze() {
        return this.zzd;
    }

    public final zzhui zzf() {
        return this.zze;
    }

    public final zzhui zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzg;
    }
}
