package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1078b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1079c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1080d;

    public w0(w wVar, String str, Object[] objArr) {
        this.f1077a = wVar;
        this.f1078b = str;
        this.f1079c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f1080d = cCharAt;
            return;
        }
        int i4 = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f1080d = i4 | (cCharAt2 << i10);
                return;
            } else {
                i4 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i4 = this.f1080d;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }
}
