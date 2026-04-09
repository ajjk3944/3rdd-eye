package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* loaded from: classes2.dex */
final /* synthetic */ class zzfcf implements zzgyw {
    static final /* synthetic */ zzfcf zza = new zzfcf();

    private /* synthetic */ zzfcf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgzo.zza(new zzfch(null, -1)) : zzgzo.zza(new zzfch(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
