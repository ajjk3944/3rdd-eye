package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class it1 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f28863a;

    public it1(bm0 instreamAdPlaylist) {
        kotlin.jvm.internal.l.f(instreamAdPlaylist, "instreamAdPlaylist");
        this.f28863a = a(instreamAdPlaylist);
    }

    private static ArrayList a(bm0 bm0Var) {
        ArrayList arrayList = new ArrayList();
        zs zsVarC = bm0Var.c();
        if (zsVarC != null) {
            arrayList.add(new yi1(zsVarC, 0L));
        }
        arrayList.addAll(bm0Var.a());
        return arrayList;
    }

    public final ArrayList a() {
        return this.f28863a;
    }
}
