package o0;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.provider.b;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static b.a a(Context context, Uri uri) {
        return Build.VERSION.SDK_INT < 24 ? new b.C0019b(context, uri) : new b.c(context, uri);
    }
}
