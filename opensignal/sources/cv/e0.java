package cv;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class e0 extends d {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f6702m;

    public e0(Socket socket) {
        this.f6702m = socket;
    }

    @Override // cv.d
    public final void j() throws IOException {
        Socket socket = this.f6702m;
        try {
            socket.close();
        } catch (AssertionError e4) {
            if (!a.a.u(e4)) {
                throw e4;
            }
            u.f6739a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        } catch (Exception e10) {
            u.f6739a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
