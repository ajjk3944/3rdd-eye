package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4564dg implements InterfaceC4804mo {
    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new C4752ko(this, true, "");
        }
        return new C4752ko(this, false, "Invalid quantity value " + num);
    }
}
