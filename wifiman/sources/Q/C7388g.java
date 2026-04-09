package q;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import r.H;

/* renamed from: q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7388g {

    /* renamed from: a, reason: collision with root package name */
    private final f0.c f58272a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f58273b;

    /* renamed from: c, reason: collision with root package name */
    private final H f58274c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f58275d;

    public C7388g(f0.c cVar, InterfaceC6835l interfaceC6835l, H h10, boolean z10) {
        this.f58272a = cVar;
        this.f58273b = interfaceC6835l;
        this.f58274c = h10;
        this.f58275d = z10;
    }

    public final f0.c a() {
        return this.f58272a;
    }

    public final H b() {
        return this.f58274c;
    }

    public final boolean c() {
        return this.f58275d;
    }

    public final InterfaceC6835l d() {
        return this.f58273b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7388g)) {
            return false;
        }
        C7388g c7388g = (C7388g) obj;
        return AbstractC6492s.d(this.f58272a, c7388g.f58272a) && AbstractC6492s.d(this.f58273b, c7388g.f58273b) && AbstractC6492s.d(this.f58274c, c7388g.f58274c) && this.f58275d == c7388g.f58275d;
    }

    public int hashCode() {
        return (((((this.f58272a.hashCode() * 31) + this.f58273b.hashCode()) * 31) + this.f58274c.hashCode()) * 31) + Boolean.hashCode(this.f58275d);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f58272a + ", size=" + this.f58273b + ", animationSpec=" + this.f58274c + ", clip=" + this.f58275d + ')';
    }
}
