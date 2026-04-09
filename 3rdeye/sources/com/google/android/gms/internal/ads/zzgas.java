package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgas {
    private static final zzgas zza;

    static {
        new zzgap("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new zzgap("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new zzgar("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgar("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zza = new zzgao("base16()", "0123456789ABCDEF");
    }

    public static zzgas zzi() {
        return zza;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzgaq;

    public abstract void zzc(Appendable appendable, byte[] bArr, int i, int i10) throws IOException;

    public abstract int zzd(int i);

    public abstract int zze(int i);

    public abstract zzgas zzf();

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public final String zzj(byte[] bArr, int i, int i10) {
        zzfve.zzk(0, i10, bArr.length);
        StringBuilder sb = new StringBuilder(zze(i10));
        try {
            zzc(sb, bArr, 0, i10);
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzd = zzd(charSequenceZzg.length());
            byte[] bArr = new byte[iZzd];
            int iZza = zza(bArr, charSequenceZzg);
            if (iZza == iZzd) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzgaq e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
