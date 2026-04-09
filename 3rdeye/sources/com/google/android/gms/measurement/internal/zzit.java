package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzit implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzjs zzf;

    public zzit(zzjs zzjsVar, String str, String str2, zzq zzqVar, boolean z10, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjsVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = z10;
        this.zze = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e4;
        Bundle bundle2 = new Bundle();
        try {
            try {
                zzjs zzjsVar = this.zzf;
                zzee zzeeVar = zzjsVar.zzb;
                if (zzeeVar == null) {
                    zzjsVar.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                    this.zzf.zzs.zzv().zzR(this.zze, bundle2);
                    return;
                }
                Preconditions.checkNotNull(this.zzc);
                List<zzlc> listZzh = zzeeVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
                bundle = new Bundle();
                if (listZzh != null) {
                    for (zzlc zzlcVar : listZzh) {
                        String str = zzlcVar.zze;
                        if (str != null) {
                            bundle.putString(zzlcVar.zzb, str);
                        } else {
                            Long l5 = zzlcVar.zzd;
                            if (l5 != null) {
                                bundle.putLong(zzlcVar.zzb, l5.longValue());
                            } else {
                                Double d10 = zzlcVar.zzg;
                                if (d10 != null) {
                                    bundle.putDouble(zzlcVar.zzb, d10.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.zzf.zzQ();
                    this.zzf.zzs.zzv().zzR(this.zze, bundle);
                } catch (RemoteException e10) {
                    e4 = e10;
                    this.zzf.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.zza, e4);
                    this.zzf.zzs.zzv().zzR(this.zze, bundle);
                }
            } catch (RemoteException e11) {
                bundle = bundle2;
                e4 = e11;
            } catch (Throwable th) {
                th = th;
                this.zzf.zzs.zzv().zzR(this.zze, bundle2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bundle2 = bundle;
            this.zzf.zzs.zzv().zzR(this.zze, bundle2);
            throw th;
        }
    }
}
