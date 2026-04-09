package hh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.f1;
import b5.o0;
import b5.u0;
import b5.z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.login.LogInActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v extends hg.d {
    public ed.n Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f25132a0 = 1;

    /* renamed from: b0, reason: collision with root package name */
    public String f25133b0;

    /* renamed from: c0, reason: collision with root package name */
    public final f1 f25134c0;

    /* renamed from: d0, reason: collision with root package name */
    public b5.t f25135d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ValueAnimator f25136e0;

    public v() {
        yj.f fVarT = a.a.t(yj.g.f37636b, new b2.b(12, new b2.b(11, this)));
        this.f25134c0 = new f1(nk.v.a(y.class), new ej.h(fVarT, 6), new c2.c(4, this, fVarT), new ej.h(fVarT, 7));
        Resources resources = DeviceInfoApp.f21145f.getResources();
        nk.k.d(resources, "getResources(...)");
        float fC = a4.a.c(resources, 7.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-fC, fC);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new eh.a(3, this));
        valueAnimatorOfFloat.setDuration(600L);
        this.f25136e0 = valueAnimatorOfFloat;
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.f25132a0 = V().getInt("vtype", this.f25132a0);
        this.f25133b0 = V().getString("email", null);
        this.f25135d0 = (b5.t) h(LogInActivity.D, new ca.b(19, this));
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        nk.k.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_verify_email, viewGroup, false);
        int i4 = R.id.btn_get_code;
        AppCompatTextView appCompatTextView = (AppCompatTextView) wb.e.s(R.id.btn_get_code, viewInflate);
        if (appCompatTextView != null) {
            i4 = R.id.btn_next_step;
            MaterialButton materialButton = (MaterialButton) wb.e.s(R.id.btn_next_step, viewInflate);
            if (materialButton != null) {
                i4 = R.id.checkbox_agree;
                CheckBox checkBox = (CheckBox) wb.e.s(R.id.checkbox_agree, viewInflate);
                if (checkBox != null) {
                    i4 = R.id.checkbox_container;
                    LinearLayout linearLayout = (LinearLayout) wb.e.s(R.id.checkbox_container, viewInflate);
                    if (linearLayout != null) {
                        i4 = R.id.hint_arrow;
                        ImageView imageView = (ImageView) wb.e.s(R.id.hint_arrow, viewInflate);
                        if (imageView != null) {
                            i4 = R.id.input_email;
                            TextInputEditText textInputEditText = (TextInputEditText) wb.e.s(R.id.input_email, viewInflate);
                            if (textInputEditText != null) {
                                i4 = R.id.input_email_layout;
                                if (((TextInputLayout) wb.e.s(R.id.input_email_layout, viewInflate)) != null) {
                                    i4 = R.id.input_vcode;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) wb.e.s(R.id.input_vcode, viewInflate);
                                    if (textInputEditText2 != null) {
                                        i4 = R.id.progressbar_get_code;
                                        ProgressBar progressBar = (ProgressBar) wb.e.s(R.id.progressbar_get_code, viewInflate);
                                        if (progressBar != null) {
                                            i4 = R.id.text_login_now;
                                            TextView textView = (TextView) wb.e.s(R.id.text_login_now, viewInflate);
                                            if (textView != null) {
                                                i4 = R.id.tv_agree_content;
                                                TextView textView2 = (TextView) wb.e.s(R.id.tv_agree_content, viewInflate);
                                                if (textView2 != null) {
                                                    i4 = R.id.tv_title;
                                                    TextView textView3 = (TextView) wb.e.s(R.id.tv_title, viewInflate);
                                                    if (textView3 != null) {
                                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                        ed.n nVar = new ed.n();
                                                        nVar.f23342a = frameLayout;
                                                        nVar.f23343b = appCompatTextView;
                                                        nVar.f23344c = materialButton;
                                                        nVar.f23345d = checkBox;
                                                        nVar.f23346e = linearLayout;
                                                        nVar.f23347f = imageView;
                                                        nVar.g = textInputEditText;
                                                        nVar.f23348h = textInputEditText2;
                                                        nVar.f23349i = progressBar;
                                                        nVar.j = textView;
                                                        nVar.f23350k = textView2;
                                                        nVar.f23351l = textView3;
                                                        this.Z = nVar;
                                                        nk.k.d(frameLayout, "getRoot(...)");
                                                        return frameLayout;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // b5.z
    public final void H() {
        this.F = true;
        this.f25136e0.cancel();
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        nk.k.e(view, "view");
        ed.n nVar = this.Z;
        if (nVar == null) {
            nk.k.k("binding");
            throw null;
        }
        CheckBox checkBox = (CheckBox) nVar.f23345d;
        TextView textView = (TextView) nVar.f23351l;
        TextInputEditText textInputEditText = (TextInputEditText) nVar.g;
        TextView textView2 = (TextView) nVar.f23350k;
        TextView textView3 = (TextView) nVar.j;
        ((AppCompatTextView) nVar.f23343b).setOnClickListener(new com.applovin.mediation.nativeAds.a(9, this));
        ((MaterialButton) nVar.f23344c).setOnClickListener(new ah.g(4, this, nVar));
        final int i4 = 0;
        final int i10 = 1;
        textInputEditText.setEnabled(this.f25133b0 == null);
        textInputEditText.setText(this.f25133b0);
        int i11 = this.f25132a0;
        final int i12 = 2;
        if (i11 == 1) {
            textView.setText(R.string.create_account);
            textView3.setVisibility(V().getBoolean("key.show_login_entrance", true) ? 0 : 8);
            String strU = u(R.string.already_have_an_account);
            nk.k.d(strU, "getString(...)");
            String strU2 = u(R.string.login_now);
            nk.k.d(strU2, "getString(...)");
            SpannableString spannableString = new SpannableString(d.h.E(strU, " ", strU2));
            spannableString.setSpan(new ForegroundColorSpan(W().getColor(R.color.colorPrimary)), strU.length(), spannableString.length(), 33);
            spannableString.setSpan(new u(this), strU.length(), spannableString.length(), 33);
            textView3.setText(spannableString);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            ((LinearLayout) nVar.f23346e).setVisibility(0);
            checkBox.setButtonTintList(dj.b.b(W().getColor(R.color.colorPrimary), W()));
            checkBox.setOnCheckedChangeListener(new dh.a(i10, this));
            textView2.setTextColor(cm.g.l(android.R.attr.textColorHint, W()));
            o0 o0Var = LogInActivity.D;
            Context contextW = W();
            String string = contextW.getString(R.string.privacy_policy);
            nk.k.d(string, "getString(...)");
            String string2 = contextW.getString(R.string.term_of_service);
            nk.k.d(string2, "getString(...)");
            String string3 = contextW.getString(R.string.i_have_read_and_agreed_to_the_s_and_s, string, string2);
            nk.k.d(string3, "getString(...)");
            SpannableString spannableString2 = new SpannableString(string3);
            int iF0 = vk.i.F0(string3, string, 0, false, 6);
            int length = string.length() + iF0;
            int iF02 = vk.i.F0(string3, string2, 0, false, 6);
            int length2 = string2.length() + iF02;
            spannableString2.setSpan(new eh.b(contextW, 0), iF0, length, 33);
            spannableString2.setSpan(new ForegroundColorSpan(contextW.getColor(R.color.text_link)), iF0, length, 18);
            spannableString2.setSpan(new eh.b(contextW, 1), iF02, length2, 33);
            spannableString2.setSpan(new ForegroundColorSpan(contextW.getColor(R.color.text_link)), iF02, length2, 18);
            textView2.setText(spannableString2);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException(r5.c.h(this.f25132a0, "unknown vtype[", "]"));
            }
            textView.setText(R.string.change_password);
            textView3.setVisibility(8);
        }
        int i13 = 6;
        i0().f25143c.e(v(), new bh.i(new mk.c(this) { // from class: hh.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f25130b;

            {
                this.f25130b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        String str = (String) obj;
                        Context contextP = this.f25130b.p();
                        if (contextP != null) {
                            Toast.makeText(contextP, str, 0).show();
                        }
                        return yj.u.f37649a;
                    case 1:
                        r rVar = (r) obj;
                        v vVar = this.f25130b;
                        ed.n nVar2 = vVar.Z;
                        if (nVar2 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        AppCompatTextView appCompatTextView = (AppCompatTextView) nVar2.f23343b;
                        appCompatTextView.setEnabled(rVar.f25124a);
                        appCompatTextView.setText(rVar.f25125b);
                        ed.n nVar3 = vVar.Z;
                        if (nVar3 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((ProgressBar) nVar3.f23349i).setVisibility(rVar.f25126c ? 0 : 8);
                        break;
                    case 2:
                        boolean z3 = ((ng.a) obj).f29942a;
                        v vVar2 = this.f25130b;
                        if (z3) {
                            ja.c.C(vVar2);
                        } else {
                            u0 u0VarO = vVar2.o();
                            nk.k.d(u0VarO, "getChildFragmentManager(...)");
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                        }
                        return yj.u.f37649a;
                    case 3:
                        s sVar = (s) obj;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("email", sVar.f25127a);
                        bundle2.putString("vcode", sVar.f25128b);
                        v vVar3 = this.f25130b;
                        bundle2.putInt("vtype", vVar3.f25132a0);
                        com.bumptech.glide.f.B(vVar3, "VerifyEmailResult", bundle2);
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        v vVar4 = this.f25130b;
                        ed.n nVar4 = vVar4.Z;
                        ValueAnimator valueAnimator = vVar4.f25136e0;
                        if (nVar4 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((ImageView) nVar4.f23347f).setVisibility(bool.booleanValue() ? 0 : 4);
                        if (bool.booleanValue()) {
                            if (!valueAnimator.isRunning()) {
                                valueAnimator.start();
                            }
                        } else if (valueAnimator.isRunning()) {
                            valueAnimator.cancel();
                        }
                        return yj.u.f37649a;
                }
                return yj.u.f37649a;
            }
        }, i13));
        i0().f25145e.e(v(), new bh.i(new mk.c(this) { // from class: hh.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f25130b;

            {
                this.f25130b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        String str = (String) obj;
                        Context contextP = this.f25130b.p();
                        if (contextP != null) {
                            Toast.makeText(contextP, str, 0).show();
                        }
                        return yj.u.f37649a;
                    case 1:
                        r rVar = (r) obj;
                        v vVar = this.f25130b;
                        ed.n nVar2 = vVar.Z;
                        if (nVar2 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        AppCompatTextView appCompatTextView = (AppCompatTextView) nVar2.f23343b;
                        appCompatTextView.setEnabled(rVar.f25124a);
                        appCompatTextView.setText(rVar.f25125b);
                        ed.n nVar3 = vVar.Z;
                        if (nVar3 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((ProgressBar) nVar3.f23349i).setVisibility(rVar.f25126c ? 0 : 8);
                        break;
                    case 2:
                        boolean z3 = ((ng.a) obj).f29942a;
                        v vVar2 = this.f25130b;
                        if (z3) {
                            ja.c.C(vVar2);
                        } else {
                            u0 u0VarO = vVar2.o();
                            nk.k.d(u0VarO, "getChildFragmentManager(...)");
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                        }
                        return yj.u.f37649a;
                    case 3:
                        s sVar = (s) obj;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("email", sVar.f25127a);
                        bundle2.putString("vcode", sVar.f25128b);
                        v vVar3 = this.f25130b;
                        bundle2.putInt("vtype", vVar3.f25132a0);
                        com.bumptech.glide.f.B(vVar3, "VerifyEmailResult", bundle2);
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        v vVar4 = this.f25130b;
                        ed.n nVar4 = vVar4.Z;
                        ValueAnimator valueAnimator = vVar4.f25136e0;
                        if (nVar4 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((ImageView) nVar4.f23347f).setVisibility(bool.booleanValue() ? 0 : 4);
                        if (bool.booleanValue()) {
                            if (!valueAnimator.isRunning()) {
                                valueAnimator.start();
                            }
                        } else if (valueAnimator.isRunning()) {
                            valueAnimator.cancel();
                        }
                        return yj.u.f37649a;
                }
                return yj.u.f37649a;
            }
        }, i13));
        i0().g.e(v(), new bh.i(new mk.c(this) { // from class: hh.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f25130b;

            {
                this.f25130b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        String str = (String) obj;
                        Context contextP = this.f25130b.p();
                        if (contextP != null) {
                            Toast.makeText(contextP, str, 0).show();
                        }
                        return yj.u.f37649a;
                    case 1:
                        r rVar = (r) obj;
                        v vVar = this.f25130b;
                        ed.n nVar2 = vVar.Z;
                        if (nVar2 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        AppCompatTextView appCompatTextView = (AppCompatTextView) nVar2.f23343b;
                        appCompatTextView.setEnabled(rVar.f25124a);
                        appCompatTextView.setText(rVar.f25125b);
                        ed.n nVar3 = vVar.Z;
                        if (nVar3 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((ProgressBar) nVar3.f23349i).setVisibility(rVar.f25126c ? 0 : 8);
                        break;
                    case 2:
                        boolean z3 = ((ng.a) obj).f29942a;
                        v vVar2 = this.f25130b;
                        if (z3) {
                            ja.c.C(vVar2);
                        } else {
                            u0 u0VarO = vVar2.o();
                            nk.k.d(u0VarO, "getChildFragmentManager(...)");
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                        }
                        return yj.u.f37649a;
                    case 3:
                        s sVar = (s) obj;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("email", sVar.f25127a);
                        bundle2.putString("vcode", sVar.f25128b);
                        v vVar3 = this.f25130b;
                        bundle2.putInt("vtype", vVar3.f25132a0);
                        com.bumptech.glide.f.B(vVar3, "VerifyEmailResult", bundle2);
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        v vVar4 = this.f25130b;
                        ed.n nVar4 = vVar4.Z;
                        ValueAnimator valueAnimator = vVar4.f25136e0;
                        if (nVar4 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((ImageView) nVar4.f23347f).setVisibility(bool.booleanValue() ? 0 : 4);
                        if (bool.booleanValue()) {
                            if (!valueAnimator.isRunning()) {
                                valueAnimator.start();
                            }
                        } else if (valueAnimator.isRunning()) {
                            valueAnimator.cancel();
                        }
                        return yj.u.f37649a;
                }
                return yj.u.f37649a;
            }
        }, i13));
        final int i14 = 3;
        i0().f25148i.e(v(), new bh.i(new mk.c(this) { // from class: hh.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f25130b;

            {
                this.f25130b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        String str = (String) obj;
                        Context contextP = this.f25130b.p();
                        if (contextP != null) {
                            Toast.makeText(contextP, str, 0).show();
                        }
                        return yj.u.f37649a;
                    case 1:
                        r rVar = (r) obj;
                        v vVar = this.f25130b;
                        ed.n nVar2 = vVar.Z;
                        if (nVar2 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        AppCompatTextView appCompatTextView = (AppCompatTextView) nVar2.f23343b;
                        appCompatTextView.setEnabled(rVar.f25124a);
                        appCompatTextView.setText(rVar.f25125b);
                        ed.n nVar3 = vVar.Z;
                        if (nVar3 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((ProgressBar) nVar3.f23349i).setVisibility(rVar.f25126c ? 0 : 8);
                        break;
                    case 2:
                        boolean z3 = ((ng.a) obj).f29942a;
                        v vVar2 = this.f25130b;
                        if (z3) {
                            ja.c.C(vVar2);
                        } else {
                            u0 u0VarO = vVar2.o();
                            nk.k.d(u0VarO, "getChildFragmentManager(...)");
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                        }
                        return yj.u.f37649a;
                    case 3:
                        s sVar = (s) obj;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("email", sVar.f25127a);
                        bundle2.putString("vcode", sVar.f25128b);
                        v vVar3 = this.f25130b;
                        bundle2.putInt("vtype", vVar3.f25132a0);
                        com.bumptech.glide.f.B(vVar3, "VerifyEmailResult", bundle2);
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        v vVar4 = this.f25130b;
                        ed.n nVar4 = vVar4.Z;
                        ValueAnimator valueAnimator = vVar4.f25136e0;
                        if (nVar4 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((ImageView) nVar4.f23347f).setVisibility(bool.booleanValue() ? 0 : 4);
                        if (bool.booleanValue()) {
                            if (!valueAnimator.isRunning()) {
                                valueAnimator.start();
                            }
                        } else if (valueAnimator.isRunning()) {
                            valueAnimator.cancel();
                        }
                        return yj.u.f37649a;
                }
                return yj.u.f37649a;
            }
        }, i13));
        final int i15 = 4;
        i0().f25149k.e(v(), new bh.i(new mk.c(this) { // from class: hh.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f25130b;

            {
                this.f25130b = this;
            }

            @Override // mk.c
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        String str = (String) obj;
                        Context contextP = this.f25130b.p();
                        if (contextP != null) {
                            Toast.makeText(contextP, str, 0).show();
                        }
                        return yj.u.f37649a;
                    case 1:
                        r rVar = (r) obj;
                        v vVar = this.f25130b;
                        ed.n nVar2 = vVar.Z;
                        if (nVar2 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        AppCompatTextView appCompatTextView = (AppCompatTextView) nVar2.f23343b;
                        appCompatTextView.setEnabled(rVar.f25124a);
                        appCompatTextView.setText(rVar.f25125b);
                        ed.n nVar3 = vVar.Z;
                        if (nVar3 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((ProgressBar) nVar3.f23349i).setVisibility(rVar.f25126c ? 0 : 8);
                        break;
                    case 2:
                        boolean z3 = ((ng.a) obj).f29942a;
                        v vVar2 = this.f25130b;
                        if (z3) {
                            ja.c.C(vVar2);
                        } else {
                            u0 u0VarO = vVar2.o();
                            nk.k.d(u0VarO, "getChildFragmentManager(...)");
                            z zVarD = u0VarO.D("CommonLoadingDialog");
                            if (zVarD != null) {
                                b5.a aVar = new b5.a(u0VarO);
                                aVar.j(zVarD);
                                aVar.g();
                            }
                        }
                        return yj.u.f37649a;
                    case 3:
                        s sVar = (s) obj;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("email", sVar.f25127a);
                        bundle2.putString("vcode", sVar.f25128b);
                        v vVar3 = this.f25130b;
                        bundle2.putInt("vtype", vVar3.f25132a0);
                        com.bumptech.glide.f.B(vVar3, "VerifyEmailResult", bundle2);
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        v vVar4 = this.f25130b;
                        ed.n nVar4 = vVar4.Z;
                        ValueAnimator valueAnimator = vVar4.f25136e0;
                        if (nVar4 == null) {
                            nk.k.k("binding");
                            throw null;
                        }
                        ((ImageView) nVar4.f23347f).setVisibility(bool.booleanValue() ? 0 : 4);
                        if (bool.booleanValue()) {
                            if (!valueAnimator.isRunning()) {
                                valueAnimator.start();
                            }
                        } else if (valueAnimator.isRunning()) {
                            valueAnimator.cancel();
                        }
                        return yj.u.f37649a;
                }
                return yj.u.f37649a;
            }
        }, i13));
    }

    public final String h0() {
        String string;
        String str = this.f25133b0;
        if (str != null) {
            return str;
        }
        ed.n nVar = this.Z;
        if (nVar == null) {
            nk.k.k("binding");
            throw null;
        }
        Editable text = ((TextInputEditText) nVar.g).getText();
        if (text == null || (string = text.toString()) == null) {
            return null;
        }
        return vk.i.V0(string).toString();
    }

    public final y i0() {
        return (y) this.f25134c0.getValue();
    }
}
