package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class W3 extends AbstractC4659h8 {
    @Override // io.appmetrica.analytics.impl.AbstractC4659h8
    public final boolean a(N3 n32, N3 n33) {
        if (AbstractC4623fo.a(n33.f39888a)) {
            return true;
        }
        if (AbstractC4623fo.a(n32.f39888a)) {
            return false;
        }
        EnumC4685i8 enumC4685i8 = n32.f39889b;
        if (enumC4685i8 == EnumC4685i8.f41060c) {
            if (((Number) this.f40993a.a(enumC4685i8)).intValue() >= ((Number) this.f40993a.a(n33.f39889b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f40993a.a(enumC4685i8)).intValue() > ((Number) this.f40993a.a(n33.f39889b)).intValue()) {
            return true;
        }
        return false;
    }
}
