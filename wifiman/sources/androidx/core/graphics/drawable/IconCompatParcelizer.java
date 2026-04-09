package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f30682a = versionedParcel.p(iconCompat.f30682a, 1);
        iconCompat.f30684c = versionedParcel.j(iconCompat.f30684c, 2);
        iconCompat.f30685d = versionedParcel.r(iconCompat.f30685d, 3);
        iconCompat.f30686e = versionedParcel.p(iconCompat.f30686e, 4);
        iconCompat.f30687f = versionedParcel.p(iconCompat.f30687f, 5);
        iconCompat.f30688g = (ColorStateList) versionedParcel.r(iconCompat.f30688g, 6);
        iconCompat.f30690i = versionedParcel.t(iconCompat.f30690i, 7);
        iconCompat.f30691j = versionedParcel.t(iconCompat.f30691j, 8);
        iconCompat.g();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.h(versionedParcel.f());
        int i10 = iconCompat.f30682a;
        if (-1 != i10) {
            versionedParcel.F(i10, 1);
        }
        byte[] bArr = iconCompat.f30684c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f30685d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i11 = iconCompat.f30686e;
        if (i11 != 0) {
            versionedParcel.F(i11, 4);
        }
        int i12 = iconCompat.f30687f;
        if (i12 != 0) {
            versionedParcel.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f30688g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f30690i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f30691j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
