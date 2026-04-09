package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class MF {

    /* renamed from: a, reason: collision with root package name */
    public final String f9853a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f9854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9855c;

    public MF(int i, Class cls, String str) {
        this.f9853a = str;
        this.f9854b = cls;
        this.f9855c = i;
    }

    public final Object a(QK qk) throws GeneralSecurityException {
        return ((C1469lG) YF.f12621b.f12622a.get()).a(ZF.f12810b.e(C1631oG.a(this.f9853a, qk, this.f9855c, EnumC1956uI.RAW, null)), this.f9854b);
    }
}
