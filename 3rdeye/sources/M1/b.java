package M1;

import B4.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import m0.C5308a;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f4142d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f4143e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4144f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4145g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4146h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f4147j;

    /* renamed from: k, reason: collision with root package name */
    public int f4148k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C5308a(), new C5308a(), new C5308a());
    }

    @Override // M1.a
    public final b a() {
        Parcel parcel = this.f4143e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f4147j;
        if (i == this.f4144f) {
            i = this.f4145g;
        }
        return new b(parcel, iDataPosition, i, f.c(new StringBuilder(), this.f4146h, "  "), this.f4139a, this.f4140b, this.f4141c);
    }

    @Override // M1.a
    public final boolean e() {
        return this.f4143e.readInt() != 0;
    }

    @Override // M1.a
    public final byte[] f() {
        Parcel parcel = this.f4143e;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // M1.a
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4143e);
    }

    @Override // M1.a
    public final boolean h(int i) {
        while (this.f4147j < this.f4145g) {
            int i10 = this.f4148k;
            if (i10 == i) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i11 = this.f4147j;
            Parcel parcel = this.f4143e;
            parcel.setDataPosition(i11);
            int i12 = parcel.readInt();
            this.f4148k = parcel.readInt();
            this.f4147j += i12;
        }
        return this.f4148k == i;
    }

    @Override // M1.a
    public final int i() {
        return this.f4143e.readInt();
    }

    @Override // M1.a
    public final <T extends Parcelable> T j() {
        return (T) this.f4143e.readParcelable(b.class.getClassLoader());
    }

    @Override // M1.a
    public final String k() {
        return this.f4143e.readString();
    }

    @Override // M1.a
    public final void m(int i) {
        u();
        this.i = i;
        this.f4142d.put(i, this.f4143e.dataPosition());
        q(0);
        q(i);
    }

    @Override // M1.a
    public final void n(boolean z10) {
        this.f4143e.writeInt(z10 ? 1 : 0);
    }

    @Override // M1.a
    public final void o(byte[] bArr) {
        Parcel parcel = this.f4143e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // M1.a
    public final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4143e, 0);
    }

    @Override // M1.a
    public final void q(int i) {
        this.f4143e.writeInt(i);
    }

    @Override // M1.a
    public final void r(Parcelable parcelable) {
        this.f4143e.writeParcelable(parcelable, 0);
    }

    @Override // M1.a
    public final void s(String str) {
        this.f4143e.writeString(str);
    }

    public final void u() {
        int i = this.i;
        if (i >= 0) {
            int i10 = this.f4142d.get(i);
            Parcel parcel = this.f4143e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i10);
            parcel.writeInt(iDataPosition - i10);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public b(Parcel parcel, int i, int i10, String str, C5308a<String, Method> c5308a, C5308a<String, Method> c5308a2, C5308a<String, Class> c5308a3) {
        super(c5308a, c5308a2, c5308a3);
        this.f4142d = new SparseIntArray();
        this.i = -1;
        this.f4148k = -1;
        this.f4143e = parcel;
        this.f4144f = i;
        this.f4145g = i10;
        this.f4147j = i;
        this.f4146h = str;
    }
}
