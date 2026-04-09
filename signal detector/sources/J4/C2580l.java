package j4;

import com.google.android.gms.internal.ads.AbstractC2012vK;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import o4.AbstractC2763b;
import o4.C2762a;
import o4.C2764c;
import x.AbstractC2984e;

/* renamed from: j4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2580l extends g4.z {

    /* renamed from: a, reason: collision with root package name */
    public static final C2580l f21428a = new C2580l();

    private C2580l() {
    }

    public static g4.o d(C2762a c2762a, int i) {
        int iC = AbstractC2984e.c(i);
        if (iC == 5) {
            return new g4.s(c2762a.z());
        }
        if (iC == 6) {
            return new g4.s(new i4.k(c2762a.z()));
        }
        if (iC == 7) {
            return new g4.s(Boolean.valueOf(c2762a.r()));
        }
        if (iC != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC2763b.j(i)));
        }
        c2762a.x();
        return g4.q.f20242a;
    }

    public static void e(C2764c c2764c, g4.o oVar) {
        if (oVar == null || (oVar instanceof g4.q)) {
            c2764c.o();
            return;
        }
        boolean z6 = oVar instanceof g4.s;
        if (z6) {
            if (!z6) {
                throw new IllegalStateException("Not a JSON Primitive: " + oVar);
            }
            g4.s sVar = (g4.s) oVar;
            Serializable serializable = sVar.f20244a;
            if (serializable instanceof Number) {
                c2764c.v(sVar.b());
                return;
            } else if (serializable instanceof Boolean) {
                c2764c.x(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(sVar.c()));
                return;
            } else {
                c2764c.w(sVar.c());
                return;
            }
        }
        boolean z7 = oVar instanceof g4.n;
        if (z7) {
            c2764c.b();
            if (!z7) {
                throw new IllegalStateException("Not a JSON Array: " + oVar);
            }
            ArrayList arrayList = ((g4.n) oVar).f20241a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e(c2764c, (g4.o) obj);
            }
            c2764c.h();
            return;
        }
        boolean z8 = oVar instanceof g4.r;
        if (!z8) {
            throw new IllegalArgumentException("Couldn't write " + oVar.getClass());
        }
        c2764c.d();
        if (!z8) {
            throw new IllegalStateException("Not a JSON Object: " + oVar);
        }
        Iterator it = ((i4.m) ((g4.r) oVar).f20243a.entrySet()).iterator();
        while (((AbstractC2012vK) it).hasNext()) {
            i4.n nVarA = ((i4.l) it).a();
            c2764c.m((String) nVarA.getKey());
            e(c2764c, (g4.o) nVarA.getValue());
        }
        c2764c.k();
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        g4.o nVar;
        g4.o nVar2;
        int iB = c2762a.B();
        int iC = AbstractC2984e.c(iB);
        if (iC == 0) {
            c2762a.a();
            nVar = new g4.n();
        } else if (iC != 2) {
            nVar = null;
        } else {
            c2762a.b();
            nVar = new g4.r();
        }
        if (nVar == null) {
            return d(c2762a, iB);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c2762a.o()) {
                String strV = nVar instanceof g4.r ? c2762a.v() : null;
                int iB2 = c2762a.B();
                int iC2 = AbstractC2984e.c(iB2);
                if (iC2 == 0) {
                    c2762a.a();
                    nVar2 = new g4.n();
                } else if (iC2 != 2) {
                    nVar2 = null;
                } else {
                    c2762a.b();
                    nVar2 = new g4.r();
                }
                boolean z6 = nVar2 != null;
                if (nVar2 == null) {
                    nVar2 = d(c2762a, iB2);
                }
                if (nVar instanceof g4.n) {
                    ((g4.n) nVar).f20241a.add(nVar2);
                } else {
                    ((g4.r) nVar).f20243a.put(strV, nVar2);
                }
                if (z6) {
                    arrayDeque.addLast(nVar);
                    nVar = nVar2;
                }
            } else {
                if (nVar instanceof g4.n) {
                    c2762a.h();
                } else {
                    c2762a.k();
                }
                if (arrayDeque.isEmpty()) {
                    return nVar;
                }
                nVar = (g4.o) arrayDeque.removeLast();
            }
        }
    }

    @Override // g4.z
    public final /* bridge */ /* synthetic */ void c(C2764c c2764c, Object obj) {
        e(c2764c, (g4.o) obj);
    }
}
