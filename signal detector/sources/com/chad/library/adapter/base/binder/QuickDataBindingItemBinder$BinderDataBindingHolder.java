package com.chad.library.adapter.base.binder;

import Y.h;
import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import q5.i;

/* loaded from: classes.dex */
public final class QuickDataBindingItemBinder$BinderDataBindingHolder<DB extends h> extends BaseViewHolder {

    /* renamed from: b, reason: collision with root package name */
    public final h f6835b;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickDataBindingItemBinder$BinderDataBindingHolder(DB db) {
        i.e(db, "dataBinding");
        View view = db.f4212e;
        i.d(view, "dataBinding.root");
        super(view);
        this.f6835b = db;
    }
}
