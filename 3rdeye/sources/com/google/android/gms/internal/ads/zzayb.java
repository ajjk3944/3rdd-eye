package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzayb extends zzayi {
    public zzayb(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10) {
        super(zzawvVar, "ZfusKpZJ8SBLRBp0x6BWNud7pIzhvWIkVd0V0uxTu84aE2cfWFwKn+FMoh4smXgk", "VN0WZ1yYObu9EYHkfC3f48JbFLjOwnUEkH1X8nPNLSU=", zzasrVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzawq zzawqVar = new zzawq((String) this.zze.invoke(null, new Object[0]));
            zzasrVar.zzp(zzawqVar.zza.longValue());
            zzasrVar.zzq(zzawqVar.zzb.longValue());
        }
    }
}
