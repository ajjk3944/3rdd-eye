package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.w91;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class ButtonAppearance implements Parcelable, w91 {
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final TextAppearance f36886b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36887c;

    /* renamed from: d, reason: collision with root package name */
    private final float f36888d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36889e;

    /* renamed from: f, reason: collision with root package name */
    private final int f36890f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f36891a;

        /* renamed from: b, reason: collision with root package name */
        private float f36892b;

        /* renamed from: c, reason: collision with root package name */
        private int f36893c;

        /* renamed from: d, reason: collision with root package name */
        private int f36894d;

        /* renamed from: e, reason: collision with root package name */
        private TextAppearance f36895e;

        public final ButtonAppearance build() {
            return new ButtonAppearance(this.f36895e, this.f36891a, this.f36892b, this.f36893c, this.f36894d, null);
        }

        public final Builder setBorderColor(int i) {
            this.f36891a = i;
            return this;
        }

        public final Builder setBorderWidth(float f10) {
            this.f36892b = f10;
            return this;
        }

        public final Builder setNormalColor(int i) {
            this.f36893c = i;
            return this;
        }

        public final Builder setPressedColor(int i) {
            this.f36894d = i;
            return this;
        }

        public final Builder setTextAppearance(TextAppearance textAppearance) {
            this.f36895e = textAppearance;
            return this;
        }
    }

    public static final class a implements Parcelable.Creator<ButtonAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new ButtonAppearance(parcel.readInt() == 0 ? null : TextAppearance.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance[] newArray(int i) {
            return new ButtonAppearance[i];
        }
    }

    public /* synthetic */ ButtonAppearance(TextAppearance textAppearance, int i, float f10, int i10, int i11, g gVar) {
        this(textAppearance, i, f10, i10, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ButtonAppearance.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ButtonAppearance");
        ButtonAppearance buttonAppearance = (ButtonAppearance) obj;
        return l.b(getTextAppearance(), buttonAppearance.getTextAppearance()) && getBorderColor() == buttonAppearance.getBorderColor() && getBorderWidth() == buttonAppearance.getBorderWidth() && getNormalColor() == buttonAppearance.getNormalColor() && getPressedColor() == buttonAppearance.getPressedColor();
    }

    @Override // com.yandex.mobile.ads.impl.w91
    public int getBorderColor() {
        return this.f36887c;
    }

    @Override // com.yandex.mobile.ads.impl.w91
    public float getBorderWidth() {
        return this.f36888d;
    }

    @Override // com.yandex.mobile.ads.impl.w91
    public int getNormalColor() {
        return this.f36889e;
    }

    @Override // com.yandex.mobile.ads.impl.w91
    public int getPressedColor() {
        return this.f36890f;
    }

    public int hashCode() {
        TextAppearance textAppearance = getTextAppearance();
        return getPressedColor() + ((getNormalColor() + ((Float.floatToIntBits(getBorderWidth()) + ((getBorderColor() + ((textAppearance != null ? textAppearance.hashCode() : 0) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        l.f(out, "out");
        TextAppearance textAppearance = this.f36886b;
        if (textAppearance == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textAppearance.writeToParcel(out, i);
        }
        out.writeInt(this.f36887c);
        out.writeFloat(this.f36888d);
        out.writeInt(this.f36889e);
        out.writeInt(this.f36890f);
    }

    private ButtonAppearance(TextAppearance textAppearance, int i, float f10, int i10, int i11) {
        this.f36886b = textAppearance;
        this.f36887c = i;
        this.f36888d = f10;
        this.f36889e = i10;
        this.f36890f = i11;
    }

    @Override // com.yandex.mobile.ads.impl.w91
    public TextAppearance getTextAppearance() {
        return this.f36886b;
    }
}
