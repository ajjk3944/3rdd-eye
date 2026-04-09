package s3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public class r extends AbstractC8026a {
    public static final Parcelable.Creator<r> CREATOR = new W();

    /* renamed from: a, reason: collision with root package name */
    private final int f61340a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61341b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f61342c;

    /* renamed from: d, reason: collision with root package name */
    private final int f61343d;

    /* renamed from: e, reason: collision with root package name */
    private final int f61344e;

    public r(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f61340a = i10;
        this.f61341b = z10;
        this.f61342c = z11;
        this.f61343d = i11;
        this.f61344e = i12;
    }

    public int b() {
        return this.f61343d;
    }

    public int e() {
        return this.f61344e;
    }

    public boolean f() {
        return this.f61341b;
    }

    public boolean g() {
        return this.f61342c;
    }

    public int i() {
        return this.f61340a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, i());
        t3.b.c(parcel, 2, f());
        t3.b.c(parcel, 3, g());
        t3.b.k(parcel, 4, b());
        t3.b.k(parcel, 5, e());
        t3.b.b(parcel, iA);
    }
}
