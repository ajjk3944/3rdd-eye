package com.yandex.mobile.ads.impl;

import c9.C2077A;
import com.yandex.mobile.ads.impl.ip1;

/* loaded from: classes3.dex */
public final class fk0 {

    /* renamed from: a, reason: collision with root package name */
    private final gk0 f27356a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27357b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27358c;

    public fk0(gk0 impressionReporter) {
        kotlin.jvm.internal.l.f(impressionReporter, "impressionReporter");
        this.f27356a = impressionReporter;
    }

    public final void a() {
        this.f27357b = false;
        this.f27358c = false;
    }

    public final void b() {
        if (this.f27357b) {
            return;
        }
        this.f27357b = true;
        this.f27356a.a(ip1.b.f28825x);
    }

    public final void c() {
        if (this.f27358c) {
            return;
        }
        this.f27358c = true;
        this.f27356a.a(ip1.b.f28826y, C2077A.m(new b9.l("failure_tracked", Boolean.FALSE)));
    }
}
