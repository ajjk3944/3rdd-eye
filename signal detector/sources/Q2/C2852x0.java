package q2;

import a.AbstractC0241a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j2.C2545a;
import j2.C2556l;

/* renamed from: q2.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2852x0 extends N2.a {
    public static final Parcelable.Creator<C2852x0> CREATOR = new C2819g0(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f23273a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23274b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23275c;

    /* renamed from: d, reason: collision with root package name */
    public C2852x0 f23276d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f23277e;

    public C2852x0(int i, String str, String str2, C2852x0 c2852x0, IBinder iBinder) {
        this.f23273a = i;
        this.f23274b = str;
        this.f23275c = str2;
        this.f23276d = c2852x0;
        this.f23277e = iBinder;
    }

    public final C2545a a() {
        C2852x0 c2852x0 = this.f23276d;
        C2545a c2545a = null;
        if (c2852x0 != null) {
            String str = c2852x0.f23275c;
            c2545a = new C2545a(c2852x0.f23273a, c2852x0.f23274b, str, null);
        }
        return new C2545a(this.f23273a, this.f23274b, this.f23275c, c2545a);
    }

    public final C2556l b() {
        C2545a c2545a;
        InterfaceC2854y0 c2850w0;
        C2852x0 c2852x0 = this.f23276d;
        if (c2852x0 == null) {
            c2545a = null;
        } else {
            c2545a = new C2545a(c2852x0.f23273a, c2852x0.f23274b, c2852x0.f23275c, null);
        }
        IBinder iBinder = this.f23277e;
        if (iBinder == null) {
            c2850w0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c2850w0 = iInterfaceQueryLocalInterface instanceof InterfaceC2854y0 ? (InterfaceC2854y0) iInterfaceQueryLocalInterface : new C2850w0(iBinder);
        }
        return new C2556l(this.f23273a, this.f23274b, this.f23275c, c2545a, c2850w0 != null ? new j2.q(c2850w0) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.B(parcel, 1, 4);
        parcel.writeInt(this.f23273a);
        AbstractC0241a.u(parcel, 2, this.f23274b);
        AbstractC0241a.u(parcel, 3, this.f23275c);
        AbstractC0241a.t(parcel, 4, this.f23276d, i);
        AbstractC0241a.s(parcel, 5, this.f23277e);
        AbstractC0241a.H(parcel, iE);
    }
}
