package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d9.C4284b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class of1 {
    public static ArrayList a(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        ArrayList arrayList = new ArrayList();
        int i = jh2.f29145b;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        View view2 = view;
        while (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int iIndexOfChild = viewGroup.indexOfChild(view2) + 1; iIndexOfChild < childCount; iIndexOfChild++) {
                View childAt = viewGroup.getChildAt(iIndexOfChild);
                kotlin.jvm.internal.l.c(childAt);
                arrayList.addAll(b(childAt));
            }
            ViewParent parent2 = viewGroup.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            view2 = viewGroup;
            viewGroup = viewGroup2;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (view.getZ() <= ((View) next).getZ()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    private static List b(View view) {
        C4284b c4284bU = E.u.u();
        if (!jh2.d(view)) {
            if (!(view instanceof ViewGroup) || jh2.e(view)) {
                c4284bU.add(view);
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                C4284b c4284bU2 = E.u.u();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    kotlin.jvm.internal.l.c(childAt);
                    c4284bU2.addAll(b(childAt));
                }
                c4284bU.addAll(E.u.m(c4284bU2));
            }
        }
        return E.u.m(c4284bU);
    }
}
