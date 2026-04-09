package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import defpackage.k2;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ k2(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri mediaUri;
        Bundle bundle;
        switch (this.a) {
            case 0:
                i30.m(parcel, "parcel");
                return new l2(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                f7 f7Var = new f7(parcel);
                f7Var.f = parcel.readByte() != 0;
                return f7Var;
            case 2:
                return new h9(parcel);
            case 3:
                return new i9(parcel);
            case 4:
                return new vc((we0) parcel.readParcelable(we0.class.getClassLoader()), (we0) parcel.readParcelable(we0.class.getClassLoader()), (rm) parcel.readParcelable(rm.class.getClassLoader()), (we0) parcel.readParcelable(we0.class.getClassLoader()), parcel.readInt());
            case 5:
                return new rm(parcel.readLong());
            case 6:
                return new gr(parcel);
            case 7:
                xs xsVar = new xs();
                xsVar.f = 0.0f;
                xsVar.g = null;
                xsVar.h = 0.0f;
                xsVar.h = parcel.readFloat();
                xsVar.f = parcel.readFloat();
                if (parcel.readInt() == 1) {
                    xsVar.g = parcel.readParcelable(Object.class.getClassLoader());
                }
                return xsVar;
            case 8:
                uw uwVar = new uw();
                uwVar.f = parcel.readString();
                uwVar.g = parcel.readInt();
                return uwVar;
            case 9:
                yw ywVar = new yw();
                ywVar.j = null;
                ywVar.k = new ArrayList();
                ywVar.l = new ArrayList();
                ywVar.f = parcel.createStringArrayList();
                ywVar.g = parcel.createStringArrayList();
                ywVar.h = (h9[]) parcel.createTypedArray(h9.CREATOR);
                ywVar.i = parcel.readInt();
                ywVar.j = parcel.readString();
                ywVar.k = parcel.createStringArrayList();
                ywVar.l = parcel.createTypedArrayList(i9.CREATOR);
                ywVar.m = parcel.createTypedArrayList(uw.CREATOR);
                return ywVar;
            case 10:
                return new dx(parcel);
            case 11:
                u60 u60Var = new u60();
                u60Var.f = parcel.readInt();
                u60Var.g = parcel.readInt();
                u60Var.h = parcel.readInt() == 1;
                return u60Var;
            case 12:
                return new j70(parcel);
            case 13:
                r80 r80Var = new r80(parcel);
                r80Var.f = parcel.readString();
                r80Var.h = parcel.readFloat();
                r80Var.i = parcel.readInt() == 1;
                r80Var.j = parcel.readString();
                r80Var.k = parcel.readInt();
                r80Var.l = parcel.readInt();
                return r80Var;
            case 14:
                gc0 gc0Var = new gc0(parcel);
                gc0Var.f = ((Integer) parcel.readValue(gc0.class.getClassLoader())).intValue();
                return gc0Var;
            case 15:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new k2(15);
                    public final int f;
                    public final MediaDescriptionCompat g;

                    {
                        this.f = parcel.readInt();
                        this.g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f + ", mDescription=" + this.g + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.f);
                        this.g.writeToParcel(parcel2, i);
                    }
                };
            case 16:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(yc0.class.getClassLoader());
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.n = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 17:
                return new MediaMetadataCompat(parcel);
            case 18:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new k2(18);
                    public final MediaDescriptionCompat f;
                    public final long g;

                    {
                        this.f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.g = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.f + ", Id=" + this.g + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.f.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.g);
                    }
                };
            case 19:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 20:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new k2(20);
                    public final Object f;

                    {
                        this.f = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).f;
                        Object obj3 = this.f;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.f;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable((Parcelable) this.f, i);
                    }
                };
            case zy1.zzm /* 21 */:
                return we0.a(parcel.readInt(), parcel.readInt());
            case 22:
                return new if0(parcel);
            case 23:
                og0 og0Var = new og0(parcel);
                og0Var.f = parcel.readInt();
                return og0Var;
            case 24:
                return new ParcelImpl(parcel);
            case 25:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f = parcel.readInt();
                parcelableVolumeInfo.h = parcel.readInt();
                parcelableVolumeInfo.i = parcel.readInt();
                parcelableVolumeInfo.j = parcel.readInt();
                parcelableVolumeInfo.g = parcel.readInt();
                return parcelableVolumeInfo;
            case 26:
                return new PlaybackStateCompat(parcel);
            case 27:
                return new tl0(parcel);
            case 28:
                return new cm0(parcel);
            default:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new l2[i];
            case 1:
                return new f7[i];
            case 2:
                return new h9[i];
            case 3:
                return new i9[i];
            case 4:
                return new vc[i];
            case 5:
                return new rm[i];
            case 6:
                return new gr[i];
            case 7:
                return new xs[i];
            case 8:
                return new uw[i];
            case 9:
                return new yw[i];
            case 10:
                return new dx[i];
            case 11:
                return new u60[i];
            case 12:
                return new j70[i];
            case 13:
                return new r80[i];
            case 14:
                return new gc0[i];
            case 15:
                return new MediaBrowserCompat$MediaItem[i];
            case 16:
                return new MediaDescriptionCompat[i];
            case 17:
                return new MediaMetadataCompat[i];
            case 18:
                return new MediaSessionCompat$QueueItem[i];
            case 19:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 20:
                return new MediaSessionCompat$Token[i];
            case zy1.zzm /* 21 */:
                return new we0[i];
            case 22:
                return new if0[i];
            case 23:
                return new og0[i];
            case 24:
                return new ParcelImpl[i];
            case 25:
                return new ParcelableVolumeInfo[i];
            case 26:
                return new PlaybackStateCompat[i];
            case 27:
                return new tl0[i];
            case 28:
                return new cm0[i];
            default:
                return new RatingCompat[i];
        }
    }
}
