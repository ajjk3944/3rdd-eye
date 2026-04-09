package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.singular.sdk.internal.SingularParamsBase;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdhe implements zzbkd {
    private final WeakReference zza;
    private final zzfjq zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private final zzfhm zzd;

    public /* synthetic */ zzdhe(zzdhg zzdhgVar, zzfjq zzfjqVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfhm zzfhmVar, zzdhf zzdhfVar) {
        this.zza = new WeakReference(zzdhgVar);
        this.zzb = zzfjqVar;
        this.zzc = zzvVar;
        this.zzd = zzfhmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzdhg zzdhgVar = (zzdhg) this.zza.get();
        String str = (String) map.get(SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY);
        if (zzdhgVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzd(str, this.zzc, this.zzd, zzdhgVar.zzD);
    }
}
