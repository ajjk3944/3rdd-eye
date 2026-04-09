package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class q70 {

    /* renamed from: a, reason: collision with root package name */
    private final List<p70> f32089a;

    public /* synthetic */ q70(hb2 hb2Var) {
        this(hb2Var, hb2Var.a());
    }

    public final boolean a() {
        List<p70> list = this.f32089a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (p70 p70Var : list) {
            if (kotlin.jvm.internal.l.b(p70Var.a(), "ad_system") && kotlin.jvm.internal.l.b(p70Var.b(), "adfox")) {
                return true;
            }
        }
        return false;
    }

    public q70(hb2 videoAdExtensions, List<p70> extensions) {
        kotlin.jvm.internal.l.f(videoAdExtensions, "videoAdExtensions");
        kotlin.jvm.internal.l.f(extensions, "extensions");
        this.f32089a = extensions;
    }
}
