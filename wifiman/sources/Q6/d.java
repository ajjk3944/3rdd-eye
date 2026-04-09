package Q6;

import I6.s;
import N6.p;
import android.bluetooth.BluetoothAdapter;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class d implements Parcelable, p {

    /* renamed from: a, reason: collision with root package name */
    private final String f19187a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19188b;

    /* renamed from: c, reason: collision with root package name */
    private final ParcelUuid f19189c;

    /* renamed from: d, reason: collision with root package name */
    private final ParcelUuid f19190d;

    /* renamed from: e, reason: collision with root package name */
    private final ParcelUuid f19191e;

    /* renamed from: f, reason: collision with root package name */
    private final ParcelUuid f19192f;

    /* renamed from: g, reason: collision with root package name */
    private final ParcelUuid f19193g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f19194h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f19195i;

    /* renamed from: j, reason: collision with root package name */
    private final int f19196j;

    /* renamed from: k, reason: collision with root package name */
    private final byte[] f19197k;

    /* renamed from: l, reason: collision with root package name */
    private final byte[] f19198l;

    /* renamed from: m, reason: collision with root package name */
    private static final d f19186m = new b().a();
    public static final Parcelable.Creator<d> CREATOR = new a();

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            b bVar = new b();
            if (parcel.readInt() == 1) {
                bVar.c(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                bVar.b(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                bVar.j(parcelUuid);
                if (parcel.readInt() == 1) {
                    bVar.k(parcelUuid, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                bVar.h(parcelUuid2);
                if (parcel.readInt() == 1) {
                    bVar.i(parcelUuid2, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid3 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        bVar.f(parcelUuid3, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        bVar.g(parcelUuid3, bArr, bArr2);
                    }
                }
            }
            int i10 = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    bVar.d(i10, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    bVar.e(i10, bArr3, bArr4);
                }
            }
            return bVar.a();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f19199a;

        /* renamed from: b, reason: collision with root package name */
        private String f19200b;

        /* renamed from: c, reason: collision with root package name */
        private ParcelUuid f19201c;

        /* renamed from: d, reason: collision with root package name */
        private ParcelUuid f19202d;

        /* renamed from: e, reason: collision with root package name */
        private ParcelUuid f19203e;

        /* renamed from: f, reason: collision with root package name */
        private ParcelUuid f19204f;

        /* renamed from: g, reason: collision with root package name */
        private ParcelUuid f19205g;

        /* renamed from: h, reason: collision with root package name */
        private byte[] f19206h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f19207i;

        /* renamed from: j, reason: collision with root package name */
        private int f19208j = -1;

        /* renamed from: k, reason: collision with root package name */
        private byte[] f19209k;

        /* renamed from: l, reason: collision with root package name */
        private byte[] f19210l;

        public d a() {
            return new d(this.f19199a, this.f19200b, this.f19201c, this.f19202d, this.f19203e, this.f19204f, this.f19205g, this.f19206h, this.f19207i, this.f19208j, this.f19209k, this.f19210l);
        }

        public b b(String str) {
            if (str == null || BluetoothAdapter.checkBluetoothAddress(str)) {
                this.f19200b = str;
                return this;
            }
            throw new IllegalArgumentException("invalid device address " + str);
        }

        public b c(String str) {
            this.f19199a = str;
            return this;
        }

        public b d(int i10, byte[] bArr) {
            if (bArr != null && i10 < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            this.f19208j = i10;
            this.f19209k = bArr;
            this.f19210l = null;
            return this;
        }

        public b e(int i10, byte[] bArr, byte[] bArr2) {
            if (bArr != null && i10 < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            byte[] bArr3 = this.f19210l;
            if (bArr3 != null) {
                byte[] bArr4 = this.f19209k;
                if (bArr4 == null) {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
                if (bArr4.length != bArr3.length) {
                    throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                }
            }
            this.f19208j = i10;
            this.f19209k = bArr;
            this.f19210l = bArr2;
            return this;
        }

        public b f(ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            this.f19205g = parcelUuid;
            this.f19206h = bArr;
            this.f19207i = null;
            return this;
        }

        public b g(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            byte[] bArr3 = this.f19207i;
            if (bArr3 != null) {
                byte[] bArr4 = this.f19206h;
                if (bArr4 == null) {
                    throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                }
                if (bArr4.length != bArr3.length) {
                    throw new IllegalArgumentException("size mismatch for service data and service data mask");
                }
            }
            this.f19205g = parcelUuid;
            this.f19206h = bArr;
            this.f19207i = bArr2;
            return this;
        }

        public b h(ParcelUuid parcelUuid) {
            this.f19203e = parcelUuid;
            this.f19204f = null;
            return this;
        }

        public b i(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (parcelUuid2 != null && parcelUuid == null) {
                throw new IllegalArgumentException("SolicitationUuid is null while SolicitationUuidMask is not null!");
            }
            this.f19203e = parcelUuid;
            this.f19204f = parcelUuid2;
            return this;
        }

        public b j(ParcelUuid parcelUuid) {
            this.f19201c = parcelUuid;
            this.f19202d = null;
            return this;
        }

        public b k(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (this.f19202d != null && this.f19201c == null) {
                throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            this.f19201c = parcelUuid;
            this.f19202d = parcelUuid2;
            return this;
        }
    }

    d(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, ParcelUuid parcelUuid4, ParcelUuid parcelUuid5, byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4) {
        this.f19187a = str;
        this.f19189c = parcelUuid;
        this.f19190d = parcelUuid2;
        this.f19191e = parcelUuid3;
        this.f19192f = parcelUuid4;
        this.f19188b = str2;
        this.f19193g = parcelUuid5;
        this.f19194h = bArr;
        this.f19195i = bArr2;
        this.f19196j = i10;
        this.f19197k = bArr3;
        this.f19198l = bArr4;
    }

    private static boolean c(byte[] bArr, byte[] bArr2) {
        return bArr == bArr2 || !(bArr == null || bArr2 == null || !Arrays.equals(bArr, bArr2));
    }

    private static boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private static boolean o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr3[i10] != bArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b10 = bArr2[i11];
            if ((bArr3[i11] & b10) != (b10 & bArr[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean p(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List list) {
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (q(parcelUuid.getUuid(), parcelUuid2 == null ? null : parcelUuid2.getUuid(), ((ParcelUuid) it.next()).getUuid())) {
                return true;
            }
        }
        return false;
    }

    private static boolean q(UUID uuid, UUID uuid2, UUID uuid3) {
        if (uuid2 == null) {
            return uuid.equals(uuid3);
        }
        if ((uuid.getLeastSignificantBits() & uuid2.getLeastSignificantBits()) != (uuid3.getLeastSignificantBits() & uuid2.getLeastSignificantBits())) {
            return false;
        }
        return (uuid.getMostSignificantBits() & uuid2.getMostSignificantBits()) == (uuid2.getMostSignificantBits() & uuid3.getMostSignificantBits());
    }

    private static boolean r(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List list) {
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (q(parcelUuid.getUuid(), parcelUuid2 == null ? null : parcelUuid2.getUuid(), ((ParcelUuid) it.next()).getUuid())) {
                return true;
            }
        }
        return false;
    }

    @Override // N6.p
    public boolean a(s sVar) {
        if (sVar == null) {
            return false;
        }
        String address = sVar.getAddress();
        String str = this.f19188b;
        if (str != null && !str.equals(address)) {
            return false;
        }
        e eVarB = sVar.b();
        String str2 = this.f19187a;
        if (str2 != null && !str2.equals(sVar.a()) && (eVarB == null || !this.f19187a.equals(eVarB.a()))) {
            return false;
        }
        if (eVarB == null) {
            return this.f19189c == null && this.f19197k == null && this.f19194h == null;
        }
        ParcelUuid parcelUuid = this.f19189c;
        if (parcelUuid != null && !r(parcelUuid, this.f19190d, eVarB.f())) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.f19191e;
        if (parcelUuid2 != null && !p(parcelUuid2, this.f19192f, eVarB.e())) {
            return false;
        }
        ParcelUuid parcelUuid3 = this.f19193g;
        if (parcelUuid3 != null && !o(this.f19194h, this.f19195i, eVarB.h(parcelUuid3))) {
            return false;
        }
        int i10 = this.f19196j;
        return i10 < 0 || o(this.f19197k, this.f19198l, eVarB.d(i10));
    }

    @Override // N6.p
    public boolean b() {
        return equals(f19186m);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f19188b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return d(this.f19187a, dVar.f19187a) && d(this.f19188b, dVar.f19188b) && this.f19196j == dVar.f19196j && c(this.f19197k, dVar.f19197k) && c(this.f19198l, dVar.f19198l) && d(this.f19193g, dVar.f19193g) && c(this.f19194h, dVar.f19194h) && c(this.f19195i, dVar.f19195i) && d(this.f19189c, dVar.f19189c) && d(this.f19190d, dVar.f19190d) && d(this.f19191e, dVar.f19191e) && d(this.f19192f, dVar.f19192f);
    }

    public String f() {
        return this.f19187a;
    }

    public byte[] g() {
        return this.f19197k;
    }

    public byte[] h() {
        return this.f19198l;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19187a, this.f19188b, Integer.valueOf(this.f19196j), Integer.valueOf(Arrays.hashCode(this.f19197k)), Integer.valueOf(Arrays.hashCode(this.f19198l)), this.f19193g, Integer.valueOf(Arrays.hashCode(this.f19194h)), Integer.valueOf(Arrays.hashCode(this.f19195i)), this.f19189c, this.f19190d, this.f19191e, this.f19192f});
    }

    public int i() {
        return this.f19196j;
    }

    public byte[] j() {
        return this.f19194h;
    }

    public byte[] k() {
        return this.f19195i;
    }

    public ParcelUuid l() {
        return this.f19193g;
    }

    public ParcelUuid m() {
        return this.f19189c;
    }

    public ParcelUuid n() {
        return this.f19190d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BluetoothLeScanFilter [mDeviceName=");
        sb2.append(this.f19187a);
        sb2.append(", ");
        sb2.append(L6.b.d(this.f19188b));
        sb2.append(", mUuid=");
        ParcelUuid parcelUuid = this.f19189c;
        sb2.append(parcelUuid == null ? null : L6.b.g(parcelUuid.getUuid()));
        sb2.append(", mUuidMask=");
        ParcelUuid parcelUuid2 = this.f19190d;
        sb2.append(parcelUuid2 == null ? null : L6.b.g(parcelUuid2.getUuid()));
        sb2.append(", mSolicitedUuid=");
        ParcelUuid parcelUuid3 = this.f19191e;
        sb2.append(parcelUuid3 == null ? null : L6.b.g(parcelUuid3.getUuid()));
        sb2.append(", mSolicitedUuidMask=");
        ParcelUuid parcelUuid4 = this.f19192f;
        sb2.append(parcelUuid4 == null ? null : L6.b.g(parcelUuid4.getUuid()));
        sb2.append(", mServiceDataUuid=");
        ParcelUuid parcelUuid5 = this.f19193g;
        sb2.append(parcelUuid5 != null ? L6.b.g(parcelUuid5.getUuid()) : null);
        sb2.append(", mServiceData=");
        sb2.append(Arrays.toString(this.f19194h));
        sb2.append(", mServiceDataMask=");
        sb2.append(Arrays.toString(this.f19195i));
        sb2.append(", mManufacturerId=");
        sb2.append(this.f19196j);
        sb2.append(", mManufacturerData=");
        sb2.append(Arrays.toString(this.f19197k));
        sb2.append(", mManufacturerDataMask=");
        sb2.append(Arrays.toString(this.f19198l));
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19187a == null ? 0 : 1);
        String str = this.f19187a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.f19188b == null ? 0 : 1);
        String str2 = this.f19188b;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.f19189c == null ? 0 : 1);
        ParcelUuid parcelUuid = this.f19189c;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i10);
            parcel.writeInt(this.f19190d == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.f19190d;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i10);
            }
        }
        parcel.writeInt(this.f19191e == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.f19191e;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i10);
            parcel.writeInt(this.f19192f == null ? 0 : 1);
            ParcelUuid parcelUuid4 = this.f19192f;
            if (parcelUuid4 != null) {
                parcel.writeParcelable(parcelUuid4, i10);
            }
        }
        parcel.writeInt(this.f19193g == null ? 0 : 1);
        ParcelUuid parcelUuid5 = this.f19193g;
        if (parcelUuid5 != null) {
            parcel.writeParcelable(parcelUuid5, i10);
            parcel.writeInt(this.f19194h == null ? 0 : 1);
            byte[] bArr = this.f19194h;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f19194h);
                parcel.writeInt(this.f19195i == null ? 0 : 1);
                byte[] bArr2 = this.f19195i;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f19195i);
                }
            }
        }
        parcel.writeInt(this.f19196j);
        parcel.writeInt(this.f19197k == null ? 0 : 1);
        byte[] bArr3 = this.f19197k;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f19197k);
            parcel.writeInt(this.f19198l == null ? 0 : 1);
            byte[] bArr4 = this.f19198l;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.f19198l);
            }
        }
    }
}
