package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4442r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC4442r0 f35442a;

    /* renamed from: b, reason: collision with root package name */
    static final AbstractC4442r0 f35443b;

    static {
        AbstractC4435q0 abstractC4435q0B = new C4361h0().e("").c(false).b(EnumC4458t0.ALL_CHECKS);
        EnumC4450s0 enumC4450s0 = EnumC4450s0.READ_AND_WRITE;
        f35442a = abstractC4435q0B.a(enumC4450s0).d();
        f35443b = new C4361h0().e("").c(false).b(EnumC4458t0.NO_CHECKS).a(enumC4450s0).d();
        new C4361h0().e("").c(false).b(EnumC4458t0.SKIP_COMPLIANCE_CHECK).a(enumC4450s0).d();
    }

    public abstract InterfaceC4352g0 a();

    public abstract InterfaceC4343f0 b();

    public abstract EnumC4458t0 c();

    public abstract EnumC4450s0 d();

    public abstract String e();

    public abstract boolean f();
}
