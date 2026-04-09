package r3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class B extends AbstractC8026a {
    public static final Parcelable.Creator<B> CREATOR = new C();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f60054a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60055b;

    /* renamed from: c, reason: collision with root package name */
    private final int f60056c;

    /* renamed from: d, reason: collision with root package name */
    private final int f60057d;

    B(boolean z10, String str, int i10, int i11) {
        this.f60054a = z10;
        this.f60055b = str;
        this.f60056c = I.a(i10) - 1;
        this.f60057d = o.a(i11) - 1;
    }

    public final String b() {
        return this.f60055b;
    }

    public final boolean e() {
        return this.f60054a;
    }

    public final int f() {
        return o.a(this.f60057d);
    }

    public final int g() {
        return I.a(this.f60056c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.c(parcel, 1, this.f60054a);
        t3.b.q(parcel, 2, this.f60055b, false);
        t3.b.k(parcel, 3, this.f60056c);
        t3.b.k(parcel, 4, this.f60057d);
        t3.b.b(parcel, iA);
    }
}
