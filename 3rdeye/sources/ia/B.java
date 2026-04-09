package ia;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final class B extends C4466b {

    /* renamed from: b, reason: collision with root package name */
    public final Socket f38636b;

    public B(Socket socket) {
        this.f38636b = socket;
    }

    @Override // ia.C4466b
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // ia.C4466b
    public final void timedOut() throws IOException {
        Socket socket = this.f38636b;
        try {
            socket.close();
        } catch (AssertionError e4) {
            if (!q.d(e4)) {
                throw e4;
            }
            r.f38670a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        } catch (Exception e10) {
            r.f38670a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }
}
