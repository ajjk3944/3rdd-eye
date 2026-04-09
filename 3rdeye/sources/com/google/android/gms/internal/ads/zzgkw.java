package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgkw extends zzgkx {
    public zzgkw(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final zzgkv zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgku(bArr, i);
    }
}
