package r2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import g3.C2333b;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2876a extends N2.a {
    public static final Parcelable.Creator<C2876a> CREATOR = new C2333b(13);

    /* renamed from: a, reason: collision with root package name */
    public final String f23393a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23394b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23395c;

    public C2876a(String str, String str2, String str3) {
        this.f23393a = str;
        this.f23394b = str2;
        this.f23395c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f23393a);
        AbstractC0241a.u(parcel, 2, this.f23394b);
        AbstractC0241a.u(parcel, 3, this.f23395c);
        AbstractC0241a.H(parcel, iE);
    }
}
