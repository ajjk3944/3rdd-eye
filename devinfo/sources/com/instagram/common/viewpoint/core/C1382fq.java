package com.instagram.common.viewpoint.core;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1382fq {
    public float A00;
    public EnumC0660Lr A01;
    public Map<String, String> A02;

    public C1382fq(EnumC0660Lr enumC0660Lr) {
        this(enumC0660Lr, 0.0f);
    }

    public C1382fq(EnumC0660Lr enumC0660Lr, float f10) {
        this(enumC0660Lr, f10, null);
    }

    public C1382fq(@Nullable EnumC0660Lr enumC0660Lr, float f10, Map<String, String> windowParams) {
        this.A01 = enumC0660Lr;
        this.A00 = f10;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC0660Lr A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC0660Lr.A0I;
    }
}
