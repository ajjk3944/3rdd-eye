package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcfj implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbxy zza;
    final /* synthetic */ zzcfm zzb;

    public zzcfj(zzcfm zzcfmVar, zzbxy zzbxyVar) {
        this.zza = zzbxyVar;
        this.zzb = zzcfmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzac(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
