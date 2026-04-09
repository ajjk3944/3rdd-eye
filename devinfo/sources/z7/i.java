package z7;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Class f38040a;

    /* renamed from: b, reason: collision with root package name */
    public final List f38041b;

    /* renamed from: c, reason: collision with root package name */
    public final l8.a f38042c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.c f38043d;

    /* renamed from: e, reason: collision with root package name */
    public final String f38044e;

    public i(Class cls, Class cls2, Class cls3, List list, l8.a aVar, i0.f fVar) {
        this.f38040a = cls;
        this.f38041b = list;
        this.f38042c = aVar;
        this.f38043d = fVar;
        this.f38044e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final y a(int i4, int i10, com.bumptech.glide.load.data.f fVar, t7.m mVar, x7.h hVar) {
        y yVarA;
        x7.l lVar;
        int iO;
        boolean z3;
        boolean z10;
        boolean z11;
        boolean z12;
        Object dVar;
        d4.c cVar = this.f38043d;
        List list = (List) cVar.k();
        t8.f.c(list, "Argument must not be null");
        try {
            y yVarB = b(fVar, i4, i10, hVar, list);
            cVar.i(list);
            h hVar2 = (h) mVar.f34474c;
            int i11 = mVar.f34473b;
            g gVar = hVar2.f38016a;
            Class<?> cls = yVarB.get().getClass();
            x7.k kVarB = null;
            if (i11 != 4) {
                x7.l lVarE = gVar.e(cls);
                lVar = lVarE;
                yVarA = lVarE.a(hVar2.f38022h, yVarB, hVar2.f38025l, hVar2.f38026m);
            } else {
                yVarA = yVarB;
                lVar = null;
            }
            if (!yVarB.equals(yVarA)) {
                yVarB.a();
            }
            if (gVar.f38002c.b().f6506d.b(yVarA.b()) != null) {
                kVarB = gVar.f38002c.b().f6506d.b(yVarA.b());
                if (kVarB == null) {
                    throw new com.bumptech.glide.j(yVarA.b());
                }
                iO = kVarB.o(hVar2.f38028o);
            } else {
                iO = 3;
            }
            x7.k kVar = kVarB;
            x7.e eVar = hVar2.f38036w;
            ArrayList arrayListB = gVar.b();
            int size = arrayListB.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z3 = false;
                    break;
                }
                if (((d8.u) arrayListB.get(i12)).f22047a.equals(eVar)) {
                    z3 = true;
                    break;
                }
                i12++;
            }
            switch (hVar2.f38027n.f38048a) {
                default:
                    z10 = true;
                    if (((z3 || i11 != 3) && i11 != 1) || iO != 2) {
                    }
                    break;
                case 0:
                case 1:
                    z10 = false;
                    break;
            }
            if (z10) {
                if (kVar == null) {
                    throw new com.bumptech.glide.j(yVarA.get().getClass());
                }
                int iC = i3.e.c(iO);
                if (iC == 0) {
                    z11 = false;
                    z12 = true;
                    dVar = new d(hVar2.f38036w, hVar2.f38023i);
                } else {
                    if (iC != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(iO != 1 ? iO != 2 ? iO != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z11 = false;
                    z12 = true;
                    dVar = new a0(gVar.f38002c.f6490a, hVar2.f38036w, hVar2.f38023i, hVar2.f38025l, hVar2.f38026m, lVar, cls, hVar2.f38028o);
                }
                x xVar = (x) x.f38107e.k();
                xVar.f38111d = z11;
                xVar.f38110c = z12;
                xVar.f38109b = yVarA;
                w4.m mVar2 = hVar2.f38021f;
                mVar2.f36442a = dVar;
                mVar2.f36443b = kVar;
                mVar2.f36444c = xVar;
                yVarA = xVar;
            }
            return this.f38042c.m(yVarA, hVar);
        } catch (Throwable th2) {
            cVar.i(list);
            throw th2;
        }
    }

    public final y b(com.bumptech.glide.load.data.f fVar, int i4, int i10, x7.h hVar, List list) throws u {
        List list2 = this.f38041b;
        int size = list2.size();
        y yVarA = null;
        for (int i11 = 0; i11 < size; i11++) {
            x7.j jVar = (x7.j) list2.get(i11);
            try {
                if (jVar.b(fVar.a(), hVar)) {
                    yVarA = jVar.a(fVar.a(), i4, i10, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e2);
                }
                list.add(e2);
            }
            if (yVarA != null) {
                break;
            }
        }
        if (yVarA != null) {
            return yVarA;
        }
        throw new u(this.f38044e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f38040a + ", decoders=" + this.f38041b + ", transcoder=" + this.f38042c + '}';
    }
}
