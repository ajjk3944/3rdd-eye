package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zziw {
    final Context zza;
    zzdj zzb;
    zzfvw zzc;
    zzfvw zzd;
    zzfvw zze;
    zzfvw zzf;
    zzfvw zzg;
    zzfut zzh;
    Looper zzi;
    int zzj;
    zze zzk;
    int zzl;
    boolean zzm;
    zzmi zzn;
    zzmh zzo;
    long zzp;
    long zzq;
    boolean zzr;
    boolean zzs;
    String zzt;
    zzig zzu;

    public zziw(final Context context, zzcek zzcekVar) {
        zzip zzipVar = new zzip(zzcekVar);
        zziq zziqVar = new zziq(context);
        zzfvw zzfvwVar = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzir
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return new zzyu(context);
            }
        };
        zzfvw zzfvwVar2 = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzis
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return new zzij();
            }
        };
        zzit zzitVar = new zzit(context);
        zzfut zzfutVar = new zzfut() { // from class: com.google.android.gms.internal.ads.zziu
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzot((zzdj) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzipVar;
        this.zzd = zziqVar;
        this.zze = zzfvwVar;
        this.zzf = zzfvwVar2;
        this.zzg = zzitVar;
        this.zzh = zzfutVar;
        this.zzi = zzex.zzz();
        this.zzk = zze.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzmi.zzb;
        this.zzo = zzmh.zza;
        float f10 = 0.97f;
        float f11 = 1.03f;
        this.zzu = new zzig(f10, f11, 1000L, 1.0E-7f, zzex.zzs(20L), zzex.zzs(500L), 0.999f, null);
        this.zzb = zzdj.zza;
        this.zzp = 500L;
        this.zzq = 2000L;
        this.zzr = true;
        this.zzt = "";
        this.zzj = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = zzim.zza;
        }
    }

    public static /* synthetic */ zzvg zza(Context context) {
        return new zzuu(context, new zzado());
    }
}
