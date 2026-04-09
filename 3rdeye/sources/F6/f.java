package F6;

import N7.C1126cb;
import N7.Xa;
import O6.q;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.l;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: a, reason: collision with root package name */
    public final q f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.d f1676b;

    public f(q view, A7.d resolver) {
        l.f(view, "view");
        l.f(resolver, "resolver");
        this.f1675a = view;
        this.f1676b = resolver;
    }

    @Override // F6.e
    public final void a(Canvas canvas, Layout layout, int i, int i10, int i11, int i12, C1126cb c1126cb, Xa xa) {
        int paragraphDirection = layout.getParagraphDirection(i);
        float lineLeft = paragraphDirection == -1 ? layout.getLineLeft(i) : layout.getLineRight(i);
        int iB = e.b(layout, i);
        int iC = e.c(layout, i);
        DisplayMetrics displayMetrics = this.f1675a.getResources().getDisplayMetrics();
        l.e(displayMetrics, "view.resources.displayMetrics");
        a aVar = new a(displayMetrics, c1126cb, xa, canvas, this.f1676b);
        float f10 = i11;
        float f11 = iC;
        float f12 = (int) lineLeft;
        float f13 = iB;
        float[] fArr = new float[8];
        float[] fArr2 = aVar.f1662g;
        if (fArr2 != null) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
        }
        aVar.a(fArr, f10, f11, f12, f13);
        for (int i13 = i + 1; i13 < i10; i13++) {
            aVar.a(new float[8], (int) layout.getLineLeft(i13), e.c(layout, i13), (int) layout.getLineRight(i13), e.b(layout, i13));
        }
        float lineRight = paragraphDirection == -1 ? layout.getLineRight(i) : layout.getLineLeft(i);
        int iB2 = e.b(layout, i10);
        float f14 = (int) lineRight;
        float fC = e.c(layout, i10);
        float f15 = i12;
        float f16 = iB2;
        float[] fArr3 = new float[8];
        if (fArr2 != null) {
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = fArr2[2];
            fArr3[3] = fArr2[3];
            fArr3[4] = fArr2[4];
            fArr3[5] = fArr2[5];
            fArr3[6] = 0.0f;
            fArr3[7] = 0.0f;
        }
        aVar.a(fArr3, f14, fC, f15, f16);
    }
}
