package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.widget.z0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements d.b, i, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f664c = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public d f665a;

    /* renamed from: b, reason: collision with root package name */
    public int f666b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(d dVar) {
        this.f665a = dVar;
    }

    @Override // androidx.appcompat.view.menu.d.b
    public boolean b(f fVar) {
        return this.f665a.O(fVar, 0);
    }

    public int getWindowAnimations() {
        return this.f666b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b((f) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        z0 z0VarV = z0.v(context, attributeSet, f664c, i10, 0);
        if (z0VarV.s(0)) {
            setBackgroundDrawable(z0VarV.g(0));
        }
        if (z0VarV.s(1)) {
            setDivider(z0VarV.g(1));
        }
        z0VarV.x();
    }
}
