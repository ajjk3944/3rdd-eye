package o5;

import Ii.AbstractC3063k;
import Ii.N;
import Ii.O;
import android.util.Log;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* renamed from: o5.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7077B implements com.google.firebase.sessions.b {

    /* renamed from: g, reason: collision with root package name */
    public static final a f55322g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final double f55323h = Math.random();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f55324b;

    /* renamed from: c, reason: collision with root package name */
    private final g5.e f55325c;

    /* renamed from: d, reason: collision with root package name */
    private final q5.f f55326d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC7087h f55327e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC5384i f55328f;

    /* renamed from: o5.B$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: o5.B$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f55329a;

        /* renamed from: b, reason: collision with root package name */
        Object f55330b;

        /* renamed from: c, reason: collision with root package name */
        Object f55331c;

        /* renamed from: d, reason: collision with root package name */
        Object f55332d;

        /* renamed from: e, reason: collision with root package name */
        Object f55333e;

        /* renamed from: f, reason: collision with root package name */
        Object f55334f;

        /* renamed from: g, reason: collision with root package name */
        int f55335g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ y f55337i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y yVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f55337i = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C7077B.this.new b(this.f55337i, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r10.f55335g
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L46
                if (r1 == r4) goto L42
                if (r1 == r3) goto L3e
                if (r1 != r2) goto L35
                java.lang.Object r0 = r10.f55334f
                q5.f r0 = (q5.f) r0
                java.lang.Object r1 = r10.f55333e
                o5.y r1 = (o5.y) r1
                java.lang.Object r2 = r10.f55332d
                com.google.firebase.f r2 = (com.google.firebase.f) r2
                java.lang.Object r3 = r10.f55331c
                o5.A r3 = (o5.C7076A) r3
                java.lang.Object r4 = r10.f55330b
                o5.B r4 = (o5.C7077B) r4
                java.lang.Object r5 = r10.f55329a
                o5.s r5 = (o5.s) r5
                Yg.v.b(r11)
                r7 = r4
                r8 = r3
                r3 = r0
                r0 = r8
                r9 = r2
                r2 = r1
                r1 = r9
                goto L9e
            L35:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L3e:
                Yg.v.b(r11)
                goto L6d
            L42:
                Yg.v.b(r11)
                goto L54
            L46:
                Yg.v.b(r11)
                o5.B r11 = o5.C7077B.this
                r10.f55335g = r4
                java.lang.Object r11 = o5.C7077B.f(r11, r10)
                if (r11 != r0) goto L54
                return r0
            L54:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lb1
                o5.s$a r11 = o5.s.f55430c
                o5.B r1 = o5.C7077B.this
                g5.e r1 = o5.C7077B.d(r1)
                r10.f55335g = r3
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L6d
                return r0
            L6d:
                r5 = r11
                o5.s r5 = (o5.s) r5
                o5.B r4 = o5.C7077B.this
                o5.A r3 = o5.C7076A.f55320a
                com.google.firebase.f r11 = o5.C7077B.c(r4)
                o5.y r1 = r10.f55337i
                o5.B r6 = o5.C7077B.this
                q5.f r6 = o5.C7077B.e(r6)
                p5.a r7 = p5.C7229a.f57670a
                r10.f55329a = r5
                r10.f55330b = r4
                r10.f55331c = r3
                r10.f55332d = r11
                r10.f55333e = r1
                r10.f55334f = r6
                r10.f55335g = r2
                java.lang.Object r2 = r7.c(r10)
                if (r2 != r0) goto L97
                return r0
            L97:
                r0 = r3
                r7 = r4
                r3 = r6
                r8 = r1
                r1 = r11
                r11 = r2
                r2 = r8
            L9e:
                r4 = r11
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r11 = r5.b()
                java.lang.String r6 = r5.a()
                r5 = r11
                o5.z r11 = r0.a(r1, r2, r3, r4, r5, r6)
                o5.C7077B.b(r7, r11)
            Lb1:
                Yg.J r11 = Yg.J.f24997a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.C7077B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: o5.B$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f55338a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f55339b;

        /* renamed from: d, reason: collision with root package name */
        int f55341d;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55339b = obj;
            this.f55341d |= PduHandle.NONE;
            return C7077B.this.i(this);
        }
    }

    public C7077B(com.google.firebase.f firebaseApp, g5.e firebaseInstallations, q5.f sessionSettings, InterfaceC7087h eventGDTLogger, InterfaceC5384i backgroundDispatcher) {
        AbstractC6492s.i(firebaseApp, "firebaseApp");
        AbstractC6492s.i(firebaseInstallations, "firebaseInstallations");
        AbstractC6492s.i(sessionSettings, "sessionSettings");
        AbstractC6492s.i(eventGDTLogger, "eventGDTLogger");
        AbstractC6492s.i(backgroundDispatcher, "backgroundDispatcher");
        this.f55324b = firebaseApp;
        this.f55325c = firebaseInstallations;
        this.f55326d = sessionSettings;
        this.f55327e = eventGDTLogger;
        this.f55328f = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(z zVar) {
        try {
            this.f55327e.a(zVar);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
        } catch (RuntimeException e10) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    private final boolean h() {
        return f55323h <= this.f55326d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(dh.InterfaceC5380e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o5.C7077B.c
            if (r0 == 0) goto L13
            r0 = r6
            o5.B$c r0 = (o5.C7077B.c) r0
            int r1 = r0.f55341d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55341d = r1
            goto L18
        L13:
            o5.B$c r0 = new o5.B$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f55339b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f55341d
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f55338a
            o5.B r0 = (o5.C7077B) r0
            Yg.v.b(r6)
            goto L4f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            Yg.v.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            q5.f r6 = r5.f55326d
            r0.f55338a = r5
            r0.f55341d = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            q5.f r6 = r0.f55326d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L63
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L63:
            boolean r6 = r0.h()
            if (r6 != 0) goto L74
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L74:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.C7077B.i(dh.e):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.b
    public void a(y sessionDetails) {
        AbstractC6492s.i(sessionDetails, "sessionDetails");
        AbstractC3063k.d(O.a(this.f55328f), null, null, new b(sessionDetails, null), 3, null);
    }
}
