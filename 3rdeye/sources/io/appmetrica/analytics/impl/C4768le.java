package io.appmetrica.analytics.impl;

import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.le, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4768le implements InterfaceC4804mo {

    /* renamed from: a, reason: collision with root package name */
    public final String f41188a;

    public C4768le(String str) {
        this.f41188a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(Collection<Object> collection) {
        return AbstractC4623fo.a((Collection) collection) ? new C4752ko(this, false, B4.f.c(new StringBuilder(), this.f41188a, " is null or empty.")) : new C4752ko(this, true, "");
    }
}
