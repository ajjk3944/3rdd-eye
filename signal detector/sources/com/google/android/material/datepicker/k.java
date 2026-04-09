package com.google.android.material.datepicker;

import G3.C0152f;
import R.F;
import R.O;
import R.s0;
import R.t0;
import R.u0;
import R.v0;
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
import com.apm.insight.R;
import com.google.android.gms.internal.ads.C1401k2;
import com.google.android.material.internal.CheckableImageButton;
import d3.AbstractC2266a;
import d5.y;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k0.DialogInterfaceOnCancelListenerC2610n;
import r3.ViewOnTouchListenerC2877a;

/* loaded from: classes.dex */
public class k<S> extends DialogInterfaceOnCancelListenerC2610n {

    /* renamed from: A0, reason: collision with root package name */
    public final LinkedHashSet f18293A0;

    /* renamed from: B0, reason: collision with root package name */
    public final LinkedHashSet f18294B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f18295C0;

    /* renamed from: D0, reason: collision with root package name */
    public r f18296D0;

    /* renamed from: E0, reason: collision with root package name */
    public b f18297E0;

    /* renamed from: F0, reason: collision with root package name */
    public j f18298F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f18299G0;

    /* renamed from: H0, reason: collision with root package name */
    public CharSequence f18300H0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f18301I0;

    /* renamed from: J0, reason: collision with root package name */
    public int f18302J0;

    /* renamed from: K0, reason: collision with root package name */
    public int f18303K0;

    /* renamed from: L0, reason: collision with root package name */
    public CharSequence f18304L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f18305M0;

    /* renamed from: N0, reason: collision with root package name */
    public CharSequence f18306N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f18307O0;

    /* renamed from: P0, reason: collision with root package name */
    public CharSequence f18308P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f18309Q0;

    /* renamed from: R0, reason: collision with root package name */
    public CharSequence f18310R0;

    /* renamed from: S0, reason: collision with root package name */
    public TextView f18311S0;

    /* renamed from: T0, reason: collision with root package name */
    public CheckableImageButton f18312T0;

    /* renamed from: U0, reason: collision with root package name */
    public G3.j f18313U0;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f18314V0;

    /* renamed from: W0, reason: collision with root package name */
    public CharSequence f18315W0;

    /* renamed from: X0, reason: collision with root package name */
    public CharSequence f18316X0;

    public k() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f18293A0 = new LinkedHashSet();
        this.f18294B0 = new LinkedHashSet();
    }

    public static int h0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = u.b();
        calendarB.set(5, 1);
        Calendar calendarA = u.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean i0(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(y.q(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()).data, new int[]{i});
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z6;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) throws Resources.NotFoundException {
        super.B(bundle);
        if (bundle == null) {
            bundle = this.f21712f;
        }
        this.f18295C0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f18297E0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f18299G0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f18300H0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f18302J0 = bundle.getInt("INPUT_MODE_KEY");
        this.f18303K0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f18304L0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f18305M0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f18306N0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f18307O0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f18308P0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f18309Q0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f18310R0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f18300H0;
        if (text == null) {
            text = R().getResources().getText(this.f18299G0);
        }
        this.f18315W0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f18316X0 = text;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f18301I0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f18301I0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(h0(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(h0(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f18312T0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f18311S0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f18312T0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f18312T0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, a4.t.i(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], a4.t.i(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f18312T0.setChecked(this.f18302J0 != 0);
        O.m(this.f18312T0, null);
        CheckableImageButton checkableImageButton2 = this.f18312T0;
        this.f18312T0.setContentDescription(this.f18302J0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f18312T0.setOnClickListener(new B4.g(28, this));
        g0();
        throw null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void J(Bundle bundle) {
        super.J(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f18295C0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f18297E0;
        a aVar = new a();
        int i = a.f18257b;
        int i3 = a.f18257b;
        long j6 = bVar.f18259a.f18324f;
        long j7 = bVar.f18260b.f18324f;
        aVar.f18258a = Long.valueOf(bVar.f18262d.f18324f);
        int i6 = bVar.f18263e;
        d dVar = bVar.f18261c;
        j jVar = this.f18298F0;
        m mVar = jVar == null ? null : jVar.f18283n0;
        if (mVar != null) {
            aVar.f18258a = Long.valueOf(mVar.f18324f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        m mVarB = m.b(j6);
        m mVarB2 = m.b(j7);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f18258a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(mVarB, mVarB2, dVar2, l2 == null ? null : m.b(l2.longValue()), i6));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f18299G0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f18300H0);
        bundle.putInt("INPUT_MODE_KEY", this.f18302J0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f18303K0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f18304L0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f18305M0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f18306N0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f18307O0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f18308P0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f18309Q0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f18310R0);
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() throws Resources.NotFoundException {
        super.K();
        Window window = c0().getWindow();
        if (this.f18301I0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f18313U0);
            if (!this.f18314V0) {
                View viewFindViewById = S().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListN = R2.a.n(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListN != null ? Integer.valueOf(colorStateListN.getDefaultColor()) : null;
                boolean z6 = false;
                boolean z7 = numValueOf == null || numValueOf.intValue() == 0;
                int iN = com.bumptech.glide.e.n(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z7) {
                    numValueOf = Integer.valueOf(iN);
                }
                com.bumptech.glide.e.x(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                int iE = i < 27 ? J.a.e(com.bumptech.glide.e.n(context, android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iE);
                boolean z8 = com.bumptech.glide.e.s(0) || com.bumptech.glide.e.s(numValueOf.intValue());
                C0152f c0152f = new C0152f(window.getDecorView());
                (i >= 35 ? new v0(window, c0152f) : i >= 30 ? new u0(window, c0152f) : i >= 26 ? new t0(window, c0152f) : new s0(window, c0152f)).D(z8);
                boolean zS = com.bumptech.glide.e.s(iN);
                if (com.bumptech.glide.e.s(iE) || (iE == 0 && zS)) {
                    z6 = true;
                }
                C0152f c0152f2 = new C0152f(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                (i3 >= 35 ? new v0(window, c0152f2) : i3 >= 30 ? new u0(window, c0152f2) : i3 >= 26 ? new t0(window, c0152f2) : new s0(window, c0152f2)).C(z6);
                int paddingTop = viewFindViewById.getPaddingTop();
                int paddingLeft = viewFindViewById.getPaddingLeft();
                int paddingRight = viewFindViewById.getPaddingRight();
                int i6 = viewFindViewById.getLayoutParams().height;
                C1401k2 c1401k2 = new C1401k2();
                c1401k2.f15053a = i6;
                c1401k2.f15057e = viewFindViewById;
                c1401k2.f15054b = paddingLeft;
                c1401k2.f15055c = paddingTop;
                c1401k2.f15056d = paddingRight;
                WeakHashMap weakHashMap = O.f3270a;
                F.k(viewFindViewById, c1401k2);
                this.f18314V0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = q().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f18313U0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC2877a(c0(), rect));
        }
        R();
        int i7 = this.f18295C0;
        if (i7 == 0) {
            g0();
            throw null;
        }
        g0();
        b bVar = this.f18297E0;
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i7);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f18262d);
        jVar.U(bundle);
        this.f18298F0 = jVar;
        r rVar = jVar;
        if (this.f18302J0 == 1) {
            g0();
            b bVar2 = this.f18297E0;
            r lVar = new l();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i7);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            lVar.U(bundle2);
            rVar = lVar;
        }
        this.f18296D0 = rVar;
        this.f18311S0.setText((this.f18302J0 == 1 && q().getConfiguration().orientation == 2) ? this.f18316X0 : this.f18315W0);
        g0();
        throw null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void L() {
        this.f18296D0.f18338k0.clear();
        super.L();
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final Dialog b0(Bundle bundle) {
        Context contextR = R();
        R();
        int i = this.f18295C0;
        if (i == 0) {
            g0();
            throw null;
        }
        Dialog dialog = new Dialog(contextR, i);
        Context context = dialog.getContext();
        this.f18301I0 = i0(context, android.R.attr.windowFullscreen);
        this.f18313U0 = new G3.j(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC2266a.f19768w, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f18313U0.m(context);
        this.f18313U0.q(ColorStateList.valueOf(color));
        this.f18313U0.p(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void g0() {
        if (this.f21712f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f18293A0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f18294B0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f21696T;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
