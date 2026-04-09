package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.l;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbth;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {
    private final zzbth zza;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzbb.zza().zzo(context, new zzbpk());
    }

    @Override // androidx.work.Worker
    public final l.a doWork() {
        try {
            this.zza.zzh();
            return new l.a.c();
        } catch (RemoteException unused) {
            return new l.a.C0267a();
        }
    }
}
