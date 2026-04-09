package n0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j0 implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17191a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final s1 f17192d;

    /* renamed from: g, reason: collision with root package name */
    public final int f17193g;

    /* renamed from: r, reason: collision with root package name */
    public int f17194r;

    /* renamed from: x, reason: collision with root package name */
    public int f17195x;

    public j0(s1 s1Var, int i10, int i11) {
        this.f17192d = s1Var;
        this.f17193g = i11;
        this.f17194r = i10;
        this.f17195x = s1Var.D;
        if (s1Var.B) {
            u1.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17191a) {
            case 0:
                return this.f17194r < this.f17193g;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f17191a) {
            case 0:
                s1 s1Var = this.f17192d;
                int i10 = s1Var.D;
                int i11 = this.f17195x;
                if (i10 != i11) {
                    u1.f();
                }
                int i12 = this.f17194r;
                this.f17194r = u1.a(s1Var.f17310a, i12) + i12;
                return new t1(s1Var, i12, i11);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f17191a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j0(s1 s1Var, int i10, k0 k0Var, w wVar) {
        this.f17192d = s1Var;
        this.f17193g = i10;
        this.f17194r = s1Var.D;
    }
}
