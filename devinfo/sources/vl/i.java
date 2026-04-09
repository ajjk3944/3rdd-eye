package vl;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends ul.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f36325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ec.q f36326f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, r rVar, ec.q qVar) {
        super(str);
        this.f36325e = rVar;
        this.f36326f = qVar;
    }

    @Override // ul.a
    public final long a() throws InterruptedException {
        q qVar;
        r rVar = this.f36325e;
        try {
            qVar = rVar.d();
        } catch (Throwable th2) {
            qVar = new q(rVar, th2, 2);
        }
        ec.q qVar2 = this.f36326f;
        if (!((CopyOnWriteArrayList) qVar2.f22999f).contains(rVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) qVar2.g).put(qVar);
        return -1L;
    }
}
