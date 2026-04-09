package ej;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ej.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5475C extends C5479c {

    /* renamed from: p, reason: collision with root package name */
    private final Socket f46435p;

    public C5475C(Socket socket) {
        AbstractC6492s.i(socket, "socket");
        this.f46435p = socket;
    }

    @Override // ej.C5479c
    protected void D() throws IOException {
        try {
            this.f46435p.close();
        } catch (AssertionError e10) {
            if (!p.e(e10)) {
                throw e10;
            }
            q.f46492a.log(Level.WARNING, "Failed to close timed out socket " + this.f46435p, (Throwable) e10);
        } catch (Exception e11) {
            q.f46492a.log(Level.WARNING, "Failed to close timed out socket " + this.f46435p, (Throwable) e11);
        }
    }

    @Override // ej.C5479c
    protected IOException z(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
