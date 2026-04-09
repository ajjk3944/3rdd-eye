package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.singular.sdk.internal.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzenp implements zzett {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final String zzf;
    private final zzcsz zzg;

    public zzenp(Context context, Bundle bundle, String str, String str2, com.google.android.gms.ads.internal.util.zzg zzgVar, String str3, zzcsz zzcszVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzgVar;
        this.zzf = str3;
        this.zzg = zzcszVar;
    }

    private final void zzc(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfP)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzv.zzr();
                bundle.putString("_app_id", com.google.android.gms.ads.internal.util.zzs.zzq(this.zza));
            } catch (RemoteException | RuntimeException e4) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcut) obj).zzb;
        bundle.putBundle("quality_signals", this.zzb);
        zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!this.zze.zzN()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !r0.zzN());
        zzc(bundle);
        String str = this.zzf;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzcsz zzcszVar = this.zzg;
            bundle2.putLong("dload", zzcszVar.zzb(str));
            bundle2.putInt(Constants.REVENUE_CURRENCY_KEY, zzcszVar.zza(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjX)).booleanValue() || com.google.android.gms.ads.internal.zzv.zzp().zza() <= 0) {
            return;
        }
        bundle.putInt("nrwv", com.google.android.gms.ads.internal.zzv.zzp().zza());
    }
}
