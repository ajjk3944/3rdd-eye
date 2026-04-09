package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbik;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbxf;
import com.google.android.gms.internal.ads.zzbyy;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzaz {
    private final zzk zza;
    private final zzi zzb;
    private final zzfg zzc;
    private final zzbij zzd;
    private final zzbtl zze;
    private final zzbik zzf;
    private zzbun zzg;
    private final zzl zzh;

    public zzaz(zzk zzkVar, zzi zziVar, zzfg zzfgVar, zzbij zzbijVar, zzbxf zzbxfVar, zzbtl zzbtlVar, zzbik zzbikVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzfgVar;
        this.zzd = zzbijVar;
        this.zze = zzbtlVar;
        this.zzf = zzbikVar;
        this.zzh = zzlVar;
    }

    public static /* bridge */ /* synthetic */ void zzv(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzbb.zzb().zzs(context, zzbb.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbt zzd(Context context, String str, zzbpo zzbpoVar) {
        return (zzbt) new zzaq(this, context, str, zzbpoVar).zzd(context, false);
    }

    public final zzbx zze(Context context, zzr zzrVar, String str, zzbpo zzbpoVar) {
        return (zzbx) new zzam(this, context, zzrVar, str, zzbpoVar).zzd(context, false);
    }

    public final zzbx zzf(Context context, zzr zzrVar, String str, zzbpo zzbpoVar) {
        return (zzbx) new zzao(this, context, zzrVar, str, zzbpoVar).zzd(context, false);
    }

    public final zzck zzg(Context context, zzbpo zzbpoVar) {
        return (zzck) new zzas(this, context, zzbpoVar).zzd(context, false);
    }

    public final zzdw zzh(Context context, zzbpo zzbpoVar) {
        return (zzdw) new zzae(this, context, zzbpoVar).zzd(context, false);
    }

    public final zzbgr zzj(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbgr) new zzaw(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbgx zzk(View view, HashMap map, HashMap map2) {
        return (zzbgx) new zzay(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final zzblf zzn(Context context, zzbpo zzbpoVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzblf) new zzak(this, context, zzbpoVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbth zzo(Context context, zzbpo zzbpoVar) {
        return (zzbth) new zzai(this, context, zzbpoVar).zzd(context, false);
    }

    public final zzbto zzq(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbto) zzacVar.zzd(activity, booleanExtra);
    }

    public final zzbwt zzs(Context context, String str, zzbpo zzbpoVar) {
        return (zzbwt) new zzaa(this, context, str, zzbpoVar).zzd(context, false);
    }

    public final zzbyy zzt(Context context, zzbpo zzbpoVar) {
        return (zzbyy) new zzag(this, context, zzbpoVar).zzd(context, false);
    }
}
