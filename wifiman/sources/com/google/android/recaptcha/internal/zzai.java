package com.google.android.recaptcha.internal;

import Ii.AbstractC3063k;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzan zzanVar = this.zza;
        AbstractC3063k.d(zzanVar.zzb, null, null, new zzaj(zzanVar, null), 3, null);
    }
}
