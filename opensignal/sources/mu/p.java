package mu;

/* loaded from: classes.dex */
public final class p extends a {

    /* renamed from: f, reason: collision with root package name */
    public final lu.e f17025f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17026g;

    /* renamed from: h, reason: collision with root package name */
    public int f17027h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(lu.c cVar, lu.e eVar) {
        super(cVar, null);
        br.l.e(cVar, "json");
        this.f17025f = eVar;
        this.f17026g = eVar.f15937a.size();
        this.f17027h = -1;
    }

    @Override // mu.a
    public final lu.l E(String str) throws NumberFormatException {
        br.l.e(str, "tag");
        return (lu.l) this.f17025f.f15937a.get(Integer.parseInt(str));
    }

    @Override // mu.a
    public final String Q(iu.e eVar, int i10) {
        br.l.e(eVar, "descriptor");
        return String.valueOf(i10);
    }

    @Override // mu.a
    public final lu.l S() {
        return this.f17025f;
    }

    @Override // ju.a
    public final int t(iu.e eVar) {
        br.l.e(eVar, "descriptor");
        int i10 = this.f17027h;
        if (i10 >= this.f17026g - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f17027h = i11;
        return i11;
    }
}
