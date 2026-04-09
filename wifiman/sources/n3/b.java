package N3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class b extends AbstractC8026a implements com.google.android.gms.common.api.g {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f14887a;

    /* renamed from: b, reason: collision with root package name */
    private int f14888b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f14889c;

    b(int i10, int i11, Intent intent) {
        this.f14887a = i10;
        this.f14888b = i11;
        this.f14889c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f14887a;
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, i11);
        t3.b.k(parcel, 2, this.f14888b);
        t3.b.p(parcel, 3, this.f14889c, i10, false);
        t3.b.b(parcel, iA);
    }
}
