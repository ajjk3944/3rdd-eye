package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f18177a = Logger.getLogger(l.class.getName());

    public static class a implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f18178a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OutputStream f18179b;

        public a(t tVar, OutputStream outputStream) {
            this.f18178a = tVar;
            this.f18179b = outputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f18158b, 0L, j10);
            while (j10 > 0) {
                this.f18178a.e();
                o oVar = cVar.f18157a;
                int iMin = (int) Math.min(j10, oVar.f18192c - oVar.f18191b);
                this.f18179b.write(oVar.f18190a, oVar.f18191b, iMin);
                int i10 = oVar.f18191b + iMin;
                oVar.f18191b = i10;
                long j11 = iMin;
                j10 -= j11;
                cVar.f18158b -= j11;
                if (i10 == oVar.f18192c) {
                    cVar.f18157a = oVar.b();
                    p.a(oVar);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return this.f18178a;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f18179b.close();
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            this.f18179b.flush();
        }

        public String toString() {
            return "sink(" + this.f18179b + ")";
        }
    }

    public static class c extends com.mbridge.msdk.thrid.okio.a {

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Socket f18182k;

        public c(Socket socket) {
            this.f18182k = socket;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() throws IOException {
            try {
                this.f18182k.close();
            } catch (AssertionError e10) {
                if (!l.a(e10)) {
                    throw e10;
                }
                l.f18177a.log(Level.WARNING, "Failed to close timed out socket " + this.f18182k, (Throwable) e10);
            } catch (Exception e11) {
                l.f18177a.log(Level.WARNING, "Failed to close timed out socket " + this.f18182k, (Throwable) e11);
            }
        }
    }

    private l() {
    }

    public static e a(s sVar) {
        return new n(sVar);
    }

    public static s b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
        return aVarC.a(a(socket.getInputStream(), aVarC));
    }

    private static com.mbridge.msdk.thrid.okio.a c(Socket socket) {
        return new c(socket);
    }

    public static d a(r rVar) {
        return new m(rVar);
    }

    private static r a(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (tVar != null) {
            return new a(tVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static r a(Socket socket) throws IOException {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                com.mbridge.msdk.thrid.okio.a aVarC = c(socket);
                return aVarC.a(a(socket.getOutputStream(), aVarC));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static class b implements s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f18180a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f18181b;

        public b(t tVar, InputStream inputStream) {
            this.f18180a = tVar;
            this.f18181b = inputStream;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (j10 == 0) {
                return 0L;
            }
            try {
                this.f18180a.e();
                o oVarB = cVar.b(1);
                int i10 = this.f18181b.read(oVarB.f18190a, oVarB.f18192c, (int) Math.min(j10, 8192 - oVarB.f18192c));
                if (i10 == -1) {
                    return -1L;
                }
                oVarB.f18192c += i10;
                long j11 = i10;
                cVar.f18158b += j11;
                return j11;
            } catch (AssertionError e10) {
                if (l.a(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f18181b.close();
        }

        public String toString() {
            return "source(" + this.f18181b + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return this.f18180a;
        }
    }

    public static s a(InputStream inputStream) {
        return a(inputStream, new t());
    }

    private static s a(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (tVar != null) {
            return new b(tVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
