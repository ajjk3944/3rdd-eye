package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6680P;

/* renamed from: androidx.compose.ui.platform.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3905b0 implements InterfaceC3902a0 {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f29333a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f29334b;

    public /* synthetic */ C3905b0(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private final void b(float[] fArr, Matrix matrix) {
        AbstractC6680P.b(this.f29333a, matrix);
        M.i(fArr, this.f29333a);
    }

    private final void c(float[] fArr, float f10, float f11) {
        M.j(fArr, f10, f11, this.f29333a);
    }

    private final void d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f29334b);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        b(fArr, matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3902a0
    public void a(View view, float[] fArr) {
        m0.O0.h(fArr);
        d(view, fArr);
    }

    private C3905b0(float[] fArr) {
        this.f29333a = fArr;
        this.f29334b = new int[2];
    }
}
