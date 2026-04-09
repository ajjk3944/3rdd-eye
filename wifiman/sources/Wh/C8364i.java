package wh;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: wh.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C8364i extends AbstractC8348a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f65153a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f65154b;

    public C8364i(InterfaceC6835l compute) {
        AbstractC6492s.i(compute, "compute");
        this.f65153a = compute;
        this.f65154b = new ConcurrentHashMap();
    }

    @Override // wh.AbstractC8348a
    public Object a(Class key) {
        AbstractC6492s.i(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f65154b;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f65153a.invoke(key);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
