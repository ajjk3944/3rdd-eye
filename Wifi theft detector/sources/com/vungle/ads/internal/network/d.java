package com.vungle.ads.internal.network;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import kotlin.Result;
import kotlin.jvm.internal.p;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

/* loaded from: classes3.dex */
public final class d implements com.vungle.ads.internal.network.a {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;

    @NotNull
    private final Call rawCall;

    @NotNull
    private final r7.a responseConverter;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void throwIfFatal(Throwable th) throws Throwable {
            if ((th instanceof ThreadDeath) || (th instanceof LinkageError)) {
                throw th;
            }
        }

        private a() {
        }
    }

    public static final class b extends ResponseBody {

        @NotNull
        private final ResponseBody delegate;

        @NotNull
        private final BufferedSource delegateSource;

        @Nullable
        private IOException thrownException;

        public static final class a extends ForwardingSource {
            public a(BufferedSource bufferedSource) {
                super(bufferedSource);
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(@NotNull Buffer sink, long j10) throws IOException {
                p.e(sink, "sink");
                try {
                    return super.read(sink, j10);
                } catch (IOException e10) {
                    b.this.setThrownException(e10);
                    throw e10;
                }
            }
        }

        public b(@NotNull ResponseBody delegate) {
            p.e(delegate, "delegate");
            this.delegate = delegate;
            this.delegateSource = Okio.buffer(new a(delegate.getBodySource()));
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.delegate.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        @Nullable
        /* renamed from: contentType */
        public MediaType get$contentType() {
            return this.delegate.get$contentType();
        }

        @Nullable
        public final IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(@Nullable IOException iOException) {
            this.thrownException = iOException;
        }

        @Override // okhttp3.ResponseBody
        @NotNull
        /* renamed from: source */
        public BufferedSource getBodySource() {
            return this.delegateSource;
        }

        public final void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public static final class c extends ResponseBody {
        private final long contentLength;

        @Nullable
        private final MediaType contentType;

        public c(@Nullable MediaType mediaType, long j10) {
            this.contentType = mediaType;
            this.contentLength = j10;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        @Nullable
        /* renamed from: contentType */
        public MediaType get$contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        @NotNull
        /* renamed from: source */
        public BufferedSource getBodySource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* renamed from: com.vungle.ads.internal.network.d$d, reason: collision with other inner class name */
    public static final class C0369d implements Callback {
        final /* synthetic */ com.vungle.ads.internal.network.b $callback;

        public C0369d(com.vungle.ads.internal.network.b bVar) {
            this.$callback = bVar;
        }

        private final void callFailure(Throwable th) throws Throwable {
            try {
                this.$callback.onFailure(d.this, th);
            } catch (Throwable th2) {
                d.Companion.throwIfFatal(th2);
                com.vungle.ads.internal.util.p.Companion.e(d.TAG, "Cannot pass failure to callback", th2);
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(@NotNull Call call, @NotNull IOException e10) throws Throwable {
            p.e(call, "call");
            p.e(e10, "e");
            callFailure(e10);
        }

        @Override // okhttp3.Callback
        public void onResponse(@NotNull Call call, @NotNull Response response) throws Throwable {
            p.e(call, "call");
            p.e(response, "response");
            try {
                try {
                    this.$callback.onResponse(d.this, d.this.parseResponse(response));
                } catch (Throwable th) {
                    d.Companion.throwIfFatal(th);
                    com.vungle.ads.internal.util.p.Companion.e(d.TAG, "Cannot pass response to callback", th);
                }
            } catch (Throwable th2) {
                com.vungle.ads.internal.util.p.Companion.e(d.TAG, "[enqueue] Failed to parse response: " + th2.getLocalizedMessage());
                d.Companion.throwIfFatal(th2);
                callFailure(th2);
            }
        }
    }

    public d(@NotNull Call rawCall, @NotNull r7.a responseConverter) {
        p.e(rawCall, "rawCall");
        p.e(responseConverter, "responseConverter");
        this.rawCall = rawCall;
        this.responseConverter = responseConverter;
    }

    private final ResponseBody buffer(ResponseBody responseBody) throws IOException {
        Buffer buffer = new Buffer();
        responseBody.getBodySource().readAll(buffer);
        return ResponseBody.INSTANCE.create(buffer, responseBody.get$contentType(), responseBody.getContentLength());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e parseResponse(Response response) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            return null;
        }
        Response responseBuild = response.newBuilder().body(new c(responseBodyBody.get$contentType(), responseBodyBody.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode >= 200 && iCode < 300) {
            if (iCode == 204 || iCode == 205) {
                responseBodyBody.close();
                return e.Companion.success(null, responseBuild);
            }
            b bVar = new b(responseBodyBody);
            try {
                return e.Companion.success(this.responseConverter.convert(bVar), responseBuild);
            } catch (Throwable th) {
                bVar.throwIfCaught();
                throw th;
            }
        }
        try {
            e eVarError = e.Companion.error(buffer(responseBodyBody), responseBuild);
            i9.b.a(responseBodyBody, null);
            return eVarError;
        } finally {
        }
    }

    @Override // com.vungle.ads.internal.network.a
    public void cancel() {
        Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
            s sVar = s.f25199a;
        }
        call.cancel();
    }

    @Override // com.vungle.ads.internal.network.a
    public void enqueue(@NotNull com.vungle.ads.internal.network.b callback) {
        Call call;
        p.e(callback, "callback");
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            call = this.rawCall;
            s sVar = s.f25199a;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new C0369d(callback));
    }

    @Override // com.vungle.ads.internal.network.a
    @Nullable
    public e execute() {
        Call call;
        Object objB;
        synchronized (this) {
            call = this.rawCall;
            s sVar = s.f25199a;
        }
        if (this.canceled) {
            call.cancel();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(parseResponse(call.execute()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "[execute] Failed to parse response:  " + thE.getLocalizedMessage());
        }
        if (Result.g(objB)) {
            objB = null;
        }
        return (e) objB;
    }

    @Override // com.vungle.ads.internal.network.a
    public boolean isCanceled() {
        boolean canceled;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            canceled = this.rawCall.getCanceled();
        }
        return canceled;
    }
}
