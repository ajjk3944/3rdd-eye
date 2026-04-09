package s3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* renamed from: s3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7899n extends AbstractC8026a {
    public static final Parcelable.Creator<C7899n> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final int f61320a;

    /* renamed from: b, reason: collision with root package name */
    private final int f61321b;

    /* renamed from: c, reason: collision with root package name */
    private final int f61322c;

    /* renamed from: d, reason: collision with root package name */
    private final long f61323d;

    /* renamed from: e, reason: collision with root package name */
    private final long f61324e;

    /* renamed from: f, reason: collision with root package name */
    private final String f61325f;

    /* renamed from: g, reason: collision with root package name */
    private final String f61326g;

    /* renamed from: h, reason: collision with root package name */
    private final int f61327h;

    /* renamed from: i, reason: collision with root package name */
    private final int f61328i;

    public C7899n(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f61320a = i10;
        this.f61321b = i11;
        this.f61322c = i12;
        this.f61323d = j10;
        this.f61324e = j11;
        this.f61325f = str;
        this.f61326g = str2;
        this.f61327h = i13;
        this.f61328i = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f61320a;
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, i11);
        t3.b.k(parcel, 2, this.f61321b);
        t3.b.k(parcel, 3, this.f61322c);
        t3.b.n(parcel, 4, this.f61323d);
        t3.b.n(parcel, 5, this.f61324e);
        t3.b.q(parcel, 6, this.f61325f, false);
        t3.b.q(parcel, 7, this.f61326g, false);
        t3.b.k(parcel, 8, this.f61327h);
        t3.b.k(parcel, 9, this.f61328i);
        t3.b.b(parcel, iA);
    }
}
