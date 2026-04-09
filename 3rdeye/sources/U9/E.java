package U9;

import U9.C1607d;
import U9.s;
import java.io.Closeable;

/* compiled from: Response.kt */
/* loaded from: classes3.dex */
public final class E implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final z f12562b;

    /* renamed from: c, reason: collision with root package name */
    public final y f12563c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12564d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12565e;

    /* renamed from: f, reason: collision with root package name */
    public final r f12566f;

    /* renamed from: g, reason: collision with root package name */
    public final s f12567g;

    /* renamed from: h, reason: collision with root package name */
    public final F f12568h;
    public final E i;

    /* renamed from: j, reason: collision with root package name */
    public final E f12569j;

    /* renamed from: k, reason: collision with root package name */
    public final E f12570k;

    /* renamed from: l, reason: collision with root package name */
    public final long f12571l;

    /* renamed from: m, reason: collision with root package name */
    public final long f12572m;

    /* renamed from: n, reason: collision with root package name */
    public final Y9.c f12573n;

    /* renamed from: o, reason: collision with root package name */
    public C1607d f12574o;

    /* compiled from: Response.kt */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public z f12575a;

        /* renamed from: b, reason: collision with root package name */
        public y f12576b;

        /* renamed from: d, reason: collision with root package name */
        public String f12578d;

        /* renamed from: e, reason: collision with root package name */
        public r f12579e;

        /* renamed from: g, reason: collision with root package name */
        public F f12581g;

        /* renamed from: h, reason: collision with root package name */
        public E f12582h;
        public E i;

        /* renamed from: j, reason: collision with root package name */
        public E f12583j;

        /* renamed from: k, reason: collision with root package name */
        public long f12584k;

        /* renamed from: l, reason: collision with root package name */
        public long f12585l;

        /* renamed from: m, reason: collision with root package name */
        public Y9.c f12586m;

        /* renamed from: c, reason: collision with root package name */
        public int f12577c = -1;

        /* renamed from: f, reason: collision with root package name */
        public s.a f12580f = new s.a();

        public static void b(E e4, String str) {
            if (e4 != null) {
                if (e4.f12568h != null) {
                    throw new IllegalArgumentException(str.concat(".body != null").toString());
                }
                if (e4.i != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (e4.f12569j != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (e4.f12570k != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final E a() {
            int i = this.f12577c;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.f12577c).toString());
            }
            z zVar = this.f12575a;
            if (zVar == null) {
                throw new IllegalStateException("request == null");
            }
            y yVar = this.f12576b;
            if (yVar == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f12578d;
            if (str != null) {
                return new E(zVar, yVar, str, i, this.f12579e, this.f12580f.d(), this.f12581g, this.f12582h, this.i, this.f12583j, this.f12584k, this.f12585l, this.f12586m);
            }
            throw new IllegalStateException("message == null");
        }

        public final void c(s headers) {
            kotlin.jvm.internal.l.f(headers, "headers");
            this.f12580f = headers.e();
        }
    }

    public E(z request, y protocol, String message, int i, r rVar, s sVar, F f10, E e4, E e10, E e11, long j4, long j10, Y9.c cVar) {
        kotlin.jvm.internal.l.f(request, "request");
        kotlin.jvm.internal.l.f(protocol, "protocol");
        kotlin.jvm.internal.l.f(message, "message");
        this.f12562b = request;
        this.f12563c = protocol;
        this.f12564d = message;
        this.f12565e = i;
        this.f12566f = rVar;
        this.f12567g = sVar;
        this.f12568h = f10;
        this.i = e4;
        this.f12569j = e10;
        this.f12570k = e11;
        this.f12571l = j4;
        this.f12572m = j10;
        this.f12573n = cVar;
    }

    public static String c(E e4, String str) {
        e4.getClass();
        String strC = e4.f12567g.c(str);
        if (strC == null) {
            return null;
        }
        return strC;
    }

    public final C1607d a() {
        C1607d c1607d = this.f12574o;
        if (c1607d != null) {
            return c1607d;
        }
        int i = C1607d.f12631n;
        C1607d c1607dA = C1607d.b.a(this.f12567g);
        this.f12574o = c1607dA;
        return c1607dA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        F f10 = this.f12568h;
        if (f10 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        f10.close();
    }

    public final boolean d() {
        int i = this.f12565e;
        return 200 <= i && i < 300;
    }

    public final a e() {
        a aVar = new a();
        aVar.f12575a = this.f12562b;
        aVar.f12576b = this.f12563c;
        aVar.f12577c = this.f12565e;
        aVar.f12578d = this.f12564d;
        aVar.f12579e = this.f12566f;
        aVar.f12580f = this.f12567g.e();
        aVar.f12581g = this.f12568h;
        aVar.f12582h = this.i;
        aVar.i = this.f12569j;
        aVar.f12583j = this.f12570k;
        aVar.f12584k = this.f12571l;
        aVar.f12585l = this.f12572m;
        aVar.f12586m = this.f12573n;
        return aVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f12563c + ", code=" + this.f12565e + ", message=" + this.f12564d + ", url=" + this.f12562b.f12795a + '}';
    }
}
