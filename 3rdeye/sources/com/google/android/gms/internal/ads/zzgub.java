package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgub extends zzgyv implements zzhah {
    private static final zzgub zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgzh zzd = zzgyv.zzbK();

    static {
        zzgub zzgubVar = new zzgub();
        zza = zzgubVar;
        zzgyv.zzbZ(zzgub.class, zzgubVar);
    }

    private zzgub() {
    }

    public static zzgtx zzc() {
        return (zzgtx) zza.zzaZ();
    }

    public static zzgub zzg(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
        return (zzgub) zzgyv.zzbu(zza, inputStream, zzgyfVar);
    }

    public static /* synthetic */ void zzi(zzgub zzgubVar, zzgtz zzgtzVar) {
        zzgtzVar.getClass();
        zzgzh zzgzhVar = zzgubVar.zzd;
        if (!zzgzhVar.zzc()) {
            zzgubVar.zzd = zzgyv.zzbL(zzgzhVar);
        }
        zzgubVar.zzd.add(zzgtzVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgtz zzd(int i) {
        return (zzgtz) this.zzd.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgtz.class});
        }
        if (iOrdinal == 3) {
            return new zzgub();
        }
        zzgua zzguaVar = null;
        if (iOrdinal == 4) {
            return new zzgtx(zzguaVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhao zzhaoVar = zzb;
        if (zzhaoVar != null) {
            return zzhaoVar;
        }
        synchronized (zzgub.class) {
            try {
                zzgyqVar = zzb;
                if (zzgyqVar == null) {
                    zzgyqVar = new zzgyq(zza);
                    zzb = zzgyqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgyqVar;
    }

    public final List zzh() {
        return this.zzd;
    }
}
