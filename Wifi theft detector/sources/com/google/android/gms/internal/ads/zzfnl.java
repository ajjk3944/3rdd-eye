package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfnl {
    final /* synthetic */ zzfnm zza;
    private final Object zzb;

    @Nullable
    private final String zzc;
    private final com.google.common.util.concurrent.a zzd;
    private final List zze;
    private final com.google.common.util.concurrent.a zzf;

    public /* synthetic */ zzfnl(zzfnm zzfnmVar, Object obj, String str, com.google.common.util.concurrent.a aVar, List list, com.google.common.util.concurrent.a aVar2, byte[] bArr) {
        this(zzfnmVar, obj, null, aVar, list, aVar2);
    }

    public final zzfnl zza(String str) {
        return new zzfnl(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfnl zzb(final zzfmu zzfmuVar) {
        return zzc(new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfnk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
                return zzgzo.zza(zzfmuVar.zza(obj));
            }
        });
    }

    public final zzfnl zzc(zzgyw zzgywVar) {
        return zzd(zzgywVar, this.zza.zze());
    }

    public final zzfnl zzd(zzgyw zzgywVar, Executor executor) {
        return new zzfnl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgzo.zzj(this.zzf, zzgywVar, executor));
    }

    public final zzfnl zze(final com.google.common.util.concurrent.a aVar) {
        return zzd(new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfnh
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
                return aVar;
            }
        }, zzcei.zzg);
    }

    public final zzfnl zzf(Class cls, final zzfmu zzfmuVar) {
        return zzg(cls, new zzgyw(zzfmuVar) { // from class: com.google.android.gms.internal.ads.zzfni
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
                return zzgzo.zza("");
            }
        });
    }

    public final zzfnl zzg(Class cls, zzgyw zzgywVar) {
        zzfnm zzfnmVar = this.zza;
        zzgzy zzgzyVarZze = zzfnmVar.zze();
        return new zzfnl(zzfnmVar, this.zzb, this.zzc, this.zzd, this.zze, zzgzo.zzh(this.zzf, cls, zzgywVar, zzgzyVarZze));
    }

    public final zzfnl zzh(long j10, TimeUnit timeUnit) {
        zzfnm zzfnmVar = this.zza;
        ScheduledExecutorService scheduledExecutorServiceZzf = zzfnmVar.zzf();
        return new zzfnl(zzfnmVar, this.zzb, this.zzc, this.zzd, this.zze, zzgzo.zzi(this.zzf, j10, timeUnit, scheduledExecutorServiceZzf));
    }

    public final zzfnb zzi() {
        Object obj = this.zzb;
        String strZzc = this.zzc;
        if (strZzc == null) {
            strZzc = this.zza.zzc(obj);
        }
        final zzfnb zzfnbVar = new zzfnb(obj, strZzc, this.zzf);
        this.zza.zzg().zza(zzfnbVar);
        com.google.common.util.concurrent.a aVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzg().zzb(zzfnbVar);
            }
        };
        zzgzy zzgzyVar = zzcei.zzg;
        aVar.addListener(runnable, zzgzyVar);
        zzgzo.zzr(zzfnbVar, new zzfng(this, zzfnbVar), zzgzyVar);
        return zzfnbVar;
    }

    public final zzfnl zzj(Object obj) {
        return this.zza.zza(obj, zzi());
    }

    private zzfnl(zzfnm zzfnmVar, Object obj, String str, com.google.common.util.concurrent.a aVar, List list, com.google.common.util.concurrent.a aVar2) {
        Objects.requireNonNull(zzfnmVar);
        this.zza = zzfnmVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = aVar;
        this.zze = list;
        this.zzf = aVar2;
    }
}
