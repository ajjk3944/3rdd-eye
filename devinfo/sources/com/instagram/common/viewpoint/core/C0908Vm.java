package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0908Vm {
    public final AdErrorType A00;
    public final String A01;

    public C0908Vm(int i4, String str) {
        this(AdErrorType.adErrorTypeFromCode(i4), str);
    }

    public C0908Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C0908Vm A00(AdErrorType adErrorType) {
        return new C0908Vm(adErrorType, (String) null);
    }

    public static C0908Vm A01(AdErrorType adErrorType, String str) {
        return new C0908Vm(adErrorType, str);
    }

    public static C0908Vm A02(C0909Vn c0909Vn) {
        return new C0908Vm(c0909Vn.A00(), c0909Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
