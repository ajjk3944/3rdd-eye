package androidx.core.graphics.drawable;

import N0.a;
import N0.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f5092a;
        if (aVar.e(1)) {
            i = ((b) aVar).f2976e.readInt();
        }
        iconCompat.f5092a = i;
        byte[] bArr = iconCompat.f5094c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f2976e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f5094c = bArr;
        iconCompat.f5095d = aVar.f(iconCompat.f5095d, 3);
        int i6 = iconCompat.f5096e;
        if (aVar.e(4)) {
            i6 = ((b) aVar).f2976e.readInt();
        }
        iconCompat.f5096e = i6;
        int i7 = iconCompat.f5097f;
        if (aVar.e(5)) {
            i7 = ((b) aVar).f2976e.readInt();
        }
        iconCompat.f5097f = i7;
        iconCompat.f5098g = (ColorStateList) aVar.f(iconCompat.f5098g, 6);
        String string = iconCompat.i;
        if (aVar.e(7)) {
            string = ((b) aVar).f2976e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.f5100j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f2976e.readString();
        }
        iconCompat.f5100j = string2;
        iconCompat.f5099h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f5092a) {
            case -1:
                Parcelable parcelable = iconCompat.f5095d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f5093b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f5095d;
                if (parcelable2 != null) {
                    iconCompat.f5093b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f5094c;
                iconCompat.f5093b = bArr3;
                iconCompat.f5092a = 3;
                iconCompat.f5096e = 0;
                iconCompat.f5097f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f5094c, Charset.forName("UTF-16"));
                iconCompat.f5093b = str;
                if (iconCompat.f5092a == 2 && iconCompat.f5100j == null) {
                    iconCompat.f5100j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f5093b = iconCompat.f5094c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.f5099h.name();
        switch (iconCompat.f5092a) {
            case -1:
                iconCompat.f5095d = (Parcelable) iconCompat.f5093b;
                break;
            case 1:
            case 5:
                iconCompat.f5095d = (Parcelable) iconCompat.f5093b;
                break;
            case 2:
                iconCompat.f5094c = ((String) iconCompat.f5093b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f5094c = (byte[]) iconCompat.f5093b;
                break;
            case 4:
            case 6:
                iconCompat.f5094c = iconCompat.f5093b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f5092a;
        if (-1 != i) {
            aVar.h(1);
            ((b) aVar).f2976e.writeInt(i);
        }
        byte[] bArr = iconCompat.f5094c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f2976e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f5095d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f2976e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f5096e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f2976e.writeInt(i3);
        }
        int i6 = iconCompat.f5097f;
        if (i6 != 0) {
            aVar.h(5);
            ((b) aVar).f2976e.writeInt(i6);
        }
        ColorStateList colorStateList = iconCompat.f5098g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f2976e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f2976e.writeString(str);
        }
        String str2 = iconCompat.f5100j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f2976e.writeString(str2);
        }
    }
}
