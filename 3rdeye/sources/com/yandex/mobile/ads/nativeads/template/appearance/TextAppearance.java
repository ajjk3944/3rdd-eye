package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ba1;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class TextAppearance implements Parcelable, ba1 {
    public static final Parcelable.Creator<TextAppearance> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final int f36928b;

    /* renamed from: c, reason: collision with root package name */
    private final float f36929c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36930d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36931e;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f36932a;

        /* renamed from: b, reason: collision with root package name */
        private float f36933b;

        /* renamed from: c, reason: collision with root package name */
        private int f36934c;

        /* renamed from: d, reason: collision with root package name */
        private String f36935d;

        public final TextAppearance build() {
            return new TextAppearance(this.f36932a, this.f36933b, this.f36934c, this.f36935d, null);
        }

        public final Builder setFontFamilyName(String str) {
            this.f36935d = str;
            return this;
        }

        public final Builder setFontStyle(int i) {
            this.f36934c = i;
            return this;
        }

        public final Builder setTextColor(int i) {
            this.f36932a = i;
            return this;
        }

        public final Builder setTextSize(float f10) {
            this.f36933b = f10;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<TextAppearance> {
        @Override // android.os.Parcelable.Creator
        public final TextAppearance createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new TextAppearance(parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAppearance[] newArray(int i) {
            return new TextAppearance[i];
        }
    }

    public /* synthetic */ TextAppearance(int i, float f10, int i10, String str, g gVar) {
        this(i, f10, i10, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TextAppearance.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance");
        TextAppearance textAppearance = (TextAppearance) obj;
        if (getTextColor() == textAppearance.getTextColor() && getTextSize() == textAppearance.getTextSize() && getFontStyle() == textAppearance.getFontStyle()) {
            return l.b(getFontFamilyName(), textAppearance.getFontFamilyName());
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.ba1
    public String getFontFamilyName() {
        return this.f36931e;
    }

    @Override // com.yandex.mobile.ads.impl.ba1
    public int getFontStyle() {
        return this.f36930d;
    }

    @Override // com.yandex.mobile.ads.impl.ba1
    public int getTextColor() {
        return this.f36928b;
    }

    @Override // com.yandex.mobile.ads.impl.ba1
    public float getTextSize() {
        return this.f36929c;
    }

    public int hashCode() {
        int fontStyle = (getFontStyle() + ((Float.floatToIntBits(getTextSize()) + (getTextColor() * 31)) * 31)) * 31;
        String fontFamilyName = getFontFamilyName();
        return fontStyle + (fontFamilyName != null ? fontFamilyName.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        l.f(out, "out");
        out.writeInt(this.f36928b);
        out.writeFloat(this.f36929c);
        out.writeInt(this.f36930d);
        out.writeString(this.f36931e);
    }

    private TextAppearance(int i, float f10, int i10, String str) {
        this.f36928b = i;
        this.f36929c = f10;
        this.f36930d = i10;
        this.f36931e = str;
    }
}
