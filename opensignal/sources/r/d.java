package r;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f21104a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21105d = true;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f21106g;

    public d(f fVar) {
        this.f21106g = fVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2 = this.f21104a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f21103r;
            this.f21104a = cVar3;
            this.f21105d = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21105d) {
            return this.f21106g.f21107a != null;
        }
        c cVar = this.f21104a;
        return (cVar == null || cVar.f21102g == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21105d) {
            this.f21105d = false;
            this.f21104a = this.f21106g.f21107a;
        } else {
            c cVar = this.f21104a;
            this.f21104a = cVar != null ? cVar.f21102g : null;
        }
        return this.f21104a;
    }
}
