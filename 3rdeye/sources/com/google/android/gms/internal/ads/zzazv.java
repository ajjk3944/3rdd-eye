package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzazv {
    private final Object zza = new Object();
    private zzazt zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            try {
                zzazt zzaztVar = this.zzb;
                if (zzaztVar == null) {
                    return null;
                }
                return zzaztVar.zza();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            try {
                zzazt zzaztVar = this.zzb;
                if (zzaztVar == null) {
                    return null;
                }
                return zzaztVar.zzb();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzazu zzazuVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzazt();
                }
                this.zzb.zzf(zzazuVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Can not cast Context to Application");
                    } else {
                        if (this.zzb == null) {
                            this.zzb = new zzazt();
                        }
                        this.zzb.zzg(application, context);
                        this.zzc = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(zzazu zzazuVar) {
        synchronized (this.zza) {
            try {
                zzazt zzaztVar = this.zzb;
                if (zzaztVar == null) {
                    return;
                }
                zzaztVar.zzh(zzazuVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
