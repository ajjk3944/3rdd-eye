package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import g.C4353a;

/* compiled from: AppCompatImageHelper.java */
/* renamed from: o.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5394l {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f44695a;

    /* renamed from: b, reason: collision with root package name */
    public V f44696b;

    /* renamed from: c, reason: collision with root package name */
    public int f44697c = 0;

    public C5394l(ImageView imageView) {
        this.f44695a = imageView;
    }

    public final void a() {
        V v10;
        ImageView imageView = this.f44695a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C5375C.a(drawable);
        }
        if (drawable == null || (v10 = this.f44696b) == null) {
            return;
        }
        C5390h.e(drawable, v10, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.f44695a;
        Context context = imageView.getContext();
        int[] iArr = C4353a.f37881f;
        X xE = X.e(context, attributeSet, iArr, i);
        L0.I.n(imageView, imageView.getContext(), iArr, attributeSet, xE.f44608b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = xE.f44608b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = A9.I.w(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C5375C.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                R0.e.c(imageView, xE.a(2));
            }
            if (typedArray.hasValue(3)) {
                R0.e.d(imageView, C5375C.c(typedArray.getInt(3, -1), null));
            }
            xE.f();
        } catch (Throwable th) {
            xE.f();
            throw th;
        }
    }

    public final void c(int i) {
        ImageView imageView = this.f44695a;
        if (i != 0) {
            Drawable drawableW = A9.I.w(imageView.getContext(), i);
            if (drawableW != null) {
                C5375C.a(drawableW);
            }
            imageView.setImageDrawable(drawableW);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
