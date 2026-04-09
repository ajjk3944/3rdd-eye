package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public abstract class s extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f10485a = new LinkedHashSet();

    public boolean f(r rVar) {
        return this.f10485a.add(rVar);
    }

    public void g() {
        this.f10485a.clear();
    }
}
