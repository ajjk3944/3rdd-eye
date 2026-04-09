package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfyj extends zzfxy {
    Object[] zzd;
    private int zze;

    public zzfyj() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfxy, com.google.android.gms.internal.ads.zzfxz
    public final /* bridge */ /* synthetic */ zzfxz zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfyj zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzh = zzfyk.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzh <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzfxx.zza(iHashCode);
                while (true) {
                    int i = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i + 1;
                }
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzfyj zzg(Object... objArr) {
        if (this.zzd == null) {
            zzd(objArr, 2);
            return this;
        }
        for (int i = 0; i < 2; i++) {
            zzf(objArr[i]);
        }
        return this;
    }

    public final zzfyj zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzfyk zzi() {
        zzfyk zzfykVarZzv;
        int i = this.zzb;
        if (i == 0) {
            return zzfzx.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgai(obj);
        }
        if (this.zzd == null || zzfyk.zzh(i) != this.zzd.length) {
            zzfykVarZzv = zzfyk.zzv(this.zzb, this.zza);
            this.zzb = zzfykVarZzv.size();
        } else {
            int i10 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzfyk.zzw(i10, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
            }
            zzfykVarZzv = new zzfzx(objArrCopyOf, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzfykVarZzv;
    }

    public zzfyj(int i, boolean z10) {
        super(i);
        this.zzd = new Object[zzfyk.zzh(i)];
    }
}
