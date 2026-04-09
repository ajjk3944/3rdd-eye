package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import io.sentry.k;
import o.a0;
import o.l;
import o.m;
import o.o;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, a0, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f925d = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public m f926a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        k kVarH0 = k.h0(context, attributeSet, f925d, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(kVarH0.U(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(kVarH0.U(1));
        }
        kVarH0.l0();
    }

    @Override // o.a0
    public final void b(m mVar) {
        this.f926a = mVar;
    }

    @Override // o.l
    public final boolean c(o oVar) {
        return this.f926a.q(oVar, null, 0);
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
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        c((o) getAdapter().getItem(i10));
    }
}
