package Ii;

import Ii.J;
import Ni.AbstractC3406h;
import Ni.AbstractC3409k;
import Ni.C3405g;
import Ni.C3408j;
import dh.AbstractC5376a;
import dh.AbstractC5377b;
import dh.InterfaceC5380e;
import dh.InterfaceC5381f;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class J extends AbstractC5376a implements InterfaceC5381f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9270b = new a(null);

    public static final class a extends AbstractC5377b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J d(InterfaceC5384i.b bVar) {
            if (bVar instanceof J) {
                return (J) bVar;
            }
            return null;
        }

        private a() {
            super(InterfaceC5381f.f46086m0, new InterfaceC6835l() { // from class: Ii.I
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return J.a.d((InterfaceC5384i.b) obj);
                }
            });
        }
    }

    public J() {
        super(InterfaceC5381f.f46086m0);
    }

    public static /* synthetic */ J o0(J j10, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return j10.n0(i10, str);
    }

    @Override // dh.InterfaceC5381f
    public final void C(InterfaceC5380e interfaceC5380e) {
        AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C3405g) interfaceC5380e).o();
    }

    public abstract void Y(InterfaceC5384i interfaceC5384i, Runnable runnable);

    public void b0(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        AbstractC3406h.c(this, interfaceC5384i, runnable);
    }

    @Override // dh.AbstractC5376a, dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return InterfaceC5381f.a.a(this, cVar);
    }

    public boolean m0(InterfaceC5384i interfaceC5384i) {
        return true;
    }

    @Override // dh.AbstractC5376a, dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return InterfaceC5381f.a.b(this, cVar);
    }

    public J n0(int i10, String str) {
        AbstractC3409k.a(i10);
        return new C3408j(this, i10, str);
    }

    public String toString() {
        return S.a(this) + '@' + S.b(this);
    }

    @Override // dh.InterfaceC5381f
    public final InterfaceC5380e y(InterfaceC5380e interfaceC5380e) {
        return new C3405g(this, interfaceC5380e);
    }
}
