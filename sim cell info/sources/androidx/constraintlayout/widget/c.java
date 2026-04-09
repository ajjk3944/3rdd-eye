package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class c extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    b f1384b;

    public static class a extends ConstraintLayout.a {

        /* renamed from: n0, reason: collision with root package name */
        public float f1385n0;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f1386o0;

        /* renamed from: p0, reason: collision with root package name */
        public float f1387p0;

        /* renamed from: q0, reason: collision with root package name */
        public float f1388q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f1385n0 = 1.0f;
            this.f1386o0 = false;
            this.f1387p0 = 0.0f;
            this.f1388q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 0.0f;
            this.t0 = 1.0f;
            this.u0 = 1.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            float f2;
            super(context, attributeSet);
            this.f1385n0 = 1.0f;
            this.f1386o0 = false;
            this.f1387p0 = 0.0f;
            this.f1388q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 0.0f;
            this.t0 = 1.0f;
            this.u0 = 1.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.c.f2989j0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == n.c.t0) {
                    this.f1385n0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1385n0);
                } else if (index == n.c.G0) {
                    this.f1387p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1387p0);
                    this.f1386o0 = true;
                } else if (index == n.c.B0) {
                    this.r0 = typedArrayObtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == n.c.C0) {
                    this.s0 = typedArrayObtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == n.c.A0) {
                    this.f1388q0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1388q0);
                } else if (index == n.c.y0) {
                    this.t0 = typedArrayObtainStyledAttributes.getFloat(index, this.t0);
                } else if (index == n.c.z0) {
                    this.u0 = typedArrayObtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == n.c.u0) {
                    this.v0 = typedArrayObtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == n.c.v0) {
                    this.w0 = typedArrayObtainStyledAttributes.getFloat(index, this.w0);
                } else {
                    if (index == n.c.w0) {
                        f2 = this.x0;
                    } else if (index == n.c.x0) {
                        this.y0 = typedArrayObtainStyledAttributes.getFloat(index, this.y0);
                    } else if (index == n.c.F0) {
                        f2 = this.z0;
                    }
                    this.x0 = typedArrayObtainStyledAttributes.getFloat(index, f2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
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

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public b getConstraintSet() {
        if (this.f1384b == null) {
            this.f1384b = new b();
        }
        this.f1384b.b(this);
        return this.f1384b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }
}
