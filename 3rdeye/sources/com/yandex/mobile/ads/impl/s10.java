package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.view.View;
import j6.q;
import z6.C5865d;

/* loaded from: classes3.dex */
public final class s10 implements j6.m {

    /* renamed from: a, reason: collision with root package name */
    private final j6.m[] f32836a;

    public s10(j6.m... divCustomViewAdapters) {
        kotlin.jvm.internal.l.f(divCustomViewAdapters, "divCustomViewAdapters");
        this.f32836a = divCustomViewAdapters;
    }

    @Override // j6.m
    public final void bindView(View view, N7.R3 div, C0675l divView, A7.d expressionResolver, C5865d path) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(path, "path");
    }

    @Override // j6.m
    public final View createView(N7.R3 div, C0675l divView, A7.d expressionResolver, C5865d path) {
        j6.m mVar;
        View viewCreateView;
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(divView, "divView");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        kotlin.jvm.internal.l.f(path, "path");
        j6.m[] mVarArr = this.f32836a;
        int length = mVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                mVar = null;
                break;
            }
            mVar = mVarArr[i];
            if (mVar.isCustomTypeSupported(div.f6132j)) {
                break;
            }
            i++;
        }
        return (mVar == null || (viewCreateView = mVar.createView(div, divView, expressionResolver, path)) == null) ? new View(divView.getContext()) : viewCreateView;
    }

    @Override // j6.m
    public final boolean isCustomTypeSupported(String type) {
        kotlin.jvm.internal.l.f(type, "type");
        for (j6.m mVar : this.f32836a) {
            if (mVar.isCustomTypeSupported(type)) {
                return true;
            }
        }
        return false;
    }

    @Override // j6.m
    public /* bridge */ /* synthetic */ q.c preload(N7.R3 r32, q.a aVar) {
        j6.l.c(r32, aVar);
        return q.c.a.f43053a;
    }

    @Override // j6.m
    public final void release(View view, N7.R3 div) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(div, "div");
    }
}
