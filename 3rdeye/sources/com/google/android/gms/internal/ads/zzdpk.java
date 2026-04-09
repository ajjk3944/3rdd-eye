package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdpk implements zzcwm {
    private final zzcfe zza;

    public zzdpk(zzcfe zzcfeVar) {
        this.zza = zzcfeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdj(Context context) {
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            zzcfeVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdl(Context context) {
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            zzcfeVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdm(Context context) {
        zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            zzcfeVar.onResume();
        }
    }
}
