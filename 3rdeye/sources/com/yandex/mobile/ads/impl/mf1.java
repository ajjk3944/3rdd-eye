package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.yandex.mobile.ads.impl.ew1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class mf1 {

    /* renamed from: a, reason: collision with root package name */
    private final of1 f30369a;

    /* renamed from: b, reason: collision with root package name */
    private final nf1 f30370b;

    /* renamed from: c, reason: collision with root package name */
    private final lf1 f30371c;

    public /* synthetic */ mf1() {
        this(new of1(), new nf1(), new lf1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    public final int a(View view, Rect viewRect) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(viewRect, "viewRect");
        ew1 ew1VarA = ew1.a.a();
        Context context = view.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        du1 du1VarA = ew1VarA.a(context);
        if (du1VarA == null || !du1VarA.y0()) {
            return 0;
        }
        this.f30369a.getClass();
        ArrayList overlappingViews = of1.a(view);
        this.f30370b.getClass();
        kotlin.jvm.internal.l.f(overlappingViews, "overlappingViews");
        ArrayList arrayList = new ArrayList();
        Iterator it = overlappingViews.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            Rect rect = new Rect();
            if (view2.getGlobalVisibleRect(rect)) {
                arrayList.add(rect);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Rect rect2 = (Rect) it2.next();
            int i = rect2.left;
            int i10 = viewRect.left;
            int i11 = viewRect.right;
            if (i < i10) {
                i = i10;
            }
            if (i > i11) {
                i = i11;
            }
            rect2.left = i;
            int i12 = rect2.top;
            int i13 = viewRect.top;
            int i14 = viewRect.bottom;
            if (i12 < i13) {
                i12 = i13;
            }
            if (i12 > i14) {
                i12 = i14;
            }
            rect2.top = i12;
            int i15 = rect2.right;
            int i16 = viewRect.left;
            if (i15 < i16) {
                i15 = i16;
            }
            if (i15 <= i11) {
                i11 = i15;
            }
            rect2.right = i11;
            int i17 = rect2.bottom;
            int i18 = viewRect.top;
            if (i17 < i18) {
                i17 = i18;
            }
            if (i17 <= i14) {
                i14 = i17;
            }
            rect2.bottom = i14;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            Rect rect3 = (Rect) next;
            if (rect3.width() > 0 && rect3.height() > 0) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        ArrayList arrayListSubList = arrayList2;
        if (size > 100) {
            arrayListSubList = arrayList2.subList(0, 100);
        }
        this.f30371c.getClass();
        return lf1.a(viewRect, arrayListSubList);
    }

    public mf1(of1 overlappingViewsProvider, nf1 overlappingRectsProvider, lf1 overlappingAreaEvaluator) {
        kotlin.jvm.internal.l.f(overlappingViewsProvider, "overlappingViewsProvider");
        kotlin.jvm.internal.l.f(overlappingRectsProvider, "overlappingRectsProvider");
        kotlin.jvm.internal.l.f(overlappingAreaEvaluator, "overlappingAreaEvaluator");
        this.f30369a = overlappingViewsProvider;
        this.f30370b = overlappingRectsProvider;
        this.f30371c = overlappingAreaEvaluator;
    }
}
