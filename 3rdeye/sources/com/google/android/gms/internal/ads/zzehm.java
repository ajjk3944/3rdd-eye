package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzehm extends zzein {
    private final zzdef zza;

    public zzehm(zzcvp zzcvpVar, zzddu zzdduVar, zzcwj zzcwjVar, zzcwy zzcwyVar, zzcxd zzcxdVar, zzcwe zzcweVar, zzdas zzdasVar, zzder zzderVar, zzcxx zzcxxVar, zzdef zzdefVar, zzdao zzdaoVar) {
        super(zzcvpVar, zzdduVar, zzcwjVar, zzcwyVar, zzcxdVar, zzdasVar, zzcxxVar, zzderVar, zzdaoVar, zzcweVar);
        this.zza = zzdefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzein, com.google.android.gms.internal.ads.zzbpu
    public final void zzs(zzbwm zzbwmVar) {
        this.zza.zza(zzbwmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzein, com.google.android.gms.internal.ads.zzbpu
    public final void zzt(zzbwq zzbwqVar) throws RemoteException {
        this.zza.zza(new zzbwm(zzbwqVar.zzf(), zzbwqVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzein, com.google.android.gms.internal.ads.zzbpu
    public final void zzu() throws RemoteException {
        this.zza.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzein, com.google.android.gms.internal.ads.zzbpu
    public final void zzv() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzein, com.google.android.gms.internal.ads.zzbpu
    public final void zzw() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzein, com.google.android.gms.internal.ads.zzbpu
    public final void zzz() {
        this.zza.zzc();
    }
}
