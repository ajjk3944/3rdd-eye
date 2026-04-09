package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k2;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new k2(16);
    public final String f;
    public final CharSequence g;
    public final CharSequence h;
    public final CharSequence i;
    public final Bitmap j;
    public final Uri k;
    public final Bundle l;
    public final Uri m;
    public Object n;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f = str;
        this.g = charSequence;
        this.h = charSequence2;
        this.i = charSequence3;
        this.j = bitmap;
        this.k = uri;
        this.l = bundle;
        this.m = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.g) + ", " + ((Object) this.h) + ", " + ((Object) this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object objBuild = this.n;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f);
            builder.setTitle(this.g);
            builder.setSubtitle(this.h);
            builder.setDescription(this.i);
            builder.setIconBitmap(this.j);
            builder.setIconUri(this.k);
            builder.setExtras(this.l);
            builder.setMediaUri(this.m);
            objBuild = builder.build();
            this.n = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
