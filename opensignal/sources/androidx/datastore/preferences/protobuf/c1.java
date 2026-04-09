package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1255a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1256b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1257c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1258d;

    public c1(a0 a0Var, String str, Object[] objArr) {
        this.f1255a = a0Var;
        this.f1256b = str;
        this.f1257c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f1258d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f1258d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public final z0 a() {
        int i10 = this.f1258d;
        return (i10 & 1) != 0 ? z0.PROTO2 : (i10 & 4) == 4 ? z0.EDITIONS : z0.PROTO3;
    }
}
