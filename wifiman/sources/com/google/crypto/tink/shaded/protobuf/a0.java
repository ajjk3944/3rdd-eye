package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
final class a0 implements K {

    /* renamed from: a, reason: collision with root package name */
    private final M f38481a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38482b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f38483c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38484d;

    a0(M m10, String str, Object[] objArr) {
        this.f38481a = m10;
        this.f38482b = str;
        this.f38483c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f38484d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f38484d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public boolean a() {
        return (this.f38484d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public M b() {
        return this.f38481a;
    }

    Object[] c() {
        return this.f38483c;
    }

    String d() {
        return this.f38482b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.K
    public X getSyntax() {
        return (this.f38484d & 1) == 1 ? X.PROTO2 : X.PROTO3;
    }
}
