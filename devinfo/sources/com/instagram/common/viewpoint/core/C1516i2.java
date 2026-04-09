package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1516i2 implements PR {
    public static String[] A02 = {"gru2Lda4S7GCbNBLtOIdQEnlbYeRFwfL", "XnGCgKT7Pg2", "mKUX8sgZfunspLF5wjmFH8sDBtb3K48d", "jKk7kH4cQGBiDg5TKe33YqGV3AsPygQR", "TZdQK9usf81OKXIWMb61JsmxOZFMnA3k", "eyC2dzaRwXiJKVGsgdgz1meLL5sRgImY", "S4mkNNYHIh7xNNZ0OEskqLhCY0hDyySt", "ZXfiglEYlIOoTIuj216uQxYNuz12aQjw"};
    public final Rect A00 = new Rect();
    public final /* synthetic */ Pv A01;

    public C1516i2(Pv pv) {
        this.A01 = pv;
    }

    @Override // com.instagram.common.viewpoint.core.PR
    public final C0767Py ACw(View view, C0767Py c0767Py) {
        C0767Py c0767PyA06 = Ph.A06(view, c0767Py);
        if (c0767PyA06.A07()) {
            return c0767PyA06;
        }
        Rect rect = this.A00;
        rect.left = c0767PyA06.A03();
        rect.top = c0767PyA06.A05();
        rect.right = c0767PyA06.A04();
        rect.bottom = c0767PyA06.A02();
        int count = this.A01.getChildCount();
        for (int i4 = 0; i4 < count; i4++) {
            C0767Py c0767PyA05 = Ph.A05(this.A01.getChildAt(i4), c0767PyA06);
            rect.left = Math.min(c0767PyA05.A03(), rect.left);
            rect.top = Math.min(c0767PyA05.A05(), rect.top);
            rect.right = Math.min(c0767PyA05.A04(), rect.right);
            rect.bottom = Math.min(c0767PyA05.A02(), rect.bottom);
        }
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        if (A02[1].length() != 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "4mRHs0uPE72ppwyI9I2NgTpzqE63n9j5";
        strArr[2] = "Zp0DshFYJF7gm0rY227qRNMYobzVhEjB";
        C0767Py applied = c0767PyA06.A06(i10, i11, i12, i13);
        return applied;
    }
}
