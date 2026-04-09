package y4;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f37344a;

    public k(TransformationMethod transformationMethod) {
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
        if (charSequence == null || w4.i.a().b() != 1) {
            return charSequence;
        }
        w4.i iVarA = w4.i.a();
        iVarA.getClass();
        return iVarA.f(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i4, Rect rect) {
        TransformationMethod transformationMethod = this.f37344a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i4, rect);
        }
    }
}
