package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Wc {

    /* renamed from: a, reason: collision with root package name */
    public final Map f40333a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f40334b;

    public Wc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f40333a.put(obj, obj2);
    }

    public Wc(HashMap map, Object obj) {
        this.f40333a = map;
        this.f40334b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f40333a.get(obj);
        return obj2 == null ? this.f40334b : obj2;
    }
}
