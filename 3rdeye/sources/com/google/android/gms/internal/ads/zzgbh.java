package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgbh extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzgbh(int[] iArr, int i, int i10) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgbi.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgbh)) {
            return super.equals(obj);
        }
        zzgbh zzgbhVar = (zzgbh) obj;
        int i = this.zzc;
        int i10 = this.zzb;
        int i11 = zzgbhVar.zzc;
        int i12 = zzgbhVar.zzb;
        int i13 = i - i10;
        if (i11 - i12 != i13) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zza[i10 + i14] != zzgbhVar.zza[i12 + i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i10 = this.zzc;
        int i11 = this.zzb;
        zzfve.zza(i, i10 - i11, "index");
        return Integer.valueOf(this.zza[i11 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = this.zzb; i10 < this.zzc; i10++) {
            i = (i * 31) + this.zza[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.zza;
        int iIntValue = ((Integer) obj).intValue();
        int i = this.zzb;
        int iZza = zzgbi.zza(iArr, iIntValue, i, this.zzc);
        if (iZza >= 0) {
            return iZza - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((Integer) obj).intValue();
            int i = this.zzb;
            int i10 = this.zzc - 1;
            while (true) {
                if (i10 < i) {
                    i10 = -1;
                    break;
                }
                if (iArr[i10] == iIntValue) {
                    break;
                }
                i10--;
            }
            if (i10 >= 0) {
                return i10 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i10 = this.zzc;
        int i11 = this.zzb;
        Integer num = (Integer) obj;
        zzfve.zza(i, i10 - i11, "index");
        int[] iArr = this.zza;
        int i12 = i11 + i;
        int i13 = iArr[i12];
        num.getClass();
        iArr[i12] = num.intValue();
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i10) {
        int i11 = this.zzc;
        int i12 = this.zzb;
        zzfve.zzk(i, i10, i11 - i12);
        return i == i10 ? Collections.EMPTY_LIST : new zzgbh(this.zza, i + i12, i12 + i10);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.zzc;
        int i10 = this.zzb;
        StringBuilder sb = new StringBuilder((i - i10) * 5);
        sb.append('[');
        int[] iArr = this.zza;
        sb.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i10]);
        }
    }
}
