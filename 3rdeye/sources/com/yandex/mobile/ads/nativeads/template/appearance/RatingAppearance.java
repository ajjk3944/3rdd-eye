package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.z91;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class RatingAppearance implements Parcelable, z91 {
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final int f36924b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36925c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f36926a;

        /* renamed from: b, reason: collision with root package name */
        private int f36927b;

        public final RatingAppearance build() {
            return new RatingAppearance(this.f36926a, this.f36927b, null);
        }

        public final Builder setBackgroundStarColor(int i) {
            this.f36926a = i;
            return this;
        }

        public final Builder setProgressStarColor(int i) {
            this.f36927b = i;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<RatingAppearance> {
        @Override // android.os.Parcelable.Creator
        public final RatingAppearance createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new RatingAppearance(parcel.readInt(), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAppearance[] newArray(int i) {
            return new RatingAppearance[i];
        }
    }

    public /* synthetic */ RatingAppearance(int i, int i10, g gVar) {
        this(i, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RatingAppearance.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance");
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        return getBackgroundStarColor() == ratingAppearance.getBackgroundStarColor() && getProgressStarColor() == ratingAppearance.getProgressStarColor();
    }

    @Override // com.yandex.mobile.ads.impl.z91
    public int getBackgroundStarColor() {
        return this.f36924b;
    }

    @Override // com.yandex.mobile.ads.impl.z91
    public int getProgressStarColor() {
        return this.f36925c;
    }

    public int hashCode() {
        return getProgressStarColor() + (getBackgroundStarColor() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        l.f(out, "out");
        out.writeInt(this.f36924b);
        out.writeInt(this.f36925c);
    }

    private RatingAppearance(int i, int i10) {
        this.f36924b = i;
        this.f36925c = i10;
    }
}
