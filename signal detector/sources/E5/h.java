package E5;

import c5.C0409f;
import d5.C2280h;
import h5.InterfaceC2370d;
import h5.InterfaceC2375i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.AbstractC3039o;
import z5.AbstractC3042s;
import z5.AbstractC3046w;
import z5.C;
import z5.C3038n;
import z5.K;
import z5.j0;

/* loaded from: classes3.dex */
public final class h extends C implements j5.c, InterfaceC2370d {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1385h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3042s f1386d;

    /* renamed from: e, reason: collision with root package name */
    public final j5.b f1387e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1388f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1389g;

    public h(AbstractC3042s abstractC3042s, j5.b bVar) {
        super(-1);
        this.f1386d = abstractC3042s;
        this.f1387e = bVar;
        this.f1388f = a.f1374c;
        Object objO = bVar.getContext().o(0, w.f1416c);
        q5.i.b(objO);
        this.f1389g = objO;
    }

    @Override // z5.C
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC3039o) {
            ((AbstractC3039o) obj).getClass();
            throw null;
        }
    }

    @Override // j5.c
    public final j5.c d() {
        j5.b bVar = this.f1387e;
        if (A.f.y(bVar)) {
            return bVar;
        }
        return null;
    }

    @Override // h5.InterfaceC2370d
    public final void e(Object obj) {
        j5.b bVar = this.f1387e;
        InterfaceC2375i context = bVar.getContext();
        Throwable thA = C0409f.a(obj);
        Object c3038n = thA == null ? obj : new C3038n(thA, false);
        AbstractC3042s abstractC3042s = this.f1386d;
        if (abstractC3042s.e()) {
            this.f1388f = c3038n;
            this.f24484c = 0;
            abstractC3042s.d(context, this);
            return;
        }
        K kA = j0.a();
        if (kA.f24496c >= 4294967296L) {
            this.f1388f = c3038n;
            this.f24484c = 0;
            C2280h c2280h = kA.f24498e;
            if (c2280h == null) {
                c2280h = new C2280h();
                kA.f24498e = c2280h;
            }
            c2280h.addLast(this);
            return;
        }
        kA.q(true);
        try {
            InterfaceC2375i context2 = bVar.getContext();
            Object objK = a.k(context2, this.f1389g);
            try {
                bVar.e(obj);
                while (kA.r()) {
                }
            } finally {
                a.f(context2, objK);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // h5.InterfaceC2370d
    public final InterfaceC2375i getContext() {
        return this.f1387e.getContext();
    }

    @Override // z5.C
    public final Object k() {
        Object obj = this.f1388f;
        this.f1388f = a.f1374c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1386d + ", " + AbstractC3046w.o(this.f1387e) + ']';
    }

    @Override // z5.C
    public final InterfaceC2370d c() {
        return this;
    }
}
