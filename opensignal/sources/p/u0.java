package p;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class u0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) v0.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
