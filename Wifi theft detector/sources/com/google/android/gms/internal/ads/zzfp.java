package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class zzfp {
    private boolean zza;

    public zzfp(Context context, Looper looper, zzdn zzdnVar) {
        context.getApplicationContext();
        zzdnVar.zzd(looper, null);
        zzdnVar.zzd(Looper.getMainLooper(), null);
    }

    public final void zza(boolean z10) {
        if (this.zza == z10) {
            return;
        }
        this.zza = z10;
    }
}
