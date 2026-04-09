package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e81 extends a5 {
    @Override // defpackage.b5
    public final boolean b() {
        if (!super.b() || !ob1.n("MULTI_PROCESS")) {
            return false;
        }
        int i = c81.a;
        if (f81.b.b()) {
            return g81.a.getStatics().isMultiProcessEnabled();
        }
        throw f81.a();
    }
}
