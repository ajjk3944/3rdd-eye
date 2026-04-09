package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import lf.t1;
import u3.i0;
import u3.i1;
import u3.j1;
import u3.k1;
import u3.l1;

/* loaded from: classes.dex */
public class o<S> extends o4.p {
    public final LinkedHashSet M0;
    public final LinkedHashSet N0;
    public int O0;
    public v P0;
    public CalendarConstraints Q0;
    public m R0;
    public int S0;
    public CharSequence T0;
    public boolean U0;
    public int V0;
    public int W0;
    public CharSequence X0;
    public int Y0;
    public CharSequence Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f5613a1;

    /* renamed from: b1, reason: collision with root package name */
    public CharSequence f5614b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f5615c1;

    /* renamed from: d1, reason: collision with root package name */
    public CharSequence f5616d1;

    /* renamed from: e1, reason: collision with root package name */
    public TextView f5617e1;

    /* renamed from: f1, reason: collision with root package name */
    public CheckableImageButton f5618f1;

    /* renamed from: g1, reason: collision with root package name */
    public ee.i f5619g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f5620h1;

    /* renamed from: i1, reason: collision with root package name */
    public CharSequence f5621i1;

    /* renamed from: j1, reason: collision with root package name */
    public CharSequence f5622j1;

    public o() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.M0 = new LinkedHashSet();
        this.N0 = new LinkedHashSet();
    }

    public static int l0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ed.d.mtrl_calendar_content_padding);
        Month month = new Month(y.b());
        int dimensionPixelSize = resources.getDimensionPixelSize(ed.d.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(ed.d.mtrl_calendar_month_horizontal_padding);
        int i10 = month.f5583r;
        return ((i10 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i10) + (dimensionPixelOffset * 2);
    }

    public static boolean m0(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(xu.d.e0(ed.b.materialCalendarStyle, context, m.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    @Override // o4.p, androidx.fragment.app.b
    public final void D(Bundle bundle) throws Resources.NotFoundException {
        super.D(bundle);
        if (bundle == null) {
            bundle = this.B;
        }
        this.O0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.Q0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.S0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.T0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.V0 = bundle.getInt("INPUT_MODE_KEY");
        this.W0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.X0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.Y0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.Z0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f5613a1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f5614b1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f5615c1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5616d1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.T0;
        if (text == null) {
            text = X().getResources().getText(this.S0);
        }
        this.f5621i1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f5622j1 = text;
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.U0 ? ed.h.mtrl_picker_fullscreen : ed.h.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.U0) {
            viewInflate.findViewById(ed.f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(l0(context), -2));
        } else {
            viewInflate.findViewById(ed.f.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(l0(context), -1));
        }
        ((TextView) viewInflate.findViewById(ed.f.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f5618f1 = (CheckableImageButton) viewInflate.findViewById(ed.f.mtrl_picker_header_toggle);
        this.f5617e1 = (TextView) viewInflate.findViewById(ed.f.mtrl_picker_title_text);
        this.f5618f1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f5618f1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, ic.a.r(context, ed.e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], ic.a.r(context, ed.e.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f5618f1.setChecked(this.V0 != 0);
        i0.n(this.f5618f1, null);
        CheckableImageButton checkableImageButton2 = this.f5618f1;
        this.f5618f1.setContentDescription(this.V0 == 1 ? checkableImageButton2.getContext().getString(ed.j.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(ed.j.mtrl_picker_toggle_to_text_input_mode));
        this.f5618f1.setOnClickListener(new am.b(4, this));
        k0();
        throw null;
    }

    @Override // o4.p, androidx.fragment.app.b
    public final void P(Bundle bundle) {
        super.P(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.O0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CalendarConstraints calendarConstraints = this.Q0;
        b bVar = new b();
        int i10 = b.f5587b;
        int i11 = b.f5587b;
        long j = calendarConstraints.f5572a.f5585y;
        long j7 = calendarConstraints.f5573d.f5585y;
        bVar.f5588a = Long.valueOf(calendarConstraints.f5575r.f5585y);
        int i12 = calendarConstraints.f5576x;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.f5574g;
        m mVar = this.R0;
        Month month = mVar == null ? null : mVar.f5606z0;
        if (month != null) {
            bVar.f5588a = Long.valueOf(month.f5585y);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month monthE = Month.e(j);
        Month monthE2 = Month.e(j7);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.f5588a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(monthE, monthE2, dateValidator2, l10 == null ? null : Month.e(l10.longValue()), i12));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.S0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.T0);
        bundle.putInt("INPUT_MODE_KEY", this.V0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.W0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.X0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.Y0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.Z0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f5613a1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f5614b1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5615c1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5616d1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [u3.k1] */
    /* JADX WARN: Type inference failed for: r1v34, types: [u3.k1] */
    /* JADX WARN: Type inference failed for: r8v10, types: [u3.k1] */
    /* JADX WARN: Type inference failed for: r8v13, types: [u3.k1] */
    @Override // o4.p, androidx.fragment.app.b
    public final void Q() throws Resources.NotFoundException {
        i1 j1Var;
        i1 j1Var2;
        super.Q();
        Dialog dialog = this.H0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.U0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f5619g1);
            if (!this.f5620h1) {
                View viewFindViewById = Y().findViewById(ed.f.fullscreen_header);
                ColorStateList colorStateListY = ba.m.y(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListY != null ? Integer.valueOf(colorStateListY.getDefaultColor()) : null;
                boolean z10 = false;
                boolean z11 = numValueOf == null || numValueOf.intValue() == 0;
                int iU = io.sentry.config.a.U(window.getContext(), R.attr.colorBackground, -16777216);
                if (z11) {
                    numValueOf = Integer.valueOf(iU);
                }
                t1.E(window, false);
                window.getContext();
                int iD = Build.VERSION.SDK_INT < 27 ? k3.c.d(io.sentry.config.a.U(window.getContext(), R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iD);
                boolean z12 = io.sentry.config.a.a0(0) || io.sentry.config.a.a0(numValueOf.intValue());
                df.c cVar = new df.c(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 35) {
                    ?? l1Var = new l1(window.getInsetsController(), cVar);
                    l1Var.f23191c = window;
                    j1Var = l1Var;
                } else if (i10 >= 30) {
                    ?? k1Var = new k1(window.getInsetsController(), cVar);
                    k1Var.f23191c = window;
                    j1Var = k1Var;
                } else {
                    j1Var = i10 >= 26 ? new j1(window, cVar) : new i1(window, cVar);
                }
                j1Var.N(z12);
                boolean zA0 = io.sentry.config.a.a0(iU);
                if (io.sentry.config.a.a0(iD) || (iD == 0 && zA0)) {
                    z10 = true;
                }
                df.c cVar2 = new df.c(window.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 35) {
                    ?? l1Var2 = new l1(window.getInsetsController(), cVar2);
                    l1Var2.f23191c = window;
                    j1Var2 = l1Var2;
                } else if (i11 >= 30) {
                    ?? k1Var2 = new k1(window.getInsetsController(), cVar2);
                    k1Var2.f23191c = window;
                    j1Var2 = k1Var2;
                } else {
                    j1Var2 = i11 >= 26 ? new j1(window, cVar2) : new i1(window, cVar2);
                }
                j1Var2.M(z10);
                n nVar = new n(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = i0.f23177a;
                u3.z.j(viewFindViewById, nVar);
                this.f5620h1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = q().getDimensionPixelOffset(ed.d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f5619g1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.H0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new sd.a(dialog2, rect));
        }
        X();
        int i12 = this.O0;
        if (i12 == 0) {
            k0();
            throw null;
        }
        k0();
        CalendarConstraints calendarConstraints = this.Q0;
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i12);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f5575r);
        mVar.a0(bundle);
        this.R0 = mVar;
        v vVar = mVar;
        if (this.V0 == 1) {
            k0();
            CalendarConstraints calendarConstraints2 = this.Q0;
            v pVar = new p();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i12);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            pVar.a0(bundle2);
            vVar = pVar;
        }
        this.P0 = vVar;
        this.f5617e1.setText((this.V0 == 1 && q().getConfiguration().orientation == 2) ? this.f5622j1 : this.f5621i1);
        k0();
        throw null;
    }

    @Override // o4.p, androidx.fragment.app.b
    public final void R() {
        this.P0.f5638w0.clear();
        super.R();
    }

    @Override // o4.p
    public final Dialog h0() {
        Context contextX = X();
        X();
        int i10 = this.O0;
        if (i10 == 0) {
            k0();
            throw null;
        }
        Dialog dialog = new Dialog(contextX, i10);
        Context context = dialog.getContext();
        this.U0 = m0(context, R.attr.windowFullscreen);
        this.f5619g1 = new ee.i(context, null, ed.b.materialCalendarStyle, ed.k.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ed.l.MaterialCalendar, ed.b.materialCalendarStyle, ed.k.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(ed.l.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f5619g1.m(context);
        this.f5619g1.q(ColorStateList.valueOf(color));
        this.f5619g1.p(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void k0() {
        if (this.B.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // o4.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.M0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // o4.p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.N0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1413e0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
