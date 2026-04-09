package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944be extends N2.a {
    public static final Parcelable.Creator<C0944be> CREATOR = new C1784r8(9);

    /* renamed from: a, reason: collision with root package name */
    public final View f13395a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f13396b;

    public C0944be(IBinder iBinder, IBinder iBinder2) {
        this.f13395a = (View) S2.b.n1(S2.b.d1(iBinder));
        this.f13396b = (Map) S2.b.n1(S2.b.d1(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.s(parcel, 1, new S2.b(this.f13395a));
        AbstractC0241a.s(parcel, 2, new S2.b(this.f13396b));
        AbstractC0241a.H(parcel, iE);
    }
}
