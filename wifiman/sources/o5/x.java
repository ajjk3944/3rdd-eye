package o5;

import Ii.AbstractC3063k;
import Ii.N;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import R1.d;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes3.dex */
public final class x implements com.google.firebase.sessions.a {

    /* renamed from: f, reason: collision with root package name */
    private static final c f55446f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    private static final ph.c f55447g = Q1.a.b(w.f55442a.a(), new P1.b(b.f55455a), null, null, 12, null);

    /* renamed from: b, reason: collision with root package name */
    private final Context f55448b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5384i f55449c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f55450d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3220g f55451e;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f55452a;

        /* renamed from: o5.x$a$a, reason: collision with other inner class name */
        static final class C2001a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ x f55454a;

            C2001a(x xVar) {
                this.f55454a = xVar;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(l lVar, InterfaceC5380e interfaceC5380e) {
                this.f55454a.f55450d.set(lVar);
                return Yg.J.f24997a;
            }
        }

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return x.this.new a(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f55452a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3220g interfaceC3220g = x.this.f55451e;
                C2001a c2001a = new C2001a(x.this);
                this.f55452a = 1;
                if (interfaceC3220g.b(c2001a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f55455a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R1.d invoke(CorruptionException ex) {
            AbstractC6492s.i(ex, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + v.f55441a.e() + '.', ex);
            return R1.e.a();
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ th.l[] f55456a = {O.i(new kotlin.jvm.internal.H(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final O1.e b(Context context) {
            return (O1.e) x.f55447g.a(context, f55456a[0]);
        }

        private c() {
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f55457a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final d.a f55458b = R1.f.f("session_id");

        private d() {
        }

        public final d.a a() {
            return f55458b;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        int f55459a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f55460b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f55461c;

        e(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f55459a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f55460b;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f55461c);
                R1.d dVarA = R1.e.a();
                this.f55460b = null;
                this.f55459a = 1;
                if (interfaceC3221h.a(dVarA, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Throwable th2, InterfaceC5380e interfaceC5380e) {
            e eVar = new e(interfaceC5380e);
            eVar.f55460b = interfaceC3221h;
            eVar.f55461c = th2;
            return eVar.invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final class f implements InterfaceC3220g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f55462a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f55463b;

        public static final class a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3221h f55464a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f55465b;

            /* renamed from: o5.x$f$a$a, reason: collision with other inner class name */
            public static final class C2002a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f55466a;

                /* renamed from: b, reason: collision with root package name */
                int f55467b;

                public C2002a(InterfaceC5380e interfaceC5380e) {
                    super(interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f55466a = obj;
                    this.f55467b |= PduHandle.NONE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC3221h interfaceC3221h, x xVar) {
                this.f55464a = interfaceC3221h;
                this.f55465b = xVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Li.InterfaceC3221h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, dh.InterfaceC5380e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof o5.x.f.a.C2002a
                    if (r0 == 0) goto L13
                    r0 = r6
                    o5.x$f$a$a r0 = (o5.x.f.a.C2002a) r0
                    int r1 = r0.f55467b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f55467b = r1
                    goto L18
                L13:
                    o5.x$f$a$a r0 = new o5.x$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f55466a
                    java.lang.Object r1 = eh.AbstractC5467b.g()
                    int r2 = r0.f55467b
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L29
                    Yg.v.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L32:
                    Yg.v.b(r6)
                    Li.h r6 = r4.f55464a
                    R1.d r5 = (R1.d) r5
                    o5.x r2 = r4.f55465b
                    o5.l r5 = o5.x.h(r2, r5)
                    r0.f55467b = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    Yg.J r5 = Yg.J.f24997a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o5.x.f.a.a(java.lang.Object, dh.e):java.lang.Object");
            }
        }

        public f(InterfaceC3220g interfaceC3220g, x xVar) {
            this.f55462a = interfaceC3220g;
            this.f55463b = xVar;
        }

        @Override // Li.InterfaceC3220g
        public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            Object objB = this.f55462a.b(new a(interfaceC3221h, this.f55463b), interfaceC5380e);
            return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f55469a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f55471c;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f55472a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f55473b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f55474c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f55474c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f55474c, interfaceC5380e);
                aVar.f55473b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f55472a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                ((R1.a) this.f55473b).i(d.f55457a.a(), this.f55474c);
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(R1.a aVar, InterfaceC5380e interfaceC5380e) {
                return ((a) create(aVar, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f55471c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return x.this.new g(this.f55471c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f55469a;
            try {
                if (i10 == 0) {
                    Yg.v.b(obj);
                    O1.e eVarB = x.f55446f.b(x.this.f55448b);
                    a aVar = new a(this.f55471c, null);
                    this.f55469a = 1;
                    if (R1.g.a(eVarB, aVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
            } catch (IOException e10) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e10);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((g) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public x(Context context, InterfaceC5384i backgroundDispatcher) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(backgroundDispatcher, "backgroundDispatcher");
        this.f55448b = context;
        this.f55449c = backgroundDispatcher;
        this.f55450d = new AtomicReference();
        this.f55451e = new f(AbstractC3222i.f(f55446f.b(context).b(), new e(null)), this);
        AbstractC3063k.d(Ii.O.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l i(R1.d dVar) {
        return new l((String) dVar.b(d.f55457a.a()));
    }

    @Override // com.google.firebase.sessions.a
    public String a() {
        l lVar = (l) this.f55450d.get();
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.a
    public void b(String sessionId) {
        AbstractC6492s.i(sessionId, "sessionId");
        AbstractC3063k.d(Ii.O.a(this.f55449c), null, null, new g(sessionId, null), 3, null);
    }
}
