package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import i0.f;
import o.a0;
import o.l;
import o.m;
import o.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, a0, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f678b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public m f679a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        f fVarJ = f.J(context, attributeSet, f678b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(fVarJ.A(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(fVarJ.A(1));
        }
        fVarJ.M();
    }

    @Override // o.a0
    public final void b(m mVar) {
        this.f679a = mVar;
    }

    @Override // o.l
    public final boolean c(o oVar) {
        return this.f679a.q(oVar, null, 0);
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
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        c((o) getAdapter().getItem(i4));
    }
}
