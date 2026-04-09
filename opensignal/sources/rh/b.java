package rh;

import br.l;
import o5.v;
import oh.p;

/* loaded from: classes.dex */
public final class b implements oh.d {

    /* renamed from: a, reason: collision with root package name */
    public final v f21533a;

    public b(v vVar) {
        l.e(vVar, "mediaLoadDataDelegate");
        this.f21533a = vVar;
    }

    @Override // oh.d
    public final long b() {
        return this.f21533a.f19077g;
    }

    @Override // oh.d
    public final int r() {
        return this.f21533a.f19071a;
    }

    @Override // oh.d
    public final oh.l v() {
        return new p(9, this.f21533a.f19073c);
    }

    @Override // oh.d
    public final long w() {
        return this.f21533a.f19076f;
    }

    @Override // oh.d
    public final int x() {
        return this.f21533a.f19072b;
    }
}
