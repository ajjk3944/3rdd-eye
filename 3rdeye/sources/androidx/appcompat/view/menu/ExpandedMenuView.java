package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.f;
import o.X;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements f.b, k, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f14357c = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    public f f14358b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        X xE = X.e(context, attributeSet, f14357c, R.attr.listViewStyle);
        TypedArray typedArray = xE.f44608b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(xE.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(xE.b(1));
        }
        xE.f();
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(h hVar) {
        return this.f14358b.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void f(f fVar) {
        this.f14358b = fVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        a((h) getAdapter().getItem(i));
    }
}
