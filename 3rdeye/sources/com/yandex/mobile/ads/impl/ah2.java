package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ah2 {

    /* renamed from: a, reason: collision with root package name */
    private final zg2 f24675a;

    /* renamed from: b, reason: collision with root package name */
    private final ar0 f24676b;

    /* renamed from: c, reason: collision with root package name */
    private final hu0 f24677c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f24678d;

    public ah2(zg2 view, ar0 layoutParams, hu0 measured, Map<String, String> additionalInfo) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(layoutParams, "layoutParams");
        kotlin.jvm.internal.l.f(measured, "measured");
        kotlin.jvm.internal.l.f(additionalInfo, "additionalInfo");
        this.f24675a = view;
        this.f24676b = layoutParams;
        this.f24677c = measured;
        this.f24678d = additionalInfo;
    }

    public final Map<String, String> a() {
        return this.f24678d;
    }

    public final ar0 b() {
        return this.f24676b;
    }

    public final hu0 c() {
        return this.f24677c;
    }

    public final zg2 d() {
        return this.f24675a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah2)) {
            return false;
        }
        ah2 ah2Var = (ah2) obj;
        return kotlin.jvm.internal.l.b(this.f24675a, ah2Var.f24675a) && kotlin.jvm.internal.l.b(this.f24676b, ah2Var.f24676b) && kotlin.jvm.internal.l.b(this.f24677c, ah2Var.f24677c) && kotlin.jvm.internal.l.b(this.f24678d, ah2Var.f24678d);
    }

    public final int hashCode() {
        return this.f24678d.hashCode() + ((this.f24677c.hashCode() + ((this.f24676b.hashCode() + (this.f24675a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewSizeInfo(view=" + this.f24675a + ", layoutParams=" + this.f24676b + ", measured=" + this.f24677c + ", additionalInfo=" + this.f24678d + ")";
    }
}
