package c1;

import j0.v0;
import java.util.List;
import java.util.Set;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2551e;

    public /* synthetic */ e(int i4, int i10, Object obj, Object obj2, Object obj3) {
        this.f2547a = i10;
        this.f2549c = obj;
        this.f2548b = obj2;
        this.f2551e = obj3;
        this.f2550d = i4;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2547a) {
            case 0:
                ((Integer) obj2).intValue();
                int iZ = u0.q.z(this.f2550d) | 1;
                ((h) this.f2549c).d(this.f2548b, this.f2551e, (u0.p) obj, iZ);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iZ2 = u0.q.z(this.f2550d | 1);
                ((f1.e) this.f2551e).e(this.f2548b, (h) this.f2549c, (u0.p) obj, iZ2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iZ3 = u0.q.z(1);
                j0.m.d((i0.j) this.f2549c, this.f2548b, this.f2550d, this.f2551e, (u0.p) obj, iZ3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iZ4 = u0.q.z(this.f2550d | 1);
                ((v0) this.f2551e).e(this.f2548b, (h) this.f2549c, (u0.p) obj, iZ4);
                break;
            default:
                ((Integer) obj2).getClass();
                ((tg.o) this.f2549c).p0((List) this.f2548b, (Set) this.f2551e, (u0.p) obj, u0.q.z(this.f2550d | 1));
                break;
        }
        return u.f37649a;
    }

    public /* synthetic */ e(f1.c cVar, Object obj, h hVar, int i4, int i10) {
        this.f2547a = i10;
        this.f2551e = cVar;
        this.f2548b = obj;
        this.f2549c = hVar;
        this.f2550d = i4;
    }

    public /* synthetic */ e(i0.j jVar, Object obj, int i4, Object obj2, int i10) {
        this.f2547a = 2;
        this.f2549c = jVar;
        this.f2548b = obj;
        this.f2550d = i4;
        this.f2551e = obj2;
    }
}
