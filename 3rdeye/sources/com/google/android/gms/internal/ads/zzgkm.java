package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgkm extends ThreadLocal {
    public static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzgwa.zza.zza("ChaCha20-Poly1305");
            if (zzgkn.zzf(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
