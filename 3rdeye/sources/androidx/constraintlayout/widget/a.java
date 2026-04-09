package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import r0.C5504a;
import r0.C5508e;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: j, reason: collision with root package name */
    public int f15292j;

    /* renamed from: k, reason: collision with root package name */
    public int f15293k;

    /* renamed from: l, reason: collision with root package name */
    public C5504a f15294l;

    @Override // androidx.constraintlayout.widget.c
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f15294l = new C5504a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u0.d.f46499b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f15294l.f45487u0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f15294l.f45488v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f15307e = this.f15294l;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f15294l.f45487u0;
    }

    public int getMargin() {
        return this.f15294l.f45488v0;
    }

    public int getType() {
        return this.f15292j;
    }

    @Override // androidx.constraintlayout.widget.c
    public final void h(C5508e c5508e, boolean z10) {
        int i = this.f15292j;
        this.f15293k = i;
        if (z10) {
            if (i == 5) {
                this.f15293k = 1;
            } else if (i == 6) {
                this.f15293k = 0;
            }
        } else if (i == 5) {
            this.f15293k = 0;
        } else if (i == 6) {
            this.f15293k = 1;
        }
        if (c5508e instanceof C5504a) {
            ((C5504a) c5508e).f45486t0 = this.f15293k;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f15294l.f45487u0 = z10;
    }

    public void setDpMargin(int i) {
        this.f15294l.f45488v0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f15294l.f45488v0 = i;
    }

    public void setType(int i) {
        this.f15292j = i;
    }
}
