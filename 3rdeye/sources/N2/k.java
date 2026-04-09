package N2;

import N2.j;
import R2.q;
import android.util.Log;
import com.bumptech.glide.i;
import i3.C4455a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DecodePath.java */
/* loaded from: classes.dex */
public final class k<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<DataType> f4545a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends L2.j<DataType, ResourceType>> f4546b;

    /* renamed from: c, reason: collision with root package name */
    public final Z2.b<ResourceType, Transcode> f4547c;

    /* renamed from: d, reason: collision with root package name */
    public final C4455a.c f4548d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4549e;

    public k(Class cls, Class cls2, Class cls3, List list, Z2.b bVar, C4455a.c cVar) {
        this.f4545a = cls;
        this.f4546b = list;
        this.f4547c = bVar;
        this.f4548d = cVar;
        this.f4549e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final u a(int i, int i10, L2.h hVar, j.b bVar, com.bumptech.glide.load.data.e eVar) throws q {
        u uVarA;
        L2.l lVar;
        L2.c cVarB;
        boolean z10;
        boolean z11;
        L2.f fVar;
        C4455a.c cVar = this.f4548d;
        List<Throwable> list = (List) cVar.a();
        try {
            u<ResourceType> uVarB = b(eVar, i, i10, hVar, list);
            cVar.b(list);
            j jVar = j.this;
            jVar.getClass();
            Class<?> cls = uVarB.get().getClass();
            L2.a aVar = L2.a.RESOURCE_DISK_CACHE;
            L2.a aVar2 = bVar.f4537a;
            i<R> iVar = jVar.f4510b;
            L2.k kVarA = null;
            if (aVar2 != aVar) {
                L2.l lVarE = iVar.e(cls);
                lVar = lVarE;
                uVarA = lVarE.a(jVar.i, uVarB, jVar.f4520m, jVar.f4521n);
            } else {
                uVarA = uVarB;
                lVar = null;
            }
            if (!uVarB.equals(uVarA)) {
                uVarB.a();
            }
            if (iVar.f4489c.b().f22259d.a(uVarA.c()) != null) {
                com.bumptech.glide.i iVarB = iVar.f4489c.b();
                iVarB.getClass();
                kVarA = iVarB.f22259d.a(uVarA.c());
                if (kVarA == null) {
                    throw new i.d(uVarA.c());
                }
                cVarB = kVarA.b(jVar.f4523p);
            } else {
                cVarB = L2.c.NONE;
            }
            L2.k kVar = kVarA;
            L2.f fVar2 = jVar.f4531x;
            ArrayList arrayListB = iVar.b();
            int size = arrayListB.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z10 = false;
                    break;
                }
                if (((q.a) arrayListB.get(i11)).f11686a.equals(fVar2)) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            if (jVar.f4522o.d(!z10, aVar2, cVarB)) {
                if (kVar == null) {
                    throw new i.d(uVarA.get().getClass());
                }
                int i12 = j.a.f4536c[cVarB.ordinal()];
                if (i12 == 1) {
                    z11 = true;
                    fVar = new f(jVar.f4531x, jVar.f4517j);
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("Unknown strategy: " + cVarB);
                    }
                    z11 = true;
                    fVar = new w(iVar.f4489c.f22245a, jVar.f4531x, jVar.f4517j, jVar.f4520m, jVar.f4521n, lVar, cls, jVar.f4523p);
                }
                t<Z> tVar = (t) t.f4633f.a();
                tVar.f4637e = false;
                tVar.f4636d = z11;
                tVar.f4635c = uVarA;
                j.c<?> cVar2 = jVar.f4515g;
                cVar2.f4539a = fVar;
                cVar2.f4540b = kVar;
                cVar2.f4541c = tVar;
                uVarA = tVar;
            }
            return this.f4547c.c(uVarA, hVar);
        } catch (Throwable th) {
            cVar.b(list);
            throw th;
        }
    }

    public final u<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i, int i10, L2.h hVar, List<Throwable> list) throws q {
        List<? extends L2.j<DataType, ResourceType>> list2 = this.f4546b;
        int size = list2.size();
        u<ResourceType> uVarB = null;
        for (int i11 = 0; i11 < size; i11++) {
            L2.j<DataType, ResourceType> jVar = list2.get(i11);
            try {
                if (jVar.a(eVar.a(), hVar)) {
                    uVarB = jVar.b(eVar.a(), i, i10, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e4) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e4);
                }
                list.add(e4);
            }
            if (uVarB != null) {
                break;
            }
        }
        if (uVarB != null) {
            return uVarB;
        }
        throw new q(this.f4549e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f4545a + ", decoders=" + this.f4546b + ", transcoder=" + this.f4547c + '}';
    }
}
