package b5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class u extends i {

    /* renamed from: g, reason: collision with root package name */
    public final int f2467g;

    public u() {
        super(2008);
        this.f2467g = 1;
    }

    public static u a(IOException iOException, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !xu.l.a0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new t("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new u(iOException, i11, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(IOException iOException, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(iOException, i10);
        this.f2467g = i11;
    }

    public u(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.f2467g = 1;
    }
}
