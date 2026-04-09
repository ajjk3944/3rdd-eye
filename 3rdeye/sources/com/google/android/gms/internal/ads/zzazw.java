package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzazw implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbaa zzb;

    public zzazw(zzbaa zzbaaVar, View view) {
        this.zza = view;
        this.zzb = zzbaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
