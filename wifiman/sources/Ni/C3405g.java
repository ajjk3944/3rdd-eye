package Ni;

import Ii.AbstractC3044a0;
import Ii.AbstractC3060i0;
import Ii.C3073p;
import Ii.InterfaceC3069n;
import Ii.S;
import Ii.U0;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Ni.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3405g extends AbstractC3044a0 implements kotlin.coroutines.jvm.internal.e, InterfaceC5380e {

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f16591h = AtomicReferenceFieldUpdater.newUpdater(C3405g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final Ii.J f16592d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC5380e f16593e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16594f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f16595g;

    public C3405g(Ii.J j10, InterfaceC5380e interfaceC5380e) {
        super(-1);
        this.f16592d = j10;
        this.f16593e = interfaceC5380e;
        this.f16594f = AbstractC3406h.f16596a;
        this.f16595g = J.g(getContext());
    }

    private final C3073p k() {
        Object obj = f16591h.get(this);
        if (obj instanceof C3073p) {
            return (C3073p) obj;
        }
        return null;
    }

    @Override // Ii.AbstractC3044a0
    public InterfaceC5380e c() {
        return this;
    }

    @Override // Ii.AbstractC3044a0
    public Object g() {
        Object obj = this.f16594f;
        this.f16594f = AbstractC3406h.f16596a;
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        InterfaceC5380e interfaceC5380e = this.f16593e;
        if (interfaceC5380e instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) interfaceC5380e;
        }
        return null;
    }

    @Override // dh.InterfaceC5380e
    public InterfaceC5384i getContext() {
        return this.f16593e.getContext();
    }

    public final void h() {
        while (f16591h.get(this) == AbstractC3406h.f16597b) {
        }
    }

    public final C3073p i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16591h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f16591h.set(this, AbstractC3406h.f16597b);
                return null;
            }
            if (obj instanceof C3073p) {
                if (androidx.concurrent.futures.b.a(f16591h, this, obj, AbstractC3406h.f16597b)) {
                    return (C3073p) obj;
                }
            } else if (obj != AbstractC3406h.f16597b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void j(InterfaceC5384i interfaceC5384i, Object obj) {
        this.f16594f = obj;
        this.f9299c = 1;
        this.f16592d.b0(interfaceC5384i, this);
    }

    public final boolean m() {
        return f16591h.get(this) != null;
    }

    public final boolean n(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16591h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C c10 = AbstractC3406h.f16597b;
            if (AbstractC6492s.d(obj, c10)) {
                if (androidx.concurrent.futures.b.a(f16591h, this, c10, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f16591h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void o() {
        h();
        C3073p c3073pK = k();
        if (c3073pK != null) {
            c3073pK.n();
        }
    }

    public final Throwable q(InterfaceC3069n interfaceC3069n) {
        C c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16591h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c10 = AbstractC3406h.f16597b;
            if (obj != c10) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f16591h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f16591h, this, c10, interfaceC3069n));
        return null;
    }

    @Override // dh.InterfaceC5380e
    public void resumeWith(Object obj) {
        Object objB = Ii.D.b(obj);
        if (AbstractC3406h.d(this.f16592d, getContext())) {
            this.f16594f = objB;
            this.f9299c = 0;
            AbstractC3406h.c(this.f16592d, getContext(), this);
            return;
        }
        AbstractC3060i0 abstractC3060i0B = U0.f9286a.b();
        if (abstractC3060i0B.w0()) {
            this.f16594f = objB;
            this.f9299c = 0;
            abstractC3060i0B.s0(this);
            return;
        }
        abstractC3060i0B.u0(true);
        try {
            InterfaceC5384i context = getContext();
            Object objI = J.i(context, this.f16595g);
            try {
                this.f16593e.resumeWith(obj);
                Yg.J j10 = Yg.J.f24997a;
                while (abstractC3060i0B.z0()) {
                }
            } finally {
                J.f(context, objI);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f16592d + ", " + S.c(this.f16593e) + ']';
    }
}
