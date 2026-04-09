package s3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import r3.C7564b;
import s3.InterfaceC7895j;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class K extends AbstractC8026a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* renamed from: a, reason: collision with root package name */
    final int f61187a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f61188b;

    /* renamed from: c, reason: collision with root package name */
    private final C7564b f61189c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f61190d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f61191e;

    K(int i10, IBinder iBinder, C7564b c7564b, boolean z10, boolean z11) {
        this.f61187a = i10;
        this.f61188b = iBinder;
        this.f61189c = c7564b;
        this.f61190d = z10;
        this.f61191e = z11;
    }

    public final C7564b b() {
        return this.f61189c;
    }

    public final InterfaceC7895j e() {
        IBinder iBinder = this.f61188b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC7895j.a.c(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        return this.f61189c.equals(k10.f61189c) && AbstractC7900o.a(e(), k10.e());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, this.f61187a);
        t3.b.j(parcel, 2, this.f61188b, false);
        t3.b.p(parcel, 3, this.f61189c, i10, false);
        t3.b.c(parcel, 4, this.f61190d);
        t3.b.c(parcel, 5, this.f61191e);
        t3.b.b(parcel, iA);
    }
}
