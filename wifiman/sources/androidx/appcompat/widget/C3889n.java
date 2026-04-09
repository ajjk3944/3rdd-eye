package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import h.AbstractC5936j;

/* renamed from: androidx.appcompat.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3889n {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f27438a;

    /* renamed from: b, reason: collision with root package name */
    private final T1.f f27439b;

    C3889n(TextView textView) {
        this.f27438a = textView;
        this.f27439b = new T1.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f27439b.a(inputFilterArr);
    }

    void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f27438a.getContext().obtainStyledAttributes(attributeSet, AbstractC5936j.f48220g0, i10, 0);
        try {
            int i11 = AbstractC5936j.f48282u0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void c(boolean z10) {
        this.f27439b.b(z10);
    }

    void d(boolean z10) {
        this.f27439b.c(z10);
    }
}
