package com.chad.library.adapter.base.viewholder;

import Y.c;
import Y.h;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import q5.i;

/* loaded from: classes.dex */
public class BaseDataBindingHolder<BD extends h> extends BaseViewHolder {
    private final BD dataBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDataBindingHolder(View view) {
        super(view);
        i.e(view, "view");
        DataBinderMapperImpl dataBinderMapperImpl = c.f4195a;
        BD bd = (BD) h.d(view);
        if (bd == null) {
            Object tag = view.getTag();
            if (!(tag instanceof String)) {
                throw new IllegalArgumentException("View is not a binding layout");
            }
            DataBinderMapperImpl dataBinderMapperImpl2 = c.f4195a;
            int iC = dataBinderMapperImpl2.c((String) tag);
            if (iC == 0) {
                throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
            }
            bd = (BD) dataBinderMapperImpl2.b(iC, view);
        }
        this.dataBinding = bd;
    }

    public final BD getDataBinding() {
        return this.dataBinding;
    }
}
