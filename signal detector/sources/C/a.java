package C;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import z.C3013a;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: h, reason: collision with root package name */
    public int f800h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C3013a f801j;

    public boolean getAllowsGoneWidget() {
        return this.f801j.f24266t0;
    }

    public int getMargin() {
        return this.f801j.f24267u0;
    }

    public int getType() {
        return this.f800h;
    }

    @Override // C.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        C3013a c3013a = new C3013a();
        c3013a.f24265s0 = 0;
        c3013a.f24266t0 = true;
        c3013a.f24267u0 = 0;
        c3013a.v0 = false;
        this.f801j = c3013a;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1013b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f801j.f24266t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f801j.f24267u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f812d = this.f801j;
        k();
    }

    @Override // C.c
    public final void i(z.d dVar, boolean z6) {
        int i = this.f800h;
        this.i = i;
        if (z6) {
            if (i == 5) {
                this.i = 1;
            } else if (i == 6) {
                this.i = 0;
            }
        } else if (i == 5) {
            this.i = 0;
        } else if (i == 6) {
            this.i = 1;
        }
        if (dVar instanceof C3013a) {
            ((C3013a) dVar).f24265s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z6) {
        this.f801j.f24266t0 = z6;
    }

    public void setDpMargin(int i) {
        this.f801j.f24267u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f801j.f24267u0 = i;
    }

    public void setType(int i) {
        this.f800h = i;
    }
}
