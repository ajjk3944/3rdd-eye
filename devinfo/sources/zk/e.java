package zk;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e extends nk.i implements mk.f {

    /* renamed from: i, reason: collision with root package name */
    public static final e f38330i = new e(3, h.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f38337b;
        hVar.getClass();
        if (obj3 == j.f38355l) {
            obj3 = new m(hVar.r());
        }
        return new o(obj3);
    }
}
