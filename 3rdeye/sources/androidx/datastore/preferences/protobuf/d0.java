package androidx.datastore.preferences.protobuf;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes.dex */
public final class d0 implements N {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1744w f15590a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15591b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f15592c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15593d;

    public d0(AbstractC1744w abstractC1744w, String str, Object[] objArr) {
        this.f15590a = abstractC1744w;
        this.f15591b = str;
        this.f15592c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f15593d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f15593d = i | (cCharAt2 << i11);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final P getDefaultInstance() {
        return this.f15590a;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final a0 getSyntax() {
        return (this.f15593d & 1) == 1 ? a0.PROTO2 : a0.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final boolean isMessageSetWireFormat() {
        return (this.f15593d & 2) == 2;
    }
}
