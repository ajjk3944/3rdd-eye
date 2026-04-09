package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcqf implements zzazb {
    private final zzcfe zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcqf(zzcfe zzcfeVar, Executor executor) {
        this.zza = zzcfeVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final synchronized void zzdr(zzaza zzazaVar) {
        final zzcfe zzcfeVar = this.zza;
        if (zzcfeVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmO)).booleanValue()) {
                if (zzazaVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqd
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfeVar.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqe
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfeVar.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
