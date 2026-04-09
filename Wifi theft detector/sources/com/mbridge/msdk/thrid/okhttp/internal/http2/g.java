package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.thrid.okhttp.internal.http2.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g implements Closeable {
    static final /* synthetic */ boolean A = true;

    /* renamed from: z, reason: collision with root package name */
    private static final ExecutorService f17821z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Http2Connection", true));

    /* renamed from: a, reason: collision with root package name */
    final boolean f17822a;

    /* renamed from: b, reason: collision with root package name */
    final j f17823b;

    /* renamed from: d, reason: collision with root package name */
    final String f17825d;

    /* renamed from: e, reason: collision with root package name */
    int f17826e;

    /* renamed from: f, reason: collision with root package name */
    int f17827f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17828g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f17829h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f17830i;

    /* renamed from: j, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http2.l f17831j;

    /* renamed from: s, reason: collision with root package name */
    long f17840s;

    /* renamed from: u, reason: collision with root package name */
    final m f17842u;

    /* renamed from: v, reason: collision with root package name */
    final Socket f17843v;

    /* renamed from: w, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http2.j f17844w;

    /* renamed from: x, reason: collision with root package name */
    final l f17845x;

    /* renamed from: y, reason: collision with root package name */
    final Set<Integer> f17846y;

    /* renamed from: c, reason: collision with root package name */
    final Map<Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> f17824c = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    private long f17832k = 0;

    /* renamed from: l, reason: collision with root package name */
    private long f17833l = 0;

    /* renamed from: m, reason: collision with root package name */
    private long f17834m = 0;

    /* renamed from: n, reason: collision with root package name */
    private long f17835n = 0;

    /* renamed from: o, reason: collision with root package name */
    private long f17836o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f17837p = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f17838q = 0;

    /* renamed from: r, reason: collision with root package name */
    long f17839r = 0;

    /* renamed from: t, reason: collision with root package name */
    m f17841t = new m();

    public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17847b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f17848c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f17847b = i10;
            this.f17848c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.b(this.f17847b, this.f17848c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17850b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f17851c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f17850b = i10;
            this.f17851c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.f17844w.a(this.f17850b, this.f17851c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(false, 2, 0);
        }
    }

    public class d extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17854b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f17855c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f17854b = i10;
            this.f17855c = list;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            if (g.this.f17831j.a(this.f17854b, this.f17855c)) {
                try {
                    g.this.f17844w.a(this.f17854b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                    synchronized (g.this) {
                        g.this.f17846y.remove(Integer.valueOf(this.f17854b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    public class e extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17857b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f17858c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f17859d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f17857b = i10;
            this.f17858c = list;
            this.f17859d = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean zA = g.this.f17831j.a(this.f17857b, this.f17858c, this.f17859d);
            if (zA) {
                try {
                    g.this.f17844w.a(this.f17857b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zA || this.f17859d) {
                synchronized (g.this) {
                    g.this.f17846y.remove(Integer.valueOf(this.f17857b));
                }
            }
        }
    }

    public class f extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17861b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okio.c f17862c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17863d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f17864e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11, boolean z10) {
            super(str, objArr);
            this.f17861b = i10;
            this.f17862c = cVar;
            this.f17863d = i11;
            this.f17864e = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                boolean zA = g.this.f17831j.a(this.f17861b, this.f17862c, this.f17863d, this.f17864e);
                if (zA) {
                    g.this.f17844w.a(this.f17861b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                }
                if (zA || this.f17864e) {
                    synchronized (g.this) {
                        g.this.f17846y.remove(Integer.valueOf(this.f17861b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$g, reason: collision with other inner class name */
    public class C0325g extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17866b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f17867c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0325g(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f17866b = i10;
            this.f17867c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.f17831j.a(this.f17866b, this.f17867c);
            synchronized (g.this) {
                g.this.f17846y.remove(Integer.valueOf(this.f17866b));
            }
        }
    }

    public final class i extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public i() {
            super("OkHttp %s ping", g.this.f17825d);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean z10;
            synchronized (g.this) {
                if (g.this.f17833l < g.this.f17832k) {
                    z10 = true;
                } else {
                    g.e(g.this);
                    z10 = false;
                }
            }
            if (z10) {
                g.this.h();
            } else {
                g.this.a(false, 1, 0);
            }
        }
    }

    public static abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public static final j f17878a = new a();

        public static class a extends j {
            @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
            public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
                iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException;
    }

    public final class k extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final boolean f17879b;

        /* renamed from: c, reason: collision with root package name */
        final int f17880c;

        /* renamed from: d, reason: collision with root package name */
        final int f17881d;

        public k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", g.this.f17825d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f17879b = z10;
            this.f17880c = i10;
            this.f17881d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(this.f17879b, this.f17880c, this.f17881d);
        }
    }

    public class l extends com.mbridge.msdk.thrid.okhttp.internal.b implements h.b {

        /* renamed from: b, reason: collision with root package name */
        final com.mbridge.msdk.thrid.okhttp.internal.http2.h f17883b;

        public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.i f17885b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) {
                super(str, objArr);
                this.f17885b = iVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                try {
                    g.this.f17823b.a(this.f17885b);
                } catch (IOException e10) {
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Http2Connection.Listener failure for " + g.this.f17825d, e10);
                    try {
                        this.f17885b.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f17887b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ m f17888c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z10, m mVar) {
                super(str, objArr);
                this.f17887b = z10;
                this.f17888c = mVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                l.this.b(this.f17887b, this.f17888c);
            }
        }

        public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                g gVar = g.this;
                gVar.f17823b.a(gVar);
            }
        }

        public l(com.mbridge.msdk.thrid.okhttp.internal.http2.h hVar) {
            super("OkHttp %s", g.this.f17825d);
            this.f17883b = hVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() throws Throwable {
            Throwable th;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.INTERNAL_ERROR;
            try {
                try {
                    this.f17883b.a(this);
                    while (this.f17883b.a(false, (h.b) this)) {
                    }
                    bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR;
                } catch (IOException unused) {
                    bVar = bVar2;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    try {
                        g.this.a(bVar, bVar2);
                    } catch (IOException unused2) {
                    }
                    com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17883b);
                    throw th;
                }
                try {
                    try {
                        g.this.a(bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                    } catch (Throwable th3) {
                        th = th3;
                        g.this.a(bVar, bVar2);
                        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17883b);
                        throw th;
                    }
                } catch (IOException unused3) {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar3 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
                    g.this.a(bVar3, bVar3);
                    com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17883b);
                }
            } catch (IOException unused4) {
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f17883b);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, int i12, boolean z10) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11) throws IOException {
            if (g.this.b(i10)) {
                g.this.a(i10, eVar, i11, z10);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA == null) {
                g.this.c(i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                long j10 = i11;
                g.this.g(j10);
                eVar.skip(j10);
                return;
            }
            iVarA.a(eVar, i11);
            if (z10) {
                iVarA.i();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
            if (g.this.b(i10)) {
                g.this.b(i10, list, z10);
                return;
            }
            synchronized (g.this) {
                try {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
                    if (iVarA == null) {
                        if (g.this.f17828g) {
                            return;
                        }
                        g gVar = g.this;
                        if (i10 <= gVar.f17826e) {
                            return;
                        }
                        if (i10 % 2 == gVar.f17827f % 2) {
                            return;
                        }
                        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i10, g.this, false, z10, com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
                        g gVar2 = g.this;
                        gVar2.f17826e = i10;
                        gVar2.f17824c.put(Integer.valueOf(i10), iVar);
                        g.f17821z.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f17825d, Integer.valueOf(i10)}, iVar));
                        return;
                    }
                    iVarA.a(list);
                    if (z10) {
                        iVarA.i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b(boolean z10, m mVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            long j10;
            synchronized (g.this.f17844w) {
                synchronized (g.this) {
                    try {
                        int iC = g.this.f17842u.c();
                        if (z10) {
                            g.this.f17842u.a();
                        }
                        g.this.f17842u.a(mVar);
                        int iC2 = g.this.f17842u.c();
                        iVarArr = null;
                        if (iC2 == -1 || iC2 == iC) {
                            j10 = 0;
                        } else {
                            j10 = iC2 - iC;
                            if (!g.this.f17824c.isEmpty()) {
                                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f17824c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f17824c.size()]);
                            }
                        }
                    } finally {
                    }
                }
                try {
                    g gVar = g.this;
                    gVar.f17844w.a(gVar.f17842u);
                } catch (IOException unused) {
                    g.this.h();
                }
            }
            if (iVarArr != null) {
                for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j10);
                    }
                }
            }
            g.f17821z.execute(new c("OkHttp %s settings", g.this.f17825d));
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            if (g.this.b(i10)) {
                g.this.a(i10, bVar);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarC = g.this.c(i10);
            if (iVarC != null) {
                iVarC.d(bVar);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, m mVar) {
            try {
                g.this.f17829h.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.f17825d}, z10, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11) {
            if (!z10) {
                try {
                    g.this.f17829h.execute(g.this.new k(true, i10, i11));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (g.this) {
                try {
                    if (i10 == 1) {
                        g.c(g.this);
                    } else if (i10 == 2) {
                        g.h(g.this);
                    } else if (i10 == 3) {
                        g.i(g.this);
                        g.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okio.f fVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            fVar.j();
            synchronized (g.this) {
                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f17824c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f17824c.size()]);
                g.this.f17828g = true;
            }
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                if (iVar.c() > i10 && iVar.f()) {
                    iVar.d(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                    g.this.c(iVar.c());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, long j10) {
            if (i10 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f17840s += j10;
                    gVar.notifyAll();
                }
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA != null) {
                synchronized (iVarA) {
                    iVarA.a(j10);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) throws Throwable {
            g.this.a(i11, list);
        }
    }

    public g(h hVar) {
        m mVar = new m();
        this.f17842u = mVar;
        this.f17846y = new LinkedHashSet();
        this.f17831j = hVar.f17874f;
        boolean z10 = hVar.f17875g;
        this.f17822a = z10;
        this.f17823b = hVar.f17873e;
        int i10 = z10 ? 1 : 2;
        this.f17827f = i10;
        if (z10) {
            this.f17827f = i10 + 2;
        }
        if (z10) {
            this.f17841t.a(7, 16777216);
        }
        String str = hVar.f17870b;
        this.f17825d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Writer", str), false));
        this.f17829h = scheduledThreadPoolExecutor;
        if (hVar.f17876h != 0) {
            i iVar = new i();
            long j10 = hVar.f17876h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j10, j10, TimeUnit.MILLISECONDS);
        }
        this.f17830i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Push Observer", str), true));
        mVar.a(7, 65535);
        mVar.a(5, 16384);
        this.f17840s = mVar.c();
        this.f17843v = hVar.f17869a;
        this.f17844w = new com.mbridge.msdk.thrid.okhttp.internal.http2.j(hVar.f17872d, z10);
        this.f17845x = new l(new com.mbridge.msdk.thrid.okhttp.internal.http2.h(hVar.f17871c, z10));
    }

    public static /* synthetic */ long c(g gVar) {
        long j10 = gVar.f17833l;
        gVar.f17833l = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long e(g gVar) {
        long j10 = gVar.f17832k;
        gVar.f17832k = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long h(g gVar) {
        long j10 = gVar.f17835n;
        gVar.f17835n = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long i(g gVar) {
        long j10 = gVar.f17837p;
        gVar.f17837p = 1 + j10;
        return j10;
    }

    public boolean b(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
    }

    public void flush() throws IOException {
        this.f17844w.flush();
    }

    public synchronized int k() {
        return this.f17842u.b(Integer.MAX_VALUE);
    }

    public void l() {
        synchronized (this) {
            try {
                long j10 = this.f17835n;
                long j11 = this.f17834m;
                if (j10 < j11) {
                    return;
                }
                this.f17834m = j11 + 1;
                this.f17838q = System.nanoTime() + C.NANOS_PER_SECOND;
                try {
                    this.f17829h.execute(new c("OkHttp %s ping", this.f17825d));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() throws IOException {
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
            a(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i c(int i10) {
        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarRemove;
        iVarRemove = this.f17824c.remove(Integer.valueOf(i10));
        notifyAll();
        return iVarRemove;
    }

    public synchronized boolean f(long j10) {
        if (this.f17828g) {
            return false;
        }
        if (this.f17835n < this.f17834m) {
            if (j10 >= this.f17838q) {
                return false;
            }
        }
        return true;
    }

    public synchronized void g(long j10) {
        long j11 = this.f17839r + j10;
        this.f17839r = j11;
        if (j11 >= this.f17841t.c() / 2) {
            a(0, this.f17839r);
            this.f17839r = 0L;
        }
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10) {
        return this.f17824c.get(Integer.valueOf(i10));
    }

    public void b(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        this.f17844w.a(i10, bVar);
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        Socket f17869a;

        /* renamed from: b, reason: collision with root package name */
        String f17870b;

        /* renamed from: c, reason: collision with root package name */
        com.mbridge.msdk.thrid.okio.e f17871c;

        /* renamed from: d, reason: collision with root package name */
        com.mbridge.msdk.thrid.okio.d f17872d;

        /* renamed from: e, reason: collision with root package name */
        j f17873e = j.f17878a;

        /* renamed from: f, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.internal.http2.l f17874f = com.mbridge.msdk.thrid.okhttp.internal.http2.l.f17941a;

        /* renamed from: g, reason: collision with root package name */
        boolean f17875g;

        /* renamed from: h, reason: collision with root package name */
        int f17876h;

        public h(boolean z10) {
            this.f17875g = z10;
        }

        public h a(Socket socket, String str, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
            this.f17869a = socket;
            this.f17870b = str;
            this.f17871c = eVar;
            this.f17872d = dVar;
            return this;
        }

        public h a(j jVar) {
            this.f17873e = jVar;
            return this;
        }

        public h a(int i10) {
            this.f17876h = i10;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http2.i a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws IOException {
        return a(0, list, z10);
    }

    public void b(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) {
        try {
            try {
                a(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f17825d, Integer.valueOf(i10)}, i10, list, z10));
            } catch (RejectedExecutionException unused) {
            }
        } catch (RejectedExecutionException unused2) {
        }
    }

    public void c(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        try {
            this.f17829h.execute(new a("OkHttp %s stream %d", new Object[]{this.f17825d, Integer.valueOf(i10)}, i10, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    private com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws Throwable {
        Throwable th;
        boolean z11 = !z10;
        synchronized (this.f17844w) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f17827f > 1073741823) {
                                try {
                                    a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                            if (!this.f17828g) {
                                int i11 = this.f17827f;
                                this.f17827f = i11 + 2;
                                com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i11, this, z11, false, null);
                                boolean z12 = !z10 || this.f17840s == 0 || iVar.f17904b == 0;
                                if (iVar.g()) {
                                    this.f17824c.put(Integer.valueOf(i11), iVar);
                                }
                                if (i10 == 0) {
                                    this.f17844w.a(z11, i11, i10, list);
                                } else if (!this.f17822a) {
                                    this.f17844w.a(i10, i11, list);
                                } else {
                                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                }
                                if (z12) {
                                    this.f17844w.flush();
                                }
                                return iVar;
                            }
                            throw new com.mbridge.msdk.thrid.okhttp.internal.http2.a();
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f17844w.h());
        r6 = r2;
        r8.f17840s -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r9, boolean r10, com.mbridge.msdk.thrid.okio.c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r12 = r8.f17844w
            r12.a(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r4 = r8.f17840s     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.Map<java.lang.Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> r2 = r8.f17824c     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            goto L12
        L28:
            r9 = move-exception
            goto L65
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
        L32:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L28
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L28
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r4 = r8.f17844w     // Catch: java.lang.Throwable -> L28
            int r4 = r4.h()     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f17840s     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f17840s = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r4 = r8.f17844w
            if (r10 == 0) goto L53
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = r3
        L54:
            r4.a(r5, r9, r11, r2)
            goto Ld
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            r9.interrupt()     // Catch: java.lang.Throwable -> L28
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.g.a(int, boolean, com.mbridge.msdk.thrid.okio.c, long):void");
    }

    public void a(int i10, long j10) {
        try {
            this.f17829h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f17825d, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(boolean z10, int i10, int i11) {
        try {
            this.f17844w.a(z10, i10, i11);
        } catch (IOException unused) {
            h();
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        synchronized (this.f17844w) {
            synchronized (this) {
                if (this.f17828g) {
                    return;
                }
                this.f17828g = true;
                this.f17844w.a(this.f17826e, bVar, com.mbridge.msdk.thrid.okhttp.internal.c.f17626a);
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2) throws IOException {
        if (!A && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr = null;
        try {
            a(bVar);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            try {
                if (!this.f17824c.isEmpty()) {
                    iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) this.f17824c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[this.f17824c.size()]);
                    this.f17824c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVarArr != null) {
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                try {
                    iVar.a(bVar2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        try {
            this.f17844w.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.f17843v.close();
        } catch (IOException e13) {
            e = e13;
        }
        this.f17829h.shutdown();
        this.f17830i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void a(boolean z10) throws IOException {
        if (z10) {
            this.f17844w.d();
            this.f17844w.b(this.f17841t);
            if (this.f17841t.c() != 65535) {
                this.f17844w.a(0, r5 - 65535);
            }
        }
        new Thread(this.f17845x).start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0046
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void a(int r9, java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f17846y     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L41
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L18
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r10 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L14
            r8.c(r9, r10)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L44
        L18:
            java.util.Set<java.lang.Integer> r0 = r8.f17846y     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L41
            com.mbridge.msdk.thrid.okhttp.internal.http2.g$d r2 = new com.mbridge.msdk.thrid.okhttp.internal.http2.g$d     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            java.lang.String r0 = r8.f17825d     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r3 = 0
            r5[r3] = r0     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r0 = 1
            r5[r0] = r1     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L40
            r8.a(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L40
            return
        L3f:
            r3 = r8
        L40:
            return
        L41:
            r0 = move-exception
            r3 = r8
        L43:
            r9 = r0
        L44:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L46
            throw r9
        L46:
            r0 = move-exception
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.g.a(int, java.util.List):void");
    }

    public void a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) throws IOException {
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        long j10 = i11;
        eVar.e(j10);
        eVar.b(cVar, j10);
        if (cVar.size() == j10) {
            a(new f("OkHttp %s Push Data[%s]", new Object[]{this.f17825d, Integer.valueOf(i10)}, i10, cVar, i11, z10));
            return;
        }
        throw new IOException(cVar.size() + " != " + i11);
    }

    public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        a(new C0325g("OkHttp %s Push Reset[%s]", new Object[]{this.f17825d, Integer.valueOf(i10)}, i10, bVar));
    }

    private synchronized void a(com.mbridge.msdk.thrid.okhttp.internal.b bVar) {
        if (!this.f17828g) {
            this.f17830i.execute(bVar);
        }
    }
}
