package androidx.compose.ui.platform;

import Ii.C3073p;
import Ii.InterfaceC3069n;
import T.InterfaceC3530g0;
import Yg.u;
import android.view.Choreographer;
import dh.InterfaceC5380e;
import dh.InterfaceC5381f;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class T implements InterfaceC3530g0 {

    /* renamed from: a, reason: collision with root package name */
    private final Choreographer f29307a;

    /* renamed from: b, reason: collision with root package name */
    private final Q f29308b;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Q f29309a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f29310b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Q q10, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f29309a = q10;
            this.f29310b = frameCallback;
        }

        public final void a(Throwable th2) {
            this.f29309a.D0(this.f29310b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f29312b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f29312b = frameCallback;
        }

        public final void a(Throwable th2) {
            T.this.b().removeFrameCallback(this.f29312b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    static final class c implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f29313a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f29314b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f29315c;

        c(InterfaceC3069n interfaceC3069n, T t10, InterfaceC6835l interfaceC6835l) {
            this.f29313a = interfaceC3069n;
            this.f29314b = t10;
            this.f29315c = interfaceC6835l;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objC;
            InterfaceC3069n interfaceC3069n = this.f29313a;
            InterfaceC6835l interfaceC6835l = this.f29315c;
            try {
                u.a aVar = Yg.u.f25017b;
                objC = Yg.u.c(interfaceC6835l.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                u.a aVar2 = Yg.u.f25017b;
                objC = Yg.u.c(Yg.v.a(th2));
            }
            interfaceC3069n.resumeWith(objC);
        }
    }

    public T(Choreographer choreographer, Q q10) {
        this.f29307a = choreographer;
        this.f29308b = q10;
    }

    public final Choreographer b() {
        return this.f29307a;
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
        return InterfaceC3530g0.a.a(this, obj, interfaceC6839p);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return InterfaceC3530g0.a.b(this, cVar);
    }

    @Override // T.InterfaceC3530g0
    public Object j(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        Q q10 = this.f29308b;
        if (q10 == null) {
            InterfaceC5384i.b bVar = interfaceC5380e.getContext().get(InterfaceC5381f.f46086m0);
            q10 = bVar instanceof Q ? (Q) bVar : null;
        }
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        c cVar = new c(c3073p, this, interfaceC6835l);
        if (q10 == null || !AbstractC6492s.d(q10.x0(), b())) {
            b().postFrameCallback(cVar);
            c3073p.B(new b(cVar));
        } else {
            q10.C0(cVar);
            c3073p.B(new a(q10, cVar));
        }
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return InterfaceC3530g0.a.c(this, cVar);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return InterfaceC3530g0.a.d(this, interfaceC5384i);
    }
}
