package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import g4.j;
import java.nio.charset.Charset;
import v7.a;
import v7.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1222a = aVar.f(iconCompat.f1222a, 1);
        byte[] bArr = iconCompat.f1224c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f23902e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1224c = bArr;
        iconCompat.f1225d = aVar.g(iconCompat.f1225d, 3);
        iconCompat.f1226e = aVar.f(iconCompat.f1226e, 4);
        iconCompat.f1227f = aVar.f(iconCompat.f1227f, 5);
        iconCompat.f1228g = (ColorStateList) aVar.g(iconCompat.f1228g, 6);
        String string = iconCompat.f1230i;
        if (aVar.e(7)) {
            string = ((b) aVar).f23902e.readString();
        }
        iconCompat.f1230i = string;
        String string2 = iconCompat.j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f23902e.readString();
        }
        iconCompat.j = string2;
        iconCompat.f1229h = PorterDuff.Mode.valueOf(iconCompat.f1230i);
        switch (iconCompat.f1222a) {
            case -1:
                Parcelable parcelable = iconCompat.f1225d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1223b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case j.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f1225d;
                if (parcelable2 != null) {
                    iconCompat.f1223b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1224c;
                iconCompat.f1223b = bArr3;
                iconCompat.f1222a = 3;
                iconCompat.f1226e = 0;
                iconCompat.f1227f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.f1224c, Charset.forName("UTF-16"));
                iconCompat.f1223b = str;
                if (iconCompat.f1222a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1223b = iconCompat.f1224c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1230i = iconCompat.f1229h.name();
        switch (iconCompat.f1222a) {
            case -1:
                iconCompat.f1225d = (Parcelable) iconCompat.f1223b;
                break;
            case 1:
            case j.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f1225d = (Parcelable) iconCompat.f1223b;
                break;
            case 2:
                iconCompat.f1224c = ((String) iconCompat.f1223b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1224c = (byte[]) iconCompat.f1223b;
                break;
            case 4:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f1224c = iconCompat.f1223b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f1222a;
        if (-1 != i10) {
            aVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.f1224c;
        if (bArr != null) {
            aVar.i(2);
            Parcel parcel = ((b) aVar).f23902e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1225d;
        if (parcelable != null) {
            aVar.k(parcelable, 3);
        }
        int i11 = iconCompat.f1226e;
        if (i11 != 0) {
            aVar.j(i11, 4);
        }
        int i12 = iconCompat.f1227f;
        if (i12 != 0) {
            aVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1228g;
        if (colorStateList != null) {
            aVar.k(colorStateList, 6);
        }
        String str = iconCompat.f1230i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f23902e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f23902e.writeString(str2);
        }
    }
}
