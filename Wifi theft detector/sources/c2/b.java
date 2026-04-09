package c2;

import android.webkit.WebResourceError;

/* loaded from: classes.dex */
public abstract class b {
    public static CharSequence a(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int b(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }
}
