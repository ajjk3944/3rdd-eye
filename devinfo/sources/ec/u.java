package ec;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends qb.a {
    public static final Parcelable.Creator<u> CREATOR = new androidx.recyclerview.widget.i0(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f23085a;

    /* renamed from: b, reason: collision with root package name */
    public final t f23086b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23087c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23088d;

    public u(u uVar, long j) {
        pb.y.h(uVar);
        this.f23085a = uVar.f23085a;
        this.f23086b = uVar.f23086b;
        this.f23087c = uVar.f23087c;
        this.f23088d = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23086b);
        String str = this.f23087c;
        int length = String.valueOf(str).length();
        String str2 = this.f23085a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        je.u.B(sb2, "origin=", str, ",name=", str2);
        return d.h.w(sb2, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        androidx.recyclerview.widget.i0.a(this, parcel, i4);
    }

    public u(String str, t tVar, String str2, long j) {
        this.f23085a = str;
        this.f23086b = tVar;
        this.f23087c = str2;
        this.f23088d = j;
    }
}
