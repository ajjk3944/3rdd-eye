package com.google.gson.internal.bind;

import com.google.gson.internal.m;
import com.google.gson.j;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ObjectTypeAdapter extends w {

    /* renamed from: c, reason: collision with root package name */
    public static final x f20772c = new AnonymousClass1(v.f20895a);

    /* renamed from: a, reason: collision with root package name */
    public final j f20773a;

    /* renamed from: b, reason: collision with root package name */
    public final v f20774b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements x {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f20775a;

        public AnonymousClass1(v vVar) {
            this.f20775a = vVar;
        }

        @Override // com.google.gson.x
        public final w a(j jVar, xf.a aVar) {
            if (aVar.f37087a == Object.class) {
                return new ObjectTypeAdapter(jVar, this.f20775a);
            }
            return null;
        }
    }

    public ObjectTypeAdapter(j jVar, v vVar) {
        this.f20773a = jVar;
        this.f20774b = vVar;
    }

    public static x d(v vVar) {
        return vVar == v.f20895a ? f20772c : new AnonymousClass1(vVar);
    }

    @Override // com.google.gson.w
    public final Object b(yf.b bVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iZ = bVar.Z();
        int iC = i3.e.c(iZ);
        if (iC == 0) {
            bVar.c();
            arrayList = new ArrayList();
        } else if (iC != 2) {
            arrayList = null;
        } else {
            bVar.e();
            arrayList = new m(true);
        }
        if (arrayList == null) {
            return e(bVar, iZ);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (bVar.A()) {
                String strT = arrayList instanceof Map ? bVar.T() : null;
                int iZ2 = bVar.Z();
                int iC2 = i3.e.c(iZ2);
                if (iC2 == 0) {
                    bVar.c();
                    arrayList2 = new ArrayList();
                } else if (iC2 != 2) {
                    arrayList2 = null;
                } else {
                    bVar.e();
                    arrayList2 = new m(true);
                }
                boolean z3 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = e(bVar, iZ2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strT, arrayList2);
                }
                if (z3) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    bVar.p();
                } else {
                    bVar.v();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.w
    public final void c(yf.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.A();
            return;
        }
        Class<?> cls = obj.getClass();
        j jVar = this.f20773a;
        jVar.getClass();
        w wVarD = jVar.d(new xf.a(cls));
        if (!(wVarD instanceof ObjectTypeAdapter)) {
            wVarD.c(cVar, obj);
        } else {
            cVar.g();
            cVar.v();
        }
    }

    public final Serializable e(yf.b bVar, int i4) throws IOException {
        int iC = i3.e.c(i4);
        if (iC == 5) {
            return bVar.X();
        }
        if (iC == 6) {
            return this.f20774b.a(bVar);
        }
        if (iC == 7) {
            return Boolean.valueOf(bVar.G());
        }
        if (iC != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(r5.c.v(i4)));
        }
        bVar.V();
        return null;
    }
}
