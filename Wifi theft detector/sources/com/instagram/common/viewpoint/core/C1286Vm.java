package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1286Vm {
    public final AdErrorType A00;
    public final String A01;

    public C1286Vm(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public C1286Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C1286Vm A00(AdErrorType adErrorType) {
        return new C1286Vm(adErrorType, (String) null);
    }

    public static C1286Vm A01(AdErrorType adErrorType, String str) {
        return new C1286Vm(adErrorType, str);
    }

    public static C1286Vm A02(C1287Vn c1287Vn) {
        return new C1286Vm(c1287Vn.A00(), c1287Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
