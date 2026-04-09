package y7;

import L0.I;
import L0.S;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import y7.t;

/* compiled from: TabsLayout.kt */
/* loaded from: classes.dex */
public class w extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final t<?> f48346b;

    /* renamed from: c, reason: collision with root package name */
    public final View f48347c;

    /* renamed from: d, reason: collision with root package name */
    public final x f48348d;

    /* renamed from: e, reason: collision with root package name */
    public final n f48349e;

    /* renamed from: f, reason: collision with root package name */
    public N6.c f48350f;

    public w(Context context) throws Resources.NotFoundException {
        super(context, null);
        setId(R.id.div_tabs_block);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        t<?> tVar = new t<>(context);
        tVar.f48332P = false;
        tVar.setTabMode(0);
        tVar.setTabIndicatorHeight(0);
        tVar.setOnTabSelectedListener(new s(tVar));
        B7.e eVar = new B7.e(7);
        ((ConcurrentHashMap) eVar.f583c).put("TabTitlesLayoutView.TAB_HEADER", new t.b(tVar.getContext()));
        tVar.f48328L = eVar;
        tVar.f48329M = "TabTitlesLayoutView.TAB_HEADER";
        tVar.setId(R.id.base_tabbed_title_container_scroller);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.title_tab_title_height));
        layoutParams.gravity = 8388611;
        tVar.setLayoutParams(layoutParams);
        int dimensionPixelSize = tVar.getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_vertical);
        int dimensionPixelSize2 = tVar.getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_horizontal);
        tVar.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        tVar.setClipToPadding(false);
        this.f48346b = tVar;
        View view = new View(context);
        view.setId(R.id.div_tabs_divider);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.div_separator_delimiter_height));
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.div_horizontal_padding);
        layoutParams2.leftMargin = dimensionPixelSize3;
        layoutParams2.rightMargin = dimensionPixelSize3;
        layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.title_tab_title_separator_margin_top);
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(R.dimen.title_tab_title_margin_vertical);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundResource(R.color.div_separator_color);
        this.f48347c = view;
        n nVar = new n(context);
        nVar.setId(R.id.div_tabs_pager_container);
        nVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        nVar.setOverScrollMode(2);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        I.d.t(nVar, true);
        this.f48349e = nVar;
        x xVar = new x(context, null, 0);
        xVar.f48354e = true;
        xVar.setId(R.id.div_tabs_container_helper);
        xVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        xVar.setCollapsiblePaddingBottom(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        xVar.addView(getViewPager());
        xVar.addView(frameLayout);
        this.f48348d = xVar;
        addView(getTitleLayout());
        addView(getDivider());
        addView(getPagerLayout());
    }

    public N6.c getDivTabsAdapter() {
        return this.f48350f;
    }

    public View getDivider() {
        return this.f48347c;
    }

    public x getPagerLayout() {
        return this.f48348d;
    }

    public t<?> getTitleLayout() {
        return this.f48346b;
    }

    public n getViewPager() {
        return this.f48349e;
    }

    public void setDivTabsAdapter(N6.c cVar) {
        this.f48350f = cVar;
    }
}
