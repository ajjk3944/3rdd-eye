package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzghv implements zzgeh {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzgeh zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzc = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzghv(zzgtt zzgttVar, zzgeh zzgehVar) throws GeneralSecurityException {
        if (!zzc.contains(zzgttVar.zzi())) {
            throw new IllegalArgumentException(C1154e9.i("Unsupported DEK key type: ", zzgttVar.zzi(), ". Only Tink AEAD key types are supported."));
        }
        this.zzd = zzgttVar.zzi();
        zzgtr zzgtrVarZzb = zzgtt.zzb(zzgttVar);
        zzgtrVarZzb.zza(zzgut.RAW);
        zzgfc.zza(((zzgtt) zzgtrVarZzb.zzbr()).zzaV());
        this.zze = zzgehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zze.zza(bArr3, zzb);
            String str = this.zzd;
            zzgxn zzgxnVar = zzgxn.zzb;
            return ((zzgeh) zzgnj.zza().zzb(zzgnm.zzc().zza(zzgol.zza(str, zzgxn.zzv(bArrZza, 0, bArrZza.length), zzgtn.SYMMETRIC, zzgut.RAW, null), zzgem.zza()), zzgeh.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
