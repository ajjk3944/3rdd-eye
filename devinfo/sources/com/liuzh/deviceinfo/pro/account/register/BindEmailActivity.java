package com.liuzh.deviceinfo.pro.account.register;

import ah.g;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.f1;
import b5.u0;
import b5.z;
import ca.b;
import com.applovin.impl.sa;
import com.google.android.gms.internal.ads.e80;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.mode.User;
import com.liuzh.deviceinfo.pro.account.register.BindEmailActivity;
import e4.m0;
import e4.v0;
import ec.y;
import hg.a;
import hh.c;
import hh.i;
import java.util.WeakHashMap;
import nk.k;
import nk.v;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class BindEmailActivity extends a {
    public static final /* synthetic */ int E = 0;
    public e80 C;
    public final f1 B = new f1(v.a(i.class), new c(this, 1), new c(this, 0), new c(this, 2));
    public final bh.a D = new bh.a(this, 3);

    public final i D() {
        return (i) this.B.getValue();
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bh.c cVar = bh.c.f2188a;
        if (!bh.c.c()) {
            y.h(this, 6);
            finish();
            return;
        }
        final int i4 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_bind_email, (ViewGroup) null, false);
        int i10 = R.id.btn_get_code_new_email;
        AppCompatTextView appCompatTextView = (AppCompatTextView) e.s(R.id.btn_get_code_new_email, viewInflate);
        if (appCompatTextView != null) {
            i10 = R.id.btn_get_code_ori_email;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) e.s(R.id.btn_get_code_ori_email, viewInflate);
            if (appCompatTextView2 != null) {
                i10 = R.id.btn_submit;
                MaterialButton materialButton = (MaterialButton) e.s(R.id.btn_submit, viewInflate);
                if (materialButton != null) {
                    i10 = R.id.confirm_pwd_container;
                    CardView cardView = (CardView) e.s(R.id.confirm_pwd_container, viewInflate);
                    if (cardView != null) {
                        i10 = R.id.input_email_new;
                        TextInputEditText textInputEditText = (TextInputEditText) e.s(R.id.input_email_new, viewInflate);
                        if (textInputEditText != null) {
                            i10 = R.id.input_password;
                            TextInputEditText textInputEditText2 = (TextInputEditText) e.s(R.id.input_password, viewInflate);
                            if (textInputEditText2 != null) {
                                i10 = R.id.input_retype_password;
                                TextInputEditText textInputEditText3 = (TextInputEditText) e.s(R.id.input_retype_password, viewInflate);
                                if (textInputEditText3 != null) {
                                    i10 = R.id.input_vcode_new_email;
                                    TextInputEditText textInputEditText4 = (TextInputEditText) e.s(R.id.input_vcode_new_email, viewInflate);
                                    if (textInputEditText4 != null) {
                                        i10 = R.id.input_vcode_ori_email;
                                        TextInputEditText textInputEditText5 = (TextInputEditText) e.s(R.id.input_vcode_ori_email, viewInflate);
                                        if (textInputEditText5 != null) {
                                            i10 = R.id.original_email_card;
                                            CardView cardView2 = (CardView) e.s(R.id.original_email_card, viewInflate);
                                            if (cardView2 != null) {
                                                i10 = R.id.progressbar_get_code_new_email;
                                                ProgressBar progressBar = (ProgressBar) e.s(R.id.progressbar_get_code_new_email, viewInflate);
                                                if (progressBar != null) {
                                                    i10 = R.id.progressbar_get_code_ori_email;
                                                    ProgressBar progressBar2 = (ProgressBar) e.s(R.id.progressbar_get_code_ori_email, viewInflate);
                                                    if (progressBar2 != null) {
                                                        i10 = R.id.scroll_view;
                                                        ScrollView scrollView = (ScrollView) e.s(R.id.scroll_view, viewInflate);
                                                        if (scrollView != null) {
                                                            i10 = R.id.toolbar;
                                                            Toolbar toolbar = (Toolbar) e.s(R.id.toolbar, viewInflate);
                                                            if (toolbar != null) {
                                                                i10 = R.id.tv_original_email;
                                                                TextView textView = (TextView) e.s(R.id.tv_original_email, viewInflate);
                                                                if (textView != null) {
                                                                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                    this.C = new e80(frameLayout, appCompatTextView, appCompatTextView2, materialButton, cardView, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, cardView2, progressBar, progressBar2, scrollView, toolbar, textView);
                                                                    setContentView(frameLayout);
                                                                    e80 e80Var = this.C;
                                                                    if (e80Var == null) {
                                                                        k.k("binding");
                                                                        throw null;
                                                                    }
                                                                    z((Toolbar) e80Var.f10741o);
                                                                    A();
                                                                    bh.c.d(this.D);
                                                                    String strA = bh.c.a();
                                                                    k.b(strA);
                                                                    User userB = bh.c.b();
                                                                    k.b(userB);
                                                                    String email = userB.getAccount().getEmail();
                                                                    int i11 = R.string.bind_email;
                                                                    setTitle(email == null ? R.string.bind_email : R.string.change_email);
                                                                    e80 e80Var2 = this.C;
                                                                    if (e80Var2 == null) {
                                                                        k.k("binding");
                                                                        throw null;
                                                                    }
                                                                    MaterialButton materialButton2 = (MaterialButton) e80Var2.f10732d;
                                                                    if (email != null) {
                                                                        i11 = R.string.change_email;
                                                                    }
                                                                    materialButton2.setText(i11);
                                                                    ((CardView) e80Var2.f10733e).setVisibility(email == null ? 0 : 8);
                                                                    ((TextView) e80Var2.f10742p).setText(email);
                                                                    ((CardView) e80Var2.f10737k).setVisibility(email != null ? 0 : 8);
                                                                    final int i12 = 3;
                                                                    ((AppCompatTextView) e80Var2.f10731c).setOnClickListener(new g(i12, this, strA));
                                                                    ((AppCompatTextView) e80Var2.f10730b).setOnClickListener(new hh.a(this, strA, e80Var2, i4));
                                                                    materialButton2.setOnClickListener(new sa(e80Var2, this, strA, userB, 1));
                                                                    final int i13 = 4;
                                                                    D().f25087c.e(this, new bh.i(new mk.c(this) { // from class: hh.b

                                                                        /* renamed from: b, reason: collision with root package name */
                                                                        public final /* synthetic */ BindEmailActivity f25071b;

                                                                        {
                                                                            this.f25071b = this;
                                                                        }

                                                                        @Override // mk.c
                                                                        public final Object invoke(Object obj) {
                                                                            int i14 = i4;
                                                                            yj.u uVar = yj.u.f37649a;
                                                                            BindEmailActivity bindEmailActivity = this.f25071b;
                                                                            switch (i14) {
                                                                                case 0:
                                                                                    String str = (String) obj;
                                                                                    int i15 = BindEmailActivity.E;
                                                                                    nk.k.b(str);
                                                                                    hg.a.C(bindEmailActivity, str);
                                                                                    return uVar;
                                                                                case 1:
                                                                                    int i16 = BindEmailActivity.E;
                                                                                    if (((ng.a) obj).f29942a) {
                                                                                        rg.c.f32943p0.B(bindEmailActivity, null);
                                                                                    } else {
                                                                                        u0 u0VarS = bindEmailActivity.s();
                                                                                        nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                                                                                        z zVarD = u0VarS.D("CommonLoadingDialog");
                                                                                        if (zVarD != null) {
                                                                                            b5.a aVar = new b5.a(u0VarS);
                                                                                            aVar.j(zVarD);
                                                                                            aVar.g();
                                                                                        }
                                                                                    }
                                                                                    return uVar;
                                                                                case 2:
                                                                                    r rVar = (r) obj;
                                                                                    e80 e80Var3 = bindEmailActivity.C;
                                                                                    if (e80Var3 == null) {
                                                                                        nk.k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) e80Var3.f10731c;
                                                                                    appCompatTextView3.setEnabled(rVar.f25124a);
                                                                                    appCompatTextView3.setText(rVar.f25125b);
                                                                                    e80 e80Var4 = bindEmailActivity.C;
                                                                                    if (e80Var4 != null) {
                                                                                        ((ProgressBar) e80Var4.f10739m).setVisibility(rVar.f25126c ? 0 : 8);
                                                                                        return uVar;
                                                                                    }
                                                                                    nk.k.k("binding");
                                                                                    throw null;
                                                                                case 3:
                                                                                    r rVar2 = (r) obj;
                                                                                    e80 e80Var5 = bindEmailActivity.C;
                                                                                    if (e80Var5 == null) {
                                                                                        nk.k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) e80Var5.f10730b;
                                                                                    appCompatTextView4.setEnabled(rVar2.f25124a);
                                                                                    appCompatTextView4.setText(rVar2.f25125b);
                                                                                    e80 e80Var6 = bindEmailActivity.C;
                                                                                    if (e80Var6 != null) {
                                                                                        ((ProgressBar) e80Var6.f10738l).setVisibility(rVar2.f25126c ? 0 : 8);
                                                                                        return uVar;
                                                                                    }
                                                                                    nk.k.k("binding");
                                                                                    throw null;
                                                                                default:
                                                                                    int i17 = BindEmailActivity.E;
                                                                                    String email2 = ((User) obj).getAccount().getEmail();
                                                                                    if (email2 == null) {
                                                                                        email2 = "null";
                                                                                    }
                                                                                    t7.m mVar = new t7.m(bindEmailActivity);
                                                                                    mVar.y(R.string.bind_email_successful);
                                                                                    String string = bindEmailActivity.getString(R.string.bind_email_to_s_succssful, email2);
                                                                                    nk.k.d(string, "getString(...)");
                                                                                    SpannableString spannableString = new SpannableString(string);
                                                                                    int iF0 = vk.i.F0(string, email2, 0, false, 6);
                                                                                    spannableString.setSpan(new StyleSpan(1), iF0, email2.length() + iF0, 33);
                                                                                    i.b bVar = (i.b) mVar.f34474c;
                                                                                    bVar.f25235f = spannableString;
                                                                                    bVar.f25240m = false;
                                                                                    mVar.x(R.string.confirm, new eg.d(2, bindEmailActivity));
                                                                                    mVar.A();
                                                                                    return uVar;
                                                                            }
                                                                        }
                                                                    }, i13));
                                                                    final int i14 = 1;
                                                                    D().g.e(this, new bh.i(new mk.c(this) { // from class: hh.b

                                                                        /* renamed from: b, reason: collision with root package name */
                                                                        public final /* synthetic */ BindEmailActivity f25071b;

                                                                        {
                                                                            this.f25071b = this;
                                                                        }

                                                                        @Override // mk.c
                                                                        public final Object invoke(Object obj) {
                                                                            int i142 = i14;
                                                                            yj.u uVar = yj.u.f37649a;
                                                                            BindEmailActivity bindEmailActivity = this.f25071b;
                                                                            switch (i142) {
                                                                                case 0:
                                                                                    String str = (String) obj;
                                                                                    int i15 = BindEmailActivity.E;
                                                                                    nk.k.b(str);
                                                                                    hg.a.C(bindEmailActivity, str);
                                                                                    return uVar;
                                                                                case 1:
                                                                                    int i16 = BindEmailActivity.E;
                                                                                    if (((ng.a) obj).f29942a) {
                                                                                        rg.c.f32943p0.B(bindEmailActivity, null);
                                                                                    } else {
                                                                                        u0 u0VarS = bindEmailActivity.s();
                                                                                        nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                                                                                        z zVarD = u0VarS.D("CommonLoadingDialog");
                                                                                        if (zVarD != null) {
                                                                                            b5.a aVar = new b5.a(u0VarS);
                                                                                            aVar.j(zVarD);
                                                                                            aVar.g();
                                                                                        }
                                                                                    }
                                                                                    return uVar;
                                                                                case 2:
                                                                                    r rVar = (r) obj;
                                                                                    e80 e80Var3 = bindEmailActivity.C;
                                                                                    if (e80Var3 == null) {
                                                                                        nk.k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) e80Var3.f10731c;
                                                                                    appCompatTextView3.setEnabled(rVar.f25124a);
                                                                                    appCompatTextView3.setText(rVar.f25125b);
                                                                                    e80 e80Var4 = bindEmailActivity.C;
                                                                                    if (e80Var4 != null) {
                                                                                        ((ProgressBar) e80Var4.f10739m).setVisibility(rVar.f25126c ? 0 : 8);
                                                                                        return uVar;
                                                                                    }
                                                                                    nk.k.k("binding");
                                                                                    throw null;
                                                                                case 3:
                                                                                    r rVar2 = (r) obj;
                                                                                    e80 e80Var5 = bindEmailActivity.C;
                                                                                    if (e80Var5 == null) {
                                                                                        nk.k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) e80Var5.f10730b;
                                                                                    appCompatTextView4.setEnabled(rVar2.f25124a);
                                                                                    appCompatTextView4.setText(rVar2.f25125b);
                                                                                    e80 e80Var6 = bindEmailActivity.C;
                                                                                    if (e80Var6 != null) {
                                                                                        ((ProgressBar) e80Var6.f10738l).setVisibility(rVar2.f25126c ? 0 : 8);
                                                                                        return uVar;
                                                                                    }
                                                                                    nk.k.k("binding");
                                                                                    throw null;
                                                                                default:
                                                                                    int i17 = BindEmailActivity.E;
                                                                                    String email2 = ((User) obj).getAccount().getEmail();
                                                                                    if (email2 == null) {
                                                                                        email2 = "null";
                                                                                    }
                                                                                    t7.m mVar = new t7.m(bindEmailActivity);
                                                                                    mVar.y(R.string.bind_email_successful);
                                                                                    String string = bindEmailActivity.getString(R.string.bind_email_to_s_succssful, email2);
                                                                                    nk.k.d(string, "getString(...)");
                                                                                    SpannableString spannableString = new SpannableString(string);
                                                                                    int iF0 = vk.i.F0(string, email2, 0, false, 6);
                                                                                    spannableString.setSpan(new StyleSpan(1), iF0, email2.length() + iF0, 33);
                                                                                    i.b bVar = (i.b) mVar.f34474c;
                                                                                    bVar.f25235f = spannableString;
                                                                                    bVar.f25240m = false;
                                                                                    mVar.x(R.string.confirm, new eg.d(2, bindEmailActivity));
                                                                                    mVar.A();
                                                                                    return uVar;
                                                                            }
                                                                        }
                                                                    }, i13));
                                                                    final int i15 = 2;
                                                                    D().f25089e.e(this, new bh.i(new mk.c(this) { // from class: hh.b

                                                                        /* renamed from: b, reason: collision with root package name */
                                                                        public final /* synthetic */ BindEmailActivity f25071b;

                                                                        {
                                                                            this.f25071b = this;
                                                                        }

                                                                        @Override // mk.c
                                                                        public final Object invoke(Object obj) {
                                                                            int i142 = i15;
                                                                            yj.u uVar = yj.u.f37649a;
                                                                            BindEmailActivity bindEmailActivity = this.f25071b;
                                                                            switch (i142) {
                                                                                case 0:
                                                                                    String str = (String) obj;
                                                                                    int i152 = BindEmailActivity.E;
                                                                                    nk.k.b(str);
                                                                                    hg.a.C(bindEmailActivity, str);
                                                                                    return uVar;
                                                                                case 1:
                                                                                    int i16 = BindEmailActivity.E;
                                                                                    if (((ng.a) obj).f29942a) {
                                                                                        rg.c.f32943p0.B(bindEmailActivity, null);
                                                                                    } else {
                                                                                        u0 u0VarS = bindEmailActivity.s();
                                                                                        nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                                                                                        z zVarD = u0VarS.D("CommonLoadingDialog");
                                                                                        if (zVarD != null) {
                                                                                            b5.a aVar = new b5.a(u0VarS);
                                                                                            aVar.j(zVarD);
                                                                                            aVar.g();
                                                                                        }
                                                                                    }
                                                                                    return uVar;
                                                                                case 2:
                                                                                    r rVar = (r) obj;
                                                                                    e80 e80Var3 = bindEmailActivity.C;
                                                                                    if (e80Var3 == null) {
                                                                                        nk.k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) e80Var3.f10731c;
                                                                                    appCompatTextView3.setEnabled(rVar.f25124a);
                                                                                    appCompatTextView3.setText(rVar.f25125b);
                                                                                    e80 e80Var4 = bindEmailActivity.C;
                                                                                    if (e80Var4 != null) {
                                                                                        ((ProgressBar) e80Var4.f10739m).setVisibility(rVar.f25126c ? 0 : 8);
                                                                                        return uVar;
                                                                                    }
                                                                                    nk.k.k("binding");
                                                                                    throw null;
                                                                                case 3:
                                                                                    r rVar2 = (r) obj;
                                                                                    e80 e80Var5 = bindEmailActivity.C;
                                                                                    if (e80Var5 == null) {
                                                                                        nk.k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) e80Var5.f10730b;
                                                                                    appCompatTextView4.setEnabled(rVar2.f25124a);
                                                                                    appCompatTextView4.setText(rVar2.f25125b);
                                                                                    e80 e80Var6 = bindEmailActivity.C;
                                                                                    if (e80Var6 != null) {
                                                                                        ((ProgressBar) e80Var6.f10738l).setVisibility(rVar2.f25126c ? 0 : 8);
                                                                                        return uVar;
                                                                                    }
                                                                                    nk.k.k("binding");
                                                                                    throw null;
                                                                                default:
                                                                                    int i17 = BindEmailActivity.E;
                                                                                    String email2 = ((User) obj).getAccount().getEmail();
                                                                                    if (email2 == null) {
                                                                                        email2 = "null";
                                                                                    }
                                                                                    t7.m mVar = new t7.m(bindEmailActivity);
                                                                                    mVar.y(R.string.bind_email_successful);
                                                                                    String string = bindEmailActivity.getString(R.string.bind_email_to_s_succssful, email2);
                                                                                    nk.k.d(string, "getString(...)");
                                                                                    SpannableString spannableString = new SpannableString(string);
                                                                                    int iF0 = vk.i.F0(string, email2, 0, false, 6);
                                                                                    spannableString.setSpan(new StyleSpan(1), iF0, email2.length() + iF0, 33);
                                                                                    i.b bVar = (i.b) mVar.f34474c;
                                                                                    bVar.f25235f = spannableString;
                                                                                    bVar.f25240m = false;
                                                                                    mVar.x(R.string.confirm, new eg.d(2, bindEmailActivity));
                                                                                    mVar.A();
                                                                                    return uVar;
                                                                            }
                                                                        }
                                                                    }, i13));
                                                                    D().f25092i.e(this, new bh.i(new mk.c(this) { // from class: hh.b

                                                                        /* renamed from: b, reason: collision with root package name */
                                                                        public final /* synthetic */ BindEmailActivity f25071b;

                                                                        {
                                                                            this.f25071b = this;
                                                                        }

                                                                        @Override // mk.c
                                                                        public final Object invoke(Object obj) {
                                                                            int i142 = i12;
                                                                            yj.u uVar = yj.u.f37649a;
                                                                            BindEmailActivity bindEmailActivity = this.f25071b;
                                                                            switch (i142) {
                                                                                case 0:
                                                                                    String str = (String) obj;
                                                                                    int i152 = BindEmailActivity.E;
                                                                                    nk.k.b(str);
                                                                                    hg.a.C(bindEmailActivity, str);
                                                                                    return uVar;
                                                                                case 1:
                                                                                    int i16 = BindEmailActivity.E;
                                                                                    if (((ng.a) obj).f29942a) {
                                                                                        rg.c.f32943p0.B(bindEmailActivity, null);
                                                                                    } else {
                                                                                        u0 u0VarS = bindEmailActivity.s();
                                                                                        nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                                                                                        z zVarD = u0VarS.D("CommonLoadingDialog");
                                                                                        if (zVarD != null) {
                                                                                            b5.a aVar = new b5.a(u0VarS);
                                                                                            aVar.j(zVarD);
                                                                                            aVar.g();
                                                                                        }
                                                                                    }
                                                                                    return uVar;
                                                                                case 2:
                                                                                    r rVar = (r) obj;
                                                                                    e80 e80Var3 = bindEmailActivity.C;
                                                                                    if (e80Var3 == null) {
                                                                                        nk.k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) e80Var3.f10731c;
                                                                                    appCompatTextView3.setEnabled(rVar.f25124a);
                                                                                    appCompatTextView3.setText(rVar.f25125b);
                                                                                    e80 e80Var4 = bindEmailActivity.C;
                                                                                    if (e80Var4 != null) {
                                                                                        ((ProgressBar) e80Var4.f10739m).setVisibility(rVar.f25126c ? 0 : 8);
                                                                                        return uVar;
                                                                                    }
                                                                                    nk.k.k("binding");
                                                                                    throw null;
                                                                                case 3:
                                                                                    r rVar2 = (r) obj;
                                                                                    e80 e80Var5 = bindEmailActivity.C;
                                                                                    if (e80Var5 == null) {
                                                                                        nk.k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) e80Var5.f10730b;
                                                                                    appCompatTextView4.setEnabled(rVar2.f25124a);
                                                                                    appCompatTextView4.setText(rVar2.f25125b);
                                                                                    e80 e80Var6 = bindEmailActivity.C;
                                                                                    if (e80Var6 != null) {
                                                                                        ((ProgressBar) e80Var6.f10738l).setVisibility(rVar2.f25126c ? 0 : 8);
                                                                                        return uVar;
                                                                                    }
                                                                                    nk.k.k("binding");
                                                                                    throw null;
                                                                                default:
                                                                                    int i17 = BindEmailActivity.E;
                                                                                    String email2 = ((User) obj).getAccount().getEmail();
                                                                                    if (email2 == null) {
                                                                                        email2 = "null";
                                                                                    }
                                                                                    t7.m mVar = new t7.m(bindEmailActivity);
                                                                                    mVar.y(R.string.bind_email_successful);
                                                                                    String string = bindEmailActivity.getString(R.string.bind_email_to_s_succssful, email2);
                                                                                    nk.k.d(string, "getString(...)");
                                                                                    SpannableString spannableString = new SpannableString(string);
                                                                                    int iF0 = vk.i.F0(string, email2, 0, false, 6);
                                                                                    spannableString.setSpan(new StyleSpan(1), iF0, email2.length() + iF0, 33);
                                                                                    i.b bVar = (i.b) mVar.f34474c;
                                                                                    bVar.f25235f = spannableString;
                                                                                    bVar.f25240m = false;
                                                                                    mVar.x(R.string.confirm, new eg.d(2, bindEmailActivity));
                                                                                    mVar.A();
                                                                                    return uVar;
                                                                            }
                                                                        }
                                                                    }, i13));
                                                                    D().f25093k.e(this, new bh.i(new mk.c(this) { // from class: hh.b

                                                                        /* renamed from: b, reason: collision with root package name */
                                                                        public final /* synthetic */ BindEmailActivity f25071b;

                                                                        {
                                                                            this.f25071b = this;
                                                                        }

                                                                        @Override // mk.c
                                                                        public final Object invoke(Object obj) {
                                                                            int i142 = i13;
                                                                            yj.u uVar = yj.u.f37649a;
                                                                            BindEmailActivity bindEmailActivity = this.f25071b;
                                                                            switch (i142) {
                                                                                case 0:
                                                                                    String str = (String) obj;
                                                                                    int i152 = BindEmailActivity.E;
                                                                                    nk.k.b(str);
                                                                                    hg.a.C(bindEmailActivity, str);
                                                                                    return uVar;
                                                                                case 1:
                                                                                    int i16 = BindEmailActivity.E;
                                                                                    if (((ng.a) obj).f29942a) {
                                                                                        rg.c.f32943p0.B(bindEmailActivity, null);
                                                                                    } else {
                                                                                        u0 u0VarS = bindEmailActivity.s();
                                                                                        nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                                                                                        z zVarD = u0VarS.D("CommonLoadingDialog");
                                                                                        if (zVarD != null) {
                                                                                            b5.a aVar = new b5.a(u0VarS);
                                                                                            aVar.j(zVarD);
                                                                                            aVar.g();
                                                                                        }
                                                                                    }
                                                                                    return uVar;
                                                                                case 2:
                                                                                    r rVar = (r) obj;
                                                                                    e80 e80Var3 = bindEmailActivity.C;
                                                                                    if (e80Var3 == null) {
                                                                                        nk.k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) e80Var3.f10731c;
                                                                                    appCompatTextView3.setEnabled(rVar.f25124a);
                                                                                    appCompatTextView3.setText(rVar.f25125b);
                                                                                    e80 e80Var4 = bindEmailActivity.C;
                                                                                    if (e80Var4 != null) {
                                                                                        ((ProgressBar) e80Var4.f10739m).setVisibility(rVar.f25126c ? 0 : 8);
                                                                                        return uVar;
                                                                                    }
                                                                                    nk.k.k("binding");
                                                                                    throw null;
                                                                                case 3:
                                                                                    r rVar2 = (r) obj;
                                                                                    e80 e80Var5 = bindEmailActivity.C;
                                                                                    if (e80Var5 == null) {
                                                                                        nk.k.k("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) e80Var5.f10730b;
                                                                                    appCompatTextView4.setEnabled(rVar2.f25124a);
                                                                                    appCompatTextView4.setText(rVar2.f25125b);
                                                                                    e80 e80Var6 = bindEmailActivity.C;
                                                                                    if (e80Var6 != null) {
                                                                                        ((ProgressBar) e80Var6.f10738l).setVisibility(rVar2.f25126c ? 0 : 8);
                                                                                        return uVar;
                                                                                    }
                                                                                    nk.k.k("binding");
                                                                                    throw null;
                                                                                default:
                                                                                    int i17 = BindEmailActivity.E;
                                                                                    String email2 = ((User) obj).getAccount().getEmail();
                                                                                    if (email2 == null) {
                                                                                        email2 = "null";
                                                                                    }
                                                                                    t7.m mVar = new t7.m(bindEmailActivity);
                                                                                    mVar.y(R.string.bind_email_successful);
                                                                                    String string = bindEmailActivity.getString(R.string.bind_email_to_s_succssful, email2);
                                                                                    nk.k.d(string, "getString(...)");
                                                                                    SpannableString spannableString = new SpannableString(string);
                                                                                    int iF0 = vk.i.F0(string, email2, 0, false, 6);
                                                                                    spannableString.setSpan(new StyleSpan(1), iF0, email2.length() + iF0, 33);
                                                                                    i.b bVar = (i.b) mVar.f34474c;
                                                                                    bVar.f25235f = spannableString;
                                                                                    bVar.f25240m = false;
                                                                                    mVar.x(R.string.confirm, new eg.d(2, bindEmailActivity));
                                                                                    mVar.A();
                                                                                    return uVar;
                                                                            }
                                                                        }
                                                                    }, i13));
                                                                    e80 e80Var3 = this.C;
                                                                    if (e80Var3 == null) {
                                                                        k.k("binding");
                                                                        throw null;
                                                                    }
                                                                    zh.i.e((Toolbar) e80Var3.f10741o);
                                                                    e80 e80Var4 = this.C;
                                                                    if (e80Var4 == null) {
                                                                        k.k("binding");
                                                                        throw null;
                                                                    }
                                                                    FrameLayout frameLayout2 = (FrameLayout) e80Var4.f10729a;
                                                                    b bVar = new b(16, this);
                                                                    WeakHashMap weakHashMap = v0.f22405a;
                                                                    m0.j(frameLayout2, bVar);
                                                                    return;
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        bh.c.g(this.D);
    }
}
