package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.singular.sdk.internal.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzesi implements zzett {
    private final String zza;
    private final Integer zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzesi(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcut) obj).zzb;
        zzfdc.zzc(bundle, Constants.REVENUE_PRODUCT_NAME_KEY, this.zza);
        zzfdc.zzc(bundle, "dl", this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        zzfdc.zzc(bundle, Constants.REVENUE_PRODUCT_NAME_KEY, this.zza);
        Integer num = this.zzb;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        zzfdc.zzc(bundle, "vnm", this.zzc);
        zzfdc.zzc(bundle, "dl", this.zzd);
        zzfdc.zzc(bundle, "ins_pn", this.zze);
        zzfdc.zzc(bundle, "ini_pn", this.zzf);
    }
}
