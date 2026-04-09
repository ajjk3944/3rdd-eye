package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbul;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
final class zzau extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaz zzb;

    public zzau(zzaz zzazVar, Context context) {
        this.zza = context;
        this.zzb = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzv(this.zza, "mobile_ads_settings");
        return new zzfo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcrVar) throws RemoteException {
        return zzcrVar.zzh(ObjectWrapper.wrap(this.zza), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        zzbdc.zza(context);
        if (!((Boolean) zzbd.zzc().zzb(zzbdc.zzkU)).booleanValue()) {
            return this.zzb.zzc.zza(this.zza);
        }
        try {
            IBinder iBinderZze = ((zzdc) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzat
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof zzdc ? (zzdc) iInterfaceQueryLocalInterface : new zzdc(iBinder);
                }
            })).zze(ObjectWrapper.wrap(context), ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzdb ? (zzdb) iInterfaceQueryLocalInterface : new zzcz(iBinderZze);
        } catch (RemoteException e4) {
            e = e4;
            zzaz zzazVar = this.zzb;
            zzazVar.zzg = zzbul.zza(this.zza);
            zzazVar.zzg.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e10) {
            e = e10;
            zzaz zzazVar2 = this.zzb;
            zzazVar2.zzg = zzbul.zza(this.zza);
            zzazVar2.zzg.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e11) {
            e = e11;
            zzaz zzazVar22 = this.zzb;
            zzazVar22.zzg = zzbul.zza(this.zza);
            zzazVar22.zzg.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
