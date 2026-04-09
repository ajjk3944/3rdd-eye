package p;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.y3;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f20165a;

    /* renamed from: b, reason: collision with root package name */
    public final i.g0 f20166b;

    public s(TextView textView) {
        this.f20165a = textView;
        this.f20166b = new i.g0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((y3) this.f20166b.f11051a).u(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f20165a.getContext().obtainStyledAttributes(attributeSet, h.j.AppCompatTextView, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(h.j.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(h.j.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z10) {
        ((y3) this.f20166b.f11051a).L(z10);
    }

    public final void d(boolean z10) {
        ((y3) this.f20166b.f11051a).M(z10);
    }
}
