package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.y91;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class ImageAppearance implements Parcelable, y91 {
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final SizeConstraint f36896b;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private SizeConstraint f36897a;

        public final ImageAppearance build() {
            return new ImageAppearance(this.f36897a, null);
        }

        public final Builder setWidthConstraint(SizeConstraint sizeConstraint) {
            this.f36897a = sizeConstraint;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<ImageAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ImageAppearance createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new ImageAppearance(parcel.readInt() == 0 ? null : SizeConstraint.CREATOR.createFromParcel(parcel), null);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAppearance[] newArray(int i) {
            return new ImageAppearance[i];
        }
    }

    public /* synthetic */ ImageAppearance(SizeConstraint sizeConstraint, g gVar) {
        this(sizeConstraint);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ImageAppearance.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance");
        return l.b(getWidthConstraint(), ((ImageAppearance) obj).getWidthConstraint());
    }

    public int hashCode() {
        SizeConstraint widthConstraint = getWidthConstraint();
        if (widthConstraint != null) {
            return widthConstraint.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        l.f(out, "out");
        SizeConstraint sizeConstraint = this.f36896b;
        if (sizeConstraint == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sizeConstraint.writeToParcel(out, i);
        }
    }

    private ImageAppearance(SizeConstraint sizeConstraint) {
        this.f36896b = sizeConstraint;
    }

    @Override // com.yandex.mobile.ads.impl.y91
    public SizeConstraint getWidthConstraint() {
        return this.f36896b;
    }
}
