package vf;

import Ii.AbstractC3059i;
import Ii.AbstractC3063k;
import Ii.C3048c0;
import Ii.O;
import L0.C3174d;
import L0.D;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Li.J;
import Li.N;
import W0.k;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import android.util.Patterns;
import androidx.compose.ui.platform.t1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.p;
import kotlin.text.t;
import mh.InterfaceC6839p;

/* renamed from: vf.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8225e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f63600d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final t1 f63601a;

    /* renamed from: b, reason: collision with root package name */
    private final c[] f63602b;

    /* renamed from: c, reason: collision with root package name */
    private final N f63603c;

    /* renamed from: vf.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: vf.e$b */
    private static abstract class b {

        /* renamed from: vf.e$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f63604a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String host) {
                super(null);
                AbstractC6492s.i(host, "host");
                this.f63604a = host;
            }

            public final String a() {
                return this.f63604a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f63604a, ((a) obj).f63604a);
            }

            public int hashCode() {
                return this.f63604a.hashCode();
            }

            public String toString() {
                return "Hostname(host=" + this.f63604a + ")";
            }
        }

        /* renamed from: vf.e$b$b, reason: collision with other inner class name */
        public static final class C2259b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final inet.ipaddr.g f63605a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2259b(inet.ipaddr.g host) {
                super(null);
                AbstractC6492s.i(host, "host");
                this.f63605a = host;
            }

            public final inet.ipaddr.g a() {
                return this.f63605a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2259b) && AbstractC6492s.d(this.f63605a, ((C2259b) obj).f63605a);
            }

            public int hashCode() {
                return this.f63605a.hashCode();
            }

            public String toString() {
                return "IP(host=" + this.f63605a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: vf.e$c */
    private static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        private final int port;
        private final String scheme;
        public static final c HTTPS = new c("HTTPS", 0, 443, "https");
        public static final c HTTPS_ALT = new c("HTTPS_ALT", 1, 8443, "https");
        public static final c HTTP = new c("HTTP", 2, 80, "http");
        public static final c HTTP_ALT = new c("HTTP_ALT", 3, 8080, "http");

        private static final /* synthetic */ c[] $values() {
            return new c[]{HTTPS, HTTPS_ALT, HTTP, HTTP_ALT};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10, int i11, String str2) {
            this.port = i11;
            this.scheme = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final int getPort() {
            return this.port;
        }

        public final String getScheme() {
            return this.scheme;
        }
    }

    /* renamed from: vf.e$d */
    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f63606a;

        /* renamed from: b, reason: collision with root package name */
        Object f63607b;

        /* renamed from: c, reason: collision with root package name */
        int f63608c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f63609d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3174d f63610e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C8225e f63611f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f63612g;

        /* renamed from: vf.e$d$a */
        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f63613a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f63614b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f63615c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C8225e f63616d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ConcurrentHashMap f63617e;

            /* renamed from: vf.e$d$a$a, reason: collision with other inner class name */
            static final class C2260a extends l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                Object f63618a;

                /* renamed from: b, reason: collision with root package name */
                Object f63619b;

                /* renamed from: c, reason: collision with root package name */
                Object f63620c;

                /* renamed from: d, reason: collision with root package name */
                Object f63621d;

                /* renamed from: e, reason: collision with root package name */
                int f63622e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ List f63623f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C8225e f63624g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ ConcurrentHashMap f63625h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2260a(List list, C8225e c8225e, ConcurrentHashMap concurrentHashMap, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f63623f = list;
                    this.f63624g = c8225e;
                    this.f63625h = concurrentHashMap;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C2260a(this.f63623f, this.f63624g, this.f63625h, interfaceC5380e);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0054 -> B:14:0x0057). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = eh.AbstractC5467b.g()
                        int r1 = r6.f63622e
                        r2 = 1
                        if (r1 == 0) goto L27
                        if (r1 != r2) goto L1f
                        java.lang.Object r1 = r6.f63621d
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.Object r3 = r6.f63620c
                        java.util.Iterator r3 = (java.util.Iterator) r3
                        java.lang.Object r4 = r6.f63619b
                        java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
                        java.lang.Object r5 = r6.f63618a
                        vf.e r5 = (vf.C8225e) r5
                        Yg.v.b(r7)
                        goto L57
                    L1f:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L27:
                        Yg.v.b(r7)
                        java.util.List r7 = r6.f63623f
                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                        vf.e r1 = r6.f63624g
                        java.util.concurrent.ConcurrentHashMap r3 = r6.f63625h
                        java.util.Iterator r7 = r7.iterator()
                        r5 = r1
                        r4 = r3
                        r3 = r7
                    L39:
                        boolean r7 = r3.hasNext()
                        if (r7 == 0) goto L5f
                        java.lang.Object r7 = r3.next()
                        r1 = r7
                        java.lang.String r1 = (java.lang.String) r1
                        r6.f63618a = r5
                        r6.f63619b = r4
                        r6.f63620c = r3
                        r6.f63621d = r1
                        r6.f63622e = r2
                        java.lang.Object r7 = vf.C8225e.b(r5, r1, r6)
                        if (r7 != r0) goto L57
                        return r0
                    L57:
                        java.net.URL r7 = (java.net.URL) r7
                        if (r7 == 0) goto L39
                        r4.put(r1, r7)
                        goto L39
                    L5f:
                        Yg.J r7 = Yg.J.f24997a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: vf.C8225e.d.a.C2260a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C2260a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, C8225e c8225e, ConcurrentHashMap concurrentHashMap, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f63615c = list;
                this.f63616d = c8225e;
                this.f63617e = concurrentHashMap;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f63615c, this.f63616d, this.f63617e, interfaceC5380e);
                aVar.f63614b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f63613a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return AbstractC3063k.d((Ii.N) this.f63614b, null, null, new C2260a(this.f63615c, this.f63616d, this.f63617e, null), 3, null);
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3174d c3174d, C8225e c8225e, long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63610e = c3174d;
            this.f63611f = c8225e;
            this.f63612g = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(this.f63610e, this.f63611f, this.f63612g, interfaceC5380e);
            dVar.f63609d = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3221h interfaceC3221h;
            List<String> arrayList;
            ConcurrentHashMap concurrentHashMap;
            C3174d.a aVar;
            long j10;
            Object objG = AbstractC5467b.g();
            int i10 = this.f63608c;
            if (i10 == 0) {
                v.b(obj);
                interfaceC3221h = (InterfaceC3221h) this.f63609d;
                List listP = new p("\\s+").p(this.f63610e, 0);
                arrayList = new ArrayList();
                for (Object obj2 : listP) {
                    if (Patterns.WEB_URL.matcher((String) obj2).matches()) {
                        arrayList.add(obj2);
                    }
                }
                concurrentHashMap = new ConcurrentHashMap();
                a aVar2 = new a(arrayList, this.f63611f, concurrentHashMap, null);
                this.f63609d = interfaceC3221h;
                this.f63606a = arrayList;
                this.f63607b = concurrentHashMap;
                this.f63608c = 1;
                if (O.g(aVar2, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    return J.f24997a;
                }
                concurrentHashMap = (ConcurrentHashMap) this.f63607b;
                arrayList = (List) this.f63606a;
                interfaceC3221h = (InterfaceC3221h) this.f63609d;
                v.b(obj);
            }
            C3174d c3174d = this.f63610e;
            long j11 = this.f63612g;
            C3174d.a aVar3 = new C3174d.a(0, 1, null);
            aVar3.g(c3174d);
            for (String str : arrayList) {
                Object obj3 = concurrentHashMap.get(str);
                if (obj3 != null) {
                    aVar = aVar3;
                    j10 = j11;
                    int iK0 = t.k0(c3174d, str, 0, false, 6, null);
                    int length = str.length() + iK0;
                    aVar.c(new D(j10, 0L, null, null, null, null, null, 0L, null, null, null, 0L, k.f23532b.c(), null, null, null, 61438, null), iK0, length);
                    String string = ((URL) obj3).toString();
                    AbstractC6492s.h(string, "toString(...)");
                    aVar.a("hostAddress", string, iK0, length);
                } else {
                    aVar = aVar3;
                    j10 = j11;
                }
                aVar3 = aVar;
                j11 = j10;
            }
            C3174d c3174dP = aVar3.p();
            this.f63609d = null;
            this.f63606a = null;
            this.f63607b = null;
            this.f63608c = 2;
            if (interfaceC3221h.a(c3174dP, this) == objG) {
                return objG;
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((d) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: vf.e$e, reason: collision with other inner class name */
    static final class C2261e extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f63626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f63627b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8225e f63628c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2261e(String str, C8225e c8225e, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63627b = str;
            this.f63628c = c8225e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new C2261e(this.f63627b, this.f63628c, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: AddressStringException | IncompatibleAddressException -> 0x005d, TRY_LEAVE, TryCatch #2 {AddressStringException | IncompatibleAddressException -> 0x005d, blocks: (B:13:0x003e, B:15:0x004d), top: B:25:0x003e }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[ORIG_RETURN, RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.String r0 = ""
                eh.AbstractC5467b.g()
                int r1 = r4.f63626a
                if (r1 != 0) goto L5f
                Yg.v.b(r5)
                java.net.URL r5 = new java.net.URL     // Catch: java.net.MalformedURLException -> L14
                java.lang.String r1 = r4.f63627b     // Catch: java.net.MalformedURLException -> L14
                r5.<init>(r1)     // Catch: java.net.MalformedURLException -> L14
                return r5
            L14:
                inet.ipaddr.n r5 = new inet.ipaddr.n     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = r4.f63627b     // Catch: java.lang.Throwable -> L3e
                r5.<init>(r1)     // Catch: java.lang.Throwable -> L3e
                inet.ipaddr.g r5 = r5.g()     // Catch: java.lang.Throwable -> L3e
                if (r5 == 0) goto L3e
                vf.e$b$b r1 = new vf.e$b$b     // Catch: java.lang.Throwable -> L3e
                r1.<init>(r5)     // Catch: java.lang.Throwable -> L3e
                vf.e r5 = r4.f63628c     // Catch: java.lang.Throwable -> L3e
                vf.e$c r5 = vf.C8225e.a(r5, r1)     // Catch: java.lang.Throwable -> L3e
                if (r5 == 0) goto L3e
                java.lang.String r1 = r4.f63627b     // Catch: java.lang.Throwable -> L3e
                java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L3e
                java.lang.String r3 = r5.getScheme()     // Catch: java.lang.Throwable -> L3e
                int r5 = r5.getPort()     // Catch: java.lang.Throwable -> L3e
                r2.<init>(r3, r1, r5, r0)     // Catch: java.lang.Throwable -> L3e
                return r2
            L3e:
                vf.e r5 = r4.f63628c     // Catch: java.lang.Throwable -> L5d
                vf.e$b$a r1 = new vf.e$b$a     // Catch: java.lang.Throwable -> L5d
                java.lang.String r2 = r4.f63627b     // Catch: java.lang.Throwable -> L5d
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L5d
                vf.e$c r5 = vf.C8225e.a(r5, r1)     // Catch: java.lang.Throwable -> L5d
                if (r5 == 0) goto L5d
                java.lang.String r1 = r4.f63627b     // Catch: java.lang.Throwable -> L5d
                java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L5d
                java.lang.String r3 = r5.getScheme()     // Catch: java.lang.Throwable -> L5d
                int r5 = r5.getPort()     // Catch: java.lang.Throwable -> L5d
                r2.<init>(r3, r1, r5, r0)     // Catch: java.lang.Throwable -> L5d
                return r2
            L5d:
                r5 = 0
                return r5
            L5f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: vf.C8225e.C2261e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((C2261e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public /* synthetic */ C8225e(C3174d c3174d, long j10, t1 t1Var, Ii.N n10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, j10, t1Var, n10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c c(b bVar) {
        for (c cVar : this.f63602b) {
            if (e(this, bVar, cVar.getPort(), 0, 4, null)) {
                return cVar;
            }
        }
        return null;
    }

    private final boolean d(b bVar, int i10, int i11) throws IOException {
        InetSocketAddress inetSocketAddress;
        Z7.b.h("HyperlinkString - Checking host: " + bVar, null, 2, null);
        boolean z10 = false;
        try {
            Socket socket = new Socket();
            if (bVar instanceof b.C2259b) {
                inetSocketAddress = new InetSocketAddress(((b.C2259b) bVar).a().p1(), i10);
            } else {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                inetSocketAddress = new InetSocketAddress(((b.a) bVar).a(), i10);
            }
            socket.connect(inetSocketAddress, i11);
            socket.close();
            z10 = true;
        } catch (IOException | IllegalArgumentException | SecurityException unused) {
        }
        Z7.b.h("HyperlinkString - Checking host: " + bVar + ", port: " + i10 + " - RESULT " + z10, null, 2, null);
        return z10;
    }

    static /* synthetic */ boolean e(C8225e c8225e, b bVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 200;
        }
        return c8225e.d(bVar, i10, i11);
    }

    private final InterfaceC3220g f(C3174d c3174d, long j10) {
        return AbstractC3222i.A(new d(c3174d, this, j10, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(String str, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.b(), new C2261e(str, this, null), interfaceC5380e);
    }

    public final N g() {
        return this.f63603c;
    }

    public final void i(int i10) {
        C3174d.c cVar = (C3174d.c) AbstractC3689v.s0(((C3174d) this.f63603c.getValue()).i(i10, i10));
        if (AbstractC6492s.d(cVar != null ? cVar.i() : null, "hostAddress")) {
            Z7.b.h("User clicked on '" + cVar.g() + "'. Opening default web browser...", null, 2, null);
            this.f63601a.a((String) cVar.g());
        }
    }

    private C8225e(C3174d str, long j10, t1 uriHandler, Ii.N coroutineScope) {
        AbstractC6492s.i(str, "str");
        AbstractC6492s.i(uriHandler, "uriHandler");
        AbstractC6492s.i(coroutineScope, "coroutineScope");
        this.f63601a = uriHandler;
        this.f63602b = (c[]) c.getEntries().toArray(new c[0]);
        this.f63603c = AbstractC3222i.M(f(str, j10), coroutineScope, J.a.b(Li.J.f11860a, 0L, 0L, 3, null), str);
    }
}
