package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0893Uw {
    public final View A00;
    public final C1432ge A01;
    public final VA A02;
    public final String A03;
    public final HashMap<String, String> A04 = new HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public C0893Uw(C1432ge c1432ge, View view, String str, boolean z3, boolean z10) {
        this.A03 = str;
        this.A01 = c1432ge;
        this.A02 = c1432ge.A0A();
        this.A00 = view;
        this.A05 = z10;
        this.A06 = z3;
    }

    public final View A00() {
        return this.A00;
    }

    public final C1432ge A01() {
        return this.A01;
    }

    public final VA A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final Map<String, String> A04() {
        return Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
