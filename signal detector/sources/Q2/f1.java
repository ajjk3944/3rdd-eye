package q2;

import a.AbstractC0241a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f1 extends N2.a {
    public static final Parcelable.Creator<f1> CREATOR = new C2819g0(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f23209a;

    /* renamed from: b, reason: collision with root package name */
    public long f23210b;

    /* renamed from: c, reason: collision with root package name */
    public C2852x0 f23211c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f23212d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23213e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23214f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23215g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23216h;

    public f1(String str, long j6, C2852x0 c2852x0, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f23209a = str;
        this.f23210b = j6;
        this.f23211c = c2852x0;
        this.f23212d = bundle;
        this.f23213e = str2;
        this.f23214f = str3;
        this.f23215g = str4;
        this.f23216h = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 1, this.f23209a);
        long j6 = this.f23210b;
        AbstractC0241a.B(parcel, 2, 8);
        parcel.writeLong(j6);
        AbstractC0241a.t(parcel, 3, this.f23211c, i);
        AbstractC0241a.q(parcel, 4, this.f23212d);
        AbstractC0241a.u(parcel, 5, this.f23213e);
        AbstractC0241a.u(parcel, 6, this.f23214f);
        AbstractC0241a.u(parcel, 7, this.f23215g);
        AbstractC0241a.u(parcel, 8, this.f23216h);
        AbstractC0241a.H(parcel, iE);
    }
}
