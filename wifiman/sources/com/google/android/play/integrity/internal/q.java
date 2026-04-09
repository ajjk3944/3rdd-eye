package com.google.android.play.integrity.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class q {
    public static final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", sVar.a());
            bundle.putLong("event_timestamp", sVar.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void b(int i10, List list) {
        list.add(s.c(i10, System.currentTimeMillis()));
    }
}
