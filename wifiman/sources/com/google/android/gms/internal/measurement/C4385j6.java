package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4385j6 implements InterfaceC4358g6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35275a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        f35275a = b3E.d("measurement.chimera.parameter.service", false);
        b3E.b("measurement.id.chimera_parameter_service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4358g6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4358g6
    public final boolean zzb() {
        return ((Boolean) f35275a.e()).booleanValue();
    }
}
