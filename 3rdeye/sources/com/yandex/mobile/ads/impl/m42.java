package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m42 extends en1 {

    /* renamed from: e, reason: collision with root package name */
    public static final em.a<m42> f30204e = new L2(3);

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30205c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30206d;

    public m42() {
        this.f30205c = false;
        this.f30206d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m42 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new m42(bundle.getBoolean(Integer.toString(2, 36), false)) : new m42();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m42)) {
            return false;
        }
        m42 m42Var = (m42) obj;
        return this.f30206d == m42Var.f30206d && this.f30205c == m42Var.f30205c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f30205c), Boolean.valueOf(this.f30206d)});
    }

    public m42(boolean z10) {
        this.f30205c = true;
        this.f30206d = z10;
    }
}
