package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzdya implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcai zza = new zzcai();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbvo zze;
    protected zzbut zzf;

    public static void zzc(Context context, A4.a aVar, Executor executor) {
        if (((Boolean) zzbeu.zzj.zze()).booleanValue() || ((Boolean) zzbeu.zzh.zze()).booleanValue()) {
            zzgdb.zzr(aVar, new zzdxx(context), executor);
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Disconnected from remote ad request service.");
        this.zza.zzd(new zzdyp(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                    this.zzf.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
