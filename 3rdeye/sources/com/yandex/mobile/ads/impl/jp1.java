package com.yandex.mobile.ads.impl;

import c9.C2100u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q9.InterfaceC5499a;
import q9.InterfaceC5502d;

/* loaded from: classes3.dex */
public final class jp1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f29261a;

    /* renamed from: b, reason: collision with root package name */
    private C4075b f29262b;

    public /* synthetic */ jp1(Map map, int i) {
        this((Map<String, ? extends Object>) ((i & 1) != 0 ? C2100u.f18582b : map), (C4075b) null);
    }

    public final C4075b a() {
        return this.f29262b;
    }

    public final Map<String, Object> b() {
        return this.f29261a;
    }

    public final void a(C4075b c4075b) {
        this.f29262b = c4075b;
    }

    public final void b(Object obj, String key) {
        kotlin.jvm.internal.l.f(key, "key");
        if (obj == null) {
            this.f29261a.put(key, "undefined");
        } else {
            this.f29261a.put(key, obj);
        }
    }

    public jp1(Map<String, ? extends Object> reportData, C4075b c4075b) {
        kotlin.jvm.internal.l.f(reportData, "reportData");
        if (!(reportData instanceof Map) || ((reportData instanceof InterfaceC5499a) && !(reportData instanceof InterfaceC5502d))) {
            reportData = null;
        }
        this.f29261a = reportData == null ? new LinkedHashMap<>() : reportData;
        this.f29262b = c4075b;
    }

    public final void a(Map<String, ? extends Object> data) {
        kotlin.jvm.internal.l.f(data, "data");
        this.f29261a.putAll(data);
    }

    public final void a(List list) {
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.f29261a.put("active_experiments", list);
    }

    public final void a(Object obj, String key) {
        kotlin.jvm.internal.l.f(key, "key");
        if (obj != null) {
            this.f29261a.put(key, obj);
        }
    }
}
