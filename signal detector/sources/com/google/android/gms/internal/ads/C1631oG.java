package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.oG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1631oG implements InterfaceC1846sG {

    /* renamed from: a, reason: collision with root package name */
    public final String f15922a;

    /* renamed from: b, reason: collision with root package name */
    public final C1313iK f15923b;

    /* renamed from: c, reason: collision with root package name */
    public final QK f15924c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15925d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1956uI f15926e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f15927f;

    public C1631oG(String str, C1313iK c1313iK, QK qk, int i, EnumC1956uI enumC1956uI, Integer num) {
        this.f15922a = str;
        this.f15923b = c1313iK;
        this.f15924c = qk;
        this.f15925d = i;
        this.f15926e = enumC1956uI;
        this.f15927f = num;
    }

    public static C1631oG a(String str, QK qk, int i, EnumC1956uI enumC1956uI, Integer num) throws GeneralSecurityException {
        if (enumC1956uI == EnumC1956uI.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C1631oG(str, AbstractC2062wG.b(str), qk, i, enumC1956uI, num);
    }
}
