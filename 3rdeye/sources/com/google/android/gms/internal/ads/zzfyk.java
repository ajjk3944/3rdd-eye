package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfyk extends zzfya implements Set {
    private transient zzfyf zza;

    public static int zzh(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zzfve.zzf(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzfyj zzj(int i) {
        return new zzfyj(i, true);
    }

    public static zzfyk zzl(Collection collection) {
        if ((collection instanceof zzfyk) && !(collection instanceof SortedSet)) {
            zzfyk zzfykVar = (zzfyk) collection;
            if (!zzfykVar.zzf()) {
                return zzfykVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzfyk zzm(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgai(objArr[0]) : zzfzx.zza;
    }

    public static zzfyk zzn() {
        return zzfzx.zza;
    }

    public static zzfyk zzo(Object obj) {
        return new zzgai(obj);
    }

    public static zzfyk zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzfyk zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzfyk zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfyk zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[9];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 3);
        return zzv(9, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfyk zzv(int i, Object... objArr) {
        if (i == 0) {
            return zzfzx.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgai(obj);
        }
        int iZzh = zzh(i);
        Object[] objArr2 = new Object[iZzh];
        int i10 = iZzh - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            Object obj2 = objArr[i13];
            zzfzp.zza(obj2, i13);
            int iHashCode = obj2.hashCode();
            int iZza = zzfxx.zza(iHashCode);
            while (true) {
                int i14 = iZza & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZza++;
                }
            }
        }
        Arrays.fill(objArr, i12, i, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgai(obj4);
        }
        if (zzh(i12) < iZzh / 2) {
            return zzv(i12, objArr);
        }
        if (zzw(i12, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new zzfzx(objArr, i11, objArr2, i10, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i, int i10) {
        return i < (i10 >> 1) + (i10 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfyk) && zzu() && ((zzfyk) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgah.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgah.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public zzfyf zzd() {
        zzfyf zzfyfVar = this.zza;
        if (zzfyfVar != null) {
            return zzfyfVar;
        }
        zzfyf zzfyfVarZzi = zzi();
        this.zza = zzfyfVarZzi;
        return zzfyfVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzfya, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzgal iterator();

    public zzfyf zzi() {
        Object[] array = toArray();
        int i = zzfyf.zzd;
        return zzfyf.zzj(array, array.length);
    }

    public boolean zzu() {
        return false;
    }
}
