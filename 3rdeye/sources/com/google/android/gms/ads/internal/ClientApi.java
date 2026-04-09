package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbwd;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdji;
import com.google.android.gms.internal.ads.zzdtm;
import com.google.android.gms.internal.ads.zzejt;
import com.google.android.gms.internal.ads.zzewt;
import com.google.android.gms.internal.ads.zzeyh;
import com.google.android.gms.internal.ads.zzezy;
import com.google.android.gms.internal.ads.zzfbm;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public class ClientApi extends zzcq {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbt zzb(IObjectWrapper iObjectWrapper, String str, zzbpo zzbpoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzejt(zzcgz.zza(context, zzbpoVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbpo zzbpoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewt zzewtVarZzs = zzcgz.zza(context, zzbpoVar, i).zzs();
        zzewtVarZzs.zza(str);
        zzewtVarZzs.zzb(context);
        return zzewtVarZzs.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbpo zzbpoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeyh zzeyhVarZzt = zzcgz.zza(context, zzbpoVar, i).zzt();
        zzeyhVarZzt.zzc(context);
        zzeyhVarZzt.zza(zzrVar);
        zzeyhVarZzt.zzb(str);
        return zzeyhVarZzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbpo zzbpoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezy zzezyVarZzu = zzcgz.zza(context, zzbpoVar, i).zzu();
        zzezyVarZzu.zzc(context);
        zzezyVarZzu.zza(zzrVar);
        zzezyVarZzu.zzb(str);
        return zzezyVarZzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i) {
        return new zzu((Context) ObjectWrapper.unwrap(iObjectWrapper), zzrVar, str, new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzck zzg(IObjectWrapper iObjectWrapper, zzbpo zzbpoVar, int i) {
        return zzcgz.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpoVar, i).zzz();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdb zzh(IObjectWrapper iObjectWrapper, int i) {
        return zzcgz.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdw zzi(IObjectWrapper iObjectWrapper, zzbpo zzbpoVar, int i) {
        return zzcgz.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpoVar, i).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbgr zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdji((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbgx zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdjg((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzblf zzl(IObjectWrapper iObjectWrapper, zzbpo zzbpoVar, int i, zzblc zzblcVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdtm zzdtmVarZzj = zzcgz.zza(context, zzbpoVar, i).zzj();
        zzdtmVarZzj.zzb(context);
        zzdtmVarZzj.zza(zzblcVar);
        return zzdtmVarZzj.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbth zzm(IObjectWrapper iObjectWrapper, zzbpo zzbpoVar, int i) {
        return zzcgz.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpoVar, i).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbto zzn(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new zzw(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new zzw(activity) : new zzag(activity) : new zzac(activity, adOverlayInfoParcelZza) : new zzaj(activity) : new zzai(activity) : new com.google.android.gms.ads.internal.overlay.zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbwd zzo(IObjectWrapper iObjectWrapper, zzbpo zzbpoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbm zzfbmVarZzv = zzcgz.zza(context, zzbpoVar, i).zzv();
        zzfbmVarZzv.zzb(context);
        return zzfbmVarZzv.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbwt zzp(IObjectWrapper iObjectWrapper, String str, zzbpo zzbpoVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbm zzfbmVarZzv = zzcgz.zza(context, zzbpoVar, i).zzv();
        zzfbmVarZzv.zzb(context);
        zzfbmVarZzv.zza(str);
        return zzfbmVarZzv.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbyy zzq(IObjectWrapper iObjectWrapper, zzbpo zzbpoVar, int i) {
        return zzcgz.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpoVar, i).zzp();
    }
}
