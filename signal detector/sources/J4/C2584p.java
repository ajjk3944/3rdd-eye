package j4;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n4.C2689a;
import o4.AbstractC2763b;
import o4.C2762a;
import o4.C2764c;
import x.AbstractC2984e;

/* renamed from: j4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2584p extends g4.z {

    /* renamed from: c, reason: collision with root package name */
    public static final C2582n f21437c = new C2582n(1, g4.x.f20245a);

    /* renamed from: a, reason: collision with root package name */
    public final g4.m f21438a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.x f21439b;

    public C2584p(g4.m mVar, g4.x xVar) {
        this.f21438a = mVar;
        this.f21439b = xVar;
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iB = c2762a.B();
        int iC = AbstractC2984e.c(iB);
        if (iC == 0) {
            c2762a.a();
            arrayList = new ArrayList();
        } else if (iC != 2) {
            arrayList = null;
        } else {
            c2762a.b();
            arrayList = new i4.o(true);
        }
        if (arrayList == null) {
            return d(c2762a, iB);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c2762a.o()) {
                String strV = arrayList instanceof Map ? c2762a.v() : null;
                int iB2 = c2762a.B();
                int iC2 = AbstractC2984e.c(iB2);
                if (iC2 == 0) {
                    c2762a.a();
                    arrayList2 = new ArrayList();
                } else if (iC2 != 2) {
                    arrayList2 = null;
                } else {
                    c2762a.b();
                    arrayList2 = new i4.o(true);
                }
                boolean z6 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(c2762a, iB2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strV, arrayList2);
                }
                if (z6) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c2762a.h();
                } else {
                    c2762a.k();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        if (obj == null) {
            c2764c.o();
            return;
        }
        Class<?> cls = obj.getClass();
        g4.m mVar = this.f21438a;
        mVar.getClass();
        g4.z zVarB = mVar.b(new C2689a(cls));
        if (!(zVarB instanceof C2584p)) {
            zVarB.c(c2764c, obj);
        } else {
            c2764c.d();
            c2764c.k();
        }
    }

    public final Serializable d(C2762a c2762a, int i) {
        int iC = AbstractC2984e.c(i);
        if (iC == 5) {
            return c2762a.z();
        }
        if (iC == 6) {
            return this.f21439b.a(c2762a);
        }
        if (iC == 7) {
            return Boolean.valueOf(c2762a.r());
        }
        if (iC != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC2763b.j(i)));
        }
        c2762a.x();
        return null;
    }
}
