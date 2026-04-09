package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcdm {
    public final com.google.common.util.concurrent.a zza(Context context, int i10) {
        zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzy(context)) {
            zzcei.zza.execute(new zzcdl(this, context, zzcenVar));
        }
        return zzcenVar;
    }
}
