package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5109yn implements InterfaceC4804mo {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4804mo f42151a;

    public C5109yn(InterfaceC4804mo interfaceC4804mo) {
        this.f42151a = interfaceC4804mo;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(Object obj) {
        C4752ko c4752koA = this.f42151a.a(obj);
        if (c4752koA.f41158a) {
            return c4752koA;
        }
        throw new ValidationException(c4752koA.f41159b);
    }

    public final InterfaceC4804mo a() {
        return this.f42151a;
    }
}
