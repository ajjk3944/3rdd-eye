package c1;

import java.util.ArrayList;
import nk.x;
import u0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f2557a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2558b;

    /* renamed from: c, reason: collision with root package name */
    public yj.c f2559c;

    /* renamed from: d, reason: collision with root package name */
    public m1 f2560d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f2561e;

    public h(int i4, boolean z3, yj.c cVar) {
        this.f2557a = i4;
        this.f2558b = z3;
        this.f2559c = cVar;
    }

    @Override // mk.f
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return e(obj, (u0.p) obj2, ((Number) obj3).intValue());
    }

    @Override // mk.g
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (u0.p) obj3, ((Number) obj4).intValue());
    }

    public final Object c(int i4, u0.p pVar) {
        pVar.X(this.f2557a);
        f(pVar);
        int iA = i4 | (pVar.f(this) ? n.a(2, 0) : n.a(1, 0));
        yj.c cVar = this.f2559c;
        x.d(2, cVar);
        Object objInvoke = ((mk.e) cVar).invoke(pVar, Integer.valueOf(iA));
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new g(2, this, h.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    public final Object d(Object obj, Object obj2, u0.p pVar, int i4) {
        pVar.X(this.f2557a);
        f(pVar);
        int iA = pVar.f(this) ? n.a(2, 2) : n.a(1, 2);
        yj.c cVar = this.f2559c;
        x.d(4, cVar);
        Object objB = ((mk.g) cVar).b(obj, obj2, pVar, Integer.valueOf(iA | i4));
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new e(i4, 0, this, obj, obj2);
        }
        return objB;
    }

    public final Object e(Object obj, u0.p pVar, int i4) {
        pVar.X(this.f2557a);
        f(pVar);
        int iA = pVar.f(this) ? n.a(2, 1) : n.a(1, 1);
        yj.c cVar = this.f2559c;
        x.d(3, cVar);
        Object objA = ((mk.f) cVar).a(obj, pVar, Integer.valueOf(iA | i4));
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new f(this, obj, i4, 0);
        }
        return objA;
    }

    public final void f(u0.p pVar) {
        m1 m1VarX;
        if (!this.f2558b || (m1VarX = pVar.x()) == null) {
            return;
        }
        m1VarX.f34868b |= 1;
        if (n.d(this.f2560d, m1VarX)) {
            this.f2560d = m1VarX;
            return;
        }
        ArrayList arrayList = this.f2561e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f2561e = arrayList2;
            arrayList2.add(m1VarX);
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (n.d((m1) arrayList.get(i4), m1VarX)) {
                arrayList.set(i4, m1VarX);
                return;
            }
        }
        arrayList.add(m1VarX);
    }

    @Override // mk.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return c(((Number) obj2).intValue(), (u0.p) obj);
    }
}
