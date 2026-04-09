package s2;

import a.AbstractC0241a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import g3.C2333b;

/* loaded from: classes.dex */
public final class e extends N2.a {
    public static final Parcelable.Creator<e> CREATOR = new C2333b(14);

    /* renamed from: a, reason: collision with root package name */
    public final String f23472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23473b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23474c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23475d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23476e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23477f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23478g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f23479h;
    public final InterfaceC2891a i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f23480j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f23481k;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z6, Bundle bundle) {
        this.f23472a = str;
        this.f23473b = str2;
        this.f23474c = str3;
        this.f23475d = str4;
        this.f23476e = str5;
        this.f23477f = str6;
        this.f23478g = str7;
        this.f23479h = intent;
        this.i = (InterfaceC2891a) S2.b.n1(S2.b.d1(iBinder));
        this.f23480j = z6;
        this.f23481k = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 2, this.f23472a);
        AbstractC0241a.u(parcel, 3, this.f23473b);
        AbstractC0241a.u(parcel, 4, this.f23474c);
        AbstractC0241a.u(parcel, 5, this.f23475d);
        AbstractC0241a.u(parcel, 6, this.f23476e);
        AbstractC0241a.u(parcel, 7, this.f23477f);
        AbstractC0241a.u(parcel, 8, this.f23478g);
        AbstractC0241a.t(parcel, 9, this.f23479h, i);
        AbstractC0241a.s(parcel, 10, new S2.b(this.i));
        AbstractC0241a.B(parcel, 11, 4);
        parcel.writeInt(this.f23480j ? 1 : 0);
        AbstractC0241a.q(parcel, 12, this.f23481k);
        AbstractC0241a.H(parcel, iE);
    }

    public e(Intent intent, InterfaceC2891a interfaceC2891a) {
        this(null, null, null, null, null, null, null, intent, new S2.b(interfaceC2891a), false, new Bundle());
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC2891a interfaceC2891a) {
        this(str, str2, str3, str4, str5, str6, str7, null, new S2.b(interfaceC2891a), false, new Bundle());
    }
}
