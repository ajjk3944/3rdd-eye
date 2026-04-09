package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class kn3 extends di3 {
    public final int g;

    public kn3() {
        this.g = 1;
    }

    public static kn3 a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !um.D(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new sm3("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new kn3(iOException, i2, i);
    }

    public kn3(IOException iOException, int i, int i2) {
        super(i == 2000 ? i2 != 1 ? 2000 : 2001 : i, iOException);
        this.g = i2;
    }

    public kn3(String str, int i, int i2) {
        super(str, i == 2000 ? i2 != 1 ? 2000 : 2001 : i);
        this.g = i2;
    }

    public kn3(String str, IOException iOException, int i, int i2) {
        super(str, iOException, i == 2000 ? i2 != 1 ? 2000 : 2001 : i);
        this.g = i2;
    }
}
