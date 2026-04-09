package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgan {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgan(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c10 = cArr[i];
            boolean z10 = true;
            zzfve.zzg(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            zzfve.zzg(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgan) {
            zzgan zzganVar = (zzgan) obj;
            if (this.zzi == zzganVar.zzi && Arrays.equals(this.zzf, zzganVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i) {
        return this.zzf[i];
    }

    public final int zzb(char c10) throws zzgaq {
        if (c10 > 127) {
            throw new zzgaq("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        byte b10 = this.zzg[c10];
        if (b10 != -1) {
            return b10;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new zzgaq("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        throw new zzgaq("Unrecognized character: " + c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    public final zzgan zzc() {
        boolean z10;
        int i = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i >= length) {
                return this;
            }
            if (zzfuk.zze(cArr[i])) {
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z10 = false;
                        break;
                    }
                    if (zzfuk.zzd(cArr[i10])) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                zzfve.zzm(!z10, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i11 = 0; i11 < cArr.length; i11++) {
                    char c10 = cArr[i11];
                    if (zzfuk.zze(c10)) {
                        c10 ^= 32;
                    }
                    cArr2[i11] = (char) c10;
                }
                zzgan zzganVar = new zzgan(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzganVar.zzi) {
                    return zzganVar;
                }
                byte[] bArr = zzganVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i12 = 65; i12 <= 90; i12++) {
                    int i13 = i12 | 32;
                    byte b10 = bArr[i12];
                    byte b11 = bArr[i13];
                    if (b10 == -1) {
                        bArrCopyOf[i12] = b11;
                    } else {
                        char c11 = (char) i12;
                        char c12 = (char) i13;
                        if (b11 != -1) {
                            throw new IllegalStateException(zzfvv.zzb("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                        }
                        bArrCopyOf[i13] = b10;
                    }
                }
                return new zzgan(zzganVar.zze.concat(".ignoreCase()"), zzganVar.zzf, bArrCopyOf, true);
            }
            i++;
        }
    }

    public final boolean zzd(int i) {
        return this.zzh[i % this.zzc];
    }

    public final boolean zze(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgan(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzc = zzgbb.zzc(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzc;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzc);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i;
            this.zzd = iZzc >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i10 = 0; i10 < this.zzd; i10++) {
                zArr[zzgbb.zzb(i10 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z10;
        } catch (ArithmeticException e4) {
            throw new IllegalArgumentException(C4356c.h(cArr.length, "Illegal alphabet length "), e4);
        }
    }
}
