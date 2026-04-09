package androidx.privacysandbox.ads.adservices.measurement;

import Ii.C3073p;
import Ii.N;
import Ii.O;
import Yg.J;
import Yg.v;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class l extends b {

    /* renamed from: b, reason: collision with root package name */
    private final MeasurementManager f31729b;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f31730a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f31731b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f31732c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, l lVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f31732c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(null, this.f31732c, interfaceC5380e);
            aVar.f31731b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f31730a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            throw null;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public l(MeasurementManager mMeasurementManager) {
        AbstractC6492s.i(mMeasurementManager, "mMeasurementManager");
        this.f31729b = mMeasurementManager;
    }

    static /* synthetic */ Object h(l lVar, androidx.privacysandbox.ads.adservices.measurement.a aVar, InterfaceC5380e<? super J> interfaceC5380e) {
        new C3073p(AbstractC5467b.d(interfaceC5380e), 1).A();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object j(l lVar, InterfaceC5380e<? super Integer> interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        lVar.i().getMeasurementApiStatus(new k(), A1.n.a(c3073p));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    static /* synthetic */ Object k(l lVar, Uri uri, InputEvent inputEvent, InterfaceC5380e<? super J> interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        lVar.i().registerSource(uri, inputEvent, new k(), A1.n.a(c3073p));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : J.f24997a;
    }

    static /* synthetic */ Object l(l lVar, m mVar, InterfaceC5380e<? super J> interfaceC5380e) {
        Object objG = O.g(new a(mVar, lVar, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    static /* synthetic */ Object m(l lVar, Uri uri, InterfaceC5380e<? super J> interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        lVar.i().registerTrigger(uri, new k(), A1.n.a(c3073p));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : J.f24997a;
    }

    static /* synthetic */ Object n(l lVar, n nVar, InterfaceC5380e<? super J> interfaceC5380e) {
        new C3073p(AbstractC5467b.d(interfaceC5380e), 1).A();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object o(l lVar, o oVar, InterfaceC5380e<? super J> interfaceC5380e) {
        new C3073p(AbstractC5467b.d(interfaceC5380e), 1).A();
        lVar.i();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, InterfaceC5380e<? super J> interfaceC5380e) {
        return h(this, aVar, interfaceC5380e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object b(InterfaceC5380e<? super Integer> interfaceC5380e) {
        return j(this, interfaceC5380e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object c(Uri uri, InputEvent inputEvent, InterfaceC5380e<? super J> interfaceC5380e) {
        return k(this, uri, inputEvent, interfaceC5380e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object d(m mVar, InterfaceC5380e<? super J> interfaceC5380e) {
        return l(this, mVar, interfaceC5380e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object e(Uri uri, InterfaceC5380e<? super J> interfaceC5380e) {
        return m(this, uri, interfaceC5380e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object f(n nVar, InterfaceC5380e<? super J> interfaceC5380e) {
        return n(this, nVar, interfaceC5380e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object g(o oVar, InterfaceC5380e<? super J> interfaceC5380e) {
        return o(this, oVar, interfaceC5380e);
    }

    protected final MeasurementManager i() {
        return this.f31729b;
    }
}
