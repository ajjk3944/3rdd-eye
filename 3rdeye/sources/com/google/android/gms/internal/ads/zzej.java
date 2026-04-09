package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzej extends BroadcastReceiver {
    final /* synthetic */ zzel zza;

    public /* synthetic */ zzej(zzel zzelVar, zzek zzekVar) {
        this.zza = zzelVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzei
            @Override // java.lang.Runnable
            public final void run() {
                zzel.zzd(this.zza.zza, context);
            }
        });
    }
}
