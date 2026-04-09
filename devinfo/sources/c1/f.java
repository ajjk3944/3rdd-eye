package c1;

import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2554c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2555d;

    public /* synthetic */ f(Object obj, Object obj2, int i4, int i10) {
        this.f2552a = i10;
        this.f2554c = obj;
        this.f2555d = obj2;
        this.f2553b = i4;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2552a) {
            case 0:
                ((Integer) obj2).intValue();
                int iZ = u0.q.z(this.f2553b) | 1;
                ((h) this.f2554c).e(this.f2555d, (u0.p) obj, iZ);
                break;
            case 1:
                ((Integer) obj2).intValue();
                u0.q.a((p.r) this.f2554c, (mk.e) this.f2555d, (u0.p) obj, u0.q.z(this.f2553b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                u0.q.b((p.r[]) this.f2554c, (mk.e) this.f2555d, (u0.p) obj, u0.q.z(this.f2553b | 1));
                break;
        }
        return u.f37649a;
    }
}
