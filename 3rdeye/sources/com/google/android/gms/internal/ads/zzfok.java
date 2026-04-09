package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzfok {
    private final Context zza;
    private final Looper zzb;

    public zzfok(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfov zzfovVarZza = zzfoy.zza();
        Context context = this.zza;
        zzfovVarZza.zza(context.getPackageName());
        zzfovVarZza.zzc(2);
        zzfos zzfosVarZza = zzfou.zza();
        zzfosVarZza.zza(str);
        zzfosVarZza.zzb(2);
        zzfovVarZza.zzb(zzfosVarZza);
        new zzfol(context, this.zzb, (zzfoy) zzfovVarZza.zzbr()).zza();
    }
}
