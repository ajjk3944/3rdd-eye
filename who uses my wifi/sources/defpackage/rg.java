package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rg extends RuntimeException {
    public rg(String str) {
        super(str);
    }

    public rg(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }

    public rg(int i) {
        super(ex0.j(new StringBuilder(String.valueOf(i).length() + 3), "r: ", i));
    }
}
