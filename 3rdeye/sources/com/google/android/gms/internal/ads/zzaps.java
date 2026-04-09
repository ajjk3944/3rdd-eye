package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaps {
    private final Executor zza;

    public zzaps(Handler handler) {
        this.zza = new zzapq(this, handler);
    }

    public final void zza(zzaqb zzaqbVar, zzaqk zzaqkVar) {
        zzaqbVar.zzm("post-error");
        ((zzapq) this.zza).zza.post(new zzapr(zzaqbVar, zzaqh.zza(zzaqkVar), null));
    }

    public final void zzb(zzaqb zzaqbVar, zzaqh zzaqhVar, Runnable runnable) {
        zzaqbVar.zzq();
        zzaqbVar.zzm("post-response");
        ((zzapq) this.zza).zza.post(new zzapr(zzaqbVar, zzaqhVar, runnable));
    }
}
