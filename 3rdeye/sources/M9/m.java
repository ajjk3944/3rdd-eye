package M9;

import E.u;
import Q9.C1545n0;
import Q9.y0;
import b9.m;
import c9.C2092m;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.A;
import p9.InterfaceC5480a;
import w9.InterfaceC5748c;

/* compiled from: Serializers.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class m {

    /* compiled from: Serializers.kt */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<InterfaceC5748c> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4362g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(0);
            this.f4362g = arrayList;
        }

        @Override // p9.InterfaceC5480a
        public final InterfaceC5748c invoke() {
            return ((w9.j) this.f4362g.get(0)).f();
        }
    }

    public static final b<Object> a(I9.g gVar, w9.j jVar, boolean z10) {
        b<? extends Object> bVarD;
        b bVarQ;
        InterfaceC5748c clazz = C1545n0.c(jVar);
        boolean zB = jVar.b();
        List<w9.k> listE = jVar.e();
        ArrayList arrayList = new ArrayList(C2092m.T(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            A a10 = ((w9.k) it.next()).f47595b;
            if (a10 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + jVar).toString());
            }
            arrayList.add(a10);
        }
        if (arrayList.isEmpty()) {
            y0<? extends Object> y0Var = k.f4353a;
            kotlin.jvm.internal.l.f(clazz, "clazz");
            if (zB) {
                bVarD = k.f4354b.d(clazz);
            } else {
                bVarD = k.f4353a.d(clazz);
                if (bVarD == null) {
                    bVarD = null;
                }
            }
        } else {
            y0<? extends Object> y0Var2 = k.f4353a;
            kotlin.jvm.internal.l.f(clazz, "clazz");
            Object objB = !zB ? k.f4355c.b(clazz, arrayList) : k.f4356d.b(clazz, arrayList);
            if (!z10) {
                if (b9.m.a(objB) == null) {
                    bVarD = (b) objB;
                }
                return null;
            }
            if (objB instanceof m.a) {
                objB = null;
            }
            bVarD = (b) objB;
        }
        if (bVarD != null) {
            return bVarD;
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayListM = u.M(gVar, arrayList, z10);
            if (arrayListM != null) {
                b bVarJ = u.J(clazz, arrayListM, new a(arrayList));
                bVarQ = bVarJ == null ? gVar.Q(clazz, arrayListM) : bVarJ;
            }
            return null;
        }
        bVarQ = gVar.Q(clazz, C2099t.f18581b);
        if (bVarQ != null) {
            return zB ? N9.a.b(bVarQ) : bVarQ;
        }
        return null;
    }
}
