package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgyf {
    static final zzgyf zza = new zzgyf(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgyf zzd;
    private final Map zze;

    public zzgyf() {
        this.zze = new HashMap();
    }

    public static zzgyf zza() {
        int i = zzhaq.zza;
        return zza;
    }

    public static zzgyf zzb() {
        zzgyf zzgyfVar = zzd;
        if (zzgyfVar != null) {
            return zzgyfVar;
        }
        synchronized (zzgyf.class) {
            try {
                zzgyf zzgyfVar2 = zzd;
                if (zzgyfVar2 != null) {
                    return zzgyfVar2;
                }
                int i = zzhaq.zza;
                zzgyf zzgyfVarZzb = zzgyn.zzb(zzgyf.class);
                zzd = zzgyfVarZzb;
                return zzgyfVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzgyt zzc(zzhag zzhagVar, int i) {
        return (zzgyt) this.zze.get(new zzgye(zzhagVar, i));
    }

    public zzgyf(boolean z10) {
        this.zze = Collections.EMPTY_MAP;
    }
}
