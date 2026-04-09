package com.google.android.gms.internal.ads;

import B4.g;
import android.net.Uri;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfjh {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzgdn zzc;
    private final zzfji zzd;

    public zzfjh(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzgdn zzgdnVar, zzfji zzfjiVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzgdnVar;
        this.zzd = zzfjiVar;
    }

    public static /* synthetic */ A4.a zzc(zzfjh zzfjhVar, int i, long j4, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzgdb.zzh(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = zzfjhVar.zza;
        long jZzb = zzxVar.zzb();
        if (i != 1) {
            jZzb = (long) (zzxVar.zza() * j4);
        }
        return zzfjhVar.zze(str, jZzb, i + 1);
    }

    private final A4.a zze(final String str, final long j4, final int i) {
        final String strO;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i > zzxVar.zzc()) {
            zzfji zzfjiVar = this.zzd;
            if (zzfjiVar == null || !zzxVar.zzd()) {
                return zzgdb.zzh(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfjiVar.zza(str, "", 2);
            return zzgdb.zzh(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziO)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i));
            strO = g.o(String.valueOf(builderClearQuery.build()), "&", encodedQuery);
        } else {
            strO = str;
        }
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzfjg
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzfjh.zzc(this.zza, i, j4, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j4 == 0) {
            zzgdn zzgdnVar = this.zzc;
            return zzgdb.zzn(zzgdnVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzb.zza(strO);
                }
            }), zzgciVar, zzgdnVar);
        }
        zzgdn zzgdnVar2 = this.zzc;
        return zzgdb.zzn(zzgdnVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfje
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb.zza(strO);
            }
        }, j4, TimeUnit.MILLISECONDS), zzgciVar, zzgdnVar2);
    }

    public final A4.a zzd(String str) {
        try {
            return zze(str, 0L, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return zzgdb.zzh(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
        }
    }
}
