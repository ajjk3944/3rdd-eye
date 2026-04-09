package h1;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f9713a;

    /* renamed from: b, reason: collision with root package name */
    public final c f9714b;

    /* renamed from: c, reason: collision with root package name */
    public final c f9715c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f9716d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f9713a = cVar;
        this.f9714b = cVar2;
        this.f9715c = cVar3;
        this.f9716d = fArr;
    }

    public long a(long j) {
        float fH = g1.r.h(j);
        float fG = g1.r.g(j);
        float fE = g1.r.e(j);
        float fD = g1.r.d(j);
        c cVar = this.f9714b;
        long jD = cVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fH, fG, fE);
        float[] fArr = this.f9716d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        float f11 = fIntBitsToFloat2;
        return this.f9715c.f(f10, f11, fE2, fD, this.f9713a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(h1.c r9, h1.c r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f9685b
            long r2 = h1.b.f9679a
            boolean r0 = h1.b.a(r0, r2)
            if (r0 == 0) goto Lf
            h1.c r0 = h1.j.a(r9)
            goto L10
        Lf:
            r0 = r9
        L10:
            long r4 = r10.f9685b
            boolean r1 = h1.b.a(r4, r2)
            if (r1 == 0) goto L1d
            h1.c r1 = h1.j.a(r10)
            goto L1e
        L1d:
            r1 = r10
        L1e:
            r4 = 3
            if (r11 != r4) goto L69
            long r5 = r9.f9685b
            boolean r11 = h1.b.a(r5, r2)
            long r5 = r10.f9685b
            boolean r2 = h1.b.a(r5, r2)
            if (r11 == 0) goto L32
            if (r2 == 0) goto L32
            goto L69
        L32:
            if (r11 != 0) goto L36
            if (r2 == 0) goto L69
        L36:
            if (r11 == 0) goto L39
            goto L3a
        L39:
            r9 = r10
        L3a:
            h1.q r9 = (h1.q) r9
            h1.s r9 = r9.f9737d
            float[] r3 = h1.j.f9722e
            if (r11 == 0) goto L47
            float[] r11 = r9.a()
            goto L48
        L47:
            r11 = r3
        L48:
            if (r2 == 0) goto L4e
            float[] r3 = r9.a()
        L4e:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6a
        L69:
            r3 = 0
        L6a:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.<init>(h1.c, h1.c, int):void");
    }
}
