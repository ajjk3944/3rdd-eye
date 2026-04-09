package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f755b = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w0 w0VarS = w0.s(context, attributeSet, f755b);
        setBackgroundDrawable(w0VarS.f(0));
        w0VarS.u();
    }
}
