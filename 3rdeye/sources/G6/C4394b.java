package g6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.l;

/* compiled from: MediaView.kt */
/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4394b extends RelativeLayout {
    private ImageView imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4394b(Context context) {
        super(context);
        l.f(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        ImageView imageView = this.imageView;
        if (imageView == null) {
            l.l("imageView");
            throw null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = this.imageView;
        if (imageView2 == null) {
            l.l("imageView");
            throw null;
        }
        imageView2.setAdjustViewBounds(true);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            l.l("imageView");
            throw null;
        }
        addView(imageView3);
        requestLayout();
    }

    public final void destroy() {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            l.l("imageView");
            throw null;
        }
        imageView.setImageDrawable(null);
        ImageView imageView2 = this.imageView;
        if (imageView2 == null) {
            l.l("imageView");
            throw null;
        }
        if (imageView2.getParent() != null) {
            ImageView imageView3 = this.imageView;
            if (imageView3 == null) {
                l.l("imageView");
                throw null;
            }
            ViewParent parent = imageView3.getParent();
            l.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            ImageView imageView4 = this.imageView;
            if (imageView4 != null) {
                viewGroup.removeView(imageView4);
            } else {
                l.l("imageView");
                throw null;
            }
        }
    }

    public final ImageView getMainImage$vungle_ads_release() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        l.l("imageView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4394b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4394b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        initView(context);
    }
}
