package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzfg extends RemoteCreator {
    public zzfg() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzdc ? (zzdc) iInterfaceQueryLocalInterface : new zzdc(iBinder);
    }

    public final zzdb zza(Context context) {
        try {
            IBinder iBinderZze = ((zzdc) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzdb ? (zzdb) iInterfaceQueryLocalInterface : new zzcz(iBinderZze);
        } catch (RemoteException e4) {
            e = e4;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e10) {
            e = e10;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
