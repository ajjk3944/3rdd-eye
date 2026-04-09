package C3;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class u extends AbstractC8026a {
    public static final Parcelable.Creator<u> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    private final int f2233a;

    /* renamed from: b, reason: collision with root package name */
    private final IBinder f2234b;

    /* renamed from: c, reason: collision with root package name */
    private final IBinder f2235c;

    /* renamed from: d, reason: collision with root package name */
    private final PendingIntent f2236d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2237e;

    u(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f2233a = i10;
        this.f2234b = iBinder;
        this.f2235c = iBinder2;
        this.f2236d = pendingIntent;
        this.f2237e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u b(P p10) {
        return new u(4, null, p10, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f2233a;
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, i11);
        t3.b.j(parcel, 2, this.f2234b, false);
        t3.b.j(parcel, 3, this.f2235c, false);
        t3.b.p(parcel, 4, this.f2236d, i10, false);
        t3.b.q(parcel, 6, this.f2237e, false);
        t3.b.b(parcel, iA);
    }
}
