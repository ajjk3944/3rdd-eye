package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class d extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public c f2296a;

    public d(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final void c(AttributeSet attributeSet) {
        Log.v("Constraints", " ################# init");
    }

    public c getConstraintSet() {
        if (this.f2296a == null) {
            this.f2296a = new c();
        }
        this.f2296a.q(this);
        return this.f2296a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
        super.setVisibility(8);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(attributeSet);
        super.setVisibility(8);
    }

    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;
        public float F0;
        public float G0;
        public float H0;
        public float I0;

        /* renamed from: w0, reason: collision with root package name */
        public float f2297w0;

        /* renamed from: x0, reason: collision with root package name */
        public boolean f2298x0;

        /* renamed from: y0, reason: collision with root package name */
        public float f2299y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f2300z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f2297w0 = 1.0f;
            this.f2298x0 = false;
            this.f2299y0 = 0.0f;
            this.f2300z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 1.0f;
            this.D0 = 1.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2297w0 = 1.0f;
            this.f2298x0 = false;
            this.f2299y0 = 0.0f;
            this.f2300z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 1.0f;
            this.D0 = 1.0f;
            this.E0 = 0.0f;
            this.F0 = 0.0f;
            this.G0 = 0.0f;
            this.H0 = 0.0f;
            this.I0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0.d.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == b0.d.ConstraintSet_android_alpha) {
                    this.f2297w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2297w0);
                } else if (index == b0.d.ConstraintSet_android_elevation) {
                    this.f2299y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2299y0);
                    this.f2298x0 = true;
                } else if (index == b0.d.ConstraintSet_android_rotationX) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == b0.d.ConstraintSet_android_rotationY) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == b0.d.ConstraintSet_android_rotation) {
                    this.f2300z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2300z0);
                } else if (index == b0.d.ConstraintSet_android_scaleX) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == b0.d.ConstraintSet_android_scaleY) {
                    this.D0 = typedArrayObtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == b0.d.ConstraintSet_android_transformPivotX) {
                    this.E0 = typedArrayObtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == b0.d.ConstraintSet_android_transformPivotY) {
                    this.F0 = typedArrayObtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == b0.d.ConstraintSet_android_translationX) {
                    this.G0 = typedArrayObtainStyledAttributes.getFloat(index, this.G0);
                } else if (index == b0.d.ConstraintSet_android_translationY) {
                    this.H0 = typedArrayObtainStyledAttributes.getFloat(index, this.H0);
                } else if (index == b0.d.ConstraintSet_android_translationZ) {
                    this.I0 = typedArrayObtainStyledAttributes.getFloat(index, this.I0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
