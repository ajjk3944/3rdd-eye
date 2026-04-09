package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfzd implements zzikg {
    private final zzikp zza;

    private zzfzd(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzfzd zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfzd(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzcmh) this.zza).zza();
        zzfzh coroutineScopeProvider = zzcml.zzc();
        kotlin.jvm.internal.p.e(context, "context");
        kotlin.jvm.internal.p.e(coroutineScopeProvider, "coroutineScopeProvider");
        androidx.datastore.core.d dVarB = androidx.datastore.core.e.b(androidx.datastore.core.e.f2924a, zzfzb.zza, null, null, coroutineScopeProvider.zza(), new l9.a() { // from class: com.google.android.gms.internal.ads.zzfzc
            @Override // l9.a
            public final /* synthetic */ Object invoke() {
                return a1.a.a(context, "ad_quality_data.pb");
            }
        }, 6, null);
        zziko.zzb(dVarB);
        return dVarB;
    }
}
