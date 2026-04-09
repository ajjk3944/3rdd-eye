package m0;

import c9.C2088i;

/* compiled from: CircularIntArray.kt */
/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5311d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f44016a;

    /* renamed from: b, reason: collision with root package name */
    public int f44017b;

    /* renamed from: c, reason: collision with root package name */
    public int f44018c;

    /* renamed from: d, reason: collision with root package name */
    public int f44019d;

    public C5311d() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f44019d = iHighestOneBit - 1;
        this.f44016a = new int[iHighestOneBit];
    }

    public final void a(int i) {
        int[] iArr = this.f44016a;
        int i10 = this.f44018c;
        iArr[i10] = i;
        int i11 = this.f44019d & (i10 + 1);
        this.f44018c = i11;
        int i12 = this.f44017b;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i14];
            C2088i.c(0, i12, length, iArr, iArr2);
            C2088i.c(i13, 0, this.f44017b, this.f44016a, iArr2);
            this.f44016a = iArr2;
            this.f44017b = 0;
            this.f44018c = length;
            this.f44019d = i14 - 1;
        }
    }
}
