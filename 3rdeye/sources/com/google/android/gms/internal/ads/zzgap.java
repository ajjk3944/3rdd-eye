package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.io.IOException;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgap extends zzgar {
    private zzgap(zzgan zzganVar, Character ch) {
        super(zzganVar, ch);
        zzfve.zze(zzganVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgar, com.google.android.gms.internal.ads.zzgas
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzgaq {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgan zzganVar = this.zzb;
        if (!zzganVar.zzd(length)) {
            throw new zzgaq(C4356c.h(charSequenceZzg.length(), "Invalid input length "));
        }
        int i = 0;
        int i10 = 0;
        while (i < charSequenceZzg.length()) {
            int i11 = i10 + 1;
            int iZzb = (zzganVar.zzb(charSequenceZzg.charAt(i + 1)) << 12) | (zzganVar.zzb(charSequenceZzg.charAt(i)) << 18);
            bArr[i10] = (byte) (iZzb >>> 16);
            int i12 = i + 2;
            if (i12 < charSequenceZzg.length()) {
                int i13 = i + 3;
                int iZzb2 = iZzb | (zzganVar.zzb(charSequenceZzg.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((iZzb2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                if (i13 < charSequenceZzg.length()) {
                    i += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((iZzb2 | zzganVar.zzb(charSequenceZzg.charAt(i13))) & KotlinVersion.MAX_COMPONENT_VALUE);
                } else {
                    i10 = i14;
                    i = i13;
                }
            } else {
                i = i12;
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgas zzb(zzgan zzganVar, Character ch) {
        return new zzgap(zzganVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgar, com.google.android.gms.internal.ads.zzgas
    public final void zzc(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        zzfve.zzk(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = bArr[i11] & 255;
            int i14 = bArr[i11 + 1] & 255;
            int i15 = bArr[i11 + 2] & 255;
            zzgan zzganVar = this.zzb;
            int i16 = (i14 << 8) | (i13 << 16) | i15;
            appendable.append(zzganVar.zza(i16 >>> 18));
            appendable.append(zzganVar.zza((i16 >>> 12) & 63));
            appendable.append(zzganVar.zza((i16 >>> 6) & 63));
            appendable.append(zzganVar.zza(i16 & 63));
            i11 += 3;
        }
        if (i11 < i10) {
            zzh(appendable, bArr, i11, i10 - i11);
        }
    }

    public zzgap(String str, String str2, Character ch) {
        this(new zzgan(str, str2.toCharArray()), ch);
    }
}
