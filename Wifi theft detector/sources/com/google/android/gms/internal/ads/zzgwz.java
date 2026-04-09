package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes2.dex */
class zzgwz extends zzgxa {
    private volatile zzgxa zza;
    final zzgwv zzb;
    final Character zzc;

    public zzgwz(zzgwv zzgwvVar, Character ch) {
        this.zzb = zzgwvVar;
        boolean z10 = true;
        if (ch != null && zzgwvVar.zze('=')) {
            z10 = false;
        }
        zzgrc.zzf(z10, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgwz) {
            zzgwz zzgwzVar = (zzgwz) obj;
            if (this.zzb.equals(zzgwzVar.zzb) && Objects.equals(this.zzc, zzgwzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgwv zzgwvVar = this.zzb;
        sb.append(zzgwvVar);
        if (8 % zzgwvVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgrc.zzo(0, i11, bArr.length);
        while (i12 < i11) {
            int i13 = this.zzb.zzd;
            zze(appendable, bArr, i12, Math.min(i13, i11 - i12));
            i12 += i13;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy {
        int i10;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgwv zzgwvVar = this.zzb;
        if (!zzgwvVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new zzgwy(sb.toString());
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = zzgwvVar.zzc;
                if (i13 >= i10) {
                    break;
                }
                jZzc <<= zzgwvVar.zzb;
                if (i11 + i13 < charSequenceZzg.length()) {
                    jZzc |= zzgwvVar.zzc(charSequenceZzg.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = zzgwvVar.zzd;
            int i16 = i14 * zzgwvVar.zzb;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jZzc >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i10;
        }
        return i12;
    }

    public zzgxa zzc(zzgwv zzgwvVar, Character ch) {
        return new zzgwz(zzgwvVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final int zzd(int i10) {
        zzgwv zzgwvVar = this.zzb;
        return zzgwvVar.zzc * zzgxs.zzb(i10, zzgwvVar.zzd, RoundingMode.CEILING);
    }

    public final void zze(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzgrc.zzo(i10, i10 + i11, bArr.length);
        zzgwv zzgwvVar = this.zzb;
        int i12 = zzgwvVar.zzd;
        int i13 = 0;
        zzgrc.zza(i11 <= i12);
        long j10 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j10 = (j10 | (bArr[i10 + i14] & 255)) << 8;
        }
        int i15 = (i11 + 1) * 8;
        int i16 = zzgwvVar.zzb;
        while (i13 < i11 * 8) {
            appendable.append(zzgwvVar.zza(zzgwvVar.zza & ((int) (j10 >>> ((i15 - i16) - i13)))));
            i13 += i16;
        }
        if (this.zzc != null) {
            while (i13 < i12 * 8) {
                appendable.append('=');
                i13 += i16;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final int zzf(int i10) {
        return (int) (((this.zzb.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final zzgxa zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final zzgxa zzi() {
        zzgxa zzgxaVarZzc = this.zza;
        if (zzgxaVarZzc == null) {
            zzgwv zzgwvVar = this.zzb;
            zzgwv zzgwvVarZzd = zzgwvVar.zzd();
            zzgxaVarZzc = zzgwvVarZzd == zzgwvVar ? this : zzc(zzgwvVarZzd, this.zzc);
            this.zza = zzgxaVarZzc;
        }
        return zzgxaVarZzc;
    }

    public zzgwz(String str, String str2, Character ch) {
        this(new zzgwv(str, str2.toCharArray()), ch);
    }
}
