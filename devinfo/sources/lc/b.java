package lc;

import android.os.Parcel;
import android.os.Parcelable;
import j4.g;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new g(5);
    public Integer A;
    public Integer B;
    public Integer C;
    public Boolean D;
    public Integer E;

    /* renamed from: a, reason: collision with root package name */
    public int f28663a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f28664b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f28665c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f28666d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f28667e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f28668f;
    public Integer g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f28669h;
    public String j;

    /* renamed from: n, reason: collision with root package name */
    public Locale f28674n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f28675o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f28676p;

    /* renamed from: q, reason: collision with root package name */
    public int f28677q;

    /* renamed from: r, reason: collision with root package name */
    public int f28678r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f28679s;

    /* renamed from: u, reason: collision with root package name */
    public Integer f28681u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f28682v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f28683w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f28684x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f28685y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f28686z;

    /* renamed from: i, reason: collision with root package name */
    public int f28670i = 255;

    /* renamed from: k, reason: collision with root package name */
    public int f28671k = -2;

    /* renamed from: l, reason: collision with root package name */
    public int f28672l = -2;

    /* renamed from: m, reason: collision with root package name */
    public int f28673m = -2;

    /* renamed from: t, reason: collision with root package name */
    public Boolean f28680t = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f28663a);
        parcel.writeSerializable(this.f28664b);
        parcel.writeSerializable(this.f28665c);
        parcel.writeSerializable(this.f28666d);
        parcel.writeSerializable(this.f28667e);
        parcel.writeSerializable(this.f28668f);
        parcel.writeSerializable(this.g);
        parcel.writeSerializable(this.f28669h);
        parcel.writeInt(this.f28670i);
        parcel.writeString(this.j);
        parcel.writeInt(this.f28671k);
        parcel.writeInt(this.f28672l);
        parcel.writeInt(this.f28673m);
        CharSequence charSequence = this.f28675o;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f28676p;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f28677q);
        parcel.writeSerializable(this.f28679s);
        parcel.writeSerializable(this.f28681u);
        parcel.writeSerializable(this.f28682v);
        parcel.writeSerializable(this.f28683w);
        parcel.writeSerializable(this.f28684x);
        parcel.writeSerializable(this.f28685y);
        parcel.writeSerializable(this.f28686z);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.f28680t);
        parcel.writeSerializable(this.f28674n);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.E);
    }
}
