package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzekq implements AppEventListener, zzcyt, zzcxf, zzcvu, zzcwl, com.google.android.gms.ads.internal.client.zza, zzcvr, zzcyd, zzcwh, zzddw {
    final zzdsc zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjd)).intValue());

    public zzekq(zzdsc zzdscVar) {
        this.zza = zzdscVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekb
                    @Override // com.google.android.gms.internal.ads.zzeyx
                    public final void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzco) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkY)).booleanValue()) {
            return;
        }
        zzeyy.zza(this.zzc, new zzeko());
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeki
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzco) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("The queue for app events is full, dropping the new event.");
            zzdsc zzdscVar = this.zza;
            if (zzdscVar != null) {
                zzdsb zzdsbVarZza = zzdscVar.zza();
                zzdsbVarZza.zzb("action", "dae_action");
                zzdsbVarZza.zzb("dae_name", str);
                zzdsbVarZza.zzb("dae_data", str2);
                zzdsbVarZza.zzj();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzejy
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzd();
            }
        });
        zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzejz
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcv) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzj();
            }
        });
        zzeyx zzeyxVar = new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekm
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcv) obj).zzf();
            }
        };
        AtomicReference atomicReference = this.zzg;
        zzeyy.zza(atomicReference, zzeyxVar);
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcv) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyx zzeyxVar = new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzf(zzeVar);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzeyy.zza(atomicReference, zzeyxVar);
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zze(zzeVar.zza);
            }
        });
        zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbn) obj).zzb(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkY)).booleanValue()) {
            zzeyy.zza(this.zzc, new zzeko());
        }
        zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcv) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbk zzg() {
        return (com.google.android.gms.ads.internal.client.zzbk) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzco zzi() {
        return (com.google.android.gms.ads.internal.client.zzco) this.zzd.get();
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzc.set(zzbkVar);
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
        this.zzf.set(zzbnVar);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zze.set(zzdtVar);
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzco zzcoVar) {
        this.zzd.set(zzcoVar);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.zzg.set(zzcvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzr(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekh
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcv) obj).zzd(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzejx
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final synchronized void zzt() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekf
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzi();
            }
        });
        zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekg
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbn) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(zzbwa zzbwaVar, String str, String str2) {
    }
}
