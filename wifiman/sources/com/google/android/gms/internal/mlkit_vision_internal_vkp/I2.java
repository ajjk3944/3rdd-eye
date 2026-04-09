package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
final class I2 implements InterfaceC4757w2 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4790z2 f35602a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35603b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f35604c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35605d;

    I2(InterfaceC4790z2 interfaceC4790z2, String str, Object[] objArr) {
        this.f35602a = interfaceC4790z2;
        this.f35603b = str;
        this.f35604c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f35605d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f35605d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    final String a() {
        return this.f35603b;
    }

    final Object[] b() {
        return this.f35604c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4757w2
    public final InterfaceC4790z2 zza() {
        return this.f35602a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4757w2
    public final boolean zzb() {
        return (this.f35605d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4757w2
    public final int zzc() {
        int i10 = this.f35605d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }
}
