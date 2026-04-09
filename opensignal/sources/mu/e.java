package mu;

/* loaded from: classes.dex */
public final class e extends ab.g {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f17012r;

    public e(ag.b bVar, boolean z10) {
        super((Object) bVar, 10, false);
        this.f17012r = z10;
    }

    @Override // ab.g
    public final void v(String str) {
        br.l.e(str, "value");
        if (this.f17012r) {
            super.v(str);
        } else {
            t(str);
        }
    }
}
