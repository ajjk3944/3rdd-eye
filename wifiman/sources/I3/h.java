package I3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class h extends AbstractC8026a implements com.google.android.gms.common.api.g {
    public static final Parcelable.Creator<h> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    private final Status f8575a;

    /* renamed from: b, reason: collision with root package name */
    private final i f8576b;

    public h(Status status, i iVar) {
        this.f8575a = status;
        this.f8576b = iVar;
    }

    public i b() {
        return this.f8576b;
    }

    public Status e() {
        return this.f8575a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.p(parcel, 1, e(), i10, false);
        t3.b.p(parcel, 2, b(), i10, false);
        t3.b.b(parcel, iA);
    }
}
