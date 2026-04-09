package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfyf extends zzfya implements List, RandomAccess {
    private static final zzgam zza = new zzfyd(zzfzr.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzfyc zzi(int i) {
        zzfxc.zza(i, "expectedSize");
        return new zzfyc(i);
    }

    public static zzfyf zzj(Object[] objArr, int i) {
        return i == 0 ? zzfzr.zza : new zzfzr(objArr, i);
    }

    public static zzfyf zzk(Iterable iterable) {
        iterable.getClass();
        return zzl((Collection) iterable);
    }

    public static zzfyf zzl(Collection collection) {
        if (!(collection instanceof zzfya)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzfzp.zzb(array, length);
            return zzj(array, length);
        }
        zzfyf zzfyfVarZzd = ((zzfya) collection).zzd();
        if (!zzfyfVarZzd.zzf()) {
            return zzfyfVarZzd;
        }
        Object[] array2 = zzfyfVarZzd.toArray();
        return zzj(array2, array2.length);
    }

    public static zzfyf zzm(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfzr.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfzp.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzfyf zzn() {
        return zzfzr.zza;
    }

    public static zzfyf zzo(Object obj) {
        Object[] objArr = {obj};
        zzfzp.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzfyf zzp(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfzp.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzfyf zzq(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfzp.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzfyf zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfzp.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static zzfyf zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfzp.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    @SafeVarargs
    public static zzfyf zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzfzp.zzb(objArr2, i);
        return zzj(objArr2, i);
    }

    public static zzfyf zzu(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : zzfyv.zza(((zzfyf) iterable).listIterator(0))).toArray();
        int length = array.length;
        zzfzp.zzb(array, length);
        Arrays.sort(array, comparator);
        return zzj(array, length);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfya, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!zzfvb.zza(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zzfvb.zza(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfya, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i + i10] = get(i10);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    /* renamed from: zze */
    public final zzgal iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzfyf subList(int i, int i10) {
        zzfve.zzk(i, i10, size());
        int i11 = i10 - i;
        return i11 == size() ? this : i11 == 0 ? zzfzr.zza : new zzfye(this, i, i11);
    }

    @Override // java.util.List
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final zzgam listIterator(int i) {
        zzfve.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzfyd(this, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    @Deprecated
    public final zzfyf zzd() {
        return this;
    }
}
