package p6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k extends b {
    @Override // p6.c
    public final boolean b() {
        if (!super.b() || !ii.a.s("MULTI_PROCESS")) {
            return false;
        }
        int i4 = o6.f.f30411a;
        if (l.f31389c.b()) {
            return m.f31394a.getStatics().isMultiProcessEnabled();
        }
        throw l.a();
    }
}
