package h2;

import android.graphics.Matrix;
import android.graphics.Shader;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final cj.a f9847a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9848b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9849c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9850d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9851e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9852f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9853g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f9854h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public m(cj.a aVar, long j, int i10, int i11) {
        float f10;
        boolean z10;
        p pVar;
        f1.c cVarC;
        int iG;
        this.f9847a = aVar;
        this.f9848b = i10;
        if (t2.a.j(j) != 0 || t2.a.i(j) != 0) {
            m2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) aVar.f3978y;
        int size = arrayList2.size();
        int i12 = 0;
        int i13 = 0;
        float f11 = 0.0f;
        while (i12 < size) {
            q qVar = (q) arrayList2.get(i12);
            o2.d dVar = qVar.f9866a;
            int iH = t2.a.h(j);
            if (t2.a.c(j)) {
                f10 = 0.0f;
                iG = t2.a.g(j) - ((int) Math.ceil(f11));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                f10 = 0.0f;
                iG = t2.a.g(j);
            }
            b bVar = new b(dVar, this.f9848b - i13, i11, t2.b.b(iH, iG, 5));
            float fB = bVar.b() + f11;
            i2.h hVar = bVar.f9781d;
            int i14 = i13 + hVar.f11174f;
            arrayList.add(new p(bVar, qVar.f9867b, qVar.f9868c, i13, i14, f11, fB));
            if (hVar.f11172d || (i14 == this.f9848b && i12 != e5.z((ArrayList) this.f9847a.f3978y))) {
                z10 = true;
                i13 = i14;
                f11 = fB;
                break;
            } else {
                i12++;
                i13 = i14;
                f11 = fB;
            }
        }
        f10 = 0.0f;
        z10 = false;
        this.f9851e = f11;
        this.f9852f = i13;
        this.f9849c = z10;
        this.f9854h = arrayList;
        this.f9850d = t2.a.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            p pVar2 = (p) arrayList.get(i15);
            ?? r72 = pVar2.f9859a.f9783f;
            ArrayList arrayList4 = new ArrayList(r72.size());
            int size3 = r72.size();
            int i16 = 0;
            while (i16 < size3) {
                f1.c cVar = (f1.c) r72.get(i16);
                if (cVar != null) {
                    float f12 = pVar2.f9864f;
                    pVar = pVar2;
                    cVarC = cVar.c((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
                } else {
                    pVar = pVar2;
                    cVarC = null;
                }
                arrayList4.add(cVarC);
                i16++;
                pVar2 = pVar;
            }
            mq.t.d0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f9847a.f3975g).size()) {
            int size4 = ((List) this.f9847a.f3975g).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i17 = 0; i17 < size4; i17++) {
                arrayList5.add(null);
            }
            arrayList3 = mq.o.E0(arrayList3, arrayList5);
        }
        this.f9853g = arrayList3;
    }

    public static void a(m mVar, g1.p pVar, g1.f0 f0Var, float f10, g1.h0 h0Var, r2.l lVar, i1.c cVar) {
        pVar.g();
        ArrayList arrayList = mVar.f9854h;
        if (arrayList.size() <= 1 || (f0Var instanceof g1.k0)) {
            o2.j.a(mVar, pVar, f0Var, f10, h0Var, lVar, cVar);
        } else {
            if (!(f0Var instanceof g1.o)) {
                throw new bf.n();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                p pVar2 = (p) arrayList.get(i10);
                fB += pVar2.f9859a.b();
                fMax = Math.max(fMax, pVar2.f9859a.c());
            }
            Float.floatToRawIntBits(fMax);
            Float.floatToRawIntBits(fB);
            Shader shader = ((g1.o) f0Var).f9262g;
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = ((p) arrayList.get(i11)).f9859a;
                bVar.f(pVar, new g1.o(shader), f10, h0Var, lVar, cVar);
                pVar.m(0.0f, bVar.b());
                matrix.setTranslate(0.0f, -bVar.b());
                shader.setLocalMatrix(matrix);
            }
        }
        pVar.n();
    }

    public final void b(int i10) {
        boolean z10 = false;
        cj.a aVar = this.f9847a;
        if (i10 >= 0 && i10 <= ((f) aVar.f3974d).f9811d.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbU = h0.b.u("offset(", i10, ") is out of bounds [0, ");
        sbU.append(((f) aVar.f3974d).f9811d.length());
        sbU.append(']');
        m2.a.a(sbU.toString());
    }

    public final void c(int i10) {
        boolean z10 = false;
        int i11 = this.f9852f;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        m2.a.a("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')');
    }
}
