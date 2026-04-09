package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator<BaseSlider$SliderState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public float f11106a;

    /* renamed from: b, reason: collision with root package name */
    public float f11107b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f11108c;

    /* renamed from: d, reason: collision with root package name */
    public float f11109d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11110e;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BaseSlider$SliderState createFromParcel(Parcel parcel) {
            return new BaseSlider$SliderState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BaseSlider$SliderState[] newArray(int i10) {
            return new BaseSlider$SliderState[i10];
        }
    }

    public /* synthetic */ BaseSlider$SliderState(Parcel parcel, com.google.android.material.slider.a aVar) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f11106a);
        parcel.writeFloat(this.f11107b);
        parcel.writeList(this.f11108c);
        parcel.writeFloat(this.f11109d);
        parcel.writeBooleanArray(new boolean[]{this.f11110e});
    }

    public BaseSlider$SliderState(Parcel parcel) {
        super(parcel);
        this.f11106a = parcel.readFloat();
        this.f11107b = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.f11108c = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        this.f11109d = parcel.readFloat();
        this.f11110e = parcel.createBooleanArray()[0];
    }
}
