package h2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.l;
import g0.C4356c;
import java.util.HashMap;

/* compiled from: ParcelableResult.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final l.a f38168b;

    /* compiled from: ParcelableResult.java */
    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i) {
            return new g[i];
        }
    }

    public g(Parcel parcel) {
        l.a c0267a;
        l.a bVar;
        Object objValueOf;
        int i = parcel.readInt();
        HashMap map = new HashMap();
        int i10 = parcel.readInt();
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                androidx.work.e eVar = new androidx.work.e(map);
                if (i == 1) {
                    bVar = new l.a.b();
                } else {
                    if (i == 2) {
                        c0267a = new l.a.c(eVar);
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException(C4356c.h(i, "Unknown result type "));
                        }
                        c0267a = new l.a.C0267a(eVar);
                    }
                    bVar = c0267a;
                }
                this.f38168b = bVar;
                return;
            }
            byte b10 = parcel.readByte();
            switch (b10) {
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
                    throw new IllegalStateException(C4356c.h(b10, "Unsupported type "));
            }
            map.put(parcel.readString(), objValueOf);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10;
        l.a aVar = this.f38168b;
        if (aVar instanceof l.a.b) {
            i10 = 1;
        } else if (aVar instanceof l.a.c) {
            i10 = 2;
        } else {
            if (!(aVar instanceof l.a.C0267a)) {
                throw new IllegalStateException("Unknown Result " + aVar);
            }
            i10 = 3;
        }
        parcel.writeInt(i10);
        new C4409c(aVar.a()).writeToParcel(parcel, i);
    }
}
