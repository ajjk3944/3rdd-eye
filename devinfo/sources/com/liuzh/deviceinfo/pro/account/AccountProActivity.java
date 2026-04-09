package com.liuzh.deviceinfo.pro.account;

import ah.i;
import ah.o;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.f1;
import androidx.lifecycle.o0;
import androidx.lifecycle.y0;
import b5.u0;
import b5.z;
import bh.c;
import bh.d;
import bh.j;
import bh.t;
import bh.u;
import bh.w;
import cm.g;
import com.google.android.material.button.MaterialButton;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.AccountProActivity;
import com.liuzh.deviceinfo.pro.account.login.LogInActivity;
import com.liuzh.deviceinfo.pro.account.mode.User;
import com.liuzh.deviceinfo.pro.account.mode.Vip;
import com.liuzh.deviceinfo.pro.account.register.RegisterActivity;
import com.liuzh.deviceinfo.view.CircleImageView;
import e4.m0;
import e4.v0;
import f.h;
import hg.a;
import i.b;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import nk.k;
import nk.v;
import t7.m;
import xk.x;
import yb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class AccountProActivity extends a {
    public static final /* synthetic */ int H = 0;
    public h B;
    public h C;
    public qg.a D;
    public final f1 E = new f1(v.a(w.class), new j(this, 1), new j(this, 0), new j(this, 2));
    public final bh.a F = new bh.a(this, 1);
    public final i G = new i(1, this);

    public final void D() {
        Vip vip;
        User userB = c.b();
        qg.a aVar = this.D;
        if (aVar == null) {
            k.k("binding");
            throw null;
        }
        CircleImageView circleImageView = aVar.f32310k;
        TextView textView = aVar.f32324y;
        TextView textView2 = aVar.f32322w;
        boolean zC = o.f400d.c();
        c cVar = c.f2188a;
        boolean zC2 = c.c();
        int i4 = 8;
        textView2.setVisibility(zC2 ? 0 : 8);
        textView.setVisibility(zC2 ? 0 : 8);
        aVar.f32303b.setVisibility(!zC2 ? 0 : 8);
        if (userB != null) {
            textView2.setText(userB.getNickname());
            textView.setText(getString(R.string.registered_at, new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(Long.valueOf(userB.getRegisterTime()))));
            circleImageView.setImageResource(userB.getVip().getAvailable() ? R.drawable.ic_avatar_pro : R.drawable.ic_avatar_default);
        } else {
            circleImageView.setImageResource(R.drawable.ic_avatar_not_login);
        }
        aVar.f32323x.setVisibility(!zC ? 0 : 8);
        aVar.f32312m.setVisibility(!zC ? 0 : 8);
        TextView textView3 = aVar.f32318s;
        if (userB != null && (vip = userB.getVip()) != null && vip.getAvailable()) {
            i4 = 0;
        }
        textView3.setVisibility(i4);
        aVar.f32305d.setVisibility(zC ? 4 : 0);
        G();
    }

    public final w E() {
        return (w) this.E.getValue();
    }

    public final void F() {
        o oVar = o.f400d;
        if (oVar.c()) {
            return;
        }
        qg.a aVar = this.D;
        ck.c cVar = null;
        if (aVar == null) {
            k.k("binding");
            throw null;
        }
        int i4 = 1;
        if (aVar.f32313n.isSelected()) {
        }
        c cVar2 = c.f2188a;
        if (!c.c()) {
            h hVar = this.B;
            if (hVar != null) {
                hVar.a(Boolean.TRUE);
                return;
            } else {
                k.k("loginLauncher");
                throw null;
            }
        }
        qg.a aVar2 = this.D;
        if (aVar2 == null) {
            k.k("binding");
            throw null;
        }
        if (aVar2.f32314o.isSelected()) {
            w wVarE = E();
            String strA = c.a();
            k.b(strA);
            wVarE.getClass();
            x.v(y0.g(wVarE), null, null, new u(strA, wVarE, 0, cVar, 0), 3);
            return;
        }
        qg.a aVar3 = this.D;
        if (aVar3 == null) {
            k.k("binding");
            throw null;
        }
        if (aVar3.f32313n.isSelected()) {
            w wVarE2 = E();
            WeakReference weakReference = new WeakReference(this);
            String strA2 = c.a();
            k.b(strA2);
            wVarE2.getClass();
            if (oVar.f401a.r() != 1) {
                return;
            }
            x.v(y0.g(wVarE2), null, null, new t(strA2, wVarE2, weakReference, cVar, 0), 3);
            return;
        }
        qg.a aVar4 = this.D;
        if (aVar4 == null) {
            k.k("binding");
            throw null;
        }
        if (aVar4.f32311l.isSelected()) {
            w wVarE3 = E();
            String strA3 = c.a();
            k.b(strA3);
            wVarE3.getClass();
            x.v(y0.g(wVarE3), null, null, new u(strA3, wVarE3, i4, cVar, 0), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G() {
        String string;
        qg.a aVar = this.D;
        if (aVar == null) {
            k.k("binding");
            throw null;
        }
        aVar.f32316q.setVisibility(8);
        if (o.f400d.c()) {
            string = getString(R.string.purchased_the_pro_version);
            k.d(string, "getString(...)");
        } else {
            String str = String.format(je.u.t("¥%.2f/", E().f2252l.duration()), Arrays.copyOf(new Object[]{Float.valueOf(r0.getAmount() / 100.0f)}, 1));
            String string2 = getString(R.string.purchase);
            k.d(string2, "getString(...)");
            SpannableString spannableString = new SpannableString(d.h.E(string2, "\n", str));
            int length = string2.length();
            int length2 = spannableString.length();
            spannableString.setSpan(new AbsoluteSizeSpan(11, true), length, length2, 33);
            spannableString.setSpan(new ForegroundColorSpan(g.H(-1, 0.86f)), length, length2, 33);
            string = spannableString;
        }
        qg.a aVar2 = this.D;
        if (aVar2 != null) {
            aVar2.f32304c.setText(string);
        } else {
            k.k("binding");
            throw null;
        }
    }

    @Override // i.g, d.j, android.app.Activity
    public final void onActivityResult(int i4, int i10, Intent intent) {
        super.onActivityResult(i4, i10, intent);
        if (i4 != 123) {
            if (i4 != 124) {
                return;
            }
            w wVarE = E();
            wVarE.getClass();
            o.f400d.q(intent, new o7.c(6, wVarE));
            return;
        }
        w wVarE2 = E();
        wVarE2.getClass();
        String strA = c.a();
        k.b(strA);
        Sku sku = wVarE2.f2254n;
        k.b(sku);
        o.f400d.f(fi.a.f24058a, intent, new e(wVarE2, strA, sku, 4));
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i4 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_pro_cn, (ViewGroup) null, false);
        int i10 = R.id.btn_login_now;
        TextView textView = (TextView) wb.e.s(R.id.btn_login_now, viewInflate);
        if (textView != null) {
            i10 = R.id.btn_purchase;
            Button button = (Button) wb.e.s(R.id.btn_purchase, viewInflate);
            if (button != null) {
                i10 = R.id.btn_restore;
                MaterialButton materialButton = (MaterialButton) wb.e.s(R.id.btn_restore, viewInflate);
                if (materialButton != null) {
                    i10 = R.id.btn_tips_bind;
                    MaterialButton materialButton2 = (MaterialButton) wb.e.s(R.id.btn_tips_bind, viewInflate);
                    if (materialButton2 != null) {
                        i10 = R.id.btn_tips_login;
                        MaterialButton materialButton3 = (MaterialButton) wb.e.s(R.id.btn_tips_login, viewInflate);
                        if (materialButton3 != null) {
                            i10 = R.id.btn_tips_register;
                            MaterialButton materialButton4 = (MaterialButton) wb.e.s(R.id.btn_tips_register, viewInflate);
                            if (materialButton4 != null) {
                                i10 = R.id.btn_tips_restore;
                                MaterialButton materialButton5 = (MaterialButton) wb.e.s(R.id.btn_tips_restore, viewInflate);
                                if (materialButton5 != null) {
                                    i10 = R.id.feature_ads;
                                    if (((TextView) wb.e.s(R.id.feature_ads, viewInflate)) != null) {
                                        i10 = R.id.feature_custom_monitor;
                                        if (((TextView) wb.e.s(R.id.feature_custom_monitor, viewInflate)) != null) {
                                            i10 = R.id.feature_multi_platform;
                                            TextView textView2 = (TextView) wb.e.s(R.id.feature_multi_platform, viewInflate);
                                            if (textView2 != null) {
                                                i10 = R.id.feature_smart_selection;
                                                if (((TextView) wb.e.s(R.id.feature_smart_selection, viewInflate)) != null) {
                                                    i10 = R.id.feature_themes;
                                                    if (((TextView) wb.e.s(R.id.feature_themes, viewInflate)) != null) {
                                                        i10 = R.id.head_card;
                                                        if (((CardView) wb.e.s(R.id.head_card, viewInflate)) != null) {
                                                            i10 = R.id.head_tips_buttons_container;
                                                            LinearLayout linearLayout = (LinearLayout) wb.e.s(R.id.head_tips_buttons_container, viewInflate);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.iv_avatar;
                                                                CircleImageView circleImageView = (CircleImageView) wb.e.s(R.id.iv_avatar, viewInflate);
                                                                if (circleImageView != null) {
                                                                    i10 = R.id.iv_bg;
                                                                    if (((ImageView) wb.e.s(R.id.iv_bg, viewInflate)) != null) {
                                                                        i10 = R.id.nickname_container;
                                                                        if (((LinearLayout) wb.e.s(R.id.nickname_container, viewInflate)) != null) {
                                                                            i10 = R.id.pay_method_alipay;
                                                                            TextView textView3 = (TextView) wb.e.s(R.id.pay_method_alipay, viewInflate);
                                                                            if (textView3 != null) {
                                                                                i10 = R.id.pay_method_container;
                                                                                LinearLayout linearLayout2 = (LinearLayout) wb.e.s(R.id.pay_method_container, viewInflate);
                                                                                if (linearLayout2 != null) {
                                                                                    i10 = R.id.pay_method_huawei;
                                                                                    TextView textView4 = (TextView) wb.e.s(R.id.pay_method_huawei, viewInflate);
                                                                                    if (textView4 != null) {
                                                                                        i10 = R.id.pay_method_wechat;
                                                                                        TextView textView5 = (TextView) wb.e.s(R.id.pay_method_wechat, viewInflate);
                                                                                        if (textView5 != null) {
                                                                                            i10 = R.id.privacy_policy;
                                                                                            TextView textView6 = (TextView) wb.e.s(R.id.privacy_policy, viewInflate);
                                                                                            if (textView6 != null) {
                                                                                                i10 = R.id.purchase_loading;
                                                                                                ProgressBar progressBar = (ProgressBar) wb.e.s(R.id.purchase_loading, viewInflate);
                                                                                                if (progressBar != null) {
                                                                                                    i10 = R.id.scroll_view;
                                                                                                    ScrollView scrollView = (ScrollView) wb.e.s(R.id.scroll_view, viewInflate);
                                                                                                    if (scrollView != null) {
                                                                                                        i10 = R.id.tag_user_pro;
                                                                                                        TextView textView7 = (TextView) wb.e.s(R.id.tag_user_pro, viewInflate);
                                                                                                        if (textView7 != null) {
                                                                                                            i10 = R.id.term_of_service;
                                                                                                            TextView textView8 = (TextView) wb.e.s(R.id.term_of_service, viewInflate);
                                                                                                            if (textView8 != null) {
                                                                                                                i10 = R.id.title;
                                                                                                                if (((AppCompatTextView) wb.e.s(R.id.title, viewInflate)) != null) {
                                                                                                                    i10 = R.id.toolbar;
                                                                                                                    Toolbar toolbar = (Toolbar) wb.e.s(R.id.toolbar, viewInflate);
                                                                                                                    if (toolbar != null) {
                                                                                                                        i10 = R.id.tv_head_tips;
                                                                                                                        TextView textView9 = (TextView) wb.e.s(R.id.tv_head_tips, viewInflate);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i10 = R.id.tv_nickname;
                                                                                                                            TextView textView10 = (TextView) wb.e.s(R.id.tv_nickname, viewInflate);
                                                                                                                            if (textView10 != null) {
                                                                                                                                i10 = R.id.tv_pay_method;
                                                                                                                                TextView textView11 = (TextView) wb.e.s(R.id.tv_pay_method, viewInflate);
                                                                                                                                if (textView11 != null) {
                                                                                                                                    i10 = R.id.tv_user_info;
                                                                                                                                    TextView textView12 = (TextView) wb.e.s(R.id.tv_user_info, viewInflate);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                                                                                        this.D = new qg.a(frameLayout, textView, button, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, textView2, linearLayout, circleImageView, textView3, linearLayout2, textView4, textView5, textView6, progressBar, scrollView, textView7, textView8, toolbar, textView9, textView10, textView11, textView12);
                                                                                                                                        setContentView(frameLayout);
                                                                                                                                        qg.a aVar = this.D;
                                                                                                                                        if (aVar == null) {
                                                                                                                                            k.k("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        z(aVar.f32320u);
                                                                                                                                        A();
                                                                                                                                        qg.a aVar2 = this.D;
                                                                                                                                        if (aVar2 == null) {
                                                                                                                                            k.k("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        zh.i.e(aVar2.f32320u);
                                                                                                                                        int color = getColor(R.color.white_black);
                                                                                                                                        qg.a aVar3 = this.D;
                                                                                                                                        if (aVar3 == null) {
                                                                                                                                            k.k("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        aVar3.f32320u.setBackgroundColor(g.H(color, 0.95f));
                                                                                                                                        this.B = (h) h(LogInActivity.D, new d(this));
                                                                                                                                        final int i11 = 3;
                                                                                                                                        this.C = (h) h(RegisterActivity.B, new a0.x(i11));
                                                                                                                                        c.d(this.F);
                                                                                                                                        o.f400d.b(this.G);
                                                                                                                                        final qg.a aVar4 = this.D;
                                                                                                                                        if (aVar4 == null) {
                                                                                                                                            k.k("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        TextView textView13 = aVar4.f32311l;
                                                                                                                                        TextView textView14 = aVar4.f32314o;
                                                                                                                                        TextView textView15 = aVar4.f32313n;
                                                                                                                                        aVar4.f32315p.setOnClickListener(new View.OnClickListener(this) { // from class: bh.e

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2194b;

                                                                                                                                            {
                                                                                                                                                this.f2194b = this;
                                                                                                                                            }

                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i12 = i4;
                                                                                                                                                AccountProActivity accountProActivity = this.f2194b;
                                                                                                                                                switch (i12) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i13 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.n(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 1:
                                                                                                                                                        int i14 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.o(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 2:
                                                                                                                                                        int i15 = AccountProActivity.H;
                                                                                                                                                        if (!c.c()) {
                                                                                                                                                            f.h hVar = accountProActivity.B;
                                                                                                                                                            if (hVar != null) {
                                                                                                                                                                hVar.a(Boolean.TRUE);
                                                                                                                                                                return;
                                                                                                                                                            } else {
                                                                                                                                                                nk.k.k("loginLauncher");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (ah.o.f400d.c()) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        String strA = c.a();
                                                                                                                                                        nk.k.b(strA);
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        if (System.currentTimeMillis() - wVarE.f2253m < 5000) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        xk.x.v(y0.g(wVarE), null, null, new al.p(strA, wVarE, null, 5), 3);
                                                                                                                                                        return;
                                                                                                                                                    case 3:
                                                                                                                                                        f.h hVar2 = accountProActivity.B;
                                                                                                                                                        if (hVar2 != null) {
                                                                                                                                                            hVar2.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 4:
                                                                                                                                                        int i16 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.F();
                                                                                                                                                        return;
                                                                                                                                                    case 5:
                                                                                                                                                        f.h hVar3 = accountProActivity.B;
                                                                                                                                                        if (hVar3 != null) {
                                                                                                                                                            hVar3.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 6:
                                                                                                                                                        f.h hVar4 = accountProActivity.C;
                                                                                                                                                        if (hVar4 != null) {
                                                                                                                                                            hVar4.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("registerLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 7:
                                                                                                                                                        int i17 = AccountProActivity.H;
                                                                                                                                                        t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                        mVar.y(R.string.feature_multi_platform);
                                                                                                                                                        mVar.v(R.string.feature_multi_platform_summary);
                                                                                                                                                        mVar.x(R.string.confirm, null);
                                                                                                                                                        mVar.A();
                                                                                                                                                        return;
                                                                                                                                                    default:
                                                                                                                                                        int i18 = AccountProActivity.H;
                                                                                                                                                        w wVarE2 = accountProActivity.E();
                                                                                                                                                        wVarE2.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        if (oVar.f401a.r() != 1) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        oVar.e(accountProActivity, new p6.i(wVarE2));
                                                                                                                                                        return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        final int i12 = 1;
                                                                                                                                        aVar4.f32319t.setOnClickListener(new View.OnClickListener(this) { // from class: bh.e

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2194b;

                                                                                                                                            {
                                                                                                                                                this.f2194b = this;
                                                                                                                                            }

                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i122 = i12;
                                                                                                                                                AccountProActivity accountProActivity = this.f2194b;
                                                                                                                                                switch (i122) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i13 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.n(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 1:
                                                                                                                                                        int i14 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.o(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 2:
                                                                                                                                                        int i15 = AccountProActivity.H;
                                                                                                                                                        if (!c.c()) {
                                                                                                                                                            f.h hVar = accountProActivity.B;
                                                                                                                                                            if (hVar != null) {
                                                                                                                                                                hVar.a(Boolean.TRUE);
                                                                                                                                                                return;
                                                                                                                                                            } else {
                                                                                                                                                                nk.k.k("loginLauncher");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (ah.o.f400d.c()) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        String strA = c.a();
                                                                                                                                                        nk.k.b(strA);
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        if (System.currentTimeMillis() - wVarE.f2253m < 5000) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        xk.x.v(y0.g(wVarE), null, null, new al.p(strA, wVarE, null, 5), 3);
                                                                                                                                                        return;
                                                                                                                                                    case 3:
                                                                                                                                                        f.h hVar2 = accountProActivity.B;
                                                                                                                                                        if (hVar2 != null) {
                                                                                                                                                            hVar2.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 4:
                                                                                                                                                        int i16 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.F();
                                                                                                                                                        return;
                                                                                                                                                    case 5:
                                                                                                                                                        f.h hVar3 = accountProActivity.B;
                                                                                                                                                        if (hVar3 != null) {
                                                                                                                                                            hVar3.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 6:
                                                                                                                                                        f.h hVar4 = accountProActivity.C;
                                                                                                                                                        if (hVar4 != null) {
                                                                                                                                                            hVar4.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("registerLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 7:
                                                                                                                                                        int i17 = AccountProActivity.H;
                                                                                                                                                        t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                        mVar.y(R.string.feature_multi_platform);
                                                                                                                                                        mVar.v(R.string.feature_multi_platform_summary);
                                                                                                                                                        mVar.x(R.string.confirm, null);
                                                                                                                                                        mVar.A();
                                                                                                                                                        return;
                                                                                                                                                    default:
                                                                                                                                                        int i18 = AccountProActivity.H;
                                                                                                                                                        w wVarE2 = accountProActivity.E();
                                                                                                                                                        wVarE2.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        if (oVar.f401a.r() != 1) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        oVar.e(accountProActivity, new p6.i(wVarE2));
                                                                                                                                                        return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        final int i13 = 2;
                                                                                                                                        aVar4.f32305d.setOnClickListener(new View.OnClickListener(this) { // from class: bh.e

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2194b;

                                                                                                                                            {
                                                                                                                                                this.f2194b = this;
                                                                                                                                            }

                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i122 = i13;
                                                                                                                                                AccountProActivity accountProActivity = this.f2194b;
                                                                                                                                                switch (i122) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i132 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.n(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 1:
                                                                                                                                                        int i14 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.o(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 2:
                                                                                                                                                        int i15 = AccountProActivity.H;
                                                                                                                                                        if (!c.c()) {
                                                                                                                                                            f.h hVar = accountProActivity.B;
                                                                                                                                                            if (hVar != null) {
                                                                                                                                                                hVar.a(Boolean.TRUE);
                                                                                                                                                                return;
                                                                                                                                                            } else {
                                                                                                                                                                nk.k.k("loginLauncher");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (ah.o.f400d.c()) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        String strA = c.a();
                                                                                                                                                        nk.k.b(strA);
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        if (System.currentTimeMillis() - wVarE.f2253m < 5000) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        xk.x.v(y0.g(wVarE), null, null, new al.p(strA, wVarE, null, 5), 3);
                                                                                                                                                        return;
                                                                                                                                                    case 3:
                                                                                                                                                        f.h hVar2 = accountProActivity.B;
                                                                                                                                                        if (hVar2 != null) {
                                                                                                                                                            hVar2.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 4:
                                                                                                                                                        int i16 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.F();
                                                                                                                                                        return;
                                                                                                                                                    case 5:
                                                                                                                                                        f.h hVar3 = accountProActivity.B;
                                                                                                                                                        if (hVar3 != null) {
                                                                                                                                                            hVar3.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 6:
                                                                                                                                                        f.h hVar4 = accountProActivity.C;
                                                                                                                                                        if (hVar4 != null) {
                                                                                                                                                            hVar4.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("registerLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 7:
                                                                                                                                                        int i17 = AccountProActivity.H;
                                                                                                                                                        t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                        mVar.y(R.string.feature_multi_platform);
                                                                                                                                                        mVar.v(R.string.feature_multi_platform_summary);
                                                                                                                                                        mVar.x(R.string.confirm, null);
                                                                                                                                                        mVar.A();
                                                                                                                                                        return;
                                                                                                                                                    default:
                                                                                                                                                        int i18 = AccountProActivity.H;
                                                                                                                                                        w wVarE2 = accountProActivity.E();
                                                                                                                                                        wVarE2.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        if (oVar.f401a.r() != 1) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        oVar.e(accountProActivity, new p6.i(wVarE2));
                                                                                                                                                        return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        aVar4.f32303b.setOnClickListener(new View.OnClickListener(this) { // from class: bh.e

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2194b;

                                                                                                                                            {
                                                                                                                                                this.f2194b = this;
                                                                                                                                            }

                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i122 = i11;
                                                                                                                                                AccountProActivity accountProActivity = this.f2194b;
                                                                                                                                                switch (i122) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i132 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.n(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 1:
                                                                                                                                                        int i14 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.o(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 2:
                                                                                                                                                        int i15 = AccountProActivity.H;
                                                                                                                                                        if (!c.c()) {
                                                                                                                                                            f.h hVar = accountProActivity.B;
                                                                                                                                                            if (hVar != null) {
                                                                                                                                                                hVar.a(Boolean.TRUE);
                                                                                                                                                                return;
                                                                                                                                                            } else {
                                                                                                                                                                nk.k.k("loginLauncher");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (ah.o.f400d.c()) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        String strA = c.a();
                                                                                                                                                        nk.k.b(strA);
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        if (System.currentTimeMillis() - wVarE.f2253m < 5000) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        xk.x.v(y0.g(wVarE), null, null, new al.p(strA, wVarE, null, 5), 3);
                                                                                                                                                        return;
                                                                                                                                                    case 3:
                                                                                                                                                        f.h hVar2 = accountProActivity.B;
                                                                                                                                                        if (hVar2 != null) {
                                                                                                                                                            hVar2.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 4:
                                                                                                                                                        int i16 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.F();
                                                                                                                                                        return;
                                                                                                                                                    case 5:
                                                                                                                                                        f.h hVar3 = accountProActivity.B;
                                                                                                                                                        if (hVar3 != null) {
                                                                                                                                                            hVar3.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 6:
                                                                                                                                                        f.h hVar4 = accountProActivity.C;
                                                                                                                                                        if (hVar4 != null) {
                                                                                                                                                            hVar4.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("registerLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 7:
                                                                                                                                                        int i17 = AccountProActivity.H;
                                                                                                                                                        t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                        mVar.y(R.string.feature_multi_platform);
                                                                                                                                                        mVar.v(R.string.feature_multi_platform_summary);
                                                                                                                                                        mVar.x(R.string.confirm, null);
                                                                                                                                                        mVar.A();
                                                                                                                                                        return;
                                                                                                                                                    default:
                                                                                                                                                        int i18 = AccountProActivity.H;
                                                                                                                                                        w wVarE2 = accountProActivity.E();
                                                                                                                                                        wVarE2.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        if (oVar.f401a.r() != 1) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        oVar.e(accountProActivity, new p6.i(wVarE2));
                                                                                                                                                        return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        final int i14 = 4;
                                                                                                                                        aVar4.f32304c.setOnClickListener(new View.OnClickListener(this) { // from class: bh.e

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2194b;

                                                                                                                                            {
                                                                                                                                                this.f2194b = this;
                                                                                                                                            }

                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i122 = i14;
                                                                                                                                                AccountProActivity accountProActivity = this.f2194b;
                                                                                                                                                switch (i122) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i132 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.n(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 1:
                                                                                                                                                        int i142 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.o(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 2:
                                                                                                                                                        int i15 = AccountProActivity.H;
                                                                                                                                                        if (!c.c()) {
                                                                                                                                                            f.h hVar = accountProActivity.B;
                                                                                                                                                            if (hVar != null) {
                                                                                                                                                                hVar.a(Boolean.TRUE);
                                                                                                                                                                return;
                                                                                                                                                            } else {
                                                                                                                                                                nk.k.k("loginLauncher");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (ah.o.f400d.c()) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        String strA = c.a();
                                                                                                                                                        nk.k.b(strA);
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        if (System.currentTimeMillis() - wVarE.f2253m < 5000) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        xk.x.v(y0.g(wVarE), null, null, new al.p(strA, wVarE, null, 5), 3);
                                                                                                                                                        return;
                                                                                                                                                    case 3:
                                                                                                                                                        f.h hVar2 = accountProActivity.B;
                                                                                                                                                        if (hVar2 != null) {
                                                                                                                                                            hVar2.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 4:
                                                                                                                                                        int i16 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.F();
                                                                                                                                                        return;
                                                                                                                                                    case 5:
                                                                                                                                                        f.h hVar3 = accountProActivity.B;
                                                                                                                                                        if (hVar3 != null) {
                                                                                                                                                            hVar3.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 6:
                                                                                                                                                        f.h hVar4 = accountProActivity.C;
                                                                                                                                                        if (hVar4 != null) {
                                                                                                                                                            hVar4.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("registerLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 7:
                                                                                                                                                        int i17 = AccountProActivity.H;
                                                                                                                                                        t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                        mVar.y(R.string.feature_multi_platform);
                                                                                                                                                        mVar.v(R.string.feature_multi_platform_summary);
                                                                                                                                                        mVar.x(R.string.confirm, null);
                                                                                                                                                        mVar.A();
                                                                                                                                                        return;
                                                                                                                                                    default:
                                                                                                                                                        int i18 = AccountProActivity.H;
                                                                                                                                                        w wVarE2 = accountProActivity.E();
                                                                                                                                                        wVarE2.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        if (oVar.f401a.r() != 1) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        oVar.e(accountProActivity, new p6.i(wVarE2));
                                                                                                                                                        return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        final int i15 = 5;
                                                                                                                                        aVar4.f32307f.setOnClickListener(new View.OnClickListener(this) { // from class: bh.e

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2194b;

                                                                                                                                            {
                                                                                                                                                this.f2194b = this;
                                                                                                                                            }

                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i122 = i15;
                                                                                                                                                AccountProActivity accountProActivity = this.f2194b;
                                                                                                                                                switch (i122) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i132 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.n(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 1:
                                                                                                                                                        int i142 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.o(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 2:
                                                                                                                                                        int i152 = AccountProActivity.H;
                                                                                                                                                        if (!c.c()) {
                                                                                                                                                            f.h hVar = accountProActivity.B;
                                                                                                                                                            if (hVar != null) {
                                                                                                                                                                hVar.a(Boolean.TRUE);
                                                                                                                                                                return;
                                                                                                                                                            } else {
                                                                                                                                                                nk.k.k("loginLauncher");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (ah.o.f400d.c()) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        String strA = c.a();
                                                                                                                                                        nk.k.b(strA);
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        if (System.currentTimeMillis() - wVarE.f2253m < 5000) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        xk.x.v(y0.g(wVarE), null, null, new al.p(strA, wVarE, null, 5), 3);
                                                                                                                                                        return;
                                                                                                                                                    case 3:
                                                                                                                                                        f.h hVar2 = accountProActivity.B;
                                                                                                                                                        if (hVar2 != null) {
                                                                                                                                                            hVar2.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 4:
                                                                                                                                                        int i16 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.F();
                                                                                                                                                        return;
                                                                                                                                                    case 5:
                                                                                                                                                        f.h hVar3 = accountProActivity.B;
                                                                                                                                                        if (hVar3 != null) {
                                                                                                                                                            hVar3.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 6:
                                                                                                                                                        f.h hVar4 = accountProActivity.C;
                                                                                                                                                        if (hVar4 != null) {
                                                                                                                                                            hVar4.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("registerLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 7:
                                                                                                                                                        int i17 = AccountProActivity.H;
                                                                                                                                                        t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                        mVar.y(R.string.feature_multi_platform);
                                                                                                                                                        mVar.v(R.string.feature_multi_platform_summary);
                                                                                                                                                        mVar.x(R.string.confirm, null);
                                                                                                                                                        mVar.A();
                                                                                                                                                        return;
                                                                                                                                                    default:
                                                                                                                                                        int i18 = AccountProActivity.H;
                                                                                                                                                        w wVarE2 = accountProActivity.E();
                                                                                                                                                        wVarE2.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        if (oVar.f401a.r() != 1) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        oVar.e(accountProActivity, new p6.i(wVarE2));
                                                                                                                                                        return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        final int i16 = 6;
                                                                                                                                        aVar4.g.setOnClickListener(new View.OnClickListener(this) { // from class: bh.e

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2194b;

                                                                                                                                            {
                                                                                                                                                this.f2194b = this;
                                                                                                                                            }

                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i122 = i16;
                                                                                                                                                AccountProActivity accountProActivity = this.f2194b;
                                                                                                                                                switch (i122) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i132 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.n(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 1:
                                                                                                                                                        int i142 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.o(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 2:
                                                                                                                                                        int i152 = AccountProActivity.H;
                                                                                                                                                        if (!c.c()) {
                                                                                                                                                            f.h hVar = accountProActivity.B;
                                                                                                                                                            if (hVar != null) {
                                                                                                                                                                hVar.a(Boolean.TRUE);
                                                                                                                                                                return;
                                                                                                                                                            } else {
                                                                                                                                                                nk.k.k("loginLauncher");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (ah.o.f400d.c()) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        String strA = c.a();
                                                                                                                                                        nk.k.b(strA);
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        if (System.currentTimeMillis() - wVarE.f2253m < 5000) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        xk.x.v(y0.g(wVarE), null, null, new al.p(strA, wVarE, null, 5), 3);
                                                                                                                                                        return;
                                                                                                                                                    case 3:
                                                                                                                                                        f.h hVar2 = accountProActivity.B;
                                                                                                                                                        if (hVar2 != null) {
                                                                                                                                                            hVar2.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 4:
                                                                                                                                                        int i162 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.F();
                                                                                                                                                        return;
                                                                                                                                                    case 5:
                                                                                                                                                        f.h hVar3 = accountProActivity.B;
                                                                                                                                                        if (hVar3 != null) {
                                                                                                                                                            hVar3.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 6:
                                                                                                                                                        f.h hVar4 = accountProActivity.C;
                                                                                                                                                        if (hVar4 != null) {
                                                                                                                                                            hVar4.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("registerLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 7:
                                                                                                                                                        int i17 = AccountProActivity.H;
                                                                                                                                                        t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                        mVar.y(R.string.feature_multi_platform);
                                                                                                                                                        mVar.v(R.string.feature_multi_platform_summary);
                                                                                                                                                        mVar.x(R.string.confirm, null);
                                                                                                                                                        mVar.A();
                                                                                                                                                        return;
                                                                                                                                                    default:
                                                                                                                                                        int i18 = AccountProActivity.H;
                                                                                                                                                        w wVarE2 = accountProActivity.E();
                                                                                                                                                        wVarE2.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        if (oVar.f401a.r() != 1) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        oVar.e(accountProActivity, new p6.i(wVarE2));
                                                                                                                                                        return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        final int i17 = 8;
                                                                                                                                        aVar4.f32308h.setOnClickListener(new View.OnClickListener(this) { // from class: bh.e

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2194b;

                                                                                                                                            {
                                                                                                                                                this.f2194b = this;
                                                                                                                                            }

                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i122 = i17;
                                                                                                                                                AccountProActivity accountProActivity = this.f2194b;
                                                                                                                                                switch (i122) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i132 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.n(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 1:
                                                                                                                                                        int i142 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.o(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 2:
                                                                                                                                                        int i152 = AccountProActivity.H;
                                                                                                                                                        if (!c.c()) {
                                                                                                                                                            f.h hVar = accountProActivity.B;
                                                                                                                                                            if (hVar != null) {
                                                                                                                                                                hVar.a(Boolean.TRUE);
                                                                                                                                                                return;
                                                                                                                                                            } else {
                                                                                                                                                                nk.k.k("loginLauncher");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (ah.o.f400d.c()) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        String strA = c.a();
                                                                                                                                                        nk.k.b(strA);
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        if (System.currentTimeMillis() - wVarE.f2253m < 5000) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        xk.x.v(y0.g(wVarE), null, null, new al.p(strA, wVarE, null, 5), 3);
                                                                                                                                                        return;
                                                                                                                                                    case 3:
                                                                                                                                                        f.h hVar2 = accountProActivity.B;
                                                                                                                                                        if (hVar2 != null) {
                                                                                                                                                            hVar2.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 4:
                                                                                                                                                        int i162 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.F();
                                                                                                                                                        return;
                                                                                                                                                    case 5:
                                                                                                                                                        f.h hVar3 = accountProActivity.B;
                                                                                                                                                        if (hVar3 != null) {
                                                                                                                                                            hVar3.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 6:
                                                                                                                                                        f.h hVar4 = accountProActivity.C;
                                                                                                                                                        if (hVar4 != null) {
                                                                                                                                                            hVar4.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("registerLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 7:
                                                                                                                                                        int i172 = AccountProActivity.H;
                                                                                                                                                        t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                        mVar.y(R.string.feature_multi_platform);
                                                                                                                                                        mVar.v(R.string.feature_multi_platform_summary);
                                                                                                                                                        mVar.x(R.string.confirm, null);
                                                                                                                                                        mVar.A();
                                                                                                                                                        return;
                                                                                                                                                    default:
                                                                                                                                                        int i18 = AccountProActivity.H;
                                                                                                                                                        w wVarE2 = accountProActivity.E();
                                                                                                                                                        wVarE2.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        if (oVar.f401a.r() != 1) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        oVar.e(accountProActivity, new p6.i(wVarE2));
                                                                                                                                                        return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        final int i18 = 7;
                                                                                                                                        aVar4.f32309i.setOnClickListener(new View.OnClickListener(this) { // from class: bh.e

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2194b;

                                                                                                                                            {
                                                                                                                                                this.f2194b = this;
                                                                                                                                            }

                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i122 = i18;
                                                                                                                                                AccountProActivity accountProActivity = this.f2194b;
                                                                                                                                                switch (i122) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i132 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.n(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 1:
                                                                                                                                                        int i142 = AccountProActivity.H;
                                                                                                                                                        com.liuzh.deviceinfo.utilities.d.o(accountProActivity);
                                                                                                                                                        return;
                                                                                                                                                    case 2:
                                                                                                                                                        int i152 = AccountProActivity.H;
                                                                                                                                                        if (!c.c()) {
                                                                                                                                                            f.h hVar = accountProActivity.B;
                                                                                                                                                            if (hVar != null) {
                                                                                                                                                                hVar.a(Boolean.TRUE);
                                                                                                                                                                return;
                                                                                                                                                            } else {
                                                                                                                                                                nk.k.k("loginLauncher");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (ah.o.f400d.c()) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        String strA = c.a();
                                                                                                                                                        nk.k.b(strA);
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        if (System.currentTimeMillis() - wVarE.f2253m < 5000) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        xk.x.v(y0.g(wVarE), null, null, new al.p(strA, wVarE, null, 5), 3);
                                                                                                                                                        return;
                                                                                                                                                    case 3:
                                                                                                                                                        f.h hVar2 = accountProActivity.B;
                                                                                                                                                        if (hVar2 != null) {
                                                                                                                                                            hVar2.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 4:
                                                                                                                                                        int i162 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.F();
                                                                                                                                                        return;
                                                                                                                                                    case 5:
                                                                                                                                                        f.h hVar3 = accountProActivity.B;
                                                                                                                                                        if (hVar3 != null) {
                                                                                                                                                            hVar3.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("loginLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 6:
                                                                                                                                                        f.h hVar4 = accountProActivity.C;
                                                                                                                                                        if (hVar4 != null) {
                                                                                                                                                            hVar4.a(Boolean.TRUE);
                                                                                                                                                            return;
                                                                                                                                                        } else {
                                                                                                                                                            nk.k.k("registerLauncher");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    case 7:
                                                                                                                                                        int i172 = AccountProActivity.H;
                                                                                                                                                        t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                        mVar.y(R.string.feature_multi_platform);
                                                                                                                                                        mVar.v(R.string.feature_multi_platform_summary);
                                                                                                                                                        mVar.x(R.string.confirm, null);
                                                                                                                                                        mVar.A();
                                                                                                                                                        return;
                                                                                                                                                    default:
                                                                                                                                                        int i182 = AccountProActivity.H;
                                                                                                                                                        w wVarE2 = accountProActivity.E();
                                                                                                                                                        wVarE2.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        if (oVar.f401a.r() != 1) {
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        oVar.e(accountProActivity, new p6.i(wVarE2));
                                                                                                                                                        return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        textView15.setVisibility(8);
                                                                                                                                        textView15.setSelected(false);
                                                                                                                                        textView14.setVisibility(0);
                                                                                                                                        textView14.setSelected(true);
                                                                                                                                        textView13.setVisibility(0);
                                                                                                                                        textView13.setSelected(false);
                                                                                                                                        textView14.setOnClickListener(new View.OnClickListener() { // from class: bh.g
                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i19 = i4;
                                                                                                                                                AccountProActivity accountProActivity = this;
                                                                                                                                                qg.a aVar5 = aVar4;
                                                                                                                                                switch (i19) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i20 = AccountProActivity.H;
                                                                                                                                                        aVar5.f32314o.setSelected(true);
                                                                                                                                                        aVar5.f32313n.setSelected(false);
                                                                                                                                                        aVar5.f32311l.setSelected(false);
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        break;
                                                                                                                                                    case 1:
                                                                                                                                                        int i21 = AccountProActivity.H;
                                                                                                                                                        aVar5.f32313n.setSelected(true);
                                                                                                                                                        aVar5.f32314o.setSelected(false);
                                                                                                                                                        aVar5.f32311l.setSelected(false);
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        int i22 = AccountProActivity.H;
                                                                                                                                                        aVar5.f32311l.setSelected(true);
                                                                                                                                                        aVar5.f32313n.setSelected(false);
                                                                                                                                                        aVar5.f32314o.setSelected(false);
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        textView15.setOnClickListener(new View.OnClickListener() { // from class: bh.g
                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i19 = i12;
                                                                                                                                                AccountProActivity accountProActivity = this;
                                                                                                                                                qg.a aVar5 = aVar4;
                                                                                                                                                switch (i19) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i20 = AccountProActivity.H;
                                                                                                                                                        aVar5.f32314o.setSelected(true);
                                                                                                                                                        aVar5.f32313n.setSelected(false);
                                                                                                                                                        aVar5.f32311l.setSelected(false);
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        break;
                                                                                                                                                    case 1:
                                                                                                                                                        int i21 = AccountProActivity.H;
                                                                                                                                                        aVar5.f32313n.setSelected(true);
                                                                                                                                                        aVar5.f32314o.setSelected(false);
                                                                                                                                                        aVar5.f32311l.setSelected(false);
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        int i22 = AccountProActivity.H;
                                                                                                                                                        aVar5.f32311l.setSelected(true);
                                                                                                                                                        aVar5.f32313n.setSelected(false);
                                                                                                                                                        aVar5.f32314o.setSelected(false);
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        textView13.setOnClickListener(new View.OnClickListener() { // from class: bh.g
                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i19 = i13;
                                                                                                                                                AccountProActivity accountProActivity = this;
                                                                                                                                                qg.a aVar5 = aVar4;
                                                                                                                                                switch (i19) {
                                                                                                                                                    case 0:
                                                                                                                                                        int i20 = AccountProActivity.H;
                                                                                                                                                        aVar5.f32314o.setSelected(true);
                                                                                                                                                        aVar5.f32313n.setSelected(false);
                                                                                                                                                        aVar5.f32311l.setSelected(false);
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        break;
                                                                                                                                                    case 1:
                                                                                                                                                        int i21 = AccountProActivity.H;
                                                                                                                                                        aVar5.f32313n.setSelected(true);
                                                                                                                                                        aVar5.f32314o.setSelected(false);
                                                                                                                                                        aVar5.f32311l.setSelected(false);
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        int i22 = AccountProActivity.H;
                                                                                                                                                        aVar5.f32311l.setSelected(true);
                                                                                                                                                        aVar5.f32313n.setSelected(false);
                                                                                                                                                        aVar5.f32314o.setSelected(false);
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        D();
                                                                                                                                        E().f2247e.e(this, new bh.i(new mk.c(this) { // from class: bh.h

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2201b;

                                                                                                                                            {
                                                                                                                                                this.f2201b = this;
                                                                                                                                            }

                                                                                                                                            @Override // mk.c
                                                                                                                                            public final Object invoke(Object obj) {
                                                                                                                                                int i19 = i4;
                                                                                                                                                yj.u uVar = yj.u.f37649a;
                                                                                                                                                AccountProActivity accountProActivity = this.f2201b;
                                                                                                                                                switch (i19) {
                                                                                                                                                    case 0:
                                                                                                                                                        String str = (String) obj;
                                                                                                                                                        int i20 = AccountProActivity.H;
                                                                                                                                                        nk.k.b(str);
                                                                                                                                                        hg.a.C(accountProActivity, str);
                                                                                                                                                        return uVar;
                                                                                                                                                    case 1:
                                                                                                                                                        ng.a aVar5 = (ng.a) obj;
                                                                                                                                                        int i21 = AccountProActivity.H;
                                                                                                                                                        if (aVar5.f29942a) {
                                                                                                                                                            rg.c.f32943p0.B(accountProActivity, aVar5.f29943b);
                                                                                                                                                        } else {
                                                                                                                                                            u0 u0VarS = accountProActivity.s();
                                                                                                                                                            nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                                                                                                                                                            z zVarD = u0VarS.D("CommonLoadingDialog");
                                                                                                                                                            if (zVarD != null) {
                                                                                                                                                                b5.a aVar6 = new b5.a(u0VarS);
                                                                                                                                                                aVar6.j(zVarD);
                                                                                                                                                                aVar6.g();
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return uVar;
                                                                                                                                                    case 2:
                                                                                                                                                        fh.a aVar7 = (fh.a) obj;
                                                                                                                                                        int i22 = AccountProActivity.H;
                                                                                                                                                        String str2 = aVar7.f24037a;
                                                                                                                                                        boolean z3 = aVar7.f24040d;
                                                                                                                                                        if (str2 == null || vk.i.H0(str2)) {
                                                                                                                                                            qg.a aVar8 = accountProActivity.D;
                                                                                                                                                            if (aVar8 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar8.f32321v.setVisibility(8);
                                                                                                                                                            qg.a aVar9 = accountProActivity.D;
                                                                                                                                                            if (aVar9 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar9.j.setVisibility(8);
                                                                                                                                                        } else {
                                                                                                                                                            qg.a aVar10 = accountProActivity.D;
                                                                                                                                                            if (aVar10 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            TextView textView16 = aVar10.f32321v;
                                                                                                                                                            textView16.setVisibility(0);
                                                                                                                                                            textView16.setText(aVar7.f24037a);
                                                                                                                                                            qg.a aVar11 = accountProActivity.D;
                                                                                                                                                            if (aVar11 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar11.j.setVisibility(0);
                                                                                                                                                            qg.a aVar12 = accountProActivity.D;
                                                                                                                                                            if (aVar12 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar12.f32306e.setVisibility(z3 ? 0 : 8);
                                                                                                                                                            qg.a aVar13 = accountProActivity.D;
                                                                                                                                                            if (aVar13 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar13.f32307f.setVisibility(aVar7.f24038b ? 0 : 8);
                                                                                                                                                            qg.a aVar14 = accountProActivity.D;
                                                                                                                                                            if (aVar14 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar14.g.setVisibility(aVar7.f24039c ? 0 : 8);
                                                                                                                                                            qg.a aVar15 = accountProActivity.D;
                                                                                                                                                            if (aVar15 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar15.f32308h.setVisibility(8);
                                                                                                                                                            if (z3) {
                                                                                                                                                                qg.a aVar16 = accountProActivity.D;
                                                                                                                                                                if (aVar16 == null) {
                                                                                                                                                                    nk.k.k("binding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                aVar16.f32306e.setOnClickListener(new ah.g(1, accountProActivity, aVar7));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return uVar;
                                                                                                                                                    case 3:
                                                                                                                                                        int i23 = AccountProActivity.H;
                                                                                                                                                        if (((Boolean) obj).booleanValue()) {
                                                                                                                                                            t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                            mVar.y(R.string.bind_failed);
                                                                                                                                                            mVar.v(R.string.pro_account_no_needed_bind_hw_order);
                                                                                                                                                            mVar.x(R.string.confirm, null);
                                                                                                                                                            ((i.b) mVar.f34474c).f25240m = false;
                                                                                                                                                            mVar.A();
                                                                                                                                                        } else {
                                                                                                                                                            t7.m mVar2 = new t7.m(accountProActivity);
                                                                                                                                                            mVar2.y(R.string.bind_successful);
                                                                                                                                                            mVar2.v(R.string.bind_hw_order_successful_msg);
                                                                                                                                                            mVar2.x(R.string.confirm, null);
                                                                                                                                                            ((i.b) mVar2.f34474c).f25240m = false;
                                                                                                                                                            mVar2.A();
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        DeviceInfoApp deviceInfoApp = fi.a.f24058a;
                                                                                                                                                        oVar.t(deviceInfoApp, 1, new o7.d(6, wVarE));
                                                                                                                                                        oVar.t(deviceInfoApp, 0, new v(false));
                                                                                                                                                        return uVar;
                                                                                                                                                    default:
                                                                                                                                                        int i24 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        return uVar;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }, i4));
                                                                                                                                        E().f2245c.e(this, new bh.i(new mk.c(this) { // from class: bh.h

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2201b;

                                                                                                                                            {
                                                                                                                                                this.f2201b = this;
                                                                                                                                            }

                                                                                                                                            @Override // mk.c
                                                                                                                                            public final Object invoke(Object obj) {
                                                                                                                                                int i19 = i12;
                                                                                                                                                yj.u uVar = yj.u.f37649a;
                                                                                                                                                AccountProActivity accountProActivity = this.f2201b;
                                                                                                                                                switch (i19) {
                                                                                                                                                    case 0:
                                                                                                                                                        String str = (String) obj;
                                                                                                                                                        int i20 = AccountProActivity.H;
                                                                                                                                                        nk.k.b(str);
                                                                                                                                                        hg.a.C(accountProActivity, str);
                                                                                                                                                        return uVar;
                                                                                                                                                    case 1:
                                                                                                                                                        ng.a aVar5 = (ng.a) obj;
                                                                                                                                                        int i21 = AccountProActivity.H;
                                                                                                                                                        if (aVar5.f29942a) {
                                                                                                                                                            rg.c.f32943p0.B(accountProActivity, aVar5.f29943b);
                                                                                                                                                        } else {
                                                                                                                                                            u0 u0VarS = accountProActivity.s();
                                                                                                                                                            nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                                                                                                                                                            z zVarD = u0VarS.D("CommonLoadingDialog");
                                                                                                                                                            if (zVarD != null) {
                                                                                                                                                                b5.a aVar6 = new b5.a(u0VarS);
                                                                                                                                                                aVar6.j(zVarD);
                                                                                                                                                                aVar6.g();
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return uVar;
                                                                                                                                                    case 2:
                                                                                                                                                        fh.a aVar7 = (fh.a) obj;
                                                                                                                                                        int i22 = AccountProActivity.H;
                                                                                                                                                        String str2 = aVar7.f24037a;
                                                                                                                                                        boolean z3 = aVar7.f24040d;
                                                                                                                                                        if (str2 == null || vk.i.H0(str2)) {
                                                                                                                                                            qg.a aVar8 = accountProActivity.D;
                                                                                                                                                            if (aVar8 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar8.f32321v.setVisibility(8);
                                                                                                                                                            qg.a aVar9 = accountProActivity.D;
                                                                                                                                                            if (aVar9 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar9.j.setVisibility(8);
                                                                                                                                                        } else {
                                                                                                                                                            qg.a aVar10 = accountProActivity.D;
                                                                                                                                                            if (aVar10 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            TextView textView16 = aVar10.f32321v;
                                                                                                                                                            textView16.setVisibility(0);
                                                                                                                                                            textView16.setText(aVar7.f24037a);
                                                                                                                                                            qg.a aVar11 = accountProActivity.D;
                                                                                                                                                            if (aVar11 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar11.j.setVisibility(0);
                                                                                                                                                            qg.a aVar12 = accountProActivity.D;
                                                                                                                                                            if (aVar12 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar12.f32306e.setVisibility(z3 ? 0 : 8);
                                                                                                                                                            qg.a aVar13 = accountProActivity.D;
                                                                                                                                                            if (aVar13 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar13.f32307f.setVisibility(aVar7.f24038b ? 0 : 8);
                                                                                                                                                            qg.a aVar14 = accountProActivity.D;
                                                                                                                                                            if (aVar14 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar14.g.setVisibility(aVar7.f24039c ? 0 : 8);
                                                                                                                                                            qg.a aVar15 = accountProActivity.D;
                                                                                                                                                            if (aVar15 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar15.f32308h.setVisibility(8);
                                                                                                                                                            if (z3) {
                                                                                                                                                                qg.a aVar16 = accountProActivity.D;
                                                                                                                                                                if (aVar16 == null) {
                                                                                                                                                                    nk.k.k("binding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                aVar16.f32306e.setOnClickListener(new ah.g(1, accountProActivity, aVar7));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return uVar;
                                                                                                                                                    case 3:
                                                                                                                                                        int i23 = AccountProActivity.H;
                                                                                                                                                        if (((Boolean) obj).booleanValue()) {
                                                                                                                                                            t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                            mVar.y(R.string.bind_failed);
                                                                                                                                                            mVar.v(R.string.pro_account_no_needed_bind_hw_order);
                                                                                                                                                            mVar.x(R.string.confirm, null);
                                                                                                                                                            ((i.b) mVar.f34474c).f25240m = false;
                                                                                                                                                            mVar.A();
                                                                                                                                                        } else {
                                                                                                                                                            t7.m mVar2 = new t7.m(accountProActivity);
                                                                                                                                                            mVar2.y(R.string.bind_successful);
                                                                                                                                                            mVar2.v(R.string.bind_hw_order_successful_msg);
                                                                                                                                                            mVar2.x(R.string.confirm, null);
                                                                                                                                                            ((i.b) mVar2.f34474c).f25240m = false;
                                                                                                                                                            mVar2.A();
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        DeviceInfoApp deviceInfoApp = fi.a.f24058a;
                                                                                                                                                        oVar.t(deviceInfoApp, 1, new o7.d(6, wVarE));
                                                                                                                                                        oVar.t(deviceInfoApp, 0, new v(false));
                                                                                                                                                        return uVar;
                                                                                                                                                    default:
                                                                                                                                                        int i24 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        return uVar;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }, i4));
                                                                                                                                        E().g.e(this, new bh.i(new mk.c(this) { // from class: bh.h

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2201b;

                                                                                                                                            {
                                                                                                                                                this.f2201b = this;
                                                                                                                                            }

                                                                                                                                            @Override // mk.c
                                                                                                                                            public final Object invoke(Object obj) {
                                                                                                                                                int i19 = i13;
                                                                                                                                                yj.u uVar = yj.u.f37649a;
                                                                                                                                                AccountProActivity accountProActivity = this.f2201b;
                                                                                                                                                switch (i19) {
                                                                                                                                                    case 0:
                                                                                                                                                        String str = (String) obj;
                                                                                                                                                        int i20 = AccountProActivity.H;
                                                                                                                                                        nk.k.b(str);
                                                                                                                                                        hg.a.C(accountProActivity, str);
                                                                                                                                                        return uVar;
                                                                                                                                                    case 1:
                                                                                                                                                        ng.a aVar5 = (ng.a) obj;
                                                                                                                                                        int i21 = AccountProActivity.H;
                                                                                                                                                        if (aVar5.f29942a) {
                                                                                                                                                            rg.c.f32943p0.B(accountProActivity, aVar5.f29943b);
                                                                                                                                                        } else {
                                                                                                                                                            u0 u0VarS = accountProActivity.s();
                                                                                                                                                            nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                                                                                                                                                            z zVarD = u0VarS.D("CommonLoadingDialog");
                                                                                                                                                            if (zVarD != null) {
                                                                                                                                                                b5.a aVar6 = new b5.a(u0VarS);
                                                                                                                                                                aVar6.j(zVarD);
                                                                                                                                                                aVar6.g();
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return uVar;
                                                                                                                                                    case 2:
                                                                                                                                                        fh.a aVar7 = (fh.a) obj;
                                                                                                                                                        int i22 = AccountProActivity.H;
                                                                                                                                                        String str2 = aVar7.f24037a;
                                                                                                                                                        boolean z3 = aVar7.f24040d;
                                                                                                                                                        if (str2 == null || vk.i.H0(str2)) {
                                                                                                                                                            qg.a aVar8 = accountProActivity.D;
                                                                                                                                                            if (aVar8 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar8.f32321v.setVisibility(8);
                                                                                                                                                            qg.a aVar9 = accountProActivity.D;
                                                                                                                                                            if (aVar9 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar9.j.setVisibility(8);
                                                                                                                                                        } else {
                                                                                                                                                            qg.a aVar10 = accountProActivity.D;
                                                                                                                                                            if (aVar10 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            TextView textView16 = aVar10.f32321v;
                                                                                                                                                            textView16.setVisibility(0);
                                                                                                                                                            textView16.setText(aVar7.f24037a);
                                                                                                                                                            qg.a aVar11 = accountProActivity.D;
                                                                                                                                                            if (aVar11 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar11.j.setVisibility(0);
                                                                                                                                                            qg.a aVar12 = accountProActivity.D;
                                                                                                                                                            if (aVar12 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar12.f32306e.setVisibility(z3 ? 0 : 8);
                                                                                                                                                            qg.a aVar13 = accountProActivity.D;
                                                                                                                                                            if (aVar13 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar13.f32307f.setVisibility(aVar7.f24038b ? 0 : 8);
                                                                                                                                                            qg.a aVar14 = accountProActivity.D;
                                                                                                                                                            if (aVar14 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar14.g.setVisibility(aVar7.f24039c ? 0 : 8);
                                                                                                                                                            qg.a aVar15 = accountProActivity.D;
                                                                                                                                                            if (aVar15 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar15.f32308h.setVisibility(8);
                                                                                                                                                            if (z3) {
                                                                                                                                                                qg.a aVar16 = accountProActivity.D;
                                                                                                                                                                if (aVar16 == null) {
                                                                                                                                                                    nk.k.k("binding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                aVar16.f32306e.setOnClickListener(new ah.g(1, accountProActivity, aVar7));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return uVar;
                                                                                                                                                    case 3:
                                                                                                                                                        int i23 = AccountProActivity.H;
                                                                                                                                                        if (((Boolean) obj).booleanValue()) {
                                                                                                                                                            t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                            mVar.y(R.string.bind_failed);
                                                                                                                                                            mVar.v(R.string.pro_account_no_needed_bind_hw_order);
                                                                                                                                                            mVar.x(R.string.confirm, null);
                                                                                                                                                            ((i.b) mVar.f34474c).f25240m = false;
                                                                                                                                                            mVar.A();
                                                                                                                                                        } else {
                                                                                                                                                            t7.m mVar2 = new t7.m(accountProActivity);
                                                                                                                                                            mVar2.y(R.string.bind_successful);
                                                                                                                                                            mVar2.v(R.string.bind_hw_order_successful_msg);
                                                                                                                                                            mVar2.x(R.string.confirm, null);
                                                                                                                                                            ((i.b) mVar2.f34474c).f25240m = false;
                                                                                                                                                            mVar2.A();
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        DeviceInfoApp deviceInfoApp = fi.a.f24058a;
                                                                                                                                                        oVar.t(deviceInfoApp, 1, new o7.d(6, wVarE));
                                                                                                                                                        oVar.t(deviceInfoApp, 0, new v(false));
                                                                                                                                                        return uVar;
                                                                                                                                                    default:
                                                                                                                                                        int i24 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        return uVar;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }, i4));
                                                                                                                                        E().f2250i.e(this, new bh.i(new mk.c(this) { // from class: bh.h

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2201b;

                                                                                                                                            {
                                                                                                                                                this.f2201b = this;
                                                                                                                                            }

                                                                                                                                            @Override // mk.c
                                                                                                                                            public final Object invoke(Object obj) {
                                                                                                                                                int i19 = i11;
                                                                                                                                                yj.u uVar = yj.u.f37649a;
                                                                                                                                                AccountProActivity accountProActivity = this.f2201b;
                                                                                                                                                switch (i19) {
                                                                                                                                                    case 0:
                                                                                                                                                        String str = (String) obj;
                                                                                                                                                        int i20 = AccountProActivity.H;
                                                                                                                                                        nk.k.b(str);
                                                                                                                                                        hg.a.C(accountProActivity, str);
                                                                                                                                                        return uVar;
                                                                                                                                                    case 1:
                                                                                                                                                        ng.a aVar5 = (ng.a) obj;
                                                                                                                                                        int i21 = AccountProActivity.H;
                                                                                                                                                        if (aVar5.f29942a) {
                                                                                                                                                            rg.c.f32943p0.B(accountProActivity, aVar5.f29943b);
                                                                                                                                                        } else {
                                                                                                                                                            u0 u0VarS = accountProActivity.s();
                                                                                                                                                            nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                                                                                                                                                            z zVarD = u0VarS.D("CommonLoadingDialog");
                                                                                                                                                            if (zVarD != null) {
                                                                                                                                                                b5.a aVar6 = new b5.a(u0VarS);
                                                                                                                                                                aVar6.j(zVarD);
                                                                                                                                                                aVar6.g();
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return uVar;
                                                                                                                                                    case 2:
                                                                                                                                                        fh.a aVar7 = (fh.a) obj;
                                                                                                                                                        int i22 = AccountProActivity.H;
                                                                                                                                                        String str2 = aVar7.f24037a;
                                                                                                                                                        boolean z3 = aVar7.f24040d;
                                                                                                                                                        if (str2 == null || vk.i.H0(str2)) {
                                                                                                                                                            qg.a aVar8 = accountProActivity.D;
                                                                                                                                                            if (aVar8 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar8.f32321v.setVisibility(8);
                                                                                                                                                            qg.a aVar9 = accountProActivity.D;
                                                                                                                                                            if (aVar9 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar9.j.setVisibility(8);
                                                                                                                                                        } else {
                                                                                                                                                            qg.a aVar10 = accountProActivity.D;
                                                                                                                                                            if (aVar10 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            TextView textView16 = aVar10.f32321v;
                                                                                                                                                            textView16.setVisibility(0);
                                                                                                                                                            textView16.setText(aVar7.f24037a);
                                                                                                                                                            qg.a aVar11 = accountProActivity.D;
                                                                                                                                                            if (aVar11 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar11.j.setVisibility(0);
                                                                                                                                                            qg.a aVar12 = accountProActivity.D;
                                                                                                                                                            if (aVar12 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar12.f32306e.setVisibility(z3 ? 0 : 8);
                                                                                                                                                            qg.a aVar13 = accountProActivity.D;
                                                                                                                                                            if (aVar13 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar13.f32307f.setVisibility(aVar7.f24038b ? 0 : 8);
                                                                                                                                                            qg.a aVar14 = accountProActivity.D;
                                                                                                                                                            if (aVar14 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar14.g.setVisibility(aVar7.f24039c ? 0 : 8);
                                                                                                                                                            qg.a aVar15 = accountProActivity.D;
                                                                                                                                                            if (aVar15 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar15.f32308h.setVisibility(8);
                                                                                                                                                            if (z3) {
                                                                                                                                                                qg.a aVar16 = accountProActivity.D;
                                                                                                                                                                if (aVar16 == null) {
                                                                                                                                                                    nk.k.k("binding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                aVar16.f32306e.setOnClickListener(new ah.g(1, accountProActivity, aVar7));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return uVar;
                                                                                                                                                    case 3:
                                                                                                                                                        int i23 = AccountProActivity.H;
                                                                                                                                                        if (((Boolean) obj).booleanValue()) {
                                                                                                                                                            t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                            mVar.y(R.string.bind_failed);
                                                                                                                                                            mVar.v(R.string.pro_account_no_needed_bind_hw_order);
                                                                                                                                                            mVar.x(R.string.confirm, null);
                                                                                                                                                            ((i.b) mVar.f34474c).f25240m = false;
                                                                                                                                                            mVar.A();
                                                                                                                                                        } else {
                                                                                                                                                            t7.m mVar2 = new t7.m(accountProActivity);
                                                                                                                                                            mVar2.y(R.string.bind_successful);
                                                                                                                                                            mVar2.v(R.string.bind_hw_order_successful_msg);
                                                                                                                                                            mVar2.x(R.string.confirm, null);
                                                                                                                                                            ((i.b) mVar2.f34474c).f25240m = false;
                                                                                                                                                            mVar2.A();
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        DeviceInfoApp deviceInfoApp = fi.a.f24058a;
                                                                                                                                                        oVar.t(deviceInfoApp, 1, new o7.d(6, wVarE));
                                                                                                                                                        oVar.t(deviceInfoApp, 0, new v(false));
                                                                                                                                                        return uVar;
                                                                                                                                                    default:
                                                                                                                                                        int i24 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        return uVar;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }, i4));
                                                                                                                                        E().f2251k.e(this, new bh.i(new mk.c(this) { // from class: bh.h

                                                                                                                                            /* renamed from: b, reason: collision with root package name */
                                                                                                                                            public final /* synthetic */ AccountProActivity f2201b;

                                                                                                                                            {
                                                                                                                                                this.f2201b = this;
                                                                                                                                            }

                                                                                                                                            @Override // mk.c
                                                                                                                                            public final Object invoke(Object obj) {
                                                                                                                                                int i19 = i14;
                                                                                                                                                yj.u uVar = yj.u.f37649a;
                                                                                                                                                AccountProActivity accountProActivity = this.f2201b;
                                                                                                                                                switch (i19) {
                                                                                                                                                    case 0:
                                                                                                                                                        String str = (String) obj;
                                                                                                                                                        int i20 = AccountProActivity.H;
                                                                                                                                                        nk.k.b(str);
                                                                                                                                                        hg.a.C(accountProActivity, str);
                                                                                                                                                        return uVar;
                                                                                                                                                    case 1:
                                                                                                                                                        ng.a aVar5 = (ng.a) obj;
                                                                                                                                                        int i21 = AccountProActivity.H;
                                                                                                                                                        if (aVar5.f29942a) {
                                                                                                                                                            rg.c.f32943p0.B(accountProActivity, aVar5.f29943b);
                                                                                                                                                        } else {
                                                                                                                                                            u0 u0VarS = accountProActivity.s();
                                                                                                                                                            nk.k.d(u0VarS, "getSupportFragmentManager(...)");
                                                                                                                                                            z zVarD = u0VarS.D("CommonLoadingDialog");
                                                                                                                                                            if (zVarD != null) {
                                                                                                                                                                b5.a aVar6 = new b5.a(u0VarS);
                                                                                                                                                                aVar6.j(zVarD);
                                                                                                                                                                aVar6.g();
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return uVar;
                                                                                                                                                    case 2:
                                                                                                                                                        fh.a aVar7 = (fh.a) obj;
                                                                                                                                                        int i22 = AccountProActivity.H;
                                                                                                                                                        String str2 = aVar7.f24037a;
                                                                                                                                                        boolean z3 = aVar7.f24040d;
                                                                                                                                                        if (str2 == null || vk.i.H0(str2)) {
                                                                                                                                                            qg.a aVar8 = accountProActivity.D;
                                                                                                                                                            if (aVar8 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar8.f32321v.setVisibility(8);
                                                                                                                                                            qg.a aVar9 = accountProActivity.D;
                                                                                                                                                            if (aVar9 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar9.j.setVisibility(8);
                                                                                                                                                        } else {
                                                                                                                                                            qg.a aVar10 = accountProActivity.D;
                                                                                                                                                            if (aVar10 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            TextView textView16 = aVar10.f32321v;
                                                                                                                                                            textView16.setVisibility(0);
                                                                                                                                                            textView16.setText(aVar7.f24037a);
                                                                                                                                                            qg.a aVar11 = accountProActivity.D;
                                                                                                                                                            if (aVar11 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar11.j.setVisibility(0);
                                                                                                                                                            qg.a aVar12 = accountProActivity.D;
                                                                                                                                                            if (aVar12 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar12.f32306e.setVisibility(z3 ? 0 : 8);
                                                                                                                                                            qg.a aVar13 = accountProActivity.D;
                                                                                                                                                            if (aVar13 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar13.f32307f.setVisibility(aVar7.f24038b ? 0 : 8);
                                                                                                                                                            qg.a aVar14 = accountProActivity.D;
                                                                                                                                                            if (aVar14 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar14.g.setVisibility(aVar7.f24039c ? 0 : 8);
                                                                                                                                                            qg.a aVar15 = accountProActivity.D;
                                                                                                                                                            if (aVar15 == null) {
                                                                                                                                                                nk.k.k("binding");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            aVar15.f32308h.setVisibility(8);
                                                                                                                                                            if (z3) {
                                                                                                                                                                qg.a aVar16 = accountProActivity.D;
                                                                                                                                                                if (aVar16 == null) {
                                                                                                                                                                    nk.k.k("binding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                aVar16.f32306e.setOnClickListener(new ah.g(1, accountProActivity, aVar7));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        return uVar;
                                                                                                                                                    case 3:
                                                                                                                                                        int i23 = AccountProActivity.H;
                                                                                                                                                        if (((Boolean) obj).booleanValue()) {
                                                                                                                                                            t7.m mVar = new t7.m(accountProActivity);
                                                                                                                                                            mVar.y(R.string.bind_failed);
                                                                                                                                                            mVar.v(R.string.pro_account_no_needed_bind_hw_order);
                                                                                                                                                            mVar.x(R.string.confirm, null);
                                                                                                                                                            ((i.b) mVar.f34474c).f25240m = false;
                                                                                                                                                            mVar.A();
                                                                                                                                                        } else {
                                                                                                                                                            t7.m mVar2 = new t7.m(accountProActivity);
                                                                                                                                                            mVar2.y(R.string.bind_successful);
                                                                                                                                                            mVar2.v(R.string.bind_hw_order_successful_msg);
                                                                                                                                                            mVar2.x(R.string.confirm, null);
                                                                                                                                                            ((i.b) mVar2.f34474c).f25240m = false;
                                                                                                                                                            mVar2.A();
                                                                                                                                                        }
                                                                                                                                                        w wVarE = accountProActivity.E();
                                                                                                                                                        wVarE.getClass();
                                                                                                                                                        ah.o oVar = ah.o.f400d;
                                                                                                                                                        DeviceInfoApp deviceInfoApp = fi.a.f24058a;
                                                                                                                                                        oVar.t(deviceInfoApp, 1, new o7.d(6, wVarE));
                                                                                                                                                        oVar.t(deviceInfoApp, 0, new v(false));
                                                                                                                                                        return uVar;
                                                                                                                                                    default:
                                                                                                                                                        int i24 = AccountProActivity.H;
                                                                                                                                                        accountProActivity.G();
                                                                                                                                                        return uVar;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }, i4));
                                                                                                                                        E().getClass();
                                                                                                                                        if (getIntent().getBooleanExtra("doPurchase", false) && !E().f2255o) {
                                                                                                                                            E().f2255o = true;
                                                                                                                                            qg.a aVar5 = this.D;
                                                                                                                                            if (aVar5 == null) {
                                                                                                                                                k.k("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            aVar5.f32302a.post(new o0(i16, this));
                                                                                                                                        }
                                                                                                                                        qg.a aVar6 = this.D;
                                                                                                                                        if (aVar6 == null) {
                                                                                                                                            k.k("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        FrameLayout frameLayout2 = aVar6.f32302a;
                                                                                                                                        d dVar = new d(this);
                                                                                                                                        WeakHashMap weakHashMap = v0.f22405a;
                                                                                                                                        m0.j(frameLayout2, dVar);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.g(this.F);
        o.f400d.h(this.G);
    }

    @Override // hg.a, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        k.e(menuItem, "item");
        if (menuItem.getItemId() != 12) {
            return super.onOptionsItemSelected(menuItem);
        }
        m mVar = new m(this);
        b bVar = (b) mVar.f34474c;
        bVar.f25233d = "在线客服";
        bVar.f25235f = "您可以通过以下方式联系我们：\n\n1. 发送邮件(建议):\nsupport@liuzhosoft.com\n\n2. 加入客服QQ群: 763986292\n";
        final int i4 = 0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: bh.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountProActivity f2196b;

            {
                this.f2196b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11 = i4;
                AccountProActivity accountProActivity = this.f2196b;
                switch (i11) {
                    case 0:
                        int i12 = AccountProActivity.H;
                        com.liuzh.deviceinfo.utilities.d.c(accountProActivity);
                        break;
                    default:
                        int i13 = AccountProActivity.H;
                        boolean z3 = com.liuzh.deviceinfo.utilities.d.f21252a;
                        Intent intent = new Intent();
                        intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26jump_from%3Dwebapi%26k%3DnH7SIGEBHMqu333ooxIeU-VBQ6hiFWCa"));
                        try {
                            accountProActivity.startActivity(intent);
                            break;
                        } catch (Exception unused) {
                            nh.a.d(accountProActivity, "763986292");
                        }
                }
            }
        };
        bVar.g = "邮件";
        bVar.f25236h = onClickListener;
        final int i10 = 1;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: bh.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountProActivity f2196b;

            {
                this.f2196b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i102) {
                int i11 = i10;
                AccountProActivity accountProActivity = this.f2196b;
                switch (i11) {
                    case 0:
                        int i12 = AccountProActivity.H;
                        com.liuzh.deviceinfo.utilities.d.c(accountProActivity);
                        break;
                    default:
                        int i13 = AccountProActivity.H;
                        boolean z3 = com.liuzh.deviceinfo.utilities.d.f21252a;
                        Intent intent = new Intent();
                        intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26jump_from%3Dwebapi%26k%3DnH7SIGEBHMqu333ooxIeU-VBQ6hiFWCa"));
                        try {
                            accountProActivity.startActivity(intent);
                            break;
                        } catch (Exception unused) {
                            nh.a.d(accountProActivity, "763986292");
                        }
                }
            }
        };
        bVar.f25237i = "QQ群";
        bVar.j = onClickListener2;
        mVar.A();
        return true;
    }

    @Override // hg.a, i.g, android.app.Activity
    public final void onResume() {
        super.onResume();
        w wVarE = E();
        wVarE.getClass();
        o oVar = o.f400d;
        DeviceInfoApp deviceInfoApp = fi.a.f24058a;
        oVar.t(deviceInfoApp, 1, new o7.d(6, wVarE));
        oVar.t(deviceInfoApp, 0, new bh.v(false));
    }
}
