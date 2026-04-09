package androidx.compose.ui.platform;

import Ii.AbstractC3063k;
import Ii.C3079s0;
import Ii.InterfaceC3091y0;
import android.view.View;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.concurrent.atomic.AtomicReference;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class I1 {

    /* renamed from: a, reason: collision with root package name */
    public static final I1 f29177a = new I1();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f29178b = new AtomicReference(H1.f29160a.c());

    /* renamed from: c, reason: collision with root package name */
    public static final int f29179c = 8;

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3091y0 f29180a;

        a(InterfaceC3091y0 interfaceC3091y0) {
            this.f29180a = interfaceC3091y0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            InterfaceC3091y0.a.b(this.f29180a, null, 1, null);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f29181a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T.N0 f29182b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f29183c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(T.N0 n02, View view, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f29182b = n02;
            this.f29183c = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f29182b, this.f29183c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            View view;
            Object objG = AbstractC5467b.g();
            int i10 = this.f29181a;
            try {
                if (i10 == 0) {
                    Yg.v.b(obj);
                    T.N0 n02 = this.f29182b;
                    this.f29181a = 1;
                    if (n02.k0(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                if (J1.f(view) == this.f29182b) {
                    J1.i(this.f29183c, null);
                }
                return Yg.J.f24997a;
            } finally {
                if (J1.f(this.f29183c) == this.f29182b) {
                    J1.i(this.f29183c, null);
                }
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    private I1() {
    }

    public final T.N0 a(View view) {
        T.N0 n0A = ((H1) f29178b.get()).a(view);
        J1.i(view, n0A);
        view.addOnAttachStateChangeListener(new a(AbstractC3063k.d(C3079s0.f9355a, Ji.i.g(view.getHandler(), "windowRecomposer cleanup").r0(), null, new b(n0A, view, null), 2, null)));
        return n0A;
    }
}
