package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgwn extends ThreadLocal {
    final /* synthetic */ zzgwo zza;

    public zzgwn(zzgwo zzgwoVar) {
        this.zza = zzgwoVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            zzgwa zzgwaVar = zzgwa.zzb;
            zzgwo zzgwoVar = this.zza;
            Mac mac = (Mac) zzgwaVar.zza(zzgwoVar.zzb);
            mac.init(zzgwoVar.zzc);
            return mac;
        } catch (GeneralSecurityException e4) {
            throw new IllegalStateException(e4);
        }
    }
}
