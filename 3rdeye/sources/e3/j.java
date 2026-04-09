package E3;

import C.e0;
import C.f0;
import G3.b;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import v3.C5677c;
import y3.h;
import y3.o;
import z3.C5859a;
import z3.g;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1397a;

    /* renamed from: b, reason: collision with root package name */
    public final z3.e f1398b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.d f1399c;

    /* renamed from: d, reason: collision with root package name */
    public final n f1400d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f1401e;

    /* renamed from: f, reason: collision with root package name */
    public final G3.b f1402f;

    /* renamed from: g, reason: collision with root package name */
    public final H3.a f1403g;

    /* renamed from: h, reason: collision with root package name */
    public final H3.a f1404h;
    public final F3.c i;

    public j(Context context, z3.e eVar, F3.d dVar, n nVar, Executor executor, G3.b bVar, H3.a aVar, H3.a aVar2, F3.c cVar) {
        this.f1397a = context;
        this.f1398b = eVar;
        this.f1399c = dVar;
        this.f1400d = nVar;
        this.f1401e = executor;
        this.f1402f = bVar;
        this.f1403g = aVar;
        this.f1404h = aVar2;
        this.i = cVar;
    }

    public final void a(y3.j jVar, int i) {
        z3.b bVarB;
        z3.k kVar = this.f1398b.get(jVar.f48075a);
        new z3.b(g.a.OK, 0L);
        final long j4 = 0;
        while (true) {
            B.i iVar = new B.i(3, this, jVar);
            G3.b bVar = this.f1402f;
            if (!((Boolean) bVar.e(iVar)).booleanValue()) {
                bVar.e(new i(this, jVar, j4));
                return;
            }
            final Iterable iterable = (Iterable) bVar.e(new e0(2, this, jVar));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (kVar == null) {
                C3.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar);
                bVarB = new z3.b(g.a.FATAL_ERROR, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((F3.g) it.next()).a());
                }
                if (jVar.c() != null) {
                    F3.c cVar = this.i;
                    Objects.requireNonNull(cVar);
                    B3.a aVar = (B3.a) bVar.e(new B.d(cVar, 5));
                    h.a aVar2 = new h.a();
                    aVar2.f48066f = new HashMap();
                    aVar2.f48064d = Long.valueOf(this.f1403g.b());
                    aVar2.f48065e = Long.valueOf(this.f1404h.b());
                    aVar2.f48061a = "GDT_CLIENT_METRICS";
                    C5677c c5677c = new C5677c("proto");
                    aVar.getClass();
                    c5.h hVar = o.f48090a;
                    hVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        hVar.a(aVar, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    aVar2.f48063c = new y3.l(c5677c, byteArrayOutputStream.toByteArray());
                    arrayList.add(kVar.a(aVar2.b()));
                }
                bVarB = kVar.b(new C5859a(arrayList, jVar.f48076b));
            }
            g.a aVar3 = g.a.TRANSIENT_ERROR;
            g.a aVar4 = bVarB.f48438a;
            if (aVar4 == aVar3) {
                final y3.j jVar2 = jVar;
                bVar.e(new b.a() { // from class: E3.h
                    @Override // G3.b.a
                    public final Object execute() {
                        j jVar3 = this.f1390b;
                        F3.d dVar = jVar3.f1399c;
                        dVar.E0(iterable);
                        dVar.O(jVar3.f1403g.b() + j4, jVar2);
                        return null;
                    }
                });
                this.f1400d.b(jVar2, i + 1, true);
                return;
            }
            y3.j jVar3 = jVar;
            bVar.e(new f0(1, this, iterable));
            if (aVar4 == g.a.OK) {
                long jMax = Math.max(j4, bVarB.f48439b);
                if (jVar3.c() != null) {
                    bVar.e(new B.f(this, 4));
                }
                j4 = jMax;
            } else if (aVar4 == g.a.INVALID_PAYLOAD) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strK = ((F3.g) it2.next()).a().k();
                    if (map.containsKey(strK)) {
                        map.put(strK, Integer.valueOf(((Integer) map.get(strK)).intValue() + 1));
                    } else {
                        map.put(strK, 1);
                    }
                }
                bVar.e(new B.i(4, this, map));
            }
            jVar = jVar3;
        }
    }
}
