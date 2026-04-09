package com.instagram.common.viewpoint.core;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.1J, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C1J extends C7M {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C1J(C1436gi c1436gi) {
        super(c1436gi);
        setCarouselLayoutManager(c1436gi);
    }

    public AbstractC0507Ft getFullscreenCarouselRecyclerViewAdapter() {
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

    @Override // com.instagram.common.viewpoint.core.C7M
    public C1506hr getLayoutManager() {
        return (C1506hr) super.getLayoutManager();
    }

    public R7 getOnScrollListener() {
        return new PY(this);
    }

    private void setCarouselLayoutManager(C1436gi c1436gi) {
        C1506hr c1506hr = new C1506hr(c1436gi, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1506hr.A1T(true);
        }
        super.setLayoutManager(c1506hr);
    }

    @Override // com.instagram.common.viewpoint.core.C7M
    public void setLayoutManager(R2 r22) {
    }
}
