package Ka;

import Ii.C3048c0;
import Ka.e;
import Ki.r;
import Ki.t;
import Ki.w;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import speedtest.SpeedtestError;
import speedtest.SpeedtestStatusCallback;
import speedtest.Speedtest_;

/* loaded from: classes3.dex */
public abstract class e {

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f10541a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10542b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f10543c;

        /* renamed from: Ka.e$a$a, reason: collision with other inner class name */
        static final class C0422a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Speedtest_ f10544a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0422a(Speedtest_ speedtest_) {
                super(0);
                this.f10544a = speedtest_;
            }

            public final void a() {
                this.f10544a.cancel();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f10543c = interfaceC6824a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(t tVar, long j10, long j11, long j12, long j13, SpeedtestError speedtestError) {
            Ka.b bVar;
            if (speedtestError != null) {
                tVar.f(com.ui.speedtest.a.a(speedtestError));
                return;
            }
            if (j10 == 0) {
                bVar = Ka.b.IDLE;
            } else if (j10 == 1) {
                bVar = Ka.b.STARTED;
            } else {
                if (j10 != 2) {
                    throw new IllegalStateException("Unknown test state " + j10);
                }
                bVar = Ka.b.FINISHED;
            }
            Ka.c cVar = new Ka.c(bVar, j11, j12, j13);
            tVar.k(cVar);
            if (cVar.b() == Ka.b.FINISHED) {
                w.a.a(tVar, null, 1, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f10543c, interfaceC5380e);
            aVar.f10542b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f10541a;
            if (i10 == 0) {
                v.b(obj);
                final t tVar = (t) this.f10542b;
                Speedtest_ speedtest_ = (Speedtest_) this.f10543c.invoke();
                speedtest_.start(new SpeedtestStatusCallback() { // from class: Ka.d
                    @Override // speedtest.SpeedtestStatusCallback
                    public final void onChanged(long j10, long j11, long j12, long j13, SpeedtestError speedtestError) {
                        e.a.t(tVar, j10, j11, j12, j13, speedtestError);
                    }
                });
                C0422a c0422a = new C0422a(speedtest_);
                this.f10541a = 1;
                if (r.a(tVar, c0422a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, InterfaceC5380e interfaceC5380e) {
            return ((a) create(tVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f10545a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10546b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f10547a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3221h interfaceC3221h) {
                super(0);
                this.f10547a = interfaceC3221h;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Test " + this.f10547a.hashCode() + " subscribed";
            }
        }

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(interfaceC5380e);
            bVar.f10546b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f10545a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            La.a.b(new a((InterfaceC3221h) this.f10546b));
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f10548a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10549b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f10550a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3221h interfaceC3221h) {
                super(0);
                this.f10550a = interfaceC3221h;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Test " + this.f10550a.hashCode() + " completed";
            }
        }

        c(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f10548a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            La.a.b(new a((InterfaceC3221h) this.f10549b));
            return J.f24997a;
        }

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Throwable th2, InterfaceC5380e interfaceC5380e) {
            c cVar = new c(interfaceC5380e);
            cVar.f10549b = interfaceC3221h;
            return cVar.invokeSuspend(J.f24997a);
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f10551a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10552b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ka.c f10553a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ka.c cVar) {
                super(0);
                this.f10553a = cVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String str = String.format("Test State: " + this.f10553a.b() + ", speed: %.2f Mbps", Arrays.copyOf(new Object[]{Double.valueOf((this.f10553a.a() / 1000000.0d) * 8.0d)}, 1));
                AbstractC6492s.h(str, "format(this, *args)");
                return str;
            }
        }

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(interfaceC5380e);
            dVar.f10552b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f10551a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            La.a.b(new a((Ka.c) this.f10552b));
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ka.c cVar, InterfaceC5380e interfaceC5380e) {
            return ((d) create(cVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final InterfaceC3220g a(InterfaceC6824a stFactory) {
        AbstractC6492s.i(stFactory, "stFactory");
        return AbstractC3222i.C(AbstractC3222i.I(AbstractC3222i.H(AbstractC3222i.J(AbstractC3222i.e(new a(stFactory, null)), new b(null)), new c(null)), new d(null)), C3048c0.a());
    }
}
