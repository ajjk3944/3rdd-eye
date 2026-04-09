package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import m0.C5308a;
import m0.C5316i;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdmz extends zzbhg {
    private final Context zza;
    private final zzdim zzb;
    private zzdjm zzc;
    private zzdih zzd;

    public zzdmz(Context context, zzdim zzdimVar, zzdjm zzdjmVar, zzdih zzdihVar) {
        this.zza = context;
        this.zzb = zzdimVar;
        this.zzc = zzdjmVar;
        this.zzd = zzdihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final com.google.android.gms.ads.internal.client.zzed zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final zzbgk zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final zzbgn zzg(String str) {
        return (zzbgn) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final List zzk() {
        try {
            zzdim zzdimVar = this.zzb;
            C5316i c5316iZzh = zzdimVar.zzh();
            C5316i c5316iZzi = zzdimVar.zzi();
            String[] strArr = new String[c5316iZzh.f44030d + c5316iZzi.f44030d];
            int i = 0;
            for (int i10 = 0; i10 < c5316iZzh.f44030d; i10++) {
                strArr[i] = (String) c5316iZzh.g(i10);
                i++;
            }
            for (int i11 = 0; i11 < c5316iZzi.f44030d; i11++) {
                strArr[i] = (String) c5316iZzi.g(i11);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzl() {
        zzdih zzdihVar = this.zzd;
        if (zzdihVar != null) {
            zzdihVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzm() {
        try {
            String strZzC = this.zzb.zzC();
            if (Objects.equals(strZzC, "Google")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzC)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdih zzdihVar = this.zzd;
                if (zzdihVar != null) {
                    zzdihVar.zzf(strZzC, false);
                }
            }
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzn(String str) {
        zzdih zzdihVar = this.zzd;
        if (zzdihVar != null) {
            zzdihVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzo() {
        zzdih zzdihVar = this.zzd;
        if (zzdihVar != null) {
            zzdihVar.zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zzp(IObjectWrapper iObjectWrapper) throws SecurityException {
        zzdih zzdihVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzu() == null || (zzdihVar = this.zzd) == null) {
            return;
        }
        zzdihVar.zzK((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzq() {
        zzdih zzdihVar = this.zzd;
        if (zzdihVar != null && !zzdihVar.zzX()) {
            return false;
        }
        zzdim zzdimVar = this.zzb;
        return zzdimVar.zzr() != null && zzdimVar.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws SecurityException {
        zzdjm zzdjmVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdjmVar = this.zzc) == null || !zzdjmVar.zzf((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzq().zzar(new zzdmy(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws SecurityException {
        zzdjm zzdjmVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdjmVar = this.zzc) == null || !zzdjmVar.zzg((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzs().zzar(new zzdmy(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final boolean zzt() {
        zzdim zzdimVar = this.zzb;
        zzecz zzeczVarZzu = zzdimVar.zzu();
        if (zzeczVarZzu == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzv.zzC().zzk(zzeczVarZzu.zza());
        if (zzdimVar.zzr() == null) {
            return true;
        }
        zzdimVar.zzr().zzd("onSdkLoaded", new C5308a());
        return true;
    }
}
