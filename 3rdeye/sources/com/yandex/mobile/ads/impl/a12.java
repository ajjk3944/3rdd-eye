package com.yandex.mobile.ads.impl;

import java.nio.ShortBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class a12 {

    /* renamed from: a, reason: collision with root package name */
    private final int f24366a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24367b;

    /* renamed from: c, reason: collision with root package name */
    private final float f24368c;

    /* renamed from: d, reason: collision with root package name */
    private final float f24369d;

    /* renamed from: e, reason: collision with root package name */
    private final float f24370e;

    /* renamed from: f, reason: collision with root package name */
    private final int f24371f;

    /* renamed from: g, reason: collision with root package name */
    private final int f24372g;

    /* renamed from: h, reason: collision with root package name */
    private final int f24373h;
    private final short[] i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f24374j;

    /* renamed from: k, reason: collision with root package name */
    private int f24375k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f24376l;

    /* renamed from: m, reason: collision with root package name */
    private int f24377m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f24378n;

    /* renamed from: o, reason: collision with root package name */
    private int f24379o;

    /* renamed from: p, reason: collision with root package name */
    private int f24380p;

    /* renamed from: q, reason: collision with root package name */
    private int f24381q;

    /* renamed from: r, reason: collision with root package name */
    private int f24382r;

    /* renamed from: s, reason: collision with root package name */
    private int f24383s;

    /* renamed from: t, reason: collision with root package name */
    private int f24384t;

    /* renamed from: u, reason: collision with root package name */
    private int f24385u;

    /* renamed from: v, reason: collision with root package name */
    private int f24386v;

    public a12(int i, int i10, float f10, float f11, int i11) {
        this.f24366a = i;
        this.f24367b = i10;
        this.f24368c = f10;
        this.f24369d = f11;
        this.f24370e = i / i11;
        this.f24371f = i / 400;
        int i12 = i / 65;
        this.f24372g = i12;
        int i13 = i12 * 2;
        this.f24373h = i13;
        this.i = new short[i13];
        int i14 = i13 * i10;
        this.f24374j = new short[i14];
        this.f24376l = new short[i14];
        this.f24378n = new short[i14];
    }

    private void a(short[] sArr, int i, int i10) {
        int i11 = this.f24373h / i10;
        int i12 = this.f24367b;
        int i13 = i10 * i12;
        int i14 = i * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.i[i15] = (short) (i16 / i13);
        }
    }

    private short[] b(short[] sArr, int i, int i10) {
        int length = sArr.length;
        int i11 = this.f24367b;
        int i12 = length / i11;
        return i + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0262 A[LOOP:4: B:13:0x004c->B:100:0x0262, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018f A[EDGE_INSN: B:110:0x018f->B:65:0x018f BREAK  A[LOOP:4: B:13:0x004c->B:100:0x0262], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d() {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.a12.d():void");
    }

    public final int c() {
        return this.f24375k * this.f24367b * 2;
    }

    public final void e() {
        int i;
        int i10 = this.f24375k;
        float f10 = this.f24368c;
        float f11 = this.f24369d;
        int i11 = this.f24377m + ((int) ((((i10 / (f10 / f11)) + this.f24379o) / (this.f24370e * f11)) + 0.5f));
        this.f24374j = b(this.f24374j, i10, (this.f24373h * 2) + i10);
        int i12 = 0;
        while (true) {
            i = this.f24373h * 2;
            int i13 = this.f24367b;
            if (i12 >= i * i13) {
                break;
            }
            this.f24374j[(i13 * i10) + i12] = 0;
            i12++;
        }
        this.f24375k = i + this.f24375k;
        d();
        if (this.f24377m > i11) {
            this.f24377m = i11;
        }
        this.f24375k = 0;
        this.f24382r = 0;
        this.f24379o = 0;
    }

    public final int b() {
        return this.f24377m * this.f24367b * 2;
    }

    public final void b(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f24367b;
        int i10 = iRemaining / i;
        short[] sArrB = b(this.f24374j, this.f24375k, i10);
        this.f24374j = sArrB;
        shortBuffer.get(sArrB, this.f24375k * this.f24367b, ((i * i10) * 2) / 2);
        this.f24375k += i10;
        d();
    }

    private int a(short[] sArr, int i, int i10, int i11) {
        int i12 = i * this.f24367b;
        int i13 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                iAbs += Math.abs(sArr[i12 + i17] - sArr[(i12 + i10) + i17]);
            }
            if (iAbs * i15 < i14 * i10) {
                i15 = i10;
                i14 = iAbs;
            }
            if (iAbs * i13 > i16 * i10) {
                i13 = i10;
                i16 = iAbs;
            }
            i10++;
        }
        this.f24385u = i14 / i15;
        this.f24386v = i16 / i13;
        return i15;
    }

    public final void a() {
        this.f24375k = 0;
        this.f24377m = 0;
        this.f24379o = 0;
        this.f24380p = 0;
        this.f24381q = 0;
        this.f24382r = 0;
        this.f24383s = 0;
        this.f24384t = 0;
        this.f24385u = 0;
        this.f24386v = 0;
    }

    public final void a(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f24367b, this.f24377m);
        shortBuffer.put(this.f24376l, 0, this.f24367b * iMin);
        int i = this.f24377m - iMin;
        this.f24377m = i;
        short[] sArr = this.f24376l;
        int i10 = this.f24367b;
        System.arraycopy(sArr, iMin * i10, sArr, 0, i * i10);
    }

    private static void a(int i, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i - i18) * sArr2[i17])) / i);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }
}
