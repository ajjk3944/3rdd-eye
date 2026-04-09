package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes2.dex */
final /* synthetic */ class zzfbq implements zzgyw {
    static final /* synthetic */ zzfbq zza = new zzfbq();

    private /* synthetic */ zzfbq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
        androidx.privacysandbox.ads.adservices.topics.c cVar = (androidx.privacysandbox.ads.adservices.topics.c) obj;
        if (cVar == null) {
            return zzgzo.zza(new zzfbs("", 1, null));
        }
        zzifk zzifkVarZzc = zzifl.zzc();
        for (androidx.privacysandbox.ads.adservices.topics.e eVar : cVar.a()) {
            zzifi zzifiVarZzc = zzifj.zzc();
            zzifiVarZzc.zza(eVar.c());
            zzifiVarZzc.zzb(eVar.a());
            zzifiVarZzc.zzc(eVar.b());
            zzifkVarZzc.zza((zzifj) zzifiVarZzc.zzbu());
        }
        return zzgzo.zza(new zzfbs(Base64.encodeToString(((zzifl) zzifkVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
