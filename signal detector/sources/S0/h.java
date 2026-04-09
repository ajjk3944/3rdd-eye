package S0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.X;
import androidx.recyclerview.widget.d0;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class h extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f3468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ViewPager2 viewPager2) {
        super(1, false);
        this.f3468a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(d0 d0Var, int[] iArr) {
        ViewPager2 viewPager2 = this.f3468a;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.calculateExtraLayoutSpace(d0Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onInitializeAccessibilityNodeInfo(X x6, d0 d0Var, S.d dVar) {
        super.onInitializeAccessibilityNodeInfo(x6, d0Var, dVar);
        this.f3468a.f5644H.getClass();
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean performAccessibilityAction(X x6, d0 d0Var, int i, Bundle bundle) {
        this.f3468a.f5644H.getClass();
        return super.performAccessibilityAction(x6, d0Var, i, bundle);
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z7) {
        return false;
    }
}
