package Mj;

import ej.C5481e;
import ej.InterfaceC5476D;
import ej.InterfaceC5483g;
import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
final class p implements d {

    /* renamed from: a, reason: collision with root package name */
    private final v f13373a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13374b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f13375c;

    /* renamed from: d, reason: collision with root package name */
    private final Call.Factory f13376d;

    /* renamed from: e, reason: collision with root package name */
    private final h f13377e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f13378f;

    /* renamed from: g, reason: collision with root package name */
    private Call f13379g;

    /* renamed from: h, reason: collision with root package name */
    private Throwable f13380h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13381i;

    class a implements Callback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f13382a;

        a(f fVar) {
            this.f13382a = fVar;
        }

        private void c(Throwable th2) {
            try {
                this.f13382a.b(p.this, th2);
            } catch (Throwable th3) {
                B.t(th3);
                th3.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void a(Call call, Response response) {
            try {
                try {
                    this.f13382a.a(p.this, p.this.e(response));
                } catch (Throwable th2) {
                    B.t(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                B.t(th3);
                c(th3);
            }
        }

        @Override // okhttp3.Callback
        public void b(Call call, IOException iOException) {
            c(iOException);
        }
    }

    static final class b extends ResponseBody {

        /* renamed from: c, reason: collision with root package name */
        private final ResponseBody f13384c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC5483g f13385d;

        /* renamed from: e, reason: collision with root package name */
        IOException f13386e;

        class a extends ej.k {
            a(InterfaceC5476D interfaceC5476D) {
                super(interfaceC5476D);
            }

            @Override // ej.k, ej.InterfaceC5476D
            public long U(C5481e c5481e, long j10) throws IOException {
                try {
                    return super.U(c5481e, j10);
                } catch (IOException e10) {
                    b.this.f13386e = e10;
                    throw e10;
                }
            }
        }

        b(ResponseBody responseBody) {
            this.f13384c = responseBody;
            this.f13385d = ej.p.d(new a(responseBody.getSource()));
        }

        void J() throws IOException {
            IOException iOException = this.f13386e;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f13384c.close();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: p */
        public long getContentLength() {
            return this.f13384c.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: s */
        public MediaType getF56210c() {
            return this.f13384c.getF56210c();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: y */
        public InterfaceC5483g getSource() {
            return this.f13385d;
        }
    }

    static final class c extends ResponseBody {

        /* renamed from: c, reason: collision with root package name */
        private final MediaType f13388c;

        /* renamed from: d, reason: collision with root package name */
        private final long f13389d;

        c(MediaType mediaType, long j10) {
            this.f13388c = mediaType;
            this.f13389d = j10;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: p */
        public long getContentLength() {
            return this.f13389d;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: s */
        public MediaType getF56210c() {
            return this.f13388c;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: y */
        public InterfaceC5483g getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    p(v vVar, Object obj, Object[] objArr, Call.Factory factory, h hVar) {
        this.f13373a = vVar;
        this.f13374b = obj;
        this.f13375c = objArr;
        this.f13376d = factory;
        this.f13377e = hVar;
    }

    private Call c() {
        Call callB = this.f13376d.b(this.f13373a.a(this.f13374b, this.f13375c));
        if (callB != null) {
            return callB;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    private Call d() throws IOException {
        Call call = this.f13379g;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.f13380h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            Call callC = c();
            this.f13379g = callC;
            return callC;
        } catch (IOException | Error | RuntimeException e10) {
            B.t(e10);
            this.f13380h = e10;
            throw e10;
        }
    }

    @Override // Mj.d
    public void K0(f fVar) {
        Call call;
        Throwable th2;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f13381i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f13381i = true;
                call = this.f13379g;
                th2 = this.f13380h;
                if (call == null && th2 == null) {
                    try {
                        Call callC = c();
                        this.f13379g = callC;
                        call = callC;
                    } catch (Throwable th3) {
                        th2 = th3;
                        B.t(th2);
                        this.f13380h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            fVar.b(this, th2);
            return;
        }
        if (this.f13378f) {
            call.cancel();
        }
        call.T(new a(fVar));
    }

    @Override // Mj.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public p m1clone() {
        return new p(this.f13373a, this.f13374b, this.f13375c, this.f13376d, this.f13377e);
    }

    @Override // Mj.d
    public void cancel() {
        Call call;
        this.f13378f = true;
        synchronized (this) {
            call = this.f13379g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    w e(Response response) throws IOException {
        ResponseBody body = response.getBody();
        Response responseC = response.Y().b(new c(body.getF56210c(), body.getContentLength())).c();
        int code = responseC.getCode();
        if (code < 200 || code >= 300) {
            try {
                return w.c(B.a(body), responseC);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return w.h(null, responseC);
        }
        b bVar = new b(body);
        try {
            return w.h(this.f13377e.a(bVar), responseC);
        } catch (RuntimeException e10) {
            bVar.J();
            throw e10;
        }
    }

    @Override // Mj.d
    public w g() {
        Call callD;
        synchronized (this) {
            if (this.f13381i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f13381i = true;
            callD = d();
        }
        if (this.f13378f) {
            callD.cancel();
        }
        return e(callD.g());
    }

    @Override // Mj.d
    public synchronized Request j() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return d().getOriginalRequest();
    }

    @Override // Mj.d
    public boolean v() {
        boolean z10 = true;
        if (this.f13378f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f13379g;
                if (call == null || !call.getCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }
}
