package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o1.C7045a;
import o1.C7049e;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: i, reason: collision with root package name */
    private int f30142i;

    /* renamed from: j, reason: collision with root package name */
    private int f30143j;

    /* renamed from: k, reason: collision with root package name */
    private C7045a f30144k;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void o(C7049e c7049e, int i10, boolean z10) {
        this.f30143j = i10;
        if (z10) {
            int i11 = this.f30142i;
            if (i11 == 5) {
                this.f30143j = 1;
            } else if (i11 == 6) {
                this.f30143j = 0;
            }
        } else {
            int i12 = this.f30142i;
            if (i12 == 5) {
                this.f30143j = 0;
            } else if (i12 == 6) {
                this.f30143j = 1;
            }
        }
        if (c7049e instanceof C7045a) {
            ((C7045a) c7049e).P0(this.f30143j);
        }
    }

    @Override // androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.g(attributeSet);
        this.f30144k = new C7045a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f30435a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f30547q1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f30540p1) {
                    this.f30144k.O0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f30554r1) {
                    this.f30144k.Q0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f30156d = this.f30144k;
        m();
    }

    public int getMargin() {
        return this.f30144k.M0();
    }

    public int getType() {
        return this.f30142i;
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(C7049e c7049e, boolean z10) {
        o(c7049e, this.f30142i, z10);
    }

    public boolean n() {
        return this.f30144k.K0();
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f30144k.O0(z10);
    }

    public void setDpMargin(int i10) {
        this.f30144k.Q0((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f30144k.Q0(i10);
    }

    public void setType(int i10) {
        this.f30142i = i10;
    }
}
