package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.Ge, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520Ge extends N2.a {
    public static final Parcelable.Creator<C0520Ge> CREATOR = new C1784r8(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f8406a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8407b;

    public C0520Ge(String str, int i) {
        this.f8406a = str;
        this.f8407b = i;
    }

    public static C0520Ge a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C0520Ge(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0520Ge)) {
            return false;
        }
        C0520Ge c0520Ge = (C0520Ge) obj;
        return M2.u.g(this.f8406a, c0520Ge.f8406a) && M2.u.g(Integer.valueOf(this.f8407b), Integer.valueOf(c0520Ge.f8407b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8406a, Integer.valueOf(this.f8407b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 2, this.f8406a);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f8407b);
        AbstractC0241a.H(parcel, iE);
    }
}
