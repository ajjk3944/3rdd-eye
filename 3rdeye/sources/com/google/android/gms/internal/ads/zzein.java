package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzein extends zzbpt {
    private final zzcvp zza;
    private final zzddu zzb;
    private final zzcwj zzc;
    private final zzcwy zzd;
    private final zzcxd zze;
    private final zzdas zzf;
    private final zzcxx zzg;
    private final zzder zzh;
    private final zzdao zzi;
    private final zzcwe zzj;

    public zzein(zzcvp zzcvpVar, zzddu zzdduVar, zzcwj zzcwjVar, zzcwy zzcwyVar, zzcxd zzcxdVar, zzdas zzdasVar, zzcxx zzcxxVar, zzder zzderVar, zzdao zzdaoVar, zzcwe zzcweVar) {
        this.zza = zzcvpVar;
        this.zzb = zzdduVar;
        this.zzc = zzcwjVar;
        this.zzd = zzcwyVar;
        this.zze = zzcxdVar;
        this.zzf = zzdasVar;
        this.zzg = zzcxxVar;
        this.zzh = zzderVar;
        this.zzi = zzdaoVar;
        this.zzj = zzcweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdf();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzf() {
        this.zzg.zzdw(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i, "", "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zzc(zzfdp.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, "undefined", null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzo() {
        this.zze.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzp() {
        this.zzg.zzdt();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public void zzw() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzx() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzy() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzz() {
        this.zzh.zzd();
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    public void zzs(zzbwm zzbwmVar) {
    }

    public void zzt(zzbwq zzbwqVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzi(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzr(zzbhh zzbhhVar, String str) {
    }
}
