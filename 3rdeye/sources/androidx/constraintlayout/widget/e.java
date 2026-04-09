package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class e extends ViewGroup {

    /* compiled from: Constraints.java */
    public static class a extends ConstraintLayout.b {

        /* renamed from: A0, reason: collision with root package name */
        public float f15427A0;

        /* renamed from: B0, reason: collision with root package name */
        public float f15428B0;

        /* renamed from: C0, reason: collision with root package name */
        public float f15429C0;

        /* renamed from: D0, reason: collision with root package name */
        public float f15430D0;

        /* renamed from: r0, reason: collision with root package name */
        public float f15431r0;

        /* renamed from: s0, reason: collision with root package name */
        public boolean f15432s0;

        /* renamed from: t0, reason: collision with root package name */
        public float f15433t0;

        /* renamed from: u0, reason: collision with root package name */
        public float f15434u0;

        /* renamed from: v0, reason: collision with root package name */
        public float f15435v0;

        /* renamed from: w0, reason: collision with root package name */
        public float f15436w0;

        /* renamed from: x0, reason: collision with root package name */
        public float f15437x0;

        /* renamed from: y0, reason: collision with root package name */
        public float f15438y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f15439z0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a();
        aVar.f15431r0 = 1.0f;
        aVar.f15432s0 = false;
        aVar.f15433t0 = 0.0f;
        aVar.f15434u0 = 0.0f;
        aVar.f15435v0 = 0.0f;
        aVar.f15436w0 = 0.0f;
        aVar.f15437x0 = 1.0f;
        aVar.f15438y0 = 1.0f;
        aVar.f15439z0 = 0.0f;
        aVar.f15427A0 = 0.0f;
        aVar.f15428B0 = 0.0f;
        aVar.f15429C0 = 0.0f;
        aVar.f15430D0 = 0.0f;
        return aVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f15431r0 = 1.0f;
        aVar.f15432s0 = false;
        aVar.f15433t0 = 0.0f;
        aVar.f15434u0 = 0.0f;
        aVar.f15435v0 = 0.0f;
        aVar.f15436w0 = 0.0f;
        aVar.f15437x0 = 1.0f;
        aVar.f15438y0 = 1.0f;
        aVar.f15439z0 = 0.0f;
        aVar.f15427A0 = 0.0f;
        aVar.f15428B0 = 0.0f;
        aVar.f15429C0 = 0.0f;
        aVar.f15430D0 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.d.f46501d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 15) {
                aVar.f15431r0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15431r0);
            } else if (index == 28) {
                aVar.f15433t0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15433t0);
                aVar.f15432s0 = true;
            } else if (index == 23) {
                aVar.f15435v0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15435v0);
            } else if (index == 24) {
                aVar.f15436w0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15436w0);
            } else if (index == 22) {
                aVar.f15434u0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15434u0);
            } else if (index == 20) {
                aVar.f15437x0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15437x0);
            } else if (index == 21) {
                aVar.f15438y0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15438y0);
            } else if (index == 16) {
                aVar.f15439z0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15439z0);
            } else if (index == 17) {
                aVar.f15427A0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15427A0);
            } else if (index == 18) {
                aVar.f15428B0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15428B0);
            } else if (index == 19) {
                aVar.f15429C0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15429C0);
            } else if (index == 27) {
                aVar.f15430D0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f15430D0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public d getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
    }
}
