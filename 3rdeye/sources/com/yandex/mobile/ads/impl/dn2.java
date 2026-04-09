package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAdExtensions;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class dn2 implements VideoAdExtensions {

    /* renamed from: a, reason: collision with root package name */
    private final List<p70> f26277a;

    public dn2(List<p70> extensions) {
        kotlin.jvm.internal.l.f(extensions, "extensions");
        this.f26277a = extensions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dn2) && kotlin.jvm.internal.l.b(this.f26277a, ((dn2) obj).f26277a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAdExtensions
    public final String get(String type) {
        Object next;
        kotlin.jvm.internal.l.f(type, "type");
        Iterator<T> it = this.f26277a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.b(((p70) next).a(), type)) {
                break;
            }
        }
        p70 p70Var = (p70) next;
        if (p70Var != null) {
            return p70Var.b();
        }
        return null;
    }

    public final int hashCode() {
        return this.f26277a.hashCode();
    }

    public final String toString() {
        return "YandexVideoAdExtensions(extensions=" + this.f26277a + ")";
    }
}
