package I3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class i extends AbstractC8026a {
    public static final Parcelable.Creator<i> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8577a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8578b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8579c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8580d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8581e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8582f;

    public i(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f8577a = z10;
        this.f8578b = z11;
        this.f8579c = z12;
        this.f8580d = z13;
        this.f8581e = z14;
        this.f8582f = z15;
    }

    public boolean b() {
        return this.f8582f;
    }

    public boolean e() {
        return this.f8579c;
    }

    public boolean f() {
        return this.f8580d;
    }

    public boolean g() {
        return this.f8577a;
    }

    public boolean i() {
        return this.f8581e;
    }

    public boolean j() {
        return this.f8578b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.c(parcel, 1, g());
        t3.b.c(parcel, 2, j());
        t3.b.c(parcel, 3, e());
        t3.b.c(parcel, 4, f());
        t3.b.c(parcel, 5, i());
        t3.b.c(parcel, 6, b());
        t3.b.b(parcel, iA);
    }
}
