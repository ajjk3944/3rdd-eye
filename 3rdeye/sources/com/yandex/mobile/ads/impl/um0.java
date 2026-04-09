package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class um0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ag<?>> f34087a;

    /* JADX WARN: Multi-variable type inference failed */
    public um0(List<? extends ag<?>> list) {
        this.f34087a = list;
    }

    public final ag<?> a(String assetName) {
        kotlin.jvm.internal.l.f(assetName, "assetName");
        List<ag<?>> list = this.f34087a;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.l.b(((ag) next).b(), assetName)) {
                obj = next;
                break;
            }
        }
        return (ag) obj;
    }
}
