package com.facebook.ads.redexgen.core;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.0h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C21660h extends C23196g {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C21660h(C3272dL c3272dL) {
        super(c3272dL);
        setCarouselLayoutManager(c3272dL);
    }

    public FG getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        if (A00[6].length() != 2) {
            throw new RuntimeException();
        }
        A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C23196g
    public C3452gI getLayoutManager() {
        return (C3452gI) super.getLayoutManager();
    }

    public QT getOnScrollListener() {
        return new OC(this);
    }

    private void setCarouselLayoutManager(C3272dL c3272dL) {
        C3452gI c3452gI = new C3452gI(c3272dL, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c3452gI.A1T(true);
        }
        super.setLayoutManager(c3452gI);
    }

    @Override // com.facebook.ads.redexgen.core.C23196g
    public void setLayoutManager(QO qo) {
    }
}
