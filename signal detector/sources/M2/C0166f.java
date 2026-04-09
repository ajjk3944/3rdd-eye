package M2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: M2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166f extends N2.a {
    public static final Parcelable.Creator<C0166f> CREATOR = new A3.q(14);

    /* renamed from: a, reason: collision with root package name */
    public final l f2755a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2756b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2757c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2758d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2759e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2760f;

    public C0166f(l lVar, boolean z6, boolean z7, int[] iArr, int i, int[] iArr2) {
        this.f2755a = lVar;
        this.f2756b = z6;
        this.f2757c = z7;
        this.f2758d = iArr;
        this.f2759e = i;
        this.f2760f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.t(parcel, 1, this.f2755a, i);
        AbstractC0241a.B(parcel, 2, 4);
        parcel.writeInt(this.f2756b ? 1 : 0);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f2757c ? 1 : 0);
        int[] iArr = this.f2758d;
        if (iArr != null) {
            int iE2 = AbstractC0241a.E(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC0241a.H(parcel, iE2);
        }
        AbstractC0241a.B(parcel, 5, 4);
        parcel.writeInt(this.f2759e);
        int[] iArr2 = this.f2760f;
        if (iArr2 != null) {
            int iE3 = AbstractC0241a.E(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC0241a.H(parcel, iE3);
        }
        AbstractC0241a.H(parcel, iE);
    }
}
