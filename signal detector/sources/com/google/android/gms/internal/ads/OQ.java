package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class OQ {

    /* renamed from: a, reason: collision with root package name */
    public final Random f10199a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10200b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f10201c;

    public OQ() {
        this(new Random());
    }

    public final OQ a(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i3 = 0;
        while (true) {
            iArr = this.f10200b;
            random = this.f10199a;
            if (i3 >= i) {
                break;
            }
            iArr2[i3] = random.nextInt(iArr.length + 1);
            int i6 = i3 + 1;
            int iNextInt = random.nextInt(i6);
            iArr3[i3] = iArr3[iNextInt];
            iArr3[iNextInt] = i3;
            i3 = i6;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < iArr.length + i; i9++) {
            if (i7 >= i || i8 != iArr2[i7]) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                iArr4[i9] = i11;
                if (i11 >= 0) {
                    iArr4[i9] = i11 + i;
                }
                i8 = i10;
            } else {
                iArr4[i9] = iArr3[i7];
                i7++;
            }
        }
        return new OQ(iArr4, new Random(random.nextLong()));
    }

    public OQ(Random random) {
        this(new int[0], random);
    }

    public OQ(int[] iArr, Random random) {
        this.f10200b = iArr;
        this.f10199a = random;
        this.f10201c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f10201c[iArr[i]] = i;
        }
    }
}
