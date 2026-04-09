package h2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.t;
import b2.C1819F;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: ParcelableWorkInfo.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class k implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final t f38179b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f38178c = new String[0];
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* compiled from: ParcelableWorkInfo.java */
    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i) {
            return new k[i];
        }
    }

    public k(t tVar) {
        this.f38179b = tVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        t tVar = this.f38179b;
        parcel.writeString(tVar.f17021a.toString());
        parcel.writeInt(C1819F.j(tVar.f17022b));
        new C4409c(tVar.f17024d).writeToParcel(parcel, i);
        parcel.writeStringArray((String[]) new ArrayList(tVar.f17023c).toArray(f38178c));
        new C4409c(tVar.f17025e).writeToParcel(parcel, i);
        parcel.writeInt(tVar.f17026f);
        parcel.writeInt(tVar.f17027g);
    }

    public k(Parcel parcel) {
        Object objValueOf;
        UUID id = UUID.fromString(parcel.readString());
        t.b state = C1819F.f(parcel.readInt());
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
                androidx.work.e eVar = new androidx.work.e(map);
                HashSet hashSet = new HashSet(Arrays.asList(parcel.createStringArray()));
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
                androidx.work.e eVar2 = new androidx.work.e(map2);
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                kotlin.jvm.internal.l.f(id, "id");
                kotlin.jvm.internal.l.f(state, "state");
                this.f38179b = new t(id, state, hashSet, eVar, eVar2, i13, i14, androidx.work.d.i, 0L, null, Long.MAX_VALUE, -256);
                return;
            }
        }
    }
}
