package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class xq0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35386a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f35387b;

    /* renamed from: c, reason: collision with root package name */
    private final wq0<V> f35388c;

    /* renamed from: d, reason: collision with root package name */
    private final uq0<V> f35389d;

    /* renamed from: e, reason: collision with root package name */
    private final tq0<V> f35390e;

    public xq0(Context context, ViewGroup container, ArrayList designs, wq0 layoutDesignProvider, uq0 layoutDesignCreator, tq0 layoutDesignBinder) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(designs, "designs");
        kotlin.jvm.internal.l.f(layoutDesignProvider, "layoutDesignProvider");
        kotlin.jvm.internal.l.f(layoutDesignCreator, "layoutDesignCreator");
        kotlin.jvm.internal.l.f(layoutDesignBinder, "layoutDesignBinder");
        this.f35386a = context;
        this.f35387b = container;
        this.f35388c = layoutDesignProvider;
        this.f35389d = layoutDesignCreator;
        this.f35390e = layoutDesignBinder;
    }

    public final boolean a() {
        ViewGroup viewGroupA;
        sq0<V> sq0VarA = this.f35388c.a(this.f35386a);
        if (sq0VarA == null || (viewGroupA = this.f35389d.a(this.f35387b, sq0VarA)) == null) {
            return false;
        }
        this.f35390e.a(this.f35387b, viewGroupA, sq0VarA);
        return true;
    }

    public final void b() {
        this.f35390e.a(this.f35387b);
    }
}
