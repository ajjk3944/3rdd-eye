package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzetx {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhm zzd;
    private final zzdsc zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzetx(Context context, Executor executor, Set set, zzfhm zzfhmVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhmVar;
        this.zze = zzdscVar;
    }

    public static /* synthetic */ void zzb(zzetx zzetxVar, long j4, zzetu zzetuVar, Bundle bundle) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - j4;
        if (((Boolean) zzbfe.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfvv.zzc(zzetuVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcu)).booleanValue()) {
                synchronized (zzetxVar) {
                    bundle.putLong("sig" + zzetuVar.zza(), jElapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcm)).booleanValue()) {
            zzdsb zzdsbVarZza = zzetxVar.zze.zza();
            zzdsbVarZza.zzb("action", "lat_ms");
            zzdsbVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdsbVarZza.zzb("lat_id", String.valueOf(zzetuVar.zza()));
            zzdsbVarZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcn)).booleanValue()) {
                synchronized (zzetxVar) {
                    zzetxVar.zzg++;
                }
                zzdsbVarZza.zzb("seq_num", com.google.android.gms.ads.internal.zzv.zzp().zzh().zzd());
                synchronized (zzetxVar) {
                    try {
                        if (zzetxVar.zzg == zzetxVar.zzb.size() && zzetxVar.zzf != 0) {
                            zzetxVar.zzg = 0;
                            String strValueOf = String.valueOf(com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - zzetxVar.zzf);
                            if (zzetuVar.zza() <= 39 || zzetuVar.zza() >= 52) {
                                zzdsbVarZza.zzb("lat_clsg", strValueOf);
                            } else {
                                zzdsbVarZza.zzb("lat_gmssg", strValueOf);
                            }
                        }
                    } finally {
                    }
                }
            }
            zzdsbVarZza.zzk();
        }
    }

    public final A4.a zza(final Object obj, final Bundle bundle, final boolean z10) {
        zzfhb zzfhbVarZza = zzfha.zza(this.zza, 8);
        zzfhbVarZza.zzi();
        Set<zzetu> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbct zzbctVar = zzbdc.zzlW;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).split(StringUtils.COMMA));
        }
        this.zzf = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
            if (obj instanceof zzcut) {
                bundle.putLong(zzdrk.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdrk.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzetu zzetuVar : set) {
            if (!arrayList2.contains(String.valueOf(zzetuVar.zza()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
                A4.a aVarZzb = zzetuVar.zzb();
                final Bundle bundle3 = bundle2;
                aVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzetx.zzb(this.zza, jElapsedRealtime, zzetuVar, bundle3);
                    }
                }, zzcad.zzg);
                arrayList.add(aVarZzb);
                bundle2 = bundle3;
            }
        }
        A4.a aVarZza = zzgdb.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzetw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle4;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzett zzettVar = (zzett) ((A4.a) it.next()).get();
                    if (zzettVar != null) {
                        boolean z11 = z10;
                        zzettVar.zzb(obj2);
                        if (z11) {
                            zzettVar.zza(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
                    if (obj2 instanceof zzcut) {
                        bundle4.putLong(zzdrk.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(zzdrk.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfhp.zza()) {
            zzfhl.zza(aVarZza, this.zzd, zzfhbVarZza);
        }
        return aVarZza;
    }
}
