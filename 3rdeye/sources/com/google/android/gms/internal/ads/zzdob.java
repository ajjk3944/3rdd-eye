package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdob extends VideoController.VideoLifecycleCallbacks {
    private final zzdim zza;

    public zzdob(zzdim zzdimVar) {
        this.zza = zzdimVar;
    }

    private static com.google.android.gms.ads.internal.client.zzeg zza(zzdim zzdimVar) {
        com.google.android.gms.ads.internal.client.zzed zzedVarZzj = zzdimVar.zzj();
        if (zzedVarZzj == null) {
            return null;
        }
        try {
            return zzedVarZzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzeg zzegVarZza = zza(this.zza);
        if (zzegVarZza == null) {
            return;
        }
        try {
            zzegVarZza.zze();
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to call onVideoEnd()", e4);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzeg zzegVarZza = zza(this.zza);
        if (zzegVarZza == null) {
            return;
        }
        try {
            zzegVarZza.zzg();
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to call onVideoEnd()", e4);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzeg zzegVarZza = zza(this.zza);
        if (zzegVarZza == null) {
            return;
        }
        try {
            zzegVarZza.zzi();
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to call onVideoEnd()", e4);
        }
    }
}
