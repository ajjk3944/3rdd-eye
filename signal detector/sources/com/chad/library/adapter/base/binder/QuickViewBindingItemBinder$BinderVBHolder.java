package com.chad.library.adapter.base.binder;

import O0.a;
import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import q5.i;

/* loaded from: classes.dex */
public final class QuickViewBindingItemBinder$BinderVBHolder<VB extends a> extends BaseViewHolder {
    /* JADX WARN: Illegal instructions before constructor call */
    public QuickViewBindingItemBinder$BinderVBHolder(VB vb) {
        i.e(vb, "viewBinding");
        View root = vb.getRoot();
        i.d(root, "viewBinding.root");
        super(root);
    }
}
