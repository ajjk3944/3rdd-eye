package o;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: o.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2702a0 extends Z {
    @Override // o.Z, o.AbstractC2704b0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // o.AbstractC2704b0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
