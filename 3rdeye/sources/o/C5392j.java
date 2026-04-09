package o;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import g.C4353a;

/* compiled from: AppCompatEmojiTextHelper.java */
/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5392j {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f44690a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.f f44691b;

    public C5392j(TextView textView) {
        this.f44690a = textView;
        this.f44691b = new d1.f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f44691b.f37335a.a(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f44690a.getContext().obtainStyledAttributes(attributeSet, C4353a.i, i, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z10) {
        this.f44691b.f37335a.c(z10);
    }

    public final void d(boolean z10) {
        this.f44691b.f37335a.d(z10);
    }
}
