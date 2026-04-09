package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k2;
import defpackage.s8;
import defpackage.yc0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public final Bundle f;

    static {
        s8 s8Var = new s8(0);
        s8Var.put("android.media.metadata.TITLE", 1);
        s8Var.put("android.media.metadata.ARTIST", 1);
        s8Var.put("android.media.metadata.DURATION", 0);
        s8Var.put("android.media.metadata.ALBUM", 1);
        s8Var.put("android.media.metadata.AUTHOR", 1);
        s8Var.put("android.media.metadata.WRITER", 1);
        s8Var.put("android.media.metadata.COMPOSER", 1);
        s8Var.put("android.media.metadata.COMPILATION", 1);
        s8Var.put("android.media.metadata.DATE", 1);
        s8Var.put("android.media.metadata.YEAR", 0);
        s8Var.put("android.media.metadata.GENRE", 1);
        s8Var.put("android.media.metadata.TRACK_NUMBER", 0);
        s8Var.put("android.media.metadata.NUM_TRACKS", 0);
        s8Var.put("android.media.metadata.DISC_NUMBER", 0);
        s8Var.put("android.media.metadata.ALBUM_ARTIST", 1);
        s8Var.put("android.media.metadata.ART", 2);
        s8Var.put("android.media.metadata.ART_URI", 1);
        s8Var.put("android.media.metadata.ALBUM_ART", 2);
        s8Var.put("android.media.metadata.ALBUM_ART_URI", 1);
        s8Var.put("android.media.metadata.USER_RATING", 3);
        s8Var.put("android.media.metadata.RATING", 3);
        s8Var.put("android.media.metadata.DISPLAY_TITLE", 1);
        s8Var.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        s8Var.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        s8Var.put("android.media.metadata.DISPLAY_ICON", 2);
        s8Var.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        s8Var.put("android.media.metadata.MEDIA_ID", 1);
        s8Var.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        s8Var.put("android.media.metadata.MEDIA_URI", 1);
        s8Var.put("android.media.metadata.ADVERTISEMENT", 0);
        s8Var.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new k2(17);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f = parcel.readBundle(yc0.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f);
    }
}
