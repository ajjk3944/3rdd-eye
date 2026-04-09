package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdaf implements AppEventListener, OnAdMetadataChangedListener, zzcvr, com.google.android.gms.ads.internal.client.zza, zzcyd, zzcwl, zzcxq, com.google.android.gms.ads.internal.overlay.zzr, zzcwh, zzddw {
    private final zzdac zza = new zzdac(this, null);
    private zzekq zzb;
    private zzeku zzc;
    private zzexr zzd;
    private zzfaw zze;

    private static void zzn(Object obj, zzdad zzdadVar) {
        if (obj != null) {
            zzdadVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzcyv
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzekq) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzdad() { // from class: com.google.android.gms.internal.ads.zzcyw
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzeku) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczb
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzfaw) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczh
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzekq) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzdaa
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzekq) obj).zza();
            }
        });
        zzn(this.zze, new zzdad() { // from class: com.google.android.gms.internal.ads.zzdab
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzfaw) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczt
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzekq) obj).zzb();
            }
        });
        zzn(this.zze, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczu
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzfaw) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczc
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzekq) obj).zzc();
            }
        });
        zzn(this.zze, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczd
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzfaw) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
        zzn(this.zzd, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczo
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczq
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzekq) obj).zzdf();
            }
        });
        zzn(this.zzc, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczv
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzeku) obj).zzdf();
            }
        });
        zzn(this.zze, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczw
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzfaw) obj).zzdf();
            }
        });
        zzn(this.zzd, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczx
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzexr) obj).zzdf();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
        zzn(this.zzd, new zzdad() { // from class: com.google.android.gms.internal.ads.zzcza
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds() {
        zzn(this.zzd, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczn
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzexr) obj).zzds();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        zzn(this.zzd, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczj
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzexr) obj).zzdt();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(final zzbwa zzbwaVar, final String str, final String str2) {
        zzn(this.zzb, new zzdad(zzbwaVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzcze
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczg
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzfaw) obj).zzdu(zzbwaVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzn(this.zzd, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczp
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzexr) obj).zzdv();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw(final int i) {
        zzn(this.zzd, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczr
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzexr) obj).zzdw(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzcyu
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczf
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzfaw) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzcyx
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdad() { // from class: com.google.android.gms.internal.ads.zzcyy
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzfaw) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxq
    public final void zzg() {
        zzn(this.zzd, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczs
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzexr) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzh(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczk
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzekq) obj).zzh(zztVar);
            }
        });
        zzn(this.zze, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczl
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzfaw) obj).zzh(zztVar);
            }
        });
        zzn(this.zzd, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczm
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzexr) obj).zzh(zztVar);
            }
        });
    }

    public final zzdac zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzr(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczy
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzfaw) obj).zzr(zzeVar);
            }
        });
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczz
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzekq) obj).zzr(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzcyz
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzekq) obj).zzs();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
        zzn(this.zzb, new zzdad() { // from class: com.google.android.gms.internal.ads.zzczi
            @Override // com.google.android.gms.internal.ads.zzdad
            public final void zza(Object obj) {
                ((zzekq) obj).zzu();
            }
        });
    }
}
