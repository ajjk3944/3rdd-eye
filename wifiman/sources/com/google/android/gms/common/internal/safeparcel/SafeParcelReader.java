package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iV);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iV);
        return bArrCreateByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iV);
        return iArrCreateIntArray;
    }

    public static ArrayList d(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iV);
        return arrayList;
    }

    public static Parcelable e(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iV);
        return parcelable;
    }

    public static String f(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iV);
        return string;
    }

    public static ArrayList g(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iV);
        return arrayListCreateStringArrayList;
    }

    public static Object[] h(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iV);
        return objArrCreateTypedArray;
    }

    public static ArrayList i(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iV);
        return arrayListCreateTypedArrayList;
    }

    public static void j(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i10, parcel);
    }

    public static int k(int i10) {
        return (char) i10;
    }

    public static boolean l(Parcel parcel, int i10) {
        z(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean m(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        if (iV == 0) {
            return null;
        }
        y(parcel, i10, iV, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double n(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        if (iV == 0) {
            return null;
        }
        y(parcel, i10, iV, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float o(Parcel parcel, int i10) {
        z(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float p(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        if (iV == 0) {
            return null;
        }
        y(parcel, i10, iV, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int q(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder r(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iV);
        return strongBinder;
    }

    public static int s(Parcel parcel, int i10) {
        z(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long t(Parcel parcel, int i10) {
        z(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long u(Parcel parcel, int i10) {
        int iV = v(parcel, i10);
        if (iV == 0) {
            return null;
        }
        y(parcel, i10, iV, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int v(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void w(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + v(parcel, i10));
    }

    public static int x(Parcel parcel) {
        int iQ = q(parcel);
        int iV = v(parcel, iQ);
        int iK = k(iQ);
        int iDataPosition = parcel.dataPosition();
        if (iK != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iQ))), parcel);
        }
        int i10 = iV + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new ParseException("Size read is invalid start=" + iDataPosition + " end=" + i10, parcel);
    }

    private static void y(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new ParseException("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    private static void z(Parcel parcel, int i10, int i11) {
        int iV = v(parcel, i10);
        if (iV == i11) {
            return;
        }
        throw new ParseException("Expected size " + i11 + " got " + iV + " (0x" + Integer.toHexString(iV) + ")", parcel);
    }
}
