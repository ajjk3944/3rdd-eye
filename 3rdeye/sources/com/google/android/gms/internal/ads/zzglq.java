package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzglq implements zzgeh {
    private static final ThreadLocal zza = new zzglp();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzglo] */
    public static zzgeh zzb(zzghd zzghdVar) throws GeneralSecurityException {
        return zzgkg.zzc(zzghdVar, new Object() { // from class: com.google.android.gms.internal.ads.zzglo
        });
    }

    public static /* synthetic */ Cipher zzc() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e4) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
