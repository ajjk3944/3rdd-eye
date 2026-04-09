package g3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: g3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2334c implements Parcelable {
    public static final Parcelable.Creator<C2334c> CREATOR = new C2333b(0);

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f20181C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f20182D;

    /* renamed from: E, reason: collision with root package name */
    public int f20183E;

    /* renamed from: F, reason: collision with root package name */
    public int f20184F;

    /* renamed from: G, reason: collision with root package name */
    public Integer f20185G;

    /* renamed from: I, reason: collision with root package name */
    public Integer f20187I;

    /* renamed from: J, reason: collision with root package name */
    public Integer f20188J;

    /* renamed from: K, reason: collision with root package name */
    public Integer f20189K;

    /* renamed from: L, reason: collision with root package name */
    public Integer f20190L;
    public Integer M;

    /* renamed from: N, reason: collision with root package name */
    public Integer f20191N;

    /* renamed from: O, reason: collision with root package name */
    public Integer f20192O;

    /* renamed from: P, reason: collision with root package name */
    public Integer f20193P;

    /* renamed from: Q, reason: collision with root package name */
    public Integer f20194Q;

    /* renamed from: R, reason: collision with root package name */
    public Boolean f20195R;

    /* renamed from: S, reason: collision with root package name */
    public Integer f20196S;

    /* renamed from: a, reason: collision with root package name */
    public int f20197a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f20198b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f20199c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f20200d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f20201e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f20202f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f20203g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f20204h;

    /* renamed from: j, reason: collision with root package name */
    public String f20205j;

    /* renamed from: n, reason: collision with root package name */
    public Locale f20209n;
    public int i = 255;

    /* renamed from: k, reason: collision with root package name */
    public int f20206k = -2;

    /* renamed from: l, reason: collision with root package name */
    public int f20207l = -2;

    /* renamed from: m, reason: collision with root package name */
    public int f20208m = -2;

    /* renamed from: H, reason: collision with root package name */
    public Boolean f20186H = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20197a);
        parcel.writeSerializable(this.f20198b);
        parcel.writeSerializable(this.f20199c);
        parcel.writeSerializable(this.f20200d);
        parcel.writeSerializable(this.f20201e);
        parcel.writeSerializable(this.f20202f);
        parcel.writeSerializable(this.f20203g);
        parcel.writeSerializable(this.f20204h);
        parcel.writeInt(this.i);
        parcel.writeString(this.f20205j);
        parcel.writeInt(this.f20206k);
        parcel.writeInt(this.f20207l);
        parcel.writeInt(this.f20208m);
        CharSequence charSequence = this.f20181C;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f20182D;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f20183E);
        parcel.writeSerializable(this.f20185G);
        parcel.writeSerializable(this.f20187I);
        parcel.writeSerializable(this.f20188J);
        parcel.writeSerializable(this.f20189K);
        parcel.writeSerializable(this.f20190L);
        parcel.writeSerializable(this.M);
        parcel.writeSerializable(this.f20191N);
        parcel.writeSerializable(this.f20194Q);
        parcel.writeSerializable(this.f20192O);
        parcel.writeSerializable(this.f20193P);
        parcel.writeSerializable(this.f20186H);
        parcel.writeSerializable(this.f20209n);
        parcel.writeSerializable(this.f20195R);
        parcel.writeSerializable(this.f20196S);
    }
}
