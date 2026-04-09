package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4496x6 implements InterfaceC4504y6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35530a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4453s3 f35531b;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        b3E.d("measurement.collection.event_safelist", true);
        f35530a = b3E.d("measurement.service.store_null_safelist", true);
        f35531b = b3E.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4504y6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4504y6
    public final boolean zzb() {
        return ((Boolean) f35530a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4504y6
    public final boolean zzc() {
        return ((Boolean) f35531b.e()).booleanValue();
    }
}
