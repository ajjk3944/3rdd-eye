package L2;

import java.io.IOException;

/* compiled from: HttpException.java */
/* loaded from: classes.dex */
public final class e extends IOException {
    public e(String str, IOException iOException, int i) {
        super(str + ", status code: " + i, iOException);
    }
}
