package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class td2 implements uo {

    /* renamed from: a, reason: collision with root package name */
    private final ob1 f33558a;

    /* renamed from: b, reason: collision with root package name */
    private final nu f33559b;

    public td2(ob1 nativeVideoView, nu nuVar) {
        kotlin.jvm.internal.l.f(nativeVideoView, "nativeVideoView");
        this.f33558a = nativeVideoView;
        this.f33559b = nuVar;
    }

    @Override // com.yandex.mobile.ads.impl.uo
    @SuppressLint({"ClickableViewAccessibility"})
    public final void a(ir0 link, wo clickListenerCreator) {
        kotlin.jvm.internal.l.f(link, "link");
        kotlin.jvm.internal.l.f(clickListenerCreator, "clickListenerCreator");
        Context context = this.f33558a.getContext();
        sd2 sd2Var = new sd2(link, clickListenerCreator, this.f33559b);
        kotlin.jvm.internal.l.c(context);
        no noVar = new no(context, sd2Var);
        ob1 ob1Var = this.f33558a;
        ob1Var.setOnTouchListener(noVar);
        ob1Var.setOnClickListener(noVar);
        ImageView imageViewA = this.f33558a.b().a();
        if (imageViewA != null) {
            imageViewA.setOnTouchListener(noVar);
            imageViewA.setOnClickListener(noVar);
        }
    }
}
