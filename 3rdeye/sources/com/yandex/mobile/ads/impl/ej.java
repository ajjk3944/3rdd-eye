package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

/* loaded from: classes3.dex */
public final class ej<T extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26873a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f26874b;

    /* renamed from: c, reason: collision with root package name */
    private final wq0<T> f26875c;

    /* renamed from: d, reason: collision with root package name */
    private final uq0<T> f26876d;

    /* renamed from: e, reason: collision with root package name */
    private final dj<T> f26877e;

    public /* synthetic */ ej(Context context, ViewGroup viewGroup, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, viewGroup, list, onPreDrawListener, new wq0(list), new uq0(), new dj(onPreDrawListener));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(vy1 vy1Var) {
        ViewGroup viewGroupA;
        sq0<V> sq0VarA = this.f26875c.a(this.f26873a);
        if (sq0VarA == 0 || (viewGroupA = this.f26876d.a(this.f26874b, sq0VarA)) == null) {
            return false;
        }
        this.f26877e.a(this.f26874b, viewGroupA, sq0VarA, vy1Var);
        return true;
    }

    public final void a() {
        this.f26877e.a();
    }

    public ej(Context context, ViewGroup container, List<sq0<T>> designs, ViewTreeObserver.OnPreDrawListener preDrawListener, wq0<T> layoutDesignProvider, uq0<T> layoutDesignCreator, dj<T> layoutDesignBinder) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(designs, "designs");
        kotlin.jvm.internal.l.f(preDrawListener, "preDrawListener");
        kotlin.jvm.internal.l.f(layoutDesignProvider, "layoutDesignProvider");
        kotlin.jvm.internal.l.f(layoutDesignCreator, "layoutDesignCreator");
        kotlin.jvm.internal.l.f(layoutDesignBinder, "layoutDesignBinder");
        this.f26873a = context;
        this.f26874b = container;
        this.f26875c = layoutDesignProvider;
        this.f26876d = layoutDesignCreator;
        this.f26877e = layoutDesignBinder;
    }
}
