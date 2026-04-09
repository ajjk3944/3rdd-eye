package com.google.gson.internal.bind;

import com.google.android.gms.internal.ads.im1;
import com.google.gson.internal.i;
import com.google.gson.internal.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.w;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
class JsonElementTypeAdapter extends w {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonElementTypeAdapter f20764a = new JsonElementTypeAdapter();

    private JsonElementTypeAdapter() {
    }

    public static l d(yf.b bVar, int i4) throws IOException {
        int iC = i3.e.c(i4);
        if (iC == 5) {
            return new p(bVar.X());
        }
        if (iC == 6) {
            return new p(new i(bVar.X()));
        }
        if (iC == 7) {
            return new p(Boolean.valueOf(bVar.G()));
        }
        if (iC != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(r5.c.v(i4)));
        }
        bVar.V();
        return n.f20892a;
    }

    public static void e(yf.c cVar, l lVar) throws IOException {
        if (lVar == null || (lVar instanceof n)) {
            cVar.A();
            return;
        }
        boolean z3 = lVar instanceof p;
        if (z3) {
            if (!z3) {
                throw new IllegalStateException("Not a JSON Primitive: " + lVar);
            }
            p pVar = (p) lVar;
            Serializable serializable = pVar.f20894a;
            if (serializable instanceof Number) {
                cVar.T(pVar.c());
                return;
            } else if (serializable instanceof Boolean) {
                cVar.V(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(pVar.d()));
                return;
            } else {
                cVar.U(pVar.d());
                return;
            }
        }
        boolean z10 = lVar instanceof k;
        if (z10) {
            cVar.e();
            if (!z10) {
                throw new IllegalStateException("Not a JSON Array: " + lVar);
            }
            ArrayList arrayList = ((k) lVar).f20891a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                e(cVar, (l) obj);
            }
            cVar.p();
            return;
        }
        boolean z11 = lVar instanceof o;
        if (!z11) {
            throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
        }
        cVar.g();
        if (!z11) {
            throw new IllegalStateException("Not a JSON Object: " + lVar);
        }
        Iterator it = ((com.google.gson.internal.k) ((o) lVar).f20893a.entrySet()).iterator();
        while (((im1) it).hasNext()) {
            com.google.gson.internal.l lVarA = ((j) it).a();
            cVar.w((String) lVarA.getKey());
            e(cVar, (l) lVarA.getValue());
        }
        cVar.v();
    }

    @Override // com.google.gson.w
    public final Object b(yf.b bVar) throws IOException {
        l kVar;
        l kVar2;
        int iZ = bVar.Z();
        int iC = i3.e.c(iZ);
        if (iC == 0) {
            bVar.c();
            kVar = new k();
        } else if (iC != 2) {
            kVar = null;
        } else {
            bVar.e();
            kVar = new o();
        }
        if (kVar == null) {
            return d(bVar, iZ);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (bVar.A()) {
                String strT = kVar instanceof o ? bVar.T() : null;
                int iZ2 = bVar.Z();
                int iC2 = i3.e.c(iZ2);
                if (iC2 == 0) {
                    bVar.c();
                    kVar2 = new k();
                } else if (iC2 != 2) {
                    kVar2 = null;
                } else {
                    bVar.e();
                    kVar2 = new o();
                }
                boolean z3 = kVar2 != null;
                if (kVar2 == null) {
                    kVar2 = d(bVar, iZ2);
                }
                if (kVar instanceof k) {
                    ((k) kVar).f20891a.add(kVar2);
                } else {
                    ((o) kVar).f20893a.put(strT, kVar2);
                }
                if (z3) {
                    arrayDeque.addLast(kVar);
                    kVar = kVar2;
                }
            } else {
                if (kVar instanceof k) {
                    bVar.p();
                } else {
                    bVar.v();
                }
                if (arrayDeque.isEmpty()) {
                    return kVar;
                }
                kVar = (l) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.w
    public final /* bridge */ /* synthetic */ void c(yf.c cVar, Object obj) throws IOException {
        e(cVar, (l) obj);
    }
}
