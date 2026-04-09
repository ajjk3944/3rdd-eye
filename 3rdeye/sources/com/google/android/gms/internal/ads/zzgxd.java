package com.google.android.gms.internal.ads;

import N7.H7;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgxd extends zzgwz implements RandomAccess, zzgyx, zzhap {
    private static final boolean[] zza;
    private static final zzgxd zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new zzgxd(zArr, 0, false);
    }

    public zzgxd() {
        this(zza, 0, true);
    }

    public static zzgxd zzd() {
        return zzb;
    }

    private static int zzi(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzj(int i) {
        return H7.n(i, this.zzd, "Index:", ", Size:");
    }

    private final void zzk(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i10;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzdJ();
        if (i < 0 || i > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzj(i));
        }
        int i11 = i + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i10 < length) {
            System.arraycopy(zArr, i, zArr, i11, i10 - i);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr2, 0, i);
            System.arraycopy(this.zzc, i, zArr2, i11, this.zzd - i);
            this.zzc = zArr2;
        }
        this.zzc[i] = zBooleanValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdJ();
        byte[] bArr = zzgzi.zzb;
        collection.getClass();
        if (!(collection instanceof zzgxd)) {
            return super.addAll(collection);
        }
        zzgxd zzgxdVar = (zzgxd) collection;
        int i = zzgxdVar.zzd;
        if (i == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        boolean[] zArr = this.zzc;
        if (i11 > zArr.length) {
            this.zzc = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(zzgxdVar.zzc, 0, this.zzc, this.zzd, zzgxdVar.zzd);
        this.zzd = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgxd)) {
            return super.equals(obj);
        }
        zzgxd zzgxdVar = (zzgxd) obj;
        if (this.zzd != zzgxdVar.zzd) {
            return false;
        }
        boolean[] zArr = zzgxdVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzk(i);
        return Boolean.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.zzd; i++) {
            iZza = (iZza * 31) + zzgzi.zza(this.zzc[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.zzd;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.zzc[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdJ();
        zzk(i);
        boolean[] zArr = this.zzc;
        boolean z10 = zArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        zzdJ();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzc;
        System.arraycopy(zArr, i10, zArr, i, this.zzd - i10);
        this.zzd -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzdJ();
        zzk(i);
        boolean[] zArr = this.zzc;
        boolean z10 = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzgyx zzf(int i) {
        if (i >= this.zzd) {
            return new zzgxd(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(boolean z10) {
        zzdJ();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            boolean[] zArr = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        zArr2[i10] = z10;
    }

    public final boolean zzh(int i) {
        zzk(i);
        return this.zzc[i];
    }

    private zzgxd(boolean[] zArr, int i, boolean z10) {
        super(z10);
        this.zzc = zArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
