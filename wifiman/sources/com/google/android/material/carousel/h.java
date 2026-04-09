package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import z1.AbstractC8707a;

/* loaded from: classes3.dex */
public final class h extends d {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f37242d = {1};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f37243e = {1, 0};

    /* renamed from: c, reason: collision with root package name */
    private int f37244c = 0;

    @Override // com.google.android.material.carousel.d
    f g(b bVar, View view) {
        float fL = bVar.l();
        if (bVar.j()) {
            fL = bVar.k();
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.j()) {
            f10 = ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f11 = f10;
        float fD = d() + f11;
        float fMax = Math.max(c() + f11, fD);
        float fMin = Math.min(measuredHeight + f11, fL);
        float fA = AbstractC8707a.a((measuredHeight / 3.0f) + f11, fD + f11, fMax + f11);
        float f12 = (fMin + fA) / 2.0f;
        int[] iArrA = f37242d;
        if (fL < 2.0f * fD) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f37243e;
        if (bVar.m() == 1) {
            iArrA = d.a(iArrA);
            iArrA2 = d.a(iArrA2);
        }
        int[] iArr = iArrA;
        int[] iArr2 = iArrA2;
        int iMax = (int) Math.max(1.0d, Math.floor(((fL - (e.i(iArr2) * f12)) - (e.i(iArr) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(fL / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = a.c(fL, fA, fD, fMax, iArr, f12, iArr2, fMin, iArr3);
        this.f37244c = aVarC.e();
        if (i(aVarC, bVar.a())) {
            aVarC = a.c(fL, fA, fD, fMax, new int[]{aVarC.f37203c}, f12, new int[]{aVarC.f37204d}, fMin, new int[]{aVarC.f37207g});
        }
        return e.d(view.getContext(), f11, fL, aVarC, bVar.m());
    }

    @Override // com.google.android.material.carousel.d
    boolean h(b bVar, int i10) {
        return (i10 < this.f37244c && bVar.a() >= this.f37244c) || (i10 >= this.f37244c && bVar.a() < this.f37244c);
    }

    boolean i(a aVar, int i10) {
        int iE = aVar.e() - i10;
        boolean z10 = iE > 0 && (aVar.f37203c > 0 || aVar.f37204d > 1);
        while (iE > 0) {
            int i11 = aVar.f37203c;
            if (i11 > 0) {
                aVar.f37203c = i11 - 1;
            } else {
                int i12 = aVar.f37204d;
                if (i12 > 1) {
                    aVar.f37204d = i12 - 1;
                }
            }
            iE--;
        }
        return z10;
    }
}
