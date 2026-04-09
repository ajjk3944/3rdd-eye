package F9;

import A9.AbstractC0566a0;
import A9.C0602t;
import A9.C0604u;
import A9.I;
import A9.N0;
import A9.S;
import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes3.dex */
public final class i<T> extends S<T> implements h9.d, InterfaceC4347e<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final A9.A f1755e;

    /* renamed from: f, reason: collision with root package name */
    public final h9.c f1756f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1757g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1758h;

    public i(A9.A a10, h9.c cVar) {
        super(-1);
        this.f1755e = a10;
        this.f1756f = cVar;
        this.f1757g = C0658a.f1745b;
        this.f1758h = A.b(cVar.getContext());
    }

    @Override // A9.S
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0604u) {
            ((C0604u) obj).getClass();
            throw null;
        }
    }

    @Override // h9.d
    public final h9.d getCallerFrame() {
        h9.c cVar = this.f1756f;
        if (androidx.work.s.n(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // f9.InterfaceC4347e
    public final InterfaceC4350h getContext() {
        return this.f1756f.getContext();
    }

    @Override // A9.S
    public final Object h() {
        Object obj = this.f1757g;
        this.f1757g = C0658a.f1745b;
        return obj;
    }

    @Override // f9.InterfaceC4347e
    public final void resumeWith(Object obj) {
        h9.c cVar = this.f1756f;
        InterfaceC4350h context = cVar.getContext();
        Throwable thA = b9.m.a(obj);
        Object c0602t = thA == null ? obj : new C0602t(false, thA);
        A9.A a10 = this.f1755e;
        if (a10.P0(context)) {
            this.f1757g = c0602t;
            this.f207d = 0;
            a10.N0(context, this);
            return;
        }
        AbstractC0566a0 abstractC0566a0A = N0.a();
        if (abstractC0566a0A.f221c >= 4294967296L) {
            this.f1757g = c0602t;
            this.f207d = 0;
            abstractC0566a0A.S0(this);
            return;
        }
        abstractC0566a0A.T0(true);
        try {
            InterfaceC4350h context2 = cVar.getContext();
            Object objC = A.c(context2, this.f1758h);
            try {
                cVar.resumeWith(obj);
                C1992A c1992a = C1992A.f18074a;
                while (abstractC0566a0A.V0()) {
                }
            } finally {
                A.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1755e + ", " + I.F(this.f1756f) + ']';
    }

    @Override // A9.S
    public final InterfaceC4347e<T> b() {
        return this;
    }
}
