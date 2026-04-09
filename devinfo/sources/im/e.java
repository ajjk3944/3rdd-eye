package im;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends hm.b {

    /* renamed from: n, reason: collision with root package name */
    public final Socket f26025n;

    public e(Socket socket) {
        this.f26025n = socket;
    }

    @Override // hm.b
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // hm.b
    public final void k() throws IOException {
        Socket socket = this.f26025n;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (!f.a(e2)) {
                throw e2;
            }
            f.f26026a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        } catch (Exception e10) {
            f.f26026a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }
}
