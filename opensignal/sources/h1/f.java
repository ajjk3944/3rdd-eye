package h1;

import g1.f0;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final q f9710e;

    /* renamed from: f, reason: collision with root package name */
    public final q f9711f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f9712g;

    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.f9710e = qVar;
        this.f9711f = qVar2;
        float[] fArr = a.f9677b.f9678a;
        s sVar = qVar.f9737d;
        float[] fArr2 = qVar.f9742i;
        s sVar2 = qVar2.f9737d;
        float[] fArr3 = qVar2.j;
        if (j.d(sVar, sVar2)) {
            fArrG = j.g(fArr3, fArr2);
        } else {
            float[] fArrA = sVar.a();
            float[] fArrA2 = sVar2.a();
            s sVar3 = j.f9719b;
            fArrG = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f9742i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f9712g = fArrG;
    }

    @Override // h1.g
    public final long a(long j) {
        float fH = g1.r.h(j);
        float fG = g1.r.g(j);
        float fE = g1.r.e(j);
        float fD = g1.r.d(j);
        m mVar = this.f9710e.f9747p;
        float fI = (float) mVar.i(fH);
        float fI2 = (float) mVar.i(fG);
        float fI3 = (float) mVar.i(fE);
        float[] fArr = this.f9712g;
        float f10 = (fArr[6] * fI3) + (fArr[3] * fI2) + (fArr[0] * fI);
        float f11 = (fArr[7] * fI3) + (fArr[4] * fI2) + (fArr[1] * fI);
        float f12 = (fArr[8] * fI3) + (fArr[5] * fI2) + (fArr[2] * fI);
        q qVar = this.f9711f;
        float fI4 = (float) qVar.f9744m.i(f10);
        m mVar2 = qVar.f9744m;
        return f0.a(fI4, (float) mVar2.i(f11), (float) mVar2.i(f12), fD, qVar);
    }
}
