package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbtj;
import com.google.android.gms.internal.ads.zzbtk;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
final class zzai extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpo zzb;

    public zzai(zzaz zzazVar, Context context, zzbpo zzbpoVar) {
        this.zza = context;
        this.zzb = zzbpoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb(zzcr zzcrVar) throws RemoteException {
        return zzcrVar.zzm(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        try {
            return ((zzbtk) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzah
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    return zzbtj.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(context), this.zzb, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
