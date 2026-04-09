package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class e extends com.google.android.material.internal.z {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f10447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10448b;

    /* renamed from: c, reason: collision with root package name */
    public final DateFormat f10449c;

    /* renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f10450d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10451e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f10452f;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f10453g;

    /* renamed from: h, reason: collision with root package name */
    public int f10454h = 0;

    public e(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f10448b = str;
        this.f10449c = dateFormat;
        this.f10447a = textInputLayout;
        this.f10450d = calendarConstraints;
        this.f10451e = textInputLayout.getContext().getString(j4.j.mtrl_picker_out_of_range);
        this.f10452f = new Runnable() { // from class: com.google.android.material.datepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f10443a, str);
            }
        };
    }

    public static /* synthetic */ void a(e eVar, long j10) {
        eVar.getClass();
        eVar.f10447a.setError(String.format(eVar.f10451e, eVar.g(j.c(j10))));
        eVar.d();
    }

    public static /* synthetic */ void b(e eVar, String str) {
        TextInputLayout textInputLayout = eVar.f10447a;
        DateFormat dateFormat = eVar.f10449c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(j4.j.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(j4.j.mtrl_picker_invalid_format_use), eVar.g(str)) + "\n" + String.format(context.getString(j4.j.mtrl_picker_invalid_format_example), eVar.g(dateFormat.format(new Date(a0.p().getTimeInMillis())))));
        eVar.d();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f10448b.length() && editable.length() >= this.f10454h) {
            char cCharAt = this.f10448b.charAt(editable.length());
            if (Character.isLetterOrDigit(cCharAt)) {
                return;
            }
            editable.append(cCharAt);
        }
    }

    @Override // com.google.android.material.internal.z, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f10454h = charSequence.length();
    }

    public final Runnable c(final long j10) {
        return new Runnable() { // from class: com.google.android.material.datepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                e.a(this.f10445a, j10);
            }
        };
    }

    public abstract void d();

    public abstract void e(Long l10);

    public void f(View view, Runnable runnable) {
        view.post(runnable);
    }

    public final String g(String str) {
        return str.replace(' ', (char) 160);
    }

    @Override // com.google.android.material.internal.z, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) throws ParseException {
        this.f10447a.removeCallbacks(this.f10452f);
        this.f10447a.removeCallbacks(this.f10453g);
        this.f10447a.setError(null);
        e(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f10448b.length()) {
            return;
        }
        try {
            Date date = this.f10449c.parse(charSequence.toString());
            this.f10447a.setError(null);
            long time = date.getTime();
            if (this.f10450d.q().f(time) && this.f10450d.x(time)) {
                e(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableC = c(time);
            this.f10453g = runnableC;
            f(this.f10447a, runnableC);
        } catch (ParseException unused) {
            f(this.f10447a, this.f10452f);
        }
    }
}
