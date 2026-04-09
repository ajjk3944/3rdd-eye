package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfnl extends AsyncTask {
    private zzfnm zza;
    protected final zzfnd zzd;

    public zzfnl(zzfnd zzfndVar) {
        this.zzd = zzfndVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfnm zzfnmVar = this.zza;
        if (zzfnmVar != null) {
            zzfnmVar.zza(this);
        }
    }

    public final void zzb(zzfnm zzfnmVar) {
        this.zza = zzfnmVar;
    }
}
