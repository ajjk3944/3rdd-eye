package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import n.InterfaceC2676j;
import n.MenuC2677k;
import n.m;
import n.y;
import o.a1;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC2676j, y, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4770b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC2677k f4771a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        a1 a1VarI = a1.i(context, attributeSet, f4770b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(a1VarI.d(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(a1VarI.d(1));
        }
        a1VarI.j();
    }

    @Override // n.y
    public final void b(MenuC2677k menuC2677k) {
        this.f4771a = menuC2677k;
    }

    @Override // n.InterfaceC2676j
    public final boolean c(m mVar) {
        return this.f4771a.q(mVar, null, 0);
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j6) {
        c((m) getAdapter().getItem(i));
    }
}
