package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4361h0 extends AbstractC4435q0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35234a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC4458t0 f35235b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC4450s0 f35236c;

    /* renamed from: d, reason: collision with root package name */
    private byte f35237d;

    C4361h0() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4435q0
    public final AbstractC4435q0 a(EnumC4450s0 enumC4450s0) {
        if (enumC4450s0 == null) {
            throw new NullPointerException("Null filePurpose");
        }
        this.f35236c = enumC4450s0;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4435q0
    final AbstractC4435q0 b(EnumC4458t0 enumC4458t0) {
        if (enumC4458t0 == null) {
            throw new NullPointerException("Null fileChecks");
        }
        this.f35235b = enumC4458t0;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4435q0
    public final AbstractC4435q0 c(boolean z10) {
        this.f35237d = (byte) (this.f35237d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4435q0
    public final AbstractC4442r0 d() {
        if (this.f35237d == 1 && this.f35234a != null && this.f35235b != null && this.f35236c != null) {
            return new C4370i0(this.f35234a, this.f35235b, this.f35236c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f35234a == null) {
            sb2.append(" fileOwner");
        }
        if ((1 & this.f35237d) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f35235b == null) {
            sb2.append(" fileChecks");
        }
        if (this.f35236c == null) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb2));
    }

    public final AbstractC4435q0 e(String str) {
        this.f35234a = str;
        return this;
    }
}
