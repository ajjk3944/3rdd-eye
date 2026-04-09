package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class i20 implements ak {

    /* renamed from: a, reason: collision with root package name */
    private final String f28444a;

    /* renamed from: b, reason: collision with root package name */
    private final w20 f28445b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f28446c;

    public i20(String actionType, w20 design, ArrayList trackingUrls) {
        kotlin.jvm.internal.l.f(actionType, "actionType");
        kotlin.jvm.internal.l.f(design, "design");
        kotlin.jvm.internal.l.f(trackingUrls, "trackingUrls");
        this.f28444a = actionType;
        this.f28445b = design;
        this.f28446c = trackingUrls;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4200t
    public final String a() {
        return this.f28444a;
    }

    @Override // com.yandex.mobile.ads.impl.ak
    public final List<String> b() {
        return this.f28446c;
    }

    public final w20 c() {
        return this.f28445b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i20)) {
            return false;
        }
        i20 i20Var = (i20) obj;
        return kotlin.jvm.internal.l.b(this.f28444a, i20Var.f28444a) && kotlin.jvm.internal.l.b(this.f28445b, i20Var.f28445b) && kotlin.jvm.internal.l.b(this.f28446c, i20Var.f28446c);
    }

    public final int hashCode() {
        return this.f28446c.hashCode() + ((this.f28445b.hashCode() + (this.f28444a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.f28444a;
        w20 w20Var = this.f28445b;
        List<String> list = this.f28446c;
        StringBuilder sb = new StringBuilder("DivKitAdtuneAction(actionType=");
        sb.append(str);
        sb.append(", design=");
        sb.append(w20Var);
        sb.append(", trackingUrls=");
        return C1094a9.h(sb, list, ")");
    }
}
