package a0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* loaded from: classes.dex */
public class m extends androidx.constraintlayout.widget.b implements MotionLayout.j {

    /* renamed from: j, reason: collision with root package name */
    public boolean f68j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f69k;

    /* renamed from: l, reason: collision with root package name */
    public float f70l;

    /* renamed from: m, reason: collision with root package name */
    public View[] f71m;

    public m(Context context) {
        super(context);
        this.f68j = false;
        this.f69k = false;
    }

    public float getProgress() {
        return this.f70l;
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b0.d.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == b0.d.MotionHelper_onShow) {
                    this.f68j = typedArrayObtainStyledAttributes.getBoolean(index, this.f68j);
                } else if (index == b0.d.MotionHelper_onHide) {
                    this.f69k = typedArrayObtainStyledAttributes.getBoolean(index, this.f69k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f70l = f10;
        int i10 = 0;
        if (this.f2180b > 0) {
            this.f71m = m((ConstraintLayout) getParent());
            while (i10 < this.f2180b) {
                D(this.f71m[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof m)) {
                D(childAt, f10);
            }
            i10++;
        }
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return this.f69k;
    }

    public boolean y() {
        return this.f68j;
    }

    public m(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f68j = false;
        this.f69k = false;
        n(attributeSet);
    }

    public m(Context context, AttributeSet attributeSet, int i10) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, i10);
        this.f68j = false;
        this.f69k = false;
        n(attributeSet);
    }

    public void A(Canvas canvas) {
    }

    public void B(Canvas canvas) {
    }

    public void z(MotionLayout motionLayout) {
    }

    public void C(MotionLayout motionLayout, HashMap map) {
    }

    public void D(View view, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
    public void b(MotionLayout motionLayout, int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
    public void c(MotionLayout motionLayout, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
    public void a(MotionLayout motionLayout, int i10, int i11, float f10) {
    }
}
