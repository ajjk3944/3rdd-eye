package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4479v5 implements InterfaceC4348f5 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4366h5 f35505a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35506b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f35507c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35508d;

    C4479v5(InterfaceC4366h5 interfaceC4366h5, String str, Object[] objArr) {
        this.f35505a = interfaceC4366h5;
        this.f35506b = str;
        this.f35507c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f35508d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f35508d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    final String a() {
        return this.f35506b;
    }

    final Object[] b() {
        return this.f35507c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4348f5
    public final InterfaceC4366h5 zza() {
        return this.f35505a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4348f5
    public final EnumC4447r5 zzb() {
        int i10 = this.f35508d;
        return (i10 & 1) != 0 ? EnumC4447r5.PROTO2 : (i10 & 4) == 4 ? EnumC4447r5.EDITIONS : EnumC4447r5.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4348f5
    public final boolean zzc() {
        return (this.f35508d & 2) == 2;
    }
}
