package android.support.v4.media.session;

import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import io.sentry.android.core.e0;

/* loaded from: classes.dex */
public abstract class b {
    static {
        Build.VERSION.CODENAME.equals("S");
    }

    public static Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            e0.d("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
}
