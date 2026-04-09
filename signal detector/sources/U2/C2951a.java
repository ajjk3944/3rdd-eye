package u2;

import a.AbstractC0241a;
import android.os.Parcel;
import android.os.Parcelable;
import g3.C2333b;
import o4.AbstractC2763b;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2951a extends N2.a {
    public static final Parcelable.Creator<C2951a> CREATOR = new C2333b(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f23784a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23785b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23786c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23787d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23788e;

    public C2951a(String str, int i, int i3, boolean z6, boolean z7) {
        this.f23784a = str;
        this.f23785b = i;
        this.f23786c = i3;
        this.f23787d = z6;
        this.f23788e = z7;
    }

    public static C2951a a() {
        return new C2951a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.u(parcel, 2, this.f23784a);
        AbstractC0241a.B(parcel, 3, 4);
        parcel.writeInt(this.f23785b);
        AbstractC0241a.B(parcel, 4, 4);
        parcel.writeInt(this.f23786c);
        AbstractC0241a.B(parcel, 5, 4);
        parcel.writeInt(this.f23787d ? 1 : 0);
        AbstractC0241a.B(parcel, 6, 4);
        parcel.writeInt(this.f23788e ? 1 : 0);
        AbstractC0241a.H(parcel, iE);
    }

    public C2951a(int i, int i3, boolean z6) {
        this(i, i3, 0, z6, false);
    }

    public C2951a(int i, int i3, int i6, boolean z6, boolean z7) {
        String str;
        if (z6) {
            str = "0";
        } else {
            str = "1";
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + length + 13 + 2);
        AbstractC2763b.h(sb, "afma-sdk-a-v", i, ".", i3);
        this(A.f.p(sb, ".", str), i, i3, z6, z7);
    }
}
