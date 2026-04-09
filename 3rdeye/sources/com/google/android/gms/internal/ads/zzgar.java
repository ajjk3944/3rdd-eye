package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
class zzgar extends zzgas {
    private volatile zzgas zza;
    final zzgan zzb;
    final Character zzc;

    public zzgar(zzgan zzganVar, Character ch) {
        this.zzb = zzganVar;
        boolean z10 = true;
        if (ch != null && zzganVar.zze('=')) {
            z10 = false;
        }
        zzfve.zzi(z10, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgar) {
            zzgar zzgarVar = (zzgar) obj;
            if (this.zzb.equals(zzgarVar.zzb) && Objects.equals(this.zzc, zzgarVar.zzc)) {
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
        zzgan zzganVar = this.zzb;
        sb.append(zzganVar);
        if (8 % zzganVar.zzb != 0) {
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

    @Override // com.google.android.gms.internal.ads.zzgas
    public int zza(byte[] bArr, CharSequence charSequence) throws zzgaq {
        int i;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgan zzganVar = this.zzb;
        if (!zzganVar.zzd(length)) {
            throw new zzgaq(C4356c.h(charSequenceZzg.length(), "Invalid input length "));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZzg.length()) {
            long jZzb = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i = zzganVar.zzc;
                if (i12 >= i) {
                    break;
                }
                jZzb <<= zzganVar.zzb;
                if (i10 + i12 < charSequenceZzg.length()) {
                    jZzb |= zzganVar.zzb(charSequenceZzg.charAt(i13 + i10));
                    i13++;
                }
                i12++;
            }
            int i14 = zzganVar.zzd;
            int i15 = i13 * zzganVar.zzb;
            int i16 = (i14 - 1) * 8;
            while (i16 >= (i14 * 8) - i15) {
                bArr[i11] = (byte) ((jZzb >>> i16) & 255);
                i16 -= 8;
                i11++;
            }
            i10 += i;
        }
        return i11;
    }

    public zzgas zzb(zzgan zzganVar, Character ch) {
        return new zzgar(zzganVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public void zzc(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        zzfve.zzk(0, i10, bArr.length);
        while (i11 < i10) {
            int i12 = this.zzb.zzd;
            zzh(appendable, bArr, i11, Math.min(i12, i10 - i11));
            i11 += i12;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzd(int i) {
        return (int) (((this.zzb.zzb * i) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zze(int i) {
        zzgan zzganVar = this.zzb;
        return zzganVar.zzc * zzgbb.zzb(i, zzganVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgas zzf() {
        zzgas zzgasVarZzb = this.zza;
        if (zzgasVarZzb == null) {
            zzgan zzganVar = this.zzb;
            zzgan zzganVarZzc = zzganVar.zzc();
            zzgasVarZzb = zzganVarZzc == zzganVar ? this : zzb(zzganVarZzc, this.zzc);
            this.zza = zzgasVarZzb;
        }
        return zzgasVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
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

    public final void zzh(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        zzfve.zzk(i, i + i10, bArr.length);
        zzgan zzganVar = this.zzb;
        int i11 = zzganVar.zzd;
        int i12 = 0;
        zzfve.zze(i10 <= i11);
        long j4 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            j4 = (j4 | (bArr[i + i13] & 255)) << 8;
        }
        int i14 = (i10 + 1) * 8;
        int i15 = zzganVar.zzb;
        while (i12 < i10 * 8) {
            appendable.append(zzganVar.zza(zzganVar.zza & ((int) (j4 >>> ((i14 - i15) - i12)))));
            i12 += i15;
        }
        if (this.zzc != null) {
            while (i12 < i11 * 8) {
                appendable.append('=');
                i12 += i15;
            }
        }
    }

    public zzgar(String str, String str2, Character ch) {
        this(new zzgan(str, str2.toCharArray()), ch);
    }
}
