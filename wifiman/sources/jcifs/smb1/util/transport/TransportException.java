package jcifs.smb1.util.transport;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public class TransportException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f50682a;

    public TransportException() {
    }

    public Throwable a() {
        return this.f50682a;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.f50682a == null) {
            return super.toString();
        }
        StringWriter stringWriter = new StringWriter();
        this.f50682a.printStackTrace(new PrintWriter(stringWriter));
        return super.toString() + "\n" + stringWriter;
    }

    public TransportException(String str) {
        super(str);
    }

    public TransportException(Throwable th2) {
        this.f50682a = th2;
    }

    public TransportException(String str, Throwable th2) {
        super(str);
        this.f50682a = th2;
    }
}
