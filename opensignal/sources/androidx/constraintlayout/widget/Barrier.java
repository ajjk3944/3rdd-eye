package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c3.c;
import c3.s;
import java.util.HashMap;
import z2.a;
import z2.g;

/* loaded from: classes.dex */
public class Barrier extends c {
    public int D;
    public int E;
    public a F;

    public Barrier(Context context) {
        super(context);
        this.f3143a = new int[32];
        this.B = new HashMap();
        this.f3145g = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.F.f26508t0;
    }

    public int getMargin() {
        return this.F.f26509u0;
    }

    public int getType() {
        return this.D;
    }

    @Override // c3.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        a aVar = new a();
        aVar.f26507s0 = 0;
        aVar.f26508t0 = true;
        aVar.f26509u0 = 0;
        aVar.f26510v0 = false;
        this.F = aVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == s.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == s.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.F.f26508t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == s.ConstraintLayout_Layout_barrierMargin) {
                    this.F.f26509u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f3146r = this.F;
        k();
    }

    @Override // c3.c
    public final void i(g gVar, boolean z10) {
        int i10 = this.D;
        this.E = i10;
        if (z10) {
            if (i10 == 5) {
                this.E = 1;
            } else if (i10 == 6) {
                this.E = 0;
            }
        } else if (i10 == 5) {
            this.E = 0;
        } else if (i10 == 6) {
            this.E = 1;
        }
        if (gVar instanceof a) {
            ((a) gVar).f26507s0 = this.E;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.F.f26508t0 = z10;
    }

    public void setDpMargin(int i10) {
        this.F.f26509u0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.F.f26509u0 = i10;
    }

    public void setType(int i10) {
        this.D = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
