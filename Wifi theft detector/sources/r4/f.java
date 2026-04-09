package r4;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselStrategy;

/* loaded from: classes2.dex */
public final class f extends CarouselStrategy {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f24172d = {1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f24173e = {1, 0};

    /* renamed from: c, reason: collision with root package name */
    public int f24174c = 0;

    @Override // com.google.android.material.carousel.CarouselStrategy
    public com.google.android.material.carousel.b g(b bVar, View view) {
        boolean z10;
        int iB = bVar.b();
        if (bVar.d()) {
            iB = bVar.a();
        }
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.d()) {
            f10 = ((ViewGroup.MarginLayoutParams) oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float fD = d() + f10;
        float fMax = Math.max(c() + f10, fD);
        float f11 = iB;
        float fMin = Math.min(measuredHeight + f10, f11);
        float fA = m0.a.a((measuredHeight / 3.0f) + f10, fD + f10, fMax + f10);
        float f12 = (fMin + fA) / 2.0f;
        int[] iArrA = f24172d;
        float f13 = 2.0f * fD;
        if (f11 <= f13) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f24173e;
        if (bVar.c() == 1) {
            iArrA = CarouselStrategy.a(iArrA);
            iArrA2 = CarouselStrategy.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        float f14 = f10;
        int iMax = (int) Math.max(1.0d, Math.floor(((f11 - (com.google.android.material.carousel.a.i(iArr) * f12)) - (com.google.android.material.carousel.a.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f11 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = a.c(f11, fA, fD, fMax, iArr2, f12, iArr, fMin, iArr3);
        this.f24174c = aVarC.e();
        boolean zI = i(aVarC, bVar.getItemCount());
        int i12 = aVarC.f24162d;
        if (i12 == 0 && aVarC.f24161c == 0 && f11 > f13) {
            aVarC.f24161c = 1;
            z10 = true;
        } else {
            z10 = zI;
        }
        if (z10) {
            aVarC = a.c(f11, fA, fD, fMax, new int[]{aVarC.f24161c}, f12, new int[]{i12}, fMin, new int[]{aVarC.f24165g});
        }
        return com.google.android.material.carousel.a.d(view.getContext(), f14, iB, aVarC, bVar.c());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean h(b bVar, int i10) {
        if (i10 >= this.f24174c || bVar.getItemCount() < this.f24174c) {
            return i10 >= this.f24174c && bVar.getItemCount() < this.f24174c;
        }
        return true;
    }

    public boolean i(a aVar, int i10) {
        int iE = aVar.e() - i10;
        boolean z10 = iE > 0 && (aVar.f24161c > 0 || aVar.f24162d > 1);
        while (iE > 0) {
            int i11 = aVar.f24161c;
            if (i11 > 0) {
                aVar.f24161c = i11 - 1;
            } else {
                int i12 = aVar.f24162d;
                if (i12 > 1) {
                    aVar.f24162d = i12 - 1;
                }
            }
            iE--;
        }
        return z10;
    }
}
