package android.support.v4.media;

import ac.l;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new l(3);
    public final Bundle B;
    public final Uri D;
    public MediaDescription E;

    /* renamed from: a, reason: collision with root package name */
    public final String f886a;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f887d;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f888g;

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f889r;

    /* renamed from: x, reason: collision with root package name */
    public final Bitmap f890x;

    /* renamed from: y, reason: collision with root package name */
    public final Uri f891y;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f886a = str;
        this.f887d = charSequence;
        this.f888g = charSequence2;
        this.f889r = charSequence3;
        this.f890x = bitmap;
        this.f891y = uri;
        this.B = bundle;
        this.D = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f887d) + ", " + ((Object) this.f888g) + ", " + ((Object) this.f889r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescriptionBuild = this.E;
        if (mediaDescriptionBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f886a);
            builder.setTitle(this.f887d);
            builder.setSubtitle(this.f888g);
            builder.setDescription(this.f889r);
            builder.setIconBitmap(this.f890x);
            builder.setIconUri(this.f891y);
            builder.setExtras(this.B);
            builder.setMediaUri(this.D);
            mediaDescriptionBuild = builder.build();
            this.E = mediaDescriptionBuild;
        }
        mediaDescriptionBuild.writeToParcel(parcel, i10);
    }
}
