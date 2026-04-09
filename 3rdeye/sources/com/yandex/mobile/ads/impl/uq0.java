package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class uq0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final at1<V> f34178a;

    public /* synthetic */ uq0() {
        this(new at1());
    }

    public final V a(ViewGroup container, sq0<V> layoutDesign) {
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(layoutDesign, "layoutDesign");
        Context context = container.getContext();
        int iC = layoutDesign.c();
        Class<V> clsD = layoutDesign.d();
        at1<V> at1Var = this.f34178a;
        kotlin.jvm.internal.l.c(context);
        at1Var.getClass();
        return (V) at1.a(context, clsD, iC, container);
    }

    public uq0(at1<V> safeLayoutInflater) {
        kotlin.jvm.internal.l.f(safeLayoutInflater, "safeLayoutInflater");
        this.f34178a = safeLayoutInflater;
    }
}
