package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new u0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f5295a;

    /* renamed from: d, reason: collision with root package name */
    public final String f5296d;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f5297g;

    public zzdf(int i10, String str, Intent intent) {
        this.f5295a = i10;
        this.f5296d = str;
        this.f5297g = intent;
    }

    public static zzdf d(Activity activity) {
        return new zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.f5295a == zzdfVar.f5295a && Objects.equals(this.f5296d, zzdfVar.f5296d) && Objects.equals(this.f5297g, zzdfVar.f5297g);
    }

    public final int hashCode() {
        return this.f5295a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        i4.S(parcel, 1, 4);
        parcel.writeInt(this.f5295a);
        i4.P(parcel, 2, this.f5296d);
        i4.O(parcel, 3, this.f5297g, i10);
        i4.W(parcel, iU);
    }
}
