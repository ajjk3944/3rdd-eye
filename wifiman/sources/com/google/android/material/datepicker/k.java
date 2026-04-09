package com.google.android.material.datepicker;

import F1.C2780w0;
import F1.F;
import F1.W;
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
import androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e;
import androidx.fragment.app.E;
import c4.AbstractC4224b;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import f.AbstractC5487d;
import f4.C5527g;
import i.AbstractC6050a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class k<S> extends DialogInterfaceOnCancelListenerC3994e {

    /* renamed from: l2, reason: collision with root package name */
    static final Object f37405l2 = "CONFIRM_BUTTON_TAG";

    /* renamed from: m2, reason: collision with root package name */
    static final Object f37406m2 = "CANCEL_BUTTON_TAG";

    /* renamed from: n2, reason: collision with root package name */
    static final Object f37407n2 = "TOGGLE_BUTTON_TAG";

    /* renamed from: J1, reason: collision with root package name */
    private final LinkedHashSet f37408J1 = new LinkedHashSet();

    /* renamed from: K1, reason: collision with root package name */
    private final LinkedHashSet f37409K1 = new LinkedHashSet();

    /* renamed from: L1, reason: collision with root package name */
    private final LinkedHashSet f37410L1 = new LinkedHashSet();

    /* renamed from: M1, reason: collision with root package name */
    private final LinkedHashSet f37411M1 = new LinkedHashSet();

    /* renamed from: N1, reason: collision with root package name */
    private int f37412N1;

    /* renamed from: O1, reason: collision with root package name */
    private q f37413O1;

    /* renamed from: P1, reason: collision with root package name */
    private com.google.android.material.datepicker.a f37414P1;

    /* renamed from: Q1, reason: collision with root package name */
    private i f37415Q1;

    /* renamed from: R1, reason: collision with root package name */
    private int f37416R1;

    /* renamed from: S1, reason: collision with root package name */
    private CharSequence f37417S1;

    /* renamed from: T1, reason: collision with root package name */
    private boolean f37418T1;

    /* renamed from: U1, reason: collision with root package name */
    private int f37419U1;

    /* renamed from: V1, reason: collision with root package name */
    private int f37420V1;

    /* renamed from: W1, reason: collision with root package name */
    private CharSequence f37421W1;

    /* renamed from: X1, reason: collision with root package name */
    private int f37422X1;

    /* renamed from: Y1, reason: collision with root package name */
    private CharSequence f37423Y1;

    /* renamed from: Z1, reason: collision with root package name */
    private int f37424Z1;

    /* renamed from: a2, reason: collision with root package name */
    private CharSequence f37425a2;

    /* renamed from: b2, reason: collision with root package name */
    private int f37426b2;

    /* renamed from: c2, reason: collision with root package name */
    private CharSequence f37427c2;

    /* renamed from: d2, reason: collision with root package name */
    private TextView f37428d2;

    /* renamed from: e2, reason: collision with root package name */
    private TextView f37429e2;

    /* renamed from: f2, reason: collision with root package name */
    private CheckableImageButton f37430f2;

    /* renamed from: g2, reason: collision with root package name */
    private C5527g f37431g2;

    /* renamed from: h2, reason: collision with root package name */
    private Button f37432h2;

    /* renamed from: i2, reason: collision with root package name */
    private boolean f37433i2;

    /* renamed from: j2, reason: collision with root package name */
    private CharSequence f37434j2;

    /* renamed from: k2, reason: collision with root package name */
    private CharSequence f37435k2;

    class a implements F {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37436a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f37437b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37438c;

        a(int i10, View view, int i11) {
            this.f37436a = i10;
            this.f37437b = view;
            this.f37438c = i11;
        }

        @Override // F1.F
        public C2780w0 a(View view, C2780w0 c2780w0) {
            int i10 = c2780w0.f(C2780w0.l.h()).f64337b;
            if (this.f37436a >= 0) {
                this.f37437b.getLayoutParams().height = this.f37436a + i10;
                View view2 = this.f37437b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f37437b;
            view3.setPadding(view3.getPaddingLeft(), this.f37438c + i10, this.f37437b.getPaddingRight(), this.f37437b.getPaddingBottom());
            return c2780w0;
        }
    }

    class b extends p {
        b() {
        }
    }

    private static Drawable S1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC6050a.b(context, O3.d.f17046b));
        stateListDrawable.addState(new int[0], AbstractC6050a.b(context, O3.d.f17047c));
        return stateListDrawable;
    }

    private void T1(Window window) {
        if (this.f37433i2) {
            return;
        }
        View viewFindViewById = q1().findViewById(O3.e.f17077g);
        com.google.android.material.internal.c.a(window, true, com.google.android.material.internal.n.d(viewFindViewById), null);
        W.y0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f37433i2 = true;
    }

    private d U1() {
        AbstractC5487d.a(q().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence V1(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String W1() {
        U1();
        p1();
        throw null;
    }

    private static int Y1(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(O3.c.f17000G);
        int i10 = m.d().f37447d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(O3.c.f17002I) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(O3.c.f17005L));
    }

    private int Z1(Context context) {
        int i10 = this.f37412N1;
        if (i10 != 0) {
            return i10;
        }
        U1();
        throw null;
    }

    private void a2(Context context) {
        this.f37430f2.setTag(f37407n2);
        this.f37430f2.setImageDrawable(S1(context));
        this.f37430f2.setChecked(this.f37419U1 != 0);
        W.m0(this.f37430f2, null);
        j2(this.f37430f2);
        this.f37430f2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37404a.e2(view);
            }
        });
    }

    static boolean b2(Context context) {
        return f2(context, R.attr.windowFullscreen);
    }

    private boolean c2() {
        return M().getConfiguration().orientation == 2;
    }

    static boolean d2(Context context) {
        return f2(context, O3.a.f16953G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2(View view) {
        U1();
        throw null;
    }

    static boolean f2(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC4224b.d(context, O3.a.f16981t, i.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    private void g2() {
        int iZ1 = Z1(p1());
        U1();
        i iVarT1 = i.T1(null, iZ1, this.f37414P1, null);
        this.f37415Q1 = iVarT1;
        q qVarF1 = iVarT1;
        if (this.f37419U1 == 1) {
            U1();
            qVarF1 = l.F1(null, iZ1, this.f37414P1);
        }
        this.f37413O1 = qVarF1;
        i2();
        h2(X1());
        E eM = r().m();
        eM.n(O3.e.f17094x, this.f37413O1);
        eM.i();
        this.f37413O1.D1(new b());
    }

    private void i2() {
        this.f37428d2.setText((this.f37419U1 == 1 && c2()) ? this.f37435k2 : this.f37434j2);
    }

    private void j2(CheckableImageButton checkableImageButton) {
        this.f37430f2.setContentDescription(this.f37419U1 == 1 ? checkableImageButton.getContext().getString(O3.h.f17133r) : checkableImageButton.getContext().getString(O3.h.f17135t));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e
    public final Dialog J1(Bundle bundle) {
        Dialog dialog = new Dialog(p1(), Z1(p1()));
        Context context = dialog.getContext();
        this.f37418T1 = b2(context);
        int i10 = O3.a.f16981t;
        int i11 = O3.i.f17151m;
        this.f37431g2 = new C5527g(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, O3.j.f17157A2, i10, i11);
        int color = typedArrayObtainStyledAttributes.getColor(O3.j.f17165B2, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f37431g2.J(context);
        this.f37431g2.T(ColorStateList.valueOf(color));
        this.f37431g2.S(W.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e, androidx.fragment.app.Fragment
    public final void K0(Bundle bundle) {
        super.K0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f37412N1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.f37414P1);
        i iVar = this.f37415Q1;
        m mVarO1 = iVar == null ? null : iVar.O1();
        if (mVarO1 != null) {
            bVar.b(mVarO1.f37449f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f37416R1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f37417S1);
        bundle.putInt("INPUT_MODE_KEY", this.f37419U1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f37420V1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f37421W1);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f37422X1);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f37423Y1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f37424Z1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f37425a2);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f37426b2);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f37427c2);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e, androidx.fragment.app.Fragment
    public void L0() throws Resources.NotFoundException {
        super.L0();
        Window window = N1().getWindow();
        if (this.f37418T1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f37431g2);
            T1(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = M().getDimensionPixelOffset(O3.c.f17004K);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f37431g2, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new W3.a(N1(), rect));
        }
        g2();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e, androidx.fragment.app.Fragment
    public void M0() {
        this.f37413O1.E1();
        super.M0();
    }

    public String X1() {
        U1();
        s();
        throw null;
    }

    void h2(String str) {
        this.f37429e2.setContentDescription(W1());
        this.f37429e2.setText(str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e, androidx.fragment.app.Fragment
    public final void o0(Bundle bundle) throws Resources.NotFoundException {
        super.o0(bundle);
        if (bundle == null) {
            bundle = q();
        }
        this.f37412N1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC5487d.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f37414P1 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC5487d.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f37416R1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f37417S1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f37419U1 = bundle.getInt("INPUT_MODE_KEY");
        this.f37420V1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f37421W1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f37422X1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f37423Y1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f37424Z1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f37425a2 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f37426b2 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f37427c2 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f37417S1;
        if (text == null) {
            text = p1().getResources().getText(this.f37416R1);
        }
        this.f37434j2 = text;
        this.f37435k2 = V1(text);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f37410L1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC3994e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f37411M1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) V();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final View s0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f37418T1 ? O3.g.f17115r : O3.g.f17114q, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f37418T1) {
            viewInflate.findViewById(O3.e.f17094x).setLayoutParams(new LinearLayout.LayoutParams(Y1(context), -2));
        } else {
            viewInflate.findViewById(O3.e.f17095y).setLayoutParams(new LinearLayout.LayoutParams(Y1(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(O3.e.f17056B);
        this.f37429e2 = textView;
        W.o0(textView, 1);
        this.f37430f2 = (CheckableImageButton) viewInflate.findViewById(O3.e.f17057C);
        this.f37428d2 = (TextView) viewInflate.findViewById(O3.e.f17058D);
        a2(context);
        this.f37432h2 = (Button) viewInflate.findViewById(O3.e.f17074d);
        U1();
        throw null;
    }
}
