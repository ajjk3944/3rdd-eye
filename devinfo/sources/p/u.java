package p;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f30875a;

    /* renamed from: b, reason: collision with root package name */
    public final nm.d0 f30876b;

    public u(TextView textView) {
        this.f30875a = textView;
        this.f30876b = new nm.d0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((me.t1) this.f30876b.f30011b).o(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = this.f30875a.getContext().obtainStyledAttributes(attributeSet, h.a.f24783i, i4, 0);
        try {
            boolean z3 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z3);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z3) {
        ((me.t1) this.f30876b.f30011b).D(z3);
    }

    public final void d(boolean z3) {
        ((me.t1) this.f30876b.f30011b).E(z3);
    }
}
