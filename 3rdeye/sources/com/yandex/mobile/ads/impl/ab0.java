package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
final class ab0 extends kotlin.jvm.internal.m implements p9.l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final ab0 f24600b = new ab0();

    public ab0() {
        super(1);
    }

    public static String a(Map.Entry it) {
        kotlin.jvm.internal.l.f(it, "it");
        return it.getKey() + "=" + it.getValue();
    }

    @Override // p9.l
    public final /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
        return a(entry);
    }
}
