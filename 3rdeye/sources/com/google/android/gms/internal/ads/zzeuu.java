package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeuu implements zzetu {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbzh zzg;

    public zzeuu(zzbzh zzbzhVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z10, boolean z11) {
        this.zzg = zzbzhVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z10;
        this.zzf = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ com.google.android.gms.internal.ads.zzeuv zzc(com.google.android.gms.internal.ads.zzeuu r7, com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            com.google.android.gms.internal.ads.zzfrr r0 = new com.google.android.gms.internal.ads.zzfrr
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L1c
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzdr
            com.google.android.gms.internal.ads.zzbda r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6d
        L1c:
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzds
            com.google.android.gms.internal.ads.zzbda r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6d
        L2f:
            android.content.Context r0 = r7.zza     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            com.google.android.gms.internal.ads.zzfrv r1 = com.google.android.gms.internal.ads.zzfrv.zzj(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzdx     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            com.google.android.gms.internal.ads.zzbda r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            java.lang.Object r0 = r4.zzb(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            boolean r6 = r7.zzf     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            com.google.android.gms.internal.ads.zzfrr r0 = r1.zzi(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5d
            goto L6d
        L5a:
            r0 = move-exception
        L5b:
            r7 = r0
            goto L5f
        L5d:
            r0 = move-exception
            goto L5b
        L5f:
            java.lang.String r0 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.zzbzq r1 = com.google.android.gms.ads.internal.zzv.zzp()
            r1.zzw(r7, r0)
            com.google.android.gms.internal.ads.zzfrr r0 = new com.google.android.gms.internal.ads.zzfrr
            r0.<init>()
        L6d:
            com.google.android.gms.internal.ads.zzeuv r7 = new com.google.android.gms.internal.ads.zzeuv
            r1 = 0
            r7.<init>(r8, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuu.zzc(com.google.android.gms.internal.ads.zzeuu, com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzeuv");
    }

    public static /* synthetic */ zzeuv zzd(zzeuu zzeuuVar, Throwable th) {
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        ContentResolver contentResolver = zzeuuVar.zza.getContentResolver();
        return new zzeuv(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfrr());
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        zzgcs zzgcsVarZzw = zzgcs.zzw(this.zzg.zza(this.zza, this.zzd));
        zzfut zzfutVar = new zzfut() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzeuu.zzc(this.zza, (AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzgcs) zzgdb.zze((zzgcs) zzgdb.zzo((zzgcs) zzgdb.zzm(zzgcsVarZzw, zzfutVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbg)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzeut
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzeuu.zzd(this.zza, (Throwable) obj);
            }
        }, executor);
    }
}
