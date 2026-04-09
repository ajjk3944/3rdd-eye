package t0;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import t0.d;

/* compiled from: MotionHelper.java */
/* loaded from: classes.dex */
public final class c extends androidx.constraintlayout.widget.c implements d.InterfaceC0533d {

    /* renamed from: j, reason: collision with root package name */
    public boolean f46345j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f46346k;

    /* renamed from: l, reason: collision with root package name */
    public float f46347l;

    /* renamed from: m, reason: collision with root package name */
    public View[] f46348m;

    @Override // androidx.constraintlayout.widget.c
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u0.d.f46505h);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f46345j = typedArrayObtainStyledAttributes.getBoolean(index, this.f46345j);
                } else if (index == 0) {
                    this.f46346k = typedArrayObtainStyledAttributes.getBoolean(index, this.f46346k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getProgress() {
        return this.f46347l;
    }

    public void setProgress(float f10) {
        this.f46347l = f10;
        int i = 0;
        if (this.f15305c <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                boolean z10 = viewGroup.getChildAt(i) instanceof c;
                i++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.f15310h;
        if (viewArr == null || viewArr.length != this.f15305c) {
            this.f15310h = new View[this.f15305c];
        }
        for (int i10 = 0; i10 < this.f15305c; i10++) {
            this.f15310h[i10] = constraintLayout.f15197b.get(this.f15304b[i10]);
        }
        this.f46348m = this.f15310h;
        while (i < this.f15305c) {
            View view = this.f46348m[i];
            i++;
        }
    }
}
