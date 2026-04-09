package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.fj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4618fj extends AbstractC4539ch {
    public C4618fj(C4940s5 c4940s5) {
        super(c4940s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        String str = c4683i6.f41051h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f40632a.f41601c.j(str).b();
        return false;
    }
}
