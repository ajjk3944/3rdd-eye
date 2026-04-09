package d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.q0;
import androidx.core.content.ContextCompat;

/* loaded from: classes.dex */
public abstract class a {
    public static ColorStateList a(Context context, int i10) {
        return ContextCompat.getColorStateList(context, i10);
    }

    public static Drawable b(Context context, int i10) {
        return q0.h().j(context, i10);
    }
}
