package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: j, reason: collision with root package name */
    public int f2176j;

    /* renamed from: k, reason: collision with root package name */
    public int f2177k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.a f2178l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f2178l.p1();
    }

    public int getMargin() {
        return this.f2178l.r1();
    }

    public int getType() {
        return this.f2176j;
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.n(attributeSet);
        this.f2178l = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b0.d.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == b0.d.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == b0.d.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2178l.u1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == b0.d.ConstraintLayout_Layout_barrierMargin) {
                    this.f2178l.w1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2182d = this.f2178l;
        v();
    }

    @Override // androidx.constraintlayout.widget.b
    public void o(c.a aVar, x.b bVar, ConstraintLayout.b bVar2, SparseArray sparseArray) {
        super.o(aVar, bVar, bVar2, sparseArray);
        if (bVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) bVar;
            w(aVar2, aVar.f2202e.f2232g0, ((androidx.constraintlayout.core.widgets.d) bVar.L()).K1());
            aVar2.u1(aVar.f2202e.f2248o0);
            aVar2.w1(aVar.f2202e.f2234h0);
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public void p(ConstraintWidget constraintWidget, boolean z10) {
        w(constraintWidget, this.f2176j, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f2178l.u1(z10);
    }

    public void setDpMargin(int i10) {
        this.f2178l.w1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f2178l.w1(i10);
    }

    public void setType(int i10) {
        this.f2176j = i10;
    }

    public final void w(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.f2177k = i10;
        if (z10) {
            int i11 = this.f2176j;
            if (i11 == 5) {
                this.f2177k = 1;
            } else if (i11 == 6) {
                this.f2177k = 0;
            }
        } else {
            int i12 = this.f2176j;
            if (i12 == 5) {
                this.f2177k = 0;
            } else if (i12 == 6) {
                this.f2177k = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).v1(this.f2177k);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }
}
