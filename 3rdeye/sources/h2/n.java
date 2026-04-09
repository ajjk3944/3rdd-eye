package h2;

import T1.D;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.w;
import b2.C1819F;
import b2.C1842w;
import g0.C4356c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: ParcelableWorkRequest.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final w f38182b;

    /* compiled from: ParcelableWorkRequest.java */
    public class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i) {
            return new n[i];
        }
    }

    public n(w wVar) {
        this.f38182b = wVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        w wVar = this.f38182b;
        parcel.writeString(wVar.a());
        parcel.writeStringList(new ArrayList(wVar.f17044c));
        C1842w c1842w = wVar.f17043b;
        parcel.writeString(c1842w.f17140c);
        parcel.writeString(c1842w.f17141d);
        parcel.writeInt(C1819F.j(c1842w.f17139b));
        new C4409c(c1842w.f17142e).writeToParcel(parcel, i);
        new C4409c(c1842w.f17143f).writeToParcel(parcel, i);
        parcel.writeLong(c1842w.f17144g);
        parcel.writeLong(c1842w.f17145h);
        parcel.writeLong(c1842w.i);
        parcel.writeInt(c1842w.f17147k);
        parcel.writeParcelable(new C4408b(c1842w.f17146j), i);
        parcel.writeInt(C1819F.a(c1842w.f17148l));
        parcel.writeLong(c1842w.f17149m);
        parcel.writeLong(c1842w.f17151o);
        parcel.writeLong(c1842w.f17152p);
        parcel.writeInt(c1842w.f17153q ? 1 : 0);
        parcel.writeInt(C1819F.h(c1842w.f17154r));
    }

    public n(Parcel parcel) {
        Object objValueOf;
        String string = parcel.readString();
        HashSet hashSet = new HashSet(parcel.createStringArrayList());
        C1842w c1842w = new C1842w(string, parcel.readString());
        c1842w.f17141d = parcel.readString();
        c1842w.f17139b = C1819F.f(parcel.readInt());
        HashMap map = new HashMap();
        int i = parcel.readInt();
        int i10 = 0;
        while (true) {
            Object objValueOf2 = null;
            if (i10 < i) {
                byte b10 = parcel.readByte();
                switch (b10) {
                    case 0:
                        break;
                    case 1:
                        objValueOf2 = Boolean.valueOf(parcel.readInt() == 1);
                        break;
                    case 2:
                        objValueOf2 = Byte.valueOf(parcel.readByte());
                        break;
                    case 3:
                        objValueOf2 = Integer.valueOf(parcel.readInt());
                        break;
                    case 4:
                        objValueOf2 = Long.valueOf(parcel.readLong());
                        break;
                    case 5:
                        objValueOf2 = Float.valueOf(parcel.readFloat());
                        break;
                    case 6:
                        objValueOf2 = Double.valueOf(parcel.readDouble());
                        break;
                    case 7:
                        objValueOf2 = parcel.readString();
                        break;
                    case 8:
                        objValueOf2 = androidx.work.e.a(parcel.createBooleanArray());
                        break;
                    case 9:
                        objValueOf2 = androidx.work.e.b(parcel.createByteArray());
                        break;
                    case 10:
                        objValueOf2 = androidx.work.e.e(parcel.createIntArray());
                        break;
                    case 11:
                        objValueOf2 = androidx.work.e.f(parcel.createLongArray());
                        break;
                    case 12:
                        objValueOf2 = androidx.work.e.d(parcel.createFloatArray());
                        break;
                    case 13:
                        objValueOf2 = androidx.work.e.c(parcel.createDoubleArray());
                        break;
                    case 14:
                        objValueOf2 = parcel.createStringArray();
                        break;
                    default:
                        throw new IllegalStateException(C4356c.h(b10, "Unsupported type "));
                }
                map.put(parcel.readString(), objValueOf2);
                i10++;
            } else {
                c1842w.f17142e = new androidx.work.e(map);
                HashMap map2 = new HashMap();
                int i11 = parcel.readInt();
                for (int i12 = 0; i12 < i11; i12++) {
                    byte b11 = parcel.readByte();
                    switch (b11) {
                        case 0:
                            objValueOf = null;
                            break;
                        case 1:
                            objValueOf = Boolean.valueOf(parcel.readInt() == 1);
                            break;
                        case 2:
                            objValueOf = Byte.valueOf(parcel.readByte());
                            break;
                        case 3:
                            objValueOf = Integer.valueOf(parcel.readInt());
                            break;
                        case 4:
                            objValueOf = Long.valueOf(parcel.readLong());
                            break;
                        case 5:
                            objValueOf = Float.valueOf(parcel.readFloat());
                            break;
                        case 6:
                            objValueOf = Double.valueOf(parcel.readDouble());
                            break;
                        case 7:
                            objValueOf = parcel.readString();
                            break;
                        case 8:
                            objValueOf = androidx.work.e.a(parcel.createBooleanArray());
                            break;
                        case 9:
                            objValueOf = androidx.work.e.b(parcel.createByteArray());
                            break;
                        case 10:
                            objValueOf = androidx.work.e.e(parcel.createIntArray());
                            break;
                        case 11:
                            objValueOf = androidx.work.e.f(parcel.createLongArray());
                            break;
                        case 12:
                            objValueOf = androidx.work.e.d(parcel.createFloatArray());
                            break;
                        case 13:
                            objValueOf = androidx.work.e.c(parcel.createDoubleArray());
                            break;
                        case 14:
                            objValueOf = parcel.createStringArray();
                            break;
                        default:
                            throw new IllegalStateException(C4356c.h(b11, "Unsupported type "));
                    }
                    map2.put(parcel.readString(), objValueOf);
                }
                c1842w.f17143f = new androidx.work.e(map2);
                c1842w.f17144g = parcel.readLong();
                c1842w.f17145h = parcel.readLong();
                c1842w.i = parcel.readLong();
                c1842w.f17147k = parcel.readInt();
                c1842w.f17146j = ((C4408b) parcel.readParcelable(n.class.getClassLoader())).f38160b;
                c1842w.f17148l = C1819F.c(parcel.readInt());
                c1842w.f17149m = parcel.readLong();
                c1842w.f17151o = parcel.readLong();
                c1842w.f17152p = parcel.readLong();
                c1842w.f17153q = parcel.readInt() == 1;
                c1842w.f17154r = C1819F.e(parcel.readInt());
                this.f38182b = new D(UUID.fromString(string), c1842w, hashSet);
                return;
            }
        }
    }
}
