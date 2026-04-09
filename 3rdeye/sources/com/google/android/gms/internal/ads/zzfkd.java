package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.wrappers.Wrappers;
import com.singular.sdk.internal.Constants;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfkd {
    private final zzdsc zza;
    private final String zzb;

    public zzfkd(zzdsc zzdscVar, Context context) {
        CharSequence applicationLabel;
        this.zza = zzdscVar;
        zzfrn zzfrnVar = com.google.android.gms.ads.internal.util.zzs.zza;
        try {
            applicationLabel = Wrappers.packageManager(context).getApplicationLabel(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get application name", e4);
            applicationLabel = "";
        }
        this.zzb = applicationLabel.toString();
    }

    private final void zzq(String str, String str2, long j4, int i, int i10, String str3, zzfkl zzfklVar, String str4) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb(str2, Long.toString(j4));
        zzdsbVarZza.zzb("app", this.zzb);
        if (zzfklVar != null) {
            zzdsbVarZza.zzb(Constants.ADMON_AD_UNIT_ID, zzfklVar.zzb());
            zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
            zzdsbVarZza.zzb("pid", zzfklVar.zzc());
        }
        zzdsbVarZza.zzb("action", str);
        if (str3 != null) {
            zzdsbVarZza.zzb("gqi", str3);
        }
        if (i >= 0) {
            zzdsbVarZza.zzb("max_ads", Integer.toString(i));
        }
        if (i10 >= 0) {
            zzdsbVarZza.zzb("cache_size", Integer.toString(i10));
        }
        zzdsbVarZza.zzb("pv", str4);
        zzdsbVarZza.zzj();
    }

    private final void zzr(String str, long j4, String str2, String str3, AdFormat adFormat, int i, int i10, int i11, String str4) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", str);
        zzdsbVarZza.zzb("pat", Long.toString(j4));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdsbVarZza.zzb("max_ads", Integer.toString(i));
        zzdsbVarZza.zzb("cache_size", Integer.toString(i10));
        zzdsbVarZza.zzb("pas", Integer.toString(i11));
        zzdsbVarZza.zzb("pv", "2");
        zzdsbVarZza.zzb(Constants.ADMON_AD_UNIT_ID, str3);
        zzdsbVarZza.zzb("pid", str2);
        zzdsbVarZza.zzj();
    }

    public final void zza(int i, int i10, long j4, zzfkl zzfklVar) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", "cache_resize");
        zzdsbVarZza.zzb("cs_ts", Long.toString(j4));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("orig_ma", Integer.toString(i));
        zzdsbVarZza.zzb("max_ads", Integer.toString(i10));
        zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
        zzdsbVarZza.zzb(Constants.ADMON_AD_UNIT_ID, zzfklVar.zzb());
        zzdsbVarZza.zzb("pid", zzfklVar.zzc());
        zzdsbVarZza.zzb("pv", "1");
        zzdsbVarZza.zzj();
    }

    public final void zzb(long j4, String str, String str2, AdFormat adFormat, int i, int i10) {
        zzr("pd", j4, str, str2, adFormat, i, i10, 1, "2");
    }

    public final void zzc(long j4, AdFormat adFormat, int i) {
        zzr("pda", j4, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzd(long j4, String str, String str2, AdFormat adFormat, int i, int i10) {
        zzr("pgc", j4, str, str2, adFormat, i, i10, 1, "2");
    }

    public final void zze(AdFormat adFormat, long j4, int i) {
        zzr("pgcs", j4, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzf(int i, long j4, String str, String str2, AdFormat adFormat, int i10) {
        zzr("pnav", j4, str, str2, adFormat, i10, i, 1, "2");
    }

    public final void zzg(long j4, String str) {
        zzq("poll_ad", "ppacwe_ts", j4, -1, -1, null, null, "2");
    }

    public final void zzh(int i, int i10, long j4, Long l5, String str, zzfkl zzfklVar, String str2) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("plaac_ts", Long.toString(j4));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("max_ads", Integer.toString(i));
        zzdsbVarZza.zzb("cache_size", Integer.toString(i10));
        zzdsbVarZza.zzb("action", "is_ad_available");
        if (zzfklVar != null) {
            zzdsbVarZza.zzb(Constants.ADMON_AD_UNIT_ID, zzfklVar.zzb());
            zzdsbVarZza.zzb("pid", zzfklVar.zzc());
            zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
        }
        if (l5 != null) {
            zzdsbVarZza.zzb("plaay_ts", Long.toString(l5.longValue()));
        }
        if (str != null) {
            zzdsbVarZza.zzb("gqi", str);
        }
        zzdsbVarZza.zzb("pv", str2);
        zzdsbVarZza.zzj();
    }

    public final void zzi(long j4, String str, zzfkl zzfklVar, int i, int i10, String str2) {
        zzq("paa", "pano_ts", j4, i, i10, str, zzfklVar, str2);
    }

    public final void zzj(long j4, zzfkl zzfklVar, int i, String str) {
        zzq("pae", "paeo_ts", j4, i, 0, null, zzfklVar, str);
    }

    public final void zzk(long j4, zzfkl zzfklVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i, int i10, String str) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", "pftla");
        zzdsbVarZza.zzb("pftlat_ts", Long.toString(j4));
        zzdsbVarZza.zzb("pftlaec", Integer.toString(zzeVar.zza));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
        zzdsbVarZza.zzb("max_ads", Integer.toString(i));
        zzdsbVarZza.zzb("cache_size", Integer.toString(i10));
        zzdsbVarZza.zzb(Constants.ADMON_AD_UNIT_ID, zzfklVar.zzb());
        zzdsbVarZza.zzb("pid", zzfklVar.zzc());
        zzdsbVarZza.zzb("pv", str);
        zzdsbVarZza.zzj();
    }

    public final void zzl(long j4, zzfkl zzfklVar, int i, int i10, String str) {
        zzq("poll_ad", "ppac_ts", j4, i, i10, null, zzfklVar, str);
    }

    public final void zzm(long j4, int i, int i10, String str, zzfkl zzfklVar, String str2) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("ppla_ts", Long.toString(j4));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
        zzdsbVarZza.zzb(Constants.ADMON_AD_UNIT_ID, zzfklVar.zzb());
        zzdsbVarZza.zzb("pid", zzfklVar.zzc());
        zzdsbVarZza.zzb("max_ads", Integer.toString(i));
        zzdsbVarZza.zzb("cache_size", Integer.toString(i10));
        zzdsbVarZza.zzb("action", "poll_ad");
        if (str != null) {
            zzdsbVarZza.zzb("gqi", str);
        }
        zzdsbVarZza.zzb("pv", str2);
        zzdsbVarZza.zzj();
    }

    public final void zzn(long j4, int i, int i10, String str, zzfkl zzfklVar, String str2) {
        zzq("poll_ad", "psvroc_ts", j4, i, i10, str, zzfklVar, str2);
    }

    public final void zzo(Map map, long j4, String str) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", "start_preload");
        zzdsbVarZza.zzb("sp_ts", Long.toString(j4));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdsbVarZza.zzb(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdsbVarZza.zzj();
    }

    public final void zzp(int i, long j4, zzfkl zzfklVar, String str) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", "start_preload");
        zzdsbVarZza.zzb("sp_ts", Long.toString(j4));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
        zzdsbVarZza.zzb(Constants.ADMON_AD_UNIT_ID, zzfklVar.zzb());
        zzdsbVarZza.zzb("pid", zzfklVar.zzc());
        zzdsbVarZza.zzb("max_ads", Integer.toString(i));
        zzdsbVarZza.zzb("pv", str);
        zzdsbVarZza.zzj();
    }
}
