package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
abstract class q extends Fragment {

    /* renamed from: t1, reason: collision with root package name */
    protected final LinkedHashSet f37464t1 = new LinkedHashSet();

    q() {
    }

    boolean D1(p pVar) {
        return this.f37464t1.add(pVar);
    }

    void E1() {
        this.f37464t1.clear();
    }
}
