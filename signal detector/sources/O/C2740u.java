package o;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import g.AbstractC2327a;

/* renamed from: o.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2740u {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f22641a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.h f22642b;

    public C2740u(TextView textView) {
        this.f22641a = textView;
        this.f22642b = new d4.h(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((R2.a) this.f22642b.f19807b).o(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f22641a.getContext().obtainStyledAttributes(attributeSet, AbstractC2327a.i, i, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z6);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z6) {
        ((R2.a) this.f22642b.f19807b).B(z6);
    }

    public final void d(boolean z6) {
        ((R2.a) this.f22642b.f19807b).E(z6);
    }
}
