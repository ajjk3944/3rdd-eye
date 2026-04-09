package N3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class h extends AbstractC8026a implements com.google.android.gms.common.api.g {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    private final List f14890a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14891b;

    public h(List list, String str) {
        this.f14890a = list;
        this.f14891b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f14890a;
        int iA = t3.b.a(parcel);
        t3.b.r(parcel, 1, list, false);
        t3.b.q(parcel, 2, this.f14891b, false);
        t3.b.b(parcel, iA);
    }
}
