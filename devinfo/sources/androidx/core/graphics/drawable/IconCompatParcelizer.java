package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import l6.a;
import l6.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i4 = iconCompat.f900a;
        if (aVar.e(1)) {
            i4 = ((b) aVar).f28595e.readInt();
        }
        iconCompat.f900a = i4;
        byte[] bArr = iconCompat.f902c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f28595e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f902c = bArr;
        iconCompat.f903d = aVar.f(iconCompat.f903d, 3);
        int i11 = iconCompat.f904e;
        if (aVar.e(4)) {
            i11 = ((b) aVar).f28595e.readInt();
        }
        iconCompat.f904e = i11;
        int i12 = iconCompat.f905f;
        if (aVar.e(5)) {
            i12 = ((b) aVar).f28595e.readInt();
        }
        iconCompat.f905f = i12;
        iconCompat.g = (ColorStateList) aVar.f(iconCompat.g, 6);
        String string = iconCompat.f907i;
        if (aVar.e(7)) {
            string = ((b) aVar).f28595e.readString();
        }
        iconCompat.f907i = string;
        String string2 = iconCompat.j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f28595e.readString();
        }
        iconCompat.j = string2;
        iconCompat.f906h = PorterDuff.Mode.valueOf(iconCompat.f907i);
        switch (iconCompat.f900a) {
            case -1:
                Parcelable parcelable = iconCompat.f903d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f901b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f903d;
                if (parcelable2 != null) {
                    iconCompat.f901b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f902c;
                iconCompat.f901b = bArr3;
                iconCompat.f900a = 3;
                iconCompat.f904e = 0;
                iconCompat.f905f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f902c, Charset.forName("UTF-16"));
                iconCompat.f901b = str;
                if (iconCompat.f900a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f901b = iconCompat.f902c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f907i = iconCompat.f906h.name();
        switch (iconCompat.f900a) {
            case -1:
                iconCompat.f903d = (Parcelable) iconCompat.f901b;
                break;
            case 1:
            case 5:
                iconCompat.f903d = (Parcelable) iconCompat.f901b;
                break;
            case 2:
                iconCompat.f902c = ((String) iconCompat.f901b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f902c = (byte[]) iconCompat.f901b;
                break;
            case 4:
            case 6:
                iconCompat.f902c = iconCompat.f901b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i4 = iconCompat.f900a;
        if (-1 != i4) {
            aVar.h(1);
            ((b) aVar).f28595e.writeInt(i4);
        }
        byte[] bArr = iconCompat.f902c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f28595e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f903d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f28595e.writeParcelable(parcelable, 0);
        }
        int i10 = iconCompat.f904e;
        if (i10 != 0) {
            aVar.h(4);
            ((b) aVar).f28595e.writeInt(i10);
        }
        int i11 = iconCompat.f905f;
        if (i11 != 0) {
            aVar.h(5);
            ((b) aVar).f28595e.writeInt(i11);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f28595e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f907i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f28595e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f28595e.writeString(str2);
        }
    }
}
