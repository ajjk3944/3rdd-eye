package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import o.C7010a;

/* loaded from: classes.dex */
class a extends VersionedParcel {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f32630d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f32631e;

    /* renamed from: f, reason: collision with root package name */
    private final int f32632f;

    /* renamed from: g, reason: collision with root package name */
    private final int f32633g;

    /* renamed from: h, reason: collision with root package name */
    private final String f32634h;

    /* renamed from: i, reason: collision with root package name */
    private int f32635i;

    /* renamed from: j, reason: collision with root package name */
    private int f32636j;

    /* renamed from: k, reason: collision with root package name */
    private int f32637k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C7010a(), new C7010a(), new C7010a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f32631e.writeInt(-1);
        } else {
            this.f32631e.writeInt(bArr.length);
            this.f32631e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f32631e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i10) {
        this.f32631e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f32631e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f32631e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f32635i;
        if (i10 >= 0) {
            int i11 = this.f32630d.get(i10);
            int iDataPosition = this.f32631e.dataPosition();
            this.f32631e.setDataPosition(i11);
            this.f32631e.writeInt(iDataPosition - i11);
            this.f32631e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f32631e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f32636j;
        if (i10 == this.f32632f) {
            i10 = this.f32633g;
        }
        return new a(parcel, iDataPosition, i10, this.f32634h + "  ", this.f32627a, this.f32628b, this.f32629c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f32631e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int i10 = this.f32631e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f32631e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f32631e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i10) {
        while (this.f32636j < this.f32633g) {
            int i11 = this.f32637k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f32631e.setDataPosition(this.f32636j);
            int i12 = this.f32631e.readInt();
            this.f32637k = this.f32631e.readInt();
            this.f32636j += i12;
        }
        return this.f32637k == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f32631e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable q() {
        return this.f32631e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f32631e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i10) {
        a();
        this.f32635i = i10;
        this.f32630d.put(i10, this.f32631e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z10) {
        this.f32631e.writeInt(z10 ? 1 : 0);
    }

    private a(Parcel parcel, int i10, int i11, String str, C7010a c7010a, C7010a c7010a2, C7010a c7010a3) {
        super(c7010a, c7010a2, c7010a3);
        this.f32630d = new SparseIntArray();
        this.f32635i = -1;
        this.f32637k = -1;
        this.f32631e = parcel;
        this.f32632f = i10;
        this.f32633g = i11;
        this.f32636j = i10;
        this.f32634h = str;
    }
}
