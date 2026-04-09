package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfgc {
    public static final zzfgi zza(Callable callable, Object obj, zzfgk zzfgkVar) {
        return zzb(callable, zzfgkVar.zzb, obj, zzfgkVar);
    }

    public static final zzfgi zzb(Callable callable, zzgdm zzgdmVar, Object obj, zzfgk zzfgkVar) {
        return new zzfgi(zzfgkVar, obj, zzfgk.zza, Collections.EMPTY_LIST, zzgdmVar.zzb(callable));
    }

    public static final zzfgi zzc(A4.a aVar, Object obj, zzfgk zzfgkVar) {
        return new zzfgi(zzfgkVar, obj, zzfgk.zza, Collections.EMPTY_LIST, aVar);
    }

    public static final zzfgi zzd(final zzffx zzffxVar, zzgdm zzgdmVar, Object obj, zzfgk zzfgkVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfgb
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzffxVar.zza();
                return null;
            }
        }, zzgdmVar, obj, zzfgkVar);
    }
}
