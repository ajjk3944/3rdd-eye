package t5;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import r0.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f34235a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f34236b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f34237c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f34238d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f34239e;

    /* renamed from: f, reason: collision with root package name */
    public final f f34240f;
    public final Object g;

    /* JADX WARN: Type inference failed for: r1v5, types: [t5.f] */
    public g(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f34235a = workDatabase_Impl;
        f0 f0Var = new f0(workDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, workDatabase_Impl.j, new c0.a(1, this, g.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 1));
        this.f34236b = f0Var;
        this.f34237c = new LinkedHashMap();
        this.f34238d = new ReentrantLock();
        this.f34239e = new i0(4, this);
        final int i4 = 0;
        this.f34240f = new mk.a(this) { // from class: t5.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f34224b;

            {
                this.f34224b = this;
            }

            @Override // mk.a
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        this.f34224b.getClass();
                        return yj.u.f37649a;
                    default:
                        WorkDatabase_Impl workDatabase_Impl2 = this.f34224b.f34235a;
                        return Boolean.valueOf(!workDatabase_Impl2.j() || workDatabase_Impl2.m());
                }
            }
        };
        nk.k.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.g = new Object();
        final int i10 = 1;
        f0Var.f34234k = new mk.a(this) { // from class: t5.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f34224b;

            {
                this.f34224b = this;
            }

            @Override // mk.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        this.f34224b.getClass();
                        return yj.u.f37649a;
                    default:
                        WorkDatabase_Impl workDatabase_Impl2 = this.f34224b.f34235a;
                        return Boolean.valueOf(!workDatabase_Impl2.j() || workDatabase_Impl2.m());
                }
            }
        };
    }

    public final Object a(ek.j jVar) {
        Object objF;
        WorkDatabase_Impl workDatabase_Impl = this.f34235a;
        return ((!workDatabase_Impl.j() || workDatabase_Impl.m()) && (objF = this.f34236b.f(jVar)) == dk.a.f22275a) ? objF : yj.u.f37649a;
    }
}
