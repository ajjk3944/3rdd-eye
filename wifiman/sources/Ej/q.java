package ej;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46492a = Logger.getLogger("okio.Okio");

    public static final InterfaceC5474B b(File file) {
        AbstractC6492s.i(file, "<this>");
        return p.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        AbstractC6492s.i(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? kotlin.text.t.W(message, "getsockname failed", false, 2, null) : false;
    }

    public static final InterfaceC5474B d(File file, boolean z10) {
        AbstractC6492s.i(file, "<this>");
        return p.g(new FileOutputStream(file, z10));
    }

    public static final InterfaceC5474B e(OutputStream outputStream) {
        AbstractC6492s.i(outputStream, "<this>");
        return new t(outputStream, new E());
    }

    public static final InterfaceC5474B f(Socket socket) throws IOException {
        AbstractC6492s.i(socket, "<this>");
        C5475C c5475c = new C5475C(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC6492s.h(outputStream, "getOutputStream(...)");
        return c5475c.B(new t(outputStream, c5475c));
    }

    public static /* synthetic */ InterfaceC5474B g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return p.f(file, z10);
    }

    public static final InterfaceC5476D h(File file) {
        AbstractC6492s.i(file, "<this>");
        return new o(new FileInputStream(file), E.f46437f);
    }

    public static final InterfaceC5476D i(InputStream inputStream) {
        AbstractC6492s.i(inputStream, "<this>");
        return new o(inputStream, new E());
    }

    public static final InterfaceC5476D j(Socket socket) throws IOException {
        AbstractC6492s.i(socket, "<this>");
        C5475C c5475c = new C5475C(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC6492s.h(inputStream, "getInputStream(...)");
        return c5475c.C(new o(inputStream, c5475c));
    }
}
