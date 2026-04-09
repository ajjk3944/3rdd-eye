package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzawp implements zzfpw {
    private final zzfob zza;
    private final zzfoq zzb;
    private final zzaxc zzc;
    private final zzawo zzd;
    private final zzavy zze;
    private final zzaxe zzf;
    private final zzaww zzg;
    private final zzawn zzh;

    public zzawp(zzfob zzfobVar, zzfoq zzfoqVar, zzaxc zzaxcVar, zzawo zzawoVar, zzavy zzavyVar, zzaxe zzaxeVar, zzaww zzawwVar, zzawn zzawnVar) {
        this.zza = zzfobVar;
        this.zzb = zzfoqVar;
        this.zzc = zzaxcVar;
        this.zzd = zzawoVar;
        this.zze = zzavyVar;
        this.zzf = zzaxeVar;
        this.zzg = zzawwVar;
        this.zzh = zzawnVar;
    }

    private final Map zze() {
        HashMap map = new HashMap();
        zzfob zzfobVar = this.zza;
        zzato zzatoVarZzb = this.zzb.zzb();
        map.put("v", zzfobVar.zzd());
        map.put("gms", Boolean.valueOf(zzfobVar.zzg()));
        map.put("int", zzatoVarZzb.zzg());
        map.put("attts", Long.valueOf(zzatoVarZzb.zzf().zza()));
        map.put("att", zzatoVarZzb.zzf().zzd());
        map.put("attkid", zzatoVarZzb.zzf().zzf());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzaww zzawwVar = this.zzg;
        if (zzawwVar != null) {
            map.put("tcq", Long.valueOf(zzawwVar.zzc()));
            map.put("tpq", Long.valueOf(zzawwVar.zzg()));
            map.put("tcv", Long.valueOf(zzawwVar.zzd()));
            map.put("tpv", Long.valueOf(zzawwVar.zzh()));
            map.put("tchv", Long.valueOf(zzawwVar.zzb()));
            map.put("tphv", Long.valueOf(zzawwVar.zzf()));
            map.put("tcc", Long.valueOf(zzawwVar.zza()));
            map.put("tpc", Long.valueOf(zzawwVar.zze()));
            zzavy zzavyVar = this.zze;
            if (zzavyVar != null) {
                map.put("nt", Long.valueOf(zzavyVar.zza()));
            }
            zzaxe zzaxeVar = this.zzf;
            if (zzaxeVar != null) {
                map.put("vs", Long.valueOf(zzaxeVar.zzc()));
                map.put("vf", Long.valueOf(zzaxeVar.zzb()));
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final Map zza() {
        zzaxc zzaxcVar = this.zzc;
        Map mapZze = zze();
        mapZze.put("lts", Long.valueOf(zzaxcVar.zza()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final Map zzb() {
        return zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final Map zzc() {
        zzawn zzawnVar = this.zzh;
        Map mapZze = zze();
        if (zzawnVar != null) {
            mapZze.put("vst", zzawnVar.zza());
        }
        return mapZze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
