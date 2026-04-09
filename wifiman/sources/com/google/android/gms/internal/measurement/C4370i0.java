package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4370i0 extends AbstractC4442r0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f35245c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35246d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC4458t0 f35247e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC4450s0 f35248f;

    @Override // com.google.android.gms.internal.measurement.AbstractC4442r0
    public final InterfaceC4352g0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4442r0
    public final InterfaceC4343f0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4442r0
    public final EnumC4458t0 c() {
        return this.f35247e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4442r0
    public final EnumC4450s0 d() {
        return this.f35248f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4442r0
    public final String e() {
        return this.f35245c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4442r0) {
            AbstractC4442r0 abstractC4442r0 = (AbstractC4442r0) obj;
            if (this.f35245c.equals(abstractC4442r0.e()) && this.f35246d == abstractC4442r0.f() && this.f35247e.equals(abstractC4442r0.c())) {
                abstractC4442r0.a();
                abstractC4442r0.b();
                if (this.f35248f.equals(abstractC4442r0.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4442r0
    public final boolean f() {
        return this.f35246d;
    }

    public final int hashCode() {
        return ((((((this.f35245c.hashCode() ^ 1000003) * 1000003) ^ (this.f35246d ? 1231 : 1237)) * 1000003) ^ this.f35247e.hashCode()) * 583896283) ^ this.f35248f.hashCode();
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f35245c + ", hasDifferentDmaOwner=" + this.f35246d + ", fileChecks=" + String.valueOf(this.f35247e) + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.f35248f) + "}";
    }

    private C4370i0(String str, boolean z10, EnumC4458t0 enumC4458t0, InterfaceC4352g0 interfaceC4352g0, InterfaceC4343f0 interfaceC4343f0, EnumC4450s0 enumC4450s0) {
        this.f35245c = str;
        this.f35246d = z10;
        this.f35247e = enumC4458t0;
        this.f35248f = enumC4450s0;
    }
}
