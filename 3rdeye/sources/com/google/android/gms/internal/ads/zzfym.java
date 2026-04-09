package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfym extends zzfwf {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfvf zzb;

    public zzfym(Iterator it, zzfvf zzfvfVar) {
        this.zza = it;
        this.zzb = zzfvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final Object zza() {
        zzfvf zzfvfVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzfvfVar = this.zzb;
            next = it.next();
        } while (!zzfvfVar.zza(next));
        return next;
    }
}
