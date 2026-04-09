package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2539a = versionedParcel.p(iconCompat.f2539a, 1);
        iconCompat.f2541c = versionedParcel.j(iconCompat.f2541c, 2);
        iconCompat.f2542d = versionedParcel.r(iconCompat.f2542d, 3);
        iconCompat.f2543e = versionedParcel.p(iconCompat.f2543e, 4);
        iconCompat.f2544f = versionedParcel.p(iconCompat.f2544f, 5);
        iconCompat.f2545g = (ColorStateList) versionedParcel.r(iconCompat.f2545g, 6);
        iconCompat.f2547i = versionedParcel.t(iconCompat.f2547i, 7);
        iconCompat.f2548j = versionedParcel.t(iconCompat.f2548j, 8);
        iconCompat.p();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.q(versionedParcel.f());
        int i10 = iconCompat.f2539a;
        if (-1 != i10) {
            versionedParcel.F(i10, 1);
        }
        byte[] bArr = iconCompat.f2541c;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2542d;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i11 = iconCompat.f2543e;
        if (i11 != 0) {
            versionedParcel.F(i11, 4);
        }
        int i12 = iconCompat.f2544f;
        if (i12 != 0) {
            versionedParcel.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2545g;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f2547i;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f2548j;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
