package xa;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends qb.a {
    public static final Parcelable.Creator<e> CREATOR = new j4.g(27);

    /* renamed from: a, reason: collision with root package name */
    public final String f37031a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37032b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37033c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37034d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37035e;

    /* renamed from: f, reason: collision with root package name */
    public final String f37036f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f37037h;

    /* renamed from: i, reason: collision with root package name */
    public final a f37038i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f37039k;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z3, Bundle bundle) {
        this.f37031a = str;
        this.f37032b = str2;
        this.f37033c = str3;
        this.f37034d = str4;
        this.f37035e = str5;
        this.f37036f = str6;
        this.g = str7;
        this.f37037h = intent;
        this.f37038i = (a) vb.b.U0(vb.b.r0(iBinder));
        this.j = z3;
        this.f37039k = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 2, this.f37031a);
        com.bumptech.glide.f.I(parcel, 3, this.f37032b);
        com.bumptech.glide.f.I(parcel, 4, this.f37033c);
        com.bumptech.glide.f.I(parcel, 5, this.f37034d);
        com.bumptech.glide.f.I(parcel, 6, this.f37035e);
        com.bumptech.glide.f.I(parcel, 7, this.f37036f);
        com.bumptech.glide.f.I(parcel, 8, this.g);
        com.bumptech.glide.f.H(parcel, 9, this.f37037h, i4);
        com.bumptech.glide.f.F(parcel, 10, new vb.b(this.f37038i));
        com.bumptech.glide.f.N(parcel, 11, 4);
        parcel.writeInt(this.j ? 1 : 0);
        com.bumptech.glide.f.D(parcel, 12, this.f37039k);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public e(Intent intent, a aVar) {
        this(null, null, null, null, null, null, null, intent, new vb.b(aVar), false, new Bundle());
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new vb.b(aVar), false, new Bundle());
    }
}
