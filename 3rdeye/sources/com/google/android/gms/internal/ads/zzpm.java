package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzpm extends BroadcastReceiver {
    final /* synthetic */ zzpo zza;

    public /* synthetic */ zzpm(zzpo zzpoVar, zzpn zzpnVar) {
        this.zza = zzpoVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzpo zzpoVar = this.zza;
        zzpoVar.zzj(zzpj.zzd(context, intent, zzpoVar.zzh, zzpoVar.zzg));
    }
}
