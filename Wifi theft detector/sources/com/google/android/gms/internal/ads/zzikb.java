package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class zzikb {
    final LinkedHashMap zza;

    public zzikb(int i10) {
        this.zza = zzikd.zzc(i10);
    }

    public final zzikb zza(Object obj, zzikp zzikpVar) {
        zziko.zza(obj, "key");
        zziko.zza(zzikpVar, "provider");
        this.zza.put(obj, zzikpVar);
        return this;
    }
}
