package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdww implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzdww(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        zzfgs zzfgsVar = (zzfgs) this.zza.zzb();
        final CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzv.zzs().zza((Context) this.zzb.zzb());
        zzfgi zzfgiVarZzi = zzfgc.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerZza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzba));
            }
        }, zzfgm.WEBVIEW_COOKIE, zzfgsVar).zzi(1L, TimeUnit.SECONDS);
        final zzffw zzffwVar = new zzffw() { // from class: com.google.android.gms.internal.ads.zzdwr
            @Override // com.google.android.gms.internal.ads.zzffw
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzfgiVarZzi.zzc(Exception.class, new zzgci(zzffwVar) { // from class: com.google.android.gms.internal.ads.zzfgd
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzgdb.zzh("");
            }
        }).zza();
    }
}
