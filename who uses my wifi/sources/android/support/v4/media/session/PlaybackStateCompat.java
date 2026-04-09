package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.k2;
import defpackage.yc0;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new k2(26);
    public final int f;
    public final long g;
    public final long h;
    public final float i;
    public final long j;
    public final int k;
    public final CharSequence l;
    public final long m;
    public final ArrayList n;
    public final long o;
    public final Bundle p;

    /* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String f;
        public final CharSequence g;
        public final int h;
        public final Bundle i;

        public CustomAction(Parcel parcel) {
            this.f = parcel.readString();
            this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.h = parcel.readInt();
            this.i = parcel.readBundle(yc0.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.g) + ", mIcon=" + this.h + ", mExtras=" + this.i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f);
            TextUtils.writeToParcel(this.g, parcel, i);
            parcel.writeInt(this.h);
            parcel.writeBundle(this.i);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f = parcel.readInt();
        this.g = parcel.readLong();
        this.i = parcel.readFloat();
        this.m = parcel.readLong();
        this.h = parcel.readLong();
        this.j = parcel.readLong();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.o = parcel.readLong();
        this.p = parcel.readBundle(yc0.class.getClassLoader());
        this.k = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f + ", position=" + this.g + ", buffered position=" + this.h + ", speed=" + this.i + ", updated=" + this.m + ", actions=" + this.j + ", error code=" + this.k + ", error message=" + this.l + ", custom actions=" + this.n + ", active item id=" + this.o + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeFloat(this.i);
        parcel.writeLong(this.m);
        parcel.writeLong(this.h);
        parcel.writeLong(this.j);
        TextUtils.writeToParcel(this.l, parcel, i);
        parcel.writeTypedList(this.n);
        parcel.writeLong(this.o);
        parcel.writeBundle(this.p);
        parcel.writeInt(this.k);
    }
}
