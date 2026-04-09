package au;

import lq.b0;

/* loaded from: classes.dex */
public final class w implements zt.g {

    /* renamed from: a, reason: collision with root package name */
    public final yt.r f2351a;

    public w(yt.p pVar) {
        this.f2351a = pVar;
    }

    @Override // zt.g
    public final Object i(Object obj, pq.c cVar) {
        Object objA = this.f2351a.a(obj, cVar);
        return objA == qq.a.COROUTINE_SUSPENDED ? objA : b0.f15562a;
    }
}
