package r7;

import android.widget.TextView;

/* compiled from: TextViews.kt */
/* loaded from: classes.dex */
public final class q {
    public static final int a(TextView textView, int i) {
        kotlin.jvm.internal.l.f(textView, "<this>");
        if (textView.getLayout() == null) {
            return 0;
        }
        return i <= 0 ? textView.getLayout().getHeight() : i > textView.getLayout().getLineCount() ? textView.getLayout().getHeight() : textView.getLayout().getLineTop(i) - textView.getLayout().getLineTop(0);
    }
}
