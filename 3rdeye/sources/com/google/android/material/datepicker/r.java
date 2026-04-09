package com.google.android.material.datepicker;

import L0.C0792x;
import L0.I;
import L0.S;
import L0.U;
import L0.Z;
import L0.a0;
import L0.b0;
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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C1748a;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.datepicker.C4009a;
import com.google.android.material.internal.CheckableImageButton;
import h4.C4414b;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l4.C5287f;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class r<S> extends DialogInterfaceOnCancelListenerC1758k {

    /* renamed from: A, reason: collision with root package name */
    public C5287f f22836A;

    /* renamed from: B, reason: collision with root package name */
    public Button f22837B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f22838C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f22839D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f22840E;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<t<? super S>> f22841b = new LinkedHashSet<>();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f22842c = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f22843d = new LinkedHashSet<>();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f22844e = new LinkedHashSet<>();

    /* renamed from: f, reason: collision with root package name */
    public int f22845f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC4012d<S> f22846g;

    /* renamed from: h, reason: collision with root package name */
    public A<S> f22847h;
    public C4009a i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC4014f f22848j;

    /* renamed from: k, reason: collision with root package name */
    public j<S> f22849k;

    /* renamed from: l, reason: collision with root package name */
    public int f22850l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f22851m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22852n;

    /* renamed from: o, reason: collision with root package name */
    public int f22853o;

    /* renamed from: p, reason: collision with root package name */
    public int f22854p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f22855q;

    /* renamed from: r, reason: collision with root package name */
    public int f22856r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f22857s;

    /* renamed from: t, reason: collision with root package name */
    public int f22858t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f22859u;

    /* renamed from: v, reason: collision with root package name */
    public int f22860v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f22861w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f22862x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f22863y;

    /* renamed from: z, reason: collision with root package name */
    public CheckableImageButton f22864z;

    /* compiled from: MaterialDatePicker.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            r rVar = r.this;
            Iterator<t<? super S>> it = rVar.f22841b.iterator();
            while (it.hasNext()) {
                t<? super S> next = it.next();
                rVar.c().u0();
                next.a();
            }
            rVar.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            r rVar = r.this;
            Iterator<View.OnClickListener> it = rVar.f22842c.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            rVar.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    public class c extends z<S> {
        public c() {
        }

        @Override // com.google.android.material.datepicker.z
        public final void a(S s10) {
            r rVar = r.this;
            InterfaceC4012d<S> interfaceC4012dC = rVar.c();
            rVar.getContext();
            String strD = interfaceC4012dC.D();
            TextView textView = rVar.f22863y;
            InterfaceC4012d<S> interfaceC4012dC2 = rVar.c();
            rVar.requireContext();
            textView.setContentDescription(interfaceC4012dC2.p0());
            rVar.f22863y.setText(strD);
            rVar.f22837B.setEnabled(rVar.c().m0());
        }
    }

    public static int d(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarD = E.d();
        calendarD.set(5, 1);
        Calendar calendarC = E.c(calendarD);
        calendarC.get(2);
        calendarC.get(1);
        int maximum = calendarC.getMaximum(7);
        calendarC.getActualMaximum(5);
        calendarC.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean e(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C4414b.c(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()).data, new int[]{i});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    public final InterfaceC4012d<S> c() {
        if (this.f22846g == null) {
            this.f22846g = (InterfaceC4012d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f22846g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.fragment.app.l, com.google.android.material.datepicker.u] */
    public final void f() {
        requireContext();
        int iK0 = this.f22845f;
        if (iK0 == 0) {
            iK0 = c().k0();
        }
        InterfaceC4012d<S> interfaceC4012dC = c();
        C4009a c4009a = this.i;
        AbstractC4014f abstractC4014f = this.f22848j;
        j<S> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iK0);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC4012dC);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4009a);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", abstractC4014f);
        bundle.putParcelable("CURRENT_MONTH_KEY", c4009a.f22780e);
        jVar.setArguments(bundle);
        this.f22849k = jVar;
        if (this.f22853o == 1) {
            InterfaceC4012d<S> interfaceC4012dC2 = c();
            C4009a c4009a2 = this.i;
            ?? uVar = new u();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iK0);
            bundle2.putParcelable("DATE_SELECTOR_KEY", interfaceC4012dC2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4009a2);
            uVar.setArguments(bundle2);
            jVar = uVar;
        }
        this.f22847h = jVar;
        this.f22862x.setText((this.f22853o == 1 && getResources().getConfiguration().orientation == 2) ? this.f22840E : this.f22839D);
        InterfaceC4012d<S> interfaceC4012dC3 = c();
        getContext();
        String strD = interfaceC4012dC3.D();
        TextView textView = this.f22863y;
        InterfaceC4012d<S> interfaceC4012dC4 = c();
        requireContext();
        textView.setContentDescription(interfaceC4012dC4.p0());
        this.f22863y.setText(strD);
        androidx.fragment.app.x childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1748a c1748a = new C1748a(childFragmentManager);
        c1748a.d(this.f22847h, R.id.mtrl_calendar_frame);
        if (c1748a.f15790g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        c1748a.f15791h = false;
        c1748a.f15849q.y(c1748a, false);
        this.f22847h.c(new c());
    }

    public final void g(CheckableImageButton checkableImageButton) {
        this.f22864z.setContentDescription(this.f22853o == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f22843d.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f22845f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f22846g = (InterfaceC4012d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.i = (C4009a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f22848j = (AbstractC4014f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f22850l = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f22851m = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f22853o = bundle.getInt("INPUT_MODE_KEY");
        this.f22854p = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f22855q = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f22856r = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f22857s = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f22858t = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f22859u = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f22860v = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f22861w = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f22851m;
        if (text == null) {
            text = requireContext().getResources().getText(this.f22850l);
        }
        this.f22839D = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f22840E = text;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int iK0 = this.f22845f;
        if (iK0 == 0) {
            iK0 = c().k0();
        }
        Dialog dialog = new Dialog(contextRequireContext, iK0);
        Context context = dialog.getContext();
        this.f22852n = e(context, android.R.attr.windowFullscreen);
        this.f22836A = new C5287f(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, K3.a.f3126n, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f22836A.i(context);
        this.f22836A.k(ColorStateList.valueOf(color));
        C5287f c5287f = this.f22836A;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        c5287f.j(I.d.i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f22852n ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f22852n) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(d(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(d(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f22863y = textView;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        textView.setAccessibilityLiveRegion(1);
        this.f22864z = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f22862x = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f22864z.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f22864z;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, A9.I.w(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], A9.I.w(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f22864z.setChecked(this.f22853o != 0);
        I.o(this.f22864z, null);
        g(this.f22864z);
        this.f22864z.setOnClickListener(new D8.f(this, 6));
        this.f22837B = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (c().m0()) {
            this.f22837B.setEnabled(true);
        } else {
            this.f22837B.setEnabled(false);
        }
        this.f22837B.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f22855q;
        if (charSequence != null) {
            this.f22837B.setText(charSequence);
        } else {
            int i = this.f22854p;
            if (i != 0) {
                this.f22837B.setText(i);
            }
        }
        CharSequence charSequence2 = this.f22857s;
        if (charSequence2 != null) {
            this.f22837B.setContentDescription(charSequence2);
        } else if (this.f22856r != 0) {
            this.f22837B.setContentDescription(getContext().getResources().getText(this.f22856r));
        }
        this.f22837B.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f22859u;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i10 = this.f22858t;
            if (i10 != 0) {
                button.setText(i10);
            }
        }
        CharSequence charSequence4 = this.f22861w;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f22860v != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f22860v));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f22844e.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f22845f);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f22846g);
        C4009a c4009a = this.i;
        C4009a.b bVar = new C4009a.b();
        int i = C4009a.b.f22784c;
        int i10 = C4009a.b.f22784c;
        bVar.f22786b = new C4013e(Long.MIN_VALUE);
        long j4 = c4009a.f22777b.f22880g;
        long j10 = c4009a.f22778c.f22880g;
        bVar.f22785a = Long.valueOf(c4009a.f22780e.f22880g);
        C4009a.c cVar = c4009a.f22779d;
        bVar.f22786b = cVar;
        j<S> jVar = this.f22849k;
        v vVar = jVar == null ? null : jVar.f22814g;
        if (vVar != null) {
            bVar.f22785a = Long.valueOf(vVar.f22880g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar);
        v vVarB = v.b(j4);
        v vVarB2 = v.b(j10);
        C4009a.c cVar2 = (C4009a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l5 = bVar.f22785a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C4009a(vVarB, vVarB2, cVar2, l5 != null ? v.b(l5.longValue()) : null, c4009a.f22781f));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f22848j);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f22850l);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f22851m);
        bundle.putInt("INPUT_MODE_KEY", this.f22853o);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f22854p);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f22855q);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f22856r);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f22857s);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f22858t);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f22859u);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f22860v);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f22861w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onStart() throws Resources.NotFoundException {
        Z a0Var;
        Z a0Var2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f22852n) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f22836A);
            if (!this.f22838C) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListA = Z3.a.a(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z10 = false;
                boolean z11 = numValueOf == null || numValueOf.intValue() == 0;
                int iO = B7.d.o(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z11) {
                    numValueOf = Integer.valueOf(iO);
                }
                U.a(window, false);
                window.getContext();
                int iE = i < 27 ? C0.d.e(B7.d.o(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iE);
                boolean z12 = B7.d.q(0) || B7.d.q(numValueOf.intValue());
                C0792x c0792x = new C0792x(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    b0 b0Var = new b0(window.getInsetsController(), c0792x);
                    b0Var.f3888c = window;
                    a0Var = b0Var;
                } else {
                    a0Var = i10 >= 26 ? new a0(window, c0792x) : new Z(window, c0792x);
                }
                a0Var.y(z12);
                boolean zQ = B7.d.q(iO);
                if (B7.d.q(iE) || (iE == 0 && zQ)) {
                    z10 = true;
                }
                C0792x c0792x2 = new C0792x(window.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    b0 b0Var2 = new b0(window.getInsetsController(), c0792x2);
                    b0Var2.f3888c = window;
                    a0Var2 = b0Var2;
                } else {
                    a0Var2 = i11 >= 26 ? new a0(window, c0792x2) : new Z(window, c0792x2);
                }
                a0Var2.x(z10);
                s sVar = new s(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                I.d.u(viewFindViewById, sVar);
                this.f22838C = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f22836A, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new Y3.a(requireDialog(), rect));
        }
        f();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onStop() {
        this.f22847h.f22769b.clear();
        super.onStop();
    }
}
