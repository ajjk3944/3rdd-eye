package mu;

/* loaded from: classes.dex */
public final class n extends a {

    /* renamed from: f, reason: collision with root package name */
    public final lu.l f17020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(lu.c cVar, lu.l lVar, String str) {
        super(cVar, str);
        br.l.e(cVar, "json");
        br.l.e(lVar, "value");
        this.f17020f = lVar;
        this.f17001a.add("primitive");
    }

    @Override // mu.a
    public final lu.l E(String str) {
        br.l.e(str, "tag");
        if (str == "primitive") {
            return this.f17020f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // mu.a
    public final lu.l S() {
        return this.f17020f;
    }

    @Override // ju.a
    public final int t(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        return 0;
    }
}
