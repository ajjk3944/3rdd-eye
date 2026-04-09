package com.google.android.material.datepicker;

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
import com.google.android.gms.internal.ads.l5;
import com.google.android.material.internal.CheckableImageButton;
import com.liuzh.deviceinfo.R;
import e4.d2;
import e4.e2;
import e4.f2;
import e4.h2;
import e4.m0;
import e4.v0;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class m<S> extends b5.s {
    public CharSequence A0;
    public int B0;
    public CharSequence C0;
    public int D0;
    public CharSequence E0;
    public int F0;
    public CharSequence G0;
    public TextView H0;
    public CheckableImageButton I0;
    public ed.j J0;
    public boolean K0;
    public CharSequence L0;
    public CharSequence M0;

    /* renamed from: p0, reason: collision with root package name */
    public final LinkedHashSet f20477p0;

    /* renamed from: q0, reason: collision with root package name */
    public final LinkedHashSet f20478q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f20479r0;

    /* renamed from: s0, reason: collision with root package name */
    public t f20480s0;

    /* renamed from: t0, reason: collision with root package name */
    public b f20481t0;

    /* renamed from: u0, reason: collision with root package name */
    public l f20482u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f20483v0;

    /* renamed from: w0, reason: collision with root package name */
    public CharSequence f20484w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f20485x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f20486y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f20487z0;

    public m() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f20477p0 = new LinkedHashSet();
        this.f20478q0 = new LinkedHashSet();
    }

    public static int k0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = w.b();
        calendarB.set(5, 1);
        Calendar calendarA = w.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean l0(int i4, Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ii.a.B(context, R.attr.materialCalendarStyle, l.class.getCanonicalName()).data, new int[]{i4});
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z3;
    }

    @Override // b5.s, b5.z
    public final void F(Bundle bundle) throws Resources.NotFoundException {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.g;
        }
        this.f20479r0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f20481t0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f20483v0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f20484w0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f20486y0 = bundle.getInt("INPUT_MODE_KEY");
        this.f20487z0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.A0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.B0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.C0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.D0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.E0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.F0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.G0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f20484w0;
        if (text == null) {
            text = W().getResources().getText(this.f20483v0);
        }
        this.L0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.M0 = text;
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f20485x0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f20485x0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(k0(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(k0(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.I0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.H0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.I0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.I0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, jm.a.l(R.drawable.material_ic_calendar_black_24dp, context));
        stateListDrawable.addState(new int[0], jm.a.l(R.drawable.material_ic_edit_black_24dp, context));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.I0.setChecked(this.f20486y0 != 0);
        v0.o(this.I0, null);
        CheckableImageButton checkableImageButton2 = this.I0;
        this.I0.setContentDescription(this.f20486y0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.I0.setOnClickListener(new com.applovin.mediation.nativeAds.a(1, this));
        j0();
        throw null;
    }

    @Override // b5.s, b5.z
    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f20479r0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f20481t0;
        a aVar = new a();
        int i4 = a.f20437b;
        int i10 = a.f20437b;
        long j = bVar.f20439a.f20495f;
        long j8 = bVar.f20440b.f20495f;
        aVar.f20438a = Long.valueOf(bVar.f20442d.f20495f);
        int i11 = bVar.f20443e;
        d dVar = bVar.f20441c;
        l lVar = this.f20482u0;
        o oVar = lVar == null ? null : lVar.f20466c0;
        if (oVar != null) {
            aVar.f20438a = Long.valueOf(oVar.f20495f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        o oVarB = o.b(j);
        o oVarB2 = o.b(j8);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = aVar.f20438a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(oVarB, oVarB2, dVar2, l10 == null ? null : o.b(l10.longValue()), i11));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f20483v0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f20484w0);
        bundle.putInt("INPUT_MODE_KEY", this.f20486y0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f20487z0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.A0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.B0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.C0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.D0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.E0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.F0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.G0);
    }

    @Override // b5.s, b5.z
    public final void P() throws Resources.NotFoundException {
        super.P();
        Dialog dialog = this.f1867k0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f20485x0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.J0);
            if (!this.K0) {
                View viewFindViewById = X().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListA = a4.l.a(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
                boolean z3 = false;
                boolean z10 = numValueOf == null || numValueOf.intValue() == 0;
                int iJ = i0.j(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z10) {
                    numValueOf = Integer.valueOf(iJ);
                }
                com.bumptech.glide.f.A(window, false);
                window.getContext();
                Context context = window.getContext();
                int i4 = Build.VERSION.SDK_INT;
                int iD = i4 < 27 ? v3.a.d(i0.j(context, android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iD);
                boolean z11 = i0.m(0) || i0.m(numValueOf.intValue());
                o7.c cVar = new o7.c(window.getDecorView());
                (i4 >= 35 ? new h2(window, cVar) : i4 >= 30 ? new f2(window, cVar) : i4 >= 26 ? new e2(window, cVar) : new d2(window, cVar)).w(z11);
                boolean zM = i0.m(iJ);
                if (i0.m(iD) || (iD == 0 && zM)) {
                    z3 = true;
                }
                o7.c cVar2 = new o7.c(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                (i10 >= 35 ? new h2(window, cVar2) : i10 >= 30 ? new f2(window, cVar2) : i10 >= 26 ? new e2(window, cVar2) : new d2(window, cVar2)).v(z3);
                int paddingTop = viewFindViewById.getPaddingTop();
                int paddingLeft = viewFindViewById.getPaddingLeft();
                int paddingRight = viewFindViewById.getPaddingRight();
                int i11 = viewFindViewById.getLayoutParams().height;
                l5 l5Var = new l5();
                l5Var.f13372a = i11;
                l5Var.f13376e = viewFindViewById;
                l5Var.f13373b = paddingLeft;
                l5Var.f13374c = paddingTop;
                l5Var.f13375d = paddingRight;
                WeakHashMap weakHashMap = v0.f22405a;
                m0.j(viewFindViewById, l5Var);
                this.K0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = t().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.J0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1867k0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new uc.a(dialog2, rect));
        }
        W();
        int i12 = this.f20479r0;
        if (i12 == 0) {
            j0();
            throw null;
        }
        j0();
        b bVar = this.f20481t0;
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i12);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f20442d);
        lVar.Z(bundle);
        this.f20482u0 = lVar;
        t tVar = lVar;
        if (this.f20486y0 == 1) {
            j0();
            b bVar2 = this.f20481t0;
            t nVar = new n();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i12);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            nVar.Z(bundle2);
            tVar = nVar;
        }
        this.f20480s0 = tVar;
        this.H0.setText((this.f20486y0 == 1 && t().getConfiguration().orientation == 2) ? this.M0 : this.L0);
        j0();
        throw null;
    }

    @Override // b5.s, b5.z
    public final void Q() {
        this.f20480s0.Z.clear();
        super.Q();
    }

    @Override // b5.s
    public final Dialog e0(Bundle bundle) {
        Context contextW = W();
        W();
        int i4 = this.f20479r0;
        if (i4 == 0) {
            j0();
            throw null;
        }
        Dialog dialog = new Dialog(contextW, i4);
        Context context = dialog.getContext();
        this.f20485x0 = l0(android.R.attr.windowFullscreen, context);
        this.J0 = new ed.j(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ic.a.f25958s, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.J0.l(context);
        this.J0.o(ColorStateList.valueOf(color));
        this.J0.n(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void j0() {
        if (this.g.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // b5.s, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f20477p0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // b5.s, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f20478q0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.H;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
