package Zi;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;
import mh.InterfaceC6835l;

/* renamed from: Zi.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3741y implements S0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f25706a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f25707b;

    public C3741y(InterfaceC6835l compute) {
        AbstractC6492s.i(compute, "compute");
        this.f25706a = compute;
        this.f25707b = new ConcurrentHashMap();
    }

    @Override // Zi.S0
    public Vi.b a(th.d key) {
        Object objPutIfAbsent;
        AbstractC6492s.i(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f25707b;
        Class clsB = AbstractC6596a.b(key);
        Object c3718m = concurrentHashMap.get(clsB);
        if (c3718m == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsB, (c3718m = new C3718m((Vi.b) this.f25706a.invoke(key))))) != null) {
            c3718m = objPutIfAbsent;
        }
        return ((C3718m) c3718m).f25664a;
    }
}
