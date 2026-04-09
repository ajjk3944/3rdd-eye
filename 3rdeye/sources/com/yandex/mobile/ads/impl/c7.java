package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class c7 {

    /* renamed from: a, reason: collision with root package name */
    private final v6 f25548a;

    /* renamed from: b, reason: collision with root package name */
    private final w6 f25549b;

    /* renamed from: c, reason: collision with root package name */
    private final a7 f25550c;

    public /* synthetic */ c7(int i) {
        this(new v6(), new w6(), new a7());
    }

    public final b7 a(Context context) {
        Object objA;
        kotlin.jvm.internal.l.f(context, "context");
        try {
            du1 du1VarA = ew1.a.a().a(context);
            n6 n6VarF = du1VarA != null ? du1VarA.f() : null;
            if (n6VarF == null || !n6VarF.e()) {
                fp0.a(new Object[0]);
                objA = new j6();
            } else {
                this.f25549b.getClass();
                AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfigurationA = w6.a(n6VarF);
                this.f25548a.getClass();
                AdQualityVerifierAdapter adQualityVerifierAdapterA = v6.a();
                if (adQualityVerifierAdapterA == null) {
                    fp0.a(new Object[0]);
                    objA = new j6();
                } else {
                    this.f25550c.getClass();
                    p6 p6VarA = a7.a(n6VarF);
                    long verificationTimeoutInSec = adQualityVerifierAdapterConfigurationA.getVerificationTimeoutInSec() + 1;
                    z6 z6Var = new z6(p6VarA);
                    t6 t6Var = new t6(p6VarA);
                    fp0.a(new Object[0]);
                    objA = new k6(adQualityVerifierAdapterA, adQualityVerifierAdapterConfigurationA, verificationTimeoutInSec, z6Var, t6Var);
                }
            }
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        Throwable thA = b9.m.a(objA);
        if (thA != null) {
            thA.getMessage();
            fp0.a(new Object[0]);
            objA = new j6();
        }
        return (b7) objA;
    }

    public c7(v6 verifierAdapterCreator, w6 verifierAdapterConfigurationFactory, a7 adQualityVerifierVerificationPolicyFactory) {
        kotlin.jvm.internal.l.f(verifierAdapterCreator, "verifierAdapterCreator");
        kotlin.jvm.internal.l.f(verifierAdapterConfigurationFactory, "verifierAdapterConfigurationFactory");
        kotlin.jvm.internal.l.f(adQualityVerifierVerificationPolicyFactory, "adQualityVerifierVerificationPolicyFactory");
        this.f25548a = verifierAdapterCreator;
        this.f25549b = verifierAdapterConfigurationFactory;
        this.f25550c = adQualityVerifierVerificationPolicyFactory;
    }
}
