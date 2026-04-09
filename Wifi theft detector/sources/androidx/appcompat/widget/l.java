package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1228a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.f f1229b;

    public l(TextView textView) {
        this.f1228a = textView;
        this.f1229b = new f1.f(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1229b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1229b.b();
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f1228a.getContext().obtainStyledAttributes(attributeSet, c.j.AppCompatTextView, i10, 0);
        try {
            int i11 = c.j.AppCompatTextView_emojiCompatEnabled;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void d(boolean z10) {
        this.f1229b.c(z10);
    }

    public void e(boolean z10) {
        this.f1229b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f1229b.e(transformationMethod);
    }
}
