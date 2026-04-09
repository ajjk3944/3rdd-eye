package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class Un extends AbstractC4539ch {
    public Un(C4940s5 c4940s5) {
        super(c4940s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        String strI = this.f40632a.f41601c.i();
        String str = c4683i6.f41051h;
        this.f40632a.f41601c.j(str).b();
        if (TextUtils.equals(strI, str)) {
            return false;
        }
        this.f40632a.a(C4681i4.o());
        return false;
    }
}
