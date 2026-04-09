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
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.g0;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.d0;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class MaterialDatePicker<S> extends androidx.fragment.app.c {
    public static final Object E = "CONFIRM_BUTTON_TAG";
    public static final Object F = "CANCEL_BUTTON_TAG";
    public static final Object G = "TOGGLE_BUTTON_TAG";
    public Button A;
    public boolean B;
    public CharSequence C;
    public CharSequence D;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f10362a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f10363b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f10364c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f10365d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public int f10366e;

    /* renamed from: f, reason: collision with root package name */
    public DateSelector f10367f;

    /* renamed from: g, reason: collision with root package name */
    public s f10368g;

    /* renamed from: h, reason: collision with root package name */
    public CalendarConstraints f10369h;

    /* renamed from: i, reason: collision with root package name */
    public DayViewDecorator f10370i;

    /* renamed from: j, reason: collision with root package name */
    public MaterialCalendar f10371j;

    /* renamed from: k, reason: collision with root package name */
    public int f10372k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f10373l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10374m;

    /* renamed from: n, reason: collision with root package name */
    public int f10375n;

    /* renamed from: o, reason: collision with root package name */
    public int f10376o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f10377p;

    /* renamed from: q, reason: collision with root package name */
    public int f10378q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f10379r;

    /* renamed from: s, reason: collision with root package name */
    public int f10380s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f10381t;

    /* renamed from: u, reason: collision with root package name */
    public int f10382u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f10383v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f10384w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f10385x;

    /* renamed from: y, reason: collision with root package name */
    public CheckableImageButton f10386y;

    /* renamed from: z, reason: collision with root package name */
    public MaterialShapeDrawable f10387z;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface InputMode {
    }

    public class a implements g0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10388a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f10389b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f10390c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f10391d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f10392e;

        public a(int i10, View view, int i11, int i12, int i13) {
            this.f10388a = i10;
            this.f10389b = view;
            this.f10390c = i11;
            this.f10391d = i12;
            this.f10392e = i13;
        }

        @Override // androidx.core.view.g0
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            j0.b bVarF = windowInsetsCompat.f(WindowInsetsCompat.Type.e());
            if (this.f10388a >= 0) {
                this.f10389b.getLayoutParams().height = this.f10388a + bVarF.f21687b;
                View view2 = this.f10389b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f10389b;
            view3.setPadding(this.f10390c + bVarF.f21686a, this.f10391d + bVarF.f21687b, this.f10392e + bVarF.f21688c, view3.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    public class b extends r {
        public b() {
        }

        @Override // com.google.android.material.datepicker.r
        public void a() {
            MaterialDatePicker.this.A.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.r
        public void b(Object obj) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.B(materialDatePicker.p());
            MaterialDatePicker.this.A.setEnabled(MaterialDatePicker.this.m().m());
        }
    }

    public static /* synthetic */ void h(MaterialDatePicker materialDatePicker, View view) {
        materialDatePicker.A.setEnabled(materialDatePicker.m().m());
        materialDatePicker.f10386y.toggle();
        materialDatePicker.f10375n = materialDatePicker.f10375n == 1 ? 0 : 1;
        materialDatePicker.D(materialDatePicker.f10386y);
        materialDatePicker.A();
    }

    public static Drawable k(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, d.a.b(context, j4.e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], d.a.b(context, j4.e.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector m() {
        if (this.f10367f == null) {
            this.f10367f = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f10367f;
    }

    public static CharSequence n(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    public static int q(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(j4.d.mtrl_calendar_content_padding);
        int i10 = Month.i().f10398d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(j4.d.mtrl_calendar_day_width) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(j4.d.mtrl_calendar_month_horizontal_padding));
    }

    public static boolean u(Context context) {
        return z(context, R.attr.windowFullscreen);
    }

    public static boolean w(Context context) {
        return z(context, j4.b.nestedScrollable);
    }

    public static boolean z(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(d5.b.f(context, j4.b.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    public final void A() {
        int iS = s(requireContext());
        MaterialCalendar materialCalendarZ = MaterialCalendar.z(m(), iS, this.f10369h, this.f10370i);
        this.f10371j = materialCalendarZ;
        s sVarH = materialCalendarZ;
        if (this.f10375n == 1) {
            sVarH = o.h(m(), iS, this.f10369h);
        }
        this.f10368g = sVarH;
        C();
        B(p());
        androidx.fragment.app.z zVarP = getChildFragmentManager().p();
        zVarP.n(j4.f.mtrl_calendar_frame, this.f10368g);
        zVarP.i();
        this.f10368g.f(new b());
    }

    public void B(String str) {
        this.f10385x.setContentDescription(o());
        this.f10385x.setText(str);
    }

    public final void C() {
        this.f10384w.setText((this.f10375n == 1 && v()) ? this.D : this.C);
    }

    public final void D(CheckableImageButton checkableImageButton) {
        this.f10386y.setContentDescription(this.f10375n == 1 ? checkableImageButton.getContext().getString(j4.j.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(j4.j.mtrl_picker_toggle_to_text_input_mode));
    }

    public final void l(Window window) {
        if (this.B) {
            return;
        }
        View viewFindViewById = requireView().findViewById(j4.f.fullscreen_header);
        com.google.android.material.internal.e.a(window, true, d0.h(viewFindViewById), null);
        int paddingTop = viewFindViewById.getPaddingTop();
        ViewCompat.t0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), paddingTop, viewFindViewById.getPaddingRight()));
        this.B = true;
    }

    public final String o() {
        return m().a(requireContext());
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f10364c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f10366e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f10367f = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10369h = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10370i = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f10372k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f10373l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f10375n = bundle.getInt("INPUT_MODE_KEY");
        this.f10376o = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10377p = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f10378q = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f10379r = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f10380s = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10381t = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f10382u = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f10383v = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f10373l;
        if (text == null) {
            text = requireContext().getResources().getText(this.f10372k);
        }
        this.C = text;
        this.D = n(text);
    }

    @Override // androidx.fragment.app.c
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), s(requireContext()));
        Context context = dialog.getContext();
        this.f10374m = u(context);
        int i10 = j4.b.materialCalendarStyle;
        int i11 = j4.k.Widget_MaterialComponents_MaterialCalendar;
        this.f10387z = new MaterialShapeDrawable(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j4.l.MaterialCalendar, i10, i11);
        int color = typedArrayObtainStyledAttributes.getColor(j4.l.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f10387z.W(context);
        this.f10387z.i0(ColorStateList.valueOf(color));
        this.f10387z.h0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f10374m ? j4.h.mtrl_picker_fullscreen : j4.h.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f10370i;
        if (dayViewDecorator != null) {
            dayViewDecorator.r(context);
        }
        if (this.f10374m) {
            viewInflate.findViewById(j4.f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(q(context), -2));
        } else {
            viewInflate.findViewById(j4.f.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(q(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(j4.f.mtrl_picker_header_selection_text);
        this.f10385x = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f10386y = (CheckableImageButton) viewInflate.findViewById(j4.f.mtrl_picker_header_toggle);
        this.f10384w = (TextView) viewInflate.findViewById(j4.f.mtrl_picker_title_text);
        t(context);
        this.A = (Button) viewInflate.findViewById(j4.f.confirm_button);
        if (m().m()) {
            this.A.setEnabled(true);
        } else {
            this.A.setEnabled(false);
        }
        this.A.setTag(E);
        CharSequence charSequence = this.f10377p;
        if (charSequence != null) {
            this.A.setText(charSequence);
        } else {
            int i10 = this.f10376o;
            if (i10 != 0) {
                this.A.setText(i10);
            }
        }
        CharSequence charSequence2 = this.f10379r;
        if (charSequence2 != null) {
            this.A.setContentDescription(charSequence2);
        } else if (this.f10378q != 0) {
            this.A.setContentDescription(getContext().getResources().getText(this.f10378q));
        }
        this.A.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10461a.y(view);
            }
        });
        Button button = (Button) viewInflate.findViewById(j4.f.cancel_button);
        button.setTag(F);
        CharSequence charSequence3 = this.f10381t;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f10380s;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.f10383v;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f10382u != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f10382u));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10462a.x(view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f10365d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f10366e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10367f);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.f10369h);
        MaterialCalendar materialCalendar = this.f10371j;
        Month monthU = materialCalendar == null ? null : materialCalendar.u();
        if (monthU != null) {
            bVar.b(monthU.f10400f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f10370i);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f10372k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f10373l);
        bundle.putInt("INPUT_MODE_KEY", this.f10375n);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f10376o);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f10377p);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10378q);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10379r);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f10380s);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f10381t);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10382u);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10383v);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f10374m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f10387z);
            l(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(j4.d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f10387z, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new v4.a(requireDialog(), rect));
        }
        A();
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStop() {
        this.f10368g.g();
        super.onStop();
    }

    public String p() {
        return m().d(getContext());
    }

    public final Object r() {
        return m().o();
    }

    public final int s(Context context) {
        int i10 = this.f10366e;
        return i10 != 0 ? i10 : m().b(context);
    }

    public final void t(Context context) {
        this.f10386y.setTag(G);
        this.f10386y.setImageDrawable(k(context));
        this.f10386y.setChecked(this.f10375n != 0);
        ViewCompat.j0(this.f10386y, null);
        D(this.f10386y);
        this.f10386y.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialDatePicker.h(this.f10463a, view);
            }
        });
    }

    public final boolean v() {
        return getResources().getConfiguration().orientation == 2;
    }

    public void x(View view) {
        Iterator it = this.f10363b.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        dismiss();
    }

    public void y(View view) {
        Iterator it = this.f10362a.iterator();
        if (!it.hasNext()) {
            dismiss();
        } else {
            androidx.appcompat.app.z.a(it.next());
            r();
            throw null;
        }
    }
}
