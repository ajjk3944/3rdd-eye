package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class cb implements ak {

    /* renamed from: a, reason: collision with root package name */
    private final String f25584a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25585b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25586c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f25587d;

    public cb(String actionType, String adtuneUrl, String optOutUrl, ArrayList trackingUrls) {
        kotlin.jvm.internal.l.f(actionType, "actionType");
        kotlin.jvm.internal.l.f(adtuneUrl, "adtuneUrl");
        kotlin.jvm.internal.l.f(optOutUrl, "optOutUrl");
        kotlin.jvm.internal.l.f(trackingUrls, "trackingUrls");
        this.f25584a = actionType;
        this.f25585b = adtuneUrl;
        this.f25586c = optOutUrl;
        this.f25587d = trackingUrls;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4200t
    public final String a() {
        return this.f25584a;
    }

    @Override // com.yandex.mobile.ads.impl.ak
    public final List<String> b() {
        return this.f25587d;
    }

    public final String c() {
        return this.f25585b;
    }

    public final String d() {
        return this.f25586c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return kotlin.jvm.internal.l.b(this.f25584a, cbVar.f25584a) && kotlin.jvm.internal.l.b(this.f25585b, cbVar.f25585b) && kotlin.jvm.internal.l.b(this.f25586c, cbVar.f25586c) && kotlin.jvm.internal.l.b(this.f25587d, cbVar.f25587d);
    }

    public final int hashCode() {
        return this.f25587d.hashCode() + C4121h3.a(this.f25586c, C4121h3.a(this.f25585b, this.f25584a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f25584a;
        String str2 = this.f25585b;
        String str3 = this.f25586c;
        List<String> list = this.f25587d;
        StringBuilder sbD = j6.l.d("AdtuneAction(actionType=", str, ", adtuneUrl=", str2, ", optOutUrl=");
        sbD.append(str3);
        sbD.append(", trackingUrls=");
        sbD.append(list);
        sbD.append(")");
        return sbD.toString();
    }
}
