package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcml {
    zzbun zza;
    zzbun zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzeda zze;
    private final zzdph zzf;
    private final zzgdm zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcml(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzeda zzedaVar, zzdph zzdphVar, zzgdm zzgdmVar, zzgdm zzgdmVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzedaVar;
        this.zzf = zzdphVar;
        this.zzg = zzgdmVar;
        this.zzh = zzgdmVar2;
        this.zzi = scheduledExecutorService;
    }

    public static /* synthetic */ A4.a zzb(zzcml zzcmlVar, final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkw), "10");
            return zzgdb.zzh(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkx), "1");
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkw), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzky))) {
            builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkz));
        }
        return (zzgcs) zzgdb.zzn(zzgcs.zzw(zzcmlVar.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgci() { // from class: com.google.android.gms.internal.ads.zzcmh
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkw);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgdb.zzh(builder2.toString());
            }
        }, zzcmlVar.zzh);
    }

    public static /* synthetic */ A4.a zzc(final zzcml zzcmlVar, String str, final Throwable th) {
        zzcmlVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcme
            @Override // java.lang.Runnable
            public final void run() {
                zzcml.zzg(this.zza, th);
            }
        });
        return zzgdb.zzh(str);
    }

    public static /* synthetic */ A4.a zzd(final zzcml zzcmlVar, Uri.Builder builder, final Throwable th) {
        zzcmlVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmd
            @Override // java.lang.Runnable
            public final void run() {
                zzcml.zzh(this.zza, th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkw), "9");
        return zzgdb.zzh(builder.toString());
    }

    public static /* synthetic */ void zzg(zzcml zzcmlVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkB)).booleanValue()) {
            zzbun zzbunVarZzc = zzbul.zzc(zzcmlVar.zzc);
            zzcmlVar.zzb = zzbunVarZzc;
            zzbunVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbun zzbunVarZza = zzbul.zza(zzcmlVar.zzc);
            zzcmlVar.zza = zzbunVarZza;
            zzbunVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public static /* synthetic */ void zzh(zzcml zzcmlVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkB)).booleanValue()) {
            zzbun zzbunVarZzc = zzbul.zzc(zzcmlVar.zzc);
            zzcmlVar.zzb = zzbunVarZzc;
            zzbunVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzbun zzbunVarZza = zzbul.zza(zzcmlVar.zzc);
            zzcmlVar.zza = zzbunVarZza;
            zzbunVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzku));
    }

    private final A4.a zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzku)) || this.zzd.zzN()) {
                return zzgdb.zzh(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkv), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (zzgcs) zzgdb.zzf((zzgcs) zzgdb.zzn(zzgcs.zzw(this.zze.zza()), new zzgci() { // from class: com.google.android.gms.internal.ads.zzcmf
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final A4.a zza(Object obj) {
                        return zzcml.zzb(this.zza, builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzcmg
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final A4.a zza(Object obj) {
                        return zzcml.zzd(this.zza, builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkw), "11");
            return zzgdb.zzh(builderBuildUpon.toString());
        } catch (Exception e4) {
            return zzgdb.zzg(e4);
        }
    }

    public final A4.a zze(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgdb.zzh(str) : zzgdb.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzcmc
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzcml.zzc(this.zza, str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final void zzi(String str, zzfjq zzfjqVar, Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgdb.zzr(zzgdb.zzo(zzk(str, this.zzf.zza(), random), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkA)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcmk(this, zzfjqVar, str, zzvVar), this.zzg);
    }
}
