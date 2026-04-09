package com.google.android.gms.internal.ads;

import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzhln {
    public static final /* synthetic */ int zza = 0;

    static {
        Charset.forName(C.UTF8_NAME);
    }

    public static final zzhye zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(cCharAt);
                throw new zzhlm(sb.toString());
            }
            bArr[i10] = (byte) cCharAt;
        }
        return zzhye.zza(bArr);
    }

    public static final zzhye zzb(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(cCharAt);
                throw new GeneralSecurityException(sb.toString());
            }
            bArr[i10] = (byte) cCharAt;
        }
        return zzhye.zza(bArr);
    }

    public static boolean zzc() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    @Nullable
    public static Integer zzd() {
        if (zzc()) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zze(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }
}
