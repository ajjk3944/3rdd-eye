package R6;

import android.net.Uri;

/* compiled from: DivItemChangeActionHandler.kt */
/* loaded from: classes.dex */
public final class b {
    public static int a(Uri uri) {
        String queryParameter = uri.getQueryParameter("step");
        if (queryParameter == null) {
            return 1;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }
}
