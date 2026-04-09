package p;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z0 extends y0 {
    @Override // p.y0, p.a1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p.a1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
