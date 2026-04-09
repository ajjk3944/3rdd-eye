package com.google.android.recaptcha.internal;

import Ii.AbstractC3063k;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.zza;
        AbstractC3063k.d(zzesVar.zzd, null, null, new zzeq(zzesVar, null), 3, null);
    }
}
