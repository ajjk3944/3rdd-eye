package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class mf0 extends en1 {

    /* renamed from: e, reason: collision with root package name */
    public static final em.a<mf0> f30366e = new S1(4);

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30367c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30368d;

    public mf0() {
        this.f30367c = false;
        this.f30368d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static mf0 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new mf0(bundle.getBoolean(Integer.toString(2, 36), false)) : new mf0();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mf0)) {
            return false;
        }
        mf0 mf0Var = (mf0) obj;
        return this.f30368d == mf0Var.f30368d && this.f30367c == mf0Var.f30367c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f30367c), Boolean.valueOf(this.f30368d)});
    }

    public mf0(boolean z10) {
        this.f30367c = true;
        this.f30368d = z10;
    }
}
