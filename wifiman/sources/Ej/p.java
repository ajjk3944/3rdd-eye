package ej;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes4.dex */
public abstract class p {
    public static final InterfaceC5474B a(File file) {
        return q.b(file);
    }

    public static final InterfaceC5474B b() {
        return r.a();
    }

    public static final InterfaceC5482f c(InterfaceC5474B interfaceC5474B) {
        return r.b(interfaceC5474B);
    }

    public static final InterfaceC5483g d(InterfaceC5476D interfaceC5476D) {
        return r.c(interfaceC5476D);
    }

    public static final boolean e(AssertionError assertionError) {
        return q.c(assertionError);
    }

    public static final InterfaceC5474B f(File file, boolean z10) {
        return q.d(file, z10);
    }

    public static final InterfaceC5474B g(OutputStream outputStream) {
        return q.e(outputStream);
    }

    public static final InterfaceC5474B h(Socket socket) {
        return q.f(socket);
    }

    public static final InterfaceC5476D j(File file) {
        return q.h(file);
    }

    public static final InterfaceC5476D k(InputStream inputStream) {
        return q.i(inputStream);
    }

    public static final InterfaceC5476D l(Socket socket) {
        return q.j(socket);
    }
}
