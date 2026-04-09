package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class py implements InterfaceC4200t {

    /* renamed from: a, reason: collision with root package name */
    private final String f31946a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31947b;

    /* renamed from: c, reason: collision with root package name */
    private final List<tj1> f31948c;

    public py(String actionType, String fallbackUrl, ArrayList preferredPackages) {
        kotlin.jvm.internal.l.f(actionType, "actionType");
        kotlin.jvm.internal.l.f(fallbackUrl, "fallbackUrl");
        kotlin.jvm.internal.l.f(preferredPackages, "preferredPackages");
        this.f31946a = actionType;
        this.f31947b = fallbackUrl;
        this.f31948c = preferredPackages;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4200t
    public final String a() {
        return this.f31946a;
    }

    public final String c() {
        return this.f31947b;
    }

    public final List<tj1> d() {
        return this.f31948c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py)) {
            return false;
        }
        py pyVar = (py) obj;
        return kotlin.jvm.internal.l.b(this.f31946a, pyVar.f31946a) && kotlin.jvm.internal.l.b(this.f31947b, pyVar.f31947b) && kotlin.jvm.internal.l.b(this.f31948c, pyVar.f31948c);
    }

    public final int hashCode() {
        return this.f31948c.hashCode() + C4121h3.a(this.f31947b, this.f31946a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f31946a;
        String str2 = this.f31947b;
        return C1094a9.h(j6.l.d("DeeplinkAction(actionType=", str, ", fallbackUrl=", str2, ", preferredPackages="), this.f31948c, ")");
    }
}
