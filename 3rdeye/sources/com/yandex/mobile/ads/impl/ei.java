package com.yandex.mobile.ads.impl;

import c9.C2079C;
import com.github.appintro.AppIntroBaseFragmentKt;
import d9.C4289g;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ei {
    public static Set a(kt nativeAdAssets) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        C4289g c4289g = new C4289g();
        if (nativeAdAssets.a() != null) {
            c4289g.add("age");
        }
        if (nativeAdAssets.b() != null) {
            c4289g.add("body");
        }
        if (nativeAdAssets.c() != null) {
            c4289g.add("call_to_action");
        }
        if (nativeAdAssets.d() != null) {
            c4289g.add("domain");
        }
        if (nativeAdAssets.e() != null) {
            c4289g.add("favicon");
        }
        if (nativeAdAssets.g() != null) {
            c4289g.add("icon");
        }
        if (nativeAdAssets.h() != null) {
            c4289g.add("media");
        }
        if (nativeAdAssets.i() != null) {
            c4289g.add("media");
        }
        if (nativeAdAssets.j() != null) {
            c4289g.add("price");
        }
        if (nativeAdAssets.k() != null) {
            c4289g.add("rating");
        }
        if (nativeAdAssets.l() != null) {
            c4289g.add("review_count");
        }
        if (nativeAdAssets.m() != null) {
            c4289g.add("sponsored");
        }
        if (nativeAdAssets.n() != null) {
            c4289g.add(AppIntroBaseFragmentKt.ARG_TITLE);
        }
        if (nativeAdAssets.o() != null) {
            c4289g.add("warning");
        }
        if (nativeAdAssets.f()) {
            c4289g.add("feedback");
        }
        return C2079C.a(c4289g);
    }
}
