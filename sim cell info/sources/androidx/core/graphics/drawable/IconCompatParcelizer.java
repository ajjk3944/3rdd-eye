package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1451a = aVar.p(iconCompat.f1451a, 1);
        iconCompat.f1453c = aVar.j(iconCompat.f1453c, 2);
        iconCompat.f1454d = aVar.r(iconCompat.f1454d, 3);
        iconCompat.f1455e = aVar.p(iconCompat.f1455e, 4);
        iconCompat.f1456f = aVar.p(iconCompat.f1456f, 5);
        iconCompat.f1457g = (ColorStateList) aVar.r(iconCompat.f1457g, 6);
        iconCompat.f1459i = aVar.t(iconCompat.f1459i, 7);
        iconCompat.e();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.f(aVar.f());
        int i2 = iconCompat.f1451a;
        if (-1 != i2) {
            aVar.F(i2, 1);
        }
        byte[] bArr = iconCompat.f1453c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1454d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i3 = iconCompat.f1455e;
        if (i3 != 0) {
            aVar.F(i3, 4);
        }
        int i4 = iconCompat.f1456f;
        if (i4 != 0) {
            aVar.F(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f1457g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f1459i;
        if (str != null) {
            aVar.J(str, 7);
        }
    }
}
