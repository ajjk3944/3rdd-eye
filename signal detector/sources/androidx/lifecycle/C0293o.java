package androidx.lifecycle;

import c5.C0412i;
import h5.InterfaceC2370d;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293o extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0294p f5250f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0293o(C0294p c0294p, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f5250f = c0294p;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        C0293o c0293o = (C0293o) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj);
        C0412i c0412i = C0412i.f5929a;
        c0293o.l(c0412i);
        return c0412i;
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        C0293o c0293o = new C0293o(this.f5250f, interfaceC2370d);
        c0293o.f5249e = obj;
        return c0293o;
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        R2.a.H(obj);
        InterfaceC3044u interfaceC3044u = (InterfaceC3044u) this.f5249e;
        C0294p c0294p = this.f5250f;
        C0300w c0300w = c0294p.f5251a;
        if (c0300w.f5259d.compareTo(EnumC0292n.f5244b) >= 0) {
            c0300w.a(c0294p);
        } else {
            AbstractC3046w.d(interfaceC3044u.k(), null);
        }
        return C0412i.f5929a;
    }
}
