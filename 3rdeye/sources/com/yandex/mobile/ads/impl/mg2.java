package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import b9.C2001h;
import b9.InterfaceC2000g;
import java.util.ArrayList;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class mg2 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2000g f30374a = C2001h.b(a.f30376b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30375b = 0;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<Handler> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30376b = new a();

        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final void a(ViewGroup viewGroup, boolean z10) {
        ((Handler) f30374a.getValue()).post(new Z.b(viewGroup, z10, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ViewGroup viewGroup, boolean z10) {
        int childCount;
        if (viewGroup == null || viewGroup.getChildCount() <= 0 || (childCount = viewGroup.getChildCount() - (!z10 ? 1 : 0)) <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof pk) {
                arrayList.add(childAt);
            }
        }
        viewGroup.removeViews(0, childCount);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((pk) arrayList.get(i10)).d();
        }
        arrayList.clear();
    }
}
