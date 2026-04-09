package o5;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class a1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f18891a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f18892b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f18893c;

    public a1() {
        this(new Random());
    }

    public final a1 a(int i10, int i11) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int i12 = 0;
        while (true) {
            iArr = this.f18892b;
            random = this.f18891a;
            if (i12 >= i11) {
                break;
            }
            iArr2[i12] = random.nextInt(iArr.length + 1);
            int i13 = i12 + 1;
            int iNextInt = random.nextInt(i13);
            iArr3[i12] = iArr3[iNextInt];
            iArr3[iNextInt] = i12 + i10;
            i12 = i13;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i11];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length + i11; i16++) {
            if (i14 >= i11 || i15 != iArr2[i14]) {
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                iArr4[i16] = i18;
                if (i18 >= i10) {
                    iArr4[i16] = i18 + i11;
                }
                i15 = i17;
            } else {
                iArr4[i16] = iArr3[i14];
                i14++;
            }
        }
        return new a1(iArr4, new Random(random.nextLong()));
    }

    public a1(int[] iArr, Random random) {
        this.f18892b = iArr;
        this.f18891a = random;
        this.f18893c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f18893c[iArr[i10]] = i10;
        }
    }

    public a1(Random random) {
        this(new int[0], random);
    }
}
