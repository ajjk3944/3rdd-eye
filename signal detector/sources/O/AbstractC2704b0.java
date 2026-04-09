package o;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: o.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2704b0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C2706c0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
