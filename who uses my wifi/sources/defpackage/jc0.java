package defpackage;

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
import com.google.android.material.internal.CheckableImageButton;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class jc0<S> extends xo {
    public CharSequence A0;
    public int B0;
    public CharSequence C0;
    public int D0;
    public CharSequence E0;
    public int F0;
    public CharSequence G0;
    public TextView H0;
    public CheckableImageButton I0;
    public nc0 J0;
    public boolean K0;
    public CharSequence L0;
    public CharSequence M0;
    public final LinkedHashSet p0;
    public final LinkedHashSet q0;
    public int r0;
    public rk0 s0;
    public vc t0;
    public cc0 u0;
    public int v0;
    public CharSequence w0;
    public boolean x0;
    public int y0;
    public int z0;

    public jc0() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.p0 = new LinkedHashSet();
        this.q0 = new LinkedHashSet();
    }

    public static int S(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = g41.b();
        calendarB.set(5, 1);
        Calendar calendarA = g41.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean T(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(qb1.p(R.attr.materialCalendarStyle, context, cc0.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xo, defpackage.iw
    public final void A() throws Resources.NotFoundException {
        p91 p91Var;
        p91 p91Var2;
        super.A();
        Dialog dialog = this.k0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.x0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.J0);
            if (!this.K0) {
                View viewFindViewById = H().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListJ = qb1.j(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListJ != null ? Integer.valueOf(colorStateListJ.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iH = i41.h(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iH);
                }
                pu1.n(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                int iD = i < 27 ? hg.d(i41.h(context, android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iD);
                boolean z3 = i41.m(0) || i41.m(numValueOf.intValue());
                ts0 ts0Var = new ts0(window.getDecorView());
                if (i >= 30) {
                    q91 q91Var = new q91(window.getInsetsController(), ts0Var);
                    q91Var.r = window;
                    p91Var = q91Var;
                } else {
                    p91Var = new p91(window, ts0Var);
                }
                p91Var.v(z3);
                boolean zM = i41.m(iH);
                if (i41.m(iD) || (iD == 0 && zM)) {
                    z = true;
                }
                ts0 ts0Var2 = new ts0(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    q91 q91Var2 = new q91(window.getInsetsController(), ts0Var2);
                    q91Var2.r = window;
                    p91Var2 = q91Var2;
                } else {
                    p91Var2 = new p91(window, ts0Var2);
                }
                p91Var2.u(z);
                int paddingTop = viewFindViewById.getPaddingTop();
                int paddingLeft = viewFindViewById.getPaddingLeft();
                int paddingRight = viewFindViewById.getPaddingRight();
                int i2 = viewFindViewById.getLayoutParams().height;
                cm cmVar = new cm();
                cmVar.f = i2;
                cmVar.j = viewFindViewById;
                cmVar.g = paddingLeft;
                cmVar.h = paddingTop;
                cmVar.i = paddingRight;
                WeakHashMap weakHashMap = e61.a;
                t51.u(viewFindViewById, cmVar);
                this.K0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = l().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.J0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.k0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new w20(dialog2, rect));
        }
        G();
        int i3 = this.r0;
        if (i3 == 0) {
            R();
            throw null;
        }
        R();
        vc vcVar = this.t0;
        cc0 cc0Var = new cc0();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", vcVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", vcVar.i);
        cc0Var.K(bundle);
        this.u0 = cc0Var;
        rk0 rk0Var = cc0Var;
        if (this.y0 == 1) {
            R();
            vc vcVar2 = this.t0;
            rk0 qc0Var = new qc0();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i3);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", vcVar2);
            qc0Var.K(bundle2);
            rk0Var = qc0Var;
        }
        this.s0 = rk0Var;
        this.H0.setText((this.y0 == 1 && l().getConfiguration().orientation == 2) ? this.M0 : this.L0);
        R();
        throw null;
    }

    @Override // defpackage.xo, defpackage.iw
    public final void B() {
        this.s0.Z.clear();
        super.B();
    }

    @Override // defpackage.xo
    public final Dialog O(Bundle bundle) {
        Context contextG = G();
        G();
        int i = this.r0;
        if (i == 0) {
            R();
            throw null;
        }
        Dialog dialog = new Dialog(contextG, i);
        Context context = dialog.getContext();
        this.x0 = T(context, android.R.attr.windowFullscreen);
        this.J0 = new nc0(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, gn0.u, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.J0.m(context);
        this.J0.q(ColorStateList.valueOf(color));
        this.J0.p(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public final void R() {
        if (this.k.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // defpackage.xo, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.p0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.xo, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.q0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.xo, defpackage.iw
    public final void u(Bundle bundle) throws Resources.NotFoundException {
        super.u(bundle);
        if (bundle == null) {
            bundle = this.k;
        }
        this.r0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.t0 = (vc) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.v0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.w0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.y0 = bundle.getInt("INPUT_MODE_KEY");
        this.z0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.A0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.B0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.C0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.D0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.E0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.F0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.G0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.w0;
        if (text == null) {
            text = G().getResources().getText(this.v0);
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

    @Override // defpackage.iw
    public final View v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.x0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.x0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(S(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(S(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.I0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.H0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.I0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.I0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, ob1.h(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], ob1.h(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.I0.setChecked(this.y0 != 0);
        e61.l(this.I0, null);
        CheckableImageButton checkableImageButton2 = this.I0;
        this.I0.setContentDescription(this.y0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.I0.setOnClickListener(new mf(2, this));
        R();
        throw null;
    }

    @Override // defpackage.xo, defpackage.iw
    public final void z(Bundle bundle) {
        super.z(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.r0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        vc vcVar = this.t0;
        uc ucVar = new uc();
        int i = uc.b;
        int i2 = uc.b;
        long j = vcVar.f.k;
        long j2 = vcVar.g.k;
        ucVar.a = Long.valueOf(vcVar.i.k);
        int i3 = vcVar.j;
        rm rmVar = vcVar.h;
        cc0 cc0Var = this.u0;
        we0 we0Var = cc0Var == null ? null : cc0Var.c0;
        if (we0Var != null) {
            ucVar.a = Long.valueOf(we0Var.k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", rmVar);
        we0 we0VarB = we0.b(j);
        we0 we0VarB2 = we0.b(j2);
        rm rmVar2 = (rm) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = ucVar.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new vc(we0VarB, we0VarB2, rmVar2, l == null ? null : we0.b(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.v0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.w0);
        bundle.putInt("INPUT_MODE_KEY", this.y0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.z0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.A0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.B0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.C0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.D0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.E0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.F0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.G0);
    }
}
