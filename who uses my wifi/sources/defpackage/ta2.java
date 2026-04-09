package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ta2 extends l0 {
    public static final Parcelable.Creator<ta2> CREATOR = new p92(6);
    public final String f;
    public final int g;

    public ta2(String str, int i) {
        this.f = str;
        this.g = i;
    }

    public static ta2 a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new ta2(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ta2)) {
            return false;
        }
        ta2 ta2Var = (ta2) obj;
        return a30.c(this.f, ta2Var.f) && a30.c(Integer.valueOf(this.g), Integer.valueOf(ta2Var.g));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, Integer.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.D(parcel, 2, this.f);
        uk2.T(parcel, 3, 4);
        parcel.writeInt(this.g);
        uk2.O(parcel, I);
    }
}
