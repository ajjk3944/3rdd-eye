package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcwn implements zzens {
    public final List zza;

    public zzcwn(List list) {
        this.zza = list;
    }

    public static zzekg zza(@NonNull zzemm zzemmVar) {
        return new zzekh(zzemmVar, zzcwm.zza);
    }

    public static zzekg zzb(@NonNull zzekg zzekgVar) {
        return new zzekh(zzekgVar, zzcwl.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzens
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgzo.zzr((com.google.common.util.concurrent.a) it.next(), new zzcwk(this), zzhaf.zza());
        }
    }

    public zzcwn(zzcwf zzcwfVar) {
        this.zza = Collections.singletonList(zzgzo.zza(zzcwfVar));
    }
}
