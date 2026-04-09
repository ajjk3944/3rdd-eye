package Wa;

import Ii.AbstractC3063k;
import Ii.C3048c0;
import Ii.N;
import Ki.r;
import Ki.t;
import Ki.w;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Yg.J;
import Yg.v;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3220g f23766a;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f23767a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23768b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f23769c;

        /* renamed from: Wa.l$a$a, reason: collision with other inner class name */
        static final class C0889a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f23770a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f23771b;

            /* renamed from: Wa.l$a$a$a, reason: collision with other inner class name */
            static final class C0890a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0890a f23772a = new C0890a();

                C0890a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "UI Account API Flow cleared";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0889a(Context context, b bVar) {
                super(0);
                this.f23770a = context;
                this.f23771b = bVar;
            }

            public final void a() {
                this.f23770a.unregisterReceiver(this.f23771b);
                Ua.a.e(C0890a.f23772a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        public static final class b extends BroadcastReceiver {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f23773a;

            /* renamed from: Wa.l$a$b$a, reason: collision with other inner class name */
            static final class C0891a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f23774a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ t f23775b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0891a(t tVar, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f23775b = tVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C0891a(this.f23775b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objG = AbstractC5467b.g();
                    int i10 = this.f23774a;
                    if (i10 == 0) {
                        v.b(obj);
                        w wVarG = this.f23775b.g();
                        J j10 = J.f24997a;
                        this.f23774a = 1;
                        if (wVarG.b(j10, this) == objG) {
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
                    return ((C0891a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            b(t tVar) {
                this.f23773a = tVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC6492s.i(intent, "intent");
                AbstractC3063k.d(this.f23773a, C3048c0.a(), null, new C0891a(this.f23773a, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f23769c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f23769c, interfaceC5380e);
            aVar.f23768b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f23767a;
            if (i10 == 0) {
                v.b(obj);
                t tVar = (t) this.f23768b;
                b bVar = new b(tVar);
                Context context = this.f23769c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
                J j10 = J.f24997a;
                context.registerReceiver(bVar, intentFilter);
                C0889a c0889a = new C0889a(this.f23769c, bVar);
                this.f23767a = 1;
                if (r.a(tVar, c0889a, this) == objG) {
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
        public final Object invoke(t tVar, InterfaceC5380e interfaceC5380e) {
            return ((a) create(tVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public l(Context context, Ii.J dispatcherDefault) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(dispatcherDefault, "dispatcherDefault");
        this.f23766a = AbstractC3222i.C(AbstractC3222i.e(new a(context, null)), dispatcherDefault);
    }

    @Override // Wa.k
    public InterfaceC3220g a() {
        return this.f23766a;
    }
}
