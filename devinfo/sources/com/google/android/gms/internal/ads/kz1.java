package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kz1 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f13303a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f13304b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f13305c;

    public kz1() {
        this(new Random());
    }

    public final kz1 a(int i4) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int i10 = 0;
        while (true) {
            iArr = this.f13304b;
            random = this.f13303a;
            if (i10 >= i4) {
                break;
            }
            iArr2[i10] = random.nextInt(iArr.length + 1);
            int i11 = i10 + 1;
            int iNextInt = random.nextInt(i11);
            iArr3[i10] = iArr3[iNextInt];
            iArr3[iNextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i4];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length + i4; i14++) {
            if (i12 >= i4 || i13 != iArr2[i12]) {
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                iArr4[i14] = i16;
                if (i16 >= 0) {
                    iArr4[i14] = i16 + i4;
                }
                i13 = i15;
            } else {
                iArr4[i14] = iArr3[i12];
                i12++;
            }
        }
        return new kz1(iArr4, new Random(random.nextLong()));
    }

    public kz1(Random random) {
        this(new int[0], random);
    }

    public kz1(int[] iArr, Random random) {
        this.f13304b = iArr;
        this.f13303a = random;
        this.f13305c = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f13305c[iArr[i4]] = i4;
        }
    }
}
