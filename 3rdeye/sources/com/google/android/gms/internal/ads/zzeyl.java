package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeyl implements zzezk {
    private zzcux zza;
    private final Executor zzb = zzgdt.zzc();

    public final zzcux zza() {
        return this.zza;
    }

    public final A4.a zzb(zzezl zzezlVar, zzezj zzezjVar, zzcux zzcuxVar) {
        zzcuw zzcuwVarZza = zzezjVar.zza(zzezlVar.zzb);
        zzcuwVarZza.zzb(new zzezo(true));
        zzcux zzcuxVar2 = (zzcux) zzcuwVarZza.zzh();
        this.zza = zzcuxVar2;
        final zzcrz zzcrzVarZzb = zzcuxVar2.zzb();
        final zzfek zzfekVar = new zzfek();
        zzgcs zzgcsVarZzw = zzgcs.zzw(zzcrzVarZzb.zzi());
        zzgci zzgciVar = new zzgci(this) { // from class: com.google.android.gms.internal.ads.zzeyj
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                zzfcf zzfcfVar = (zzfcf) obj;
                zzfekVar.zzb = zzfcfVar;
                Iterator it = zzfcfVar.zzb.zza.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfbt) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return zzcrzVarZzb.zzh(zzgdb.zzh(zzfcfVar));
                    }
                }
                return zzgdb.zzh(null);
            }
        };
        Executor executor = this.zzb;
        return (zzgcs) zzgdb.zzm((zzgcs) zzgdb.zzn(zzgcsVarZzw, zzgciVar, executor), new zzfut() { // from class: com.google.android.gms.internal.ads.zzeyk
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                zzfek zzfekVar2 = zzfekVar;
                zzfekVar2.zzc = (zzcqv) obj;
                return zzfekVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* bridge */ /* synthetic */ A4.a zzc(zzezl zzezlVar, zzezj zzezjVar, Object obj) {
        return zzb(zzezlVar, zzezjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
