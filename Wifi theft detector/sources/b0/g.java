package b0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class g extends androidx.constraintlayout.widget.b {

    /* renamed from: j, reason: collision with root package name */
    public boolean f4577j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4578k;

    public g(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.b
    public void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.ConstraintLayout_Layout_android_visibility) {
                    this.f4577j = true;
                } else if (index == d.ConstraintLayout_Layout_android_elevation) {
                    this.f4578k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        if (this.f4577j || this.f4578k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f2180b; i10++) {
                    View viewL = constraintLayout.l(this.f2179a[i10]);
                    if (viewL != null) {
                        if (this.f4577j) {
                            viewL.setVisibility(visibility);
                        }
                        if (this.f4578k && elevation > 0.0f) {
                            viewL.setTranslationZ(viewL.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        g();
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void w(h hVar, int i10, int i11) {
    }
}
