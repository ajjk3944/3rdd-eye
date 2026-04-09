package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzgxa {
    private static final zzgxa zza = new zzgwx("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzgxa zzb = new zzgwx("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzgxa zzc;

    static {
        new zzgwz("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgwz("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzc = new zzgww("base16()", "0123456789ABCDEF");
    }

    public static zzgxa zzl() {
        return zza;
    }

    public static zzgxa zzm() {
        return zzb;
    }

    public static zzgxa zzn() {
        return zzc;
    }

    public abstract void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy;

    public abstract int zzd(int i10);

    public abstract int zzf(int i10);

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgxa zzh();

    public abstract zzgxa zzi();

    public final String zzj(byte[] bArr, int i10, int i11) {
        zzgrc.zzo(0, i11, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i11));
        try {
            zza(sb, bArr, 0, i11);
            return sb.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzf = zzf(charSequenceZzg.length());
            byte[] bArr = new byte[iZzf];
            int iZzb = zzb(bArr, charSequenceZzg);
            if (iZzb == iZzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZzb];
            System.arraycopy(bArr, 0, bArr2, 0, iZzb);
            return bArr2;
        } catch (zzgwy e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
