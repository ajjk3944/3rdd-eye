package N0;

import android.os.Build;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract class g {
    public static final f a(CharSequence charSequence, TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new d(charSequence, textPaint) : new e(charSequence);
    }
}
