package d1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: EmojiTransformationMethod.java */
/* loaded from: classes.dex */
public final class h implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f37344a;

    public h(TransformationMethod transformationMethod) {
        this.f37344a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f37344a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || androidx.emoji2.text.c.a().b() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
        cVarA.getClass();
        return cVarA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f37344a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i, rect);
        }
    }
}
