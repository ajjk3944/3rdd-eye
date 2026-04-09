package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzxf {
    private int zza;
    private final SparseArray zzb;
    private final zzdn zzc;

    public zzxf() {
        this(new zzdn() { // from class: com.google.android.gms.internal.ads.zzxe
            @Override // com.google.android.gms.internal.ads.zzdn
            public final void zza(Object obj) {
            }
        });
    }

    public final Object zza(int i) {
        SparseArray sparseArray;
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i10 = this.zza;
            if (i10 <= 0 || i >= this.zzb.keyAt(i10)) {
                break;
            }
            this.zza--;
        }
        while (true) {
            int i11 = this.zza;
            sparseArray = this.zzb;
            if (i11 >= sparseArray.size() - 1 || i < sparseArray.keyAt(this.zza + 1)) {
                break;
            }
            this.zza++;
        }
        return sparseArray.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(r0.size() - 1);
    }

    public final void zzc(int i, Object obj) {
        if (this.zza == -1) {
            zzdd.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzdd.zzd(i >= iKeyAt);
            if (iKeyAt == i) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i, obj);
    }

    public final void zzd() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i >= sparseArray.size()) {
                this.zza = -1;
                sparseArray.clear();
                return;
            } else {
                this.zzc.zza(sparseArray.valueAt(i));
                i++;
            }
        }
    }

    public final void zze(int i) {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i10 >= sparseArray.size() - 1) {
                return;
            }
            int i11 = i10 + 1;
            if (i < sparseArray.keyAt(i11)) {
                return;
            }
            this.zzc.zza(sparseArray.valueAt(i10));
            sparseArray.removeAt(i10);
            int i12 = this.zza;
            if (i12 > 0) {
                this.zza = i12 - 1;
            }
            i10 = i11;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzxf(zzdn zzdnVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdnVar;
        this.zza = -1;
    }
}
