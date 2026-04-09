package p;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class t0 extends s0 {
    @Override // p.s0, p.u0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p.u0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
