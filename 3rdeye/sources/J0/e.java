package J0;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.text.PrecomputedText;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source c(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ boolean l(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean n(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
