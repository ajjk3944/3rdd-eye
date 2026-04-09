package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicBoolean;
import s.f;
import s.h;
import s.i;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbeb extends h {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdsc zzd;
    private i zze;
    private f zzf;

    public static /* synthetic */ void zzb(zzbeb zzbebVar, int i) {
        zzdsc zzdscVar = zzbebVar.zzd;
        if (zzdscVar != null) {
            zzdsb zzdsbVarZza = zzdscVar.zza();
            zzdsbVarZza.zzb("action", "cct_nav");
            zzdsbVarZza.zzb("cct_navs", String.valueOf(i));
            zzdsbVarZza.zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(Context context) {
        String strB;
        if (this.zzf != null || context == null || (strB = f.b(context, null, false)) == null || strB.equals(context.getPackageName())) {
            return;
        }
        f.a(context, strB, this);
    }

    @Override // s.h
    public final void onCustomTabsServiceConnected(ComponentName componentName, f fVar) {
        this.zzf = fVar;
        fVar.getClass();
        try {
            fVar.f45883a.r();
        } catch (RemoteException unused) {
        }
        this.zze = fVar.c(new zzbea(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final i zza() {
        if (this.zze == null) {
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdz
                @Override // java.lang.Runnable
                public final void run() {
                    zzbeb zzbebVar = this.zza;
                    zzbebVar.zzf(zzbebVar.zzc);
                }
            });
        }
        return this.zze;
    }

    public final void zzd(Context context, zzdsc zzdscVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdscVar;
        zzf(context);
    }

    public final void zze(final int i) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeN)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdy
            @Override // java.lang.Runnable
            public final void run() {
                zzbeb.zzb(this.zza, i);
            }
        });
    }
}
