package L6;

import C6.r;
import L6.e;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class f implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.p f4090c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f4092e;

    /* JADX WARN: Multi-variable type inference failed */
    public f(int i, int i10, e eVar, l lVar) {
        this.f4089b = i;
        this.f4090c = (RecyclerView.p) eVar;
        this.f4091d = i10;
        this.f4092e = lVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [L6.e, androidx.recyclerview.widget.RecyclerView$p] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        view.removeOnLayoutChangeListener(this);
        ?? r12 = this.f4090c;
        int i17 = this.f4091d;
        int i18 = this.f4089b;
        if (i18 == 0) {
            if (r12.q() != 0 || !r.d(r12.getView())) {
                i17 = -i17;
            }
            r12.getView().scrollBy(i17, i17);
            return;
        }
        r12.getView().scrollBy(-r12.getView().getScrollX(), -r12.getView().getScrollY());
        RecyclerView.p layoutManager = r12.getView().getLayoutManager();
        View viewJ = layoutManager != null ? layoutManager.J(i18) : null;
        while (viewJ == null && (r12.getView().canScrollVertically(1) || r12.getView().canScrollHorizontally(1))) {
            RecyclerView.p layoutManager2 = r12.getView().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.J0();
            }
            RecyclerView.p layoutManager3 = r12.getView().getLayoutManager();
            viewJ = layoutManager3 != null ? layoutManager3.J(i18) : null;
            if (viewJ != null) {
                break;
            } else {
                r12.getView().scrollBy(r12.getView().getWidth(), r12.getView().getHeight());
            }
        }
        if (viewJ != null) {
            int i19 = e.b.f4088a[this.f4092e.ordinal()];
            if (i19 != 1) {
                if (i19 != 2) {
                    return;
                }
                int iM = B4.g.m(r12, viewJ) - i17;
                if (r.d(r12.getView())) {
                    iM = -iM;
                }
                r12.getView().scrollBy(iM, iM);
                return;
            }
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            r12.getView().getLocationOnScreen(iArr2);
            viewJ.getLocationOnScreen(iArr);
            r12.getView().scrollBy(((viewJ.getWidth() - r12.getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((viewJ.getHeight() - r12.getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
        }
    }
}
