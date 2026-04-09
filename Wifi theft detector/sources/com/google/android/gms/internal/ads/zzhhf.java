package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public final class zzhhf extends zzhhg {
    public zzhhf(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final zzhhe zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzhhd(bArr, i10);
    }
}
