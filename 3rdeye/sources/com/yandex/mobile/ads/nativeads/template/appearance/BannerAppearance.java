package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.v91;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class BannerAppearance implements Parcelable, v91 {
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final HorizontalOffset f36876b;

    /* renamed from: c, reason: collision with root package name */
    private final HorizontalOffset f36877c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36878d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36879e;

    /* renamed from: f, reason: collision with root package name */
    private final float f36880f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f36881a;

        /* renamed from: b, reason: collision with root package name */
        private int f36882b;

        /* renamed from: c, reason: collision with root package name */
        private float f36883c;

        /* renamed from: d, reason: collision with root package name */
        private HorizontalOffset f36884d;

        /* renamed from: e, reason: collision with root package name */
        private HorizontalOffset f36885e;

        public final BannerAppearance build() {
            return new BannerAppearance(this.f36884d, this.f36885e, this.f36881a, this.f36882b, this.f36883c, null);
        }

        public final Builder setBackgroundColor(int i) {
            this.f36881a = i;
            return this;
        }

        public final Builder setBorderColor(int i) {
            this.f36882b = i;
            return this;
        }

        public final Builder setBorderWidth(float f10) {
            this.f36883c = f10;
            return this;
        }

        public final Builder setContentPadding(HorizontalOffset horizontalOffset) {
            this.f36884d = horizontalOffset;
            return this;
        }

        public final Builder setImageMargins(HorizontalOffset horizontalOffset) {
            this.f36885e = horizontalOffset;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<BannerAppearance> {
        @Override // android.os.Parcelable.Creator
        public final BannerAppearance createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new BannerAppearance(parcel.readInt() == 0 ? null : HorizontalOffset.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HorizontalOffset.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readFloat(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerAppearance[] newArray(int i) {
            return new BannerAppearance[i];
        }
    }

    public /* synthetic */ BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i, int i10, float f10, g gVar) {
        this(horizontalOffset, horizontalOffset2, i, i10, f10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BannerAppearance.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance");
        BannerAppearance bannerAppearance = (BannerAppearance) obj;
        return l.b(getContentPadding(), bannerAppearance.getContentPadding()) && l.b(getImageMargins(), bannerAppearance.getImageMargins()) && getBackgroundColor() == bannerAppearance.getBackgroundColor() && getBorderColor() == bannerAppearance.getBorderColor() && getBorderWidth() == bannerAppearance.getBorderWidth();
    }

    @Override // com.yandex.mobile.ads.impl.v91
    public int getBackgroundColor() {
        return this.f36878d;
    }

    @Override // com.yandex.mobile.ads.impl.v91
    public int getBorderColor() {
        return this.f36879e;
    }

    @Override // com.yandex.mobile.ads.impl.v91
    public float getBorderWidth() {
        return this.f36880f;
    }

    public int hashCode() {
        HorizontalOffset contentPadding = getContentPadding();
        int iHashCode = (contentPadding != null ? contentPadding.hashCode() : 0) * 31;
        HorizontalOffset imageMargins = getImageMargins();
        return Float.floatToIntBits(getBorderWidth()) + ((getBorderColor() + ((getBackgroundColor() + ((iHashCode + (imageMargins != null ? imageMargins.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        l.f(out, "out");
        HorizontalOffset horizontalOffset = this.f36876b;
        if (horizontalOffset == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            horizontalOffset.writeToParcel(out, i);
        }
        HorizontalOffset horizontalOffset2 = this.f36877c;
        if (horizontalOffset2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            horizontalOffset2.writeToParcel(out, i);
        }
        out.writeInt(this.f36878d);
        out.writeInt(this.f36879e);
        out.writeFloat(this.f36880f);
    }

    private BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i, int i10, float f10) {
        this.f36876b = horizontalOffset;
        this.f36877c = horizontalOffset2;
        this.f36878d = i;
        this.f36879e = i10;
        this.f36880f = f10;
    }

    @Override // com.yandex.mobile.ads.impl.v91
    public HorizontalOffset getContentPadding() {
        return this.f36876b;
    }

    @Override // com.yandex.mobile.ads.impl.v91
    public HorizontalOffset getImageMargins() {
        return this.f36877c;
    }
}
