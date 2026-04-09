package ec;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t extends qb.a implements Iterable {
    public static final Parcelable.Creator<t> CREATOR = new androidx.recyclerview.widget.i0(15);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f23067a;

    public t(Bundle bundle) {
        this.f23067a = bundle;
    }

    public final Object a(String str) {
        return this.f23067a.get(str);
    }

    public final Double c() {
        return Double.valueOf(this.f23067a.getDouble("value"));
    }

    public final String d() {
        return this.f23067a.getString(AppLovinEventParameters.REVENUE_CURRENCY);
    }

    public final Bundle f() {
        return new Bundle(this.f23067a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s(this);
    }

    public final String toString() {
        return this.f23067a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.D(parcel, 2, f());
        com.bumptech.glide.f.P(parcel, iO);
    }
}
