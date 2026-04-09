package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import g0.C4356c;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgao extends zzgar {
    final char[] zza;

    private zzgao(zzgan zzganVar) {
        super(zzganVar, null);
        this.zza = new char[AdRequest.MAX_CONTENT_URL_LENGTH];
        zzfve.zze(zzganVar.zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzganVar.zza(i >>> 4);
            this.zza[i | 256] = zzganVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgar, com.google.android.gms.internal.ads.zzgas
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzgaq {
        if (charSequence.length() % 2 == 1) {
            throw new zzgaq(C4356c.h(charSequence.length(), "Invalid input length "));
        }
        int i = 0;
        int i10 = 0;
        while (i < charSequence.length()) {
            zzgan zzganVar = this.zzb;
            bArr[i10] = (byte) (zzganVar.zzb(charSequence.charAt(i + 1)) | (zzganVar.zzb(charSequence.charAt(i)) << 4));
            i += 2;
            i10++;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgas zzb(zzgan zzganVar, Character ch) {
        return new zzgao(zzganVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgar, com.google.android.gms.internal.ads.zzgas
    public final void zzc(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        zzfve.zzk(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i12]);
            appendable.append(cArr[i12 | 256]);
        }
    }

    public zzgao(String str, String str2) {
        this(new zzgan("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
