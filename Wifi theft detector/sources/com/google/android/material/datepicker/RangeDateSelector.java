package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
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
public class RangeDateSelector implements DateSelector<r0.e> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f10402a;

    /* renamed from: b, reason: collision with root package name */
    public String f10403b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10404c = " ";

    /* renamed from: d, reason: collision with root package name */
    public Long f10405d = null;

    /* renamed from: e, reason: collision with root package name */
    public Long f10406e = null;

    /* renamed from: f, reason: collision with root package name */
    public Long f10407f = null;

    /* renamed from: g, reason: collision with root package name */
    public Long f10408g = null;

    /* renamed from: h, reason: collision with root package name */
    public SimpleDateFormat f10409h;

    public class a extends e {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f10410i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f10411j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ r f10412k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, r rVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f10410i = textInputLayout2;
            this.f10411j = textInputLayout3;
            this.f10412k = rVar;
        }

        @Override // com.google.android.material.datepicker.e
        public void d() {
            RangeDateSelector.this.f10407f = null;
            RangeDateSelector.this.u(this.f10410i, this.f10411j, this.f10412k);
        }

        @Override // com.google.android.material.datepicker.e
        public void e(Long l10) {
            RangeDateSelector.this.f10407f = l10;
            RangeDateSelector.this.u(this.f10410i, this.f10411j, this.f10412k);
        }
    }

    public class b extends e {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f10414i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f10415j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ r f10416k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, r rVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f10414i = textInputLayout2;
            this.f10415j = textInputLayout3;
            this.f10416k = rVar;
        }

        @Override // com.google.android.material.datepicker.e
        public void d() {
            RangeDateSelector.this.f10408g = null;
            RangeDateSelector.this.u(this.f10414i, this.f10415j, this.f10416k);
        }

        @Override // com.google.android.material.datepicker.e
        public void e(Long l10) {
            RangeDateSelector.this.f10408g = l10;
            RangeDateSelector.this.u(this.f10414i, this.f10415j, this.f10416k);
        }
    }

    public class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f10405d = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f10406e = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i10) {
            return new RangeDateSelector[i10];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String a(Context context) {
        Resources resources = context.getResources();
        r0.e eVarA = j.a(this.f10405d, this.f10406e);
        Object obj = eVarA.f24134a;
        String string = obj == null ? resources.getString(j4.j.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = eVarA.f24135b;
        return resources.getString(j4.j.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(j4.j.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int b(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return d5.b.f(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(j4.d.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? j4.b.materialCalendarTheme : j4.b.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String d(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f10405d;
        if (l10 == null && this.f10406e == null) {
            return resources.getString(j4.j.mtrl_picker_range_header_unselected);
        }
        Long l11 = this.f10406e;
        if (l11 == null) {
            return resources.getString(j4.j.mtrl_picker_range_header_only_start_selected, j.c(l10.longValue()));
        }
        if (l10 == null) {
            return resources.getString(j4.j.mtrl_picker_range_header_only_end_selected, j.c(l11.longValue()));
        }
        r0.e eVarA = j.a(l10, l11);
        return resources.getString(j4.j.mtrl_picker_range_header_selected, eVarA.f24134a, eVarA.f24135b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f10403b.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r0.e(this.f10405d, this.f10406e));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View l(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, r rVar) {
        View viewInflate = layoutInflater.inflate(j4.h.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(j4.f.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(j4.f.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer numF = u4.a.f(viewInflate.getContext(), j4.b.colorOnSurfaceVariant);
        if (numF != null) {
            editText.setHintTextColor(numF.intValue());
            editText2.setHintTextColor(numF.intValue());
        }
        if (com.google.android.material.internal.k.b()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f10403b = viewInflate.getResources().getString(j4.j.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatG = this.f10409h;
        boolean z10 = simpleDateFormatG != null;
        if (!z10) {
            simpleDateFormatG = a0.g();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatG;
        Long l10 = this.f10405d;
        if (l10 != null) {
            editText.setText(simpleDateFormat.format(l10));
            this.f10407f = this.f10405d;
        }
        Long l11 = this.f10406e;
        if (l11 != null) {
            editText2.setText(simpleDateFormat.format(l11));
            this.f10408g = this.f10406e;
        }
        String pattern = z10 ? simpleDateFormat.toPattern() : a0.h(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, rVar));
        editText2.addTextChangedListener(new b(pattern, simpleDateFormat, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, rVar));
        if (!h.a(viewInflate.getContext())) {
            h.d(editText, editText2);
        }
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean m() {
        Long l10 = this.f10405d;
        return (l10 == null || this.f10406e == null || !r(l10.longValue(), this.f10406e.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection n() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f10405d;
        if (l10 != null) {
            arrayList.add(l10);
        }
        Long l11 = this.f10406e;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void p(long j10) {
        Long l10 = this.f10405d;
        if (l10 == null) {
            this.f10405d = Long.valueOf(j10);
        } else if (this.f10406e == null && r(l10.longValue(), j10)) {
            this.f10406e = Long.valueOf(j10);
        } else {
            this.f10406e = null;
            this.f10405d = Long.valueOf(j10);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public r0.e o() {
        return new r0.e(this.f10405d, this.f10406e);
    }

    public final boolean r(long j10, long j11) {
        return j10 <= j11;
    }

    public final void s(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f10403b);
        textInputLayout2.setError(" ");
    }

    public final void t(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f10402a = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f10402a = null;
        } else {
            this.f10402a = textInputLayout2.getError();
        }
    }

    public final void u(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, r rVar) {
        Long l10 = this.f10407f;
        if (l10 == null || this.f10408g == null) {
            j(textInputLayout, textInputLayout2);
            rVar.a();
        } else if (r(l10.longValue(), this.f10408g.longValue())) {
            this.f10405d = this.f10407f;
            this.f10406e = this.f10408g;
            rVar.b(o());
        } else {
            s(textInputLayout, textInputLayout2);
            rVar.a();
        }
        t(textInputLayout, textInputLayout2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f10405d);
        parcel.writeValue(this.f10406e);
    }
}
