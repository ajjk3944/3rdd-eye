package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzazv;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbx;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcde;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzect;
import com.google.android.gms.internal.ads.zzecu;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzv {
    private static final zzv zza = new zzv();
    private final zzbbx zzA;
    private final zzbym zzB;
    private final zzci zzC;
    private final zzcde zzD;
    private final zzcaq zzE;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcfr zze;
    private final zzbzx zzf;
    private final zzaa zzg;
    private final zzazv zzh;
    private final zzbzq zzi;
    private final zzab zzj;
    private final zzbbi zzk;
    private final Clock zzl;
    private final zzf zzm;
    private final zzbdi zzn;
    private final zzbeb zzo;
    private final zzay zzp;
    private final zzbvv zzq;
    private final zzcaj zzr;
    private final zzbol zzs;
    private final zzz zzt;
    private final zzbt zzu;
    private final zzae zzv;
    private final zzaf zzw;
    private final zzbpj zzx;
    private final zzbu zzy;
    private final zzecu zzz;

    public zzv() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcfr zzcfrVar = new zzcfr();
        zzbzx zzbzxVar = new zzbzx();
        int i = Build.VERSION.SDK_INT;
        zzaa zzyVar = i >= 30 ? new zzy() : i >= 28 ? new zzx() : i >= 26 ? new com.google.android.gms.ads.internal.util.zzv() : i >= 24 ? new com.google.android.gms.ads.internal.util.zzu() : new com.google.android.gms.ads.internal.util.zzt();
        zzazv zzazvVar = new zzazv();
        zzbzq zzbzqVar = new zzbzq();
        zzab zzabVar = new zzab();
        zzbbi zzbbiVar = new zzbbi();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbdi zzbdiVar = new zzbdi();
        zzbeb zzbebVar = new zzbeb();
        zzay zzayVar = new zzay();
        zzbvv zzbvvVar = new zzbvv();
        zzcaj zzcajVar = new zzcaj();
        zzbol zzbolVar = new zzbol();
        zzz zzzVar = new zzz();
        zzbt zzbtVar = new zzbt();
        zzae zzaeVar = new zzae();
        zzaf zzafVar = new zzaf();
        zzbpj zzbpjVar = new zzbpj();
        zzbu zzbuVar = new zzbu();
        zzect zzectVar = new zzect();
        zzbbx zzbbxVar = new zzbbx();
        zzbym zzbymVar = new zzbym();
        zzci zzciVar = new zzci();
        zzcde zzcdeVar = new zzcde();
        zzcaq zzcaqVar = new zzcaq();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zzsVar;
        this.zze = zzcfrVar;
        this.zzf = zzbzxVar;
        this.zzg = zzyVar;
        this.zzh = zzazvVar;
        this.zzi = zzbzqVar;
        this.zzj = zzabVar;
        this.zzk = zzbbiVar;
        this.zzl = defaultClock;
        this.zzm = zzfVar;
        this.zzn = zzbdiVar;
        this.zzo = zzbebVar;
        this.zzp = zzayVar;
        this.zzq = zzbvvVar;
        this.zzr = zzcajVar;
        this.zzs = zzbolVar;
        this.zzu = zzbtVar;
        this.zzt = zzzVar;
        this.zzv = zzaeVar;
        this.zzw = zzafVar;
        this.zzx = zzbpjVar;
        this.zzy = zzbuVar;
        this.zzz = zzectVar;
        this.zzA = zzbbxVar;
        this.zzB = zzbymVar;
        this.zzC = zzciVar;
        this.zzD = zzcdeVar;
        this.zzE = zzcaqVar;
    }

    public static zzcde zzA() {
        return zza.zzD;
    }

    public static zzcfr zzB() {
        return zza.zze;
    }

    public static zzecu zzC() {
        return zza.zzz;
    }

    public static Clock zzD() {
        return zza.zzl;
    }

    public static zzf zza() {
        return zza.zzm;
    }

    public static zzazv zzb() {
        return zza.zzh;
    }

    public static zzbbi zzc() {
        return zza.zzk;
    }

    public static zzbbx zzd() {
        return zza.zzA;
    }

    public static zzbdi zze() {
        return zza.zzn;
    }

    public static zzbeb zzf() {
        return zza.zzo;
    }

    public static zzbol zzg() {
        return zza.zzs;
    }

    public static zzbpj zzh() {
        return zza.zzx;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzi() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzj() {
        return zza.zzc;
    }

    public static zzz zzk() {
        return zza.zzt;
    }

    public static zzae zzl() {
        return zza.zzv;
    }

    public static zzaf zzm() {
        return zza.zzw;
    }

    public static zzbvv zzn() {
        return zza.zzq;
    }

    public static zzbym zzo() {
        return zza.zzB;
    }

    public static zzbzq zzp() {
        return zza.zzi;
    }

    public static zzbzx zzq() {
        return zza.zzf;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzr() {
        return zza.zzd;
    }

    public static zzaa zzs() {
        return zza.zzg;
    }

    public static zzab zzt() {
        return zza.zzj;
    }

    public static zzay zzu() {
        return zza.zzp;
    }

    public static zzbt zzv() {
        return zza.zzu;
    }

    public static zzbu zzw() {
        return zza.zzy;
    }

    public static zzci zzx() {
        return zza.zzC;
    }

    public static zzcaj zzy() {
        return zza.zzr;
    }

    public static zzcaq zzz() {
        return zza.zzE;
    }
}
