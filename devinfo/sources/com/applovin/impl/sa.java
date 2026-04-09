package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.e80;
import com.google.android.material.textfield.TextInputEditText;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.mode.User;
import com.liuzh.deviceinfo.pro.account.register.BindEmailActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class sa implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5323c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5325e;

    public /* synthetic */ sa(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f5321a = i4;
        this.f5322b = obj;
        this.f5323c = obj2;
        this.f5324d = obj3;
        this.f5325e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        int i4 = this.f5321a;
        Object obj = this.f5325e;
        Object obj2 = this.f5324d;
        Object obj3 = this.f5323c;
        Object obj4 = this.f5322b;
        switch (i4) {
            case 0:
                ((z1) obj4).a((com.applovin.impl.sdk.ad.b) obj3, (com.applovin.impl.sdk.k) obj2, (Activity) obj, view);
                break;
            case 1:
                e80 e80Var = (e80) obj4;
                String str = (String) obj2;
                User user = (User) obj;
                int i10 = BindEmailActivity.E;
                FrameLayout frameLayout = (FrameLayout) e80Var.f10729a;
                nk.k.d(frameLayout, "getRoot(...)");
                com.liuzh.deviceinfo.utilities.m.a(frameLayout);
                hh.i iVarD = ((BindEmailActivity) obj3).D();
                Editable text = ((TextInputEditText) e80Var.j).getText();
                String string6 = (text == null || (string5 = text.toString()) == null) ? null : vk.i.V0(string5).toString();
                Editable text2 = ((TextInputEditText) e80Var.f10734f).getText();
                String string7 = (text2 == null || (string4 = text2.toString()) == null) ? null : vk.i.V0(string4).toString();
                Editable text3 = ((TextInputEditText) e80Var.f10736i).getText();
                String string8 = (text3 == null || (string3 = text3.toString()) == null) ? null : vk.i.V0(string3).toString();
                Editable text4 = ((TextInputEditText) e80Var.g).getText();
                String string9 = (text4 == null || (string2 = text4.toString()) == null) ? null : vk.i.V0(string2).toString();
                Editable text5 = ((TextInputEditText) e80Var.f10735h).getText();
                String string10 = (text5 == null || (string = text5.toString()) == null) ? null : vk.i.V0(string).toString();
                wi.e eVar = iVarD.f25086b;
                if (user.getAccount().getEmail() != null) {
                    if (string6 != null && !vk.i.H0(string6)) {
                        if (string6.length() != 4) {
                            eVar.h(hg.e.e(R.string.ori_email_vcode_wrong));
                            break;
                        }
                    } else {
                        eVar.h(hg.e.e(R.string.please_input_ori_emai_vcode));
                        break;
                    }
                }
                if (string7 != null && !vk.i.H0(string7)) {
                    if (string8 != null && !vk.i.H0(string8)) {
                        if (user.getAccount().getEmail() == null) {
                            if (string9 != null && !vk.i.H0(string9)) {
                                if (string9.length() >= 6) {
                                    if (string9.length() <= 16) {
                                        if (!string9.equals(string10)) {
                                            eVar.h(hg.e.e(R.string.two_pwd_different));
                                            break;
                                        } else if (string8.length() != 4) {
                                            eVar.h(hg.e.e(R.string.new_email_vcode_wrong));
                                            break;
                                        }
                                    } else {
                                        eVar.h(hg.e.f(new Object[]{16}, R.string.pwd_require_max_len));
                                        break;
                                    }
                                } else {
                                    eVar.h(hg.e.f(new Object[]{6}, R.string.pwd_require_min_len));
                                    break;
                                }
                            } else {
                                eVar.h(hg.e.e(R.string.please_input_pwd));
                                break;
                            }
                        }
                        xk.x.v(androidx.lifecycle.y0.g(iVarD), null, null, new a0.g0(str, string6, string7, string8, string9, iVarD, (ck.c) null), 3);
                        break;
                    } else {
                        eVar.h(hg.e.e(R.string.please_input_new_email_vcode));
                        break;
                    }
                } else {
                    eVar.h(hg.e.e(R.string.please_input_new_email));
                    break;
                }
                break;
            default:
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                Drawable drawable = (Drawable) obj;
                sh.a0 a0Var = ((sh.z) obj4).f33796c;
                if (!a0Var.c0()) {
                    new AlertDialog.Builder(a0Var.W()).setIcon(drawable).setTitle(str2).setMessage(str3).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).show();
                    break;
                }
                break;
        }
    }
}
