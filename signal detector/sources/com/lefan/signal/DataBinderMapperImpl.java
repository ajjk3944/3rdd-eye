package com.lefan.signal;

import H4.a;
import K4.q;
import Y.b;
import Y.h;
import android.util.SparseIntArray;
import android.view.View;
import com.apm.insight.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends b {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f18803a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        f18803a = sparseIntArray;
        sparseIntArray.put(R.layout.item_title_value, 1);
    }

    @Override // Y.b
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // Y.b
    public final h b(int i, View view) {
        int i3 = f18803a.get(i);
        if (i3 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i3 != 1) {
            return null;
        }
        if ("layout/item_title_value_0".equals(tag)) {
            return new q(view);
        }
        throw new IllegalArgumentException("The tag for item_title_value is invalid. Received: " + tag);
    }

    @Override // Y.b
    public final int c(String str) {
        Integer num;
        if (str == null || (num = (Integer) a.f1801a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
