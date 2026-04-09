package zk;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import se.b;
import x7.e;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final com.staircase3.opensignal.utils.a f27444a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f27445b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27446c;

    public a(Context context, com.staircase3.opensignal.utils.a aVar, LinearLayout linearLayout, ViewPager viewPager, int i10) {
        this.f27444a = aVar;
        this.f27445b = linearLayout;
        this.f27446c = i10;
        if (linearLayout != null) {
            if (viewPager.f2139p0 == null) {
                viewPager.f2139p0 = new ArrayList();
            }
            viewPager.f2139p0.add(this);
            linearLayout.removeAllViews();
            int i11 = 0;
            while (i11 < 2) {
                View view = new View(context);
                int iU = b.u(context, 12);
                int iU2 = b.u(context, 12);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iU, iU);
                layoutParams.setMargins(i11 == 0 ? 0 : iU2, 0, 0, 0);
                view.setLayoutParams(layoutParams);
                view.setBackgroundResource(this.f27446c);
                view.setSelected(i11 == 0);
                linearLayout.addView(view);
                i11++;
            }
        }
    }

    @Override // x7.e
    public final void b(int i10) {
        int i11 = i10 % 2;
        LinearLayout linearLayout = this.f27445b;
        if (linearLayout != null) {
            int i12 = 0;
            while (i12 < linearLayout.getChildCount()) {
                linearLayout.getChildAt(i12).setSelected(i12 == i11);
                i12++;
            }
        }
        StringBuilder sbU = h0.b.u("page", i11, "-");
        sbU.append(i11 != 0 ? i11 != 1 ? "" : "latency" : "download-upload");
        this.f27444a.c("network_stats_dialog", "page_changed", sbU.toString());
    }

    @Override // x7.e
    public final void a(int i10) {
    }

    @Override // x7.e
    public final void c(int i10, float f10) {
    }
}
