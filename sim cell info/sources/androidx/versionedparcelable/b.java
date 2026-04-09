package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f2338d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f2339e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2340f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2341g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2342h;

    /* renamed from: i, reason: collision with root package name */
    private int f2343i;

    /* renamed from: j, reason: collision with root package name */
    private int f2344j;

    /* renamed from: k, reason: collision with root package name */
    private int f2345k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new k.a(), new k.a(), new k.a());
    }

    private b(Parcel parcel, int i2, int i3, String str, k.a<String, Method> aVar, k.a<String, Method> aVar2, k.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2338d = new SparseIntArray();
        this.f2343i = -1;
        this.f2344j = 0;
        this.f2345k = -1;
        this.f2339e = parcel;
        this.f2340f = i2;
        this.f2341g = i3;
        this.f2344j = i2;
        this.f2342h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f2339e.writeInt(-1);
        } else {
            this.f2339e.writeInt(bArr.length);
            this.f2339e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2339e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i2) {
        this.f2339e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f2339e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f2339e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i2 = this.f2343i;
        if (i2 >= 0) {
            int i3 = this.f2338d.get(i2);
            int iDataPosition = this.f2339e.dataPosition();
            this.f2339e.setDataPosition(i3);
            this.f2339e.writeInt(iDataPosition - i3);
            this.f2339e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f2339e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f2344j;
        if (i2 == this.f2340f) {
            i2 = this.f2341g;
        }
        return new b(parcel, iDataPosition, i2, this.f2342h + "  ", this.f2335a, this.f2336b, this.f2337c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f2339e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i2 = this.f2339e.readInt();
        if (i2 < 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        this.f2339e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2339e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i2) {
        while (this.f2344j < this.f2341g) {
            int i3 = this.f2345k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f2339e.setDataPosition(this.f2344j);
            int i4 = this.f2339e.readInt();
            this.f2345k = this.f2339e.readInt();
            this.f2344j += i4;
        }
        return this.f2345k == i2;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f2339e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f2339e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f2339e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i2) {
        a();
        this.f2343i = i2;
        this.f2338d.put(i2, this.f2339e.dataPosition());
        E(0);
        E(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z2) {
        this.f2339e.writeInt(z2 ? 1 : 0);
    }
}
