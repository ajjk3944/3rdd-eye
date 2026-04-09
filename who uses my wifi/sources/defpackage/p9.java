package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p9 extends ai {
    public int m;
    public int n;
    public q9 o;

    public boolean getAllowsGoneWidget() {
        return this.o.t0;
    }

    public int getMargin() {
        return this.o.u0;
    }

    public int getType() {
        return this.m;
    }

    @Override // defpackage.ai
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        q9 q9Var = new q9();
        q9Var.s0 = 0;
        q9Var.t0 = true;
        q9Var.u0 = 0;
        q9Var.v0 = false;
        this.o = q9Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, zm0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.o.t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.o.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.i = this.o;
        k();
    }

    @Override // defpackage.ai
    public final void i(pi piVar, boolean z) {
        int i = this.m;
        this.n = i;
        if (z) {
            if (i == 5) {
                this.n = 1;
            } else if (i == 6) {
                this.n = 0;
            }
        } else if (i == 5) {
            this.n = 0;
        } else if (i == 6) {
            this.n = 1;
        }
        if (piVar instanceof q9) {
            ((q9) piVar).s0 = this.n;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.o.t0 = z;
    }

    public void setDpMargin(int i) {
        this.o.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.o.u0 = i;
    }

    public void setType(int i) {
        this.m = i;
    }
}
