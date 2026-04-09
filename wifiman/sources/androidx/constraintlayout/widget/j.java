package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import o1.AbstractC7056l;

/* loaded from: classes.dex */
public abstract class j extends c {

    /* renamed from: i, reason: collision with root package name */
    private boolean f30611i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30612j;

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f30435a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f30484h1) {
                    this.f30611i = true;
                } else if (index == i.f30533o1) {
                    this.f30612j = true;
                }
            }
        }
    }

    public abstract void n(AbstractC7056l abstractC7056l, int i10, int i11);

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f30611i || this.f30612j) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f30154b; i10++) {
                View viewH = constraintLayout.h(this.f30153a[i10]);
                if (viewH != null) {
                    if (this.f30611i) {
                        viewH.setVisibility(visibility);
                    }
                    if (this.f30612j && elevation > 0.0f) {
                        viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        c();
    }
}
