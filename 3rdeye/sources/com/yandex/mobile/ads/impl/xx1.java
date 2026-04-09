package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes3.dex */
public interface xx1 {

    public static class a implements xx1 {

        /* renamed from: a, reason: collision with root package name */
        private final Random f35536a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f35537b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f35538c;

        public a() {
            this(new Random());
        }

        private static int[] a(Random random) {
            return new int[0];
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final a b(int i) {
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            int i10 = 0;
            int i11 = 0;
            while (i11 < i) {
                iArr[i11] = this.f35536a.nextInt(this.f35537b.length + 1);
                int i12 = i11 + 1;
                int iNextInt = this.f35536a.nextInt(i12);
                iArr2[i11] = iArr2[iNextInt];
                iArr2[iNextInt] = i11;
                i11 = i12;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f35537b.length + i];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.f35537b;
                if (i10 >= iArr4.length + i) {
                    return new a(iArr3, new Random(this.f35536a.nextLong()));
                }
                if (i13 >= i || i14 != iArr[i13]) {
                    int i15 = i14 + 1;
                    int i16 = iArr4[i14];
                    iArr3[i10] = i16;
                    if (i16 >= 0) {
                        iArr3[i10] = i16 + i;
                    }
                    i14 = i15;
                } else {
                    iArr3[i10] = iArr2[i13];
                    i13++;
                }
                i10++;
            }
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final a c(int i) {
            int[] iArr = new int[this.f35537b.length - i];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int[] iArr2 = this.f35537b;
                if (i10 >= iArr2.length) {
                    return new a(iArr, new Random(this.f35536a.nextLong()));
                }
                int i12 = iArr2[i10];
                if (i12 < 0 || i12 >= i) {
                    int i13 = i10 - i11;
                    if (i12 >= 0) {
                        i12 -= i;
                    }
                    iArr[i13] = i12;
                } else {
                    i11++;
                }
                i10++;
            }
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final int d(int i) {
            int i10 = this.f35538c[i] - 1;
            if (i10 >= 0) {
                return this.f35537b[i10];
            }
            return -1;
        }

        private a(Random random) {
            this(a(random), random);
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final int a() {
            int[] iArr = this.f35537b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        private a(int[] iArr, Random random) {
            this.f35537b = iArr;
            this.f35536a = random;
            this.f35538c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f35538c[iArr[i]] = i;
            }
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final int a(int i) {
            int i10 = this.f35538c[i] + 1;
            int[] iArr = this.f35537b;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final a d() {
            return new a(new int[0], new Random(this.f35536a.nextLong()));
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final int c() {
            int[] iArr = this.f35537b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final int b() {
            return this.f35537b.length;
        }
    }

    int a();

    int a(int i);

    int b();

    a b(int i);

    int c();

    a c(int i);

    int d(int i);

    a d();
}
