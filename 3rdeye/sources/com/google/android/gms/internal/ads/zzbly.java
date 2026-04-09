package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import g0.C4356c;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbly implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ zzbma zzb;

    public zzbly(zzbma zzbmaVar, zzcai zzcaiVar) {
        this.zza = zzcaiVar;
        this.zzb = zzbmaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zza.zzp());
        } catch (DeadObjectException e4) {
            this.zza.zzd(e4);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException(C4356c.h(i, "onConnectionSuspended: ")));
    }
}
