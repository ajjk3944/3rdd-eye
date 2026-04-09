package z5;

import c5.C0409f;
import c5.C0412i;
import h5.InterfaceC2370d;
import h5.InterfaceC2375i;
import i5.EnumC2380a;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3025a extends c0 implements InterfaceC2370d, InterfaceC3044u {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2375i f24513c;

    public AbstractC3025a(InterfaceC2375i interfaceC2375i, boolean z6) {
        super(z6);
        B((T) interfaceC2375i.h(C3043t.f24555b));
        this.f24513c = interfaceC2375i.m(this);
    }

    @Override // z5.c0
    public final void A(J0.c cVar) {
        AbstractC3046w.j(this.f24513c, cVar);
    }

    @Override // z5.c0
    public final void H(Object obj) {
        if (obj instanceof C3038n) {
            C3038n c3038n = (C3038n) obj;
            Throwable th = c3038n.f24546a;
            c3038n.getClass();
            C3038n.f24545b.get(c3038n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(EnumC3045v enumC3045v, AbstractC3025a abstractC3025a, p5.p pVar) {
        int iOrdinal = enumC3045v.ordinal();
        if (iOrdinal == 0) {
            R3.b.y(pVar, abstractC3025a, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                com.bumptech.glide.c.B(((j5.b) pVar).j(this, abstractC3025a)).e(C0412i.f5929a);
                return;
            }
            if (iOrdinal != 3) {
                throw new J0.c();
            }
            try {
                InterfaceC2375i interfaceC2375i = this.f24513c;
                Object objK = E5.a.k(interfaceC2375i, null);
                try {
                    q5.r.c(2, pVar);
                    Object objH = pVar.h(abstractC3025a, this);
                    if (objH != EnumC2380a.f20635a) {
                        e(objH);
                    }
                } finally {
                    E5.a.f(interfaceC2375i, objK);
                }
            } catch (Throwable th) {
                e(R2.a.d(th));
            }
        }
    }

    @Override // h5.InterfaceC2370d
    public final void e(Object obj) {
        Throwable thA = C0409f.a(obj);
        if (thA != null) {
            obj = new C3038n(thA, false);
        }
        Object objE = E(obj);
        if (objE == AbstractC3046w.f24562e) {
            return;
        }
        f(objE);
    }

    @Override // h5.InterfaceC2370d
    public final InterfaceC2375i getContext() {
        return this.f24513c;
    }

    @Override // z5.InterfaceC3044u
    public final InterfaceC2375i k() {
        return this.f24513c;
    }

    @Override // z5.c0
    public final String p() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
