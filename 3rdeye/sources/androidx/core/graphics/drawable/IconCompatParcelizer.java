package androidx.core.graphics.drawable;

import M1.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f15492a;
        if (aVar.h(1)) {
            i = aVar.i();
        }
        iconCompat.f15492a = i;
        byte[] bArrF = iconCompat.f15494c;
        if (aVar.h(2)) {
            bArrF = aVar.f();
        }
        iconCompat.f15494c = bArrF;
        Parcelable parcelableJ = iconCompat.f15495d;
        if (aVar.h(3)) {
            parcelableJ = aVar.j();
        }
        iconCompat.f15495d = parcelableJ;
        int i10 = iconCompat.f15496e;
        if (aVar.h(4)) {
            i10 = aVar.i();
        }
        iconCompat.f15496e = i10;
        int i11 = iconCompat.f15497f;
        if (aVar.h(5)) {
            i11 = aVar.i();
        }
        iconCompat.f15497f = i11;
        Parcelable parcelableJ2 = iconCompat.f15498g;
        if (aVar.h(6)) {
            parcelableJ2 = aVar.j();
        }
        iconCompat.f15498g = (ColorStateList) parcelableJ2;
        String strK = iconCompat.i;
        if (aVar.h(7)) {
            strK = aVar.k();
        }
        iconCompat.i = strK;
        String strK2 = iconCompat.f15500j;
        if (aVar.h(8)) {
            strK2 = aVar.k();
        }
        iconCompat.f15500j = strK2;
        iconCompat.f15499h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f15492a) {
            case -1:
                Parcelable parcelable = iconCompat.f15495d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f15493b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f15495d;
                if (parcelable2 != null) {
                    iconCompat.f15493b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.f15494c;
                iconCompat.f15493b = bArr;
                iconCompat.f15492a = 3;
                iconCompat.f15496e = 0;
                iconCompat.f15497f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f15494c, Charset.forName("UTF-16"));
                iconCompat.f15493b = str;
                if (iconCompat.f15492a == 2 && iconCompat.f15500j == null) {
                    iconCompat.f15500j = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f15493b = iconCompat.f15494c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.f15499h.name();
        switch (iconCompat.f15492a) {
            case -1:
                iconCompat.f15495d = (Parcelable) iconCompat.f15493b;
                break;
            case 1:
            case 5:
                iconCompat.f15495d = (Parcelable) iconCompat.f15493b;
                break;
            case 2:
                iconCompat.f15494c = ((String) iconCompat.f15493b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f15494c = (byte[]) iconCompat.f15493b;
                break;
            case 4:
            case 6:
                iconCompat.f15494c = iconCompat.f15493b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f15492a;
        if (-1 != i) {
            aVar.m(1);
            aVar.q(i);
        }
        byte[] bArr = iconCompat.f15494c;
        if (bArr != null) {
            aVar.m(2);
            aVar.o(bArr);
        }
        Parcelable parcelable = iconCompat.f15495d;
        if (parcelable != null) {
            aVar.m(3);
            aVar.r(parcelable);
        }
        int i10 = iconCompat.f15496e;
        if (i10 != 0) {
            aVar.m(4);
            aVar.q(i10);
        }
        int i11 = iconCompat.f15497f;
        if (i11 != 0) {
            aVar.m(5);
            aVar.q(i11);
        }
        ColorStateList colorStateList = iconCompat.f15498g;
        if (colorStateList != null) {
            aVar.m(6);
            aVar.r(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.m(7);
            aVar.s(str);
        }
        String str2 = iconCompat.f15500j;
        if (str2 != null) {
            aVar.m(8);
            aVar.s(str2);
        }
    }
}
