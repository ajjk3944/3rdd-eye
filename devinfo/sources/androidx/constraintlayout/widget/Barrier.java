package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import k3.a;
import k3.d;
import n3.b;
import n3.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: h, reason: collision with root package name */
    public int f854h;

    /* renamed from: i, reason: collision with root package name */
    public int f855i;
    public a j;

    public Barrier(Context context) {
        super(context);
        this.f29572a = new int[32];
        this.g = new HashMap();
        this.f29574c = context;
        g(null);
        super.setVisibility(8);
    }

    @Override // n3.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        a aVar = new a();
        aVar.f27812s0 = 0;
        aVar.f27813t0 = true;
        aVar.f27814u0 = 0;
        aVar.f27815v0 = false;
        this.j = aVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f29721b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.j.f27813t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.j.f27814u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f29575d = this.j;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.j.f27813t0;
    }

    public int getMargin() {
        return this.j.f27814u0;
    }

    public int getType() {
        return this.f854h;
    }

    @Override // n3.b
    public final void h(d dVar, boolean z3) {
        int i4 = this.f854h;
        this.f855i = i4;
        if (z3) {
            if (i4 == 5) {
                this.f855i = 1;
            } else if (i4 == 6) {
                this.f855i = 0;
            }
        } else if (i4 == 5) {
            this.f855i = 0;
        } else if (i4 == 6) {
            this.f855i = 1;
        }
        if (dVar instanceof a) {
            ((a) dVar).f27812s0 = this.f855i;
        }
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.j.f27813t0 = z3;
    }

    public void setDpMargin(int i4) {
        this.j.f27814u0 = (int) ((i4 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i4) {
        this.j.f27814u0 = i4;
    }

    public void setType(int i4) {
        this.f854h = i4;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
