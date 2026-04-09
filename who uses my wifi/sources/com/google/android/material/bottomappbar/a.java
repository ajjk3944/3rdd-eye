package com.google.android.material.bottomappbar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.yj;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {
    public final /* synthetic */ BottomAppBar.Behavior a;

    public a(BottomAppBar.Behavior behavior) {
        this.a = behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BottomAppBar.Behavior behavior = this.a;
        Rect rect = behavior.m;
        BottomAppBar bottomAppBar = (BottomAppBar) behavior.n.get();
        if (bottomAppBar != null) {
            int i9 = bottomAppBar.j0;
            if (view instanceof FloatingActionButton) {
                view.getHeight();
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.f(rect);
                int iHeight = rect.height();
                bottomAppBar.I(iHeight);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().e.a(new RectF(rect)));
                yj yjVar = (yj) view.getLayoutParams();
                if (behavior.o == 0) {
                    if (bottomAppBar.i0 == 1) {
                        ((ViewGroup.MarginLayoutParams) yjVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - iHeight) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) yjVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) yjVar).rightMargin = bottomAppBar.getRightInset();
                    if (view.getLayoutDirection() == 1) {
                        ((ViewGroup.MarginLayoutParams) yjVar).leftMargin += i9;
                    } else {
                        ((ViewGroup.MarginLayoutParams) yjVar).rightMargin += i9;
                    }
                }
                int i10 = BottomAppBar.z0;
                bottomAppBar.H();
                return;
            }
        }
        view.removeOnLayoutChangeListener(this);
    }
}
