package Li;

import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    private static final Ni.C f11890a = new Ni.C("NONE");

    /* renamed from: b, reason: collision with root package name */
    private static final Ni.C f11891b = new Ni.C("PENDING");

    public static final z a(Object obj) {
        if (obj == null) {
            obj = Mi.r.f13298a;
        }
        return new O(obj);
    }

    public static final InterfaceC3220g d(N n10, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != Ki.a.DROP_OLDEST) ? F.e(n10, interfaceC5384i, i10, aVar) : n10;
    }
}
