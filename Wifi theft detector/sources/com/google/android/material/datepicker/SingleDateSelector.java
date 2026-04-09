package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.RestrictTo;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f10418a;

    /* renamed from: b, reason: collision with root package name */
    public Long f10419b;

    /* renamed from: c, reason: collision with root package name */
    public SimpleDateFormat f10420c;

    public class a extends e {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ r f10421i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f10422j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, r rVar, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f10421i = rVar;
            this.f10422j = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.e
        public void d() {
            SingleDateSelector.this.f10418a = this.f10422j.getError();
            this.f10421i.a();
        }

        @Override // com.google.android.material.datepicker.e
        public void e(Long l10) {
            if (l10 == null) {
                SingleDateSelector.this.h();
            } else {
                SingleDateSelector.this.p(l10.longValue());
            }
            SingleDateSelector.this.f10418a = null;
            this.f10421i.b(SingleDateSelector.this.o());
        }
    }

    public class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f10419b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector[] newArray(int i10) {
            return new SingleDateSelector[i10];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String a(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f10419b;
        return resources.getString(j4.j.mtrl_picker_announce_current_selection, l10 == null ? resources.getString(j4.j.mtrl_picker_announce_current_selection_none) : j.m(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int b(Context context) {
        return d5.b.f(context, j4.b.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String d(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f10419b;
        if (l10 == null) {
            return resources.getString(j4.j.mtrl_picker_date_header_unselected);
        }
        return resources.getString(j4.j.mtrl_picker_date_header_selected, j.m(l10.longValue()));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void h() {
        this.f10419b = null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Long o() {
        return this.f10419b;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection k() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View l(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, r rVar) {
        View viewInflate = layoutInflater.inflate(j4.h.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(j4.f.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer numF = u4.a.f(viewInflate.getContext(), j4.b.colorOnSurfaceVariant);
        if (numF != null) {
            editText.setHintTextColor(numF.intValue());
        }
        if (com.google.android.material.internal.k.b()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatG = this.f10420c;
        boolean z10 = simpleDateFormatG != null;
        if (!z10) {
            simpleDateFormatG = a0.g();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatG;
        String pattern = z10 ? simpleDateFormat.toPattern() : a0.h(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l10 = this.f10419b;
        if (l10 != null) {
            editText.setText(simpleDateFormat.format(l10));
        }
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, rVar, textInputLayout));
        if (!h.a(viewInflate.getContext())) {
            h.d(editText);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean m() {
        return this.f10419b != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection n() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f10419b;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void p(long j10) {
        this.f10419b = Long.valueOf(j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f10419b);
    }
}
