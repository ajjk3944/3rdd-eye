package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.w0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f511d = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    private e f512b;

    /* renamed from: c, reason: collision with root package name */
    private int f513c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        w0 w0VarT = w0.t(context, attributeSet, f511d, i2, 0);
        if (w0VarT.q(0)) {
            setBackgroundDrawable(w0VarT.f(0));
        }
        if (w0VarT.q(1)) {
            setDivider(w0VarT.f(1));
        }
        w0VarT.u();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(g gVar) {
        return this.f512b.L(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void c(e eVar) {
        this.f512b = eVar;
    }

    public int getWindowAnimations() {
        return this.f513c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        b((g) getAdapter().getItem(i2));
    }
}
