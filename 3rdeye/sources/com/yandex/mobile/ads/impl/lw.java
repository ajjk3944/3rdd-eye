package com.yandex.mobile.ads.impl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.dy;

/* loaded from: classes3.dex */
public final class lw extends androidx.recyclerview.widget.v<dy, fy<dy>> {

    /* renamed from: a, reason: collision with root package name */
    private final ug2 f30112a;

    /* renamed from: b, reason: collision with root package name */
    private final ih2 f30113b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(p9.l<? super xx, C1992A> onAction, gx imageLoader, ug2 viewHolderMapper, ih2 viewTypeMapper) {
        super(new bx());
        kotlin.jvm.internal.l.f(onAction, "onAction");
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        kotlin.jvm.internal.l.f(viewHolderMapper, "viewHolderMapper");
        kotlin.jvm.internal.l.f(viewTypeMapper, "viewTypeMapper");
        this.f30112a = viewHolderMapper;
        this.f30113b = viewTypeMapper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        dy item = getItem(i);
        ih2 ih2Var = this.f30113b;
        kotlin.jvm.internal.l.c(item);
        ih2Var.getClass();
        if (item instanceof dy.c) {
            return R.layout.debug_panel_item_action_button;
        }
        if (item instanceof dy.h) {
            return R.layout.debug_panel_item_switch;
        }
        if (item instanceof dy.d) {
            return R.layout.debug_panel_item_divider;
        }
        if (item instanceof dy.e) {
            return R.layout.deubg_panel_item_header;
        }
        if (item instanceof dy.f) {
            return R.layout.deubg_panel_item_key_value;
        }
        if (item instanceof dy.g) {
            return R.layout.debug_panel_item_mediation_adapter;
        }
        if (item instanceof dy.b) {
            return R.layout.debug_panel_item_ad_units;
        }
        if (item instanceof dy.a) {
            return R.layout.debug_panel_item_ad_unit;
        }
        throw new b9.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        fy holder = (fy) f10;
        kotlin.jvm.internal.l.f(holder, "holder");
        dy item = getItem(i);
        kotlin.jvm.internal.l.c(item);
        holder.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.l.f(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(i, parent, false);
        ug2 ug2Var = this.f30112a;
        kotlin.jvm.internal.l.c(viewInflate);
        return ug2Var.a(viewInflate, i);
    }
}
