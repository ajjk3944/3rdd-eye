package j2;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f27319a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f27320b;

    public t0(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f27319a = new int[size];
        this.f27320b = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            this.f27319a[i4] = ((Integer) arrayList.get(i4)).intValue();
            this.f27320b[i4] = ((Float) arrayList2.get(i4)).floatValue();
        }
    }

    @Override // j2.s0
    public void a(View view, float[] fArr) {
        p1.z.r(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z3 = parent instanceof View;
        float[] fArr2 = this.f27320b;
        if (z3) {
            b((View) parent, fArr);
            p1.z.r(fArr2);
            p1.z.x(fArr2, -view.getScrollX(), -view.getScrollY());
            d0.p(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            p1.z.r(fArr2);
            p1.z.x(fArr2, left, top);
            d0.p(fArr, fArr2);
        } else {
            int[] iArr = this.f27319a;
            view.getLocationInWindow(iArr);
            p1.z.r(fArr2);
            p1.z.x(fArr2, -view.getScrollX(), -view.getScrollY());
            d0.p(fArr, fArr2);
            float f10 = iArr[0];
            float f11 = iArr[1];
            p1.z.r(fArr2);
            p1.z.x(fArr2, f10, f11);
            d0.p(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        p1.z.s(fArr2, matrix);
        d0.p(fArr, fArr2);
    }

    public t0(int i4, int i10) {
        this.f27319a = new int[]{i4, i10};
        this.f27320b = new float[]{0.0f, 1.0f};
    }

    public t0(int i4, int i10, int i11) {
        this.f27319a = new int[]{i4, i10, i11};
        this.f27320b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public t0(float[] fArr) {
        this.f27320b = fArr;
        this.f27319a = new int[2];
    }
}
