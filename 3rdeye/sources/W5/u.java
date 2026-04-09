package w5;

import A9.C0575f;
import D9.C0649k;
import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import X0.C1638a;
import a1.C1643a;
import a1.d;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import com.google.android.gms.common.util.ProcessUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SessionDatastore.kt */
/* loaded from: classes2.dex */
public final class u implements t {

    /* renamed from: e, reason: collision with root package name */
    public static final c f47443e = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final Z0.b f47444f = B7.d.x(s.f47441a, new Y0.b(b.f47452g));

    /* renamed from: a, reason: collision with root package name */
    public final Context f47445a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4350h f47446b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<m> f47447c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    public final f f47448d;

    /* compiled from: SessionDatastore.kt */
    @h9.e(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {82}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f47449l;

        /* compiled from: SessionDatastore.kt */
        /* renamed from: w5.u$a$a, reason: collision with other inner class name */
        public static final class C0545a<T> implements InterfaceC0645g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f47451b;

            public C0545a(u uVar) {
                this.f47451b = uVar;
            }

            @Override // D9.InterfaceC0645g
            public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
                this.f47451b.f47447c.set((m) obj);
                return C1992A.f18074a;
            }
        }

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return u.this.new a(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f47449l;
            if (i == 0) {
                b9.n.b(obj);
                u uVar = u.this;
                f fVar = uVar.f47448d;
                C0545a c0545a = new C0545a(uVar);
                this.f47449l = 1;
                if (fVar.b(c0545a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<C1638a, a1.d> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f47452g = new b(1);

        @Override // p9.l
        public final a1.d invoke(C1638a c1638a) {
            String myProcessName;
            C1638a ex = c1638a;
            kotlin.jvm.internal.l.f(ex, "ex");
            StringBuilder sb = new StringBuilder("CorruptionException in sessions DataStore in ");
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                myProcessName = Process.myProcessName();
                kotlin.jvm.internal.l.e(myProcessName, "myProcessName()");
            } else if ((i < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
                myProcessName = "";
            }
            sb.append(myProcessName);
            sb.append('.');
            Log.w("FirebaseSessionsRepo", sb.toString(), ex);
            return new C1643a(true, 1);
        }
    }

    /* compiled from: SessionDatastore.kt */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w9.i<Object>[] f47453a;

        static {
            kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(c.class);
            kotlin.jvm.internal.x.f43661a.getClass();
            f47453a = new w9.i[]{rVar};
        }
    }

    /* compiled from: SessionDatastore.kt */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d.a<String> f47454a = new d.a<>("session_id");
    }

    /* compiled from: SessionDatastore.kt */
    @h9.e(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {76}, m = "invokeSuspend")
    public static final class e extends h9.i implements p9.q<InterfaceC0645g<? super a1.d>, Throwable, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f47455l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ InterfaceC0645g f47456m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Throwable f47457n;

        @Override // p9.q
        public final Object invoke(InterfaceC0645g<? super a1.d> interfaceC0645g, Throwable th, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            e eVar = new e(3, interfaceC4347e);
            eVar.f47456m = interfaceC0645g;
            eVar.f47457n = th;
            return eVar.invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f47455l;
            if (i == 0) {
                b9.n.b(obj);
                InterfaceC0645g interfaceC0645g = this.f47456m;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f47457n);
                C1643a c1643a = new C1643a(true, 1);
                this.f47456m = null;
                this.f47455l = 1;
                if (interfaceC0645g.emit(c1643a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    public static final class f implements InterfaceC0644f<m> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0649k f47458b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u f47459c;

        /* compiled from: Emitters.kt */
        public static final class a<T> implements InterfaceC0645g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0645g f47460b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ u f47461c;

            /* compiled from: Emitters.kt */
            @h9.e(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
            /* renamed from: w5.u$f$a$a, reason: collision with other inner class name */
            public static final class C0546a extends h9.c {

                /* renamed from: l, reason: collision with root package name */
                public /* synthetic */ Object f47462l;

                /* renamed from: m, reason: collision with root package name */
                public int f47463m;

                public C0546a(InterfaceC4347e interfaceC4347e) {
                    super(interfaceC4347e);
                }

                @Override // h9.AbstractC4424a
                public final Object invokeSuspend(Object obj) {
                    this.f47462l = obj;
                    this.f47463m |= RecyclerView.UNDEFINED_DURATION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC0645g interfaceC0645g, u uVar) {
                this.f47460b = interfaceC0645g;
                this.f47461c = uVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // D9.InterfaceC0645g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, f9.InterfaceC4347e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof w5.u.f.a.C0546a
                    if (r0 == 0) goto L13
                    r0 = r6
                    w5.u$f$a$a r0 = (w5.u.f.a.C0546a) r0
                    int r1 = r0.f47463m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f47463m = r1
                    goto L18
                L13:
                    w5.u$f$a$a r0 = new w5.u$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f47462l
                    g9.a r1 = g9.a.COROUTINE_SUSPENDED
                    int r2 = r0.f47463m
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    b9.n.b(r6)
                    goto L53
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    b9.n.b(r6)
                    a1.d r5 = (a1.d) r5
                    w5.u$c r6 = w5.u.f47443e
                    w5.u r6 = r4.f47461c
                    r6.getClass()
                    w5.m r6 = new w5.m
                    a1.d$a<java.lang.String> r2 = w5.u.d.f47454a
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.String r5 = (java.lang.String) r5
                    r6.<init>(r5)
                    r0.f47463m = r3
                    D9.g r5 = r4.f47460b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L53
                    return r1
                L53:
                    b9.A r5 = b9.C1992A.f18074a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: w5.u.f.a.emit(java.lang.Object, f9.e):java.lang.Object");
            }
        }

        public f(C0649k c0649k, u uVar) {
            this.f47458b = c0649k;
            this.f47459c = uVar;
        }

        @Override // D9.InterfaceC0644f
        public final Object b(InterfaceC0645g<? super m> interfaceC0645g, InterfaceC4347e interfaceC4347e) throws Throwable {
            Object objB = this.f47458b.b(new a(interfaceC0645g, this.f47459c), interfaceC4347e);
            return objB == g9.a.COROUTINE_SUSPENDED ? objB : C1992A.f18074a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @h9.e(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {89}, m = "invokeSuspend")
    public static final class g extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f47465l;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f47467n;

        /* compiled from: SessionDatastore.kt */
        @h9.e(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        public static final class a extends h9.i implements p9.p<C1643a, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f47468l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f47469m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, InterfaceC4347e<? super a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f47469m = str;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                a aVar = new a(this.f47469m, interfaceC4347e);
                aVar.f47468l = obj;
                return aVar;
            }

            @Override // p9.p
            public final Object invoke(C1643a c1643a, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return ((a) create(c1643a, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                b9.n.b(obj);
                C1643a c1643a = (C1643a) this.f47468l;
                c1643a.getClass();
                d.a<String> key = d.f47454a;
                kotlin.jvm.internal.l.f(key, "key");
                c1643a.c(key, this.f47469m);
                return C1992A.f18074a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, InterfaceC4347e<? super g> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f47467n = str;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return u.this.new g(this.f47467n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((g) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f47465l;
            try {
                if (i == 0) {
                    b9.n.b(obj);
                    c cVar = u.f47443e;
                    Context context = u.this.f47445a;
                    cVar.getClass();
                    X0.h hVar = (X0.h) u.f47444f.a(context, c.f47453a[0]);
                    a aVar2 = new a(this.f47467n, null);
                    this.f47465l = 1;
                    if (hVar.a(new a1.e(aVar2, null), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b9.n.b(obj);
                }
            } catch (IOException e4) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e4);
            }
            return C1992A.f18074a;
        }
    }

    public u(Context context, InterfaceC4350h interfaceC4350h) {
        this.f47445a = context;
        this.f47446b = interfaceC4350h;
        f47443e.getClass();
        this.f47448d = new f(new C0649k(((X0.h) f47444f.a(context, c.f47453a[0])).getData(), new e(3, null)), this);
        C0575f.e(A9.F.a(interfaceC4350h), null, null, new a(null), 3);
    }

    @Override // w5.t
    public final String a() {
        m mVar = this.f47447c.get();
        if (mVar != null) {
            return mVar.f47429a;
        }
        return null;
    }

    @Override // w5.t
    public final void b(String sessionId) {
        kotlin.jvm.internal.l.f(sessionId, "sessionId");
        C0575f.e(A9.F.a(this.f47446b), null, null, new g(sessionId, null), 3);
    }
}
