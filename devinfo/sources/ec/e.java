package ec;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends qb.a {
    public static final Parcelable.Creator<e> CREATOR = new androidx.recyclerview.widget.i0(13);

    /* renamed from: a, reason: collision with root package name */
    public String f22688a;

    /* renamed from: b, reason: collision with root package name */
    public String f22689b;

    /* renamed from: c, reason: collision with root package name */
    public i4 f22690c;

    /* renamed from: d, reason: collision with root package name */
    public long f22691d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22692e;

    /* renamed from: f, reason: collision with root package name */
    public String f22693f;
    public final u g;

    /* renamed from: h, reason: collision with root package name */
    public long f22694h;

    /* renamed from: i, reason: collision with root package name */
    public u f22695i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final u f22696k;

    public e(e eVar) {
        pb.y.h(eVar);
        this.f22688a = eVar.f22688a;
        this.f22689b = eVar.f22689b;
        this.f22690c = eVar.f22690c;
        this.f22691d = eVar.f22691d;
        this.f22692e = eVar.f22692e;
        this.f22693f = eVar.f22693f;
        this.g = eVar.g;
        this.f22694h = eVar.f22694h;
        this.f22695i = eVar.f22695i;
        this.j = eVar.j;
        this.f22696k = eVar.f22696k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.I(parcel, 2, this.f22688a);
        com.bumptech.glide.f.I(parcel, 3, this.f22689b);
        com.bumptech.glide.f.H(parcel, 4, this.f22690c, i4);
        long j = this.f22691d;
        com.bumptech.glide.f.N(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z3 = this.f22692e;
        com.bumptech.glide.f.N(parcel, 6, 4);
        parcel.writeInt(z3 ? 1 : 0);
        com.bumptech.glide.f.I(parcel, 7, this.f22693f);
        com.bumptech.glide.f.H(parcel, 8, this.g, i4);
        long j8 = this.f22694h;
        com.bumptech.glide.f.N(parcel, 9, 8);
        parcel.writeLong(j8);
        com.bumptech.glide.f.H(parcel, 10, this.f22695i, i4);
        com.bumptech.glide.f.N(parcel, 11, 8);
        parcel.writeLong(this.j);
        com.bumptech.glide.f.H(parcel, 12, this.f22696k, i4);
        com.bumptech.glide.f.P(parcel, iO);
    }

    public e(String str, String str2, i4 i4Var, long j, boolean z3, String str3, u uVar, long j8, u uVar2, long j9, u uVar3) {
        this.f22688a = str;
        this.f22689b = str2;
        this.f22690c = i4Var;
        this.f22691d = j;
        this.f22692e = z3;
        this.f22693f = str3;
        this.g = uVar;
        this.f22694h = j8;
        this.f22695i = uVar2;
        this.j = j9;
        this.f22696k = uVar3;
    }
}
