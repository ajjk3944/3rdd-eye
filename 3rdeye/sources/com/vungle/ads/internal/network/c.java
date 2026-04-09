package com.vungle.ads.internal.network;

import U9.E;
import U9.F;
import U9.InterfaceC1608e;
import U9.InterfaceC1609f;
import U9.v;
import b6.InterfaceC1853a;
import b9.C1992A;
import ia.C4468d;
import ia.k;
import ia.q;
import java.io.IOException;
import kotlin.jvm.internal.l;

/* compiled from: OkHttpCall.kt */
/* loaded from: classes2.dex */
public final class c<T> implements com.vungle.ads.internal.network.a<T> {
    public static final a Companion = new a(null);
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;
    private final InterfaceC1608e rawCall;
    private final InterfaceC1853a<F, T> responseConverter;

    /* compiled from: OkHttpCall.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void throwIfFatal(Throwable th) throws Throwable {
            if ((th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof LinkageError)) {
                throw th;
            }
        }

        private a() {
        }
    }

    /* compiled from: OkHttpCall.kt */
    public static final class b extends F {
        private final F delegate;
        private final ia.g delegateSource;
        private IOException thrownException;

        /* compiled from: OkHttpCall.kt */
        public static final class a extends k {
            public a(ia.g gVar) {
                super(gVar);
            }

            @Override // ia.k, ia.C
            public long read(C4468d sink, long j4) throws IOException {
                l.f(sink, "sink");
                try {
                    return super.read(sink, j4);
                } catch (IOException e4) {
                    b.this.setThrownException(e4);
                    throw e4;
                }
            }
        }

        public b(F delegate) {
            l.f(delegate, "delegate");
            this.delegate = delegate;
            this.delegateSource = q.c(new a(delegate.source()));
        }

        @Override // U9.F, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // U9.F
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // U9.F
        public v contentType() {
            return this.delegate.contentType();
        }

        public final IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(IOException iOException) {
            this.thrownException = iOException;
        }

        @Override // U9.F
        public ia.g source() {
            return this.delegateSource;
        }

        public final void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* compiled from: OkHttpCall.kt */
    /* renamed from: com.vungle.ads.internal.network.c$c, reason: collision with other inner class name */
    public static final class C0384c extends F {
        private final long contentLength;
        private final v contentType;

        public C0384c(v vVar, long j4) {
            this.contentType = vVar;
            this.contentLength = j4;
        }

        @Override // U9.F
        public long contentLength() {
            return this.contentLength;
        }

        @Override // U9.F
        public v contentType() {
            return this.contentType;
        }

        @Override // U9.F
        public ia.g source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* compiled from: OkHttpCall.kt */
    public static final class d implements InterfaceC1609f {
        final /* synthetic */ com.vungle.ads.internal.network.b<T> $callback;
        final /* synthetic */ c<T> this$0;

        public d(c<T> cVar, com.vungle.ads.internal.network.b<T> bVar) {
            this.this$0 = cVar;
            this.$callback = bVar;
        }

        private final void callFailure(Throwable th) throws Throwable {
            try {
                this.$callback.onFailure(this.this$0, th);
            } catch (Throwable th2) {
                c.Companion.throwIfFatal(th2);
                com.vungle.ads.internal.util.k.Companion.e(c.TAG, "Cannot pass failure to callback", th2);
            }
        }

        @Override // U9.InterfaceC1609f
        public void onFailure(InterfaceC1608e call, IOException e4) throws Throwable {
            l.f(call, "call");
            l.f(e4, "e");
            callFailure(e4);
        }

        @Override // U9.InterfaceC1609f
        public void onResponse(InterfaceC1608e call, E response) throws Throwable {
            l.f(call, "call");
            l.f(response, "response");
            try {
                try {
                    this.$callback.onResponse(this.this$0, this.this$0.parseResponse(response));
                } catch (Throwable th) {
                    c.Companion.throwIfFatal(th);
                    com.vungle.ads.internal.util.k.Companion.e(c.TAG, "Cannot pass response to callback", th);
                }
            } catch (Throwable th2) {
                c.Companion.throwIfFatal(th2);
                callFailure(th2);
            }
        }
    }

    public c(InterfaceC1608e rawCall, InterfaceC1853a<F, T> responseConverter) {
        l.f(rawCall, "rawCall");
        l.f(responseConverter, "responseConverter");
        this.rawCall = rawCall;
        this.responseConverter = responseConverter;
    }

    private final F buffer(F f10) throws IOException {
        C4468d c4468d = new C4468d();
        f10.source().o(c4468d);
        F.b bVar = F.Companion;
        v vVarContentType = f10.contentType();
        long jContentLength = f10.contentLength();
        bVar.getClass();
        return F.b.a(vVarContentType, jContentLength, c4468d);
    }

    @Override // com.vungle.ads.internal.network.a
    public void cancel() {
        InterfaceC1608e interfaceC1608e;
        this.canceled = true;
        synchronized (this) {
            interfaceC1608e = this.rawCall;
            C1992A c1992a = C1992A.f18074a;
        }
        interfaceC1608e.cancel();
    }

    @Override // com.vungle.ads.internal.network.a
    public void enqueue(com.vungle.ads.internal.network.b<T> callback) {
        InterfaceC1608e interfaceC1608e;
        l.f(callback, "callback");
        synchronized (this) {
            interfaceC1608e = this.rawCall;
            C1992A c1992a = C1992A.f18074a;
        }
        if (this.canceled) {
            interfaceC1608e.cancel();
        }
        interfaceC1608e.W(new d(this, callback));
    }

    @Override // com.vungle.ads.internal.network.a
    public com.vungle.ads.internal.network.d<T> execute() throws IOException {
        InterfaceC1608e interfaceC1608e;
        synchronized (this) {
            interfaceC1608e = this.rawCall;
            C1992A c1992a = C1992A.f18074a;
        }
        if (this.canceled) {
            interfaceC1608e.cancel();
        }
        return parseResponse(interfaceC1608e.execute());
    }

    @Override // com.vungle.ads.internal.network.a
    public boolean isCanceled() {
        boolean zIsCanceled;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            zIsCanceled = this.rawCall.isCanceled();
        }
        return zIsCanceled;
    }

    public final com.vungle.ads.internal.network.d<T> parseResponse(E rawResp) throws IOException {
        l.f(rawResp, "rawResp");
        F f10 = rawResp.f12568h;
        if (f10 == null) {
            return null;
        }
        E.a aVarE = rawResp.e();
        aVarE.f12581g = new C0384c(f10.contentType(), f10.contentLength());
        E eA = aVarE.a();
        int i = eA.f12565e;
        if (i >= 200 && i < 300) {
            if (i == 204 || i == 205) {
                f10.close();
                return com.vungle.ads.internal.network.d.Companion.success(null, eA);
            }
            b bVar = new b(f10);
            try {
                return com.vungle.ads.internal.network.d.Companion.success(this.responseConverter.convert(bVar), eA);
            } catch (RuntimeException e4) {
                bVar.throwIfCaught();
                throw e4;
            }
        }
        try {
            com.vungle.ads.internal.network.d<T> dVarError = com.vungle.ads.internal.network.d.Companion.error(buffer(f10), eA);
            f10.close();
            return dVarError;
        } finally {
        }
    }
}
