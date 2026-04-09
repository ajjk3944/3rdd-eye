package h0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public final class l implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f20465a;

    public l(TransformationMethod transformationMethod) {
        this.f20465a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f20465a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || f0.j.a().b() != 1) {
            return charSequence;
        }
        f0.j jVarA = f0.j.a();
        jVarA.getClass();
        return jVarA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z6, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f20465a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z6, i, rect);
        }
    }
}
