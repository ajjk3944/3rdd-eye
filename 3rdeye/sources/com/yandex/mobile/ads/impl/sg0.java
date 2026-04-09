package com.yandex.mobile.ads.impl;

import N7.G8;
import b9.C1992A;
import com.yandex.mobile.ads.impl.yg0;
import ia.C4468d;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class sg0 implements Closeable {

    /* renamed from: C, reason: collision with root package name */
    private static final ox1 f32976C;

    /* renamed from: A, reason: collision with root package name */
    private final c f32977A;

    /* renamed from: B, reason: collision with root package name */
    private final LinkedHashSet f32978B;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32979a;

    /* renamed from: b, reason: collision with root package name */
    private final b f32980b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f32981c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32982d;

    /* renamed from: e, reason: collision with root package name */
    private int f32983e;

    /* renamed from: f, reason: collision with root package name */
    private int f32984f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f32985g;

    /* renamed from: h, reason: collision with root package name */
    private final z32 f32986h;
    private final y32 i;

    /* renamed from: j, reason: collision with root package name */
    private final y32 f32987j;

    /* renamed from: k, reason: collision with root package name */
    private final y32 f32988k;

    /* renamed from: l, reason: collision with root package name */
    private final wm1 f32989l;

    /* renamed from: m, reason: collision with root package name */
    private long f32990m;

    /* renamed from: n, reason: collision with root package name */
    private long f32991n;

    /* renamed from: o, reason: collision with root package name */
    private long f32992o;

    /* renamed from: p, reason: collision with root package name */
    private long f32993p;

    /* renamed from: q, reason: collision with root package name */
    private long f32994q;

    /* renamed from: r, reason: collision with root package name */
    private long f32995r;

    /* renamed from: s, reason: collision with root package name */
    private final ox1 f32996s;

    /* renamed from: t, reason: collision with root package name */
    private ox1 f32997t;

    /* renamed from: u, reason: collision with root package name */
    private long f32998u;

    /* renamed from: v, reason: collision with root package name */
    private long f32999v;

    /* renamed from: w, reason: collision with root package name */
    private long f33000w;

    /* renamed from: x, reason: collision with root package name */
    private long f33001x;

    /* renamed from: y, reason: collision with root package name */
    private final Socket f33002y;

    /* renamed from: z, reason: collision with root package name */
    private final ah0 f33003z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33004a;

        /* renamed from: b, reason: collision with root package name */
        private final z32 f33005b;

        /* renamed from: c, reason: collision with root package name */
        public Socket f33006c;

        /* renamed from: d, reason: collision with root package name */
        public String f33007d;

        /* renamed from: e, reason: collision with root package name */
        public ia.g f33008e;

        /* renamed from: f, reason: collision with root package name */
        public ia.f f33009f;

        /* renamed from: g, reason: collision with root package name */
        private b f33010g;

        /* renamed from: h, reason: collision with root package name */
        private wm1 f33011h;
        private int i;

        public a(z32 taskRunner) {
            kotlin.jvm.internal.l.f(taskRunner, "taskRunner");
            this.f33004a = true;
            this.f33005b = taskRunner;
            this.f33010g = b.f33012a;
            this.f33011h = wm1.f35020a;
        }

        public final boolean a() {
            return this.f33004a;
        }

        public final String b() {
            String str = this.f33007d;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.l.l("connectionName");
            throw null;
        }

        public final b c() {
            return this.f33010g;
        }

        public final int d() {
            return this.i;
        }

        public final wm1 e() {
            return this.f33011h;
        }

        public final ia.f f() {
            ia.f fVar = this.f33009f;
            if (fVar != null) {
                return fVar;
            }
            kotlin.jvm.internal.l.l("sink");
            throw null;
        }

        public final Socket g() {
            Socket socket = this.f33006c;
            if (socket != null) {
                return socket;
            }
            kotlin.jvm.internal.l.l("socket");
            throw null;
        }

        public final ia.g h() {
            ia.g gVar = this.f33008e;
            if (gVar != null) {
                return gVar;
            }
            kotlin.jvm.internal.l.l(AdRevenueConstants.SOURCE_KEY);
            throw null;
        }

        public final z32 i() {
            return this.f33005b;
        }

        public final a j() {
            this.i = 0;
            return this;
        }

        public final a a(b listener) {
            kotlin.jvm.internal.l.f(listener, "listener");
            this.f33010g = listener;
            return this;
        }

        public final a a(Socket socket, String peerName, ia.g source, ia.f sink) throws IOException {
            String strConcat;
            kotlin.jvm.internal.l.f(socket, "socket");
            kotlin.jvm.internal.l.f(peerName, "peerName");
            kotlin.jvm.internal.l.f(source, "source");
            kotlin.jvm.internal.l.f(sink, "sink");
            this.f33006c = socket;
            if (this.f33004a) {
                strConcat = B4.g.o(t82.f33486g, " ", peerName);
            } else {
                strConcat = "MockWebServer ".concat(peerName);
            }
            kotlin.jvm.internal.l.f(strConcat, "<set-?>");
            this.f33007d = strConcat;
            this.f33008e = source;
            this.f33009f = sink;
            return this;
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33012a = new a();

        public static final class a extends b {
            @Override // com.yandex.mobile.ads.impl.sg0.b
            public final void a(zg0 stream) throws IOException {
                kotlin.jvm.internal.l.f(stream, "stream");
                stream.a(o50.f31190h, (IOException) null);
            }
        }

        public void a(sg0 connection, ox1 settings) {
            kotlin.jvm.internal.l.f(connection, "connection");
            kotlin.jvm.internal.l.f(settings, "settings");
        }

        public abstract void a(zg0 zg0Var) throws IOException;
    }

    public static final class d extends v32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ sg0 f33017e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33018f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f33019g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, sg0 sg0Var, int i, List list, boolean z10) {
            super(str, true);
            this.f33017e = sg0Var;
            this.f33018f = i;
            this.f33019g = list;
        }

        @Override // com.yandex.mobile.ads.impl.v32
        public final long e() {
            wm1 wm1Var = this.f33017e.f32989l;
            List responseHeaders = this.f33019g;
            ((vm1) wm1Var).getClass();
            kotlin.jvm.internal.l.f(responseHeaders, "responseHeaders");
            try {
                this.f33017e.k().a(this.f33018f, o50.i);
                synchronized (this.f33017e) {
                    this.f33017e.f32978B.remove(Integer.valueOf(this.f33018f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class e extends v32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ sg0 f33020e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33021f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f33022g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, sg0 sg0Var, int i, List list) {
            super(str, true);
            this.f33020e = sg0Var;
            this.f33021f = i;
            this.f33022g = list;
        }

        @Override // com.yandex.mobile.ads.impl.v32
        public final long e() {
            wm1 wm1Var = this.f33020e.f32989l;
            List requestHeaders = this.f33022g;
            ((vm1) wm1Var).getClass();
            kotlin.jvm.internal.l.f(requestHeaders, "requestHeaders");
            try {
                this.f33020e.k().a(this.f33021f, o50.i);
                synchronized (this.f33020e) {
                    this.f33020e.f32978B.remove(Integer.valueOf(this.f33021f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class f extends v32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ sg0 f33023e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33024f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o50 f33025g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, sg0 sg0Var, int i, o50 o50Var) {
            super(str, true);
            this.f33023e = sg0Var;
            this.f33024f = i;
            this.f33025g = o50Var;
        }

        @Override // com.yandex.mobile.ads.impl.v32
        public final long e() {
            wm1 wm1Var = this.f33023e.f32989l;
            o50 errorCode = this.f33025g;
            ((vm1) wm1Var).getClass();
            kotlin.jvm.internal.l.f(errorCode, "errorCode");
            synchronized (this.f33023e) {
                this.f33023e.f32978B.remove(Integer.valueOf(this.f33024f));
                C1992A c1992a = C1992A.f18074a;
            }
            return -1L;
        }
    }

    public static final class g extends v32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ sg0 f33026e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, sg0 sg0Var) {
            super(str, true);
            this.f33026e = sg0Var;
        }

        @Override // com.yandex.mobile.ads.impl.v32
        public final long e() throws IOException {
            this.f33026e.a(2, 0, false);
            return -1L;
        }
    }

    public static final class h extends v32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ sg0 f33027e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f33028f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, sg0 sg0Var, long j4) {
            super(str);
            this.f33027e = sg0Var;
            this.f33028f = j4;
        }

        @Override // com.yandex.mobile.ads.impl.v32
        public final long e() throws IOException {
            boolean z10;
            synchronized (this.f33027e) {
                if (this.f33027e.f32991n < this.f33027e.f32990m) {
                    z10 = true;
                } else {
                    this.f33027e.f32990m++;
                    z10 = false;
                }
            }
            if (z10) {
                sg0.a(this.f33027e, (IOException) null);
                return -1L;
            }
            this.f33027e.a(1, 0, false);
            return this.f33028f;
        }
    }

    public static final class i extends v32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ sg0 f33029e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33030f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o50 f33031g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, sg0 sg0Var, int i, o50 o50Var) {
            super(str, true);
            this.f33029e = sg0Var;
            this.f33030f = i;
            this.f33031g = o50Var;
        }

        @Override // com.yandex.mobile.ads.impl.v32
        public final long e() throws IOException {
            try {
                this.f33029e.b(this.f33030f, this.f33031g);
                return -1L;
            } catch (IOException e4) {
                sg0.a(this.f33029e, e4);
                return -1L;
            }
        }
    }

    public static final class j extends v32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ sg0 f33032e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f33033f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f33034g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, sg0 sg0Var, int i, long j4) {
            super(str, true);
            this.f33032e = sg0Var;
            this.f33033f = i;
            this.f33034g = j4;
        }

        @Override // com.yandex.mobile.ads.impl.v32
        public final long e() throws IOException {
            try {
                this.f33032e.k().a(this.f33033f, this.f33034g);
                return -1L;
            } catch (IOException e4) {
                sg0.a(this.f33032e, e4);
                return -1L;
            }
        }
    }

    static {
        ox1 ox1Var = new ox1();
        ox1Var.a(7, 65535);
        ox1Var.a(5, 16384);
        f32976C = ox1Var;
    }

    public sg0(a builder) {
        kotlin.jvm.internal.l.f(builder, "builder");
        boolean zA = builder.a();
        this.f32979a = zA;
        this.f32980b = builder.c();
        this.f32981c = new LinkedHashMap();
        String strB = builder.b();
        this.f32982d = strB;
        this.f32984f = builder.a() ? 3 : 2;
        z32 z32VarI = builder.i();
        this.f32986h = z32VarI;
        y32 y32VarE = z32VarI.e();
        this.i = y32VarE;
        this.f32987j = z32VarI.e();
        this.f32988k = z32VarI.e();
        this.f32989l = builder.e();
        ox1 ox1Var = new ox1();
        if (builder.a()) {
            ox1Var.a(7, 16777216);
        }
        this.f32996s = ox1Var;
        this.f32997t = f32976C;
        this.f33001x = r2.b();
        this.f33002y = builder.g();
        this.f33003z = new ah0(builder.f(), zA);
        this.f32977A = new c(this, new yg0(builder.h(), zA));
        this.f32978B = new LinkedHashSet();
        if (builder.d() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.d());
            y32VarE.a(new h(G8.s(strB, " ping"), this, nanos), nanos);
        }
    }

    public static final void a(sg0 sg0Var, IOException iOException) throws IOException {
        sg0Var.getClass();
        o50 o50Var = o50.f31187e;
        sg0Var.a(o50Var, o50Var, iOException);
    }

    public static boolean b(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(o50.f31186d, o50.i, (IOException) null);
    }

    public final void flush() throws IOException {
        this.f33003z.flush();
    }

    public final void l() {
        synchronized (this) {
            long j4 = this.f32993p;
            long j10 = this.f32992o;
            if (j4 < j10) {
                return;
            }
            this.f32992o = j10 + 1;
            this.f32995r = System.nanoTime() + 1000000000;
            C1992A c1992a = C1992A.f18074a;
            this.i.a(new g(G8.s(this.f32982d, " ping"), this), 0L);
        }
    }

    public final int f() {
        return this.f32984f;
    }

    public final ox1 g() {
        return this.f32996s;
    }

    public final ox1 h() {
        return this.f32997t;
    }

    public final LinkedHashMap i() {
        return this.f32981c;
    }

    public final long j() {
        return this.f33001x;
    }

    public final ah0 k() {
        return this.f33003z;
    }

    public final String c() {
        return this.f32982d;
    }

    public final int d() {
        return this.f32983e;
    }

    public final b e() {
        return this.f32980b;
    }

    public final boolean b() {
        return this.f32979a;
    }

    public final synchronized zg0 c(int i10) {
        zg0 zg0Var;
        zg0Var = (zg0) this.f32981c.remove(Integer.valueOf(i10));
        notifyAll();
        return zg0Var;
    }

    public final void d(int i10) {
        this.f32983e = i10;
    }

    public final void a(o50 connectionCode, o50 streamCode, IOException iOException) throws IOException {
        int i10;
        Object[] array;
        kotlin.jvm.internal.l.f(connectionCode, "connectionCode");
        kotlin.jvm.internal.l.f(streamCode, "streamCode");
        if (t82.f33485f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            a(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f32981c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f32981c.values().toArray(new zg0[0]);
                    this.f32981c.clear();
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
        zg0[] zg0VarArr = (zg0[]) array;
        if (zg0VarArr != null) {
            for (zg0 zg0Var : zg0VarArr) {
                try {
                    zg0Var.a(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f33003z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f33002y.close();
        } catch (IOException unused4) {
        }
        this.i.j();
        this.f32987j.j();
        this.f32988k.j();
    }

    public final synchronized void b(long j4) {
        long j10 = this.f32998u + j4;
        this.f32998u = j10;
        long j11 = j10 - this.f32999v;
        if (j11 >= this.f32996s.b() / 2) {
            a(0, j11);
            this.f32999v += j11;
        }
    }

    public final void c(int i10, o50 errorCode) {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        this.i.a(new i(this.f32982d + "[" + i10 + "] writeSynReset", this, i10, errorCode), 0L);
    }

    public final void b(int i10, o50 statusCode) throws IOException {
        kotlin.jvm.internal.l.f(statusCode, "statusCode");
        this.f33003z.a(i10, statusCode);
    }

    public static void l(sg0 sg0Var) throws IOException {
        z32 taskRunner = z32.f36157h;
        kotlin.jvm.internal.l.f(taskRunner, "taskRunner");
        sg0Var.f33003z.a();
        sg0Var.f33003z.b(sg0Var.f32996s);
        if (sg0Var.f32996s.b() != 65535) {
            sg0Var.f33003z.a(0, r1 - 65535);
        }
        taskRunner.e().a(new x32(sg0Var.f32982d, sg0Var.f32977A), 0L);
    }

    public final synchronized zg0 a(int i10) {
        return (zg0) this.f32981c.get(Integer.valueOf(i10));
    }

    public final synchronized boolean a(long j4) {
        if (this.f32985g) {
            return false;
        }
        if (this.f32993p < this.f32992o) {
            if (j4 >= this.f32995r) {
                return false;
            }
        }
        return true;
    }

    public final zg0 a(ArrayList requestHeaders, boolean z10) throws Throwable {
        Throwable th;
        kotlin.jvm.internal.l.f(requestHeaders, "requestHeaders");
        boolean z11 = true;
        boolean z12 = !z10;
        synchronized (this.f33003z) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f32984f > 1073741823) {
                                try {
                                    a(o50.f31190h);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            if (!this.f32985g) {
                                int i10 = this.f32984f;
                                this.f32984f = i10 + 2;
                                zg0 zg0Var = new zg0(i10, this, z12, false, null);
                                if (z10 && this.f33000w < this.f33001x && zg0Var.n() < zg0Var.m()) {
                                    z11 = false;
                                }
                                if (zg0Var.q()) {
                                    this.f32981c.put(Integer.valueOf(i10), zg0Var);
                                }
                                C1992A c1992a = C1992A.f18074a;
                                this.f33003z.a(i10, requestHeaders, z12);
                                if (z11) {
                                    this.f33003z.flush();
                                }
                                return zg0Var;
                            }
                            throw new kr();
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    public final class c implements yg0.c, InterfaceC5480a<C1992A> {

        /* renamed from: b, reason: collision with root package name */
        private final yg0 f33013b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ sg0 f33014c;

        public static final class a extends v32 {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ sg0 f33015e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.w f33016f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, sg0 sg0Var, kotlin.jvm.internal.w wVar) {
                super(str, true);
                this.f33015e = sg0Var;
                this.f33016f = wVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yandex.mobile.ads.impl.v32
            public final long e() {
                this.f33015e.e().a(this.f33015e, (ox1) this.f33016f.f43660b);
                return -1L;
            }
        }

        public c(sg0 sg0Var, yg0 reader) {
            kotlin.jvm.internal.l.f(reader, "reader");
            this.f33014c = sg0Var;
            this.f33013b = reader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v2, types: [T, com.yandex.mobile.ads.impl.ox1] */
        /* JADX WARN: Type inference failed for: r12v3 */
        public final void a(boolean z10, ox1 settings) {
            ?? r12;
            long jB;
            int i;
            zg0[] zg0VarArr;
            kotlin.jvm.internal.l.f(settings, "settings");
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            ah0 ah0VarK = this.f33014c.k();
            sg0 sg0Var = this.f33014c;
            synchronized (ah0VarK) {
                synchronized (sg0Var) {
                    try {
                        ox1 ox1VarH = sg0Var.h();
                        if (z10) {
                            r12 = settings;
                        } else {
                            ox1 ox1Var = new ox1();
                            ox1Var.a(ox1VarH);
                            ox1Var.a(settings);
                            r12 = ox1Var;
                        }
                        wVar.f43660b = r12;
                        jB = r12.b() - ox1VarH.b();
                        zg0VarArr = (jB == 0 || sg0Var.i().isEmpty()) ? null : (zg0[]) sg0Var.i().values().toArray(new zg0[0]);
                        sg0Var.a((ox1) wVar.f43660b);
                        sg0Var.f32988k.a(new a(sg0Var.c() + " onSettings", sg0Var, wVar), 0L);
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    sg0Var.k().a((ox1) wVar.f43660b);
                } catch (IOException e4) {
                    sg0.a(sg0Var, e4);
                }
                C1992A c1992a2 = C1992A.f18074a;
            }
            if (zg0VarArr != null) {
                for (zg0 zg0Var : zg0VarArr) {
                    synchronized (zg0Var) {
                        zg0Var.a(jB);
                        C1992A c1992a3 = C1992A.f18074a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.mobile.ads.impl.o50] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [b9.A] */
        @Override // p9.InterfaceC5480a
        public final C1992A invoke() throws Throwable {
            Throwable th;
            o50 o50Var;
            o50 o50Var2;
            o50 o50Var3 = o50.f31188f;
            IOException e4 = null;
            try {
                try {
                    this.f33013b.a(this);
                    while (this.f33013b.a(false, this)) {
                    }
                    o50Var2 = o50.f31186d;
                } catch (IOException e10) {
                    e4 = e10;
                } catch (Throwable th2) {
                    th = th2;
                    o50Var = o50Var3;
                    this.f33014c.a(o50Var, o50Var3, e4);
                    t82.a(this.f33013b);
                    throw th;
                }
                try {
                    this.f33014c.a(o50Var2, o50.i, (IOException) null);
                    t82.a(this.f33013b);
                    o50Var = o50Var2;
                } catch (IOException e11) {
                    e4 = e11;
                    o50 o50Var4 = o50.f31187e;
                    sg0 sg0Var = this.f33014c;
                    sg0Var.a(o50Var4, o50Var4, e4);
                    t82.a(this.f33013b);
                    o50Var = sg0Var;
                    o50Var3 = C1992A.f18074a;
                    return o50Var3;
                }
                o50Var3 = C1992A.f18074a;
                return o50Var3;
            } catch (Throwable th3) {
                th = th3;
                this.f33014c.a(o50Var, o50Var3, e4);
                t82.a(this.f33013b);
                throw th;
            }
        }

        @Override // com.yandex.mobile.ads.impl.yg0.c
        public final void a(int i, int i10, ia.g source, boolean z10) throws IOException {
            kotlin.jvm.internal.l.f(source, "source");
            this.f33014c.getClass();
            if (sg0.b(i)) {
                this.f33014c.a(i, i10, source, z10);
                return;
            }
            zg0 zg0VarA = this.f33014c.a(i);
            if (zg0VarA == null) {
                this.f33014c.c(i, o50.f31187e);
                long j4 = i10;
                this.f33014c.b(j4);
                source.skip(j4);
                return;
            }
            zg0VarA.a(source, i10);
            if (z10) {
                zg0VarA.a(t82.f33481b, true);
            }
        }

        @Override // com.yandex.mobile.ads.impl.yg0.c
        public final void a(int i, o50 errorCode, ia.h debugData) {
            int i10;
            Object[] array;
            kotlin.jvm.internal.l.f(errorCode, "errorCode");
            kotlin.jvm.internal.l.f(debugData, "debugData");
            debugData.c();
            sg0 sg0Var = this.f33014c;
            synchronized (sg0Var) {
                array = sg0Var.i().values().toArray(new zg0[0]);
                sg0Var.f32985g = true;
                C1992A c1992a = C1992A.f18074a;
            }
            for (zg0 zg0Var : (zg0[]) array) {
                if (zg0Var.f() > i && zg0Var.p()) {
                    zg0Var.b(o50.f31190h);
                    this.f33014c.c(zg0Var.f());
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.yg0.c
        public final void a(boolean z10, int i, List headerBlock) {
            kotlin.jvm.internal.l.f(headerBlock, "headerBlock");
            this.f33014c.getClass();
            if (sg0.b(i)) {
                this.f33014c.a(i, (List<ff0>) headerBlock, z10);
                return;
            }
            sg0 sg0Var = this.f33014c;
            synchronized (sg0Var) {
                zg0 zg0VarA = sg0Var.a(i);
                if (zg0VarA == null) {
                    if (sg0Var.f32985g) {
                        return;
                    }
                    if (i <= sg0Var.d()) {
                        return;
                    }
                    if (i % 2 == sg0Var.f() % 2) {
                        return;
                    }
                    zg0 zg0Var = new zg0(i, sg0Var, false, z10, t82.a((List<ff0>) headerBlock));
                    sg0Var.d(i);
                    sg0Var.i().put(Integer.valueOf(i), zg0Var);
                    sg0Var.f32986h.e().a(new tg0(sg0Var.c() + "[" + i + "] onStream", sg0Var, zg0Var), 0L);
                    return;
                }
                C1992A c1992a = C1992A.f18074a;
                zg0VarA.a(t82.a((List<ff0>) headerBlock), z10);
            }
        }

        @Override // com.yandex.mobile.ads.impl.yg0.c
        public final void a(int i, int i10, boolean z10) {
            if (z10) {
                sg0 sg0Var = this.f33014c;
                synchronized (sg0Var) {
                    try {
                        if (i == 1) {
                            sg0Var.f32991n++;
                        } else if (i == 2) {
                            sg0Var.f32993p++;
                        } else {
                            if (i == 3) {
                                sg0Var.f32994q++;
                                sg0Var.notifyAll();
                            }
                            C1992A c1992a = C1992A.f18074a;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            this.f33014c.i.a(new ug0(G8.s(this.f33014c.c(), " ping"), this.f33014c, i, i10), 0L);
        }

        @Override // com.yandex.mobile.ads.impl.yg0.c
        public final void a(int i, List requestHeaders) {
            kotlin.jvm.internal.l.f(requestHeaders, "requestHeaders");
            this.f33014c.a(i, (List<ff0>) requestHeaders);
        }

        @Override // com.yandex.mobile.ads.impl.yg0.c
        public final void a(int i, o50 errorCode) {
            kotlin.jvm.internal.l.f(errorCode, "errorCode");
            this.f33014c.getClass();
            if (sg0.b(i)) {
                this.f33014c.a(i, errorCode);
                return;
            }
            zg0 zg0VarC = this.f33014c.c(i);
            if (zg0VarC != null) {
                zg0VarC.b(errorCode);
            }
        }

        @Override // com.yandex.mobile.ads.impl.yg0.c
        public final void a(ox1 settings) {
            kotlin.jvm.internal.l.f(settings, "settings");
            this.f33014c.i.a(new vg0(G8.s(this.f33014c.c(), " applyAndAckSettings"), this, settings), 0L);
        }

        @Override // com.yandex.mobile.ads.impl.yg0.c
        public final void a(int i, long j4) {
            if (i == 0) {
                sg0 sg0Var = this.f33014c;
                synchronized (sg0Var) {
                    sg0Var.f33001x = sg0Var.j() + j4;
                    sg0Var.notifyAll();
                    C1992A c1992a = C1992A.f18074a;
                }
                return;
            }
            zg0 zg0VarA = this.f33014c.a(i);
            if (zg0VarA != null) {
                synchronized (zg0VarA) {
                    zg0VarA.a(j4);
                    C1992A c1992a2 = C1992A.f18074a;
                }
            }
        }
    }

    public final void a(int i10, int i11, ia.g source, boolean z10) throws IOException {
        kotlin.jvm.internal.l.f(source, "source");
        C4468d c4468d = new C4468d();
        long j4 = i11;
        source.F0(j4);
        source.read(c4468d, j4);
        this.f32987j.a(new wg0(this.f32982d + "[" + i10 + "] onData", this, i10, c4468d, i11, z10), 0L);
    }

    public final void a(int i10, List<ff0> requestHeaders, boolean z10) {
        kotlin.jvm.internal.l.f(requestHeaders, "requestHeaders");
        this.f32987j.a(new d(this.f32982d + "[" + i10 + "] onHeaders", this, i10, requestHeaders, z10), 0L);
    }

    public final void a(int i10, List<ff0> requestHeaders) {
        kotlin.jvm.internal.l.f(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f32978B.contains(Integer.valueOf(i10))) {
                c(i10, o50.f31187e);
                return;
            }
            this.f32978B.add(Integer.valueOf(i10));
            this.f32987j.a(new e(this.f32982d + "[" + i10 + "] onRequest", this, i10, requestHeaders), 0L);
        }
    }

    public final void a(int i10, o50 errorCode) {
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        this.f32987j.a(new f(this.f32982d + "[" + i10 + "] onReset", this, i10, errorCode), 0L);
    }

    public final void a(ox1 ox1Var) {
        kotlin.jvm.internal.l.f(ox1Var, "<set-?>");
        this.f32997t = ox1Var;
    }

    public final void a(o50 statusCode) throws IOException {
        kotlin.jvm.internal.l.f(statusCode, "statusCode");
        synchronized (this.f33003z) {
            synchronized (this) {
                if (this.f32985g) {
                    return;
                }
                this.f32985g = true;
                int i10 = this.f32983e;
                C1992A c1992a = C1992A.f18074a;
                this.f33003z.a(i10, statusCode, t82.f33480a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f33003z.b());
        r6 = r2;
        r8.f33000w += r6;
        r4 = b9.C1992A.f18074a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r9, boolean r10, ia.C4468d r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.yandex.mobile.ads.impl.ah0 r12 = r8.f33003z
            r12.a(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6c
            monitor-enter(r8)
        L12:
            long r4 = r8.f33000w     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            long r6 = r8.f33001x     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f32981c     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            goto L12
        L2a:
            r9 = move-exception
            goto L6a
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5d
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            com.yandex.mobile.ads.impl.ah0 r4 = r8.f33003z     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.b()     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f33000w     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f33000w = r4     // Catch: java.lang.Throwable -> L2a
            b9.A r4 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            com.yandex.mobile.ads.impl.ah0 r4 = r8.f33003z
            if (r10 == 0) goto L58
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L58
            r5 = 1
            goto L59
        L58:
            r5 = r3
        L59:
            r4.a(r5, r9, r11, r2)
            goto Ld
        L5d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L6a:
            monitor-exit(r8)
            throw r9
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sg0.a(int, boolean, ia.d, long):void");
    }

    public final void a(int i10, int i11, boolean z10) throws IOException {
        try {
            this.f33003z.a(i10, i11, z10);
        } catch (IOException e4) {
            o50 o50Var = o50.f31187e;
            a(o50Var, o50Var, e4);
        }
    }

    public final void a(int i10, long j4) {
        this.i.a(new j(this.f32982d + "[" + i10 + "] windowUpdate", this, i10, j4), 0L);
    }
}
