package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xu extends qb.a {
    public static final Parcelable.Creator<xu> CREATOR = new ci(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f18498a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18499b;

    public xu(String str, int i4) {
        this.f18498a = str;
        this.f18499b = i4;
    }

    public static xu a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new xu(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj;
        return pb.y.l(this.f18498a, xuVar.f18498a) && pb.y.l(Integer.valueOf(this.f18499b), Integer.valueOf(xuVar.f18499b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18498a, Integer.valueOf(this.f18499b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 2, this.f18498a);
        com.bumptech.glide.f.N(parcel, 3, 4);
        parcel.writeInt(this.f18499b);
        com.bumptech.glide.f.P(parcel, iO);
    }
}
