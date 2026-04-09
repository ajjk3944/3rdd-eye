package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbbw {
    private zzbbl zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbbw(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbbw zzbbwVar) {
        synchronized (zzbbwVar.zzd) {
            try {
                zzbbl zzbblVar = zzbbwVar.zza;
                if (zzbblVar == null) {
                    return;
                }
                zzbblVar.disconnect();
                zzbbwVar.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future zzc(zzbbm zzbbmVar) {
        zzbbq zzbbqVar = new zzbbq(this);
        zzbbu zzbbuVar = new zzbbu(this, zzbbmVar, zzbbqVar);
        zzbbv zzbbvVar = new zzbbv(this, zzbbqVar);
        synchronized (this.zzd) {
            zzbbl zzbblVar = new zzbbl(this.zzc, com.google.android.gms.ads.internal.zzv.zzv().zzb(), zzbbuVar, zzbbvVar);
            this.zza = zzbblVar;
            zzbblVar.checkAvailabilityAndConnect();
        }
        return zzbbqVar;
    }
}
