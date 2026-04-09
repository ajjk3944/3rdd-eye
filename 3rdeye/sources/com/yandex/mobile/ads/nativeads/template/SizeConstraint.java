package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.c;
import com.yandex.mobile.ads.impl.aa1;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class SizeConstraint implements Parcelable, aa1 {
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final SizeConstraintType f36872b;

    /* renamed from: c, reason: collision with root package name */
    private final float f36873c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SizeConstraintType implements aa1.b {
        public static final SizeConstraintType FIXED;
        public static final SizeConstraintType FIXED_RATIO;
        public static final SizeConstraintType PREFERRED_RATIO;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ SizeConstraintType[] f36874c;

        /* renamed from: b, reason: collision with root package name */
        private final aa1.a f36875b;

        static {
            SizeConstraintType sizeConstraintType = new SizeConstraintType("FIXED", 0, aa1.a.f24579b);
            FIXED = sizeConstraintType;
            SizeConstraintType sizeConstraintType2 = new SizeConstraintType("FIXED_RATIO", 1, aa1.a.f24580c);
            FIXED_RATIO = sizeConstraintType2;
            SizeConstraintType sizeConstraintType3 = new SizeConstraintType("PREFERRED_RATIO", 2, aa1.a.f24581d);
            PREFERRED_RATIO = sizeConstraintType3;
            SizeConstraintType[] sizeConstraintTypeArr = {sizeConstraintType, sizeConstraintType2, sizeConstraintType3};
            f36874c = sizeConstraintTypeArr;
            c.l(sizeConstraintTypeArr);
        }

        private SizeConstraintType(String str, int i, aa1.a aVar) {
            this.f36875b = aVar;
        }

        public static SizeConstraintType valueOf(String str) {
            return (SizeConstraintType) Enum.valueOf(SizeConstraintType.class, str);
        }

        public static SizeConstraintType[] values() {
            return (SizeConstraintType[]) f36874c.clone();
        }

        @Override // com.yandex.mobile.ads.impl.aa1.b
        public final aa1.a getType() {
            return this.f36875b;
        }
    }

    public static final class a implements Parcelable.Creator<SizeConstraint> {
        @Override // android.os.Parcelable.Creator
        public final SizeConstraint createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new SizeConstraint(SizeConstraintType.valueOf(parcel.readString()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final SizeConstraint[] newArray(int i) {
            return new SizeConstraint[i];
        }
    }

    public SizeConstraint(SizeConstraintType sizeConstraintType, float f10) {
        l.f(sizeConstraintType, "sizeConstraintType");
        this.f36872b = sizeConstraintType;
        this.f36873c = f10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SizeConstraint.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.SizeConstraint");
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        return getSizeConstraintType() == sizeConstraint.getSizeConstraintType() && getValue() == sizeConstraint.getValue();
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    public float getValue() {
        return this.f36873c;
    }

    public int hashCode() {
        return Float.floatToIntBits(getValue()) + (getSizeConstraintType().hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        l.f(out, "out");
        out.writeString(this.f36872b.name());
        out.writeFloat(this.f36873c);
    }

    @Override // com.yandex.mobile.ads.impl.aa1
    public SizeConstraintType getSizeConstraintType() {
        return this.f36872b;
    }
}
