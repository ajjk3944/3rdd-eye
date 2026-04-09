package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzbq {
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzfyf zzi;
    private zzfyf zzj;
    private zzfyf zzk;
    private int zzl;
    private int zzm;
    private zzfyf zzn;
    private zzbp zzo;
    private zzfyf zzp;
    private boolean zzq;
    private HashMap zzr;
    private HashSet zzs;

    public zzbq() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = true;
        this.zzi = zzfyf.zzn();
        this.zzj = zzfyf.zzn();
        this.zzk = zzfyf.zzn();
        this.zzl = Integer.MAX_VALUE;
        this.zzm = Integer.MAX_VALUE;
        this.zzn = zzfyf.zzn();
        this.zzo = zzbp.zza;
        this.zzp = zzfyf.zzn();
        this.zzq = true;
        this.zzr = new HashMap();
        this.zzs = new HashSet();
    }

    private final void zzu(zzbr zzbrVar) {
        this.zza = zzbrVar.zza;
        this.zzb = zzbrVar.zzb;
        this.zzc = zzbrVar.zzc;
        this.zzd = zzbrVar.zzd;
        this.zze = zzbrVar.zzi;
        this.zzf = zzbrVar.zzj;
        this.zzg = zzbrVar.zzk;
        this.zzh = zzbrVar.zzl;
        this.zzi = zzbrVar.zzm;
        this.zzj = zzbrVar.zzn;
        this.zzk = zzbrVar.zzp;
        this.zzl = zzbrVar.zzr;
        this.zzm = zzbrVar.zzs;
        this.zzn = zzbrVar.zzt;
        this.zzo = zzbrVar.zzu;
        this.zzp = zzbrVar.zzv;
        this.zzq = zzbrVar.zzx;
        this.zzs = new HashSet(zzbrVar.zzE);
        this.zzr = new HashMap(zzbrVar.zzD);
    }

    public final zzbq zzj(zzbr zzbrVar) {
        zzu(zzbrVar);
        return this;
    }

    public zzbq(zzbr zzbrVar) {
        zzu(zzbrVar);
    }
}
