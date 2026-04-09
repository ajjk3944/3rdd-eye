package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.he0;
import defpackage.nd0;
import defpackage.od0;
import defpackage.sd0;
import defpackage.xb4;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements nd0, he0, AdapterView.OnItemClickListener {
    public static final int[] g = {R.attr.background, R.attr.divider};
    public od0 f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        xb4 xb4VarR = xb4.r(context, attributeSet, g, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) xb4VarR.h;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(xb4VarR.m(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(xb4VarR.m(1));
        }
        xb4VarR.z();
    }

    @Override // defpackage.nd0
    public final boolean a(sd0 sd0Var) {
        return this.f.q(sd0Var, null, 0);
    }

    @Override // defpackage.he0
    public final void b(od0 od0Var) {
        this.f = od0Var;
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((sd0) getAdapter().getItem(i));
    }
}
