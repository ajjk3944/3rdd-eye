package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzexr implements zzcvu, zzcxq, zzezh, com.google.android.gms.ads.internal.overlay.zzr, zzcyd, zzcwh, zzddw {
    private final zzfdx zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzexr zzh = null;

    public zzexr(zzfdx zzfdxVar) {
        this.zza = zzfdxVar;
    }

    public static zzexr zzi(zzexr zzexrVar) {
        zzexr zzexrVar2 = new zzexr(zzexrVar.zza);
        zzexrVar2.zzh = zzexrVar;
        return zzexrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzdD(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexm
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((zzbax) obj).zzc(zzeVar);
            }
        });
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexn
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((zzbax) obj).zzb(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzdf();
        } else {
            zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexi
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbbb) obj).zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzds();
        } else {
            zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexf
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzds();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzdt();
            return;
        }
        zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexq
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdt();
            }
        });
        AtomicReference atomicReference = this.zzd;
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexd
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((zzbbb) obj).zzf();
            }
        });
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((zzbbb) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzdv();
        } else {
            zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexp
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdv();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw(final int i) {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzdw(i);
        } else {
            zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexl
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdw(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxq
    public final void zzg() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzg();
        } else {
            zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexo
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzcxq) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzh(zztVar);
        } else {
            zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexc
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
                }
            });
        }
    }

    public final void zzj() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzj();
            return;
        }
        this.zza.zza();
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexj
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((zzbay) obj).zza();
            }
        });
        zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexk
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) throws RemoteException {
                ((zzbbb) obj).zzc();
            }
        });
    }

    public final void zzk(final zzbau zzbauVar) {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzk(zzbauVar);
        } else {
            zzeyy.zza(this.zzb, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexh
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbax) obj).zzd(zzbauVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzezh
    public final void zzl(zzezh zzezhVar) {
        this.zzh = (zzexr) zzezhVar;
    }

    public final void zzm(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzg.set(zzdtVar);
    }

    public final void zzo(zzbax zzbaxVar) {
        this.zzb.set(zzbaxVar);
    }

    public final void zzp(zzbbb zzbbbVar) {
        this.zzd.set(zzbbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzr(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzr(zzeVar);
        } else {
            zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexg
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) throws RemoteException {
                    ((zzbbb) obj).zzd(zzeVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
    }
}
