package o5;

import Ii.AbstractC3063k;
import Ii.N;
import Ii.O;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final b f55422c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f55423a;

    /* renamed from: b, reason: collision with root package name */
    private final q5.f f55424b;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f55425a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5384i f55427c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ F f55428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5384i interfaceC5384i, F f10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f55427c = interfaceC5384i;
            this.f55428d = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return k.this.new a(this.f55427c, this.f55428d, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r5.f55425a
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L15
                Yg.v.b(r6)
                goto L6b
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                Yg.v.b(r6)
                goto L30
            L22:
                Yg.v.b(r6)
                p5.a r6 = p5.C7229a.f57670a
                r5.f55425a = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L30
                return r0
            L30:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L46
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L46
                goto L9e
            L46:
                java.util.Iterator r6 = r6.iterator()
            L4a:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L9e
                java.lang.Object r1 = r6.next()
                p5.b r1 = (p5.b) r1
                boolean r1 = r1.b()
                if (r1 == 0) goto L4a
                o5.k r6 = o5.k.this
                q5.f r6 = o5.k.b(r6)
                r5.f55425a = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L6b
                return r0
            L6b:
                o5.k r6 = o5.k.this
                q5.f r6 = o5.k.b(r6)
                boolean r6 = r6.d()
                if (r6 != 0) goto L7e
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto La4
            L7e:
                o5.D r6 = new o5.D
                dh.i r0 = r5.f55427c
                r6.<init>(r0)
                o5.F r0 = r5.f55428d
                r6.i(r0)
                o5.H r0 = o5.H.f55364a
                r0.a(r6)
                o5.k r6 = o5.k.this
                com.google.firebase.f r6 = o5.k.a(r6)
                o5.j r0 = new o5.j
                r0.<init>()
                r6.h(r0)
                goto La4
            L9e:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
            La4:
                Yg.J r6 = Yg.J.f24997a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public k(com.google.firebase.f firebaseApp, q5.f settings, InterfaceC5384i backgroundDispatcher, F lifecycleServiceBinder) {
        AbstractC6492s.i(firebaseApp, "firebaseApp");
        AbstractC6492s.i(settings, "settings");
        AbstractC6492s.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC6492s.i(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.f55423a = firebaseApp;
        this.f55424b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(H.f55364a);
            AbstractC3063k.d(O.a(backgroundDispatcher), null, null, new a(backgroundDispatcher, lifecycleServiceBinder, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
