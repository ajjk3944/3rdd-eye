package com.github.appintro.internal.viewpager;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.D;
import androidx.fragment.app.x;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: PagerAdapter.kt */
/* loaded from: classes.dex */
public final class PagerAdapter extends D {
    private final List<ComponentCallbacksC1759l> fragments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerAdapter(x fragmentManager, List<ComponentCallbacksC1759l> fragments) {
        super(fragmentManager, 1);
        l.f(fragmentManager, "fragmentManager");
        l.f(fragments, "fragments");
        this.fragments = fragments;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.fragments.size();
    }

    @Override // androidx.fragment.app.D
    public ComponentCallbacksC1759l getItem(int i) {
        return this.fragments.get(i);
    }

    @Override // androidx.fragment.app.D, androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup container, int i) {
        l.f(container, "container");
        Object objInstantiateItem = super.instantiateItem(container, i);
        l.e(objInstantiateItem, "super.instantiateItem(container, position)");
        this.fragments.set(i, (ComponentCallbacksC1759l) objInstantiateItem);
        return objInstantiateItem;
    }
}
