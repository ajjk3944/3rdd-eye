package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4078b2 implements wf2 {

    /* renamed from: a, reason: collision with root package name */
    private final w8 f25061a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25062b;

    /* renamed from: c, reason: collision with root package name */
    private final n42 f25063c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f25064d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, List<String>> f25065e;

    /* renamed from: f, reason: collision with root package name */
    private C4092d2 f25066f;

    public C4078b2(w8 adSource, String str, n42 timeOffset, List breakTypes, ArrayList extensions, HashMap trackingEvents) {
        kotlin.jvm.internal.l.f(adSource, "adSource");
        kotlin.jvm.internal.l.f(timeOffset, "timeOffset");
        kotlin.jvm.internal.l.f(breakTypes, "breakTypes");
        kotlin.jvm.internal.l.f(extensions, "extensions");
        kotlin.jvm.internal.l.f(trackingEvents, "trackingEvents");
        this.f25061a = adSource;
        this.f25062b = str;
        this.f25063c = timeOffset;
        this.f25064d = breakTypes;
        this.f25065e = trackingEvents;
    }

    @Override // com.yandex.mobile.ads.impl.wf2
    public final Map<String, List<String>> a() {
        return this.f25065e;
    }

    public final w8 b() {
        return this.f25061a;
    }

    public final String c() {
        return this.f25062b;
    }

    public final List<String> d() {
        return this.f25064d;
    }

    public final C4092d2 e() {
        return this.f25066f;
    }

    public final n42 f() {
        return this.f25063c;
    }

    public final void a(C4092d2 c4092d2) {
        this.f25066f = c4092d2;
    }
}
