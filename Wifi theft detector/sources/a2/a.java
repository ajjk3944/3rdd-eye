package a2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class a extends VersionedParcel {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f94d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f95e;

    /* renamed from: f, reason: collision with root package name */
    public final int f96f;

    /* renamed from: g, reason: collision with root package name */
    public final int f97g;

    /* renamed from: h, reason: collision with root package name */
    public final String f98h;

    /* renamed from: i, reason: collision with root package name */
    public int f99i;

    /* renamed from: j, reason: collision with root package name */
    public int f100j;

    /* renamed from: k, reason: collision with root package name */
    public int f101k;

    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new r.a(), new r.a(), new r.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f95e.writeInt(-1);
        } else {
            this.f95e.writeInt(bArr.length);
            this.f95e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f95e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i10) {
        this.f95e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f95e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f95e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f99i;
        if (i10 >= 0) {
            int i11 = this.f94d.get(i10);
            int iDataPosition = this.f95e.dataPosition();
            this.f95e.setDataPosition(i11);
            this.f95e.writeInt(iDataPosition - i11);
            this.f95e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel b() {
        Parcel parcel = this.f95e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f100j;
        if (i10 == this.f96f) {
            i10 = this.f97g;
        }
        return new a(parcel, iDataPosition, i10, this.f98h + "  ", this.f4247a, this.f4248b, this.f4249c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f95e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int i10 = this.f95e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f95e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f95e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i10) {
        while (this.f100j < this.f97g) {
            int i11 = this.f101k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f95e.setDataPosition(this.f100j);
            int i12 = this.f95e.readInt();
            this.f101k = this.f95e.readInt();
            this.f100j += i12;
        }
        return this.f101k == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f95e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable q() {
        return this.f95e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f95e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i10) {
        a();
        this.f99i = i10;
        this.f94d.put(i10, this.f95e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z10) {
        this.f95e.writeInt(z10 ? 1 : 0);
    }

    public a(Parcel parcel, int i10, int i11, String str, r.a aVar, r.a aVar2, r.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f94d = new SparseIntArray();
        this.f99i = -1;
        this.f101k = -1;
        this.f95e = parcel;
        this.f96f = i10;
        this.f97g = i11;
        this.f100j = i10;
        this.f98h = str;
    }
}
