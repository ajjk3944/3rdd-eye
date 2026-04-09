package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class a0 implements K {

    /* renamed from: a, reason: collision with root package name */
    private final M f30825a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30826b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f30827c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30828d;

    a0(M m10, String str, Object[] objArr) {
        this.f30825a = m10;
        this.f30826b = str;
        this.f30827c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f30828d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f30828d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public boolean a() {
        return (this.f30828d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public M b() {
        return this.f30825a;
    }

    Object[] c() {
        return this.f30827c;
    }

    String d() {
        return this.f30826b;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public X getSyntax() {
        return (this.f30828d & 1) == 1 ? X.PROTO2 : X.PROTO3;
    }
}
