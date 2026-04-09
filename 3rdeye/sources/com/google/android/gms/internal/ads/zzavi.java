package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzavi implements zzfps {
    final /* synthetic */ zzfnu zza;

    public zzavi(zzavk zzavkVar, zzfnu zzfnuVar) {
        this.zza = zzfnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
