package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4606f7 implements Ug {
    @Override // io.appmetrica.analytics.impl.Ug
    public final String a(String str) {
        return androidx.work.s.d("/appmetrica/analytics/db/", str);
    }
}
