package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfog implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfpe zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfog(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfpe zzfpeVar = new zzfpe(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfpeVar;
        this.zzd = new LinkedBlockingQueue();
        zzfpeVar.checkAvailabilityAndConnect();
    }

    public static zzato zza() {
        zzasr zzasrVarZza = zzato.zza();
        zzasrVarZza.zzB(32768L);
        return (zzato) zzasrVarZza.zzbr();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfpj zzfpjVarZzd = zzd();
        if (zzfpjVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfpjVarZzd.zze(new zzfpf(this.zzb, this.zzc)).zza());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    zzc();
                    this.zze.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.zzd.put(zza());
            }
            zzc();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) throws InterruptedException {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) throws InterruptedException {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzato zzb(int i) {
        zzato zzatoVar;
        try {
            zzatoVar = (zzato) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzatoVar = null;
        }
        return zzatoVar == null ? zza() : zzatoVar;
    }

    public final void zzc() {
        zzfpe zzfpeVar = this.zza;
        if (zzfpeVar != null) {
            if (zzfpeVar.isConnected() || zzfpeVar.isConnecting()) {
                zzfpeVar.disconnect();
            }
        }
    }

    public final zzfpj zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
