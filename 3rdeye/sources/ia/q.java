package ia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class q {
    public static final t a(File file) throws FileNotFoundException {
        Logger logger = r.f38670a;
        kotlin.jvm.internal.l.f(file, "<this>");
        return new t(new FileOutputStream(file, true), new D());
    }

    public static final v b(A a10) {
        kotlin.jvm.internal.l.f(a10, "<this>");
        return new v(a10);
    }

    public static final w c(C c10) {
        kotlin.jvm.internal.l.f(c10, "<this>");
        return new w(c10);
    }

    public static final boolean d(AssertionError assertionError) {
        Logger logger = r.f38670a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? y9.q.b0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static final A e(Socket socket) throws IOException {
        Logger logger = r.f38670a;
        B b10 = new B(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.l.e(outputStream, "getOutputStream(...)");
        return b10.sink(new t(outputStream, b10));
    }

    public static t f(File file) throws FileNotFoundException {
        Logger logger = r.f38670a;
        kotlin.jvm.internal.l.f(file, "<this>");
        return new t(new FileOutputStream(file, false), new D());
    }

    public static final p g(InputStream inputStream) {
        Logger logger = r.f38670a;
        kotlin.jvm.internal.l.f(inputStream, "<this>");
        return new p(inputStream, new D());
    }

    public static final C h(Socket socket) throws IOException {
        Logger logger = r.f38670a;
        B b10 = new B(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.l.e(inputStream, "getInputStream(...)");
        return b10.source(new p(inputStream, b10));
    }
}
