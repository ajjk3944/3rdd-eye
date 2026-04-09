package h2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import g0.C4356c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ParcelableData.java */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: h2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4409c implements Parcelable {
    public static final Parcelable.Creator<C4409c> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.e f38161b;

    /* compiled from: ParcelableData.java */
    /* renamed from: h2.c$a */
    public class a implements Parcelable.Creator<C4409c> {
        @Override // android.os.Parcelable.Creator
        public final C4409c createFromParcel(Parcel parcel) {
            return new C4409c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C4409c[] newArray(int i) {
            return new C4409c[i];
        }
    }

    public C4409c(androidx.work.e eVar) {
        this.f38161b = eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f38161b.f16894a);
        parcel.writeInt(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            int i10 = 0;
            if (value == null) {
                parcel.writeByte((byte) 0);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class) {
                    parcel.writeByte((byte) 1);
                    parcel.writeInt(((Boolean) value).booleanValue() ? 1 : 0);
                } else if (cls == Byte.class) {
                    parcel.writeByte((byte) 2);
                    parcel.writeByte(((Byte) value).byteValue());
                } else if (cls == Integer.class) {
                    parcel.writeByte((byte) 3);
                    parcel.writeInt(((Integer) value).intValue());
                } else if (cls == Long.class) {
                    parcel.writeByte((byte) 4);
                    parcel.writeLong(((Long) value).longValue());
                } else if (cls == Float.class) {
                    parcel.writeByte((byte) 5);
                    parcel.writeFloat(((Float) value).floatValue());
                } else if (cls == Double.class) {
                    parcel.writeByte((byte) 6);
                    parcel.writeDouble(((Double) value).doubleValue());
                } else if (cls == String.class) {
                    parcel.writeByte((byte) 7);
                    parcel.writeString((String) value);
                } else if (cls == Boolean[].class) {
                    parcel.writeByte((byte) 8);
                    Boolean[] boolArr = (Boolean[]) value;
                    String str2 = androidx.work.e.f16892b;
                    boolean[] zArr = new boolean[boolArr.length];
                    while (i10 < boolArr.length) {
                        zArr[i10] = boolArr[i10].booleanValue();
                        i10++;
                    }
                    parcel.writeBooleanArray(zArr);
                } else if (cls == Byte[].class) {
                    parcel.writeByte((byte) 9);
                    Byte[] bArr = (Byte[]) value;
                    String str3 = androidx.work.e.f16892b;
                    byte[] bArr2 = new byte[bArr.length];
                    while (i10 < bArr.length) {
                        bArr2[i10] = bArr[i10].byteValue();
                        i10++;
                    }
                    parcel.writeByteArray(bArr2);
                } else if (cls == Integer[].class) {
                    parcel.writeByte((byte) 10);
                    Integer[] numArr = (Integer[]) value;
                    String str4 = androidx.work.e.f16892b;
                    int[] iArr = new int[numArr.length];
                    while (i10 < numArr.length) {
                        iArr[i10] = numArr[i10].intValue();
                        i10++;
                    }
                    parcel.writeIntArray(iArr);
                } else if (cls == Long[].class) {
                    parcel.writeByte((byte) 11);
                    Long[] lArr = (Long[]) value;
                    String str5 = androidx.work.e.f16892b;
                    long[] jArr = new long[lArr.length];
                    while (i10 < lArr.length) {
                        jArr[i10] = lArr[i10].longValue();
                        i10++;
                    }
                    parcel.writeLongArray(jArr);
                } else if (cls == Float[].class) {
                    parcel.writeByte((byte) 12);
                    Float[] fArr = (Float[]) value;
                    String str6 = androidx.work.e.f16892b;
                    float[] fArr2 = new float[fArr.length];
                    while (i10 < fArr.length) {
                        fArr2[i10] = fArr[i10].floatValue();
                        i10++;
                    }
                    parcel.writeFloatArray(fArr2);
                } else if (cls == Double[].class) {
                    parcel.writeByte((byte) 13);
                    Double[] dArr = (Double[]) value;
                    String str7 = androidx.work.e.f16892b;
                    double[] dArr2 = new double[dArr.length];
                    while (i10 < dArr.length) {
                        dArr2[i10] = dArr[i10].doubleValue();
                        i10++;
                    }
                    parcel.writeDoubleArray(dArr2);
                } else {
                    if (cls != String[].class) {
                        throw new IllegalArgumentException("Unsupported value type ".concat(cls.getName()));
                    }
                    parcel.writeByte((byte) 14);
                    parcel.writeStringArray((String[]) value);
                }
            }
            parcel.writeString(str);
        }
    }

    public C4409c(Parcel parcel) {
        Object objValueOf;
        HashMap map = new HashMap();
        int i = parcel.readInt();
        for (int i10 = 0; i10 < i; i10++) {
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
        }
        this.f38161b = new androidx.work.e(map);
    }
}
