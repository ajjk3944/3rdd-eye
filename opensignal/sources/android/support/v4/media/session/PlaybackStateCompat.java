package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);
    public final CharSequence B;
    public final long D;
    public final ArrayList E;
    public final long F;
    public final Bundle G;

    /* renamed from: a, reason: collision with root package name */
    public final int f905a;

    /* renamed from: d, reason: collision with root package name */
    public final long f906d;

    /* renamed from: g, reason: collision with root package name */
    public final long f907g;

    /* renamed from: r, reason: collision with root package name */
    public final float f908r;

    /* renamed from: x, reason: collision with root package name */
    public final long f909x;

    /* renamed from: y, reason: collision with root package name */
    public final int f910y;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        public final String f911a;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f912d;

        /* renamed from: g, reason: collision with root package name */
        public final int f913g;

        /* renamed from: r, reason: collision with root package name */
        public final Bundle f914r;

        public CustomAction(Parcel parcel) {
            this.f911a = parcel.readString();
            this.f912d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f913g = parcel.readInt();
            this.f914r = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f912d) + ", mIcon=" + this.f913g + ", mExtras=" + this.f914r;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f911a);
            TextUtils.writeToParcel(this.f912d, parcel, i10);
            parcel.writeInt(this.f913g);
            parcel.writeBundle(this.f914r);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f905a = parcel.readInt();
        this.f906d = parcel.readLong();
        this.f908r = parcel.readFloat();
        this.D = parcel.readLong();
        this.f907g = parcel.readLong();
        this.f909x = parcel.readLong();
        this.B = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.E = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.F = parcel.readLong();
        this.G = parcel.readBundle(b.class.getClassLoader());
        this.f910y = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f905a);
        sb2.append(", position=");
        sb2.append(this.f906d);
        sb2.append(", buffered position=");
        sb2.append(this.f907g);
        sb2.append(", speed=");
        sb2.append(this.f908r);
        sb2.append(", updated=");
        sb2.append(this.D);
        sb2.append(", actions=");
        sb2.append(this.f909x);
        sb2.append(", error code=");
        sb2.append(this.f910y);
        sb2.append(", error message=");
        sb2.append(this.B);
        sb2.append(", custom actions=");
        sb2.append(this.E);
        sb2.append(", active item id=");
        return c7.a.n(this.F, "}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f905a);
        parcel.writeLong(this.f906d);
        parcel.writeFloat(this.f908r);
        parcel.writeLong(this.D);
        parcel.writeLong(this.f907g);
        parcel.writeLong(this.f909x);
        TextUtils.writeToParcel(this.B, parcel, i10);
        parcel.writeTypedList(this.E);
        parcel.writeLong(this.F);
        parcel.writeBundle(this.G);
        parcel.writeInt(this.f910y);
    }
}
