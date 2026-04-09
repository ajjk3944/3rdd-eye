package r;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f21097a;

    /* renamed from: d, reason: collision with root package name */
    public c f21098d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21099g;

    public b(c cVar, c cVar2, int i10) {
        this.f21099g = i10;
        this.f21097a = cVar2;
        this.f21098d = cVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f21097a == cVar && cVar == this.f21098d) {
            this.f21098d = null;
            this.f21097a = null;
        }
        c cVar3 = this.f21097a;
        if (cVar3 == cVar) {
            switch (this.f21099g) {
                case 0:
                    cVar2 = cVar3.f21103r;
                    break;
                default:
                    cVar2 = cVar3.f21102g;
                    break;
            }
            this.f21097a = cVar2;
        }
        c cVar4 = this.f21098d;
        if (cVar4 == cVar) {
            c cVar5 = this.f21097a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f21098d = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f21099g) {
            case 0:
                return cVar.f21102g;
            default:
                return cVar.f21103r;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21098d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f21098d;
        c cVar2 = this.f21097a;
        this.f21098d = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
