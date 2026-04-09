package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import m0.C5316i;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdix {
    public static final zzdix zza = new zzdix(new zzdiv());
    private final zzbho zzb;
    private final zzbhl zzc;
    private final zzbib zzd;
    private final zzbhy zze;
    private final zzbmw zzf;
    private final C5316i zzg;
    private final C5316i zzh;

    public final zzbhl zza() {
        return this.zzc;
    }

    public final zzbho zzb() {
        return this.zzb;
    }

    public final zzbhr zzc(String str) {
        return (zzbhr) this.zzh.get(str);
    }

    public final zzbhu zzd(String str) {
        if (str == null) {
            return null;
        }
        return (zzbhu) this.zzg.get(str);
    }

    public final zzbhy zze() {
        return this.zze;
    }

    public final zzbib zzf() {
        return this.zzd;
    }

    public final zzbmw zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        C5316i c5316i = this.zzg;
        ArrayList arrayList = new ArrayList(c5316i.f44030d);
        for (int i = 0; i < c5316i.f44030d; i++) {
            arrayList.add((String) c5316i.g(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private zzdix(zzdiv zzdivVar) {
        this.zzb = zzdivVar.zza;
        this.zzc = zzdivVar.zzb;
        this.zzd = zzdivVar.zzc;
        this.zzg = new C5316i(zzdivVar.zzf);
        this.zzh = new C5316i(zzdivVar.zzg);
        this.zze = zzdivVar.zzd;
        this.zzf = zzdivVar.zze;
    }
}
