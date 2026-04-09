package Y2;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Q extends Exception {
    public Q(int i, String str) {
        super(str);
    }

    public final B2.a a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new B2.a(super.getMessage(), 3);
    }

    public Q(int i, IOException iOException, String str) {
        super(str, iOException);
    }
}
