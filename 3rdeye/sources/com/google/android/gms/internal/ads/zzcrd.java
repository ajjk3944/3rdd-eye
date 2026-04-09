package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcrd implements zzegu {
    public final List zza;

    public zzcrd(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzegu
    public final void zzq() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgdb.zzr((A4.a) it.next(), new zzcrc(this), zzgdt.zzc());
        }
    }

    public zzcrd(zzcqv zzcqvVar) {
        this.zza = Collections.singletonList(zzgdb.zzh(zzcqvVar));
    }
}
