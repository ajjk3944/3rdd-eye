package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfcm {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzgc zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbgc zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzco zzl;
    private zzbmn zzn;
    private zzekq zzr;
    private Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcs zzu;
    private int zzm = 1;
    private final zzfbz zzo = new zzfbz();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;

    public final zzfcm zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfcm zzB(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzfcm zzC(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfcm zzD(zzbgc zzbgcVar) {
        this.zzh = zzbgcVar;
        return this;
    }

    public final zzfcm zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfcm zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfcm zzG(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzb();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfcm zzH(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final zzfcm zzI(com.google.android.gms.ads.internal.client.zzgc zzgcVar) {
        this.zzd = zzgcVar;
        return this;
    }

    public final zzfco zzJ() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfco(this, null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final zzfcm zzV(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzu = zzcsVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzf() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzh() {
        return this.zzb;
    }

    public final zzfbz zzp() {
        return this.zzo;
    }

    public final zzfcm zzq(zzfco zzfcoVar) {
        this.zzo.zza(zzfcoVar.zzo.zza);
        this.zza = zzfcoVar.zzd;
        this.zzb = zzfcoVar.zze;
        this.zzu = zzfcoVar.zzt;
        this.zzc = zzfcoVar.zzf;
        this.zzd = zzfcoVar.zza;
        this.zzf = zzfcoVar.zzg;
        this.zzg = zzfcoVar.zzh;
        this.zzh = zzfcoVar.zzi;
        this.zzi = zzfcoVar.zzj;
        zzr(zzfcoVar.zzl);
        zzG(zzfcoVar.zzm);
        this.zzp = zzfcoVar.zzp;
        this.zzq = zzfcoVar.zzq;
        this.zzr = zzfcoVar.zzc;
        this.zzs = zzfcoVar.zzr;
        this.zzt = zzfcoVar.zzs;
        return this;
    }

    public final zzfcm zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfcm zzs(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzfcm zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfcm zzu(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzfcm zzv(zzekq zzekqVar) {
        this.zzr = zzekqVar;
        return this;
    }

    public final zzfcm zzw(zzbmn zzbmnVar) {
        this.zzn = zzbmnVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzgc(false, true, false);
        return this;
    }

    public final zzfcm zzx(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzfcm zzy(boolean z10) {
        this.zzq = z10;
        return this;
    }

    public final zzfcm zzz(boolean z10) {
        this.zzs = true;
        return this;
    }
}
