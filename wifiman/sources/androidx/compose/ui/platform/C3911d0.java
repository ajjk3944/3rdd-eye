package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import m0.AbstractC6680P;

/* renamed from: androidx.compose.ui.platform.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3911d0 implements InterfaceC3902a0 {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f29349a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final int[] f29350b = new int[2];

    @Override // androidx.compose.ui.platform.InterfaceC3902a0
    public void a(View view, float[] fArr) {
        this.f29349a.reset();
        view.transformMatrixToGlobal(this.f29349a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f29350b);
        int[] iArr = this.f29350b;
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f29350b;
        this.f29349a.postTranslate(iArr2[0] - i10, iArr2[1] - i11);
        AbstractC6680P.b(fArr, this.f29349a);
    }
}
