package h4;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* compiled from: TypefaceUtils.java */
/* loaded from: classes2.dex */
public final class f {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, B7.d.h(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }
}
