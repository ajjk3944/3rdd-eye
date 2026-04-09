package q9;

import java.util.ArrayList;
import o9.d;
import w9.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public m9.a f32225a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f32226b;

    public static float b(ArrayList arrayList, float f10, int i4) {
        float f11 = Float.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f32232f == i4) {
                float fAbs = Math.abs(bVar.f32230d - f10);
                if (fAbs < f11) {
                    f11 = fAbs;
                }
            }
        }
        return f11;
    }

    @Override // q9.c
    public final b a(float f10, float f11) {
        d dVarE;
        m9.a aVar = this.f32225a;
        pe.c cVar = aVar.f28986a0;
        cVar.getClass();
        f fVar = w9.c.f36542d;
        w9.c cVar2 = (w9.c) fVar.b();
        cVar2.f36543b = 0.0d;
        cVar2.f36544c = 0.0d;
        cVar.c(f10, f11, cVar2);
        float f12 = (float) cVar2.f36543b;
        fVar.c(cVar2);
        ArrayList arrayList = this.f32226b;
        arrayList.clear();
        o9.a data = aVar.getData();
        if (data != null) {
            ArrayList arrayList2 = data.f30440i;
            int size = arrayList2 == null ? 0 : arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                o9.c cVar3 = (o9.c) data.d(i4);
                cVar3.getClass();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayListC = cVar3.c(f12);
                if (arrayListC.size() == 0 && (dVarE = cVar3.e(3, f12, Float.NaN)) != null) {
                    arrayListC = cVar3.c(dVarE.a());
                }
                if (arrayListC.size() != 0) {
                    int size2 = arrayListC.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        int i11 = i10 + 1;
                        d dVar = (d) arrayListC.get(i10);
                        pe.c cVarI = aVar.i(cVar3.f30444d);
                        float fA = dVar.a();
                        float f13 = dVar.f30453a;
                        float[] fArr = (float[]) cVarI.g;
                        fArr[0] = fA;
                        fArr[1] = f13;
                        cVarI.f(fArr);
                        double d10 = fArr[0];
                        double d11 = fArr[1];
                        m9.a aVar2 = aVar;
                        w9.c cVar4 = (w9.c) w9.c.f36542d.b();
                        cVar4.f36543b = d10;
                        cVar4.f36544c = d11;
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(new b(dVar.a(), dVar.f30453a, (float) cVar4.f36543b, (float) cVar4.f36544c, i4, cVar3.f30444d));
                        cVar3 = cVar3;
                        arrayList3 = arrayList4;
                        arrayListC = arrayListC;
                        size2 = size2;
                        i10 = i11;
                        aVar = aVar2;
                    }
                }
                m9.a aVar3 = aVar;
                arrayList.addAll(arrayList3);
                i4++;
                aVar = aVar3;
            }
        }
        m9.a aVar4 = aVar;
        b bVar = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int i12 = b(arrayList, f11, 1) < b(arrayList, f11, 2) ? 1 : 2;
        float maxHighlightDistance = aVar4.getMaxHighlightDistance();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            b bVar2 = (b) arrayList.get(i13);
            if (bVar2.f32232f == i12) {
                float fHypot = (float) Math.hypot(f10 - bVar2.f32229c, f11 - bVar2.f32230d);
                if (fHypot < maxHighlightDistance) {
                    bVar = bVar2;
                    maxHighlightDistance = fHypot;
                }
            }
        }
        return bVar;
    }
}
