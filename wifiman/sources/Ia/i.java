package Ia;

import Ia.i;
import Ii.C3048c0;
import Ki.r;
import Ki.t;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import speedtest.ChangedCallback;
import speedtest.DirectoryServerApi;
import speedtest.InternetServersEvaluation;
import speedtest.InternetServersEvaluationParams;
import speedtest.LocationCoordinates;

/* loaded from: classes3.dex */
public abstract class i {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9013a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9014b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DirectoryServerApi f9015c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ia.d f9016d;

        /* renamed from: Ia.i$a$a, reason: collision with other inner class name */
        static final class C0368a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InternetServersEvaluation f9017a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0368a(InternetServersEvaluation internetServersEvaluation) {
                super(0);
                this.f9017a = internetServersEvaluation;
            }

            public final void a() {
                this.f9017a.cancel();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DirectoryServerApi directoryServerApi, Ia.d dVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f9015c = directoryServerApi;
            this.f9016d = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void t(speedtest.InternetServersEvaluation r14, Ki.t r15) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Ia.i.a.t(speedtest.InternetServersEvaluation, Ki.t):void");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f9015c, this.f9016d, interfaceC5380e);
            aVar.f9014b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f9013a;
            if (i10 == 0) {
                v.b(obj);
                final t tVar = (t) this.f9014b;
                DirectoryServerApi directoryServerApi = this.f9015c;
                InternetServersEvaluationParams internetServersEvaluationParams = new InternetServersEvaluationParams();
                Ia.d dVar = this.f9016d;
                if (dVar.a() != null) {
                    LocationCoordinates locationCoordinates = new LocationCoordinates();
                    locationCoordinates.setLatitude(dVar.a().a());
                    locationCoordinates.setLongitude(dVar.a().b());
                    internetServersEvaluationParams.setCoordinates(locationCoordinates);
                }
                final InternetServersEvaluation internetServers = directoryServerApi.getInternetServers(internetServersEvaluationParams);
                internetServers.start(new ChangedCallback() { // from class: Ia.h
                    @Override // speedtest.ChangedCallback
                    public final void onChanged() {
                        i.a.t(internetServers, tVar);
                    }
                });
                C0368a c0368a = new C0368a(internetServers);
                this.f9013a = 1;
                if (r.a(tVar, c0368a, this) == objG) {
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

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ia.d f9019b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ia.d f9020a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ia.d dVar) {
                super(0);
                this.f9020a = dVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Server Check " + this.f9020a.hashCode() + " subscribed";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ia.d dVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f9019b = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f9019b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f9018a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            La.a.b(new a(this.f9019b));
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f9021a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ia.d f9022b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ia.d f9023a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ia.d dVar) {
                super(0);
                this.f9023a = dVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Server Check " + this.f9023a.hashCode() + " completed";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ia.d dVar, InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
            this.f9022b = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f9021a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            La.a.b(new a(this.f9022b));
            return J.f24997a;
        }

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Throwable th2, InterfaceC5380e interfaceC5380e) {
            return new c(this.f9022b, interfaceC5380e).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f9024a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9025b;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f9026a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f9026a = gVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Server Check State: " + this.f9026a.b() + ", servers: " + this.f9026a.a().size();
            }
        }

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(interfaceC5380e);
            dVar.f9025b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f9024a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            La.a.b(new a((g) this.f9025b));
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g gVar, InterfaceC5380e interfaceC5380e) {
            return ((d) create(gVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final InterfaceC3220g a(DirectoryServerApi directoryServerApi, Ia.d params) {
        AbstractC6492s.i(directoryServerApi, "<this>");
        AbstractC6492s.i(params, "params");
        return AbstractC3222i.C(AbstractC3222i.I(AbstractC3222i.H(AbstractC3222i.J(AbstractC3222i.e(new a(directoryServerApi, params, null)), new b(params, null)), new c(params, null)), new d(null)), C3048c0.a());
    }
}
