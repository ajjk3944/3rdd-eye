package q1;

import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final q f32099e;

    /* renamed from: f, reason: collision with root package name */
    public final q f32100f;
    public final float[] g;

    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.f32099e = qVar;
        this.f32100f = qVar2;
        float[] fArr = a.f32066b.f32067a;
        s sVar = qVar.f32124d;
        float[] fArr2 = qVar.f32128i;
        s sVar2 = qVar2.f32124d;
        float[] fArr3 = qVar2.j;
        if (j.d(sVar, sVar2)) {
            fArrG = j.g(fArr3, fArr2);
        } else {
            float[] fArrA = sVar.a();
            float[] fArrA2 = sVar2.a();
            s sVar3 = j.f32107b;
            fArrG = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f32128i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrG;
    }

    @Override // q1.g
    public final long a(long j) {
        float fH = p1.s.h(j);
        float fG = p1.s.g(j);
        float fE = p1.s.e(j);
        float fD = p1.s.d(j);
        m mVar = this.f32099e.f32134p;
        float fA = (float) mVar.a(fH);
        float fA2 = (float) mVar.a(fG);
        float fA3 = (float) mVar.a(fE);
        float[] fArr = this.g;
        float f10 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        float f11 = (fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA);
        float f12 = (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
        q qVar = this.f32100f;
        float fA4 = (float) qVar.f32131m.a(f10);
        m mVar2 = qVar.f32131m;
        return z.a(fA4, (float) mVar2.a(f11), (float) mVar2.a(f12), fD, qVar);
    }
}
