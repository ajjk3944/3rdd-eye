package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ms0 {
    public static ArrayList a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qq0(context, new ns0()));
        du1 du1VarA = ew1.a.a().a(context);
        if (du1VarA != null && !du1VarA.k0()) {
            arrayList.add(se0.a(context));
            arrayList.add(pf0.a(context));
        }
        return arrayList;
    }
}
