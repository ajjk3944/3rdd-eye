package com.google.android.gms.internal.ads;

import N7.H7;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgyc extends zzgwz implements RandomAccess, zzgyy, zzhap {
    private static final double[] zza;
    private static final zzgyc zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new zzgyc(dArr, 0, false);
    }

    public zzgyc() {
        this(zza, 0, true);
    }

    public static zzgyc zze() {
        return zzb;
    }

    private static int zzj(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzk(int i) {
        return H7.n(i, this.zzd, "Index:", ", Size:");
    }

    private final void zzl(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i10;
        double dDoubleValue = ((Double) obj).doubleValue();
        zzdJ();
        if (i < 0 || i > (i10 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
        int i11 = i + 1;
        double[] dArr = this.zzc;
        int length = dArr.length;
        if (i10 < length) {
            System.arraycopy(dArr, i, dArr, i11, i10 - i);
        } else {
            double[] dArr2 = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr2, 0, i);
            System.arraycopy(this.zzc, i, dArr2, i11, this.zzd - i);
            this.zzc = dArr2;
        }
        this.zzc[i] = dDoubleValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdJ();
        byte[] bArr = zzgzi.zzb;
        collection.getClass();
        if (!(collection instanceof zzgyc)) {
            return super.addAll(collection);
        }
        zzgyc zzgycVar = (zzgyc) collection;
        int i = zzgycVar.zzd;
        if (i == 0) {
            return false;
        }
        int i10 = this.zzd;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        double[] dArr = this.zzc;
        if (i11 > dArr.length) {
            this.zzc = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(zzgycVar.zzc, 0, this.zzc, this.zzd, zzgycVar.zzd);
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
        if (!(obj instanceof zzgyc)) {
            return super.equals(obj);
        }
        zzgyc zzgycVar = (zzgyc) obj;
        if (this.zzd != zzgycVar.zzd) {
            return false;
        }
        double[] dArr = zzgycVar.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (Double.doubleToLongBits(this.zzc[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzl(i);
        return Double.valueOf(this.zzc[i]);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzc[i10]);
            byte[] bArr = zzgzi.zzb;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.zzd;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.zzc[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdJ();
        zzl(i);
        double[] dArr = this.zzc;
        double d10 = dArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        zzdJ();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzc;
        System.arraycopy(dArr, i10, dArr, i, this.zzd - i10);
        this.zzd -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zzdJ();
        zzl(i);
        double[] dArr = this.zzc;
        double d10 = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final double zzd(int i) {
        zzl(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgyy zzf(int i) {
        if (i >= this.zzd) {
            return new zzgyc(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(double d10) {
        zzdJ();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            double[] dArr = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        dArr2[i10] = d10;
    }

    public final void zzi(int i) {
        int length = this.zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new double[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzgyc(double[] dArr, int i, boolean z10) {
        super(z10);
        this.zzc = dArr;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Double) obj).doubleValue());
        return true;
    }
}
