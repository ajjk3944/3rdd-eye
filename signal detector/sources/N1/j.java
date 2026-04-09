package n1;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l1.InterfaceC2639e;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Class f22234a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22235b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.a f22236c;

    /* renamed from: d, reason: collision with root package name */
    public final Q.b f22237d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22238e;

    public j(Class cls, Class cls2, Class cls3, List list, z1.a aVar, V2.e eVar) {
        this.f22234a = cls;
        this.f22235b = list;
        this.f22236c = aVar;
        this.f22237d = eVar;
        this.f22238e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final z a(int i, int i3, L2.w wVar, com.bumptech.glide.load.data.f fVar, l1.h hVar) {
        z zVarB;
        l1.l lVar;
        int iO;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object eVar;
        Q.b bVar = this.f22237d;
        List list = (List) bVar.h();
        H1.g.c(list, "Argument must not be null");
        try {
            z zVarB2 = b(fVar, i, i3, hVar, list);
            bVar.d(list);
            i iVar = (i) wVar.f2570c;
            int i6 = wVar.f2569b;
            h hVar2 = iVar.f22221a;
            Class<?> cls = zVarB2.get().getClass();
            l1.k kVarV = null;
            if (i6 != 4) {
                l1.l lVarE = hVar2.e(cls);
                lVar = lVarE;
                zVarB = lVarE.b(iVar.f22228h, zVarB2, iVar.f22231l, iVar.f22232m);
            } else {
                zVarB = zVarB2;
                lVar = null;
            }
            if (!zVarB2.equals(zVarB)) {
                zVarB2.b();
            }
            if (hVar2.f22187c.b().f6516d.v(zVarB.e()) != null) {
                kVarV = hVar2.f22187c.b().f6516d.v(zVarB.e());
                if (kVarV == null) {
                    throw new com.bumptech.glide.i(zVarB.e());
                }
                iO = kVarV.o(iVar.f22203C);
            } else {
                iO = 3;
            }
            l1.k kVar = kVarV;
            InterfaceC2639e interfaceC2639e = iVar.f22211K;
            ArrayList arrayListB = hVar2.b();
            int size = arrayListB.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z6 = false;
                    break;
                }
                if (((r1.q) arrayListB.get(i7)).f23368a.equals(interfaceC2639e)) {
                    z6 = true;
                    break;
                }
                i7++;
            }
            switch (iVar.f22233n.f22242a) {
                default:
                    z7 = true;
                    if (((z6 || i6 != 3) && i6 != 1) || iO != 2) {
                    }
                    break;
                case 0:
                case 1:
                    z7 = false;
                    break;
            }
            if (z7) {
                if (kVar == null) {
                    throw new com.bumptech.glide.i(zVarB.get().getClass());
                }
                int iC = AbstractC2984e.c(iO);
                if (iC == 0) {
                    z8 = false;
                    z9 = true;
                    eVar = new e(iVar.f22211K, iVar.i);
                } else {
                    if (iC != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(iO != 1 ? iO != 2 ? iO != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z8 = false;
                    z9 = true;
                    eVar = new B(hVar2.f22187c.f6498a, iVar.f22211K, iVar.i, iVar.f22231l, iVar.f22232m, lVar, cls, iVar.f22203C);
                }
                y yVar = (y) y.f22305e.h();
                yVar.f22309d = z8;
                yVar.f22308c = z9;
                yVar.f22307b = zVarB;
                V2.e eVar2 = iVar.f22226f;
                eVar2.f3868b = eVar;
                eVar2.f3869c = kVar;
                eVar2.f3870d = yVar;
                zVarB = yVar;
            }
            return this.f22236c.b(zVarB, hVar);
        } catch (Throwable th) {
            bVar.d(list);
            throw th;
        }
    }

    public final z b(com.bumptech.glide.load.data.f fVar, int i, int i3, l1.h hVar, List list) throws v {
        List list2 = this.f22235b;
        int size = list2.size();
        z zVarB = null;
        for (int i6 = 0; i6 < size; i6++) {
            l1.j jVar = (l1.j) list2.get(i6);
            try {
                if (jVar.a(fVar.c(), hVar)) {
                    zVarB = jVar.b(fVar.c(), i, i3, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e6) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e6);
                }
                list.add(e6);
            }
            if (zVarB != null) {
                break;
            }
        }
        if (zVarB != null) {
            return zVarB;
        }
        throw new v(this.f22238e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f22234a + ", decoders=" + this.f22235b + ", transcoder=" + this.f22236c + '}';
    }
}
