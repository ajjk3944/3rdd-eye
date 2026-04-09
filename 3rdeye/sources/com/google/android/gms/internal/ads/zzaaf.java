package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaaf {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaab
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzaad) obj).zza - ((zzaad) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaac
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzaad) obj).zzc, ((zzaad) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzaad[] zzd = new zzaad[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzaaf(int i) {
    }

    public final float zza(float f10) {
        int i = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzaad) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f12 = 0.5f * f11;
            zzaad zzaadVar = (zzaad) arrayList.get(i);
            i10 += zzaadVar.zzb;
            if (i10 >= f12) {
                return zzaadVar.zzc;
            }
            i++;
        }
    }

    public final void zzb(int i, float f10) {
        zzaad zzaadVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i10 = this.zzh;
        if (i10 > 0) {
            zzaad[] zzaadVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzh = i11;
            zzaadVar = zzaadVarArr[i11];
        } else {
            zzaadVar = new zzaad(null);
        }
        int i12 = this.zzf;
        this.zzf = i12 + 1;
        zzaadVar.zza = i12;
        zzaadVar.zzb = i;
        zzaadVar.zzc = f10;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzaadVar);
        this.zzg += i;
        while (true) {
            int i13 = this.zzg;
            if (i13 <= 2000) {
                return;
            }
            int i14 = i13 - 2000;
            zzaad zzaadVar2 = (zzaad) arrayList.get(0);
            int i15 = zzaadVar2.zzb;
            if (i15 <= i14) {
                this.zzg -= i15;
                arrayList.remove(0);
                int i16 = this.zzh;
                if (i16 < 5) {
                    zzaad[] zzaadVarArr2 = this.zzd;
                    this.zzh = i16 + 1;
                    zzaadVarArr2[i16] = zzaadVar2;
                }
            } else {
                zzaadVar2.zzb = i15 - i14;
                this.zzg -= i14;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
