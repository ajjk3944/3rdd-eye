package k2;

import Ii.AbstractC3063k;
import Ii.C3048c0;
import Ii.N;
import Ii.O;
import Yg.J;
import Yg.v;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.m;
import androidx.privacysandbox.ads.adservices.measurement.n;
import androidx.privacysandbox.ads.adservices.measurement.o;
import com.google.common.util.concurrent.d;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import j2.AbstractC6244b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6359a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f51098a = new b(null);

    /* renamed from: k2.a$a, reason: collision with other inner class name */
    private static final class C1889a extends AbstractC6359a {

        /* renamed from: b, reason: collision with root package name */
        private final androidx.privacysandbox.ads.adservices.measurement.b f51099b;

        /* renamed from: k2.a$a$a, reason: collision with other inner class name */
        static final class C1890a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f51100a;

            C1890a(androidx.privacysandbox.ads.adservices.measurement.a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return C1889a.this.new C1890a(null, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f51100a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C1889a.this.f51099b;
                    this.f51100a = 1;
                    if (bVar.a(null, this) == objG) {
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
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1890a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: k2.a$a$b */
        static final class b extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f51102a;

            b(InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return C1889a.this.new b(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f51102a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C1889a.this.f51099b;
                    this.f51102a = 1;
                    obj = bVar.b(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return obj;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: k2.a$a$c */
        static final class c extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f51104a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f51106c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InputEvent f51107d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f51106c = uri;
                this.f51107d = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return C1889a.this.new c(this.f51106c, this.f51107d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f51104a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C1889a.this.f51099b;
                    Uri uri = this.f51106c;
                    InputEvent inputEvent = this.f51107d;
                    this.f51104a = 1;
                    if (bVar.c(uri, inputEvent, this) == objG) {
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
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: k2.a$a$d */
        static final class d extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f51108a;

            d(m mVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return C1889a.this.new d(null, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f51108a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C1889a.this.f51099b;
                    this.f51108a = 1;
                    if (bVar.d(null, this) == objG) {
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
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: k2.a$a$e */
        static final class e extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f51110a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f51112c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Uri uri, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f51112c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return C1889a.this.new e(this.f51112c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f51110a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C1889a.this.f51099b;
                    Uri uri = this.f51112c;
                    this.f51110a = 1;
                    if (bVar.e(uri, this) == objG) {
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
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: k2.a$a$f */
        static final class f extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f51113a;

            f(n nVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return C1889a.this.new f(null, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f51113a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C1889a.this.f51099b;
                    this.f51113a = 1;
                    if (bVar.f(null, this) == objG) {
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
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((f) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* renamed from: k2.a$a$g */
        static final class g extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f51115a;

            g(o oVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return C1889a.this.new g(null, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f51115a;
                if (i10 == 0) {
                    v.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C1889a.this.f51099b;
                    this.f51115a = 1;
                    if (bVar.g(null, this) == objG) {
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
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((g) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        public C1889a(androidx.privacysandbox.ads.adservices.measurement.b mMeasurementManager) {
            AbstractC6492s.i(mMeasurementManager, "mMeasurementManager");
            this.f51099b = mMeasurementManager;
        }

        @Override // k2.AbstractC6359a
        public com.google.common.util.concurrent.d b() {
            return AbstractC6244b.c(AbstractC3063k.b(O.a(C3048c0.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // k2.AbstractC6359a
        public com.google.common.util.concurrent.d c(Uri trigger) {
            AbstractC6492s.i(trigger, "trigger");
            return AbstractC6244b.c(AbstractC3063k.b(O.a(C3048c0.a()), null, null, new e(trigger, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.d e(androidx.privacysandbox.ads.adservices.measurement.a deletionRequest) {
            AbstractC6492s.i(deletionRequest, "deletionRequest");
            return AbstractC6244b.c(AbstractC3063k.b(O.a(C3048c0.a()), null, null, new C1890a(deletionRequest, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.d f(Uri attributionSource, InputEvent inputEvent) {
            AbstractC6492s.i(attributionSource, "attributionSource");
            return AbstractC6244b.c(AbstractC3063k.b(O.a(C3048c0.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.d g(m request) {
            AbstractC6492s.i(request, "request");
            return AbstractC6244b.c(AbstractC3063k.b(O.a(C3048c0.a()), null, null, new d(request, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.d h(n request) {
            AbstractC6492s.i(request, "request");
            return AbstractC6244b.c(AbstractC3063k.b(O.a(C3048c0.a()), null, null, new f(request, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.d i(o request) {
            AbstractC6492s.i(request, "request");
            return AbstractC6244b.c(AbstractC3063k.b(O.a(C3048c0.a()), null, null, new g(request, null), 3, null), null, 1, null);
        }
    }

    /* renamed from: k2.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC6359a a(Context context) {
            AbstractC6492s.i(context, "context");
            androidx.privacysandbox.ads.adservices.measurement.b bVarA = androidx.privacysandbox.ads.adservices.measurement.b.f31727a.a(context);
            if (bVarA != null) {
                return new C1889a(bVarA);
            }
            return null;
        }

        private b() {
        }
    }

    public static final AbstractC6359a a(Context context) {
        return f51098a.a(context);
    }

    public abstract d b();

    public abstract d c(Uri uri);
}
