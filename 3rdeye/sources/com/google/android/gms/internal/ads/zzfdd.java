package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.singular.sdk.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfdd {
    public zzfdd() {
        try {
            zzgfe.zza();
        } catch (GeneralSecurityException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e4.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() throws GeneralSecurityException {
        byte[] byteArray;
        try {
            zzgew zzgewVarZze = zzgew.zze(zzgeq.zza(zzgni.zzb().zza("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgek.zzb(zzgewVarZze, zzgej.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e4.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdrw zzdrwVar) {
        zzgew zzgewVarZzc;
        if (str != null && (zzgewVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzgeh) zzgewVarZzc.zzg(zzgfm.zza(), zzgeh.class)).zza(bArr, bArr2);
                zzdrwVar.zzb().put("ds", "1");
                return new String(bArrZza, Constants.ENCODING);
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e4) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e4.toString()));
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "CryptoUtils.decrypt");
                zzdrwVar.zzb().put("dsf", e4.toString());
            }
        }
        return null;
    }

    private static final zzgew zzc(String str) throws GeneralSecurityException {
        try {
            try {
                return zzgek.zza(zzgei.zzb(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e4.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "CryptoUtils.getHandle");
            return null;
        }
    }
}
