package jcifs.smb1.dcerpc;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import jcifs.smb1.smb1.Z;

/* loaded from: classes4.dex */
public class DcerpcException extends IOException implements Z {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f50244a;

    @Override // java.lang.Throwable
    public String toString() {
        if (this.f50244a == null) {
            return super.toString();
        }
        StringWriter stringWriter = new StringWriter();
        this.f50244a.printStackTrace(new PrintWriter(stringWriter));
        return super.toString() + "\n" + stringWriter;
    }
}
