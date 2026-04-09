package F6;

import Zg.Q;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes3.dex */
public abstract class a {
    public static final RectF a(Layout layout, RectF outBounds) {
        AbstractC6492s.i(layout, "<this>");
        AbstractC6492s.i(outBounds, "outBounds");
        outBounds.left = 0.0f;
        outBounds.top = 0.0f;
        outBounds.right = b(layout);
        outBounds.bottom = layout.getHeight();
        return outBounds;
    }

    public static final float b(Layout layout) {
        AbstractC6492s.i(layout, "<this>");
        Iterator it = AbstractC7978m.s(0, layout.getLineCount()).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Q q10 = (Q) it;
        float lineWidth = layout.getLineWidth(q10.d());
        while (it.hasNext()) {
            lineWidth = Math.max(lineWidth, layout.getLineWidth(q10.d()));
        }
        return lineWidth;
    }

    public static final StaticLayout c(CharSequence source, TextPaint paint, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, TextUtils.TruncateAt truncateAt, int i14, Layout.Alignment align) {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(paint, "paint");
        AbstractC6492s.i(align, "align");
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(source, i12, i13, paint, i10).setAlignment(align).setLineSpacing(f11, f10).setIncludePad(z10).setEllipsize(truncateAt).setEllipsizedWidth(i14).setMaxLines(i11).build();
        AbstractC6492s.h(staticLayoutBuild, "{\n        StaticLayout\n …           .build()\n    }");
        return staticLayoutBuild;
    }
}
